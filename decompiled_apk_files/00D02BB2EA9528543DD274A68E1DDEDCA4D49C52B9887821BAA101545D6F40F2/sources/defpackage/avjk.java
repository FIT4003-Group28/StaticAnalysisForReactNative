package defpackage;
/* compiled from: PG */
/* renamed from: avjk  reason: default package */
/* loaded from: classes3.dex */
final class avjk extends avkh {
    private final ahnc b;
    private final String c;
    private final boolean d;
    private final boolean e;

    public avjk(@dzsi ahnc ahncVar, @dzsi String str, boolean z, boolean z2) {
        this.b = ahncVar;
        this.c = str;
        this.d = z;
        this.e = z2;
    }

    @Override // defpackage.avkh
    @dzsi
    public final ahnc a() {
        return this.b;
    }

    @Override // defpackage.avkh
    @dzsi
    public final String b() {
        return this.c;
    }

    @Override // defpackage.avkh
    public final boolean c() {
        return this.d;
    }

    @Override // defpackage.avkh
    public final boolean d() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof avkh) {
            avkh avkhVar = (avkh) obj;
            ahnc ahncVar = this.b;
            if (ahncVar != null ? ahncVar.equals(avkhVar.a()) : avkhVar.a() == null) {
                String str = this.c;
                if (str != null ? str.equals(avkhVar.b()) : avkhVar.b() == null) {
                    if (this.d == avkhVar.c() && this.e == avkhVar.d()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        ahnc ahncVar = this.b;
        int i = 0;
        int hashCode = ((ahncVar == null ? 0 : ahncVar.hashCode()) ^ 1000003) * 1000003;
        String str = this.c;
        if (str != null) {
            i = str.hashCode();
        }
        int i2 = 1237;
        int i3 = (((hashCode ^ i) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003;
        if (true == this.e) {
            i2 = 1231;
        }
        return i3 ^ i2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String str = this.c;
        boolean z = this.d;
        boolean z2 = this.e;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 104 + String.valueOf(str).length());
        sb.append("UpdateOptions{deviceLocation=");
        sb.append(valueOf);
        sb.append(", schedulerExecutionPolicyId=");
        sb.append(str);
        sb.append(", criticalUpdatesOnly=");
        sb.append(z);
        sb.append(", resumeOnly=");
        sb.append(z2);
        sb.append("}");
        return sb.toString();
    }
}
