package defpackage;

import android.app.Application;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aojs  reason: default package */
/* loaded from: classes2.dex */
public class aojs implements aojr {
    private final ges a;
    private final bbut b;
    private final dvan c;
    private final Application d;
    private final boolean e;
    private final aogw f;
    private final gga g;

    public aojs(dvan dvanVar, fd fdVar, bbut bbutVar, Application application, boolean z, aogw aogwVar, gga ggaVar) {
        this.a = (ges) fdVar;
        this.b = bbutVar;
        this.c = dvanVar;
        this.d = application;
        dqfz dqfzVar = dvanVar.c;
        dbsk.a(!(dqfzVar == null ? dqfz.g : dqfzVar).b.isEmpty());
        this.e = z;
        this.f = aogwVar;
        this.g = ggaVar;
    }

    private final boolean j() {
        dqfz dqfzVar = this.c.c;
        if (dqfzVar == null) {
            dqfzVar = dqfz.g;
        }
        int a = dqgb.a(dqfzVar.e);
        return a != 0 && a == 2;
    }

    private final String k() {
        dqfz dqfzVar = this.c.c;
        if (dqfzVar == null) {
            dqfzVar = dqfz.g;
        }
        dqgf dqgfVar = dqfzVar.c;
        if (dqgfVar == null) {
            dqgfVar = dqgf.b;
        }
        return dqgfVar.a;
    }

    @Override // defpackage.aojr
    public cqkl a() {
        if (this.e) {
            aogw aogwVar = this.f;
            dqfz dqfzVar = this.c.c;
            if (dqfzVar == null) {
                dqfzVar = dqfz.g;
            }
            this.g.D(aoln.g(aogwVar.d(dqfzVar.b).toString()));
        } else {
            dbsk.l(1 == (this.c.a & 1));
            bbut bbutVar = this.b;
            dwfl dwflVar = this.c.b;
            if (dwflVar == null) {
                dwflVar = dwfl.w;
            }
            ckne ckneVar = new ckne(dcdc.f(dwflVar));
            bbtv v = bbty.v();
            v.e(true);
            v.l(true);
            bbutVar.q(ckneVar, 0, v.a(), this.a, cqrt.n(R.plurals.MAPS_ACTIVITY_RECEIPTS_PHOTO_GALLERY_TITLE, 1).a(this.d).toString());
        }
        return cqkl.a;
    }

    @Override // defpackage.aojr
    @dzsi
    public cqsn b() {
        String k = k();
        if (k.isEmpty()) {
            return null;
        }
        return cqsk.a(k);
    }

    @Override // defpackage.aojr
    public CharSequence c() {
        return cqrt.l(R.string.MAPS_ACTIVITY_RECEIPT_CONTENT_DESCRIPTION).a(this.d);
    }

    @Override // defpackage.aojr
    public cqtd d() {
        if (j()) {
            return cqrt.g(2131231782, ibm.l());
        }
        dqfz dqfzVar = this.c.c;
        if (dqfzVar == null) {
            dqfzVar = dqfz.g;
        }
        if (dqfzVar.f) {
            return cqrt.g(2131231782, ibm.G());
        }
        return cqrt.f(2131231782);
    }

    @Override // defpackage.aojr
    public cjtd e() {
        if (j()) {
            return cjtd.a(dtxv.S);
        }
        if (k().isEmpty()) {
            return cjtd.a(dtxv.R);
        }
        return cjtd.a(dtxv.T);
    }

    @Override // defpackage.aojr
    public cjtd f() {
        return cjtd.a(dtyi.bI);
    }

    @Override // defpackage.aojr
    public cqss g() {
        dqfz dqfzVar = this.c.c;
        if (dqfzVar == null) {
            dqfzVar = dqfz.g;
        }
        if (dqfzVar.f) {
            return ibm.G();
        }
        return hyw.H();
    }

    @Override // defpackage.aojr
    public cqsn h() {
        return cqrt.l(R.string.MAPS_ACTIVITY_VIEW_RECEIPT);
    }

    @Override // defpackage.aojr
    @dzsi
    public cqsn i() {
        dqfz dqfzVar = this.c.c;
        if (dqfzVar == null) {
            dqfzVar = dqfz.g;
        }
        if ((dqfzVar.a & 8) != 0) {
            Application application = this.d;
            dqfz dqfzVar2 = this.c.c;
            if (dqfzVar2 == null) {
                dqfzVar2 = dqfz.g;
            }
            return cqsk.a(apka.b(application, new eaph(dqfzVar2.d).a(eaou.b)));
        }
        return null;
    }
}
