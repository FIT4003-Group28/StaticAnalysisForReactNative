package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: qhg  reason: default package */
/* loaded from: classes7.dex */
final class qhg extends qhu {
    private final akqq a;
    private final Intent b;
    private final amuk c;
    private final String d;
    private final String e;
    private final qhs f;
    private final dbsg<String> g;

    public qhg(akqq akqqVar, Intent intent, amuk amukVar, @dzsi String str, @dzsi String str2, @dzsi qhs qhsVar, dbsg<String> dbsgVar) {
        this.a = akqqVar;
        this.b = intent;
        this.c = amukVar;
        this.d = str;
        this.e = str2;
        this.f = qhsVar;
        this.g = dbsgVar;
    }

    @Override // defpackage.qhu
    public final akqq a() {
        return this.a;
    }

    @Override // defpackage.qhu
    public final Intent b() {
        return this.b;
    }

    @Override // defpackage.qhu
    public final amuk c() {
        return this.c;
    }

    @Override // defpackage.qhu
    @dzsi
    public final String d() {
        return this.d;
    }

    @Override // defpackage.qhu
    @dzsi
    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        qhs qhsVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof qhu) {
            qhu qhuVar = (qhu) obj;
            if (this.a.equals(qhuVar.a()) && this.b.equals(qhuVar.b()) && this.c.equals(qhuVar.c()) && ((str = this.d) != null ? str.equals(qhuVar.d()) : qhuVar.d() == null) && ((str2 = this.e) != null ? str2.equals(qhuVar.e()) : qhuVar.e() == null) && ((qhsVar = this.f) != null ? qhsVar.equals(qhuVar.f()) : qhuVar.f() == null) && this.g.equals(qhuVar.g())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.qhu
    @dzsi
    public final qhs f() {
        return this.f;
    }

    @Override // defpackage.qhu
    public final dbsg<String> g() {
        return this.g;
    }

    public final int hashCode() {
        int hashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003;
        String str = this.d;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.e;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        qhs qhsVar = this.f;
        if (qhsVar != null) {
            i = qhsVar.hashCode();
        }
        return ((hashCode3 ^ i) * 1000003) ^ this.g.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String str = this.d;
        String str2 = this.e;
        String valueOf4 = String.valueOf(this.f);
        String valueOf5 = String.valueOf(this.g);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(str).length();
        int length5 = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + 105 + length2 + length3 + length4 + length5 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
        sb.append("BikesharingVehicle{location=");
        sb.append(valueOf);
        sb.append(", intent=");
        sb.append(valueOf2);
        sb.append(", provider=");
        sb.append(valueOf3);
        sb.append(", mapIconUrl=");
        sb.append(str);
        sb.append(", description=");
        sb.append(str2);
        sb.append(", batteryInfo=");
        sb.append(valueOf4);
        sb.append(", rerouteToken=");
        sb.append(valueOf5);
        sb.append("}");
        return sb.toString();
    }
}
