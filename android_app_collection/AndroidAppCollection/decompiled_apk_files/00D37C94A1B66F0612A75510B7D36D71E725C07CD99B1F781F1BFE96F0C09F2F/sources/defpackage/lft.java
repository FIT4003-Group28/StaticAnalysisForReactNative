package defpackage;
/* compiled from: PG */
/* renamed from: lft  reason: default package */
/* loaded from: classes3.dex */
public final class lft {
    public final CharSequence a;
    public final CharSequence b;
    public final amup c;
    public final amuk d;
    public final amuk e;

    public lft(CharSequence charSequence, CharSequence charSequence2, amup amupVar, amuk amukVar, amuk amukVar2) {
        this.a = charSequence;
        this.b = charSequence2;
        if (amupVar != null) {
            this.c = amupVar;
            if (amukVar != null) {
                this.d = amukVar;
                if (amukVar2 != null) {
                    this.e = amukVar2;
                    return;
                }
                throw new NullPointerException("Null entryValues");
            }
            throw new NullPointerException("Null entries");
        }
        throw new NullPointerException("Null summaryValues");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lft) {
            lft lftVar = (lft) obj;
            CharSequence charSequence = this.a;
            if (charSequence != null ? charSequence.equals(lftVar.a) : lftVar.a == null) {
                CharSequence charSequence2 = this.b;
                if (charSequence2 != null ? charSequence2.equals(lftVar.b) : lftVar.b == null) {
                    if (this.c.equals(lftVar.c) && amxp.v(this.d, lftVar.d) && amxp.v(this.e, lftVar.e)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        int i = 0;
        int hashCode = ((charSequence == null ? 0 : charSequence.hashCode()) ^ 1000003) * 1000003;
        CharSequence charSequence2 = this.b;
        if (charSequence2 != null) {
            i = charSequence2.hashCode();
        }
        return ((((((hashCode ^ i) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 76 + length2 + length3 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
        sb.append("InlineSettingsData{title=");
        sb.append(valueOf);
        sb.append(", summary=");
        sb.append(valueOf2);
        sb.append(", summaryValues=");
        sb.append(valueOf3);
        sb.append(", entries=");
        sb.append(valueOf4);
        sb.append(", entryValues=");
        sb.append(valueOf5);
        sb.append("}");
        return sb.toString();
    }

    public lft() {
    }
}
