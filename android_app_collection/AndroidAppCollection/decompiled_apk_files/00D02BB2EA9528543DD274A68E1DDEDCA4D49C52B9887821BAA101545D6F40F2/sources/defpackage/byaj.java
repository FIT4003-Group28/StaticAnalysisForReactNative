package defpackage;
/* compiled from: PG */
/* renamed from: byaj  reason: default package */
/* loaded from: classes4.dex */
final class byaj implements btzi {
    final /* synthetic */ deig a;

    public byaj(deig deigVar) {
        this.a = deigVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr btzrVar, btzy btzyVar) {
        Throwable th = btzyVar.r;
        bttq bttqVar = btzyVar.p;
        if (bttqVar == bttq.REQUEST_TIMEOUT || bttqVar == bttq.NO_CONNECTIVITY || bttqVar == bttq.IO_ERROR) {
            th = new byak(btzyVar.p);
        }
        if (th == null) {
            th = new byal(btzyVar.p);
        }
        this.a.k(th);
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr btzrVar, Object obj) {
        this.a.j((dssj) obj);
    }
}
