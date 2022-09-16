package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: ysp  reason: default package */
/* loaded from: classes4.dex */
final class ysp extends ytk {
    private volatile transient ThreadPoolExecutor A;
    public final azqb a;
    public final azqb b;
    public final azqb c;
    public final yme d;
    public final snc e;
    public final apfr f;
    public final ScheduledExecutorService g;
    public final yqm h;
    public final Executor i;
    public final yqx j;
    public final ces k;
    public final int l;
    public final String m;
    public final long n;
    public final Executor o;
    public final ytj p;
    public final azqb q;
    public final yrh r;
    public final zex s;
    public volatile transient boolean t;
    public volatile transient boolean u;
    public volatile transient boolean v;
    public volatile transient ThreadPoolExecutor w;
    public final aabf x;
    public volatile transient zav y;
    private final ytj z;

    public ysp(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, yme ymeVar, snc sncVar, apfr apfrVar, ScheduledExecutorService scheduledExecutorService, yqm yqmVar, Executor executor, yqx yqxVar, ces cesVar, aabf aabfVar, int i, String str, long j, Executor executor2, ytj ytjVar, ytj ytjVar2, azqb azqbVar4, yrh yrhVar, zex zexVar) {
        this.a = azqbVar;
        this.b = azqbVar2;
        this.c = azqbVar3;
        this.d = ymeVar;
        this.e = sncVar;
        this.f = apfrVar;
        this.g = scheduledExecutorService;
        this.h = yqmVar;
        this.i = executor;
        this.j = yqxVar;
        this.k = cesVar;
        this.x = aabfVar;
        this.l = i;
        if (str != null) {
            this.m = str;
            this.n = j;
            if (executor2 != null) {
                this.o = executor2;
                if (ytjVar != null) {
                    this.z = ytjVar;
                    if (ytjVar2 != null) {
                        this.p = ytjVar2;
                        if (azqbVar4 != null) {
                            this.q = azqbVar4;
                            if (yrhVar != null) {
                                this.r = yrhVar;
                                if (zexVar != null) {
                                    this.s = zexVar;
                                    return;
                                }
                                throw new NullPointerException("Null clientErrorLogger");
                            }
                            throw new NullPointerException("Null networkRequestTracker");
                        }
                        throw new NullPointerException("Null requestCompletionListenerProvider");
                    }
                    throw new NullPointerException("Null priorityExecutorGenerator");
                }
                throw new NullPointerException("Null normalExecutorGenerator");
            }
            throw new NullPointerException("Null deliveryExecutor");
        }
        throw new NullPointerException("Null threadPoolTag");
    }

    @Override // defpackage.ysd
    public final yme a() {
        return this.d;
    }

    @Override // defpackage.ysd
    public final azqb b() {
        return this.a;
    }

    @Override // defpackage.ysd
    public final azqb c() {
        return this.b;
    }

    @Override // defpackage.ysd
    public final azqb d() {
        return this.c;
    }

    @Override // defpackage.ytk
    public final int e() {
        return this.l;
    }

