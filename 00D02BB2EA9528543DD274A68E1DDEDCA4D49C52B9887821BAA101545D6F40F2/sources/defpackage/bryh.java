package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bryh  reason: default package */
/* loaded from: classes4.dex */
public class bryh extends bryg {
    private final dxio<qbt> b;

    public bryh(cqhn cqhnVar, dxio<qbt> dxioVar) {
        super(cqhnVar);
        this.b = dxioVar;
    }

    @Override // defpackage.bryd
    public cqtd e() {
        return iup.e(R.raw.realtime_train_promo_icon);
    }

    @Override // defpackage.bryd
    public Integer f() {
        return Integer.valueOf((int) R.string.TRANSIT_FEED_WIMT_PROMO_BUTTON_TEXT);
    }

    @Override // defpackage.bryd
    public cqtd g() {
        return cqrt.g(2131231604, ibm.b());
    }

    @Override // defpackage.bryd
    public cjtd h() {
        return cjtd.a(dtyc.dN);
    }

    @Override // defpackage.bryd
    public cqkl i() {
        b();
        qcw x = qcx.x();
        x.s(dqvj.TRANSIT);
        x.i(2);
        x.r(amvh.a);
        this.b.a().m(x.a());
        return cqkl.a;
    }

    @Override // defpackage.bryd
    /* renamed from: j */
    public cqvf c() {
        return cqvf.l(R.string.TRANSIT_FEED_WIMT_PROMO_TITLE);
    }

    @Override // defpackage.bryd
    /* renamed from: k */
    public cqvf d() {
        return cqvf.l(R.string.TRANSIT_FEED_WIMT_PROMO_BODY_TEXT);
    }
}
