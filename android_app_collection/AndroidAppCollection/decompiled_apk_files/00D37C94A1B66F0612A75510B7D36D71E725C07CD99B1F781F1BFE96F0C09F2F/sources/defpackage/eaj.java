package defpackage;

import android.app.Activity;
import com.google.android.apps.youtube.app.settings.SettingsDataAccess;
/* compiled from: PG */
/* renamed from: eaj  reason: default package */
/* loaded from: classes3.dex */
public final class eaj implements amhp, axom {
    public final Activity a;
    public final dyo b;
    public azqb c;
    public azqb d;
    public azqb e;
    public azqb f;
    public azqb g;
    public azqb h;
    public azqb i;
    public azqb j;
    public azqb k;
    public azqb l;
    public azqb m;
    public azqb n;
    public azqb o;
    public azqb p;
    public azqb q;
    public azqb r;
    public final amhu s;
    private final eaq t;
    private final eak u;
    private final eaj v;

    public eaj(dyo dyoVar, eaq eaqVar, eak eakVar, Activity activity, amhu amhuVar) {
        this.v = this;
        this.b = dyoVar;
        this.t = eaqVar;
        this.u = eakVar;
        this.a = activity;
        this.s = amhuVar;
        this.c = axpb.a(new dwm(this, 0));
        this.d = new dwm(this, 2);
        this.e = axpb.a(new dwm(this, 4));
        this.f = axpb.a(new dwm(this, 5));
        this.g = axpb.a(new dwm(this, 6));
        this.h = axpb.a(new dwm(this, 7));
        this.i = axpb.a(new dwm(this, 9));
        this.j = axpb.a(new dwm(this, 8));
        this.k = new axos();
        this.l = new dwm(this, 12);
        this.m = axpb.a(new dwm(this, 11));
        this.n = axpb.a(new dwm(this, 10));
        this.o = axpb.a(new dwm(this, 13));
        this.p = axpb.a(new dwm(this, 14));
        this.q = axpb.a(new dwm(this, 15));
        this.r = new dwm(this, 3);
        axos.a(this.k, axot.b(new dwm(this, 1)));
    }

    public final Activity a() {
        Activity activity = this.a;
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException("Attempted use of the activity when it is null");
    }

    public final gtm b() {
        gtm bX = ((gsv) ((axon) ((amhu) this.c.get()).a()).lI()).bX();
        axzl.o(bX);
        return bX;
    }

    public final ibm c() {
        ibm cs = ((hyq) ((axon) ((amhu) this.c.get()).a()).lI()).cs();
        axzl.o(cs);
        return cs;
    }

    public final SettingsDataAccess d() {
        SettingsDataAccess dL = ((lgq) ((axon) ((amhu) this.c.get()).a()).lI()).dL();
        axzl.o(dL);
        return dL;
    }

    public final aafo e() {
        aafo gL = ((aafw) ((axon) ((amhu) this.c.get()).a()).lI()).gL();
        axzl.o(gL);
        return gL;
    }

    public final acth f() {
        acth hH = ((isg) ((axon) ((amhu) this.c.get()).a()).lI()).hH();
        axzl.o(hH);
        return hH;
    }

    public final acti g() {
        acti hL = ((isg) ((axon) ((amhu) this.c.get()).a()).lI()).hL();
        axzl.o(hL);
        return hL;
    }

    @Override // defpackage.amhp
    public final dwz h() {
        return new dwz(this.b, this.t, this.u, this.v);
    }

    public eaj() {
    }
}
