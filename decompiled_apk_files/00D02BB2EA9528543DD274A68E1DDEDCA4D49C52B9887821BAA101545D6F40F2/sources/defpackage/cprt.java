package defpackage;
/* compiled from: PG */
/* renamed from: cprt  reason: default package */
/* loaded from: classes5.dex */
public class cprt<D> {
    public final D a;
    public CharSequence b;
    public cppz c;
    public cpsf<Float> d;

    public cprt(D d, CharSequence charSequence) {
        this.a = (D) cpwl.a(d);
        this.b = charSequence;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cprt) {
            cprt cprtVar = (cprt) obj;
            if (this.a.equals(cprtVar.a) && this.b.equals(cprtVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() + 31) * 31;
        CharSequence charSequence = this.b;
        return hashCode + (charSequence == null ? 0 : charSequence.hashCode());
    }

    public final String toString() {
        return String.format("{%s, \"%s\"}", this.a.toString(), this.b);
    }
}
