package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: dmjr  reason: default package */
/* loaded from: classes6.dex */
final class dmjr extends dmka {
    private final Set<dmjz> a;

    public dmjr(Set<dmjz> set) {
        if (set != null) {
            this.a = set;
            return;
        }
        throw new NullPointerException("Null requestingClients");
    }

    @Override // defpackage.dmka
    public final Set<dmjz> a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dmka)) {
            return false;
        }
        return this.a.equals(((dmka) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 42);
        sb.append("FinishedScanningStatus{requestingClients=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
