package defpackage;
/* compiled from: PG */
/* renamed from: aksd  reason: default package */
/* loaded from: classes.dex */
public final class aksd {
    public final String a;
    public final arln b;

    public aksd(String str, arln arlnVar) {
        if (str != null) {
            this.a = str;
            if (arlnVar != null) {
                this.b = arlnVar;
                return;
            }
            throw new NullPointerException("Null browseFormData");
        }
        throw new NullPointerException("Null filterChipBarId");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aksd) {
            aksd aksdVar = (aksd) obj;
            if (this.a.equals(aksdVar.a) && this.b.equals(aksdVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(str.length() + 46 + String.valueOf(valueOf).length());
        sb.append("FilterState{filterChipBarId=");
        sb.append(str);
        sb.append(", browseFormData=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    public aksd() {
    }
}
