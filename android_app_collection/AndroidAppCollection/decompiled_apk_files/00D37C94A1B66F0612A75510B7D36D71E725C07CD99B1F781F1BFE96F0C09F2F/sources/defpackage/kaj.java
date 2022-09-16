package defpackage;
/* compiled from: PG */
/* renamed from: kaj  reason: default package */
/* loaded from: classes3.dex */
public final class kaj {
    public final kal a;
    public final int b;

    public kaj(kal kalVar, int i) {
        if (kalVar != null) {
            this.a = kalVar;
            this.b = i;
            return;
        }
        throw new NullPointerException("Null videoStageEventContext");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kaj) {
            kaj kajVar = (kaj) obj;
            if (this.a.equals(kajVar.a) && this.b == kajVar.b) {
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
        int i = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 69);
        sb.append("InterruptionContext{videoStageEventContext=");
        sb.append(valueOf);
        sb.append(", playerState=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }

    public kaj() {
    }
}
