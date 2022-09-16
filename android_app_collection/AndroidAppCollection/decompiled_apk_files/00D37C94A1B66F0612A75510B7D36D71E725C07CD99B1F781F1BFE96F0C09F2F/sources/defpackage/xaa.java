package defpackage;
/* compiled from: PG */
/* renamed from: xaa  reason: default package */
/* loaded from: classes4.dex */
public final class xaa extends xdf {
    private final String a;
    private final apcf b;
    private final String c;

    public xaa(String str, apcf apcfVar, String str2) {
        if (str != null) {
            this.a = str;
            if (apcfVar != null) {
                this.b = apcfVar;
                if (str2 != null) {
                    this.c = str2;
                    return;
                }
                throw new NullPointerException("Null getMediaCpn");
            }
            throw new NullPointerException("Null getTriggerType");
        }
        throw new NullPointerException("Null getTriggerId");
    }

    @Override // defpackage.xdf
    public final String a() {
        return this.c;
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
        return true;
    }

    @Override // defpackage.xdf
    public final void e() {
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xdf) {
            xdf xdfVar = (xdf) obj;
            if (this.a.equals(xdfVar.c()) && this.b.equals(xdfVar.b())) {
                xdfVar.d();
                if (this.c.equals(xdfVar.a())) {
                    xdfVar.e();
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ 1231) * 1000003) ^ this.c.hashCode()) * 1000003) ^ 1231;
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        String str2 = this.c;
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 143 + String.valueOf(valueOf).length() + str2.length());
        sb.append("OnMediaPlaybackErrorTrigger{getTriggerId=");
        sb.append(str);
        sb.append(", getTriggerType=");
        sb.append(valueOf);
        sb.append(", shouldOnlyTriggerOnce=true, getMediaCpn=");
        sb.append(str2);
        sb.append(", getShouldOnlyTriggerForFatalError=true}");
        return sb.toString();
    }
}
