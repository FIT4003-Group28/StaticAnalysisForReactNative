package defpackage;
/* compiled from: PG */
/* renamed from: xco  reason: default package */
/* loaded from: classes4.dex */
public final class xco implements xcj {
    public final String a;
    private final String b;
    private final apcf c;

    public xco(String str, apcf apcfVar, String str2) {
        if (str != null) {
            this.b = str;
            if (apcfVar != null) {
                this.c = apcfVar;
                if (str2 != null) {
                    this.a = str2;
                    return;
                }
                throw new NullPointerException("Null getTriggeringLayoutId");
            }
            throw new NullPointerException("Null getTriggerType");
        }
        throw new NullPointerException("Null getTriggerId");
    }

    public static xco e(String str, String str2) {
        return new xco(str, apcf.TRIGGER_TYPE_LAYOUT_ID_EXITED, str2);
    }

    @Override // defpackage.xcj
    public final String a() {
        return this.a;
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
        if (obj instanceof xco) {
            xco xcoVar = (xco) obj;
            if (this.b.equals(xcoVar.b) && this.c.equals(xcoVar.c) && this.a.equals(xcoVar.a)) {
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
        StringBuilder sb = new StringBuilder(length + 106 + String.valueOf(valueOf).length() + str2.length());
        sb.append("LayoutIdExitedTrigger{getTriggerId=");
        sb.append(str);
        sb.append(", getTriggerType=");
        sb.append(valueOf);
        sb.append(", shouldOnlyTriggerOnce=false, getTriggeringLayoutId=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }

    public xco() {
    }
}
