package defpackage;
/* compiled from: PG */
/* renamed from: xcz  reason: default package */
/* loaded from: classes4.dex */
public final class xcz implements xek {
    public final String a;
    public final boolean b;
    public final String c;
    public final xeg d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    private final apcf h;

    public xcz(String str, apcf apcfVar, boolean z, String str2, xeg xegVar, boolean z2, boolean z3, boolean z4) {
        if (str != null) {
            this.a = str;
            if (apcfVar != null) {
                this.h = apcfVar;
                this.b = z;
                if (str2 != null) {
                    this.c = str2;
                    this.d = xegVar;
                    this.e = z2;
                    this.f = z3;
                    this.g = z4;
                    return;
                }
                throw new NullPointerException("Null getActivatingMediaLayoutId");
            }
            throw new NullPointerException("Null getTriggerType");
        }
        throw new NullPointerException("Null getTriggerId");
    }

    public static xcz a(String str, String str2, xeg xegVar, boolean z, boolean z2, boolean z3, boolean z4) {
        return new xcz(str, apcf.TRIGGER_TYPE_MEDIA_TIME_RANGE, z, str2, xegVar, z2, z3, z4);
    }

    @Override // defpackage.xek
    public final apcf b() {
        return this.h;
    }

    @Override // defpackage.xek
    public final String c() {
        return this.a;
    }

    @Override // defpackage.xek
    public final boolean d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xcz) {
            xcz xczVar = (xcz) obj;
            if (this.a.equals(xczVar.a) && this.h.equals(xczVar.h) && this.b == xczVar.b && this.c.equals(xczVar.c) && this.d.equals(xczVar.d) && this.e == xczVar.e && this.f == xczVar.f && this.g == xczVar.g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.h.hashCode()) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003;
        if (true == this.g) {
            i = 1231;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.h);
        boolean z = this.b;
        String str2 = this.c;
        String valueOf2 = String.valueOf(this.d);
        boolean z2 = this.e;
        boolean z3 = this.f;
        boolean z4 = this.g;
        int length = str.length();
        int length2 = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 262 + length2 + str2.length() + String.valueOf(valueOf2).length());
        sb.append("MediaTimeRangeTrigger{getTriggerId=");
        sb.append(str);
        sb.append(", getTriggerType=");
        sb.append(valueOf);
        sb.append(", shouldOnlyTriggerOnce=");
        sb.append(z);
        sb.append(", getActivatingMediaLayoutId=");
        sb.append(str2);
        sb.append(", getTimeRange=");
        sb.append(valueOf2);
        sb.append(", shouldPreventActivationOnTriggerRegistration=");
        sb.append(z2);
        sb.append(", shouldActivateOnVideoTimeEvent=");
        sb.append(z3);
        sb.append(", shouldAttachActiveViewDataOnActivation=");
        sb.append(z4);
        sb.append("}");
        return sb.toString();
    }

    public xcz() {
    }
}
