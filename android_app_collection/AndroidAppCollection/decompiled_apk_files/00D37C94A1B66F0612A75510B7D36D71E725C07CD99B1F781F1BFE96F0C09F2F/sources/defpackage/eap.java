package defpackage;

import android.app.Service;
import android.content.Context;
import com.google.android.libraries.elements.interfaces.JSEnvironment;
import com.google.android.libraries.youtube.livecreation.screencast.ScreencastHostService;
import java.util.Map;
/* compiled from: PG */
/* renamed from: eap  reason: default package */
/* loaded from: classes3.dex */
public final class eap implements axom {
    public azqb A;
    public azqb B;
    public azqb C;
    public azqb D;
    public azqb E;
    public azqb F;
    public azqb G;
    public azqb H;
    public azqb I;

    /* renamed from: J  reason: collision with root package name */
    private final Service f202J;
    private azqb K;
    private azqb L;
    private azqb M;
    private azqb N;
    private azqb O;
    private final eap P;
    public final dyo a;
    public azqb b;
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
    public azqb s;
    public azqb t;
    public azqb u;
    public azqb v;
    public azqb w;
    public azqb x;
    public azqb y;
    public azqb z;

    public eap(dyo dyoVar, Service service) {
        this.P = this;
        this.a = dyoVar;
        this.f202J = service;
        this.b = axpb.a(new dxr(this, 1));
        this.c = new dxr(this, 0);
        this.d = axot.b(new dxr(this, 3));
        this.e = axot.b(new dxr(this, 4));
        this.f = new dxr(this, 5);
        this.g = new dxr(this, 6);
        this.h = axot.b(new dxr(this, 7));
        this.i = new axos();
        this.j = new axos();
        this.k = new dxr(this, 13);
        axos.a(this.j, new dxr(this, 12));
        this.K = new dxr(this, 11);
        this.l = axpb.a(new dxr(this, 14));
        this.m = new dxr(this, 15);
        this.n = new dxr(this, 16);
        dxr dxrVar = new dxr(this, 10);
        this.L = dxrVar;
        axos.a(this.i, axpb.a(dxrVar));
        dxr dxrVar2 = new dxr(this, 9);
        this.M = dxrVar2;
        this.o = axpb.a(dxrVar2);
        this.N = axpb.a(new dxr(this, 17));
        this.p = new dxr(this, 19);
        this.q = new dxr(this, 18);
        this.r = new dxr(this, 20);
        this.s = axpb.a(new dxr(this, 22));
        this.t = axpb.a(new dxr(this, 21));
        dxr dxrVar3 = new dxr(this, 8);
        this.O = dxrVar3;
        this.u = axpb.a(dxrVar3);
        this.v = new dxr(this, 23);
        this.w = new dxr(this, 24);
        this.x = new dxr(this, 2);
        this.y = new dxr(this, 25);
        this.z = new dxr(this, 26);
        this.A = new dxr(this, 27);
        this.B = new dxr(this, 28);
        this.C = axot.b(new dxr(this, 30));
        this.D = axot.b(new dxr(this, 29));
        this.E = new dxr(this, 31);
        this.F = new dxr(this, 32);
        this.G = new dxr(this, 34);
        this.H = new dxr(this, 35);
        this.I = new dxr(this, 33);
    }

    public static Map n() {
        return sza.h(ampq.j(amyc.b));
    }

    public final szk a() {
        return sza.f(k());
    }

    public final szt b() {
        return new szt(sza.q(ampq.j((JSEnvironment) this.a.ek.get())), this.a.yZ, axot.a(this.i));
    }

    public final tdf c() {
        return svo.c(ampq.j((tdf) this.N.get()));
    }

    public final teb d() {
        return tfq.a(amon.a, ampq.j((Boolean) this.a.dR.get()), axot.a(this.K));
    }

    public final tfj e() {
        return tfq.e(amon.a, d());
    }

    public final tfy f() {
        return new tfy(d());
    }

    public final abjy g() {
        return new abjy((aadd) this.a.K.get());
    }

    public final abka h() {
        return new abka((aadd) this.a.K.get());
    }

    public final ScreencastHostService i() {
        ScreencastHostService screencastHostService = (ScreencastHostService) this.f202J;
        axzl.o(screencastHostService);
        return screencastHostService;
    }

    public final acth j() {
        return new kge(this.a.cI(), 4);
    }

    public final ayor k() {
        return tfq.d(ampq.j((ayor) this.a.aq.get()));
    }

    public final String l() {
        return sza.n(ampq.j(this.a.hx()));
    }

    public final Map m() {
        amum i = amup.i(7);
        i.f(axml.class, svo.o());
        i.f(axna.class, svo.s());
        i.f(axmt.class, svo.r((tcu) this.i.get(), f(), ampq.j(Boolean.valueOf(this.a.iL()))));
        i.f(axne.class, sza.b(ampq.j(Boolean.valueOf(this.a.iy()))));
        i.f(axni.class, sza.d(amup.k(axmo.class, sza.u()), amyc.b, ampq.j(Boolean.valueOf(this.a.iK())), d()));
        i.f(axnd.class, svo.t(amup.l(axms.class, svo.u((tcu) this.i.get(), f()), axmx.class, svo.k((tcu) this.i.get(), f())), amyc.b, d()));
        i.f(axnl.class, sza.e(d()));
        return i.b();
    }

    public final void o() {
        Context context = this.a.b.a;
    }

    public eap() {
    }
}
