package defpackage;
/* compiled from: PG */
/* renamed from: cqwt  reason: default package */
/* loaded from: classes5.dex */
final class cqwt extends cqxq {
    private final boolean a;

    public cqwt(boolean z) {
        this.a = z;
    }

    @Override // defpackage.cqxq
    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof cqxq) && this.a == ((cqxq) obj).a();
    }

    public final int hashCode() {
        return (true != this.a ? 1237 : 1231) ^ 1000003;
    }

    public final String toString() {
        boolean z = this.a;
        StringBuilder sb = new StringBuilder(58);
        sb.append("GellerSyncExperimentalParams{enableUploadPagination=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
