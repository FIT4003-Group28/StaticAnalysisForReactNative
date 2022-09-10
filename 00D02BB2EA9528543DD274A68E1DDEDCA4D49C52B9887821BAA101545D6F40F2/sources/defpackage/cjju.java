package defpackage;
/* compiled from: PG */
/* renamed from: cjju  reason: default package */
/* loaded from: classes4.dex */
public final class cjju {
    public final dzss a;
    public final dzss b;
    public final CharSequence c;
    public final CharSequence d;

    public cjju() {
        this((CharSequence) null, 3);
    }

    public /* synthetic */ cjju(String str, int i) {
        this(1 == (i & 1) ? "" : str, "");
    }

    public cjju(CharSequence charSequence, CharSequence charSequence2) {
        dzvx.c(charSequence, "text");
        dzvx.c(charSequence2, "title");
        this.c = charSequence;
        this.d = charSequence2;
        this.a = dzst.a(new cjjs(this));
        this.b = dzst.a(new cjjt(this));
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof cjju)) {
                return false;
            }
            cjju cjjuVar = (cjju) obj;
            return dzvx.d(this.c, cjjuVar.c) && dzvx.d(this.d, cjjuVar.d);
        }
        return true;
    }

    public final int hashCode() {
        CharSequence charSequence = this.c;
        int i = 0;
        int hashCode = (charSequence != null ? charSequence.hashCode() : 0) * 31;
        CharSequence charSequence2 = this.d;
        if (charSequence2 != null) {
            i = charSequence2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "Content(text=" + this.c + ", title=" + this.d + ")";
    }
}
