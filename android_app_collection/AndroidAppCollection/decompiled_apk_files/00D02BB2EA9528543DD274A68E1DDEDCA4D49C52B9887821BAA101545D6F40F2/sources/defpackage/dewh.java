package defpackage;

import android.content.Context;
import java.net.URI;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: PG */
/* renamed from: dewh  reason: default package */
/* loaded from: classes6.dex */
public final class dewh extends dewy {
    private final Context a;
    private final URI b;
    private final Executor c;
    private final Executor d;
    private final ScheduledExecutorService e;
    private final String f;
    private final dbty<Boolean> g;
    private final dewp h;
    private final Integer i;
    private final Integer j;
    private final long k;

    public dewh(Context context, URI uri, Executor executor, Executor executor2, @dzsi ScheduledExecutorService scheduledExecutorService, @dzsi String str, dbty<Boolean> dbtyVar, @dzsi dewp dewpVar, @dzsi Integer num, @dzsi Integer num2, long j) {
        this.a = context;
        this.b = uri;
        this.c = executor;
        this.d = executor2;
        this.e = scheduledExecutorService;
        this.f = str;
        this.g = dbtyVar;
        this.h = dewpVar;
        this.i = num;
        this.j = num2;
        this.k = j;
    }

    @Override // defpackage.dewy
    public final Context a() {
        return this.a;
    }

    @Override // defpackage.dewy
    public final URI b() {
        return this.b;
    }

    @Override // defpackage.dewy
    public final Executor c() {
        return this.c;
    }

    @Override // defpackage.dewy
    public final Executor d() {
        return this.d;
    }

    @Override // defpackage.dewy
    @dzsi
    public final ScheduledExecutorService e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        ScheduledExecutorService scheduledExecutorService;
        String str;
        dewp dewpVar;
        Integer num;
        Integer num2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof dewy) {
            dewy dewyVar = (dewy) obj;
            if (this.a.equals(dewyVar.a()) && this.b.equals(dewyVar.b()) && this.c.equals(dewyVar.c()) && this.d.equals(dewyVar.d()) && ((scheduledExecutorService = this.e) != null ? scheduledExecutorService.equals(dewyVar.e()) : dewyVar.e() == null) && ((str = this.f) != null ? str.equals(dewyVar.f()) : dewyVar.f() == null) && this.g.equals(dewyVar.g()) && ((dewpVar = this.h) != null ? dewpVar.equals(dewyVar.h()) : dewyVar.h() == null) && ((num = this.i) != null ? num.equals(dewyVar.i()) : dewyVar.i() == null) && ((num2 = this.j) != null ? num2.equals(dewyVar.j()) : dewyVar.j() == null) && this.k == dewyVar.k()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dewy
    @dzsi
    public final String f() {
        return this.f;
    }

    @Override // defpackage.dewy
    public final dbty<Boolean> g() {
        return this.g;
    }

    @Override // defpackage.dewy
    @dzsi
    public final dewp h() {
        return this.h;
    }

    public final int hashCode() {
        int hashCode = (((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        ScheduledExecutorService scheduledExecutorService = this.e;
        int i = 0;
        int hashCode2 = (hashCode ^ (scheduledExecutorService == null ? 0 : scheduledExecutorService.hashCode())) * 1000003;
        String str = this.f;
        int hashCode3 = (((hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.g.hashCode()) * 1000003;
        dewp dewpVar = this.h;
        int hashCode4 = (hashCode3 ^ (dewpVar == null ? 0 : dewpVar.hashCode())) * 1000003;
        Integer num = this.i;
        int hashCode5 = (hashCode4 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        Integer num2 = this.j;
        if (num2 != null) {
            i = num2.hashCode();
        }
        long j = this.k;
        return ((hashCode5 ^ i) * 1000003) ^ ((int) ((j >>> 32) ^ j));
    }

    @Override // defpackage.dewy
    @dzsi
    public final Integer i() {
        return this.i;
    }

    @Override // defpackage.dewy
    @dzsi
    public final Integer j() {
        return this.j;
    }

    @Override // defpackage.dewy
    public final long k() {
        return this.k;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        String str = this.f;
        String valueOf6 = String.valueOf(this.g);
        String valueOf7 = String.valueOf(this.h);
        String valueOf8 = String.valueOf(this.i);
        String valueOf9 = String.valueOf(this.j);
        long j = this.k;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        int length5 = String.valueOf(valueOf5).length();
        int length6 = String.valueOf(str).length();
        int length7 = String.valueOf(valueOf6).length();
        int length8 = String.valueOf(valueOf7).length();
        StringBuilder sb = new StringBuilder(length + 267 + length2 + length3 + length4 + length5 + length6 + length7 + length8 + String.valueOf(valueOf8).length() + String.valueOf(valueOf9).length());
        sb.append("TransportConfig{applicationContext=");
        sb.append(valueOf);
        sb.append(", uri=");
        sb.append(valueOf2);
        sb.append(", networkExecutor=");
        sb.append(valueOf3);
        sb.append(", transportExecutor=");
        sb.append(valueOf4);
        sb.append(", transportScheduledExecutorService=");
        sb.append(valueOf5);
        sb.append(", userAgentOverride=");
        sb.append(str);
        sb.append(", recordNetworkMetricsToPrimes=");
        sb.append(valueOf6);
        sb.append(", grpcServiceConfig=");
        sb.append(valueOf7);
        sb.append(", trafficStatsUid=");
        sb.append(valueOf8);
        sb.append(", trafficStatsTag=");
        sb.append(valueOf9);
        sb.append(", grpcIdleTimeoutMillis=");
        sb.append(j);
        sb.append("}");
        return sb.toString();
    }
}
