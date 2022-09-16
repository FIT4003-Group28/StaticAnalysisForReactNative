package defpackage;

import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: alsf  reason: default package */
/* loaded from: classes.dex */
public final class alsf {
    public static final alrz a = new alrz("PrewarmService");
    private static final Intent d = new Intent("com.google.android.play.core.prewarm.BIND_PREWARM_SERVICE").setPackage("com.android.vending");
    public final alsy b;
    public final String c;

    public alsf(Context context) {
        if (alvk.a(context)) {
            this.b = new alsy(context.getApplicationContext(), a, "PrewarmService", d, alsd.a);
        } else {
            this.b = null;
        }
        this.c = context.getPackageName();
    }
}
