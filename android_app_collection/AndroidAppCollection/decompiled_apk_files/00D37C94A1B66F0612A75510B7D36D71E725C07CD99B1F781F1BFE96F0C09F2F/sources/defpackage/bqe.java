package defpackage;
/* compiled from: PG */
/* renamed from: bqe  reason: default package */
/* loaded from: classes2.dex */
public final class bqe extends adz {
    public final bpx a;

    public bqe() {
        this(bpx.a);
    }

    public bqe(bpx bpxVar) {
        this.a = bpxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.a.equals(((bqe) obj).a);
        }
        return false;
    }

    public final String toString() {
        return "Success {mOutputData=" + this.a + '}';
    }

    public final int hashCode() {
        return 3031242 + this.a.hashCode();
    }
}
