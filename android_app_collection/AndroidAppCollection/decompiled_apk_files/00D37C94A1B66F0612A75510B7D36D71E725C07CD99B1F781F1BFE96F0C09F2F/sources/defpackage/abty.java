package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: abty  reason: default package */
/* loaded from: classes.dex */
public final class abty {
    private static abty a;
    private boolean b = false;

    private abty() {
    }

    public static abty a() {
        if (a == null) {
            a = new abty();
        }
        return a;
    }

    public final void b() {
        this.b = true;
    }

    public final abtx c(acty actyVar, boolean z, Context context, snc sncVar, yqw yqwVar, abzc abzcVar, abss abssVar, abtw abtwVar) {
        if (!this.b || actyVar == null) {
            return new abus(z, context, sncVar, abssVar, abtwVar);
        }
        return new acqm(context, yqwVar, abzcVar, abssVar, new absg(), abtwVar);
    }
}
