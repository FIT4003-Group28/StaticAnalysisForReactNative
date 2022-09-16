package defpackage;

import android.content.res.Resources;
import android.graphics.Picture;
import com.google.android.apps.maps.R;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: dpw  reason: default package */
/* loaded from: classes6.dex */
public final class dpw implements aa<dyf> {
    private static final dcep<dye> g = dcep.C(dye.UP, dye.DOWN);
    public final dbsg<cjqp> a;
    public final dgt b;
    public final dkj c;
    public final Set<dfeq<dfhp>> d;
    @dzsi
    public dfer e;
    @dzsi
    public dpu f;
    private final Resources h;
    private final czz i;
    private final czw j;
    private final btvo k;
    @dzsi
    private dpv l;
    @dzsi
    private Picture m;
    @dzsi
    private String n;
    @dzsi
    private dxr o;
    private boolean p;

    public dpw(Resources resources, dbsg<czw> dbsgVar, btvo btvoVar, dgu dguVar, dkj dkjVar, czz czzVar, dbsg<cjqp> dbsgVar2) {
        this.h = resources;
        this.i = czzVar;
        this.a = dbsgVar2;
        this.k = btvoVar;
        dfw f = dfy.f();
        f.e(dfx.PRIMARY_POI);
        dfy a = f.a();
        cqat a2 = dguVar.a.a();
        dgu.a(a2, 1);
        dgc a3 = dguVar.b.a();
        dgu.a(a3, 2);
        dgu.a(czzVar, 3);
        dgu.a(dbsgVar2, 4);
        dgu.a(a, 5);
        this.b = new dgt(a2, a3, czzVar, dbsgVar2, a);
        this.c = dkjVar;
        this.d = new HashSet();
        dbsk.a(dbsgVar.a());
        this.j = dbsgVar.b();
    }

    public static void i(dfhd dfhdVar, akqq akqqVar) {
        dfgn bZ = dfgo.d.bZ();
        double d = akqqVar.a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dfgo dfgoVar = (dfgo) bZ.b;
        int i = dfgoVar.a | 1;
        dfgoVar.a = i;
        dfgoVar.b = d;
        double d2 = akqqVar.b;
        dfgoVar.a = i | 2;
        dfgoVar.c = d2;
        dfgo bK = bZ.bK();
        if (dfhdVar.c) {
            dfhdVar.bF();
            dfhdVar.c = false;
        }
        dfhg dfhgVar = (dfhg) dfhdVar.b;
        dfhg dfhgVar2 = dfhg.f;
        bK.getClass();
        dfhgVar.b = bK;
        dfhgVar.a |= 1;
    }

    public static dfhh j(dfhg dfhgVar) {
        dfhh bZ = dfhj.d.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dfhj dfhjVar = (dfhj) bZ.b;
        dfhgVar.getClass();
        dfhjVar.b = dfhgVar;
        dfhjVar.a |= 1;
        dfhj dfhjVar2 = (dfhj) bZ.b;
        dfhjVar2.c = 0;
        dfhjVar2.a |= 8;
        return bZ;
    }

    private final void k() {
        Picture picture;
        dfer dferVar = this.e;
        if (dferVar == null || (picture = this.m) == null) {
            return;
        }
        dferVar.g(picture);
    }

    private final void l(boolean z, @dzsi String str, @dzsi String str2) {
        if (z) {
            if (dbsj.d(str2)) {
                return;
            }
            this.b.b(this.h.getString(R.string.LIGHTHOUSE_OFFSCREEN_INDICATOR_GO_TO, str2), false);
        } else if (dbsj.d(str)) {
        } else {
            this.b.b(str, true);
        }
    }

