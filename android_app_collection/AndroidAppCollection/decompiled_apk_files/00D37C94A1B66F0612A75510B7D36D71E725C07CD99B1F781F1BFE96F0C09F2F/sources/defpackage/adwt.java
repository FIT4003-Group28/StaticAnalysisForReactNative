package defpackage;

import android.text.TextUtils;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
/* compiled from: PG */
/* renamed from: adwt  reason: default package */
/* loaded from: classes.dex */
public final class adwt implements adny {
    public static final String a = zep.a("MDX.WatchStateAggregator");
    public boolean b;
    public boolean c;
    public yiy d;
    public final ailf h;
    public adwj i;
    private boolean k;
    private final yni l;
    private final airw m;
    private final adwq p;
    private adnt q;
    private adwl r;
    final adws j = new adws(this, 1);
    final adws e = new adws(this);
    final adwp f = new adwp(this);
    final adwn g = new adwn(this);
    private final aypf n = new aypf();
    private final Set o = new CopyOnWriteArraySet();

    public adwt(yni yniVar, ailf ailfVar, airw airwVar, adwq adwqVar) {
        this.l = yniVar;
        this.m = airwVar;
        this.h = ailfVar;
        this.p = adwqVar;
        adwi a2 = adwj.a();
        a2.c = o();
        this.i = a2.a();
    }

    private static adwf o() {
        adwe a2 = adwf.a();
        a2.a = null;
        a2.b = null;
        a2.c(2);
        a2.b(-1);
        a2.c = null;
        return a2.a();
    }

    private static String p(adnt adntVar) {
        return adntVar.k().b();
    }

    private static String q(adnt adntVar) {
        if (adntVar == null) {
            return "session is null";
        }
        String U = adntVar.k() != null ? almu.U(adntVar.k().d()) : "n/a because MdxScreen is null";
        int a2 = adntVar.a();
        boolean ai = adntVar.ai();
        StringBuilder sb = new StringBuilder(U.length() + 72);
        sb.append("session type: ");
        sb.append(U);
        sb.append(", session state: ");
        sb.append(a2);
        sb.append(", was session restarted: ");
        sb.append(ai);
        return sb.toString();
    }

    public final void a(adwm adwmVar) {
        this.o.add(adwmVar);
    }

    public final void b(int i) {
        adnt adntVar;
        ylr.c();
        if (this.o.isEmpty()) {
            return;
        }
        if (i == 2 || ((adntVar = this.q) != null && adntVar.a() != 2)) {
            for (adwm adwmVar : this.o) {
                adwmVar.h(i, this.i);
            }
            return;
        }
        String str = a;
        StringBuilder sb = new StringBuilder(64);
        sb.append("session disconnected, not notifying property change: ");
        sb.append(i);
        zep.m(str, sb.toString());
    }

    public final void c(adwm adwmVar) {
        this.o.remove(adwmVar);
    }

    public final void d(CharSequence charSequence, avhn avhnVar) {
        boolean equals;
        avhn avhnVar2 = this.i.f.e;
        if (avhnVar2 == null) {
            equals = avhnVar == null;
        } else {
            equals = avhnVar2.equals(avhnVar);
        }
        if (!TextUtils.equals(charSequence, this.i.f.a) || !equals) {
            adwe b = this.i.f.b();
            b.a = charSequence;
            b.c = avhnVar;
            i(b);
            b(1);
        }
    }

    public final void e(String str) {
        if (!TextUtils.equals(str, this.i.l)) {
            adwi b = this.i.b();
            b.b(str);
            m(b);
        }
    }

    public final void f(int i) {
        adwj adwjVar = this.i;
        int i2 = adwjVar.a;
        if (i != i2) {
            adwi b = adwjVar.b();
            if (i2 == 2) {
                b.c = o();
                this.b = false;
            }
            b.e(i);
            m(b);
            b(0);
        }
    }

    public final void g(String str) {
        if (!TextUtils.equals(str, this.i.b)) {
            adwi b = this.i.b();
            b.a = str;
            m(b);
            b(1);
        }
    }

    public final void h(int i, int i2) {
        adwj adwjVar = this.i;
        if (i == adwjVar.e && i2 == adwjVar.d) {
            return;
        }
        adwi b = adwjVar.b();
        b.c(i);
        b.g(i2);
        m(b);
        b(3);
    }

    public final void i(adwe adweVar) {
        adwi b = this.i.b();
        b.c = adweVar.a();
        m(b);
    }

    @Override // defpackage.adny
    public final void j(adnt adntVar) {
        adnt adntVar2 = this.q;
        if (adntVar2 != adntVar) {
            int i = this.i.j;
            String q = q(adntVar2);
            String q2 = q(adntVar);
            StringBuilder sb = new StringBuilder(String.valueOf(q).length() + 266 + String.valueOf(q2).length());
            sb.append("The previously stored mdxSession did not match the session passed in as connected.Previous connection state: ");
            sb.append(i);
            sb.append(" | Previous session info - ");
            sb.append(q);
            sb.append(" | Current session info - ");
            sb.append(q2);
            sb.append(" | Ignoring previous session, since the current session is now what the user is connected to.");
            afus.b(1, 21, sb.toString());
            this.q = adntVar;
        }
        adwi b = this.i.b();
        b.d(adntVar.a());
        b.b = p(adntVar);
        m(b);
        b(2);
    }

    @Override // defpackage.adny
    public final void k(adnt adntVar) {
        adwi a2 = adwj.a();
        a2.d(adntVar.a());
        a2.c = o();
        m(a2);
        adnt adntVar2 = this.q;
        if (adntVar2 != null) {
            adntVar2.N(this.r);
            this.q = null;
        }
        yiy yiyVar = this.d;
        if (yiyVar != null) {
            yiyVar.d();
            this.d = null;
        }
        b(2);
        if (this.k) {
            this.n.c();
            this.l.m(this.g);
            this.p.b(this.f);
            this.k = false;
        }
    }

    @Override // defpackage.adny
    public final void l(adnt adntVar) {
        if (!this.k) {
            this.n.g(this.j.g(this.m));
            this.n.g(this.e.g(this.m));
            this.l.g(this.g);
            this.p.a(this.f);
            this.k = true;
        }
        adwi b = this.i.b();
        b.d(adntVar.a());
        b.b = p(adntVar);
        m(b);
        this.q = adntVar;
        if (this.r == null) {
            this.r = new adwl(this);
        }
        this.q.z(this.r);
        b(2);
    }

    public final void m(adwi adwiVar) {
        this.i = adwiVar.a();
    }
}
