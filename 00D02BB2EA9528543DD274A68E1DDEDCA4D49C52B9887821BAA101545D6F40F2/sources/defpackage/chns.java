package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: chns  reason: default package */
/* loaded from: classes4.dex */
public final class chns {
    public final crzo<chtu> a;
    public final crzo<chtr> b;
    public final Executor c;
    public final btlu d;
    public final Resources e;
    public final chny f;
    public final chry g;
    public dpvt h;
    public dbsg<dpoj> o;
    public final boolean p;
    public final buva q;
    private final btvo r;
    public dbsg<Integer> m = dbpy.a;
    public boolean n = false;
    public dbsg<dpvw> j = dbpy.a;
    public String i = "";
    public int l = 0;
    public dbsg<dqkh> k = dbpy.a;

    public chns(buva buvaVar, chnz chnzVar, chrz chrzVar, btvo btvoVar, Resources resources, Executor executor, btlu btluVar, boolean z) {
        this.d = btluVar;
        this.q = buvaVar;
        this.c = executor;
        this.r = btvoVar;
        this.e = resources;
        crzo<chtu> crzoVar = new crzo<>(chtu.e);
        this.a = crzoVar;
        this.b = new crzo<>(chtr.b(dcmn.a));
        this.h = dpvt.c;
        crzn<chtu> crznVar = crzoVar.a;
        bvrb a = chnzVar.a.a();
        chnz.a(a, 1);
        Activity activity = (Activity) ((dxjd) chnzVar.b).a;
        chnz.a(activity, 2);
        cpv a2 = chnzVar.c.a();
        chnz.a(a2, 3);
        Executor a3 = chnzVar.d.a();
        chnz.a(a3, 4);
        chnz.a(crznVar, 5);
        this.f = new chny(a, activity, a2, a3, crznVar);
        dedz dedzVar = new dedz();
        btvo a4 = chrzVar.a.a();
        chrz.a(a4, 1);
        bvjj a5 = chrzVar.b.a();
        chrz.a(a5, 2);
        Activity activity2 = (Activity) ((dxjd) chrzVar.c).a;
        chrz.a(activity2, 3);
        cpv a6 = chrzVar.d.a();
        chrz.a(a6, 4);
        dxio a7 = ((dxjh) chrzVar.e).a();
        chrz.a(a7, 5);
        chrz.a(dedzVar, 6);
        this.g = new chry(a4, a5, activity2, a6, a7);
        this.o = dbpy.a;
        this.p = z;
    }

    private final void i() {
        this.f.b(this.e.getString(R.string.AWARD_NEW_DAILY_POINTS_RECORD_MONTH), this.i);
        this.o = dbsg.i(chnr.a());
    }

    public final chuc a() {
        chub bZ = chuc.f.bZ();
        int i = this.l;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        chuc chucVar = (chuc) bZ.b;
        chucVar.a |= 1;
        chucVar.b = i;
        dpoj a = chnr.a();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        chuc chucVar2 = (chuc) bZ.b;
        a.getClass();
        chucVar2.c = a;
        chucVar2.a |= 2;
        String str = (String) dbsg.j(this.d.j()).c("");
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        chuc chucVar3 = (chuc) bZ.b;
        str.getClass();
        chucVar3.a |= 4;
        chucVar3.d = str;
        if (this.o.a()) {
            dpoj b = this.o.b();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            chuc chucVar4 = (chuc) bZ.b;
            b.getClass();
            chucVar4.e = b;
            chucVar4.a |= 8;
        }
        return bZ.bK();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        this.l += f().c(dpwe.RATING);
        g();
        h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(int i) {
        this.l += f().c(dpwe.PHOTO) * i;
        g();
        h();
    }

    public final int d(baad baadVar) {
        int c = baadVar.k() >= 4 ? f().c(dpwe.PUBLISHED_LIST) : 0;
        int i = !baadVar.G().isEmpty();
        dcdc<baal> i2 = baadVar.i();
        int size = i2.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (!i2.get(i3).c().isEmpty()) {
                i++;
            }
        }
        return c + (i * f().c(dpwe.PUBLISHED_LIST_BONUS));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final crzm<chtr> e() {
        return this.b.a;
    }

    public final chtr f() {
        chtr l = this.b.a.l();
        return l == null ? chtr.b(dcmn.a) : l;
    }

    public final void g() {
        dhpt dhptVar = this.r.getContributionsPageParameters().h;
        if (dhptVar == null) {
            dhptVar = dhpt.w;
        }
        if (!dhptVar.d && (!this.o.a() || !this.o.b().equals(chnr.a()))) {
            if (!this.j.a()) {
                i();
            } else {
                dpvw b = this.j.b();
                dpoj a = chnr.a();
                dpoj dpojVar = b.c;
                if (dpojVar == null) {
                    dpojVar = dpoj.e;
                }
                if (!a.equals(dpojVar) && a.b == dpojVar.b && a.c == dpojVar.c && this.l > b.b) {
                    i();
                }
            }
        }
        if (!this.n) {
            return;
        }
        this.q.b(dwtm.l, new chnq(this), this.c);
    }

    public final void h() {
        chtt bZ = chtu.e.bZ();
        int i = this.l;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        chtu chtuVar = (chtu) bZ.b;
        chtuVar.a |= 1;
        chtuVar.b = i;
        if (this.j.a()) {
            dhpt dhptVar = this.r.getContributionsPageParameters().h;
            if (dhptVar == null) {
                dhptVar = dhpt.w;
            }
            if (!dhptVar.d) {
                dpvw b = this.j.b();
                if (b.b < this.l) {
                    dpvv bZ2 = dpvw.d.bZ();
                    dpoj a = chnr.a();
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    dpvw dpvwVar = (dpvw) bZ2.b;
                    a.getClass();
                    dpvwVar.c = a;
                    int i2 = dpvwVar.a | 2;
                    dpvwVar.a = i2;
                    int i3 = this.l;
                    dpvwVar.a = i2 | 1;
                    dpvwVar.b = i3;
                    b = bZ2.bK();
                }
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                chtu chtuVar2 = (chtu) bZ.b;
                b.getClass();
                chtuVar2.c = b;
                chtuVar2.a |= 2;
            }
        }
        if (this.k.a()) {
            dqkh b2 = this.k.b();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            chtu chtuVar3 = (chtu) bZ.b;
            b2.getClass();
            chtuVar3.d = b2;
            chtuVar3.a |= 4;
        }
        this.a.b(bZ.bK());
    }
}
