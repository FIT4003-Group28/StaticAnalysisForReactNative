package defpackage;
/* compiled from: PG */
/* renamed from: cayy  reason: default package */
/* loaded from: classes4.dex */
public final class cayy implements cbds {
    private final ckcw a;

    public cayy(ckcw ckcwVar) {
        this.a = ckcwVar;
    }

    @Override // defpackage.cbds
    public final dbsg<dijr> a(@dzsi cbcv cbcvVar, cbrr cbrrVar) {
        dpvi c;
        dpvi d;
        int i;
        dijl bZ = dijn.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dijn dijnVar = (dijn) bZ.b;
        dijnVar.c = 1;
        dijnVar.a |= 2;
        String a = cbrrVar.c().a();
        dbsk.s(a);
        bZ.a(cbcu.a(djjd.NAME, cbcu.h(a)));
        akqq b = cbrrVar.a().b();
        akqi c2 = cbrrVar.a().c();
        if (b != null) {
            dpum h = b.h();
            if (dbsd.a(c2, akqi.a)) {
                bZ.a(cbcu.a(djjd.LOCATION, cbcu.f(h)));
            } else {
                djjh bZ2 = djji.d.bZ();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                djji djjiVar = (djji) bZ2.b;
                h.getClass();
                djjiVar.b = h;
                djjiVar.a |= 1;
                String o = c2.o();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                djji djjiVar2 = (djji) bZ2.b;
                o.getClass();
                djjiVar2.a |= 2;
                djjiVar2.c = o;
                bZ.a(cbcu.a(djjd.LOCATION, cbcu.i(bZ2.bK())));
            }
        }
        cbqt f = cbrrVar.f();
        if (f == null || !f.h().booleanValue()) {
            c = cbrrVar.e().c();
            d = cbrrVar.e().d();
        } else {
            c = f.b();
            d = f.c();
            dpsd a2 = f.a();
            dbsk.s(a2);
            cbcu.m(a2, bZ);
        }
        if (c != null) {
            bZ.a(cbcu.a(djjd.START_DATETIME, cbcu.e(c)));
        }
        if (d != null) {
            cbcu.l(d, bZ);
        }
        dprz d2 = cbrrVar.b().d();
        if (d2 != null) {
            cbcu.j(d2, bZ);
            ckco ckcoVar = (ckco) this.a.a(ckez.a);
            if (d2 == dprz.EXPERIENCE_CATEGORY_UNKNOWN) {
                i = ckey.UNKNOWN_CATEGORY_SELECTED.d;
            } else {
                i = ckey.OTHER_CATEGORY_SELECTED.d;
            }
            ckcoVar.a(i);
        } else {
            ((ckco) this.a.a(ckez.a)).a(ckey.NO_CATEGORY_SELECTED.ordinal());
        }
        String n = cbrrVar.i().n();
        if (!dbsj.d(n)) {
            cbcu.n(n, bZ);
        }
        String a3 = cbrrVar.d().a();
        if (!dbsj.d(a3)) {
            cbcu.k(a3, bZ);
        }
        return dbsg.i(cbcu.o(2, bZ));
    }
}
