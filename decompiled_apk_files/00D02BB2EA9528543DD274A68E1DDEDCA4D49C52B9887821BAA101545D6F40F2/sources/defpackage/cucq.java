package defpackage;
/* compiled from: PG */
/* renamed from: cucq  reason: default package */
/* loaded from: classes5.dex */
final class cucq extends cuey {
    private final boolean a;

    public cucq(boolean z) {
        this.a = z;
    }

    @Override // defpackage.cuey
    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof cuey) && this.a == ((cuey) obj).a();
    }

    public final int hashCode() {
        return (true != this.a ? 1237 : 1231) ^ 1000003;
    }

    public final String toString() {
        boolean z = this.a;
        StringBuilder sb = new StringBuilder(20);
        sb.append("Block{blocked=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
