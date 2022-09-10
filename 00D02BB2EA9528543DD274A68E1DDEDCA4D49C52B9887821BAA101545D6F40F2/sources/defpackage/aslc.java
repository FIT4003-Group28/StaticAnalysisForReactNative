package defpackage;

import android.graphics.Rect;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
/* compiled from: PG */
/* renamed from: aslc  reason: default package */
/* loaded from: classes2.dex */
public final class aslc implements aslg {
    static final alag a = new alag();
    private static final float c = (float) (1.0d / Math.log(2.0d));
    final asku b;
    private final btvo d;
    private final arym e;
    private final alah f;
    private float g;
    private float h = 0.0f;

    public aslc(btvo btvoVar, asku askuVar, arym arymVar, alah alahVar) {
        dbsk.s(btvoVar);
        this.d = btvoVar;
        dbsk.s(askuVar);
        this.b = askuVar;
        dbsk.s(arymVar);
        this.e = arymVar;
        dbsk.s(alahVar);
        this.f = alahVar;
        this.g = o(dvdo.NORMAL);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @dzsi
    public static alad a(dcdc<akra> dcdcVar, int i, akru akruVar, Rect rect, int i2, int i3, float f, float f2, boolean z, float f3) {
        return p(dcdcVar, i, akruVar.e(), rect, i2, i3, f, f2, z, f3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @dzsi
    public static alad b(dcdc<akra> dcdcVar, int i, akra akraVar, Rect rect, int i2, int i3, float f, float f2, boolean z, float f3) {
        return p(dcdcVar, i, akrp.g(akraVar, akraVar), rect, i2, i3, f, f2, z, f3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static alad d(dcdc<akra> dcdcVar, int i, Rect rect, int i2, int i3, float f, float f2, boolean z) {
        return q(dcdcVar, i, null, rect, i2, i3, f, f2, z, 0.0f);
    }

    private final float o(dvdo dvdoVar) {
        if (this.d.getNavigationParameters().X() == 2 && this.b.a() == dvdm.CAMERA_2D_NORTH_UP && !this.b.c() && !this.b.b() && dvdoVar == dvdo.APPROACH) {
            return 17.0f;
        }
        dvdi dvdiVar = this.d.getNavigationParameters().y(this.b.a(), this.b.b(), this.b.c(), dvdoVar).c;
        if (dvdiVar == null) {
            dvdiVar = dvdi.d;
        }
        return dvdiVar.c;
    }

    private static alad p(dcdc<akra> dcdcVar, int i, akrp akrpVar, Rect rect, int i2, int i3, float f, float f2, boolean z, float f3) {
        if (i > 0) {
            return q(dcdcVar, i, akrpVar, rect, i2, i3, f, f2, z, f3);
        }
        return s(akrpVar, t(rect, i2, i3, alah.LOCATION_ONLY, z), r(akrpVar, rect, f, false), f2, f3);
    }

    private static alad q(dcdc<akra> dcdcVar, int i, @dzsi akrp akrpVar, Rect rect, int i2, int i3, float f, float f2, boolean z, float f3) {
        akrp f4 = akrp.f((akra[]) dcdcVar.subList(0, i).toArray(new akra[0]));
        akrp o = akrpVar == null ? f4 : akrpVar.o(f4);
        float r = r(o, rect, f, false);
        float f5 = r < 2.0f ? 2.0f : r;
        if (r >= 2.0f) {
            f4 = o;
        }
        return s(f4, t(rect, i2, i3, alah.LOCATION_ONLY, z), f5, f2, f3);
    }

    private static float r(akrp akrpVar, Rect rect, float f, boolean z) {
        if (akrpVar.m() == 0 || akrpVar.n() == 0) {
            return 21.0f;
        }
        float f2 = f * 256.0f;
        return 30.0f - (((float) Math.log(Math.max((akrpVar.m() * f2) / rect.width(), (akrpVar.n() * f2) / rect.height()) / 0.8f)) * c);
    }

    private static alad s(akrp akrpVar, @dzsi alae alaeVar, float f, float f2, float f3) {
        float min = Math.min(f2, f);
        alaa a2 = alad.a();
        akra akraVar = new akra();
        akrpVar.t(akraVar);
        a2.d(akraVar);
        a2.c = min;
        a2.e = f3;
        a2.f = alaeVar;
        return a2.a();
    }

    private static alae t(Rect rect, int i, int i2, alah alahVar, boolean z) {
        float exactCenterY;
        if (alahVar != alah.LOCATION_AND_BEARING || z) {
            exactCenterY = rect.exactCenterY();
        } else {
            exactCenterY = rect.bottom - ((rect.bottom - rect.top) * 0.2f);
        }
        return alae.a(rect.exactCenterX(), exactCenterY, i, i2);
    }

    @Override // defpackage.aslg
    public final alad e(amuo amuoVar, Rect rect, int i, int i2) {
        akra akraVar = amuoVar.c;
        akqq akqqVar = new akqq(akraVar.k(), akraVar.o());
        float f = this.f == alah.LOCATION_ONLY ? 0.0f : amuoVar.n;
        alaa a2 = alad.a();
        a2.c(akqqVar);
        a2.e = f;
        a2.c = o(dvdo.INSPECT_STEP);
        a2.d = 0.0f;
        a2.f = t(rect, i, i2, this.f, this.b.c());
        return a2.a();
    }

    @Override // defpackage.aslg
    @dzsi
    public final alad f(amub amubVar, float f, float f2, Rect rect, int i, int i2, float f3) {
        double d = f;
        akra X = amubVar.X(d);
        double d2 = f + f2;
        akra X2 = amubVar.X(d2);
        if (X == null) {
            return null;
        }
        if (X2 == null) {
            X2 = amubVar.l.p();
        }
        int aa = amubVar.aa(d) + 1;
        int aa2 = amubVar.aa(d2) + 1;
        akrp g = akrp.g(X, X2);
        if (aa2 > aa) {
            g = g.o(new akru(amubVar.l, aa, aa2).e());
        }
        akra akraVar = new akra(g.m(), g.n());
        akrp akrpVar = new akrp(X.E(akraVar), X.C(akraVar));
        this.h = akrb.e(X, X2);
        return s(akrpVar, t(rect, i, i2, this.f, this.b.c()), r(akrpVar, rect, f3, false), this.g, this.f == alah.LOCATION_AND_BEARING ? this.h : 0.0f);
    }

    @Override // defpackage.aslg
    @dzsi
    public final alad g(dcdc<akra> dcdcVar, int i, akru akruVar, Rect rect, int i2, int i3, float f) {
        return a(dcdcVar, i, akruVar, rect, i2, i3, f, o(dvdo.INSPECT_ROUTE), this.b.c(), this.f == alah.LOCATION_AND_BEARING ? this.h : 0.0f);
    }

    @Override // defpackage.aslg
    @dzsi
    public final alad h(dcdc<akra> dcdcVar, int i, akra akraVar, Rect rect, int i2, int i3, float f) {
        return b(dcdcVar, i, akraVar, rect, i2, i3, f, o(dvdo.INSPECT_ROUTE), this.b.c(), this.f == alah.LOCATION_AND_BEARING ? this.h : 0.0f);
    }

    @Override // defpackage.aslg
    @dzsi
    public final alad i(dcdc<akra> dcdcVar, int i, Rect rect, int i2, int i3, float f) {
        if (i <= 0) {
            return null;
        }
        return d(dcdcVar, i, rect, i2, i3, f, o(dvdo.INSPECT_ROUTE), this.b.c());
    }

    @Override // defpackage.aslg
    public final alad j(alad aladVar, Rect rect, int i, int i2, float f) {
        alaa a2 = alad.a();
        a2.c(aladVar.i);
        a2.c = aladVar.k;
        a2.f = t(rect, i, i2, this.f, this.b.c());
        return a2.a();
    }

    @Override // defpackage.aslg
    public final alad k(akra akraVar, GmmLocation gmmLocation, Rect rect, int i, int i2, float f) {
        akra C = gmmLocation.C();
        return q(dcdc.f(akraVar), 1, akrp.g(C, C), rect, i, i2, f, o(dvdo.INSPECT_ROUTE), this.b.c(), this.f == alah.LOCATION_AND_BEARING ? this.h : 0.0f);
    }

    @Override // defpackage.aslg
    public final void l(dbsg<Float> dbsgVar) {
    }

    @Override // defpackage.aslg
    public final alad m(akrp akrpVar, Rect rect, int i, int i2, float f, float f2) {
        return s(akrpVar, t(rect, i, i2, this.f, this.b.c()), r(akrpVar, rect, f, false), o(dvdo.INSPECT_ROUTE), 0.0f);
    }

    @Override // defpackage.aslg
    public final alad n(@dzsi GmmLocation gmmLocation, akru[] akruVarArr, Rect rect, int i, int i2, float f) {
        akra[] akraVarArr;
        int length;
        if (gmmLocation == null) {
            int length2 = akruVarArr.length;
            akraVarArr = new akra[length2 + length2];
        } else {
            int length3 = akruVarArr.length;
            int i3 = length3 + length3 + 1;
            akra[] akraVarArr2 = new akra[i3];
            akraVarArr2[i3 - 1] = gmmLocation.C();
            akraVarArr = akraVarArr2;
        }
        int i4 = 0;
        while (true) {
            length = akruVarArr.length;
            if (i4 >= length) {
                break;
            }
            akrp e = akruVarArr[i4].e();
            int i5 = i4 + i4;
            akraVarArr[i5] = e.a;
            akraVarArr[i5 + 1] = e.b;
            i4++;
        }
        akrp f2 = akrp.f(akraVarArr);
        if (length > 0) {
            akru akruVar = akruVarArr[0];
            akruVar.b(akruVar.a() - 1);
            this.h = 0.0f;
        }
        return m(f2, rect, i, i2, f, 0.0f);
    }

    @Override // defpackage.aslg
    public final alai c(GmmLocation gmmLocation, @dzsi amuo amuoVar, @dzsi cray crayVar, Rect rect, @dzsi Float f, int i, int i2, float f2) {
        float o;
        alad f3;
        if (f != null) {
            o = f.floatValue();
        } else if (amuoVar != null) {
            float log = 30.0f - (((float) Math.log(((gmmLocation.C().y(amuoVar.c) * 256.0f) * f2) / (Math.min(i, i2) * 0.5f))) * c);
            if (log >= o(dvdo.APPROACH)) {
                o = o(dvdo.APPROACH);
            } else if (log >= o(dvdo.NORMAL)) {
                o = o(dvdo.NORMAL);
            } else {
                o = o(dvdo.FAR_VIEW_MODE);
            }
        } else {
            o = this.e == arym.GUIDED_NAV ? this.g : o(dvdo.NORMAL);
        }
        float f4 = o;
        this.g = f4;
        if (crayVar == null || this.d.getDirectionsExperimentsParameters() == null || !this.d.getDirectionsExperimentsParameters().n || crayVar.m <= 0 || (f3 = f(crayVar.a, (float) crayVar.c(), crayVar.m, rect, i, i2, f2)) == null) {
            alaf a2 = alai.a();
            a2.a = a;
            alah alahVar = this.f;
            a2.f = alahVar;
            a2.b = f4;
            a2.e = t(rect, i, i2, alahVar, this.b.c());
            return a2.a();
        }
        alaf a3 = alai.a();
        a3.a = a;
        alah alahVar2 = this.f;
        a3.f = alahVar2;
        a3.e = t(rect, i, i2, alahVar2, this.b.c());
        a3.b = f3.k;
        return a3.a();
    }
}
