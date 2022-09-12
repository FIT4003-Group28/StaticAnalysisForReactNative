package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cdjp  reason: default package */
/* loaded from: classes4.dex */
public abstract class cdjp implements dbrn<bqjh, cdpd> {
    public abstract void b(bqjh bqjhVar, cdpc cdpcVar);

    public abstract void c(bqjh bqjhVar, cdpc cdpcVar);

    public abstract void d(bqjh bqjhVar, cdpc cdpcVar);

    public abstract void e(bqjh bqjhVar, cdpc cdpcVar);

    public abstract void f(bqjh bqjhVar, cdpc cdpcVar);

    public abstract void g(bqjh bqjhVar, cdpc cdpcVar);

    @Override // defpackage.dbrn
    /* renamed from: h */
    public final cdpd a(bqjh bqjhVar) {
        cdpc bZ = cdpd.l.bZ();
        b(bqjhVar, bZ);
        c(bqjhVar, bZ);
        d(bqjhVar, bZ);
        if (bqjhVar.p().a() && bqjhVar.p().a()) {
            dlif b = bqjhVar.p().b();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            cdpd cdpdVar = (cdpd) bZ.b;
            b.getClass();
            cdpdVar.e = b;
            cdpdVar.a |= 8;
        }
        e(bqjhVar, bZ);
        f(bqjhVar, bZ);
        g(bqjhVar, bZ);
        dhpj i = bqjhVar.i();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        cdpd cdpdVar2 = (cdpd) bZ.b;
        cdpdVar2.i = i.d;
        cdpdVar2.a |= 64;
        if (bqjhVar.k().a() && bqjhVar.k().a()) {
            cdph NV = cdnv.c.NV(bqjhVar.k().b());
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            cdpd cdpdVar3 = (cdpd) bZ.b;
            NV.getClass();
            cdpdVar3.j = NV;
            cdpdVar3.a |= 128;
        }
        if (bqjhVar.o().a() && bqjhVar.o().a()) {
            ddhv b2 = bqjhVar.o().b();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            cdpd cdpdVar4 = (cdpd) bZ.b;
            cdpdVar4.k = b2.d;
            cdpdVar4.a |= 256;
        }
        return bZ.bK();
    }
}
