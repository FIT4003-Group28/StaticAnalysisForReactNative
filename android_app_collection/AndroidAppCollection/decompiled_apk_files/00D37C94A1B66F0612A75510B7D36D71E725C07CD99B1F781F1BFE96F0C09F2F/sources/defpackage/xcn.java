package defpackage;
/* compiled from: PG */
/* renamed from: xcn  reason: default package */
/* loaded from: classes4.dex */
public final class xcn implements xcj {
    public final String a;
    private final String b;
    private final apcf c;

    public xcn(String str, apcf apcfVar, String str2) {
        if (str != null) {
            this.b = str;
            if (apcfVar != null) {
                this.c = apcfVar;
                this.a = str2;
                return;
            }
            throw new NullPointerException("Null getTriggerType");
        }
        throw new NullPointerException("Null getTriggerId");
    }

    public static xcn e(String str, String str2) {
        return new xcn(str, apcf.TRIGGER_TYPE_LAYOUT_ID_ENTERED, str2);
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
        if (obj instanceof xcn) {
            xcn xcnVar = (xcn) obj;
            if (this.b.equals(xcnVar.b) && this.c.equals(xcnVar.c) && this.a.equals(xcnVar.a)) {
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
        StringBuilder sb = new StringBuilder(length + 107 + String.valueOf(valueOf).length() + str2.length());
        sb.append("LayoutIdEnteredTrigger{getTriggerId=");
        sb.append(str);
        sb.append(", getTriggerType=");
        sb.append(valueOf);
        sb.append(", shouldOnlyTriggerOnce=false, getTriggeringLayoutId=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }

    public xcn() {
    }
}
