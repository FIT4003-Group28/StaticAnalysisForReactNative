package defpackage;
/* compiled from: PG */
/* renamed from: bmnd  reason: default package */
/* loaded from: classes3.dex */
public final class bmnd extends bmnq {
    private final dehn<bmoa> a;

    public bmnd(dehn<bmoa> dehnVar) {
        this.a = dehnVar;
    }

    @Override // defpackage.bmnq
    public final dehn<bmoa> a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bmnq)) {
            return false;
        }
        return this.a.equals(((bmnq) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 38);
        sb.append("DetectionStatus{scheduleStatusFuture=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
