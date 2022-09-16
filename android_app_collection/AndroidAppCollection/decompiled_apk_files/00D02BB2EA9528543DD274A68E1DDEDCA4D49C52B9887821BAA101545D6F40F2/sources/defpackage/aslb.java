package defpackage;

import android.graphics.Rect;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
/* compiled from: PG */
/* renamed from: aslb  reason: default package */
/* loaded from: classes2.dex */
public final class aslb implements aslg {
    final askw b;
    @dzsi
    private GmmLocation i;
    private final btvo j;
    private final cjqq k;
    private final asku l;
    private final alah m;
    private static final dcqe c = dcqe.c("aslb");
    static final alag a = new alag();
    private static final float d = (float) (akra.q(dcyn.a) * 1000.0d);
    private static final float e = (float) (akra.q(dcyn.a) * 3000.0d);
    private dvdo f = dvdo.NORMAL;
    private float g = -1.0f;
    private int h = 0;
    private dbsg<Float> n = dbpy.a;

    public aslb(btvo btvoVar, cjqq cjqqVar, asku askuVar, alah alahVar, akza akzaVar) {
        dbsk.s(btvoVar);
        this.j = btvoVar;
        dbsk.s(cjqqVar);
        this.k = cjqqVar;
        dbsk.s(askuVar);
        this.l = askuVar;
        dbsk.s(alahVar);
        this.m = alahVar;
        this.b = new askw(btvoVar, askuVar, akzaVar);
    }

    static alae d(Rect rect, int i, int i2, float f, int i3, dbsg<Float> dbsgVar) {
        return alae.a(rect.exactCenterX(), rect.bottom - ((dbsgVar.a() ? (int) (dbsgVar.b().floatValue() * f) : (int) (f * 57.0f)) + i3), i, i2);
    }

    private final boolean o() {
        return this.j.getNavigationParameters().X() == 5;
    }

    private final int p(cray crayVar) {
        int i = crayVar.m;
        if (i == 0) {
            int i2 = this.h;
            if (i2 != 0) {
                return i2;
            }
            return 0;
        }
        return i;
    }

    private final dvdo q(@dzsi akra akraVar, alae alaeVar, int i, int i2, float f) {
        GmmLocation gmmLocation;
        GmmLocation gmmLocation2 = this.i;
        if (gmmLocation2 != null && akraVar != null && gmmLocation2.E(akraVar) <= d && r(dvdo.APPROACH, akraVar, alaeVar, i, i2, f)) {
            return dvdo.APPROACH;
        }
        float f2 = this.g;
        if (f2 < 0.0f || f2 > 100.0f) {
            return this.f == dvdo.APPROACH ? dvdo.NORMAL : this.f;
        }
        return (this.g >= (this.f == dvdo.FAR_VIEW_MODE ? 15.0f : 20.0f) && ((gmmLocation = this.i) == null || akraVar == null || gmmLocation.E(akraVar) > e || !r(dvdo.NORMAL, akraVar, alaeVar, i, i2, f))) ? dvdo.FAR_VIEW_MODE : dvdo.NORMAL;
    }

    private final boolean r(dvdo dvdoVar, akra akraVar, alae alaeVar, int i, int i2, float f) {
        int i3;
        float f2 = this.f == dvdoVar ? 0.0f : 0.19999999f;
        GmmLocation gmmLocation = this.i;
        dbsk.s(gmmLocation);
        akzh akzhVar = new akzh(new alad(gmmLocation.B(), this.b.b(dvdoVar), a(dvdoVar), gmmLocation.getBearing(), alaeVar), i, i2, f);
        int[] n = akyx.n(akzhVar, akraVar);
        int y = akzhVar.y();
        int z = akzhVar.z();
        if (n != null) {
            float f3 = n[0];
            float f4 = y;
            if (f3 > f4 * f2 && f3 < f4 * (1.0f - f2) && (i3 = n[1]) < z && i3 > z * f2) {
                return true;
            }
        }
        return false;
    }

    private final void s(GmmLocation gmmLocation) {
        this.i = gmmLocation;
        if (gmmLocation.hasSpeed()) {
            this.g = gmmLocation.getSpeed();
        }
    }

    final float a(dvdo dvdoVar) {
        dvdi dvdiVar = this.j.getNavigationParameters().y(this.l.a(), this.l.b(), this.l.c(), dvdoVar).c;
        if (dvdiVar == null) {
            dvdiVar = dvdi.d;
        }
        return dvdiVar.b;
    }

