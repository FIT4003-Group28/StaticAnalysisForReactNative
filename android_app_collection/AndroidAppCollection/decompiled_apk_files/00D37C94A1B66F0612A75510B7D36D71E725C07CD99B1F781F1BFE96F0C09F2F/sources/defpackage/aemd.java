package defpackage;
/* compiled from: PG */
/* renamed from: aemd  reason: default package */
/* loaded from: classes.dex */
public final class aemd {
    public final aent a;
    public final int b;

    public aemd() {
    }

    public aemd(aent aentVar, int i) {
        this.a = aentVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aemd) {
            aemd aemdVar = (aemd) obj;
            if (this.a.equals(aemdVar.a) && this.b == aemdVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String str = this.b != 1 ? "VIDEO" : "AUDIO";
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 44 + str.length());
        sb.append("InitSegmentData{onesieVideoData=");
        sb.append(valueOf);
        sb.append(", dataType=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
