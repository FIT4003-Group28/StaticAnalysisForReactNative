package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cftg  reason: default package */
/* loaded from: classes4.dex */
public class cftg implements cfta {
    private final Runnable a;

    public cftg(Runnable runnable) {
        this.a = runnable;
    }

    @Override // defpackage.cfta
    public cqkl a() {
        this.a.run();
        return cqkl.a;
    }

    @Override // defpackage.cfta
    public Integer c() {
        return Integer.valueOf((int) R.string.TURN_ON_LOCATION_HISTORY);
    }

    @Override // defpackage.cfta
    public CharSequence d() {
        return "";
    }

    @Override // defpackage.cfta
    public CharSequence e() {
        return "";
    }

    @Override // defpackage.cfta
    public ddho f(cfsz cfszVar) {
        return dtxl.ey;
    }

    @Override // defpackage.cfta
    public Boolean g() {
        return cfsy.c();
    }

    @Override // defpackage.cfta
    public cjtd h() {
        return cfsy.a(this);
    }

    @Override // defpackage.cfta
    public cjtd i(cfsz cfszVar) {
        return cfsy.b(this, cfszVar);
    }

    @Override // defpackage.cfta
    public cqtd j() {
        return iut.a(iup.c(R.raw.ic_locationhistory, ibm.x()));
    }
}
