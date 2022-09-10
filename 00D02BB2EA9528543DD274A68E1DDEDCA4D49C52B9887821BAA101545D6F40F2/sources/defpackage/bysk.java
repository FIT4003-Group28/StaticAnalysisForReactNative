package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bysk  reason: default package */
/* loaded from: classes4.dex */
public class bysk implements bysf {
    private final Resources a;
    private final dxio<byqh> b;
    private final dxio<auhi> c;
    private final dxio<cjqy> d;
    private final dpyv e;
    private final ddho f;
    private final ddho g;
    private final ddho h;
    private final ddho i;
    private final int j;
    private final int k;
    @dzsi
    private final bysj l;

    public bysk(Resources resources, dxio<auhi> dxioVar, dxio<byqh> dxioVar2, dxio<cjqy> dxioVar3, dpyv dpyvVar, ddho ddhoVar, ddho ddhoVar2, ddho ddhoVar3, ddho ddhoVar4, int i, int i2, int i3, int i4, @dzsi bysj bysjVar) {
        this.a = resources;
        this.c = dxioVar;
        this.b = dxioVar2;
        this.d = dxioVar3;
        this.e = dpyvVar;
        this.f = ddhoVar;
        this.g = ddhoVar2;
        this.h = ddhoVar3;
        this.i = ddhoVar4;
        this.j = i;
        this.k = i2;
        this.l = bysjVar;
    }

    public static bysk l(bysl byslVar, bysj bysjVar) {
        return byslVar.a(dpyv.TRAFFIC_TO_PLACE, dtyc.bD, dtyc.bA, dtyc.bE, dtyc.bC, R.string.INFERRED_COMMUTE_DESTINATION_NOTIFICATION_TRAFFIC_WARMUP_BANNER_TITLE, R.string.HOME_ONLY_COMMUTE_NOTIFICATION_TRAFFIC_WARMUP_BANNER_SUBTITLE, bysjVar);
    }

    public static bysk m(bysl byslVar, bysj bysjVar) {
        return byslVar.a(dpyv.TRANSIT_TO_PLACE, dtyc.fn, dtyc.fl, dtyc.fo, dtyc.fm, R.string.HOME_ONLY_COMMUTE_NOTIFICATION_TRANSIT_WARMUP_BANNER_TITLE, R.string.HOME_ONLY_COMMUTE_NOTIFICATION_TRANSIT_WARMUP_BANNER_SUBTITLE, bysjVar);
    }

    private final void s(int i) {
        int i2 = 3;
        if (i != 3) {
            this.c.a().e(this.e.dm, i == 1 ? aufs.ENABLED : aufs.DISABLED);
            if (this.e == dpyv.TRAFFIC_TO_PLACE) {
                this.b.a().n();
            }
        }
        byop byopVar = (byop) this.l;
        byoq byoqVar = byopVar.a;
        if (byoqVar.aD) {
            gga ggaVar = byoqVar.aE;
            dbsk.s(ggaVar);
            ggaVar.g().f();
            if (i == 3) {
                return;
            }
            bypx bypxVar = byopVar.a.d;
            if (i != 1) {
                i2 = 4;
            }
            byoo byooVar = (byoo) bypxVar;
            byooVar.b(i2);
            byooVar.a.Z(bvjk.cC, byooVar.b.b());
            if (i == 1) {
                return;
            }
            byooVar.a.S(bvjk.cD, true);
        }
    }

    @Override // defpackage.bysf
    public cqkl a() {
        s(1);
        return cqkl.a;
    }

    @Override // defpackage.bysf
    public cqkl b() {
        s(2);
        return cqkl.a;
    }

    @Override // defpackage.bysf
    public cqkl c() {
        s(3);
        this.d.a().i(cjtd.a(this.f));
        return cqkl.a;
    }

    @Override // defpackage.bysf
    public cjtd i() {
        return cjtd.a(this.g);
    }

    @Override // defpackage.bysf
    public cjtd j() {
        return cjtd.a(this.h);
    }

    @Override // defpackage.bysf
    public cjtd k() {
        return cjtd.a(this.i);
    }

    @Override // defpackage.bysf
    /* renamed from: n */
    public String d() {
        return this.a.getString(this.j);
    }

    @Override // defpackage.bysf
    /* renamed from: o */
    public String e() {
        return this.a.getString(this.k);
    }

    @Override // defpackage.bysf
    /* renamed from: p */
    public String f() {
        return this.a.getString(R.string.HOME_ONLY_COMMUTE_NOTIFICATION_OPT_IN_BUTTON);
    }

    @Override // defpackage.bysf
    /* renamed from: q */
    public String g() {
        return this.a.getString(R.string.HOME_ONLY_COMMUTE_NOTIFICATION_OPT_OUT_BUTTON);
    }

    @Override // defpackage.bysf
    /* renamed from: r */
    public String h() {
        bvsi bvsiVar = new bvsi(this.a);
        bvsiVar.d(d());
        bvsiVar.d(e());
        return bvsiVar.toString();
    }
}
