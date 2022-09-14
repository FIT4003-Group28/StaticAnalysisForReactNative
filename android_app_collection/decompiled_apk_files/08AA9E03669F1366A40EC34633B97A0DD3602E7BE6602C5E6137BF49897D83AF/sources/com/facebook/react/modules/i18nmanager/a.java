package com.facebook.react.modules.i18nmanager;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v4.h.d;
import java.util.Locale;
/* compiled from: I18nUtil.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static a f3572a;

    private a() {
    }

    public static a a() {
        if (f3572a == null) {
            f3572a = new a();
        }
        return f3572a;
    }

    public boolean a(Context context) {
        if (d(context)) {
            return true;
        }
        return c(context) && b();
    }

    private boolean c(Context context) {
        return a(context, "RCTI18nUtil_allowRTL", true);
    }

    public void a(Context context, boolean z) {
        b(context, "RCTI18nUtil_allowRTL", z);
    }

    public boolean b(Context context) {
        return a(context, "RCTI18nUtil_makeRTLFlipLeftAndRightStyles", true);
    }

    public void b(Context context, boolean z) {
        b(context, "RCTI18nUtil_makeRTLFlipLeftAndRightStyles", z);
    }

    private boolean d(Context context) {
        return a(context, "RCTI18nUtil_forceRTL", false);
    }

    public void c(Context context, boolean z) {
        b(context, "RCTI18nUtil_forceRTL", z);
    }

    private boolean b() {
        return d.a(Locale.getDefault()) == 1;
    }

    private boolean a(Context context, String str, boolean z) {
        return context.getSharedPreferences("com.facebook.react.modules.i18nmanager.I18nUtil", 0).getBoolean(str, z);
    }

    private void b(Context context, String str, boolean z) {
        SharedPreferences.Editor edit = context.getSharedPreferences("com.facebook.react.modules.i18nmanager.I18nUtil", 0).edit();
        edit.putBoolean(str, z);
        edit.apply();
    }
}
