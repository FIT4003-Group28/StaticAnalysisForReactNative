package me.leolin.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
public class e implements g.a.a.a {

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f10361b = {"_id", "class"};

    /* renamed from: a  reason: collision with root package name */
    private DefaultBadger f10362a;

    public e() {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f10362a = new DefaultBadger();
        }
    }

    private ContentValues a(ComponentName componentName, int i, boolean z) {
        ContentValues contentValues = new ContentValues();
        if (z) {
            contentValues.put("package", componentName.getPackageName());
            contentValues.put("class", componentName.getClassName());
        }
        contentValues.put("badgecount", Integer.valueOf(i));
        return contentValues;
    }

    @Override // g.a.a.a
    public List<String> a() {
        return Arrays.asList("com.sec.android.app.launcher", "com.sec.android.app.twlauncher");
    }

    @Override // g.a.a.a
    public void a(Context context, ComponentName componentName, int i) {
        DefaultBadger defaultBadger = this.f10362a;
        if (defaultBadger != null && defaultBadger.a(context)) {
            this.f10362a.a(context, componentName, i);
            return;
        }
        Uri parse = Uri.parse("content://com.sec.badge/apps?notify=true");
        ContentResolver contentResolver = context.getContentResolver();
        Cursor cursor = null;
        try {
            cursor = contentResolver.query(parse, f10361b, "package=?", new String[]{componentName.getPackageName()}, null);
            if (cursor != null) {
                String className = componentName.getClassName();
                boolean z = false;
                while (cursor.moveToNext()) {
                    contentResolver.update(parse, a(componentName, i, false), "_id=?", new String[]{String.valueOf(cursor.getInt(0))});
                    if (className.equals(cursor.getString(cursor.getColumnIndex("class")))) {
                        z = true;
                    }
                }
                if (!z) {
                    contentResolver.insert(parse, a(componentName, i, true));
                }
            }
        } finally {
            g.a.a.d.b.a(cursor);
        }
    }
}
