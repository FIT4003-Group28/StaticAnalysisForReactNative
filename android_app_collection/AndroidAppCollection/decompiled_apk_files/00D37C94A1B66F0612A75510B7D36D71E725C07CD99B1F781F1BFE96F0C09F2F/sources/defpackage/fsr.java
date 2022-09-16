package defpackage;
/* compiled from: PG */
/* renamed from: fsr  reason: default package */
/* loaded from: classes3.dex */
public final class fsr {
    public final aqtb a;
    private final String b;

    public fsr() {
    }

    public fsr(aqtb aqtbVar, String str) {
        this.a = aqtbVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fsr) {
            fsr fsrVar = (fsr) obj;
            if (this.a.equals(fsrVar.a)) {
                String str = this.b;
                String str2 = fsrVar.b;
                if (str != null ? str.equals(str2) : str2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String str = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 67 + String.valueOf(str).length());
        sb.append("TabHeaderElementBarModel{elementRenderer=");
        sb.append(valueOf);
        sb.append(", filterChipBarElementId=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
