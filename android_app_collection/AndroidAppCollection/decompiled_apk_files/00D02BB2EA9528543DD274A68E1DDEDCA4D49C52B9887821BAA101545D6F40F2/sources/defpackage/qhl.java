package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: qhl  reason: default package */
/* loaded from: classes7.dex */
public final class qhl extends qib {
    private final amuk a;
    private final String b;
    private final qhu c;
    private final dcdc<qhu> d;
    private final dquj e;
    private final String f;
    private final String g;
    private final boolean h;
    private final String i;
    private final qic j;

    public qhl(amuk amukVar, String str, qhu qhuVar, dcdc<qhu> dcdcVar, dquj dqujVar, @dzsi String str2, @dzsi String str3, boolean z, @dzsi String str4, @dzsi qic qicVar) {
        this.a = amukVar;
        this.b = str;
        this.c = qhuVar;
        this.d = dcdcVar;
        this.e = dqujVar;
        this.f = str2;
        this.g = str3;
        this.h = z;
        this.i = str4;
        this.j = qicVar;
    }

    @Override // defpackage.qib
    public final amuk a() {
        return this.a;
    }

    @Override // defpackage.qib
    public final String b() {
        return this.b;
    }

    @Override // defpackage.qib
    public final qhu c() {
        return this.c;
    }

    @Override // defpackage.qib
    public final dcdc<qhu> d() {
        return this.d;
    }

    @Override // defpackage.qib
    public final dquj e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        qic qicVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof qib) {
            qib qibVar = (qib) obj;
            if (this.a.equals(qibVar.a()) && this.b.equals(qibVar.b()) && this.c.equals(qibVar.c()) && dchl.m(this.d, qibVar.d()) && this.e.equals(qibVar.e()) && ((str = this.f) != null ? str.equals(qibVar.f()) : qibVar.f() == null) && ((str2 = this.g) != null ? str2.equals(qibVar.g()) : qibVar.g() == null) && this.h == qibVar.h() && ((str3 = this.i) != null ? str3.equals(qibVar.i()) : qibVar.i() == null) && ((qicVar = this.j) != null ? qicVar.equals(qibVar.j()) : qibVar.j() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.qib
    @dzsi
    public final String f() {
        return this.f;
    }

    @Override // defpackage.qib
    @dzsi
    public final String g() {
        return this.g;
    }

    @Override // defpackage.qib
    public final boolean h() {
        return this.h;
    }

    public final int hashCode() {
        int hashCode = (((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        dquj dqujVar = this.e;
        int i = dqujVar.bC;
        if (i == 0) {
            i = dsst.a.b(dqujVar).c(dqujVar);
            dqujVar.bC = i;
        }
        int i2 = (hashCode ^ i) * 1000003;
        String str = this.f;
        int i3 = 0;
        int hashCode2 = (i2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.g;
        int hashCode3 = (((hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003) ^ (true != this.h ? 1237 : 1231)) * 1000003;
        String str3 = this.i;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        qic qicVar = this.j;
        if (qicVar != null) {
            i3 = qicVar.hashCode();
        }
        return hashCode4 ^ i3;
    }

    @Override // defpackage.qib
    @dzsi
    public final String i() {
        return this.i;
    }

    @Override // defpackage.qib
    @dzsi
    public final qic j() {
        return this.j;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String str = this.b;
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.e);
        String str2 = this.f;
        String str3 = this.g;
        boolean z = this.h;
        String str4 = this.i;
        String valueOf5 = String.valueOf(this.j);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(str).length();
        int length3 = String.valueOf(valueOf2).length();
        int length4 = String.valueOf(valueOf3).length();
        int length5 = String.valueOf(valueOf4).length();
        int length6 = String.valueOf(str2).length();
        int length7 = String.valueOf(str3).length();
        StringBuilder sb = new StringBuilder(length + 192 + length2 + length3 + length4 + length5 + length6 + length7 + String.valueOf(str4).length() + String.valueOf(valueOf5).length());
        sb.append("DocklessBikesharingResult{provider=");
        sb.append(valueOf);
        sb.append(", partnerAppLinkText=");
        sb.append(str);
        sb.append(", recommendedVehicle=");
        sb.append(valueOf2);
        sb.append(", alternativeVehicles=");
        sb.append(valueOf3);
        sb.append(", fareEstimate=");
        sb.append(valueOf4);
        sb.append(", additionalDetails=");
        sb.append(str2);
        sb.append(", disclaimer=");
        sb.append(str3);
        sb.append(", hasAdsBadge=");
        sb.append(z);
        sb.append(", iconId=");
        sb.append(str4);
        sb.append(", walkToVehicle=");
        sb.append(valueOf5);
        sb.append("}");
        return sb.toString();
    }
}
