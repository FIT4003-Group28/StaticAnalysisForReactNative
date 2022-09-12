package defpackage;
/* compiled from: PG */
/* renamed from: asbs  reason: default package */
/* loaded from: classes2.dex */
public final class asbs extends asbt {
    private final boolean a;

    public asbs(boolean z) {
        this.a = z;
    }

    @Override // defpackage.asbt
    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof asbt) && this.a == ((asbt) obj).a();
    }

    public final int hashCode() {
        return (true != this.a ? 1237 : 1231) ^ 1000003;
    }

    public final String toString() {
        boolean z = this.a;
        StringBuilder sb = new StringBuilder(59);
        sb.append("ReportIncidentCooloffStateChangedEvent{cooloffActive=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
