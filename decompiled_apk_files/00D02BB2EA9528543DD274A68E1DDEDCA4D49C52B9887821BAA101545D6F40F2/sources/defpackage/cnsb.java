package defpackage;
/* compiled from: PG */
/* renamed from: cnsb  reason: default package */
/* loaded from: classes.dex */
public final class cnsb<L> {
    private final L a;
    private final String b;

    public cnsb(L l, String str) {
        this.a = l;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cnsb)) {
            return false;
        }
        cnsb cnsbVar = (cnsb) obj;
        return this.a == cnsbVar.a && this.b.equals(cnsbVar.b);
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 31) + this.b.hashCode();
    }
}
