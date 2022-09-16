package defpackage;

import com.google.android.apps.maps.R;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: adwo  reason: default package */
/* loaded from: classes2.dex */
public class adwo extends aczs implements advt {
    String a;
    private final hub b;
    private final abfa c;
    private final adxl d;
    private final bvpe e;
    private final absg f;
    private final String g;
    private iid h;

    public adwo(gga ggaVar, huc hucVar, abfa abfaVar, adxl adxlVar, bvpe bvpeVar, absg absgVar) {
        this.c = abfaVar;
        this.d = adxlVar;
        this.e = bvpeVar;
        this.f = absgVar;
        this.g = ggaVar.getString(R.string.LOCALSTREAM_YOUR_EXPLORE_MERCHANT_POSTS_MODULE_TITLE);
        iic j = iid.j();
        j.e(dcdc.e());
        this.h = j.f();
        this.b = hucVar.a(new htz(this) { // from class: adwn
            private final adwo a;

            {
                this.a = this;
            }

            @Override // defpackage.htz
            public final cjtd a() {
                return this.a.g();
            }

            @Override // defpackage.htz
            public final cjql b() {
                return null;
            }
        });
    }

    @Override // defpackage.advt
    public Boolean a() {
        return Boolean.valueOf(!this.h.a().isEmpty());
    }

    @Override // defpackage.advt
    public CharSequence b() {
        return this.g;
    }

    @Override // defpackage.advt
    public iib c() {
        return this.h;
    }

    @Override // defpackage.aczr
    public cjtd e() {
        cjta b = cjtd.b();
        b.g(this.a);
        b.d = this.f == absg.AREA_EXPLORE ? dtxj.df : dtxr.bB;
        return b.a();
    }

    public final cjtd g() {
        cjta b = cjtd.b();
        b.g(this.a);
        b.d = this.f == absg.AREA_EXPLORE ? dtxj.dg : dtxr.bD;
        return b.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void f(dvhg dvhgVar) {
        dvhf next;
        Iterator<dlcv> it;
        dlbe dlbeVar;
        adwo adwoVar = this;
        int i = 4;
        if (dvhgVar != null) {
            Iterator<dvhf> it2 = dvhgVar.c.iterator();
            loop1: while (it2.hasNext()) {
                next = it2.next();
                for (dlcv dlcvVar : next.a) {
                    if (dlcu.a(dlcvVar.b) == 4) {
                        break loop1;
                    }
                }
            }
        }
        next = null;
        dccx F = dcdc.F();
        int i2 = 0;
        int i3 = 1;
        if (next != null) {
            Iterator<dlcv> it3 = next.a.iterator();
            int i4 = 0;
            while (it3.hasNext()) {
                dlcv next2 = it3.next();
                if (dlcu.a(next2.b) == i) {
                    if (next2.b == 6) {
                        dlbeVar = (dlbe) next2.c;
                    } else {
                        dlbeVar = dlbe.g;
                    }
                    if (!dlbeVar.f.isEmpty()) {
                        dipk dipkVar = dlbeVar.f.get(i2);
                        String str = dlbeVar.c;
                        int i5 = dipkVar.a;
                        if ((i5 & 16) != 0 || (i5 & 8) != 0) {
                            adqy adqyVar = new adqy((adwoVar.c.a.getPassiveAssistParameters().a().M ? 1 : 0) ^ i3);
                            adxl adxlVar = adwoVar.d;
                            absg absgVar = adwoVar.f;
                            dspd dspdVar = next2.d;
                            dlcx dlcxVar = dlbeVar.d;
                            if (dlcxVar == null) {
                                dlcxVar = dlcx.e;
                            }
                            String str2 = dlbeVar.b;
                            cjta b = cjtd.b();
                            b.g(str2);
                            b.i(i4);
                            b.d = adwoVar.f == absg.AREA_EXPLORE ? dtxj.dd : dtxr.bx;
                            cjtd a = b.a();
                            abfa a2 = adxlVar.a.a();
                            adxl.a(a2, i3);
                            adxf a3 = adxlVar.b.a();
                            it = it3;
                            adxl.a(a3, 2);
                            dxio a4 = ((dxjh) adxlVar.c).a();
                            adxl.a(a4, 3);
                            ania a5 = adxlVar.d.a();
                            adxl.a(a5, 4);
                            adxl.a(adxlVar.e.a(), 5);
                            adxl.a(((dxjh) adxlVar.f).a(), 6);
                            adxl.a(absgVar, 7);
                            adxl.a(dspdVar, 8);
                            adxl.a(dlcxVar, 9);
                            adxl.a(dipkVar, 10);
                            adxl.a(str, 11);
                            adxl.a(a, 12);
                            F.g(cqgr.fT(adqyVar, new adxk(a2, a3, a4, a5, absgVar, dlcxVar, dipkVar, a)));
                            i4++;
                            it3 = it;
                            i = 4;
                            i2 = 0;
                            i3 = 1;
                            adwoVar = this;
                        }
                    }
                }
                it = it3;
                it3 = it;
                i = 4;
                i2 = 0;
                i3 = 1;
                adwoVar = this;
            }
        }
        dcdc f = F.f();
        if (next != null && !f.isEmpty()) {
            this.a = next.b;
            iic j = iid.j();
            j.e(f);
            ifj ifjVar = (ifj) j;
            ifjVar.f = g();
            ifjVar.e = new bvob(this.e.b, this.b);
            this.h = j.f();
        } else {
            this.a = null;
            iic j2 = iid.j();
            j2.e(dcdc.e());
            this.h = j2.f();
        }
        cqkx.p(this);
    }
}
