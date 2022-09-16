package defpackage;
/* compiled from: PG */
/* renamed from: xdh  reason: default package */
/* loaded from: classes4.dex */
public final class xdh implements xek {
    private final String a;
    private final apcf b;
    private final String c;

    public xdh(String str, apcf apcfVar, String str2) {
        if (str != null) {
            this.a = str;
            if (apcfVar != null) {
                this.b = apcfVar;
                if (str2 != null) {
                    this.c = str2;
                    return;
                }
                throw new NullPointerException("Null getSlotId");
            }
            throw new NullPointerException("Null getTriggerType");
        }
        throw new NullPointerException("Null getTriggerId");
    }

    public static xdh a(String str, String str2) {
        return new xdh(str, apcf.TRIGGER_TYPE_ON_SLOT_CANCELLATION_REQUESTED, str2);
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
        if (obj instanceof xdh) {
            xdh xdhVar = (xdh) obj;
            if (this.a.equals(xdhVar.a) && this.b.equals(xdhVar.b) && this.c.equals(xdhVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ 1237) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        String str2 = this.c;
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 107 + String.valueOf(valueOf).length() + str2.length());
        sb.append("OnSlotCancellationRequestedTrigger{getTriggerId=");
        sb.append(str);
        sb.append(", getTriggerType=");
        sb.append(valueOf);
        sb.append(", shouldOnlyTriggerOnce=false, getSlotId=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }

    public xdh() {
    }
}
