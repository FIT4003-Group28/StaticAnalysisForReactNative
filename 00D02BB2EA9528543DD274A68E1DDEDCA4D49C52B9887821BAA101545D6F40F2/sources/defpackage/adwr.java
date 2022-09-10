package defpackage;

import com.google.android.apps.maps.R;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: adwr  reason: default package */
/* loaded from: classes2.dex */
public class adwr extends aczs implements advt {
    public final cjta a;
    String b;
    private final absg c;
    private final adxh d;
    private final adpy e;
    private final iic f;
    private final String g;
    private final cjta h;
    private final cjta i;
    private iid j;

    public adwr(gga ggaVar, huc hucVar, adxh adxhVar, bvpe bvpeVar, absg absgVar) {
        this.c = absgVar;
        this.d = adxhVar;
        this.e = new adpy(absgVar);
        this.g = ggaVar.getString(R.string.LOCALSTREAM_YOUR_EXPLORE_NEWLY_OPENED_PLACES_MODULE_TITLE);
        cjta b = cjtd.b();
        b.d = absgVar == absg.AREA_EXPLORE ? dtxj.df : dtxr.bB;
        this.h = b;
        cjta b2 = cjtd.b();
        b2.d = absgVar == absg.AREA_EXPLORE ? dtxj.dg : dtxr.bD;
        this.a = b2;
        cjta b3 = cjtd.b();
        b3.d = absgVar == absg.AREA_EXPLORE ? dtxj.dd : dtxr.bx;
        this.i = b3;
        iic j = iid.j();
        j.e(dcdc.e());
        ((ifj) j).e = new bvob(bvpeVar.b, hucVar.a(new htz(this) { // from class: adwq
            private final adwr a;

            {
                this.a = this;
            }

            @Override // defpackage.htz
            public final cjtd a() {
                adwr adwrVar = this.a;
                cjta cjtaVar = adwrVar.a;
                cjtaVar.g(adwrVar.b);
                return cjtaVar.a();
            }

            @Override // defpackage.htz
            public final cjql b() {
                return null;
            }
        }));
        this.f = j;
        this.j = j.f();
    }

    @Override // defpackage.advt
    public Boolean a() {
        return Boolean.valueOf(!this.j.a().isEmpty());
    }

    @Override // defpackage.advt
    public CharSequence b() {
        return this.g;
    }

    @Override // defpackage.advt
    public iib c() {
        return this.j;
    }

    @Override // defpackage.aczr
    public cjtd e() {
        cjta cjtaVar = this.h;
        cjtaVar.g(this.b);
        return cjtaVar.a();
    }

    public void f(dvhg dvhgVar) {
        dvhf next;
        dlby dlbyVar;
        dlby dlbyVar2;
        int i = 5;
        if (dvhgVar != null) {
            Iterator<dvhf> it = dvhgVar.c.iterator();
            loop1: while (it.hasNext()) {
                next = it.next();
                for (dlcv dlcvVar : next.a) {
                    if (dlcu.a(dlcvVar.b) == 3) {
                        if (dlcvVar.b == 5) {
                            dlbyVar = (dlby) dlcvVar.c;
                        } else {
                            dlbyVar = dlby.h;
                        }
                        int a = dpyr.a(dlbyVar.d);
                        if (a != 0 && a == 2) {
                            break loop1;
                        }
                    }
                }
            }
        }
        next = null;
        dccx F = dcdc.F();
        if (next != null) {
            int i2 = 0;
            for (dlcv dlcvVar2 : next.a) {
                if (dlcu.a(dlcvVar2.b) == 3) {
                    if (dlcvVar2.b == i) {
                        dlbyVar2 = (dlby) dlcvVar2.c;
                    } else {
                        dlbyVar2 = dlby.h;
                    }
                    if (!dlbyVar2.g.isEmpty() && !dlbyVar2.g.get(0).f.isEmpty()) {
                        dlbw dlbwVar = dlbyVar2.g.get(0);
                        adpy adpyVar = this.e;
                        String str = dlbyVar2.c;
                        cjta cjtaVar = this.i;
                        cjtaVar.g(str);
                        cjtaVar.i(i2);
                        F.g(cqgr.fT(adpyVar, this.d.a(this.c, dlcvVar2.d, dlbwVar.f.get(0), dlbwVar, cjtaVar.a())));
                        i2++;
                    }
                }
                i = 5;
            }
        }
        dcdc f = F.f();
        List<cqix<? extends igw>> a2 = this.j.a();
        if (next != null && !f.isEmpty() && !a2.equals(f)) {
            this.b = next.b;
            iic iicVar = this.f;
            iicVar.e(f);
            cjta cjtaVar2 = this.a;
            cjtaVar2.g(this.b);
            ((ifj) iicVar).f = cjtaVar2.a();
            this.j = iicVar.f();
        } else {
            this.b = null;
            iic iicVar2 = this.f;
            iicVar2.e(dcdc.e());
            this.j = iicVar2.f();
        }
        cqkx.p(this);
    }
}
