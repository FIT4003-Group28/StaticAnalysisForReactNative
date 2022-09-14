package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: cnyb  reason: default package */
/* loaded from: classes.dex */
public final class cnyb {
    private static final cnyb b = new cnyb();
    private cnya a = null;

    public static cnya b(Context context) {
        return b.a(context);
    }

    public final synchronized cnya a(Context context) {
        if (this.a == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.a = new cnya(context);
        }
        return this.a;
    }
}
