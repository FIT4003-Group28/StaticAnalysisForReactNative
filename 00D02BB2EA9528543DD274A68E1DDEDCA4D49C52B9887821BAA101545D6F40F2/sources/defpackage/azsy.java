package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: azsy  reason: default package */
/* loaded from: classes3.dex */
public class azsy extends bxqh implements azsx {
    private final gga k;
    private final dndr l;
    private final boolean m;
    private final bath n;
    private final boolean o;

    public azsy(bxqd bxqdVar, gga ggaVar, bath bathVar, bxqg bxqgVar, dndr dndrVar, boolean z, boolean z2) {
        super(bxqdVar, bxqgVar);
        this.k = ggaVar;
        this.l = dndrVar;
        this.m = z;
        this.n = bathVar;
        this.o = z2;
        ak(null);
    }

    private final String ap() {
        if (this.l.equals(dndr.HOME)) {
            return this.k.getString(R.string.YOUR_PLACES_ADD_HOME_ADDRESS);
        }
        if (this.l.equals(dndr.WORK)) {
            return this.k.getString(R.string.YOUR_PLACES_ADD_WORK_ADDRESS);
        }
        return this.k.getString(R.string.ALIAS_HEADER_ADD_TITLE);
    }

    private final dvko aq() {
        return this.n.a(this.l);
    }

    @Override // defpackage.bxqh, defpackage.ivk, defpackage.izs
    public Integer G() {
        if (aq().c) {
            return 33554435;
        }
        return super.G();
    }

    @Override // defpackage.azsx
    public Boolean a() {
        return Boolean.valueOf(this.m);
    }

    @Override // defpackage.azsx
    @dzsi
    public String b() {
        if (a().booleanValue()) {
            return this.k.getString(R.string.BASED_ON_YOUR_LOCATION_HISTORY);
        }
        return null;
    }

    @Override // defpackage.bxqh, defpackage.ivk
    public void f(CharSequence charSequence) {
        if (aq().c) {
            Ou(charSequence);
            jmw.d(this.k, null);
            return;
        }
        super.f(charSequence);
    }

    @Override // defpackage.azsx
    public jib h() {
        jhz e = jib.g(this.k, ap()).e();
        e.x = false;
        e.n = ap();
        e.F = 1;
        return e.b();
    }

    @Override // defpackage.azsx
    public Boolean i() {
        return Boolean.valueOf(this.o);
    }
}
