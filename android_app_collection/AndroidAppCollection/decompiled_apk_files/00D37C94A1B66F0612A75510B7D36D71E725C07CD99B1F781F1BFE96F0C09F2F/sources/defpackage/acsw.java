package defpackage;
/* compiled from: PG */
/* renamed from: acsw  reason: default package */
/* loaded from: classes.dex */
final class acsw {
    private final Object a;
    private final int b;
    private final int c;

    public acsw(Object obj, int i, int i2) {
        this.a = obj;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof acsw)) {
            return false;
        }
        acsw acswVar = (acsw) obj;
        if (this.c != acswVar.c) {
            return false;
        }
        Object obj2 = this.a;
        if (obj2 == null ? acswVar.a != null : !obj2.equals(acswVar.a)) {
            return false;
        }
        return this.b == acswVar.b;
    }

    public final int hashCode() {
        return (this.b * 31) + this.c;
    }
}
