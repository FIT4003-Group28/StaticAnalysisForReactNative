package defpackage;

import android.content.pm.ResolveInfo;
import android.widget.Toast;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: arqu  reason: default package */
/* loaded from: classes2.dex */
final class arqu implements arrf {
    public final gga a;
    public final bvjj b;
    public final btvo c;
    public final arri d;
    public final arvn e;
    public final aryb f;
    public final arxn<arxx> g;
    @dzsi
    public final arwa h;
    public final dbty<dcdn<arun, ResolveInfo>> i;
    final dbty<aryb> j;
    final dbty<dcdn<arun, ResolveInfo>> k;
    private final btrm l;
    @dzsi
    private final arvo m;
    private final asik n;
    private final dbty<aryb> o;
    private final cjyh p;

    public arqu(gga ggaVar, btrm btrmVar, bvjj bvjjVar, btvo btvoVar, arri arriVar, arvn arvnVar, aryb arybVar, arxn<arxx> arxnVar, @dzsi arwa arwaVar, @dzsi arvo arvoVar, asik asikVar, cjyh cjyhVar) {
        arqs arqsVar = new arqs(this);
        this.j = arqsVar;
        arqt arqtVar = new arqt(this);
        this.k = arqtVar;
        this.a = ggaVar;
        this.l = btrmVar;
        this.b = bvjjVar;
        this.c = btvoVar;
        this.d = arriVar;
        this.e = arvnVar;
        this.f = arybVar;
        this.g = arxnVar;
        this.h = arwaVar;
        this.m = arvoVar;
        this.n = asikVar;
        this.o = dbud.a(arqsVar);
        this.i = dbud.a(arqtVar);
        this.p = cjyhVar;
    }

    private final void u() {
        gga ggaVar = this.a;
        Toast.makeText(ggaVar, ggaVar.getResources().getString(R.string.ENABLE_MEDIA_CANCELLATION_TEXT), 1).show();
    }

    @Override // defpackage.arrf
    public final boolean a() {
        return s() && !((asio) this.n).b && !this.p.b();
    }

    @Override // defpackage.arrf
    public final boolean b() {
        return a() && this.b.m(bvjk.je, false);
    }

    @Override // defpackage.arrf
    /* renamed from: c */
    public final aryb t() {
        return this.o.a();
    }

    @Override // defpackage.arrf
    @dzsi
    public final CharSequence d() {
        String l = l();
        if (l == null) {
            return null;
        }
        return e(l);
    }

    @dzsi
    public final CharSequence e(String str) {
        return ((arxh) arxj.d(this.a, str)).a;
    }

    @Override // defpackage.arrf
    public final void f() {
        aryj g = t().g();
        if (g == null) {
            this.b.ac(bvjk.jf, null);
            return;
        }
        this.b.ac(bvjk.jf, g.c());
        if (!g.c().equals(p()) || m() || !n()) {
            this.d.f();
        } else {
            this.d.i();
        }
    }

    @Override // defpackage.arrf
    public final void g() {
        String z = this.b.z(bvjk.jf, null);
        if (z == null) {
            u();
        } else if (z.equals(p())) {
            this.d.j();
        } else {
            r();
        }
    }

    @Override // defpackage.arrf
    public final void h() {
        u();
    }

    @Override // defpackage.arrf
    public final void i() {
        r();
        this.l.b(new arvs(true));
    }

    @Override // defpackage.arrf
    public final void j() {
        u();
        this.l.b(new arvs(false));
    }

    public final dcdn<arun, ResolveInfo> k() {
        return this.i.a();
    }

    @dzsi
    public final String l() {
        return this.b.z(bvjk.jf, null);
    }

    public final boolean m() {
        arvo arvoVar;
        return this.c.getNavigationParameters().K().b && (arvoVar = this.m) != null && arvoVar.a();
    }

    public final boolean n() {
        arvo arvoVar;
        return this.c.getNavigationParameters().K().b && (arvoVar = this.m) != null && arvoVar.b();
    }

    public final boolean o() {
        arvo arvoVar = this.m;
        if (arvoVar == null) {
            return false;
        }
        if (!arvoVar.c()) {
            return m();
        }
        return m() || n();
    }

    @dzsi
    public final String p() {
        if (this.m != null) {
            return "com.spotify.music";
        }
        return null;
    }

    @Override // defpackage.arrf
    public final boolean q(dqvj dqvjVar) {
        return a() && !b() && s() && (m() || !this.i.a().isEmpty()) && dqvjVar == dqvj.DRIVE && !this.b.m(bvjk.jh, false) && this.b.s(bvjk.jg, 0) < 3;
    }

    public final void r() {
        this.b.S(bvjk.je, true);
        CharSequence d = d();
        if (d != null) {
            gga ggaVar = this.a;
            Toast.makeText(ggaVar, ggaVar.getResources().getString(R.string.ENABLE_MEDIA_CONFIRMATION_TEXT, d, d), 1).show();
        }
    }

    public final boolean s() {
        return this.c.getNavigationParameters().a.aH;
    }
}
