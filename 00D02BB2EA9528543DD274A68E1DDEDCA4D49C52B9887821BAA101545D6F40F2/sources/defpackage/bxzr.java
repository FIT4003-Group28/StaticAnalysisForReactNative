package defpackage;
/* compiled from: PG */
/* renamed from: bxzr  reason: default package */
/* loaded from: classes4.dex */
public final class bxzr {
    private final bxyy a;
    private final bxzb b;
    private final bxyi c;

    public bxzr(bxyy bxyyVar, bxzb bxzbVar, bxyi bxyiVar) {
        this.a = bxyyVar;
        this.b = bxzbVar;
        this.c = bxyiVar;
    }

    public final dbsg<bxxq> a(bxyn bxynVar) {
        int a = dptd.a(bxynVar.b().b);
        int i = a - 1;
        if (a != 0) {
            if (i == 0) {
                bxyy bxyyVar = this.a;
                bxyy.a(bxynVar, 1);
                dxio a2 = ((dxjh) bxyyVar.a).a();
                bxyy.a(a2, 2);
                dxio a3 = ((dxjh) bxyyVar.b).a();
                bxyy.a(a3, 3);
                btvo a4 = bxyyVar.c.a();
                bxyy.a(a4, 4);
                dxio a5 = ((dxjh) bxyyVar.d).a();
                bxyy.a(a5, 5);
                bxyp a6 = bxyyVar.e.a();
                bxyy.a(a6, 6);
                cklq a7 = bxyyVar.f.a();
                bxyy.a(a7, 7);
                return dbsg.i(new bxyx(bxynVar, a2, a3, a4, a5, a6, a7));
            } else if (i != 1) {
                if (i != 2) {
                    return dbpy.a;
                }
                bxyi bxyiVar = this.c;
                bxyi.a(bxynVar, 1);
                dxio a8 = ((dxjh) bxyiVar.a).a();
                bxyi.a(a8, 2);
                bxyp a9 = bxyiVar.b.a();
                bxyi.a(a9, 3);
                return dbsg.i(new bxyh(bxynVar, a8, a9));
            } else {
                bxzb bxzbVar = this.b;
                bxzb.a(bxynVar, 1);
                dxio a10 = ((dxjh) bxzbVar.a).a();
                bxzb.a(a10, 2);
                bxyp a11 = bxzbVar.b.a();
                bxzb.a(a11, 3);
                ckmp a12 = bxzbVar.c.a();
                bxzb.a(a12, 4);
                cklq a13 = bxzbVar.d.a();
                bxzb.a(a13, 5);
                btvo a14 = bxzbVar.e.a();
                bxzb.a(a14, 6);
                return dbsg.i(new bxza(bxynVar, a10, a11, a12, a13, a14));
            }
        }
        throw null;
    }
}
