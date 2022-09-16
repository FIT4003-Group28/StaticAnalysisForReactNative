package defpackage;
/* compiled from: PG */
/* renamed from: xdw  reason: default package */
/* loaded from: classes4.dex */
public final class xdw implements xdv {
    public final String a;
    private final String b;
    private final apcf c;

    public xdw(String str, apcf apcfVar, String str2) {
        if (str != null) {
            this.b = str;
            if (apcfVar != null) {
                this.c = apcfVar;
                if (str2 != null) {
                    this.a = str2;
                    return;
                }
                throw new NullPointerException("Null getTriggeringSlotId");
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

    @Override // defpackage.xdv
    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xdw) {
            xdw xdwVar = (xdw) obj;
            if (this.b.equals(xdwVar.b) && this.c.equals(xdwVar.c) && this.a.equals(xdwVar.a)) {
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
        StringBuilder sb = new StringBuilder(length + 110 + String.valueOf(valueOf).length() + str2.length());
        sb.append("SlotIdEnterRequestedTrigger{getTriggerId=");
        sb.append(str);
        sb.append(", getTriggerType=");
        sb.append(valueOf);
        sb.append(", shouldOnlyTriggerOnce=false, getTriggeringSlotId=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }

    public xdw() {
    }
}
