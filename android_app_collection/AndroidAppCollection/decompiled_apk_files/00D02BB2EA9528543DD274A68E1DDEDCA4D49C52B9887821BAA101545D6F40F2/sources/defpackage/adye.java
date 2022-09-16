package defpackage;

import com.google.android.apps.maps.R;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: adye  reason: default package */
/* loaded from: classes2.dex */
public class adye extends aczs implements advt {
    String a;
    private final hub b;
    private final absg c;
    private final adxp d;
    private final bvpe e;
    private final String f;
    private iid g;

    public adye(gga ggaVar, huc hucVar, adxp adxpVar, bvpe bvpeVar, absg absgVar) {
        this.c = absgVar;
        this.d = adxpVar;
        this.e = bvpeVar;
        this.f = ggaVar.getString(R.string.LOCALSTREAM_YOUR_EXPLORE_UGC_REVIEWS_MODULE_TITLE);
        iic j = iid.j();
        j.e(dcdc.e());
        this.g = j.f();
        this.b = hucVar.a(new htz(this) { // from class: adyd
            private final adye a;

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
        dldt dldtVar;
        int i = 16;
        if (dvhgVar != null) {
            Iterator<dvhf> it = dvhgVar.c.iterator();
            loop1: while (it.hasNext()) {
                next = it.next();
                for (dlcv dlcvVar : next.a) {
                    if (dlcu.a(dlcvVar.b) == 16) {
                        break loop1;
                    }
                }
            }
        }
        next = null;
        dccx F = dcdc.F();
        int i2 = 1;
        int i3 = 0;
        if (next != null) {
            int i4 = 0;
            for (dlcv dlcvVar2 : next.a) {
                if (dlcu.a(dlcvVar2.b) == i) {
                    if (dlcvVar2.b == 22) {
                        dldtVar = (dldt) dlcvVar2.c;
                    } else {
                        dldtVar = dldt.e;
                    }
                    if (dldtVar.d.size() != 0) {
                        adrk adrkVar = new adrk();
                        adxp adxpVar = this.d;
                        absg absgVar = this.c;
                        dspd dspdVar = dlcvVar2.d;
                        dlcx dlcxVar = dldtVar.c;
                        if (dlcxVar == null) {
                            dlcxVar = dlcx.e;
                        }
                        dlds dldsVar = dldtVar.d.get(i3);
                        String str = dldtVar.a;
                        cjta b = cjtd.b();
                        b.g(str);
                        b.i(i4);
                        b.d = this.c == absg.AREA_EXPLORE ? dtxj.dd : dtxr.bx;
                        cjtd a = b.a();
                        adxp.a(adxpVar.a.a(), i2);
                        adxf a2 = adxpVar.b.a();
                        adxp.a(a2, 2);
                        bkpi a3 = adxpVar.c.a();
                        adxp.a(a3, 3);
                        adxp.a(absgVar, 4);
                        adxp.a(dspdVar, 5);
                        adxp.a(dlcxVar, 6);
                        adxp.a(dldsVar, 7);
                        adxp.a(a, 9);
                        F.g(cqgr.fT(adrkVar, new adxo(a2, a3, absgVar, dlcxVar, dldsVar, str, a)));
                        i4++;
                    }
                }
                i = 16;
                i2 = 1;
                i3 = 0;
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
