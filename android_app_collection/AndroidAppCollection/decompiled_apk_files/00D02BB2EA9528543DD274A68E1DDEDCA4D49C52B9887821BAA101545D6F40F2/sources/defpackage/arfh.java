package defpackage;
/* compiled from: PG */
/* renamed from: arfh  reason: default package */
/* loaded from: classes2.dex */
public final class arfh<T> extends btrh<T> {
    private final int d;

    public arfh(int i, Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        int i = this.d;
        if (i == 0) {
            arfg arfgVar = (arfg) this.a;
            gds gdsVar = (gds) obj;
            if (arfgVar.E()) {
                btlu btluVar = arfgVar.c.a;
                btlu btluVar2 = gdsVar.a;
                if (btluVar != null && !btlu.g(btluVar, btluVar2)) {
                    arfgVar.c.h();
                    arfgVar.j();
                }
            }
            arfgVar.e();
        } else if (i == 1) {
            arfg arfgVar2 = (arfg) this.a;
            arfgVar2.t();
            alaq alaqVar = ((alho) obj).a;
            if (!(alaqVar instanceof alat)) {
                return;
            }
            arfgVar2.F((alat) alaqVar);
        } else if (i != 2) {
            akvi akviVar = (akvi) ((alil) obj).a(akvi.class);
            dbsk.s(akviVar);
            ((arfg) this.a).a.a().M(akviVar.b);
        } else {
            arfg arfgVar3 = (arfg) this.a;
            alic alicVar = (alic) obj;
            arfgVar3.t();
            akuy akuyVar = (akuy) alicVar.a(akuy.class);
            dbsk.s(akuyVar);
            arfgVar3.F(new alas(alicVar.a, akuyVar.b, akuyVar.c, akuyVar.d));
        }
    }
}
