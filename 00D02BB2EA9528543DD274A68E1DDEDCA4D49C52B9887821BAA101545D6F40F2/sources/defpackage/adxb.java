package defpackage;

import com.google.android.apps.maps.R;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: adxb  reason: default package */
/* loaded from: classes2.dex */
public class adxb extends aczs implements advt {
    String a;
    private final hub b;
    private final absg c;
    private final adxh d;
    private final bvpe e;
    private final String f;
    private iid g;

    public adxb(gga ggaVar, huc hucVar, adxh adxhVar, bvpe bvpeVar, absg absgVar) {
        this.e = bvpeVar;
        this.c = absgVar;
        this.d = adxhVar;
        this.f = ggaVar.getString(R.string.LOCALSTREAM_YOUR_EXPLORE_PLACE_IN_THE_NEWS_SET_MODULE_TITLE);
        iic j = iid.j();
        j.e(dcdc.e());
        this.g = j.f();
        this.b = hucVar.a(new htz(this) { // from class: adxa
            private final adxb a;

            {
                this.a = this;
            }

            @Override // defpackage.htz
            public final cjtd a() {
                return this.a.f();
            }

            @Override // defpackage.htz
            public final cjql b() {
                return null;
            }
        });
    }

    @Override // defpackage.advt
    public Boolean a() {
        return Boolean.valueOf(!this.g.a().isEmpty());
    }

    @Override // defpackage.advt
    public CharSequence b() {
        return this.f;
    }

    @Override // defpackage.advt
    public iib c() {
        return this.g;
    }

    @Override // defpackage.aczr
    public cjtd e() {
        cjta b = cjtd.b();
        b.g(this.a);
        b.d = this.c == absg.AREA_EXPLORE ? dtxj.df : dtxr.bB;
        return b.a();
    }

    public final cjtd f() {
        cjta b = cjtd.b();
        b.g(this.a);
        b.d = this.c == absg.AREA_EXPLORE ? dtxj.dg : dtxr.bD;
        return b.a();
    }

    public void g(dvhg dvhgVar) {
        dvhf next;
        dlby dlbyVar;
        dlby dlbyVar2;
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
                        if (a != 0 && a == 3) {
                            break loop1;
                        }
                    }
                }
            }
        }
        next = null;
        dccx F = dcdc.F();
        if (next != null) {
            int i = 0;
            for (dlcv dlcvVar2 : next.a) {
                if (dlcu.a(dlcvVar2.b) == 3) {
                    if (dlcvVar2.b == 5) {
                        dlbyVar2 = (dlby) dlcvVar2.c;
                    } else {
                        dlbyVar2 = dlby.h;
                    }
                    if (!dlbyVar2.g.isEmpty() && (dlbyVar2.a & 16) != 0) {
                        adpy adpyVar = new adpy(this.c);
                        adxh adxhVar = this.d;
                        absg absgVar = this.c;
                        dspd dspdVar = dlcvVar2.d;
                        dlcx dlcxVar = dlbyVar2.f;
                        if (dlcxVar == null) {
                            dlcxVar = dlcx.e;
                        }
                        dlcx dlcxVar2 = dlcxVar;
                        dlbw dlbwVar = dlbyVar2.g.get(0);
                        String str = dlbyVar2.c;
                        cjta b = cjtd.b();
                        b.g(str);
                        b.i(i);
                        b.d = this.c == absg.AREA_EXPLORE ? dtxj.dd : dtxr.bx;
                        F.g(cqgr.fT(adpyVar, adxhVar.a(absgVar, dspdVar, dlcxVar2, dlbwVar, b.a())));
                        i++;
                    }
                }
            }
        }
        dcdc f = F.f();
        if (next != null && !f.isEmpty()) {
            this.a = next.b;
            iic j = iid.j();
            j.e(f);
            ifj ifjVar = (ifj) j;
            ifjVar.f = f();
            ifjVar.e = new bvob(this.e.b, this.b);
            this.g = j.f();
        } else {
            this.a = null;
            iic j2 = iid.j();
            j2.e(dcdc.e());
            this.g = j2.f();
        }
        cqkx.p(this);
    }
}
