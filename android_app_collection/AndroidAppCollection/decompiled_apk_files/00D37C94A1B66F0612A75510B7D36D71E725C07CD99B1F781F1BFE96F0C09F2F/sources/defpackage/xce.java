package defpackage;
/* compiled from: PG */
/* renamed from: xce  reason: default package */
/* loaded from: classes4.dex */
public final class xce implements xek {
    public final String a;
    public final xeg b;
    private final String c;
    private final apcf d;

    public xce(String str, apcf apcfVar, String str2, xeg xegVar) {
        if (str != null) {
            this.c = str;
            if (apcfVar != null) {
                this.d = apcfVar;
                if (str2 != null) {
                    this.a = str2;
                    this.b = xegVar;
                    return;
                }
                throw new NullPointerException("Null getActivatingMediaLayoutId");
            }
            throw new NullPointerException("Null getTriggerType");
        }
        throw new NullPointerException("Null getTriggerId");
    }

    @Override // defpackage.xek
    public final apcf b() {
        return this.d;
    }

    @Override // defpackage.xek
    public final String c() {
        return this.c;
    }

    @Override // defpackage.xek
    public final boolean d() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xce) {
            xce xceVar = (xce) obj;
            if (this.c.equals(xceVar.c) && this.d.equals(xceVar.d) && this.a.equals(xceVar.a) && this.b.equals(xceVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((this.c.hashCode() ^ 1000003) * 1000003) ^ this.d.hashCode()) * 1000003) ^ 1237) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003) ^ 1231) * 1000003) ^ 1231;
    }

    public final String toString() {
        String str = this.c;
        String valueOf = String.valueOf(this.d);
        String str2 = this.a;
        String valueOf2 = String.valueOf(this.b);
        int length = str.length();
        int length2 = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 236 + length2 + str2.length() + String.valueOf(valueOf2).length());
        sb.append("InMediaTimeRangeAndSlotFulfilledNonEmptyTrigger{getTriggerId=");
        sb.append(str);
        sb.append(", getTriggerType=");
        sb.append(valueOf);
        sb.append(", shouldOnlyTriggerOnce=false, getActivatingMediaLayoutId=");
        sb.append(str2);
        sb.append(", getTimeRange=");
        sb.append(valueOf2);
        sb.append(", shouldPreventActivationOnTriggerRegistration=true, getSlotMustBeFilledFirst=true}");
        return sb.toString();
    }

    public xce() {
    }
}
