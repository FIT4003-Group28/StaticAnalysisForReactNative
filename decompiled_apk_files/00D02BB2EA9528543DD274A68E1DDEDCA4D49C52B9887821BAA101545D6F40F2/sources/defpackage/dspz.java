package defpackage;
/* compiled from: PG */
/* renamed from: dspz  reason: default package */
/* loaded from: classes.dex */
final class dspz {
    private final Object a;
    private final int b;

    public dspz(Object obj, int i) {
        this.a = obj;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dspz)) {
            return false;
        }
        dspz dspzVar = (dspz) obj;
        return this.a == dspzVar.a && this.b == dspzVar.b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 65535) + this.b;
    }
}
