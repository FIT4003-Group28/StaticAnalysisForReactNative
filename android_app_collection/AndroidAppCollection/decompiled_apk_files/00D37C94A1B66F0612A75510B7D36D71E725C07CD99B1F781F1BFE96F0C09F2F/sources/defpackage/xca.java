package defpackage;
/* compiled from: PG */
/* renamed from: xca  reason: default package */
/* loaded from: classes4.dex */
public final class xca implements xek {
    public final String a;
    public final boolean b;
    private final String c;
    private final apcf d;

    public xca(String str, apcf apcfVar, String str2, boolean z) {
        if (str != null) {
            this.c = str;
            if (apcfVar != null) {
                this.d = apcfVar;
                if (str2 != null) {
                    this.a = str2;
                    this.b = z;
                    return;
                }
                throw new NullPointerException("Null getContentVideoId");
            }
            throw new NullPointerException("Null getTriggerType");
        }
        throw new NullPointerException("Null getTriggerId");
    }

    public static xca a(String str, String str2, boolean z) {
        return new xca(str, apcf.TRIGGER_TYPE_CONTENT_VIDEO_ID_ENDED, str2, z);
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
        if (obj instanceof xca) {
            xca xcaVar = (xca) obj;
            if (this.c.equals(xcaVar.c) && this.d.equals(xcaVar.d) && this.a.equals(xcaVar.a) && this.b == xcaVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((((this.c.hashCode() ^ 1000003) * 1000003) ^ this.d.hashCode()) * 1000003) ^ 1237) * 1000003) ^ this.a.hashCode()) * 1000003;
        if (true == this.b) {
            i = 1231;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String str = this.c;
        String valueOf = String.valueOf(this.d);
        String str2 = this.a;
        boolean z = this.b;
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 159 + String.valueOf(valueOf).length() + str2.length());
        sb.append("ContentVideoIdEndedTrigger{getTriggerId=");
        sb.append(str);
        sb.append(", getTriggerType=");
        sb.append(valueOf);
        sb.append(", shouldOnlyTriggerOnce=false, getContentVideoId=");
        sb.append(str2);
        sb.append(", shouldPreventActivationOnTriggerRegistration=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }

    public xca() {
    }
}
