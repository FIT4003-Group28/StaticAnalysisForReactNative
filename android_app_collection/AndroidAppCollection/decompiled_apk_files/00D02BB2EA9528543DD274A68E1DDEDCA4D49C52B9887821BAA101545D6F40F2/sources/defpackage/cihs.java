package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* renamed from: cihs  reason: default package */
/* loaded from: classes4.dex */
public class cihs extends cibj implements cihr {
    private final List<chyv> a;
    private final List<cqix<? extends cqkp>> b;
    private final baad c;
    private final cidb d;
    private final chxl e;

    public cihs(cikf cikfVar, cigp cigpVar, axwi axwiVar, chrx chrxVar, chxl chxlVar) {
        super(chxlVar);
        chvw chvwVar;
        chvs chvsVar;
        dpsn dpsnVar;
        chvs chvsVar2;
        this.a = new ArrayList();
        this.b = new ArrayList();
        dpot dpotVar = chxlVar.e;
        this.c = axwiVar.c(dpotVar == null ? dpot.m : dpotVar);
        this.d = new cidb(chrxVar, chxlVar);
        this.e = chxlVar;
        for (chxk chxkVar : chxlVar.u) {
            chxj chxjVar = chxj.RATING;
            int ordinal = chxj.a(chxkVar.b).ordinal();
            if (ordinal == 7) {
                baad baadVar = this.c;
                if (chxkVar.b == 11) {
                    chvsVar = (chvs) chxkVar.c;
                } else {
                    chvsVar = chvs.f;
                }
                dppt dpptVar = chvsVar.b;
                dpptVar = dpptVar == null ? dppt.e : dpptVar;
                if (dpptVar.b == 2) {
                    dpsnVar = (dpsn) dpptVar.c;
                } else {
                    dpsnVar = dpsn.d;
                }
                baal d = baadVar.d(azxb.f(akqi.j(dpsnVar), null));
                if (d != null) {
                    if (chxkVar.b == 11) {
                        chvsVar2 = (chvs) chxkVar.c;
                    } else {
                        chvsVar2 = chvs.f;
                    }
                    chyy a = cikfVar.a.a();
                    cikf.a(a, 1);
                    cikf.a(cikfVar.b.a(), 2);
                    bnjv a2 = cikfVar.c.a();
                    cikf.a(a2, 3);
                    begg a3 = cikfVar.d.a();
                    cikf.a(a3, 4);
                    cikf.a(chrxVar, 5);
                    cikf.a(chxlVar, 6);
                    cikf.a(d, 7);
                    cike cikeVar = new cike(a, a2, a3, chrxVar, chxlVar, d, chvsVar2);
                    this.a.add(cikeVar);
                    this.b.add(cqgr.fT(new cijz(), cikeVar));
                }
            } else if (ordinal == 9) {
                if (chxkVar.b == 12) {
                    chvwVar = (chvw) chxkVar.c;
                } else {
                    chvwVar = chvw.d;
                }
                chvw chvwVar2 = chvwVar;
                gga a4 = cigpVar.a.a();
                cigp.a(a4, 1);
                axwi a5 = cigpVar.b.a();
                cigp.a(a5, 2);
                cigp.a(chrxVar, 3);
                cigp.a(chxlVar, 4);
                cigp.a(chvwVar2, 5);
                cigo cigoVar = new cigo(a4, a5, chrxVar, chxlVar, chvwVar2);
                this.a.add(cigoVar);
                this.b.add(cqgr.fT(new cigl(), cigoVar));
            }
        }
    }

    @Override // defpackage.chyv
    public chyu a() {
        return chyu.COMPOUND;
    }

    @Override // defpackage.chyv
    public boolean b() {
        return chys.b(this);
    }

    @Override // defpackage.chyv
    public chyw c() {
        return chyw.UPDATE_LIST_ITEMS;
    }

    @Override // defpackage.chyv
    public List<? extends chyv> d() {
        return this.a;
    }

    @Override // defpackage.cihr
    public Boolean e() {
        chxp chxpVar = this.e.i;
        if (chxpVar == null) {
            chxpVar = chxp.k;
        }
        return Boolean.valueOf(chxpVar.j);
    }

    public boolean equals(@dzsi Object obj) {
        if (obj instanceof cihs) {
            cihs cihsVar = (cihs) obj;
            return this.c.aa(cihsVar.c) && this.a.equals(cihsVar.a);
        }
        return false;
    }

    @Override // defpackage.cihr
    public jiw f() {
        return this.d;
    }

    @Override // defpackage.cihr
    public View.OnLayoutChangeListener g() {
        return this.d;
    }

    @Override // defpackage.cihr
    public List<cqix<?>> h() {
        return this.b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.c.l(), chxj.ADD_LIST_ITEM_NOTE, chxj.ADD_LIST_ITEMS, Integer.valueOf(this.a.size())});
    }
}
