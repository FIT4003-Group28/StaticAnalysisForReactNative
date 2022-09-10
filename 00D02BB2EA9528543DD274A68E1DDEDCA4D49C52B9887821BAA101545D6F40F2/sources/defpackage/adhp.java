package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: adhp  reason: default package */
/* loaded from: classes2.dex */
public class adhp extends aczs implements adho {
    private final gga a;
    private final dxio<awps> b;

    public adhp(gga ggaVar, dxio<awps> dxioVar) {
        this.a = ggaVar;
        this.b = dxioVar;
    }

    @Override // defpackage.adho
    public cqtd a() {
        gid b = gie.b(ibr.d);
        b.b = ibm.x();
        b.b(24.0d);
        return b.a();
    }

    @Override // defpackage.adho
    public String b() {
        return this.a.getString(R.string.PARKING_PAYMENT_ACTIVE_SESSION_TITLE);
    }

    @Override // defpackage.adho
    @dzsi
    public CharSequence c() {
        dbsg<dfvu> i = this.b.a().i();
        if (!i.a()) {
            return null;
        }
        return this.a.getString(R.string.PARKING_SESSION_END_TIME_PREFIX, new Object[]{awpq.a(new eapd(i.b().a), i.b().b)});
    }

    @Override // defpackage.aczr
    public cjtd e() {
        return cjtd.b;
    }

    @Override // defpackage.adho
    public cqkl f(cjqm cjqmVar) {
        this.b.a().f();
        return cqkl.a;
    }

    public Boolean g() {
        dbsg<dfvu> i = this.b.a().i();
        boolean z = false;
        if (!i.a()) {
            return false;
        }
        if (eaor.a() < i.b().a) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
