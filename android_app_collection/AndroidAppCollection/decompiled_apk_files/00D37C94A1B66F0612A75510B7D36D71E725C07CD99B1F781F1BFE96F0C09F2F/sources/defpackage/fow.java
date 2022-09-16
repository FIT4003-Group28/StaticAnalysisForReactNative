package defpackage;

import android.os.Handler;
import android.text.TextUtils;
import java.util.PriorityQueue;
import java.util.Queue;
/* compiled from: PG */
/* renamed from: fow  reason: default package */
/* loaded from: classes3.dex */
public final class fow implements ezg, airt, fqc, ynl {
    final Runnable a;
    public final Queue b;
    public String c;
    long d;
    long e;
    public String f;
    String g;
    boolean h;
    private final yni i;
    private final Handler j;
    private final snc k;
    private final ezh l;
    private final aypf m;
    private final airw n;
    private final aacz o;

    public fow(yni yniVar, snc sncVar, ezh ezhVar, Handler handler, airw airwVar, aacz aaczVar, fqd fqdVar) {
        yniVar.getClass();
        this.i = yniVar;
        sncVar.getClass();
        this.k = sncVar;
        this.j = handler;
        ezhVar.getClass();
        this.l = ezhVar;
        airwVar.getClass();
        this.n = airwVar;
        aaczVar.getClass();
        this.o = aaczVar;
        this.m = new aypf();
        this.b = new PriorityQueue();
        this.a = new Runnable() { // from class: fot
            @Override // java.lang.Runnable
            public final void run() {
                fow fowVar = fow.this;
                fowVar.h = false;
                while (true) {
                    if (!fowVar.b.isEmpty()) {
                        if (!fowVar.j() || fowVar.c() < ((fov) fowVar.b.peek()).b) {
                            break;
                        }
                        ((fov) fowVar.b.poll()).g(fowVar.f);
                    } else {
                        fowVar.c = null;
                        break;
                    }
                }
                fowVar.i();
            }
        };
        this.e = -1L;
        if (fqdVar.b) {
            b();
        }
        fqdVar.g(this);
    }

    private final void k() {
        if (this.h) {
            this.j.removeCallbacks(this.a);
            this.h = false;
        }
    }

    private final boolean l() {
        ezx g = this.l.g();
        return g != null && g.f() && !g.b();
    }

    @Override // defpackage.fqc
    public final void a() {
        if (eog.aq(this.o)) {
            this.m.c();
        } else {
            this.i.m(this);
        }
        this.l.j(this);
    }

    @Override // defpackage.fqc
    public final void b() {
        if (eog.aq(this.o)) {
            this.m.g(g(this.n));
        } else {
            this.i.g(this);
        }
        this.l.i(this);
    }

    public final long c() {
        return this.d + (this.e == -1 ? 0L : this.k.c() - this.e);
    }

    public final void d() {
        this.b.clear();
        this.c = null;
    }

    public final void e(ahhw ahhwVar) {
        if (ahhwVar.c() == aika.VIDEO_PLAYING) {
            String B = ahhwVar.b().B();
            this.f = B;
            if (!B.equals(this.g)) {
                this.d = 0L;
                this.g = this.f;
            }
            i();
            return;
        }
        this.f = null;
        this.e = -1L;
        k();
    }

    @Override // defpackage.airt
    public final aypg[] g(airw airwVar) {
        return new aypg[]{airwVar.G().b.aa(new fos(this, 1), dzq.q), airwVar.G().j.aa(new fos(this), dzq.q)};
    }

    public final void h(ahia ahiaVar) {
        if (TextUtils.isEmpty(this.f)) {
            return;
        }
        this.d = c();
        this.e = ahiaVar.a() == 2 ? this.k.c() : -1L;
        i();
    }

    public final void i() {
        k();
        if (!j() || this.e == -1 || this.b.isEmpty()) {
            return;
        }
        this.j.postDelayed(this.a, Math.max(0L, ((fov) this.b.peek()).b - c()));
        this.h = true;
    }

    public final boolean j() {
        String str = this.f;
        if (str == null || str.equals(this.c)) {
            return l();
        }
        d();
        return false;
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                e((ahhw) obj);
                return null;
            } else if (i == 1) {
                h((ahia) obj);
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{ahhw.class, ahia.class};
    }

    @Override // defpackage.ezg
    public final void pa(ezx ezxVar) {
        if (!l()) {
            k();
        } else if (this.h) {
        } else {
            i();
        }
    }

    @Override // defpackage.ezg
    public final /* synthetic */ void pb(ezx ezxVar, ezx ezxVar2) {
        hqb.m(this, ezxVar2);
    }
}
