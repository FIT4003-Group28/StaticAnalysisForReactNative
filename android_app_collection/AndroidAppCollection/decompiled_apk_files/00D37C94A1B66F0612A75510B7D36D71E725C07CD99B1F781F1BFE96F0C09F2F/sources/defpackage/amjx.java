package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: amjx  reason: default package */
/* loaded from: classes.dex */
public final class amjx {
    public final Set a;
    public final long b;
    public final ampq c;

    public amjx(Set set, long j, ampq ampqVar) {
        this.a = set;
        this.b = j;
        if (ampqVar != null) {
            this.c = ampqVar;
            return;
        }
        throw new NullPointerException("Null deadlineToIgnoreOptionalConstraints");
    }

    public static final amjw a() {
        return new amjw();
    }

    public static amjx b(amjx amjxVar, amjx amjxVar2) {
        aqxo.y(amjxVar.a.equals(amjxVar2.a));
        amjw a = a();
        a.b(amjxVar.a);
        a.a = Math.min(amjxVar.b, amjxVar2.b);
        ampq ampqVar = amjxVar.c;
        ampq ampqVar2 = amjxVar2.c;
        if (ampqVar.h() && ampqVar2.h()) {
            a.b = ampq.j(Long.valueOf(Math.min(((Long) ampqVar.c()).longValue(), ((Long) ampqVar2.c()).longValue())));
        } else if (ampqVar.h()) {
            a.b = ampqVar;
        } else if (ampqVar2.h()) {
            a.b = ampqVar2;
        }
        return a.a();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof amjx) {
            amjx amjxVar = (amjx) obj;
            if (this.a.equals(amjxVar.a) && this.b == amjxVar.b && this.c.equals(amjxVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        long j = this.b;
        return ((((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        long j = this.b;
        String valueOf2 = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 122 + String.valueOf(valueOf2).length());
        sb.append("SyncSchedule{constraints=");
        sb.append(valueOf);
        sb.append(", minLatencyBeforeCheckingConstraints=");
        sb.append(j);
        sb.append(", deadlineToIgnoreOptionalConstraints=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }

    public amjx() {
    }
}
