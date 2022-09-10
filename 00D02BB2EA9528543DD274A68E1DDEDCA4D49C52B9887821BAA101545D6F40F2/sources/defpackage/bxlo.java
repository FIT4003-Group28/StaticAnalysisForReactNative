package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bxlo  reason: default package */
/* loaded from: classes4.dex */
public final class bxlo implements btzi<dwjn, dwjp> {
    final /* synthetic */ bxlr a;

    public bxlo(bxlr bxlrVar) {
        this.a = bxlrVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dwjn> btzrVar, btzy btzyVar) {
        synchronized (this.a) {
            bxlr bxlrVar = this.a;
            if (!bxlrVar.k) {
                bxlrVar.k = true;
                this.a.n.a(btzyVar.p);
                bxlr bxlrVar2 = this.a;
                bxlrVar2.s.a(null, btzyVar.p, false, bxlrVar2.e(null, bxmg.OFFLINE_ONLY));
            }
        }
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dwjn> btzrVar, dwjp dwjpVar) {
        dwjp dwjpVar2 = dwjpVar;
        synchronized (this.a) {
            bxlr bxlrVar = this.a;
            if (bxlrVar.k) {
                return;
            }
            bxlrVar.k = true;
            if (!bxlr.g(dwjpVar2)) {
                this.a.n.c(btxy.OFFLINE, this.a.a.e() - this.a.j);
            } else {
                this.a.n.a(bttq.NO_CONNECTIVITY);
            }
            bxlr bxlrVar2 = this.a;
            bxlrVar2.s.a(dwjpVar2, null, false, bxlrVar2.e(dwjpVar2, bxmg.OFFLINE_ONLY));
        }
    }
}
