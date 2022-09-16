package defpackage;
/* compiled from: PG */
/* renamed from: zop  reason: default package */
/* loaded from: classes4.dex */
final class zop {
    public final zpq a;
    public final zoo b;

    public zop(zpq zpqVar, zoo zooVar) {
        if (zpqVar != null) {
            this.a = zpqVar;
            if (zooVar != null) {
                this.b = zooVar;
                return;
            }
            throw new NullPointerException("Null processorSetupCallback");
        }
        throw new NullPointerException("Null frameProcessor");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zop) {
            zop zopVar = (zop) obj;
            if (this.a.equals(zopVar.a) && this.b.equals(zopVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 61 + String.valueOf(valueOf2).length());
        sb.append("FrameProcessorSetup{frameProcessor=");
        sb.append(valueOf);
        sb.append(", processorSetupCallback=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }

    public zop() {
    }
}
