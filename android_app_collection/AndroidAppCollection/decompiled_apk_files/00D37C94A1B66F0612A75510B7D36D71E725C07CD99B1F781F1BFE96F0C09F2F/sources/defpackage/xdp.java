package defpackage;
/* compiled from: PG */
/* renamed from: xdp  reason: default package */
/* loaded from: classes4.dex */
public final class xdp implements xek {
    private final String a;
    private final apcf b;

    public xdp(String str, apcf apcfVar) {
        if (str != null) {
            this.a = str;
            if (apcfVar != null) {
                this.b = apcfVar;
                return;
            }
            throw new NullPointerException("Null getTriggerType");
        }
        throw new NullPointerException("Null getTriggerId");
    }

    @Override // defpackage.xek
    public final apcf b() {
        return this.b;
    }

    @Override // defpackage.xek
    public final String c() {
        return this.a;
    }

    @Override // defpackage.xek
    public final boolean d() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xdp) {
            xdp xdpVar = (xdp) obj;
            if (this.a.equals(xdpVar.a) && this.b.equals(xdpVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ 1237;
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(str.length() + 93 + String.valueOf(valueOf).length());
        sb.append("ReelItemSequenceAbandonedTrigger{getTriggerId=");
        sb.append(str);
        sb.append(", getTriggerType=");
        sb.append(valueOf);
        sb.append(", shouldOnlyTriggerOnce=false}");
        return sb.toString();
    }

    public xdp() {
    }
}
