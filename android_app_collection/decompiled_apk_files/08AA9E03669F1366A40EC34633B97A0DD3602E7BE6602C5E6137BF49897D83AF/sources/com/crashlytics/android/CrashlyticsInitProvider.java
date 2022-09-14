package com.crashlytics.android;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import b.a.a.a.a.b.o;
import b.a.a.a.c;
/* loaded from: classes.dex */
public class CrashlyticsInitProvider extends ContentProvider {
    private static final String TAG = "CrashlyticsInitProvider";

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface EnabledCheckStrategy {
        boolean isCrashlyticsEnabled(Context context);
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        Context context = getContext();
        if (shouldInitializeFabric(context, new o(), new ManifestEnabledCheckStrategy())) {
            try {
                c.a(context, new Crashlytics());
                c.h().c(TAG, "CrashlyticsInitProvider initialization successful");
            } catch (IllegalStateException unused) {
                c.h().c(TAG, "CrashlyticsInitProvider initialization unsuccessful");
                return false;
            }
        }
        return true;
    }

    boolean shouldInitializeFabric(Context context, o oVar, EnabledCheckStrategy enabledCheckStrategy) {
        return oVar.b(context) && enabledCheckStrategy.isCrashlyticsEnabled(context);
    }
}
