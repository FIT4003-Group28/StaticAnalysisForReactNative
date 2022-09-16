package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.text.TextUtils;
import java.util.Collection;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: PG */
/* renamed from: agio  reason: default package */
/* loaded from: classes.dex */
public final class agio implements agvx, agis, ynl {
    public final azqb A;
    public final azqb B;
    public final azqb C;
    public final azqb D;
    public final azqb E;
    public final azqb F;
    public final azpx G;
    public final axwu H;
    public final String I;

    /* renamed from: J  reason: collision with root package name */
    public boolean f44J;
    public final amfb K;
    public final aglj L;
    private final agxf M;
    public final Handler a;
    public final yni b;
    public final SharedPreferences c;
    public final azqb d;
    public final aguv e;
    public final agxc f;
    public final aggo g;
    public final agrn h;
    public final ScheduledExecutorService i;
    public final ScheduledExecutorService j;
    public final Executor k;
    public final agyr l;
    public final azqb m;
    public final aghf n;
    public final agkb o;
    public final agme p;
    public final agmr q;
    public final agli r;
    public final azqb s;
    public final aghc t;
    public final azqb u;
    public final azqb v;
    public final azqb w;
    public final azqb x;
    public final azqb y;
    public final azqb z;

    public agio(Context context, afvm afvmVar) {
        Boolean bool;
        String d = afvmVar.d();
        zgh.m(d);
        this.I = d;
        dwt iR = ((agip) zew.F(context, agip.class)).iR();
        iR.b = d;
        iR.c = afvmVar;
        iR.d = this;
        axzl.n(iR.b, String.class);
        axzl.n(iR.c, afvm.class);
        axzl.n(iR.d, agis.class);
        dwv dwvVar = new dwv(iR.a, iR.b, iR.c, iR.d);
        this.a = (Handler) dwvVar.d.an.get();
        snc sncVar = (snc) dwvVar.d.v.get();
        this.b = (yni) dwvVar.d.y.get();
        this.c = (SharedPreferences) dwvVar.d.t.get();
        aadd aaddVar = (aadd) dwvVar.d.K.get();
        aacz aaczVar = (aacz) dwvVar.d.D.get();
        dyo dyoVar = dwvVar.d;
        this.d = dyoVar.hf;
        this.e = (aguv) dyoVar.kY.get();
        this.f = (agxc) dwvVar.d.mJ.get();
        this.g = (aggo) dwvVar.d.mK.get();
        agrn agrnVar = (agrn) dwvVar.d.lv.get();
        this.h = agrnVar;
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) dwvVar.d.h.get();
        this.i = scheduledExecutorService;
        ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) dwvVar.d.Q.get();
        this.j = scheduledExecutorService2;
        this.k = (Executor) dwvVar.d.lA.get();
        this.l = (agyr) dwvVar.d.kS.get();
        dyo dyoVar2 = dwvVar.d;
        this.m = dyoVar2.mN;
        agkr agkrVar = (agkr) dyoVar2.be.get();
        this.n = (aghf) dwvVar.d.wp.get();
        this.o = (agkb) dwvVar.g.get();
        aglj agljVar = (aglj) dwvVar.y.get();
        this.L = agljVar;
        agme agmeVar = (agme) dwvVar.k.get();
        this.p = agmeVar;
        agmr agmrVar = (agmr) dwvVar.x.get();
        this.q = agmrVar;
        agli agliVar = (agli) dwvVar.i.get();
        this.r = agliVar;
        aglg aglgVar = (aglg) dwvVar.z.get();
        this.s = dwvVar.e;
        this.t = (aghc) dwvVar.f.get();
        this.u = dwvVar.G;
        this.v = dwvVar.E;
        this.w = dwvVar.K;
        this.x = dwvVar.M;
        this.y = dwvVar.N;
        this.z = dwvVar.O;
        this.A = dwvVar.D;
        this.B = dwvVar.P;
        this.C = dwvVar.Q;
        this.D = dwvVar.S;
        this.E = dwvVar.A;
        this.F = dwvVar.d.hm;
        this.G = (azpx) dwvVar.w.get();
        axwu axwuVar = (axwu) dwvVar.d.gZ.get();
        this.H = axwuVar;
        agrnVar.h(new agik(this));
        agljVar.k.add(new agii(this));
        agmeVar.b(new agim(this));
        agmrVar.f.add(new agin(this));
        agliVar.a = new agij(this);
        this.M = new agil(this);
        aniq aniqVar = new aniq() { // from class: agig
            @Override // defpackage.aniq
            public final ankt a() {
                agio.this.w();
                return anlz.q(null);
            }
        };
        aqxe aqxeVar = axwuVar.a.b().C;
        aqxeVar = aqxeVar == null ? aqxe.a : aqxeVar;
        boolean z = false;
        if (aqxeVar.a(45353396L)) {
            aoqp aoqpVar = aqxeVar.b;
            if (!aoqpVar.containsKey(45353396L)) {
                throw new IllegalArgumentException();
            }
            aqxf aqxfVar = (aqxf) aoqpVar.get(45353396L);
            bool = Boolean.valueOf(aqxfVar.b == 1 ? ((Boolean) aqxfVar.c).booleanValue() : z);
        } else {
            bool = false;
        }
        this.K = new amfb(aniqVar, bool.booleanValue() ? scheduledExecutorService2 : scheduledExecutorService);
    }

    public static String p(String str) {
        return TextUtils.join(".", new String[]{"offline", str, "db"});
    }

    @Override // defpackage.agvx
    public final aglj A() {
        if (!z()) {
            return null;
        }
        return this.L;
    }

    @Override // defpackage.agvx
    public final aerh a() {
        return (aerh) this.D.get();
    }

    @Override // defpackage.agvx
    public final aghe b() {
        return this.t;
    }

    public final agkg c() {
        return (agkg) this.E.get();
    }

    @Override // defpackage.agvx
    public final agmc d() {
        return (agmc) this.A.get();
    }

    @Override // defpackage.agvx
    public final agpj e() {
        return (agpj) this.s.get();
    }

    @Override // defpackage.agvx
    public final agvr g() {
        return (agvr) this.x.get();
    }

    @Override // defpackage.agvx
    public final agvt h() {
        return (agvt) this.B.get();
    }

    @Override // defpackage.agvx
    public final agvv i() {
        return (agvv) this.y.get();
    }

    @Override // defpackage.agvx
    public final agvy j() {
        return (agvy) this.C.get();
    }

    @Override // defpackage.agvx
    public final agwc k() {
        return (agwc) this.z.get();
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                yvy yvyVar = (yvy) obj;
                this.k.execute(new agih(this, 2));
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{yvy.class};
    }

    @Override // defpackage.agvx
    public final agwd l() {
        return (agwd) this.w.get();
    }

    @Override // defpackage.agvx
    public final agwh m() {
        return (agwh) this.v.get();
    }

    @Override // defpackage.agvx
    public final agxf n() {
        return this.M;
    }

    @Override // defpackage.agis
    public final ankt o() {
        if (this.f44J) {
            return anhq.i(this.K.c(), Throwable.class, urc.j, anjk.a);
        }
        return anlz.p(new agot());
    }

    @Override // defpackage.agvx
    public final String q() {
        return this.I;
    }

    @Override // defpackage.agvx
    public final void r() {
        s(new agih(this));
    }

    @Override // defpackage.agis
    public final void s(Runnable runnable) {
        this.k.execute(new agid(this, runnable, 1));
    }

    @Override // defpackage.agvx
    public final void t(final String str, final yiw yiwVar) {
        zgh.m(str);
        this.k.execute(new Runnable() { // from class: agie
            @Override // java.lang.Runnable
            public final void run() {
                agio agioVar = agio.this;
                String str2 = str;
                yiw yiwVar2 = yiwVar;
                if (!agioVar.z()) {
                    return;
                }
                yiwVar2.b(null, agioVar.L.g(str2));
            }
        });
    }

    public final synchronized void u() {
        this.f44J = true;
        ylx.j(this.K.c(), anjk.a, afsc.j);
    }

    @Override // defpackage.agis
    public final synchronized void v(Object obj) {
        if (this.f44J) {
            this.b.f(obj);
        }
    }

    public final synchronized void w() {
        this.c.edit().putString("current_offline_store_tag", this.I).apply();
        aghc aghcVar = this.t;
        aghcVar.a.f = aghcVar;
        aghcVar.b.z(aghcVar);
        aghcVar.h();
        this.q.i();
        this.L.y();
        this.e.b(this.I);
        this.f.b(this.I);
        this.g.b(this.I);
        ((agjk) this.w.get()).j();
        i().y();
        ylx.i(((agjz) this.v.get()).i(), new ylw() { // from class: agif
            @Override // defpackage.ylw, defpackage.zdt
            public final void a(Object obj) {
                ((agwk) agio.this.u.get()).f(((Collection) obj).size());
            }
        });
        if (agxg.ah(this.c, this.I)) {
            this.a.post(new agih(this, 4));
        }
        v(new agnw());
        acvg acvgVar = ((agpq) this.F.get()).b;
        if (acvgVar != null) {
            acvgVar.c("st_i");
        }
    }

    public final synchronized void x() {
        this.f44J = false;
        this.G.sm();
        aghc aghcVar = this.t;
        aghcVar.b.R(aghcVar);
        this.e.g();
        this.f.d();
        this.g.d();
        this.h.r();
        if (agxg.ah(this.c, this.I)) {
            this.k.execute(new agih(this, 1));
        }
        this.n.b();
        this.c.edit().remove("current_offline_store_tag").apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean y() {
        return this.f44J;
    }

    @Override // defpackage.agis
    public final boolean z() {
        try {
            o().get();
            return true;
        } catch (IllegalStateException | InterruptedException | ExecutionException e) {
            zep.d("[Offline] Offline store initialization error", e);
            return false;
        }
    }
}
