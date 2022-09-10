package defpackage;
/* compiled from: PG */
/* renamed from: bgem  reason: default package */
/* loaded from: classes3.dex */
public class bgem extends bgoi implements bega {
    public final gga a;
    public final bwqv b;
    public final dxio<begg> c;
    @dzsi
    public bwrs<ilo> d;

    public bgem(gga ggaVar, bwqv bwqvVar, dxio<begg> dxioVar, cjqy cjqyVar, bgoq bgoqVar, bgoe bgoeVar, cjqq cjqqVar) {
        super(bgoeVar, cjqyVar, bgoqVar, cjqqVar);
        this.b = bwqvVar;
        this.a = ggaVar;
        this.c = dxioVar;
    }

    @Override // defpackage.bega
    public void t(bwrs<ilo> bwrsVar) {
        this.d = bwrsVar;
        ilo c = bwrsVar.c();
        if (c == null || c.cE() || c.aO()) {
            return;
        }
        dipo dipoVar = c.h().bb;
        if (dipoVar == null) {
            dipoVar = dipo.e;
        }
        int a = dgcg.a(dipoVar.d);
        if (a == 0 || a != 4) {
            return;
        }
        super.f(dipoVar, new bgel(this), c);
    }

    @Override // defpackage.bega
    public void u() {
        this.d = null;
        super.g();
    }
}
