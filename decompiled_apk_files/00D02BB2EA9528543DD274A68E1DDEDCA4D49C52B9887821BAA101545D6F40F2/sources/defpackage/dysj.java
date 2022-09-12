package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dysj  reason: default package */
/* loaded from: classes6.dex */
public final class dysj {
    static final dyes<dysj> a = dyes.a("io.grpc.internal.ManagedChannelServiceConfig.MethodInfo");
    final Long b;
    final Boolean c;
    final Integer d;
    final Integer e;
    final dyuu f;
    final dyoy g;

    public dysj(Map<String, ?> map, boolean z, int i, int i2) {
        dyuu dyuuVar;
        dyoy dyoyVar;
        this.b = dyqb.h(map, "timeout");
        this.c = dyqb.j(map);
        Integer f = dyqb.f(map, "maxResponseMessageBytes");
        this.d = f;
        if (f != null) {
            dbsk.g(f.intValue() >= 0, "maxInboundMessageSize %s exceeds bounds", f);
        }
        Integer f2 = dyqb.f(map, "maxRequestMessageBytes");
        this.e = f2;
        if (f2 != null) {
            dbsk.g(f2.intValue() >= 0, "maxOutboundMessageSize %s exceeds bounds", f2);
        }
        Map<String, ?> d = z ? dyqb.d(map, "retryPolicy") : null;
        if (d == null) {
            dyuuVar = null;
        } else {
            Integer f3 = dyqb.f(d, "maxAttempts");
            dbsk.t(f3, "maxAttempts cannot be empty");
            int intValue = f3.intValue();
            dbsk.e(intValue >= 2, "maxAttempts must be greater than 1: %s", intValue);
            int min = Math.min(intValue, i);
            Long h = dyqb.h(d, "initialBackoff");
            dbsk.t(h, "initialBackoff cannot be empty");
            long longValue = h.longValue();
            dbsk.f(longValue > 0, "initialBackoffNanos must be greater than 0: %s", longValue);
            Long h2 = dyqb.h(d, "maxBackoff");
            dbsk.t(h2, "maxBackoff cannot be empty");
            long longValue2 = h2.longValue();
            dbsk.f(longValue2 > 0, "maxBackoff must be greater than 0: %s", longValue2);
            Double e = dyqb.e(d, "backoffMultiplier");
            dbsk.t(e, "backoffMultiplier cannot be empty");
            double doubleValue = e.doubleValue();
            dbsk.g(doubleValue > dcyn.a, "backoffMultiplier must be greater than 0: %s", Double.valueOf(doubleValue));
            Set<dyiy> a2 = dyvc.a(d, "retryableStatusCodes");
            dbuh.b(a2 != null, "%s is required in retry policy", "retryableStatusCodes");
            dbuh.b(!a2.isEmpty(), "%s must not be empty", "retryableStatusCodes");
            dbuh.b(!a2.contains(dyiy.OK), "%s must not contain OK", "retryableStatusCodes");
            dyuuVar = new dyuu(min, longValue, longValue2, doubleValue, a2);
        }
        this.f = dyuuVar;
        Map<String, ?> d2 = z ? dyqb.d(map, "hedgingPolicy") : null;
        if (d2 == null) {
            dyoyVar = null;
        } else {
            Integer f4 = dyqb.f(d2, "maxAttempts");
            dbsk.t(f4, "maxAttempts cannot be empty");
            int intValue2 = f4.intValue();
            dbsk.e(intValue2 >= 2, "maxAttempts must be greater than 1: %s", intValue2);
            int min2 = Math.min(intValue2, 5);
            Long h3 = dyqb.h(d2, "hedgingDelay");
            dbsk.t(h3, "hedgingDelay cannot be empty");
            long longValue3 = h3.longValue();
            dbsk.f(longValue3 >= 0, "hedgingDelay must not be negative: %s", longValue3);
            Set<dyiy> a3 = dyvc.a(d2, "nonFatalStatusCodes");
            if (a3 == null) {
                a3 = Collections.unmodifiableSet(EnumSet.noneOf(dyiy.class));
            } else {
                dbuh.b(!a3.contains(dyiy.OK), "%s must not contain OK", "nonFatalStatusCodes");
            }
            dyoyVar = new dyoy(min2, longValue3, a3);
        }
        this.g = dyoyVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dysj)) {
            return false;
        }
        dysj dysjVar = (dysj) obj;
        return dbsd.a(this.b, dysjVar.b) && dbsd.a(this.c, dysjVar.c) && dbsd.a(this.d, dysjVar.d) && dbsd.a(this.e, dysjVar.e) && dbsd.a(this.f, dysjVar.f) && dbsd.a(this.g, dysjVar.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.d, this.e, this.f, this.g});
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.b("timeoutNanos", this.b);
        b.b("waitForReady", this.c);
        b.b("maxInboundMessageSize", this.d);
        b.b("maxOutboundMessageSize", this.e);
        b.b("retryPolicy", this.f);
        b.b("hedgingPolicy", this.g);
        return b.toString();
    }
}
