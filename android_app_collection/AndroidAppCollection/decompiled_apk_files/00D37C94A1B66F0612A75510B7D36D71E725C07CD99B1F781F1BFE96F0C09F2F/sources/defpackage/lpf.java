package defpackage;
/* compiled from: PG */
/* renamed from: lpf  reason: default package */
/* loaded from: classes3.dex */
final class lpf {
    public final Object a;
    public final int b;
    public final boolean c;

    public lpf(Object obj, int i, boolean z) {
        if (obj != null) {
            this.a = obj;
            this.b = i;
            this.c = z;
            return;
        }
        throw new NullPointerException("Null eventTag");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lpf) {
            lpf lpfVar = (lpf) obj;
            if (this.a.equals(lpfVar.a) && this.b == lpfVar.b && this.c == lpfVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        int i = this.b;
        boolean z = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 68);
        sb.append("HiddenItem{eventTag=");
        sb.append(valueOf);
        sb.append(", undoIndex=");
        sb.append(i);
        sb.append(", separatorRemoved=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }

    public lpf() {
    }
}
