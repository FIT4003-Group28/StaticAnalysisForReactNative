package defpackage;
/* compiled from: PG */
/* renamed from: xcl  reason: default package */
/* loaded from: classes4.dex */
public final class xcl implements xcj {
    public final String a;
    public final int b;
    private final String c;
    private final apcf d;

    public xcl(String str, apcf apcfVar, String str2, int i) {
        if (str != null) {
            this.c = str;
            if (apcfVar != null) {
                this.d = apcfVar;
                if (str2 != null) {
                    this.a = str2;
                    this.b = i;
                    return;
                }
                throw new NullPointerException("Null getTriggeringLayoutId");
            }
            throw new NullPointerException("Null getTriggerType");
        }
        throw new NullPointerException("Null getTriggerId");
    }

    public static xcl e(String str, String str2, int i) {
        return new xcl(str, apcf.TRIGGER_TYPE_LAYOUT_EXITED_FOR_REASON, str2, i);
    }

    @Override // defpackage.xcj
    public final String a() {
        return this.a;
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
        if (obj instanceof xcl) {
            xcl xclVar = (xcl) obj;
            if (this.c.equals(xclVar.c) && this.d.equals(xclVar.d) && this.a.equals(xclVar.a) && this.b == xclVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.c.hashCode() ^ 1000003) * 1000003) ^ this.d.hashCode()) * 1000003) ^ 1237) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b;
    }

    public final String toString() {
        String str = this.c;
        String valueOf = String.valueOf(this.d);
        String str2 = this.a;
        int i = this.b;
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 146 + String.valueOf(valueOf).length() + str2.length());
        sb.append("LayoutExitedForReasonTrigger{getTriggerId=");
        sb.append(str);
        sb.append(", getTriggerType=");
        sb.append(valueOf);
        sb.append(", shouldOnlyTriggerOnce=false, getTriggeringLayoutId=");
        sb.append(str2);
        sb.append(", getLayoutExitReason=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }

    public xcl() {
    }
}
