package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
import java.io.PrintWriter;
/* compiled from: PG */
/* renamed from: kea  reason: default package */
/* loaded from: classes7.dex */
public final class kea implements SharedPreferences.OnSharedPreferenceChangeListener, btph {
    private static final alag l = new alag();
    public final bvjj b;
    public final kxb c;
    public final btrm d;
    public final Runnable e;
    public final dxio<ahjq> f;
    @dzsi
    public crqf g;
    private final aufc m;
    private final arbu n;
    public final kdy a = new kdy(this);
    @dzsi
    public crhp h = null;
    @dzsi
    public eapd i = null;
    @dzsi
    public eapd j = null;
    @dzsi
    public eapd k = null;

    public kea(dxio<ahjq> dxioVar, bvjj bvjjVar, kxb kxbVar, btrm btrmVar, aufc aufcVar, Context context) {
        dbsk.s(dxioVar);
        this.f = dxioVar;
        this.b = bvjjVar;
        dbsk.s(kxbVar);
        this.c = kxbVar;
        this.d = btrmVar;
        dbsk.s(aufcVar);
        this.m = aufcVar;
        arbu l2 = kxbVar.l();
        dbsk.s(l2);
        this.n = l2;
        this.e = new kdz(this);
        dbsk.s(context);
    }

    public static String a(@dzsi eapd eapdVar) {
        return eapdVar == null ? "never" : eapdVar.c().toString();
    }

    static alae g(float f, kxb kxbVar) {
        Point i = kxbVar.j().i();
        Rect b = kxbVar.j().b();
        return alae.a(b.left + (b.width() * 0.5f), b.top + (b.height() * ((f + 1.0f) / 2.0f)), i.x, i.y);
    }

    private final alai h() {
        this.f.a().a();
        alaf a = alai.a();
        a.a = l;
        a.c = 60.0f;
        a.b = 16.0f;
        a.e = g(0.7f, this.c);
        a.f = alah.LOCATION_AND_BEARING;
        return a.a();
    }

    private final alai i() {
        alaf a = alai.a();
        a.a = l;
        a.c = 0.0f;
        a.b = 16.0f;
        a.e = this.c.j().m();
        a.f = alah.LOCATION_ONLY;
        return a.a();
    }

    @Override // defpackage.btph
    public final void NX(String str, PrintWriter printWriter) {
        throw null;
    }

    public final void b() {
        this.c.m().h();
        this.g = null;
        this.j = eapd.a();
    }

    public final void d(amuh amuhVar, cray crayVar) {
        vut I = vuv.I();
        I.v(true);
        I.A(amuhVar);
        I.o(amuhVar.k().ag());
        ((vur) I).a = crayVar.b;
        I.E(false);
        I.H(albo.a);
        I.Q(alfa.SHOW_ALTERNATES_ONLY);
        I.G(true);
        this.c.m().e(I.O());
        this.k = eapd.a();
    }

    public final void e() {
        this.m.e((aufa) this.b.H(bvjk.aT, aufa.class, aufa.AUTO));
    }

    public final void f() {
        dhjt dhjtVar = ((dhjv) this.b.L(bvjk.aV, (dssr) dhjv.c.cu(7), dhjv.c)).b;
        if (dhjtVar == null) {
            dhjtVar = dhjt.d;
        }
        int i = dhjtVar.b;
        int i2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? 0 : 5 : 4 : 3 : 2;
        if (i2 == 0) {
            i2 = 1;
        }
        dpen dpenVar = dpen.UNKNOWN_STYLE;
        int i3 = i2 - 2;
        if (i3 == 1) {
            this.n.j(h(), false);
        } else if (i3 == 2) {
            this.n.j(i(), false);
        } else if (i3 != 3) {
            arbu arbuVar = this.n;
            GmmLocation a = this.f.a().a();
            arbuVar.j((a != null && a.hasBearing()) ? h() : i(), false);
        } else {
            arbu arbuVar2 = this.n;
            alaf a2 = alai.a();
            a2.a = l;
            a2.c = 0.0f;
            a2.b = 16.0f;
            a2.e = g(0.5f, this.c);
            a2.f = alah.LOCATION_AND_BEARING;
            arbuVar2.j(a2.a(), false);
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (str.equals(bvjk.aV.toString())) {
            f();
        }
        if (str.equals(bvjk.aT.toString())) {
            e();
        }
    }
}
