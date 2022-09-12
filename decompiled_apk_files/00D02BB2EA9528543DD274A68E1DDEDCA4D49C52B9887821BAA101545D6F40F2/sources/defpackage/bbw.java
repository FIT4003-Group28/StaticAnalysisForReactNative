package defpackage;
/* compiled from: PG */
/* renamed from: bbw  reason: default package */
/* loaded from: classes3.dex */
public final class bbw extends bbx {
    public final bbp a;

    public bbw() {
        this(bbp.a);
    }

    public bbw(bbp bbpVar) {
        this.a = bbpVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.a.equals(((bbw) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return 3017385 + this.a.hashCode();
    }

    public final String toString() {
        return "Success {mOutputData=" + this.a + '}';
    }
}
