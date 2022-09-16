package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bysq  reason: default package */
/* loaded from: classes4.dex */
public class bysq implements bysf {
    private final Resources a;
    private final dxio<auhi> b;
    private final dxio<awnv> c;
    private final dxio<byqh> d;
    private final dxio<cjqy> e;

    public bysq(Resources resources, dxio<auhi> dxioVar, dxio<awnv> dxioVar2, dxio<byqh> dxioVar3, dxio<cjqy> dxioVar4) {
        this.a = resources;
        this.b = dxioVar;
        this.c = dxioVar2;
        this.d = dxioVar3;
        this.e = dxioVar4;
    }

    private final void q(boolean z) {
        this.c.a().f();
        this.b.a().e(dpyv.TRAFFIC_TO_PLACE.dm, z ? aufs.ENABLED : aufs.DISABLED);
        this.d.a().b(z);
        this.d.a().n();
    }

    @Override // defpackage.bysf
    public cqkl a() {
        q(true);
        return cqkl.a;
    }

    @Override // defpackage.bysf
    public cqkl b() {
        q(false);
        return cqkl.a;
    }

    @Override // defpackage.bysf
    public cqkl c() {
        q(false);
        this.e.a().i(cjtd.a(dtyc.bH));
        return cqkl.a;
    }

    @Override // defpackage.bysf
    public cjtd i() {
        return cjtd.a(dtyc.bF);
    }

    @Override // defpackage.bysf
    public cjtd j() {
        return cjtd.a(dtyc.bJ);
    }

    @Override // defpackage.bysf
    public cjtd k() {
        return cjtd.a(dtyc.bI);
    }

    @Override // defpackage.bysf
    /* renamed from: l */
    public String d() {
        return this.a.getString(R.string.TRAFFIC_TO_PLACE_NOTIFICATION_PROMO_TITLE);
    }

    @Override // defpackage.bysf
    /* renamed from: m */
    public String e() {
        return this.a.getString(R.string.TRAFFIC_TO_PLACE_NOTIFICATION_PROMO_CONTENT);
    }

    @Override // defpackage.bysf
    /* renamed from: n */
    public String f() {
        return this.a.getString(R.string.TRAFFIC_TO_PLACE_NOTIFICATION_PROMO_ACCEPT);
    }

    @Override // defpackage.bysf
    /* renamed from: o */
    public String g() {
        return this.a.getString(R.string.TRAFFIC_TO_PLACE_NOTIFICATION_PROMO_DECLINE);
    }

    @Override // defpackage.bysf
    /* renamed from: p */
    public String h() {
        bvsi bvsiVar = new bvsi(this.a);
        bvsiVar.d(d());
        bvsiVar.d(e());
        return bvsiVar.toString();
    }
}
