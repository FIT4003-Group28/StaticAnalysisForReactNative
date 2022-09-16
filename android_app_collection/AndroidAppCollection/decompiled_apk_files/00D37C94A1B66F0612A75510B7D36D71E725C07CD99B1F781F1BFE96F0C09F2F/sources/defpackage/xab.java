package defpackage;
/* compiled from: PG */
/* renamed from: xab  reason: default package */
/* loaded from: classes4.dex */
public final class xab implements xek {
    public final String a;
    private final String b;
    private final apcf c;

    public xab(String str, apcf apcfVar, String str2) {
        if (str != null) {
            this.b = str;
            if (apcfVar != null) {
                this.c = apcfVar;
                if (str2 != null) {
                    this.a = str2;
                    return;
                }
                throw new NullPointerException("Null getContentVideoId");
            }
            throw new NullPointerException("Null getTriggerType");
        }
        throw new NullPointerException("Null getTriggerId");
    }

    public static xab a(String str, String str2) {
        return new xab(str, apcf.TRIGGER_TYPE_BEFORE_CONTENT_VIDEO_ID_STARTED, str2);
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
        if (obj instanceof xab) {
            xab xabVar = (xab) obj;
            if (this.b.equals(xabVar.b) && this.c.equals(xabVar.c) && this.a.equals(xabVar.a)) {
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
        StringBuilder sb = new StringBuilder(length + 115 + String.valueOf(valueOf).length() + str2.length());
        sb.append("BeforeContentVideoIdStartedTrigger{getTriggerId=");
        sb.append(str);
        sb.append(", getTriggerType=");
        sb.append(valueOf);
        sb.append(", shouldOnlyTriggerOnce=false, getContentVideoId=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }

    public xab() {
    }
}
