package defpackage;
/* compiled from: PG */
/* renamed from: wzp  reason: default package */
/* loaded from: classes4.dex */
public final class wzp implements xek {
    public final String a;
    private final String b;
    private final apcf c;

    public wzp() {
    }

    public static wzp a(String str, String str2) {
        return new wzp(str, apcf.TRIGGER_TYPE_ACTIVE_VIEW_VIEWABLE_CRITERIA_SATISFIED, str2);
    }

    @Override // defpackage.xek
    public final apcf b() {
        return this.c;
    }

    @Override // defpackage.xek
    public final String c() {
        return this.b;
    }

    @Override // defpackage.xek
    public final boolean d() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wzp) {
            wzp wzpVar = (wzp) obj;
            if (this.b.equals(wzpVar.b) && this.c.equals(wzpVar.c) && this.a.equals(wzpVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ 1237) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        String str = this.b;
        String valueOf = String.valueOf(this.c);
        String str2 = this.a;
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 117 + String.valueOf(valueOf).length() + str2.length());
        sb.append("ActiveViewViewableCriteriaSatisfiedTrigger{getTriggerId=");
        sb.append(str);
        sb.append(", getTriggerType=");
        sb.append(valueOf);
        sb.append(", shouldOnlyTriggerOnce=false, getLayoutId=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }

    public wzp(String str, apcf apcfVar, String str2) {
        if (str != null) {
            this.b = str;
            if (apcfVar != null) {
                this.c = apcfVar;
                if (str2 != null) {
                    this.a = str2;
                    return;
                }
                throw new NullPointerException("Null getLayoutId");
            }
            throw new NullPointerException("Null getTriggerType");
        }
        throw new NullPointerException("Null getTriggerId");
    }
}
