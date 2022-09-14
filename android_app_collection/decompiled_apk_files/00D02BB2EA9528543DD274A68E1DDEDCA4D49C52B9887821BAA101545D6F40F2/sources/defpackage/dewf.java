package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: PG */
/* renamed from: dewf  reason: default package */
/* loaded from: classes6.dex */
public final class dewf extends dewj {
    private final Context a;
    private final cqat b;
    private final dewz c;
    private final Executor d;
    private final Executor e;
    private final Executor f;
    private final ScheduledExecutorService g;
    private final dexd h;
    private final dbty<Boolean> i;
    private final dbty<Boolean> j;
    private final dbty<Boolean> k;
    private final dbty<Long> l;

    public dewf(Context context, cqat cqatVar, dewz dewzVar, Executor executor, Executor executor2, Executor executor3, @dzsi ScheduledExecutorService scheduledExecutorService, @dzsi dexd dexdVar, dbty<Boolean> dbtyVar, dbty<Boolean> dbtyVar2, dbty<Boolean> dbtyVar3, dbty<Long> dbtyVar4) {
        this.a = context;
        this.b = cqatVar;
        this.c = dewzVar;
        this.d = executor;
        this.e = executor2;
        this.f = executor3;
        this.g = scheduledExecutorService;
        this.h = dexdVar;
        this.i = dbtyVar;
        this.j = dbtyVar2;
        this.k = dbtyVar3;
        this.l = dbtyVar4;
    }

    @Override // defpackage.dewj
    public final Context a() {
        return this.a;
    }

    @Override // defpackage.dewj
    public final cqat b() {
        return this.b;
    }

    @Override // defpackage.dewj
    public final dewz c() {
        return this.c;
    }

    @Override // defpackage.dewj
    public final Executor d() {
        return this.d;
    }

    @Override // defpackage.dewj
    public final Executor e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        ScheduledExecutorService scheduledExecutorService;
        dexd dexdVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof dewj) {
            dewj dewjVar = (dewj) obj;
            if (this.a.equals(dewjVar.a()) && this.b.equals(dewjVar.b()) && this.c.equals(dewjVar.c()) && this.d.equals(dewjVar.d()) && this.e.equals(dewjVar.e()) && this.f.equals(dewjVar.f()) && ((scheduledExecutorService = this.g) != null ? scheduledExecutorService.equals(dewjVar.g()) : dewjVar.g() == null) && ((dexdVar = this.h) != null ? dexdVar.equals(dewjVar.h()) : dewjVar.h() == null) && dewjVar.i() == null && dewjVar.j() == null && this.i.equals(dewjVar.k()) && this.j.equals(dewjVar.l()) && this.k.equals(dewjVar.m()) && this.l.equals(dewjVar.n()) && dewjVar.o() == null && dewjVar.p() == null) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dewj
    public final Executor f() {
        return this.f;
    }

    @Override // defpackage.dewj
    @dzsi
    public final ScheduledExecutorService g() {
        return this.g;
    }

    @Override // defpackage.dewj
    @dzsi
    public final dexd h() {
        return this.h;
    }

    public final int hashCode() {
        int hashCode = (((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003;
        ScheduledExecutorService scheduledExecutorService = this.g;
        int i = 0;
        int hashCode2 = (hashCode ^ (scheduledExecutorService == null ? 0 : scheduledExecutorService.hashCode())) * 1000003;
        dexd dexdVar = this.h;
        if (dexdVar != null) {
            i = dexdVar.hashCode();
        }
        return (((((((((hashCode2 ^ i) * 583896283) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode()) * (-721379959);
    }

    @Override // defpackage.dewj
    @dzsi
    public final dewr i() {
        return null;
    }

    @Override // defpackage.dewj
    @dzsi
    public final String j() {
        return null;
    }

    @Override // defpackage.dewj
    public final dbty<Boolean> k() {
        return this.i;
    }

    @Override // defpackage.dewj
    public final dbty<Boolean> l() {
        return this.j;
    }

    @Override // defpackage.dewj
    public final dbty<Boolean> m() {
        return this.k;
    }

    @Override // defpackage.dewj
    public final dbty<Long> n() {
        return this.l;
    }

    @Override // defpackage.dewj
    @dzsi
    public final deww o() {
        return null;
    }

    @Override // defpackage.dewj
    @dzsi
    public final dewp p() {
        return null;
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
        String valueOf12 = String.valueOf(this.l);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        int length5 = String.valueOf(valueOf5).length();
        int length6 = String.valueOf(valueOf6).length();
        int length7 = String.valueOf(valueOf7).length();
        int length8 = String.valueOf(valueOf8).length();
        int length9 = "null".length();
        int length10 = "null".length();
        int length11 = String.valueOf(valueOf9).length();
        int length12 = String.valueOf(valueOf10).length();
        int length13 = String.valueOf(valueOf11).length();
        int length14 = String.valueOf(valueOf12).length();
        StringBuilder sb = new StringBuilder(length + 330 + length2 + length3 + length4 + length5 + length6 + length7 + length8 + length9 + length10 + length11 + length12 + length13 + length14 + "null".length() + "null".length());
        sb.append("ChannelConfig{context=");
        sb.append(valueOf);
        sb.append(", clock=");
        sb.append(valueOf2);
        sb.append(", transport=");
        sb.append(valueOf3);
        sb.append(", transportExecutor=");
        sb.append(valueOf4);
        sb.append(", ioExecutor=");
        sb.append(valueOf5);
        sb.append(", networkExecutor=");
        sb.append(valueOf6);
        sb.append(", transportScheduledExecutor=");
        sb.append(valueOf7);
        sb.append(", authContextManager=");
        sb.append(valueOf8);
        sb.append(", rpcCacheProvider=");
        sb.append("null");
        sb.append(", userAgentOverride=");
        sb.append((String) null);
        sb.append(", recordNetworkMetricsToPrimes=");
        sb.append(valueOf9);
        sb.append(", recordCachingMetricsToPrimes=");
        sb.append(valueOf10);
        sb.append(", recordBandwidthMetrics=");
        sb.append(valueOf11);
        sb.append(", grpcIdleTimeoutMillis=");
        sb.append(valueOf12);
        sb.append(", streamzConfig=");
        sb.append("null");
        sb.append(", grpcServiceConfig=");
        sb.append("null");
        sb.append("}");
        return sb.toString();
    }
}
