package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aqpd  reason: default package */
/* loaded from: classes2.dex */
public class aqpd implements aqea {
    private final gga a;
    private final apyx b;
    private final dxio<aqwq> c;
    private final dxio<aqci> d;
    private final btlu e;
    private final String f;
    private final String g;
    private final Runnable h;

    public aqpd(gga ggaVar, apyx apyxVar, dxio<aqwq> dxioVar, dxio<aqci> dxioVar2, btlu btluVar, String str, String str2, Runnable runnable) {
        this.a = ggaVar;
        this.b = apyxVar;
        this.c = dxioVar;
        this.d = dxioVar2;
        this.e = btluVar;
        this.f = str;
        this.g = str2;
        this.h = runnable;
    }

    @Override // defpackage.aqea
    public CharSequence a() {
        return this.b.b() ? this.a.getString(R.string.MERCHANT_MESSAGING_FEATURE_PROMO_BANNER_TEXT) : "";
    }

    @Override // defpackage.aqea
    public CharSequence b() {
        return this.b.b() ? this.a.getString(R.string.MERCHANT_MESSAGING_FEATURE_NOTIFICATION_BODY_TEXT, new Object[]{this.f}) : "";
    }

    @Override // defpackage.aqea
    public CharSequence c() {
        return this.a.getString(R.string.LEARN_MORE);
    }

    @Override // defpackage.aqea
    public cqtd d() {
        return cqrt.g(2131232300, ibm.b());
    }

    @Override // defpackage.aqea
    public cjtd f() {
        return aqdb.a(dtxv.bX, this.g).a();
    }

    @Override // defpackage.aqea
    public CharSequence g() {
        return this.a.getString(R.string.DISMISS);
    }

    @Override // defpackage.aqea
    @dzsi
    public cqtd h() {
        return null;
    }

    @Override // defpackage.aqea
    public cjtd j() {
        return aqdb.a(dtxv.bW, this.g).a();
    }

    @Override // defpackage.aqea
    public cjtd k() {
        return aqdb.a(dtxv.bV, this.g).a();
    }

    @Override // defpackage.aqea
    public Boolean l() {
        return true;
    }

    @Override // defpackage.aqea
    public cqkl m() {
        this.d.a().a();
        return cqkl.a;
    }

    @Override // defpackage.aqea
    public Boolean n() {
        return true;
    }

    @Override // defpackage.aqea
    public cqkl o() {
        aqwq a = this.c.a();
        btlu btluVar = this.e;
        String str = this.g;
        synchronized (a.e) {
            a.d.T(aqwq.i(str), btluVar, true);
        }
        this.h.run();
        return cqkl.a;
    }
}
