package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ljp  reason: default package */
/* loaded from: classes7.dex */
public final class ljp implements lmm {
    final /* synthetic */ dcdc a;
    final /* synthetic */ lju b;

    public ljp(lju ljuVar, dcdc dcdcVar) {
        this.b = ljuVar;
        this.a = dcdcVar;
    }

    @Override // defpackage.lmm
    public final void a() {
        this.b.m.a();
    }

    @Override // defpackage.lmm
    public final void b(int i) {
        lju ljuVar = this.b;
        dcdc dcdcVar = this.a;
        boolean z = false;
        dbsk.l(i >= 0);
        if (i < dcdcVar.size()) {
            z = true;
        }
        dbsk.l(z);
        ljt ljtVar = ljuVar.f;
        ldm ldmVar = (ldm) dcdcVar.get(i);
        int size = dcdcVar.size();
        not notVar = ljuVar.q;
        nog nogVar = ljuVar.p;
        atmi atmiVar = ljuVar.n.a;
        jvg jvgVar = (jvg) ljtVar;
        jvh jvhVar = jvgVar.e;
        lma lmaVar = jvhVar.al;
        cqkj cqkjVar = jvhVar.v;
        noo nooVar = jvhVar.y;
        jur jurVar = jvgVar.a;
        kdg kdgVar = jvhVar.u;
        ksh kshVar = jvhVar.L;
        akox akoxVar = jvhVar.A;
        kxu kxuVar = jvhVar.C;
        ksi ksiVar = jvhVar.G;
        asmp asmpVar = jurVar.b;
        lxf lxfVar = jvgVar.c;
        ncm a = jvhVar.M.a();
        boolean z2 = jvgVar.e.Z;
        lma.a(cqkjVar, 1);
        lmf a2 = lmaVar.a.a();
        lma.a(a2, 2);
        lma.a(nooVar, 3);
        lma.a(jurVar, 4);
        lma.a(nogVar, 5);
        lma.a(kdgVar, 6);
        lma.a(ldmVar, 7);
        cqat a3 = lmaVar.b.a();
        lma.a(a3, 10);
        btrm a4 = lmaVar.c.a();
        lma.a(a4, 11);
        lma.a(kshVar, 12);
        cjqy a5 = lmaVar.d.a();
        lma.a(a5, 13);
        cjqq a6 = lmaVar.e.a();
        lma.a(a6, 14);
        lma.a(akoxVar, 15);
        lma.a(kxuVar, 16);
        lma.a(ksiVar, 17);
        lma.a(notVar, 18);
        lma.a(asmpVar, 19);
        lma.a(lxfVar, 20);
        lma.a(a, 21);
        lma.a(atmiVar, 23);
        ljuVar.p.k(new llz(cqkjVar, a2, nooVar, jurVar, nogVar, kdgVar, ldmVar, i, size, a3, a4, kshVar, a5, a6, notVar, asmpVar, lxfVar, a, z2, atmiVar));
        ljuVar.l();
        ljuVar.D = lut.a;
    }

    @Override // defpackage.lmm
    public final void c() {
        this.b.g.m();
    }
}
