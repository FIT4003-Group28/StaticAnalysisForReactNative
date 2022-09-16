package defpackage;

import com.google.cardboard.sdk.R;
/* compiled from: PG */
/* renamed from: xds  reason: default package */
/* loaded from: classes4.dex */
public final class xds implements xek {
    public final xdo a;
    private final String b;
    private final apcf c;

    public xds(String str, apcf apcfVar, xdo xdoVar) {
        if (str != null) {
            this.b = str;
            if (apcfVar != null) {
                this.c = apcfVar;
                if (xdoVar != null) {
                    this.a = xdoVar;
                    return;
                }
                throw new NullPointerException("Null getReelAdMetadata");
            }
            throw new NullPointerException("Null getTriggerType");
        }
        throw new NullPointerException("Null getTriggerId");
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
        if (obj instanceof xds) {
            xds xdsVar = (xds) obj;
            if (this.b.equals(xdsVar.b) && this.c.equals(xdsVar.c) && this.a.equals(xdsVar.a)) {
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
        String valueOf2 = String.valueOf(this.a);
        int length = str.length();
        int length2 = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + R.styleable.AppCompatTheme_windowMinWidthMajor + length2 + String.valueOf(valueOf2).length());
        sb.append("SequenceItemInPlayerSpaceUnavailableTrigger{getTriggerId=");
        sb.append(str);
        sb.append(", getTriggerType=");
        sb.append(valueOf);
        sb.append(", shouldOnlyTriggerOnce=false, getReelAdMetadata=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }

    public xds() {
    }
}
