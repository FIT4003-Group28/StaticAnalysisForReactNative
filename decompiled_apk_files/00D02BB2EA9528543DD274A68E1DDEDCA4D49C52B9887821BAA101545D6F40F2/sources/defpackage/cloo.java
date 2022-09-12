package defpackage;
/* compiled from: PG */
/* renamed from: cloo  reason: default package */
/* loaded from: classes5.dex */
public final class cloo {
    public static final cloo a = new cloo(0);
    public final int b;

    public cloo(int i) {
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.b == ((cloo) obj).b;
    }

    public final int hashCode() {
        return this.b;
    }
}
