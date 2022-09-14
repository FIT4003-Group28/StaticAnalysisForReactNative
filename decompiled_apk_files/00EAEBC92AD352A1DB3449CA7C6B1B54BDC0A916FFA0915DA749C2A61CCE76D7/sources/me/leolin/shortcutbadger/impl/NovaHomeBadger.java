package me.leolin.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
public class NovaHomeBadger implements g.a.a.a {
    @Override // g.a.a.a
    public List<String> a() {
        return Arrays.asList("com.teslacoilsw.launcher");
    }

    @Override // g.a.a.a
    public void a(Context context, ComponentName componentName, int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("tag", componentName.getPackageName() + "/" + componentName.getClassName());
        contentValues.put("count", Integer.valueOf(i));
        context.getContentResolver().insert(Uri.parse("content://com.teslacoilsw.notifier/unread_count"), contentValues);
    }
}
