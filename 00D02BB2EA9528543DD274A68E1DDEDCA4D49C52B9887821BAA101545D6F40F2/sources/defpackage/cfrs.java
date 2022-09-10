package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: cfrs  reason: default package */
/* loaded from: classes4.dex */
public final class cfrs implements aket {
    public transient aedv a;
    private final boolean b;

    public cfrs(boolean z) {
        this.b = z;
    }

    @Override // defpackage.akeo
    public final void a(gga ggaVar, btlu btluVar) {
        ((cfrr) btsq.b(cfrr.class, ggaVar)).xK(this);
        aedv aedvVar = this.a;
        dbsk.s(aedvVar);
        boolean z = this.b;
        cfqo cfqoVar = new cfqo();
        Bundle bundle = new Bundle();
        bundle.putBoolean("has_fragment_search_tag", z);
        cfqoVar.B(bundle);
        aedvVar.r(cfqoVar, dktk.CONTRIBUTE);
    }

    @Override // defpackage.akeo
    public final void b(gga ggaVar, btlu btluVar) {
    }
}
