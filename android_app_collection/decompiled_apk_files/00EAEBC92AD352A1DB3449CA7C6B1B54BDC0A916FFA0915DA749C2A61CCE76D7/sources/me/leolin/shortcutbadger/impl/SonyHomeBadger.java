package me.leolin.shortcutbadger.impl;

import android.content.AsyncQueryHandler;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Looper;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
public class SonyHomeBadger implements g.a.a.a {

    /* renamed from: a  reason: collision with root package name */
    private final Uri f10357a = Uri.parse("content://com.sonymobile.home.resourceprovider/badge");

    /* renamed from: b  reason: collision with root package name */
    private AsyncQueryHandler f10358b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends AsyncQueryHandler {
        a(SonyHomeBadger sonyHomeBadger, ContentResolver contentResolver) {
            super(contentResolver);
        }
    }

    private ContentValues a(int i, ComponentName componentName) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("badge_count", Integer.valueOf(i));
        contentValues.put("package_name", componentName.getPackageName());
        contentValues.put("activity_name", componentName.getClassName());
        return contentValues;
    }

    private void a(ContentValues contentValues) {
        this.f10358b.startInsert(0, null, this.f10357a, contentValues);
    }

    private void a(Context context, ContentValues contentValues) {
        context.getApplicationContext().getContentResolver().insert(this.f10357a, contentValues);
    }

    private static boolean a(Context context) {
        return context.getPackageManager().resolveContentProvider("com.sonymobile.home.resourceprovider", 0) != null;
    }

    private static void b(Context context, ComponentName componentName, int i) {
        Intent intent = new Intent("com.sonyericsson.home.action.UPDATE_BADGE");
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.PACKAGE_NAME", componentName.getPackageName());
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.ACTIVITY_NAME", componentName.getClassName());
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.MESSAGE", String.valueOf(i));
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.SHOW_MESSAGE", i > 0);
        context.sendBroadcast(intent);
    }

    private void c(Context context, ComponentName componentName, int i) {
        if (i < 0) {
            return;
        }
        ContentValues a2 = a(i, componentName);
        if (Looper.myLooper() != Looper.getMainLooper()) {
            a(context, a2);
            return;
        }
        if (this.f10358b == null) {
            this.f10358b = new a(this, context.getApplicationContext().getContentResolver());
        }
        a(a2);
    }

    @Override // g.a.a.a
    public List<String> a() {
        return Arrays.asList("com.sonyericsson.home", "com.sonymobile.home");
    }

    @Override // g.a.a.a
    public void a(Context context, ComponentName componentName, int i) {
        if (a(context)) {
            c(context, componentName, i);
        } else {
            b(context, componentName, i);
        }
    }
}
