package defpackage;
/* compiled from: PG */
/* renamed from: xdr  reason: default package */
/* loaded from: classes4.dex */
public final class xdr implements xek {
    public final String a;
    public final xdo b;
    private final apcf c;

    public xdr(String str, apcf apcfVar, xdo xdoVar) {
        if (str != null) {
            this.a = str;
            if (apcfVar != null) {
                this.c = apcfVar;
                if (xdoVar != null) {
                    this.b = xdoVar;
                    return;
                }
                throw new NullPointerException("Null getReelAdMetadata");
            }
            throw new NullPointerException("Null getTriggerType");
        }
        throw new NullPointerException("Null getTriggerId");
    }

    @Override // defpackage.xek
    public final apcf b() {
        return this.c;
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
        if (obj instanceof xdr) {
            xdr xdrVar = (xdr) obj;
            if (this.a.equals(xdrVar.a) && this.c.equals(xdrVar.c) && this.b.equals(xdrVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ 1237) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.b);
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 122 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        sb.append("SequenceItemInPlayerSpaceAvailableTrigger{getTriggerId=");
        sb.append(str);
        sb.append(", getTriggerType=");
        sb.append(valueOf);
        sb.append(", shouldOnlyTriggerOnce=false, getReelAdMetadata=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }

    public xdr() {
    }
}
