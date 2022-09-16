package defpackage;
/* compiled from: PG */
@Deprecated
/* renamed from: vyd  reason: default package */
/* loaded from: classes7.dex */
public class vyd {
    public static final dvwc a;
    private static final dvzd c;
    public final vtn b;
    private final bupx d;
    private final vly e;

    static {
        dvwb bZ = dvwc.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dvwc dvwcVar = (dvwc) bZ.b;
        dvwcVar.a |= 1;
        dvwcVar.b = 0;
        a = bZ.bK();
        dvyz bZ2 = dvzd.o.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dvzd dvzdVar = (dvzd) bZ2.b;
        dvzdVar.a |= 2;
        dvzdVar.c = true;
        dvzd dvzdVar2 = (dvzd) bZ2.b;
        dvzdVar2.b = 1;
        dvzdVar2.a |= 1;
        c = bZ2.bK();
    }

    public vyd(bupx bupxVar, vtn vtnVar, vly vlyVar) {
        this.d = bupxVar;
        this.b = vtnVar;
        this.e = vlyVar;
    }

    public final synchronized dehn<dvwm> a(dhjx dhjxVar, @dzsi akqq akqqVar) {
        deig d;
        dwcv bZ = dwcw.p.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwcw dwcwVar = (dwcw) bZ.b;
        dhjxVar.getClass();
        dwcwVar.c = dhjxVar;
        dwcwVar.a |= 2;
        dvzd dvzdVar = c;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwcw dwcwVar2 = (dwcw) bZ.b;
        dvzdVar.getClass();
        dwcwVar2.f = dvzdVar;
        dwcwVar2.a |= 8;
        dvxj dvxjVar = dvxj.SVG_LIGHT;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwcw dwcwVar3 = (dwcw) bZ.b;
        dvxjVar.getClass();
        dsrf dsrfVar = dwcwVar3.e;
        if (!dsrfVar.a()) {
            dwcwVar3.e = dsqw.cg(dsrfVar);
        }
        dwcwVar3.e.h(dvxjVar.u);
        dhjz i = akqqVar.i();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwcw dwcwVar4 = (dwcw) bZ.b;
        i.getClass();
        dwcwVar4.b = i;
        dwcwVar4.a |= 1;
        d = deig.d();
        this.e.a(((bupy) this.d).b()).a(bZ.bK(), new vyc(this, d), bvrj.UI_THREAD);
        return d;
    }
}
