package defpackage;
/* compiled from: PG */
/* renamed from: cycq  reason: default package */
/* loaded from: classes5.dex */
final class cycq extends cydw {
    private final boolean a;

    public cycq(boolean z) {
        this.a = z;
    }

    @Override // defpackage.cydw
    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof cydw) && this.a == ((cydw) obj).a();
    }

    public final int hashCode() {
        return (true != this.a ? 1237 : 1231) ^ 1000003;
    }

    public final String toString() {
        boolean z = this.a;
        StringBuilder sb = new StringBuilder(45);
        sb.append("CacheRefreshConfig{onlyRefreshIfNeeded=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
