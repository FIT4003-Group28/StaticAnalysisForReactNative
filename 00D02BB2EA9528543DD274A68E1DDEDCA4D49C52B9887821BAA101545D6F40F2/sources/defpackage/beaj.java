package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: beaj  reason: default package */
/* loaded from: classes3.dex */
public class beaj extends bruj {
    private final Activity e;
    private final jba f;

    public beaj(Activity activity, dxio<begg> dxioVar, brsc brscVar, jba jbaVar, brrx brrxVar) {
        super(brscVar, brrxVar);
        this.e = activity;
        this.f = jbaVar;
    }

    @Override // defpackage.brvb
    public cqkl a(cjqm cjqmVar) {
        return cqkl.a;
    }

    @Override // defpackage.brvb
    public String b() {
        String g = this.f.g();
        return dbsj.d(g) ? this.e.getString(bdys.REAL_ESTATE_HOME_REVIEW_BUTTON) : this.e.getString(bdys.REAL_ESTATE_HOME_REVIEW_BUTTON_CONTEXT_DESCRIPTION, new Object[]{g});
    }

    @Override // defpackage.bruj
    protected final String c() {
        return this.e.getString(bdys.REAL_ESTATE_HOME_REVIEW_BUTTON);
    }

    @Override // defpackage.brvb
    public Boolean d() {
        r();
        return false;
    }

    @Override // defpackage.brvb
    public cqtd f() {
        return cqrt.g(2131232197, ibm.w());
    }
}
