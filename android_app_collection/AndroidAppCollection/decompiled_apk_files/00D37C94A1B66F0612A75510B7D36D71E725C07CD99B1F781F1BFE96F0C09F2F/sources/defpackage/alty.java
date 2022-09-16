package defpackage;

import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: alty  reason: default package */
/* loaded from: classes.dex */
public final class alty {
    public static final alrz a = new alrz("SplitInstallService");
    private static final Intent d = new Intent("com.google.android.play.core.splitinstall.BIND_SPLIT_INSTALL_SERVICE").setPackage("com.android.vending");
    public final String b;
    public alsy c;

    public alty(Context context) {
        this.b = context.getPackageName();
        if (alvk.a(context)) {
            this.c = new alsy(akpq.m(context), a, "SplitInstallService", d, alsd.d);
        }
    }
}
