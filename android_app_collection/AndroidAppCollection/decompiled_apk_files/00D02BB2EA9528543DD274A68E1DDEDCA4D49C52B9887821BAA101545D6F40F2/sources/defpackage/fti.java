package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fti  reason: default package */
/* loaded from: classes6.dex */
public final class fti implements dxis {
    final /* synthetic */ ftt a;
    private volatile dzsj<bxpa> b;

    public fti(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        qes qesVar = (qes) obj;
        qesVar.c = this.a.tn();
        btrm rz = this.a.eW.a.rz();
        dxjg.e(rz);
        qesVar.d = rz;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        qesVar.e = tr;
        bvjj rB = this.a.eW.a.rB();
        dxjg.e(rB);
        qesVar.f = rB;
        cqat rR = this.a.eW.a.rR();
        dxjg.e(rR);
        qesVar.g = rR;
        qesVar.ad = this.a.eW.fa();
        qesVar.ae = dxjc.c(this.a.eW.k());
        qesVar.af = this.a.kj();
        qesVar.ag = new cqhu();
        dzsj<cqhn> il = this.a.eW.il();
        dzsj dzsjVar = this.b;
        if (dzsjVar == null) {
            dzsjVar = new fth(this);
            this.b = dzsjVar;
        }
        qesVar.ah = new qfl(il, dxjh.c(dzsjVar));
        qesVar.ai = this.a.kk();
        qesVar.aj = new cqhn();
        dehq tg = this.a.eW.a.tg();
        dxjg.e(tg);
        qesVar.ak = tg;
    }
}
