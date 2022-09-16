package defpackage;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Pair;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: agzh  reason: default package */
/* loaded from: classes.dex */
public final class agzh implements agxs {
    public static final CountDownLatch a = new CountDownLatch(0);
    private static final Pair k = new Pair("", 17);
    private aypg A;
    protected volatile String b;
    public final Map c = new HashMap();
    public final Context d;
    public final azqb e;
    public final azqb f;
    public final agro g;
    public agyb h;
    protected boolean i;
    public CountDownLatch j;
    private final Executor l;
    private final azqb m;
    private final SharedPreferences n;
    private final agyc o;
    private final agpn p;
    private final agxd q;
    private final Executor r;
    private final agyz s;
    private final agvn t;
    private final String u;
    private final ahdf v;
    private agyy w;
    private Set x;
    private Executor y;
    private agzg z;

    public agzh(Context context, Executor executor, azqb azqbVar, azqb azqbVar2, azqb azqbVar3, SharedPreferences sharedPreferences, agyc agycVar, agpn agpnVar, agxd agxdVar, Executor executor2, agyz agyzVar, agvn agvnVar, String str, agro agroVar, ahdf ahdfVar) {
        this.d = context;
        this.l = executor;
        this.m = azqbVar;
        this.e = azqbVar2;
        this.f = azqbVar3;
        this.n = sharedPreferences;
        this.o = agycVar;
        this.p = agpnVar;
        this.q = agxdVar;
        this.r = executor2;
        this.s = agyzVar;
        this.t = agvnVar;
        this.u = str;
        this.g = agroVar;
        this.v = ahdfVar;
    }

    private final void q(zdt zdtVar) {
        for (agxf agxfVar : this.x) {
            if (agxfVar != null) {
                zdtVar.a(agxfVar);
            }
        }
    }

    private final void r() {
        agxg.B(this.n, ((agrf) this.e.get()).d(), true);
    }

    public final void b() {
        agyb agybVar = this.h;
        if (agybVar != null) {
            agybVar.o(((agvq) this.m.get()).w());
        }
    }

    @Override // defpackage.agxs
    public final void c(boolean z) {
        agyb agybVar = this.h;
        if (agybVar != null && agybVar.e() <= 0) {
            q(aclb.k);
            if (this.v.f()) {
                try {
                    Class<?> cls = Class.forName(this.u);
                    Context context = this.d;
                    context.stopService(new Intent(context, cls));
                } catch (ClassNotFoundException unused) {
                    String str = this.u;
                    zep.b(str.length() != 0 ? "[Offline] Cannot find class: ".concat(str) : new String("[Offline] Cannot find class: "));
                    return;
                }
            }
            agyb agybVar2 = this.h;
            if (agybVar2 != null) {
                agybVar2.j();
            }
            CountDownLatch countDownLatch = this.j;
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
            this.h = null;
            agzg agzgVar = this.z;
            if (agzgVar != null) {
                this.n.unregisterOnSharedPreferenceChangeListener(agzgVar);
            }
            if (z) {
                agxg.B(this.n, ((agrf) this.e.get()).d(), false);
            }
            aypg aypgVar = this.A;
            if (aypgVar == null) {
                return;
            }
            azof.f((AtomicReference) aypgVar);
            this.A = null;
        }
    }

    @Override // defpackage.agxs
    public final void d(Map map) {
        this.i = true;
        q(aclb.j);
        for (agqz agqzVar : map.values()) {
            if (agqzVar.c()) {
                r();
                return;
            }
        }
    }

    @Override // defpackage.agxs
    public final void e(agqz agqzVar) {
        this.c.put(agqzVar.a, agqzVar);
        q(new agze(agqzVar, 1));
        r();
    }

    @Override // defpackage.agxs
    public final void f(agqz agqzVar) {
        this.c.put(agqzVar.a, agqzVar);
        q(new agze(agqzVar));
    }

    @Override // defpackage.agxs
    public final void g(final agqz agqzVar, final boolean z) {
        this.c.put(agqzVar.a, agqzVar);
        q(new agze(agqzVar, 2));
        this.y.execute(new Runnable() { // from class: agzd
            @Override // java.lang.Runnable
            public final void run() {
                agzh.this.n(agqzVar, z);
            }
        });
    }

