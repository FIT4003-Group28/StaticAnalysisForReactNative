package defpackage;
/* compiled from: PG */
/* renamed from: uyl  reason: default package */
/* loaded from: classes4.dex */
public final class uyl {
    public final ampq a;
    public final ampq b;

    public uyl() {
    }

    public uyl(ampq ampqVar, ampq ampqVar2) {
        this.a = ampqVar;
        this.b = ampqVar2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uyl) {
            uyl uylVar = (uyl) obj;
            if (this.a.equals(uylVar.a) && this.b.equals(uylVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return 78315041;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 73 + String.valueOf(valueOf2).length());
        sb.append("StartupConfigurations{metricExtensionProvider=");
        sb.append(valueOf);
        sb.append(", customTimestampProvider=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
