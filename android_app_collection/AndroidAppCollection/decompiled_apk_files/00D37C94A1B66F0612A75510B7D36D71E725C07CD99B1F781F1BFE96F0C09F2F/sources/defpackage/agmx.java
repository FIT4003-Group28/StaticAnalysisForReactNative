package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
/* compiled from: PG */
/* renamed from: agmx  reason: default package */
/* loaded from: classes.dex */
public final class agmx {
    public PlayerResponseModel a;
    public long b;
    public long c;
    public agqz d;
    public agqn e;
    public agqv f;
    final /* synthetic */ agmz g;
    private agqo h;
    private final attl i;
    private final int j;
    private final byte[] k;
    private long l;
    private agqe m;
    private long n;
    private long o;
    private agqu p;

    public agmx(agmz agmzVar, agqo agqoVar, attl attlVar, int i, byte[] bArr, agqe agqeVar, agqn agqnVar, long j) {
        this.g = agmzVar;
        attl attlVar2 = attl.UNKNOWN_FORMAT_TYPE;
        this.h = agqoVar;
        this.i = attlVar;
        this.j = i;
        this.k = bArr;
        this.m = agqeVar;
        this.e = agqnVar;
        this.c = j;
    }

    public final long a() {
        long j;
        synchronized (this.g.k) {
            j = this.l;
        }
        return j;
    }

    public final agqe b() {
        agqe agqeVar;
        synchronized (this.g.k) {
            agqeVar = this.m;
        }
        return agqeVar;
    }

    public final agqo c() {
        agqo agqoVar;
        synchronized (this.g.k) {
            agqoVar = this.h;
        }
        return agqoVar;
    }

    public final agqu d() {
        agqu agquVar;
        PlayerResponseModel playerResponseModel;
        atse u;
        synchronized (this.g.k) {
            if (this.p == null && (playerResponseModel = this.a) != null && (u = playerResponseModel.u()) != null) {
                this.p = new agqu(this.h.f(), u, this.l, this.b, this.g.j);
            }
            agquVar = this.p;
        }
        return agquVar;
    }

    public final agqv e() {
        agmx agmxVar;
        synchronized (this.g.k) {
            try {
                try {
                    if (this.f == null) {
                        agqu d = d();
                        PlayerResponseModel playerResponseModel = this.a;
                        asaa t = playerResponseModel != null ? playerResponseModel.t() : null;
                        agml a = this.g.a(this.h.f());
                        agqo agqoVar = this.h;
                        try {
                            agmxVar = this;
                            agmxVar.f = new agqv(agqoVar, this.i, this.j, this.k, this.g.h(agqoVar.f()), this.l, this.n, this.o, this.c, d, t, this.m, this.e, a == null ? null : a.d(), this.d, this.a);
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    } else {
                        agmxVar = this;
                    }
                    return agmxVar.f;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    public final void f() {
        synchronized (this.g.k) {
            this.a = null;
            this.p = null;
        }
    }

    public final void g() {
        synchronized (this.g.k) {
            this.f = null;
        }
    }

    public final void h(long j) {
        synchronized (this.g.k) {
            this.o = j;
            this.f = null;
        }
    }

    public final void i(long j) {
        synchronized (this.g.k) {
            this.n = j;
            this.f = null;
        }
    }

    public final void j(agqe agqeVar) {
        synchronized (this.g.k) {
            this.m = agqeVar;
            this.f = null;
        }
    }

    public final void k(PlayerResponseModel playerResponseModel, long j, long j2) {
        synchronized (this.g.k) {
            f();
            this.a = playerResponseModel;
            this.l = j;
            this.b = j2;
            this.f = null;
        }
    }

    public final void l(agqo agqoVar) {
        synchronized (this.g.k) {
            this.h = agqoVar;
            this.f = null;
        }
    }
}
