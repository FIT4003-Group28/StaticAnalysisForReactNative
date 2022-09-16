package defpackage;
/* compiled from: PG */
/* renamed from: mws  reason: default package */
/* loaded from: classes7.dex */
final class mws implements mxl {
    final /* synthetic */ mwu a;

    public mws(mwu mwuVar) {
        this.a = mwuVar;
    }

    @Override // defpackage.mxl
    public final void a(int i) {
        ldm ldmVar;
        ldm ldmVar2 = this.a.a;
        if (i > 0) {
            dpjx dpjxVar = ldmVar2.r().get(i - 1).c;
            if (dpjxVar == null) {
                dpjxVar = dpjx.n;
            }
            amvg P = amvh.P();
            P.b = dpjxVar.b;
            dnoh dnohVar = dpjxVar.d;
            if (dnohVar == null) {
                dnohVar = dnoh.d;
            }
            P.d = akqq.e(dnohVar);
            P.c = akqi.f(dpjxVar.c);
            P.k = true;
            ldmVar = new ldm(P.a(), dpjxVar.b, null, null, null, null);
        } else {
            ldmVar = ldmVar2;
        }
        mwu mwuVar = this.a;
        mwuVar.b.k(mwuVar.d.c(ldmVar, null, null, kdk.NOTHING, mnz.PLACE_CARD_WAYPOINT_REFINEMENT, false, false, mwuVar.e, new cjsz(dtxm.cM), mwuVar.c, mwuVar.b));
    }
}
