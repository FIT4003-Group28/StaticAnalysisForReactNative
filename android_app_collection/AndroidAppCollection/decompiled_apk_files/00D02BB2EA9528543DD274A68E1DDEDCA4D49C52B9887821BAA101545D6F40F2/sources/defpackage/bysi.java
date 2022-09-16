package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bysi  reason: default package */
/* loaded from: classes4.dex */
public class bysi implements bysf {
    private final byps a;
    private final Resources b;
    private final auhi c;
    private final cjqy d;
    private final dxio<awnv> e;

    public bysi(byps bypsVar, Resources resources, auhi auhiVar, cjqy cjqyVar, dxio<awnv> dxioVar) {
        this.a = bypsVar;
        this.b = resources;
        this.c = auhiVar;
        this.d = cjqyVar;
        this.e = dxioVar;
    }

    private final void m(boolean z) {
        this.e.a().f();
        this.c.e(dpyv.AREA_TRAFFIC.dm, z ? aufs.ENABLED : aufs.DISABLED);
        this.a.a();
    }

    @Override // defpackage.bysf
    public cqkl a() {
        m(true);
        return cqkl.a;
    }

    @Override // defpackage.bysf
    public cqkl b() {
        m(false);
        return cqkl.a;
    }

    @Override // defpackage.bysf
    public cqkl c() {
        m(true);
        this.d.i(cjtd.a(dtyi.v));
        return cqkl.a;
    }

    @Override // defpackage.bysf
    public CharSequence d() {
        return this.b.getString(R.string.AREA_TRAFFIC_NOTIFICATION_PROMO_TITLE);
    }

    @Override // defpackage.bysf
    public CharSequence e() {
        return this.b.getString(R.string.AREA_TRAFFIC_NOTIFICATION_PROMO_BODY_FUTURE);
    }

    @Override // defpackage.bysf
    public CharSequence f() {
        return this.b.getString(R.string.OK_BUTTON);
    }

    @Override // defpackage.bysf
    public CharSequence g() {
        return this.b.getString(R.string.AREA_TRAFFIC_NOTIFICATION_PROMO_DISABLE);
    }

    @Override // defpackage.bysf
    public cjtd i() {
        return cjtd.a(dtyi.u);
    }

    @Override // defpackage.bysf
    public cjtd j() {
        return cjtd.a(dtyi.w);
    }

    @Override // defpackage.bysf
    public cjtd k() {
        return cjtd.a(dtyi.x);
    }

    @Override // defpackage.bysf
    /* renamed from: l */
    public String h() {
        bvsi bvsiVar = new bvsi(this.b);
        bvsiVar.d(d());
        bvsiVar.d(e());
        return bvsiVar.toString();
    }
}
