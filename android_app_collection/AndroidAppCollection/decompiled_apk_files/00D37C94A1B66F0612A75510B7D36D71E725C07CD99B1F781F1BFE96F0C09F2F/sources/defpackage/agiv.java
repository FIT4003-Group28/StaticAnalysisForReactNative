package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteException;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: agiv  reason: default package */
/* loaded from: classes.dex */
public final class agiv extends agrf implements afvr, ynl {
    public final Context a;
    public final Executor b;
    public final ywa c;
    public final agvq d;
    public final ahdf e;
    private final yni g;
    private final azqb h;
    private final afvn i;
    private final ahdn j;
    private final agkr k;
    private final SharedPreferences l;
    private final agpq m;
    private volatile agio n;

    public agiv(Context context, yni yniVar, Executor executor, ywa ywaVar, azqb azqbVar, afvn afvnVar, ahdn ahdnVar, agkr agkrVar, aguj agujVar, agkd agkdVar, SharedPreferences sharedPreferences, agpq agpqVar, agvq agvqVar, ahdf ahdfVar) {
        this.a = context;
        this.g = yniVar;
        this.b = executor;
        this.c = ywaVar;
        this.i = afvnVar;
        this.h = azqbVar;
        this.j = ahdnVar;
        this.k = agkrVar;
        this.l = sharedPreferences;
        this.m = agpqVar;
        this.d = agvqVar;
        this.e = ahdfVar;
        yniVar.g(agujVar);
        yniVar.g(this);
        agkdVar.a.g(agkdVar);
        agkdVar.h = false;
    }

    private final agvx i(afvm afvmVar) {
        afvmVar.getClass();
        if (!afvmVar.z()) {
            agio agioVar = this.n;
            if (agioVar != null && afvmVar.d().equals(agioVar.I)) {
                return agioVar;
            }
            agpq agpqVar = this.m;
            agpqVar.b = agpqVar.a.b(asny.LATENCY_ACTION_OFFLINE_STORE_START);
            g();
            agio agioVar2 = new agio(this.a, afvmVar);
            this.n = agioVar2;
            ((aghd) this.h.get()).h(agioVar2.t);
            agioVar2.u();
            this.g.g(agioVar2);
            acvg acvgVar = this.m.b;
            if (acvgVar != null) {
                acvgVar.c("st_a");
            }
            return agioVar2;
        }
        throw new IllegalArgumentException("Identity must be signed in.");
    }

    @Override // defpackage.agrf
    public final synchronized agvx a() {
        afvm c = this.i.c();
        if (c.z()) {
            return this.f;
        }
        try {
            if (this.n == null) {
                return i(c);
            }
            return this.n;
        } catch (SQLiteException e) {
            if (!this.k.f) {
                throw e;
            }
            return this.f;
        }
    }

    @Override // defpackage.afvr
    public final void b(final afvm afvmVar) {
        this.b.execute(new Runnable() { // from class: agiu
            @Override // java.lang.Runnable
            public final void run() {
                agiv agivVar = agiv.this;
                afvm afvmVar2 = afvmVar;
                Context context = agivVar.a;
                ywa ywaVar = agivVar.c;
                String d = afvmVar2.d();
                agvq agvqVar = agivVar.d;
                context.deleteDatabase(agio.p(d));
                agpj.u(context, ywaVar, d, agvqVar);
            }
        });
    }

    @Override // defpackage.agrf
    public final String c() {
        return this.l.getString("current_offline_store_tag", "NO_OP_STORE_TAG");
    }

    @Override // defpackage.agrf
    public final synchronized String d() {
        agvx a;
        a = a();
        return a != null ? a.q() : "NO_OP_STORE_TAG";
    }

    @Override // defpackage.agrf
    public final synchronized void e() {
        afvm c = this.i.c();
        if (c.z()) {
            return;
        }
        int a = this.j.a();
        if (a == 1) {
            i(c);
        } else if (a == 2) {
        } else {
            i(c);
            agio agioVar = this.n;
            if (agioVar == null || !agioVar.m().j().isEmpty() || !agioVar.i().j().isEmpty() || !agioVar.k().e().isEmpty()) {
                this.j.b(true);
            } else {
                this.j.b(false);
            }
        }
    }

    public final void g() {
        if (this.n != null) {
            this.g.m(this.n);
            this.n.x();
            this.n = null;
            ((aghd) this.h.get()).h(null);
        }
    }

    @Override // defpackage.agrf
    public final boolean h() {
        if (this.n != null) {
            agio agioVar = this.n;
            return agioVar.f44J && agioVar.K.e();
        }
        return false;
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                afwb afwbVar = (afwb) obj;
                if (zfm.f(this.a) || this.e.k()) {
                    this.b.execute(new agit(this, 1));
                    return null;
                }
                e();
                return null;
            } else if (i == 1) {
                afwd afwdVar = (afwd) obj;
                if (this.e.k()) {
                    this.b.execute(new agit(this));
                    return null;
                }
                g();
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{afwb.class, afwd.class};
    }
}
