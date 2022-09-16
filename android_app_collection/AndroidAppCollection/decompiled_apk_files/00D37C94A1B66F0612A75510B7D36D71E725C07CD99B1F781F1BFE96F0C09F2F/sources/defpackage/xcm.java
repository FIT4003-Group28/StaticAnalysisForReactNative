package defpackage;
/* compiled from: PG */
/* renamed from: xcm  reason: default package */
/* loaded from: classes4.dex */
public final class xcm implements xcj, xdv {
    public final String a;
    public final String b;
    private final String c;
    private final apcf d;

    public xcm(String str, apcf apcfVar, String str2, String str3) {
        if (str != null) {
            this.c = str;
            if (apcfVar != null) {
                this.d = apcfVar;
                this.a = str2;
                if (str3 != null) {
                    this.b = str3;
                    return;
                }
                throw new NullPointerException("Null getAssociatedSlotId");
            }
            throw new NullPointerException("Null getTriggerType");
        }
        throw new NullPointerException("Null getTriggerId");
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

    @Override // defpackage.xdv
    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xcm) {
            xcm xcmVar = (xcm) obj;
            if (this.c.equals(xcmVar.c) && this.d.equals(xcmVar.d) && this.a.equals(xcmVar.a) && this.b.equals(xcmVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.c.hashCode() ^ 1000003) * 1000003) ^ this.d.hashCode()) * 1000003) ^ 1237) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String str = this.c;
        String valueOf = String.valueOf(this.d);
        String str2 = this.a;
        String str3 = this.b;
        int length = str.length();
        int length2 = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 142 + length2 + str2.length() + str3.length());
        sb.append("LayoutIdEnteredAndSlotFilledTrigger{getTriggerId=");
        sb.append(str);
        sb.append(", getTriggerType=");
        sb.append(valueOf);
        sb.append(", shouldOnlyTriggerOnce=false, getAssociatedLayoutId=");
        sb.append(str2);
        sb.append(", getAssociatedSlotId=");
        sb.append(str3);
        sb.append("}");
        return sb.toString();
    }

    public xcm() {
    }
}
