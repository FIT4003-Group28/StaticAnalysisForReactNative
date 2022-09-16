package defpackage;

import android.view.View;
import com.google.android.youtube.R;
import j$.util.Optional;
/* compiled from: PG */
/* renamed from: izo  reason: default package */
/* loaded from: classes3.dex */
public final class izo implements adny, ezg, izm, iyt {
    public static final /* synthetic */ int b = 0;
    Optional a;
    private final dt c;
    private final adoa d;
    private final ocz e;
    private final ezh f;
    private final azpx g;
    private final ayoi h;
    private final amqo i;
    private boolean j;
    private dp k;

    static {
        zep.a("MDX.LazyInitializer");
    }

    public izo(dt dtVar, adoa adoaVar, ocz oczVar, ezh ezhVar) {
        izn iznVar = new izn();
        azpm aI = azpm.aI(Optional.empty());
        this.g = aI;
        this.h = aI.af(iyw.c);
        this.j = true;
        dtVar.getClass();
        this.c = dtVar;
        adoaVar.getClass();
        this.d = adoaVar;
        oczVar.getClass();
        this.e = oczVar;
        this.i = iznVar;
        this.f = ezhVar;
        this.a = Optional.empty();
    }

    private final View h() {
        return this.c.findViewById(R.id.mdx_fragment_container);
    }

    private final synchronized void i() {
        if (this.j) {
            return;
        }
        if (this.d.e() != null) {
            if (g() == null) {
                aqxo.y(g() == null);
                Object obj = this.i.get();
                this.k = (dp) obj;
                ex l = this.c.getSupportFragmentManager().l();
                l.q(R.id.mdx_fragment_container, (dp) obj, "MdxWatchFragment");
                l.d();
                dp dpVar = this.k;
                if (dpVar instanceof izl) {
                    this.g.c(Optional.of((izl) dpVar));
                }
            }
            dp g = g();
            if (this.a.isPresent() && (g instanceof izl)) {
                ((izl) g).o(((fqj) this.a.get()).a);
            }
        }
    }

    private final void m() {
        if (!this.j && this.d.e() == null && g() != null) {
            dp g = g();
            g.getClass();
            ex l = this.c.getSupportFragmentManager().l();
            l.m(g);
            l.d();
            this.k = null;
            this.g.c(Optional.empty());
        }
    }

    @Override // defpackage.iyt
    public final ayoi a() {
        return this.h;
    }

    @Override // defpackage.izm
    public final void b() {
        this.d.g(this);
        this.f.i(this);
    }

    @Override // defpackage.izm
    public final void c() {
        this.d.i(this);
        this.f.j(this);
    }

    @Override // defpackage.izm
    public final void d() {
        this.j = true;
    }

    @Override // defpackage.izm
    public final void e() {
        this.j = false;
        i();
        m();
    }

    @Override // defpackage.izm
    public final void f(int i) {
        if (!this.a.isPresent()) {
            this.a = Optional.of(new fqj());
        }
        ((fqj) this.a.get()).c(0, i);
        View h = h();
        izl izlVar = (izl) g();
        if (izlVar == null || h == null || h.getVisibility() != 0) {
            return;
        }
        izlVar.o(((fqj) this.a.get()).a);
    }

    final dp g() {
        if (this.k == null) {
            this.k = this.c.getSupportFragmentManager().f("MdxWatchFragment");
        }
        return this.k;
    }

    @Override // defpackage.adny
    public final void j(adnt adntVar) {
    }

    @Override // defpackage.adny
    public final void k(adnt adntVar) {
        m();
        this.e.b(false);
    }

    @Override // defpackage.adny
    public final void l(adnt adntVar) {
        i();
        this.e.b(true);
    }

    @Override // defpackage.ezg
    public final /* synthetic */ void pa(ezx ezxVar) {
    }

    @Override // defpackage.ezg
    public final void pb(ezx ezxVar, ezx ezxVar2) {
        View h;
        if (ezxVar == ezxVar2 || (h = h()) == null) {
            return;
        }
        h.setVisibility(ezxVar2 == ezx.WATCH_WHILE_MAXIMIZED ? 0 : 8);
    }
}