    public final boolean equals(Object obj) {
        yqm yqmVar;
        Executor executor;
        aabf aabfVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ytk) {
            ytk ytkVar = (ytk) obj;
            if (this.a.equals(ytkVar.b()) && this.b.equals(ytkVar.c()) && this.c.equals(ytkVar.d()) && this.d.equals(ytkVar.a()) && this.e.equals(ytkVar.h()) && this.f.equals(ytkVar.o()) && this.g.equals(ytkVar.s()) && ((yqmVar = this.h) != null ? yqmVar.equals(ytkVar.i()) : ytkVar.i() == null) && ((executor = this.i) != null ? executor.equals(ytkVar.r()) : ytkVar.r() == null) && this.j.equals(ytkVar.j()) && this.k.equals(ytkVar.g()) && ((aabfVar = this.x) != null ? aabfVar.equals(ytkVar.v()) : ytkVar.v() == null) && this.l == ytkVar.e() && this.m.equals(ytkVar.p()) && this.n == ytkVar.f() && this.o.equals(ytkVar.q()) && this.z.equals(ytkVar.l()) && this.p.equals(ytkVar.m()) && this.q.equals(ytkVar.t()) && this.r.equals(ytkVar.k()) && this.s.equals(ytkVar.n())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ytk
    public final long f() {
        return this.n;
    }

    @Override // defpackage.ytk
    public final ces g() {
        return this.k;
    }

    @Override // defpackage.ytk
    public final snc h() {
        return this.e;
    }

    public final int hashCode() {
        int hashCode = (((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003;
        yqm yqmVar = this.h;
        int i = 0;
        int hashCode2 = (hashCode ^ (yqmVar == null ? 0 : yqmVar.hashCode())) * 1000003;
        Executor executor = this.i;
        int hashCode3 = (((((hashCode2 ^ (executor == null ? 0 : executor.hashCode())) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003;
        aabf aabfVar = this.x;
        if (aabfVar != null) {
            i = aabfVar.hashCode();
        }
        int i2 = this.l;
        int hashCode4 = this.m.hashCode();
        long j = this.n;
        return ((((((((((((((((((hashCode3 ^ i) * 1000003) ^ i2) * 1000003) ^ hashCode4) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ this.o.hashCode()) * 1000003) ^ this.z.hashCode()) * 1000003) ^ this.p.hashCode()) * 1000003) ^ this.q.hashCode()) * 1000003) ^ this.r.hashCode()) * 1000003) ^ this.s.hashCode();
    }

    @Override // defpackage.ytk
    public final yqm i() {
        return this.h;
    }

    @Override // defpackage.ytk
    public final yqx j() {
        return this.j;
    }

    @Override // defpackage.ytk
    public final yrh k() {
        return this.r;
    }

    @Override // defpackage.ytk
    public final ytj l() {
        return this.z;
    }

    @Override // defpackage.ytk
    public final ytj m() {
        return this.p;
    }

    @Override // defpackage.ytk
    public final zex n() {
        return this.s;
    }

    @Override // defpackage.ytk
    public final apfr o() {
        return this.f;
    }

    @Override // defpackage.ytk
    public final String p() {
        return this.m;
    }

    @Override // defpackage.ytk
    public final Executor q() {
        return this.o;
    }

    @Override // defpackage.ytk
    public final Executor r() {
        return this.i;
    }

    @Override // defpackage.ytk
    public final ScheduledExecutorService s() {
        return this.g;
    }

    @Override // defpackage.ytk
    public final azqb t() {
        return this.q;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        String valueOf6 = String.valueOf(this.f);
        String valueOf7 = String.valueOf(this.g);
        String valueOf8 = String.valueOf(this.h);
        String valueOf9 = String.valueOf(this.i);
        String valueOf10 = String.valueOf(this.j);
        String valueOf11 = String.valueOf(this.k);
        String valueOf12 = String.valueOf(this.x);
        int i = this.l;
        String str = this.m;
        long j = this.n;
        String valueOf13 = String.valueOf(this.o);
        String valueOf14 = String.valueOf(this.z);
        String valueOf15 = String.valueOf(this.p);
        String valueOf16 = String.valueOf(this.q);
        String valueOf17 = String.valueOf(this.r);
        String valueOf18 = String.valueOf(this.s);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        int length5 = String.valueOf(valueOf5).length();
        int length6 = String.valueOf(valueOf6).length();
        int length7 = String.valueOf(valueOf7).length();
        int length8 = String.valueOf(valueOf8).length();
        int length9 = String.valueOf(valueOf9).length();
        int length10 = String.valueOf(valueOf10).length();
        int length11 = String.valueOf(valueOf11).length();
        int length12 = String.valueOf(valueOf12).length();
        int length13 = str.length();
        int length14 = String.valueOf(valueOf13).length();
        int length15 = String.valueOf(valueOf14).length();
        int length16 = String.valueOf(valueOf15).length();
        int length17 = String.valueOf(valueOf16).length();
        StringBuilder sb = new StringBuilder(length + 495 + length2 + length3 + length4 + length5 + length6 + length7 + length8 + length9 + length10 + length11 + length12 + length13 + length14 + length15 + length16 + length17 + String.valueOf(valueOf17).length() + String.valueOf(valueOf18).length());
        sb.append("CronetRequestQueueConfig{cronetEngineProvider=");
        sb.append(valueOf);
        sb.append(", headerDecoratorProvider=");
        sb.append(valueOf2);
        sb.append(", uriRewriter=");
        sb.append(valueOf3);
        sb.append(", commonConfigs=");
        sb.append(valueOf4);
        sb.append(", clock=");
        sb.append(valueOf5);
        sb.append(", androidCrolleyConfig=");
        sb.append(valueOf6);
        sb.append(", timeoutExecutor=");
        sb.append(valueOf7);
        sb.append(", requestFinishedListener=");
        sb.append(valueOf8);
        sb.append(", requestFinishedListenerExecutor=");
        sb.append(valueOf9);
        sb.append(", volleyNetworkConfig=");
        sb.append(valueOf10);
        sb.append(", cache=");
        sb.append(valueOf11);
        sb.append(", requestLogger=");
        sb.append(valueOf12);
        sb.append(", threadPoolSize=");
        sb.append(i);
        sb.append(", threadPoolTag=");
        sb.append(str);
        sb.append(", connectionTimeout=");
        sb.append(j);
        sb.append(", deliveryExecutor=");
        sb.append(valueOf13);
        sb.append(", normalExecutorGenerator=");
        sb.append(valueOf14);
        sb.append(", priorityExecutorGenerator=");
        sb.append(valueOf15);
        sb.append(", requestCompletionListenerProvider=");
        sb.append(valueOf16);
        sb.append(", networkRequestTracker=");
        sb.append(valueOf17);
        sb.append(", clientErrorLogger=");
        sb.append(valueOf18);
        sb.append("}");
        return sb.toString();
    }

    @Override // defpackage.ytk
    public final aabf v() {
        return this.x;
    }

    @Override // defpackage.ytk
    public final ThreadPoolExecutor u() {
        int i;
        if (this.A == null) {
            synchronized (this) {
                if (this.A == null) {
                    apfr apfrVar = ((ysx) this.z).a;
                    int i2 = this.l;
                    if (i2 == 1) {
                        i2 = 1;
                        i = 1;
                    } else {
                        i = apfrVar.h;
                    }
                    int i3 = i2 == 1 ? 1 : apfrVar.i;
                    long j = i2 == 1 ? 0L : apfrVar.e;
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    LinkedBlockingDeque linkedBlockingDeque = new LinkedBlockingDeque();
                    String str = this.m;
                    this.A = new ThreadPoolExecutor(i, i3, j, timeUnit, linkedBlockingDeque, new yli(10, str.length() != 0 ? "cronet-".concat(str) : new String("cronet-")));
                    if (this.A == null) {
                        throw new NullPointerException("normalExecutor() cannot return null");
                    }
                }
            }
        }
        return this.A;
    }
}
