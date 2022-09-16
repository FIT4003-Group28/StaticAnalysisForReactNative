package defpackage;
/* compiled from: PG */
/* renamed from: xdg  reason: default package */
/* loaded from: classes4.dex */
public final class xdg implements xek {
    public final String a;
    public final boolean b;
    private final String c;
    private final apcf d;

    public xdg(String str, apcf apcfVar, String str2, boolean z) {
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

    public static xdg a(String str, String str2) {
        return new xdg(str, apcf.TRIGGER_TYPE_ON_NEW_PLAYBACK_AFTER_CONTENT_VIDEO_ID, str2, false);
    }

    public static xdg e(String str, String str2) {
        return new xdg(str, apcf.TRIGGER_TYPE_ON_NEW_PLAYBACK_AFTER_CONTENT_VIDEO_ID, str2, true);
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
        if (obj instanceof xdg) {
            xdg xdgVar = (xdg) obj;
            if (this.c.equals(xdgVar.c) && this.d.equals(xdgVar.d) && this.a.equals(xdgVar.a) && this.b == xdgVar.b) {
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
        StringBuilder sb = new StringBuilder(length + 156 + String.valueOf(valueOf).length() + str2.length());
        sb.append("OnNewPlaybackAfterContentVideoIdTrigger{getTriggerId=");
        sb.append(str);
        sb.append(", getTriggerType=");
        sb.append(valueOf);
        sb.append(", shouldOnlyTriggerOnce=false, getContentVideoId=");
        sb.append(str2);
        sb.append(", onlyTriggersIfSlotNotEntered=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }

    public xdg() {
    }
}
