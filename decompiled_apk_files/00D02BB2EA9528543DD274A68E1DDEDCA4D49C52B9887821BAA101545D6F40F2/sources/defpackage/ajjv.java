package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ajjv  reason: default package */
/* loaded from: classes2.dex */
public final class ajjv extends ajlj {
    public final dcep<btlu> a;
    public final dced<btlu, ahwl> b;
    public final dcdn<btlu, aile> c;
    public final int d;
    public final eapd e;
    public final dkog f;
    public final int g;

    public ajjv(dcep<btlu> dcepVar, dced<btlu, ahwl> dcedVar, dcdn<btlu, aile> dcdnVar, int i, int i2, eapd eapdVar, dkog dkogVar) {
        this.a = dcepVar;
        this.b = dcedVar;
        this.c = dcdnVar;
        this.g = i;
        this.d = i2;
        this.e = eapdVar;
        this.f = dkogVar;
    }

    @Override // defpackage.ajlj
    public final dcep<btlu> a() {
        return this.a;
    }

    @Override // defpackage.ajlj
    public final dced<btlu, ahwl> b() {
        return this.b;
    }

    @Override // defpackage.ajlj
    public final dcdn<btlu, aile> c() {
        return this.c;
    }

    @Override // defpackage.ajlj
    public final int d() {
        return this.d;
    }

    @Override // defpackage.ajlj
    public final eapd e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajlj) {
            ajlj ajljVar = (ajlj) obj;
            if (this.a.equals(ajljVar.a()) && dckz.f(this.b, ajljVar.b()) && this.c.equals(ajljVar.c())) {
                int i = this.g;
                int h = ajljVar.h();
                if (i == 0) {
                    throw null;
                }
                if (i == h && this.d == ajljVar.d() && this.e.equals(ajljVar.e()) && this.f.equals(ajljVar.f())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.ajlj
    public final dkog f() {
        return this.f;
    }

    @Override // defpackage.ajlj
    public final ajli g() {
        return new ajju(this);
    }

    @Override // defpackage.ajlj
    public final int h() {
        return this.g;
    }

    public final int hashCode() {
        int hashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003;
        int i = this.g;
        if (i != 0) {
            int hashCode2 = (((((hashCode ^ i) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003;
            dkog dkogVar = this.f;
            int i2 = dkogVar.bC;
            if (i2 == 0) {
                i2 = dsst.a.b(dkogVar).c(dkogVar);
                dkogVar.bC = i2;
            }
            return hashCode2 ^ i2;
        }
        throw null;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String a = ajks.a(this.g);
        int i = this.d;
        String valueOf4 = String.valueOf(this.e);
        String valueOf5 = String.valueOf(this.f);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = a.length();
        StringBuilder sb = new StringBuilder(length + 175 + length2 + length3 + length4 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
        sb.append("LocationReportingControllerState{accounts=");
        sb.append(valueOf);
        sb.append(", sharingStates=");
        sb.append(valueOf2);
        sb.append(", reportingConfigurations=");
        sb.append(valueOf3);
        sb.append(", applicationState=");
        sb.append(a);
        sb.append(", currentDetectedActivity=");
        sb.append(i);
        sb.append(", creationTime=");
        sb.append(valueOf4);
        sb.append(", clientParameters=");
        sb.append(valueOf5);
        sb.append("}");
        return sb.toString();
    }
}