    @Override // defpackage.agxs
    public final void h(agqz agqzVar) {
        this.c.remove(agqzVar.a);
        q(new agze(agqzVar, 3));
        if (agxg.ai(agqzVar) && agqzVar.a.equals(this.b)) {
            this.b = null;
        }
        this.y.execute(new agzc(this, agqzVar, 1));
    }

    @Override // defpackage.agxs
    public final void i(agqz agqzVar) {
        this.c.put(agqzVar.a, agqzVar);
        q(new agze(agqzVar, 4));
    }

    @Override // defpackage.agxs
    public final void j(agqz agqzVar) {
        this.c.put(agqzVar.a, agqzVar);
        q(new agze(agqzVar, 5));
    }

    @Override // defpackage.agxs
    public final void k(agqz agqzVar) {
        this.c.put(agqzVar.a, agqzVar);
        q(new agze(agqzVar, 6));
    }

    @Override // defpackage.agxs
    public final void l(final agqz agqzVar, final atsg atsgVar, final agqe agqeVar) {
        this.c.put(agqzVar.a, agqzVar);
        q(new zdt() { // from class: agzf
            @Override // defpackage.zdt
            public final void a(Object obj) {
                agqz agqzVar2 = agqz.this;
                atsg atsgVar2 = atsgVar;
                agqe agqeVar2 = agqeVar;
                agxf agxfVar = (agxf) obj;
                CountDownLatch countDownLatch = agzh.a;
                agxfVar.getClass();
                agxfVar.k(agqzVar2, atsgVar2, agqeVar2);
            }
        });
        if (agxg.ai(agqzVar)) {
            if (agqzVar.b == avkl.TRANSFER_STATE_COMPLETE) {
                if (agqzVar.a.equals(this.b)) {
                    this.b = null;
                }
            } else if (agqzVar.b == avkl.TRANSFER_STATE_TRANSFERRING) {
                this.b = agqzVar.a;
            }
        }
        this.y.execute(new agzc(this, agqzVar));
    }

    @Override // defpackage.agxs
    public final void m(agqz agqzVar) {
        this.c.put(agqzVar.a, agqzVar);
        q(new agze(agqzVar, 7));
    }

    public final void n(agqz agqzVar, boolean z) {
        ((agrn) this.f.get()).C(agqzVar, z);
    }

    public final void o(agxf agxfVar) {
        Set set = this.x;
        agxfVar.getClass();
        if (!set.add(agxfVar) || !this.i) {
            return;
        }
        agxfVar.g();
    }

    public final boolean p(Notification notification) {
        if (this.g.b().contains(k)) {
            this.g.d(null, 17, notification);
            return true;
        }
        return false;
    }

    public final agxt a() {
        agyc agycVar = this.o;
        agpn agpnVar = this.p;
        agxd agxdVar = this.q;
        Executor executor = this.r;
        agyz agyzVar = this.s;
        agvn agvnVar = this.t;
        String str = this.u;
        if (this.h == null) {
            this.j = new CountDownLatch(1);
            agyy agyyVar = new agyy(this, executor);
            this.w = agyyVar;
            this.h = agycVar.a(agyyVar, str, agyzVar);
            this.l.execute(new Runnable() { // from class: agzb
                @Override // java.lang.Runnable
                public final void run() {
                    agzh agzhVar = agzh.this;
                    String d = ((agrf) agzhVar.e.get()).d();
                    if (agzhVar.h == null || "NO_OP_STORE_TAG".equals(d)) {
                        return;
                    }
                    agzhVar.h.l(d);
                }
            });
            this.x = new CopyOnWriteArraySet();
            agzg agzgVar = new agzg(this);
            this.z = agzgVar;
            this.n.registerOnSharedPreferenceChangeListener(agzgVar);
            this.A = agvnVar.a(new ayqb() { // from class: agza
                @Override // defpackage.ayqb
                public final void a(Object obj) {
                    agzh.this.b();
                }
            });
            b();
            o(agpnVar);
            o(agxdVar);
            this.y = executor;
            agyy agyyVar2 = this.w;
            if (agyyVar2 != null) {
                agyyVar2.b = executor;
            }
        }
        agyb agybVar = this.h;
        agybVar.getClass();
        return agybVar;
    }
}
