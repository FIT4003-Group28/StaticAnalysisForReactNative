package defpackage;
/* compiled from: PG */
/* renamed from: gdq  reason: default package */
/* loaded from: classes.dex */
final class gdq extends gdv {
    private final boolean a;

    public gdq(boolean z) {
        this.a = z;
    }

    @Override // defpackage.gdv
    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof gdv) && this.a == ((gdv) obj).a();
    }

    public final int hashCode() {
        return (true != this.a ? 1237 : 1231) ^ 1000003;
    }

    public final String toString() {
        boolean z = this.a;
        StringBuilder sb = new StringBuilder(56);
        sb.append("SearchOmniboxVisibilityChangeTriggeredEvent{shown=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
