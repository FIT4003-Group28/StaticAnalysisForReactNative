package defpackage;
/* compiled from: PG */
/* renamed from: bmsc  reason: default package */
/* loaded from: classes3.dex */
public final class bmsc extends bmsn {
    public final dehn<bmsj> a;

    public bmsc(dehn<bmsj> dehnVar) {
        this.a = dehnVar;
    }

    @Override // defpackage.bmsn
    public final dehn<bmsj> a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bmsn)) {
            return false;
        }
        return this.a.equals(((bmsn) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
        sb.append("UploadStatus{accountStatusFuture=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
