package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: cmp  reason: default package */
/* loaded from: classes5.dex */
public final class cmp {
    public final Context a;
    public final Context b;

    public cmp(Context context) {
        this.a = context;
        this.b = cmxl.c(context);
    }

    public static int a(Context context) {
        return ((Integer) context.getClassLoader().loadClass("com.google.android.apps.auto.sdk.SdkVersion").getDeclaredMethod("getVersion", new Class[0]).invoke(null, new Object[0])).intValue();
    }
}
