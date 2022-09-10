package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: bett  reason: default package */
/* loaded from: classes3.dex */
public final class bett implements bvwz {
    public static final dwao a;
    public final dxio<qbt> b;

    static {
        dwal bZ = dwao.R.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwao.c((dwao) bZ.b);
        dphm bZ2 = dphq.m.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dphq dphqVar = (dphq) bZ2.b;
        dphqVar.c = 2;
        dphqVar.a = 2 | dphqVar.a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwao dwaoVar = (dwao) bZ.b;
        dphq bK = bZ2.bK();
        bK.getClass();
        dwaoVar.e = bK;
        dwaoVar.a |= 1;
        a = bZ.bK();
    }

    public bett(dxio<qbt> dxioVar) {
        this.b = dxioVar;
    }

    @Override // defpackage.bvwz
    public final dbrn<Map<String, Object>, Map<String, Object>> a() {
        return new dbrn(this) { // from class: bets
            private final bett a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                bett bettVar = this.a;
                Map map = (Map) obj;
                String str = (String) map.get("fi");
                String str2 = (String) map.get("pn");
                if (dbsj.d(str2) || dbsj.d(str)) {
                    return bvwy.a;
                }
                qcw x = qcx.x();
                ily ilyVar = new ily();
                ilyVar.k(str);
                ilyVar.F(str2);
                x.u(ilyVar.d().d());
                x.w(bett.a);
                bettVar.b.a().m(x.a());
                return bvwy.a;
            }
        };
    }

    @Override // defpackage.bvwz
    @dzsi
    public final dehn<Map<String, Object>> b(Object obj) {
        return null;
    }

    @Override // defpackage.bvwz
    public final String c() {
        return "ld.nav";
    }
}
