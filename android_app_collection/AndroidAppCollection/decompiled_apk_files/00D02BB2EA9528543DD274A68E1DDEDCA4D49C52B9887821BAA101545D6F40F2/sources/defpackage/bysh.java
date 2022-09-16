package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bysh  reason: default package */
/* loaded from: classes4.dex */
public class bysh implements bysf {
    private final Resources a;
    private final auhi b;
    private final jdi c;
    private final bysg d;

    public bysh(Resources resources, auhi auhiVar, jdi jdiVar, bysg bysgVar) {
        this.a = resources;
        this.b = auhiVar;
        this.c = jdiVar;
        this.d = bysgVar;
    }

    private final void m(boolean z) {
        this.d.b = true;
        this.c.f();
        this.b.e(dpyv.AREA_TRAFFIC.dm, z ? aufs.ENABLED : aufs.DISABLED);
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
        return cqkl.a;
    }

    @Override // defpackage.bysf
    public CharSequence d() {
        return this.a.getString(R.string.AREA_TRAFFIC_NOTIFICATION_PROMO_TITLE);
    }

    @Override // defpackage.bysf
    public CharSequence e() {
        return this.a.getString(R.string.AREA_TRAFFIC_NOTIFICATION_PROMO_BODY_PRESENT);
    }

    @Override // defpackage.bysf
    public CharSequence f() {
        return this.a.getString(R.string.OK_BUTTON);
    }

    @Override // defpackage.bysf
    public CharSequence g() {
        return this.a.getString(R.string.AREA_TRAFFIC_NOTIFICATION_PROMO_DISABLE);
    }

    @Override // defpackage.bysf
    public cjtd i() {
        return cjtd.a(dtyi.q);
    }

    @Override // defpackage.bysf
    public cjtd j() {
        return cjtd.a(dtyi.s);
    }

    @Override // defpackage.bysf
    public cjtd k() {
        return cjtd.a(dtyi.t);
    }

    @Override // defpackage.bysf
    /* renamed from: l */
    public String h() {
        bvsi bvsiVar = new bvsi(this.a);
        bvsiVar.d(d());
        bvsiVar.d(e());
        return bvsiVar.toString();
    }
}
