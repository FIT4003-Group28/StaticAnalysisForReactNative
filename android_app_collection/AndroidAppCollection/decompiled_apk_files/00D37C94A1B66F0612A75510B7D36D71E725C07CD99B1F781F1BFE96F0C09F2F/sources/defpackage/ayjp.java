package defpackage;

import io.grpc.Status;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: ayjp  reason: default package */
/* loaded from: classes2.dex */
public final class ayjp {
    static final axyc a = axyc.a("io.grpc.internal.ManagedChannelServiceConfig.MethodInfo");
    final Long b;
    final Boolean c;
    final Integer d;
    final Integer e;
    final aylw f;
    final ayhg g;

    public ayjp(Map map, boolean z, int i, int i2) {
        String str;
        aylw aylwVar;
        ayhg ayhgVar;
        this.b = ayic.c(map, "timeout");
        this.c = ayic.j(map);
        Integer b = ayic.b(map, "maxResponseMessageBytes");
        this.d = b;
        if (b != null) {
            aqxo.u(b.intValue() >= 0, "maxInboundMessageSize %s exceeds bounds", b);
        }
        Integer b2 = ayic.b(map, "maxRequestMessageBytes");
        this.e = b2;
        if (b2 != null) {
            aqxo.u(b2.intValue() >= 0, "maxOutboundMessageSize %s exceeds bounds", b2);
        }
        Map h = z ? ayic.h(map, "retryPolicy") : null;
        if (h == null) {
            str = "maxAttempts";
            aylwVar = null;
        } else {
            Integer b3 = ayic.b(h, "maxAttempts");
            b3.getClass();
            int intValue = b3.intValue();
            aqxo.s(intValue >= 2, "maxAttempts must be greater than 1: %s", intValue);
            int min = Math.min(intValue, i);
            Long c = ayic.c(h, "initialBackoff");
            c.getClass();
            long longValue = c.longValue();
            aqxo.t(longValue > 0, "initialBackoffNanos must be greater than 0: %s", longValue);
            Long c2 = ayic.c(h, "maxBackoff");
            c2.getClass();
            str = "maxAttempts";
            long longValue2 = c2.longValue();
            aqxo.t(longValue2 > 0, "maxBackoff must be greater than 0: %s", longValue2);
            Double a2 = ayic.a(h, "backoffMultiplier");
            a2.getClass();
            double doubleValue = a2.doubleValue();
            aqxo.u(doubleValue > 0.0d, "backoffMultiplier must be greater than 0: %s", Double.valueOf(doubleValue));
            Long c3 = ayic.c(h, "perAttemptRecvTimeout");
            aqxo.u(c3 == null || c3.longValue() >= 0, "perAttemptRecvTimeout cannot be negative: %s", c3);
            Set a3 = ayme.a(h, "retryableStatusCodes");
            araa.y(a3 != null, "%s is required in retry policy", "retryableStatusCodes");
            araa.y(!a3.contains(Status.Code.OK), "%s must not contain OK", "retryableStatusCodes");
            aqxo.q(c3 != null || !a3.isEmpty(), "retryableStatusCodes cannot be empty without perAttemptRecvTimeout");
            aylwVar = new aylw(min, longValue, longValue2, doubleValue, c3, a3);
        }
        this.f = aylwVar;
        Map h2 = z ? ayic.h(map, "hedgingPolicy") : null;
        if (h2 == null) {
            ayhgVar = null;
        } else {
            Integer b4 = ayic.b(h2, str);
            b4.getClass();
            int intValue2 = b4.intValue();
            aqxo.s(intValue2 >= 2, "maxAttempts must be greater than 1: %s", intValue2);
            int min2 = Math.min(intValue2, i2);
            Long c4 = ayic.c(h2, "hedgingDelay");
            c4.getClass();
            long longValue3 = c4.longValue();
            aqxo.t(longValue3 >= 0, "hedgingDelay must not be negative: %s", longValue3);
            Set a4 = ayme.a(h2, "nonFatalStatusCodes");
            if (a4 == null) {
                a4 = Collections.unmodifiableSet(EnumSet.noneOf(Status.Code.class));
            } else {
                araa.y(true ^ a4.contains(Status.Code.OK), "%s must not contain OK", "nonFatalStatusCodes");
            }
            ayhgVar = new ayhg(min2, longValue3, a4);
        }
        this.g = ayhgVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ayjp)) {
            return false;
        }
        ayjp ayjpVar = (ayjp) obj;
        return akzj.f(this.b, ayjpVar.b) && akzj.f(this.c, ayjpVar.c) && akzj.f(this.d, ayjpVar.d) && akzj.f(this.e, ayjpVar.e) && akzj.f(this.f, ayjpVar.f) && akzj.f(this.g, ayjpVar.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.d, this.e, this.f, this.g});
    }

    public final String toString() {
        ampp c = akzj.c(this);
        c.b("timeoutNanos", this.b);
        c.b("waitForReady", this.c);
        c.b("maxInboundMessageSize", this.d);
        c.b("maxOutboundMessageSize", this.e);
        c.b("retryPolicy", this.f);
        c.b("hedgingPolicy", this.g);
        return c.toString();
    }
}
