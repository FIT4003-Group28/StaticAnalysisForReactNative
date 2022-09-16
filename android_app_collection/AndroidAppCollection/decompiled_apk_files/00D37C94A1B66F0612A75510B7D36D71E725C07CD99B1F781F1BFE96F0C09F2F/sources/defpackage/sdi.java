package defpackage;
/* compiled from: PG */
/* renamed from: sdi  reason: default package */
/* loaded from: classes4.dex */
public class sdi {
    public final Object a;
    public CharSequence b;
    public sbz c;
    public sek d;

    public sdi(Object obj, CharSequence charSequence) {
        sho.h(obj);
        this.a = obj;
        this.b = charSequence;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof sdi) {
            sdi sdiVar = (sdi) obj;
            if (this.a.equals(sdiVar.a) && this.b.equals(sdiVar.b)) {
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
