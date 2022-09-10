package defpackage;

import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: adxq  reason: default package */
/* loaded from: classes2.dex */
public class adxq extends aczs implements advq {
    private final gga c;
    private final absg d;
    private final adxf e;
    private final adxh f;
    private CharSequence g = "";
    private CharSequence h = "";
    private List<cqix<?>> i = dcdc.e();
    private advj j = null;
    String a = null;
    String b = null;

    public adxq(gga ggaVar, adxf adxfVar, adxh adxhVar, absg absgVar) {
        this.c = ggaVar;
        this.d = absgVar;
        this.e = adxfVar;
        this.f = adxhVar;
    }

    @Override // defpackage.advq
    public Boolean a() {
        boolean z = false;
        if (!this.i.isEmpty() && this.j != null) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.advq
    public CharSequence b() {
        return this.g;
    }

    @Override // defpackage.advq
    public CharSequence c() {
        return this.h;
    }

    @Override // defpackage.aczr
    public cjtd e() {
        cjta b = cjtd.b();
        b.g(this.a);
        b.d = this.d == absg.AREA_EXPLORE ? dtxj.df : dtxr.bB;
        return b.a();
    }

    @Override // defpackage.advq
    public List<cqix<?>> f() {
        return this.i;
    }

    @Override // defpackage.advq
    public cjtd g() {
        cjta b = cjtd.b();
        b.g(this.b);
        b.d = this.d == absg.AREA_EXPLORE ? dtxj.dd : dtxr.bx;
        return b.a();
    }

    @Override // defpackage.advq
    public cqkl h(cjqm cjqmVar) {
        advj advjVar = this.j;
        if (advjVar != null) {
            advjVar.c().f();
        }
        return cqkl.a;
    }

    @Override // defpackage.advq
    public cjtd j() {
        advj advjVar = this.j;
        if (advjVar != null) {
            return advjVar.c().e(this.d == absg.AREA_EXPLORE ? dtxj.dj : dtxr.bM);
        }
        return null;
    }

    public void k(dvhg dvhgVar) {
        dvhf next;
        dlby dlbyVar;
        dlby dlbyVar2;
        String string;
        if (dvhgVar != null) {
            Iterator<dvhf> it = dvhgVar.c.iterator();
            loop2: while (it.hasNext()) {
                next = it.next();
                for (dlcv dlcvVar : next.a) {
                    if (dlcu.a(dlcvVar.b) == 3) {
                        if (dlcvVar.b == 5) {
                            dlbyVar = (dlby) dlcvVar.c;
                        } else {
                            dlbyVar = dlby.h;
                        }
                        int a = dpyr.a(dlbyVar.d);
                        if (a != 0 && a == 4) {
                            break loop2;
                        }
                    }
                }
            }
        }
        next = null;
        if (next != null) {
            for (dlcv dlcvVar2 : next.a) {
                if (dlcu.a(dlcvVar2.b) == 3) {
                    if (dlcvVar2.b == 5) {
                        dlbyVar2 = (dlby) dlcvVar2.c;
                    } else {
                        dlbyVar2 = dlby.h;
                    }
                    if (!dlbyVar2.g.isEmpty() && !dlbyVar2.g.get(0).f.isEmpty()) {
                        dlbw dlbwVar = dlbyVar2.g.get(0);
                        gga ggaVar = this.c;
                        dlcs dlcsVar = dlbwVar.e;
                        if (dlcsVar == null) {
                            dlcsVar = dlcs.f;
                        }
                        if ((dlcsVar.a & 8) == 0 || dlcsVar.e.isEmpty()) {
                            string = ggaVar.getString(R.string.LOCALSTREAM_YOUR_EXPLORE_PLACES_FROM_THE_NEWS_MODULE_TITLE, new Object[]{dlcsVar.b});
                        } else {
                            string = ggaVar.getString(R.string.LOCALSTREAM_YOUR_EXPLORE_PLACES_FROM_THE_NEWS_MODULE_TITLE, new Object[]{dlcsVar.e});
                        }
                        this.g = string;
                        this.h = dlbwVar.b;
                        this.a = next.b;
                        this.b = dlbyVar2.c;
                        this.j = this.f.a(this.d, dlcvVar2.d, dlbwVar.f.get(0), dlbwVar, g());
                        dsrj<dlcx> dsrjVar = dlbwVar.f;
                        ArrayList arrayList = new ArrayList();
                        int i = 0;
                        for (dlcx dlcxVar : dsrjVar) {
                            adrx adrxVar = new adrx();
                            adxf adxfVar = this.e;
                            dvyw dvywVar = dlcxVar.c;
                            if (dvywVar == null) {
                                dvywVar = dvyw.bv;
                            }
                            cjta b = cjtd.b();
                            b.d = this.d == absg.AREA_EXPLORE ? dtxj.di : dtxr.bL;
                            b.g(dlcxVar.b);
                            b.i(i);
                            arrayList.add(cqgr.fT(adrxVar, adxfVar.a(dvywVar, b.a(), false)));
                            i++;
                            if (arrayList.size() >= 3) {
                                break;
                            }
                        }
                        this.i = arrayList;
                        cqkx.p(this);
                    }
                }
            }
        }
        this.g = "";
        this.h = "";
        this.j = null;
        this.i = dcdc.e();
        this.a = null;
        this.b = null;
        cqkx.p(this);
    }
}
