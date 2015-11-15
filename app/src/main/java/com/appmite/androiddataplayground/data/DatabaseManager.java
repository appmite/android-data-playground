package com.appmite.androiddataplayground.data;

import android.content.Context;

import com.j256.ormlite.android.apptools.OpenHelperManager;
import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;

public class DatabaseManager<H extends OrmLiteSqliteOpenHelper> {
	
	private H helper;
	
	@SuppressWarnings({ "unchecked" })
	public H getHelper(Context context, Class<DatabaseHelper> openHelperClass)
	{
		if(helper == null)
		{
			helper = (H) OpenHelperManager.getHelper(context, openHelperClass);
		}
		return helper;
	}
	
	public void releaseHelper(H helper)
	{
		if (helper != null) {
			OpenHelperManager.releaseHelper();
			helper = null;
		}
	}
	
}
