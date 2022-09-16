package defpackage;

import com.google.android.libraries.youtube.ads.model.ForecastingAd;
import com.google.android.libraries.youtube.ads.model.InstreamAdBreak;
/* compiled from: PG */
@wwb(a = apcb.LAYOUT_TYPE_FORECASTING, b = apcd.SLOT_TYPE_FORECASTING, c = {xba.class}, d = {xas.class, xbe.class})
/* renamed from: wqc  reason: default package */
/* loaded from: classes4.dex */
public final class wqc implements wqg {
    private final wqf a;
    private final wlh b;
    private final xdu c;
    private final xci d;
    private final String e;
    private final InstreamAdBreak f;
    private final ForecastingAd g;
    private final wvk h;

    public wqc(wqf wqfVar, wvk wvkVar, wlh wlhVar, xdu xduVar, xci xciVar) {
        this.a = wqfVar;
        this.h = wvkVar;
        this.b = wlhVar;
        this.c = xduVar;
        this.d = xciVar;
        this.e = (String) xduVar.d(xas.class);
        this.f = (InstreamAdBreak) xduVar.d(xbe.class);
        this.g = (ForecastingAd) xciVar.e(xba.class);
    }

    @Override // defpackage.wqg
    public final xci a() {
        throw null;
    }

    @Override // defpackage.wqg
    public final void b() {
    }

    @Override // defpackage.wqg
    public final void qH() {
    }

    @Override // defpackage.wqg
    public final void qI() {
        this.a.a(this.c, this.d);
        this.b.o(this.e, this.f, this.g);
        this.h.b(this.d, 0);
    }

    @Override // defpackage.wqg
    public final void qJ(int i) {
        this.a.d(this.c, this.d, i);
    }
}
