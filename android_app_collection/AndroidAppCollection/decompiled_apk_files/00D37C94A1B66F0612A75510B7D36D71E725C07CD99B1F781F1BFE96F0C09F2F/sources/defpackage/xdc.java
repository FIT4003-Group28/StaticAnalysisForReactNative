package defpackage;
/* compiled from: PG */
/* renamed from: xdc  reason: default package */
/* loaded from: classes4.dex */
public final class xdc implements xcj {
    public final String a;
    public final apcd b;
    public final apcb c;
    private final String d;
    private final apcf e;

    public xdc(String str, apcf apcfVar, String str2, apcd apcdVar, apcb apcbVar) {
        if (str != null) {
            this.d = str;
            if (apcfVar != null) {
                this.e = apcfVar;
                if (str2 != null) {
                    this.a = str2;
                    if (apcdVar != null) {
                        this.b = apcdVar;
                        if (apcbVar != null) {
                            this.c = apcbVar;
                            return;
                        }
                        throw new NullPointerException("Null getLayoutType");
                    }
                    throw new NullPointerException("Null getSlotType");
                }
                throw new NullPointerException("Null getNonMatchingLayoutId");
            }
            throw new NullPointerException("Null getTriggerType");
        }
        throw new NullPointerException("Null getTriggerId");
    }

    public static xdc e(String str, String str2, apcd apcdVar, apcb apcbVar) {
        return new xdc(str, apcf.TRIGGER_TYPE_ON_DIFFERENT_LAYOUT_ID_ENTERED, str2, apcdVar, apcbVar);
    }

    @Override // defpackage.xcj
    public final String a() {
        return this.a;
    }

    @Override // defpackage.xek
    public final apcf b() {
        return this.e;
    }

    @Override // defpackage.xek
    public final String c() {
        return this.d;
    }

    @Override // defpackage.xek
    public final boolean d() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xdc) {
            xdc xdcVar = (xdc) obj;
            if (this.d.equals(xdcVar.d) && this.e.equals(xdcVar.e) && this.a.equals(xdcVar.a) && this.b.equals(xdcVar.b) && this.c.equals(xdcVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((this.d.hashCode() ^ 1000003) * 1000003) ^ this.e.hashCode()) * 1000003) ^ 1237) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String str = this.d;
        String valueOf = String.valueOf(this.e);
        String str2 = this.a;
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        int length = str.length();
        int length2 = String.valueOf(valueOf).length();
        int length3 = str2.length();
        StringBuilder sb = new StringBuilder(length + 149 + length2 + length3 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("OnDifferentLayoutIdEnteredTrigger{getTriggerId=");
        sb.append(str);
        sb.append(", getTriggerType=");
        sb.append(valueOf);
        sb.append(", shouldOnlyTriggerOnce=false, getNonMatchingLayoutId=");
        sb.append(str2);
        sb.append(", getSlotType=");
        sb.append(valueOf2);
        sb.append(", getLayoutType=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }

    public xdc() {
    }
}
