package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bqtg  reason: default package */
/* loaded from: classes4.dex */
public class bqtg implements bqsx {
    private final gga a;

    public bqtg(gga ggaVar) {
        this.a = ggaVar;
    }

    private final void k() {
        fd K = this.a.K();
        if (K instanceof gen) {
            ((gen) K).aT();
        }
    }

    @Override // defpackage.bqsx
    public CharSequence a() {
        return this.a.getResources().getString(R.string.TO_CONTINUE_ADD_ACCOUNT_NAME);
    }

    @Override // defpackage.bqsx
    public cjtd b() {
        return cjtd.a(dtxs.af);
    }

    @Override // defpackage.bqsx
    public CharSequence c() {
        return this.a.getResources().getString(R.string.ADD_NAME_BUTTON);
    }

    @Override // defpackage.bqsx
    public cqss d() {
        return ibm.x();
    }

    @Override // defpackage.bqsx
    public cqkl e() {
        k();
        this.a.D(gfk.i("https://myaccount.google.com/profile", "local"));
        return cqkl.a;
    }

    @Override // defpackage.bqsx
    public cjtd f() {
        return cjtd.a(dtxs.ag);
    }

    @Override // defpackage.bqsx
    public CharSequence g() {
        return this.a.getResources().getString(R.string.CANCEL_BUTTON);
    }

    @Override // defpackage.bqsx
    public cqss h() {
        return irg.k();
    }

    @Override // defpackage.bqsx
    public cqkl i() {
        k();
        return cqkl.a;
    }

    @Override // defpackage.bqsx
    public cjtd j() {
        return cjtd.a(dtxs.ae);
    }
}
