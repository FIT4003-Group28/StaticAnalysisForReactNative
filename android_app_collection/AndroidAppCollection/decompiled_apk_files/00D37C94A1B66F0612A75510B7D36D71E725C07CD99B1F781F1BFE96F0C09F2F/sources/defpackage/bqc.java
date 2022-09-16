package defpackage;
/* compiled from: PG */
/* renamed from: bqc  reason: default package */
/* loaded from: classes2.dex */
public final class bqc extends adz {
    public final bpx a = bpx.a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.a.equals(((bqc) obj).a);
        }
        return false;
    }

    public final String toString() {
        return "Failure {mOutputData=" + this.a + '}';
    }

    public final int hashCode() {
        return 3031180 + this.a.hashCode();
    }
}