    final int b(boolean z, int i) {
        if (!o() || z) {
            return 0;
        }
        return i / 10;
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x030e A[Catch: all -> 0x03c2, TryCatch #0 {, blocks: (B:3:0x000a, B:5:0x0027, B:7:0x002f, B:9:0x0039, B:11:0x003f, B:13:0x005b, B:16:0x0079, B:21:0x0085, B:23:0x0096, B:134:0x0320, B:137:0x033e, B:139:0x0346, B:143:0x0353, B:146:0x035b, B:148:0x0386, B:154:0x03b9, B:155:0x03bd, B:149:0x0395, B:152:0x039d, B:24:0x009e, B:26:0x00a6, B:28:0x00aa, B:30:0x00bf, B:35:0x00d3, B:39:0x00e7, B:43:0x00f1, B:131:0x030e, B:132:0x0315, B:46:0x0117, B:48:0x0120, B:50:0x0127, B:51:0x0189, B:53:0x0195, B:55:0x01ac, B:58:0x01b4, B:126:0x02eb, B:128:0x02f3, B:129:0x02ff, B:61:0x01cd, B:63:0x01d7, B:64:0x01e1, B:84:0x021f, B:87:0x022b, B:90:0x0237, B:92:0x0241, B:93:0x0250, B:95:0x025a, B:68:0x01eb, B:70:0x01f4, B:73:0x01ff, B:77:0x0208, B:97:0x0268, B:99:0x027e, B:101:0x0288, B:107:0x0297, B:111:0x02ab, B:123:0x02df, B:114:0x02b9, B:116:0x02c3, B:120:0x02d4, B:108:0x029f, B:41:0x00ec, B:31:0x00c6, B:33:0x00ca, B:133:0x031a, B:20:0x0082), top: B:161:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0315 A[Catch: all -> 0x03c2, TryCatch #0 {, blocks: (B:3:0x000a, B:5:0x0027, B:7:0x002f, B:9:0x0039, B:11:0x003f, B:13:0x005b, B:16:0x0079, B:21:0x0085, B:23:0x0096, B:134:0x0320, B:137:0x033e, B:139:0x0346, B:143:0x0353, B:146:0x035b, B:148:0x0386, B:154:0x03b9, B:155:0x03bd, B:149:0x0395, B:152:0x039d, B:24:0x009e, B:26:0x00a6, B:28:0x00aa, B:30:0x00bf, B:35:0x00d3, B:39:0x00e7, B:43:0x00f1, B:131:0x030e, B:132:0x0315, B:46:0x0117, B:48:0x0120, B:50:0x0127, B:51:0x0189, B:53:0x0195, B:55:0x01ac, B:58:0x01b4, B:126:0x02eb, B:128:0x02f3, B:129:0x02ff, B:61:0x01cd, B:63:0x01d7, B:64:0x01e1, B:84:0x021f, B:87:0x022b, B:90:0x0237, B:92:0x0241, B:93:0x0250, B:95:0x025a, B:68:0x01eb, B:70:0x01f4, B:73:0x01ff, B:77:0x0208, B:97:0x0268, B:99:0x027e, B:101:0x0288, B:107:0x0297, B:111:0x02ab, B:123:0x02df, B:114:0x02b9, B:116:0x02c3, B:120:0x02d4, B:108:0x029f, B:41:0x00ec, B:31:0x00c6, B:33:0x00ca, B:133:0x031a, B:20:0x0082), top: B:161:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0114 A[EDGE_INSN: B:162:0x0114->B:45:0x0114 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02ff A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02f3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0195 A[Catch: all -> 0x03c2, TryCatch #0 {, blocks: (B:3:0x000a, B:5:0x0027, B:7:0x002f, B:9:0x0039, B:11:0x003f, B:13:0x005b, B:16:0x0079, B:21:0x0085, B:23:0x0096, B:134:0x0320, B:137:0x033e, B:139:0x0346, B:143:0x0353, B:146:0x035b, B:148:0x0386, B:154:0x03b9, B:155:0x03bd, B:149:0x0395, B:152:0x039d, B:24:0x009e, B:26:0x00a6, B:28:0x00aa, B:30:0x00bf, B:35:0x00d3, B:39:0x00e7, B:43:0x00f1, B:131:0x030e, B:132:0x0315, B:46:0x0117, B:48:0x0120, B:50:0x0127, B:51:0x0189, B:53:0x0195, B:55:0x01ac, B:58:0x01b4, B:126:0x02eb, B:128:0x02f3, B:129:0x02ff, B:61:0x01cd, B:63:0x01d7, B:64:0x01e1, B:84:0x021f, B:87:0x022b, B:90:0x0237, B:92:0x0241, B:93:0x0250, B:95:0x025a, B:68:0x01eb, B:70:0x01f4, B:73:0x01ff, B:77:0x0208, B:97:0x0268, B:99:0x027e, B:101:0x0288, B:107:0x0297, B:111:0x02ab, B:123:0x02df, B:114:0x02b9, B:116:0x02c3, B:120:0x02d4, B:108:0x029f, B:41:0x00ec, B:31:0x00c6, B:33:0x00ca, B:133:0x031a, B:20:0x0082), top: B:161:0x000a }] */
    @Override // defpackage.aslg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.alai c(com.google.android.apps.gmm.map.model.location.GmmLocation r25, @defpackage.dzsi defpackage.amuo r26, @defpackage.dzsi defpackage.cray r27, android.graphics.Rect r28, @defpackage.dzsi java.lang.Float r29, int r30, int r31, float r32) {
        /*
            Method dump skipped, instructions count: 966
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aslb.c(com.google.android.apps.gmm.map.model.location.GmmLocation, amuo, cray, android.graphics.Rect, java.lang.Float, int, int, float):alai");
    }

    @Override // defpackage.aslg
    public final alad e(amuo amuoVar, Rect rect, int i, int i2) {
        akra akraVar = amuoVar.c;
        alae a2 = alae.a(rect.exactCenterX(), rect.exactCenterY(), i, i2);
        alaa a3 = alad.a();
        a3.c(new akqq(akraVar.k(), akraVar.o()));
        a3.e = amuoVar.n;
        a3.c = this.b.b(dvdo.INSPECT_STEP);
        a3.d = a(dvdo.INSPECT_STEP);
        a3.f = a2;
        return a3.a();
    }

    @Override // defpackage.aslg
    @dzsi
    public final alad f(amub amubVar, float f, float f2, Rect rect, int i, int i2, float f3) {
        float f4;
        akrk akrkVar;
        double d2 = f;
        akra X = amubVar.X(d2);
        double d3 = f + f2;
        akra X2 = amubVar.X(d3);
        if (X == null) {
            return null;
        }
        if (X2 == null) {
            X2 = amubVar.l.p();
        }
        akra akraVar = X2;
        int aa = amubVar.aa(d2) + 1;
        int aa2 = amubVar.aa(d3) + 1;
        if (aa2 - aa > 1 || aa2 < amubVar.l.l() - 2 || amubVar.l.l() <= 1) {
            f4 = Float.NaN;
        } else {
            f4 = amubVar.l.w(akrkVar.l() - 2);
        }
        akzh a2 = this.b.a(X, akraVar, aa2 > aa ? new akru[]{new akru(amubVar.l, aa, aa2)} : null, rect, this.f, i, i2, (int) (128.0f * f3), (int) (65.0f * f3), f4, f3);
        if (a2 == null) {
            return null;
        }
        return a2.p();
    }

    @Override // defpackage.aslg
    @dzsi
    public final alad g(dcdc<akra> dcdcVar, int i, akru akruVar, Rect rect, int i2, int i3, float f) {
        return aslc.a(dcdcVar, i, akruVar, rect, i2, i3, f, this.b.b(dvdo.INSPECT_ROUTE), this.l.c(), 0.0f);
    }

    @Override // defpackage.aslg
    @dzsi
    public final alad h(dcdc<akra> dcdcVar, int i, akra akraVar, Rect rect, int i2, int i3, float f) {
        return aslc.b(dcdcVar, i, akraVar, rect, i2, i3, f, this.b.b(dvdo.INSPECT_ROUTE), this.l.c(), 0.0f);
    }

    @Override // defpackage.aslg
    @dzsi
    public final alad i(dcdc<akra> dcdcVar, int i, Rect rect, int i2, int i3, float f) {
        if (i <= 0) {
            return null;
        }
        return aslc.d(dcdcVar, i, rect, i2, i3, f, this.b.b(dvdo.INSPECT_ROUTE), this.l.c());
    }

    @Override // defpackage.aslg
    public final alad j(alad aladVar, Rect rect, int i, int i2, float f) {
        alaa a2 = alad.a();
        a2.c(aladVar.i);
        a2.d = a(dvdo.NORMAL);
        a2.c = aladVar.k;
        a2.e = aladVar.m;
        a2.f = d(rect, i, i2, f, b(true, i2), this.n);
        return a2.a();
    }

    @Override // defpackage.aslg
    public final alad k(akra akraVar, GmmLocation gmmLocation, Rect rect, int i, int i2, float f) {
        s(gmmLocation);
        akzh a2 = this.b.a(gmmLocation.C(), akraVar, null, rect, q(akraVar, d(rect, i, i2, f, b(gmmLocation.hasBearing(), i2), this.n), i, i2, f), i, i2, 0, (int) (65.0f * f), akrb.e(gmmLocation.C(), akraVar), f);
        dbsk.s(a2);
        return a2.p();
    }

    @Override // defpackage.aslg
    public final void l(dbsg<Float> dbsgVar) {
        this.n = dbsgVar;
    }

    @Override // defpackage.aslg
    @dzsi
    public final alad m(akrp akrpVar, Rect rect, int i, int i2, float f, float f2) {
        bvoo.h("positionForBounds should not be called for ObliqueCameraPositioner", new Object[0]);
        return null;
    }

    @Override // defpackage.aslg
    @dzsi
    public final alad n(@dzsi GmmLocation gmmLocation, akru[] akruVarArr, Rect rect, int i, int i2, float f) {
        if (akruVarArr.length == 0) {
            return null;
        }
        akzh a2 = this.b.a(gmmLocation == null ? null : gmmLocation.C(), null, akruVarArr, rect, dvdo.INSPECT_ROUTE, i, i2, 0, (int) (65.0f * f), Float.NaN, f);
        if (a2 == null) {
            return null;
        }
        return a2.p();
    }
}
