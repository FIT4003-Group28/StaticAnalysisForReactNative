package defpackage;

import android.content.Context;
import java.io.PrintWriter;
import java.util.Collection;
/* compiled from: PG */
/* renamed from: ncf  reason: default package */
/* loaded from: classes7.dex */
public class ncf implements nce {
    public final Context a;
    public final ldm b;
    public int c;
    private final Collection<ncd> d = dcnm.c();

    public ncf(Context context, ldm ldmVar) {
        this.a = context;
        dbsk.s(ldmVar);
        this.b = ldmVar;
    }

    private final void v(boolean z) {
        for (ncd ncdVar : this.d) {
            ncdVar.a(z);
        }
    }

    @Override // defpackage.btph
    public final void NX(String str, PrintWriter printWriter) {
    }

    @Override // defpackage.nce
    public final int a() {
        return this.b.m();
    }

    @Override // defpackage.nce
    public final int b(int i) {
        dgas x;
        amve t = t(i);
        if (t.e() > 1) {
            x = vyb.y(t);
        } else {
            x = vyb.x(t);
        }
        if (x == null || (1 & x.a) == 0) {
            return 0;
        }
        return x.b;
    }

    @Override // defpackage.nce
    public final int d(int i) {
        amve t = t(i);
        dpec b = t.b();
        if (t.e() > 1) {
            b = t.d(0).a();
        }
        dowb dowbVar = b.d;
        if (dowbVar == null) {
            dowbVar = dowb.d;
        }
        if ((dowbVar.a & 1) != 0) {
            dowb dowbVar2 = b.d;
            if (dowbVar2 == null) {
                dowbVar2 = dowb.d;
            }
            return dowbVar2.b;
        }
        return 0;
    }

    @Override // defpackage.nce
    @dzsi
    public final dowa e(int i) {
        dpec b = t(i).b();
        dowb dowbVar = b.d;
        if (dowbVar == null) {
            dowbVar = dowb.d;
        }
        if ((dowbVar.a & 4) != 0) {
            dowb dowbVar2 = b.d;
            if (dowbVar2 == null) {
                dowbVar2 = dowb.d;
            }
            dowa b2 = dowa.b(dowbVar2.c);
            return b2 == null ? dowa.REGIONAL : b2;
        }
        return null;
    }

    @Override // defpackage.nce
    @dzsi
    public final String f(int i) {
        amve t = t(i);
        if (t.e() > 1) {
            return vyb.g(t);
        }
        return vyb.f(t);
    }

    @Override // defpackage.nce
    public final boolean g(int i) {
        amve t = t(i);
        if (t.e() > 1) {
            return vyb.q(t);
        }
        return vyb.o(t);
    }

    @Override // defpackage.nce
    public final boolean h(int i) {
        amve t = t(i);
        if (t.e() > 1) {
            return vyb.s(t);
        }
        return vyb.r(t);
    }

    @Override // defpackage.nce
    public final boolean i(int i) {
        amsy amsyVar;
        amte l = this.b.l();
        if (l == null || (amsyVar = l.a) == null) {
            return false;
        }
        return amsyVar.d();
    }

    @Override // defpackage.nce
    public final boolean j() {
        qbm qbmVar = this.b.f;
        return qbmVar != null && qbmVar.b();
    }

    @dzsi
    public final amuh k() {
        amte l = this.b.l();
        if (l == null) {
            return null;
        }
        return amuh.g(l, this.a, this.c);
    }

    @Override // defpackage.nce
    public final dpej l(int i) {
        return vyb.d(this.b.n(i));
    }

    @Override // defpackage.nce
    public final int m() {
        return this.c;
    }

    @Override // defpackage.nce
    public final void n(int i) {
        boolean z = true;
        dbsk.a(i >= 0);
        if (i >= a()) {
            z = false;
        }
        dbsk.a(z);
        if (i == this.c) {
            return;
        }
        this.c = i;
        ldm ldmVar = this.b;
        ldmVar.i = ldmVar.n(i).x();
        v(false);
    }

    @Override // defpackage.nce
    public final int o() {
        return this.c;
    }

    @Override // defpackage.nce
    public final void p(int i) {
        n(i);
    }

    @Override // defpackage.nce
    public final void q(ncd ncdVar) {
        Collection<ncd> collection = this.d;
        dbsk.s(ncdVar);
        collection.add(ncdVar);
    }

    @Override // defpackage.nce
    public final void r(ncd ncdVar) {
        dbsk.a(this.d.remove(ncdVar));
    }

    public final void s() {
        this.c = 0;
        v(true);
    }

    @Override // defpackage.nce
    public final amve t(int i) {
        return this.b.n(i);
    }

    @Override // defpackage.nce
    public final /* bridge */ /* synthetic */ CharSequence u(int i) {
        dbsg<doxk> p = vyb.p(t(i));
        return (!p.a() || p.b().a.size() <= 0) ? "" : p.b().a.get(0);
    }
}
