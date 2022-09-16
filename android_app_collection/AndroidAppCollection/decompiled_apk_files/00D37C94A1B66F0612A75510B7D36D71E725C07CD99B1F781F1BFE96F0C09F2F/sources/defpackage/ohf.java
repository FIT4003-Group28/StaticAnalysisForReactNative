package defpackage;
/* compiled from: PG */
/* renamed from: ohf  reason: default package */
/* loaded from: classes3.dex */
final class ohf {
    public final aspw a;
    public final aspv b;

    public ohf() {
    }

    public ohf(aspw aspwVar, aspv aspvVar) {
        this.a = aspwVar;
        this.b = aspvVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ohf) {
            ohf ohfVar = (ohf) obj;
            if (this.a.equals(ohfVar.a) && this.b.equals(ohfVar.b)) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 52 + String.valueOf(valueOf2).length());
        sb.append("LogAndErrorType{signalLogType=");
        sb.append(valueOf);
        sb.append(", signalLogErrorType=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
