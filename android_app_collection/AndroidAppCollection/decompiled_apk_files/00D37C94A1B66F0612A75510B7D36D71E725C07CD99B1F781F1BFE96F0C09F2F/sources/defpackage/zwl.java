package defpackage;
/* compiled from: PG */
/* renamed from: zwl  reason: default package */
/* loaded from: classes4.dex */
public final class zwl {
    public final int a;
    public final amuk b;

    public zwl() {
    }

    public zwl(int i, amuk amukVar) {
        this.a = i;
        this.b = amukVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zwl) {
            zwl zwlVar = (zwl) obj;
            if (this.a == zwlVar.a && amxp.v(this.b, zwlVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        int i = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 58);
        sb.append("MediaViewModelConfig{fileType=");
        sb.append(i);
        sb.append(", albumTypeList=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
