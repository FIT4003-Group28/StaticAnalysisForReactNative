package defpackage;
/* compiled from: PG */
/* renamed from: xcq  reason: default package */
/* loaded from: classes4.dex */
public final class xcq implements xek {
    private final String a;
    private final apcf b;
    private final String c;

    public xcq(String str, apcf apcfVar, String str2) {
        if (str != null) {
            this.a = str;
            if (apcfVar != null) {
                this.b = apcfVar;
                if (str2 != null) {
                    this.c = str2;
                    return;
                }
                throw new NullPointerException("Null getCuePointIdentifier");
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
        if (obj instanceof xcq) {
            xcq xcqVar = (xcq) obj;
            if (this.a.equals(xcqVar.a) && this.b.equals(xcqVar.b) && this.c.equals(xcqVar.c)) {
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
        StringBuilder sb = new StringBuilder(length + 112 + String.valueOf(valueOf).length() + str2.length());
        sb.append("LiveStreamBreakEndedTrigger{getTriggerId=");
        sb.append(str);
        sb.append(", getTriggerType=");
        sb.append(valueOf);
        sb.append(", shouldOnlyTriggerOnce=false, getCuePointIdentifier=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }

    public xcq() {
    }
}
