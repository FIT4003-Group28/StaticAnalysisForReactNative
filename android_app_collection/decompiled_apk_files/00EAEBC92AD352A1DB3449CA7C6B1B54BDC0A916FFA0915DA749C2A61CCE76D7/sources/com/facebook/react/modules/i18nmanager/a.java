package com.facebook.react.modules.i18nmanager;

import a.g.l.f;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.Locale;
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static a f5678a;

    private a() {
    }

    public static a a() {
        if (f5678a == null) {
            f5678a = new a();
        }
        return f5678a;
    }

    private boolean a(Context context, String str, boolean z) {
        return context.getSharedPreferences("com.facebook.react.modules.i18nmanager.I18nUtil", 0).getBoolean(str, z);
    }

    private void b(Context context, String str, boolean z) {
        SharedPreferences.Editor edit = context.getSharedPreferences("com.facebook.react.modules.i18nmanager.I18nUtil", 0).edit();
        edit.putBoolean(str, z);
        edit.apply();
    }

    private boolean b() {
        return f.b(Locale.getDefault()) == 1;
    }

    private boolean c(Context context) {
        return a(context, "RCTI18nUtil_allowRTL", true);
    }

    private boolean d(Context context) {
        return a(context, "RCTI18nUtil_forceRTL", false);
    }

    public void a(Context context, boolean z) {
        b(context, "RCTI18nUtil_allowRTL", z);
    }

    public boolean a(Context context) {
        return a(context, "RCTI18nUtil_makeRTLFlipLeftAndRightStyles", true);
    }

    public void b(Context context, boolean z) {
        b(context, "RCTI18nUtil_forceRTL", z);
    }

    public boolean b(Context context) {
        if (d(context)) {
            return true;
        }
        return c(context) && b();
    }

    public void c(Context context, boolean z) {
        b(context, "RCTI18nUtil_makeRTLFlipLeftAndRightStyles", z);
    }
}
