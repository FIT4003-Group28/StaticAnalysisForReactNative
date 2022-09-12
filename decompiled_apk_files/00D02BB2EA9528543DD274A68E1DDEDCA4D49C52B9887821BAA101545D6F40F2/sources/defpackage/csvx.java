package defpackage;

import android.content.Context;
/* renamed from: csvx  reason: default package */
/* loaded from: classes5.dex */
public final /* synthetic */ class csvx {
    public static String a(Context context) {
        String valueOf = String.valueOf(context.getPackageName());
        return valueOf.length() != 0 ? "com.google.lighter.android#".concat(valueOf) : new String("com.google.lighter.android#");
    }
}
