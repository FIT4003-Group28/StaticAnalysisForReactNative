package defpackage;
/* compiled from: PG */
/* renamed from: bbu  reason: default package */
/* loaded from: classes3.dex */
public final class bbu extends bbx {
    public final bbp a = bbp.a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.a.equals(((bbu) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return 3017323 + this.a.hashCode();
    }

    public final String toString() {
        return "Failure {mOutputData=" + this.a + '}';
    }
}
