package defpackage;
/* compiled from: PG */
/* renamed from: xdz  reason: default package */
/* loaded from: classes4.dex */
public final class xdz implements xdv {
    private final String a;
    private final apcf b;
    private final String c;

    public xdz(String str, apcf apcfVar, String str2) {
        if (str != null) {
            this.a = str;
            if (apcfVar != null) {
                this.b = apcfVar;
                if (str2 != null) {
                    this.c = str2;
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
        return this.b;
    }

    @Override // defpackage.xek
    public final String c() {
        return this.a;
    }

    @Override // defpackage.xek
    public final boolean d() {
        return false;
    }

    @Override // defpackage.xdv
    public final String e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xdz) {
            xdz xdzVar = (xdz) obj;
            if (this.a.equals(xdzVar.a) && this.b.equals(xdzVar.b) && this.c.equals(xdzVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ 1237) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        String str2 = this.c;
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 113 + String.valueOf(valueOf).length() + str2.length());
        sb.append("SlotIdFulfilledNonEmptyTrigger{getTriggerId=");
        sb.append(str);
        sb.append(", getTriggerType=");
        sb.append(valueOf);
        sb.append(", shouldOnlyTriggerOnce=false, getTriggeringSlotId=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }

    public xdz() {
    }
}
