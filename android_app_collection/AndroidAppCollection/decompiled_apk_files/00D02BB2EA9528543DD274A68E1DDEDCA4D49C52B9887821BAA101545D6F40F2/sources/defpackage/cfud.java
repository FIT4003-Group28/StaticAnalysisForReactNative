package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cfud  reason: default package */
/* loaded from: classes4.dex */
public class cfud implements cfta {
    private final Runnable a;

    public cfud(Runnable runnable) {
        this.a = runnable;
    }

    @Override // defpackage.cfta
    public cqkl a() {
        this.a.run();
        return cqkl.a;
    }

    @Override // defpackage.cfta
    public Integer c() {
        return Integer.valueOf((int) R.string.ONBOARDING_CARD_CLOSE_BUTTON_ACCESSIBILITY_DESCRIPTION);
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
        return dtxl.eo;
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
        return cqrt.g(2131232205, ibl.q());
    }
}