    public final void a(ilo iloVar) {
        if (iloVar.aj() == null) {
            return;
        }
        dxr dxrVar = this.o;
        dfhd bZ = dfhg.f.bZ();
        akqq aj = iloVar.aj();
        dbsk.s(aj);
        i(bZ, aj);
        dte dteVar = this.j.a().b;
        if (dteVar == null) {
            dteVar = dte.w;
        }
        dknv dknvVar = this.k.getAugmentedRealityParameters().a;
        if (dknvVar == null) {
            dknvVar = dknv.v;
        }
        if ((dteVar.a & 512) != 0 ? dteVar.k : dknvVar.c) {
            akqi ai = iloVar.ai();
            if (akqi.d(ai)) {
                dgrh h = ai.h();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dfhg dfhgVar = (dfhg) bZ.b;
                h.getClass();
                dfhgVar.c = h;
                dfhgVar.a |= 2;
            }
            dpmf dpmfVar = iloVar.h().bq;
            if (dpmfVar == null) {
                dpmfVar = dpmf.b;
            }
            if (!dpmfVar.a.isEmpty()) {
                dpmd dpmdVar = dpmfVar.a.get(0);
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dfhg dfhgVar2 = (dfhg) bZ.b;
                dpmdVar.getClass();
                dfhgVar2.d = dpmdVar;
                dfhgVar2.a |= 4;
            }
        }
        if (dxrVar != null) {
            dfhe bZ2 = dfhf.e.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dfhf dfhfVar = (dfhf) bZ2.b;
            int i = dfhfVar.a | 1;
            dfhfVar.a = i;
            dfhfVar.b = Double.NEGATIVE_INFINITY;
            dfhfVar.a = i | 2;
            dfhfVar.c = Double.MAX_VALUE;
            dsza k = dxrVar.k();
            if (k != null && (k.a & 4) != 0) {
                double d = k.d;
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dfhf dfhfVar2 = (dfhf) bZ2.b;
                dfhfVar2.a |= 4;
                dfhfVar2.d = d;
                double i2 = dxrVar.i();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dfhf dfhfVar3 = (dfhf) bZ2.b;
                dfhfVar3.a |= 1;
                dfhfVar3.b = i2;
                double j = dxrVar.j();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dfhf dfhfVar4 = (dfhf) bZ2.b;
                dfhfVar4.a |= 2;
                dfhfVar4.c = j;
            }
            dfhf bK = bZ2.bK();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dfhg dfhgVar3 = (dfhg) bZ.b;
            bK.getClass();
            dfhgVar3.e = bK;
            dfhgVar3.a |= 8;
        }
        dfhg bK2 = bZ.bK();
        akqi ai2 = iloVar.ai();
        String q = iloVar.q();
        this.n = q;
        dxr dxrVar2 = this.o;
        if (dxrVar2 != null) {
            l(this.p, q, dxrVar2.g());
        }
        if (this.e != null) {
            d(bK2, ai2);
        } else {
            b(j(bK2).bK(), ai2);
        }
    }

    public final void b(dfhj dfhjVar, @dzsi akqi akqiVar) {
        if (this.e != null) {
            e();
        }
        dfer e = this.i.m().e(dfhjVar);
        e.c(this.b);
        dpv dpvVar = new dpv(this);
        dpvVar.b(akqiVar);
        e.a(dpvVar);
        this.l = dpvVar;
        this.e = e;
        k();
    }

    public final void d(dfhg dfhgVar, @dzsi akqi akqiVar) {
        dfer dferVar = this.e;
        if (dferVar == null) {
            return;
        }
        dfhr bZ = dfhs.c.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dfhs dfhsVar = (dfhs) bZ.b;
        dfhgVar.getClass();
        dfhsVar.b = dfhgVar;
        dfhsVar.a = 1;
        dfhs bK = bZ.bK();
        dfhq bZ2 = dfhx.b.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dfhx dfhxVar = (dfhx) bZ2.b;
        bK.getClass();
        dsrj<dfhs> dsrjVar = dfhxVar.a;
        if (!dsrjVar.a()) {
            dfhxVar.a = dsqw.cl(dsrjVar);
        }
        dfhxVar.a.add(bK);
        dferVar.e(bZ2.bK());
        dpv dpvVar = this.l;
        if (dpvVar == null) {
            return;
        }
        dpvVar.b(akqiVar);
    }

    public final void e() {
        dfer dferVar = this.e;
        if (dferVar == null) {
            return;
        }
        dferVar.d(this.b);
        dpv dpvVar = this.l;
        if (dpvVar != null) {
            dferVar.b(dpvVar);
            this.l = null;
        }
        dferVar.h();
        this.e = null;
    }

    public final void g(dfeq<dfhp> dfeqVar) {
        this.d.add(dfeqVar);
    }

    public final void h(dfeq<dfhp> dfeqVar) {
        this.d.remove(dfeqVar);
    }

    @Override // defpackage.aa
    public final /* bridge */ /* synthetic */ void m(@dzsi dyf dyfVar) {
        dyf dyfVar2 = dyfVar;
        if (dyfVar2 == null) {
            return;
        }
        this.p = g.contains(dyfVar2.c());
        dxr b = dyfVar2.b();
        this.o = b;
        l(this.p, this.n, b.g());
    }

    public final void f(@dzsi Picture picture) {
        this.m = picture == null ? null : new Picture(picture);
        k();
    }
}
