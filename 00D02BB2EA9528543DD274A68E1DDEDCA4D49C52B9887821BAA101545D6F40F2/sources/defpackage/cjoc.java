package defpackage;
/* compiled from: PG */
/* renamed from: cjoc  reason: default package */
/* loaded from: classes4.dex */
final class cjoc implements cjqv {
    final /* synthetic */ cjoo a;

    public cjoc(cjoo cjooVar) {
        this.a = cjooVar;
    }

    @Override // defpackage.cjqv
    public final void a(cjtd cjtdVar) {
        String str;
        if (cjtdVar.h == dvnp.LOCAL_STREAM && (str = cjtdVar.e) != null) {
            this.a.as.p(cjtdVar.h, str, null);
        }
        if (!dbsd.a(cjtdVar.g, dtxu.bs) || cjtdVar.g() != 2) {
            return;
        }
        cjql Q = this.a.aR.Q();
        if (Q == null) {
            bvoo.f(new IllegalStateException());
        } else {
            this.a.as.n(Q, new cjte(deaf.SWIPE, dead.UP), this.a.aR.k());
        }
    }
}
