package defpackage;
/* compiled from: PG */
/* renamed from: pkf  reason: default package */
/* loaded from: classes4.dex */
public final class pkf {
    public static final pkf a = new pkf(false);
    public final boolean b;

    public pkf(boolean z) {
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.b == ((pkf) obj).b;
    }

    public final int hashCode() {
        return this.b ? 0 : 1;
    }
}
