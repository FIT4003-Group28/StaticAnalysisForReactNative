package defpackage;
/* compiled from: PG */
/* renamed from: xlq  reason: default package */
/* loaded from: classes4.dex */
public final class xlq implements ajgw {
    final /* synthetic */ xmd a;
    final /* synthetic */ aufe b;
    final /* synthetic */ aufc c;
    final /* synthetic */ acti d;
    final /* synthetic */ xlt e;

    public xlq(xlt xltVar, xmd xmdVar, aufe aufeVar, aufc aufcVar, acti actiVar) {
        this.e = xltVar;
        this.a = xmdVar;
        this.b = aufeVar;
        this.c = aufcVar;
        this.d = actiVar;
    }

    @Override // defpackage.ajgw
    public final void a() {
        aqav aqavVar;
        aqax aqaxVar = this.a.a().c;
        if (aqaxVar == null) {
            aqaxVar = aqax.a;
        }
        if (aqaxVar.b == 62285947) {
            aqavVar = (aqav) aqaxVar.c;
        } else {
            aqavVar = aqav.a;
        }
        this.e.c.k(aqavVar.i, this.b.k, aqal.COMMENT_POLL_STATUS_VOTE_AND_COMMENT);
    }

    @Override // defpackage.ajgw
    public final void b() {
        this.e.a(this.a, this.b, this.c, aqal.COMMENT_POLL_STATUS_VOTE_AND_COMMENT, this.d);
    }

    @Override // defpackage.ajgw
    public final void c(boolean z) {
    }
}
