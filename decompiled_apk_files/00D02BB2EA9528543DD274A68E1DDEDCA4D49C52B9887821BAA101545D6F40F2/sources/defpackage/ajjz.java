package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ajjz  reason: default package */
/* loaded from: classes2.dex */
public final class ajjz extends ajni {
    private final eaow b;
    private final eapd c;
    private final dcep<btlu> d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final dcep<dqym> h;
    private final dqyy i;
    private final dqza j;
    private final dqzg k;

    public ajjz(eaow eaowVar, eapd eapdVar, dcep<btlu> dcepVar, boolean z, boolean z2, boolean z3, dcep<dqym> dcepVar2, dqyy dqyyVar, dqza dqzaVar, dqzg dqzgVar) {
        this.b = eaowVar;
        this.c = eapdVar;
        this.d = dcepVar;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = dcepVar2;
        this.i = dqyyVar;
        this.j = dqzaVar;
        this.k = dqzgVar;
    }

    @Override // defpackage.ajni
    public final eaow a() {
        return this.b;
    }

    @Override // defpackage.ajni
    public final eapd b() {
        return this.c;
    }

    @Override // defpackage.ajni
    public final dcep<btlu> c() {
        return this.d;
    }

    @Override // defpackage.ajni
    public final boolean d() {
        return this.e;
    }

    @Override // defpackage.ajni
    public final boolean e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajni) {
            ajni ajniVar = (ajni) obj;
            if (this.b.equals(ajniVar.a()) && this.c.equals(ajniVar.b()) && this.d.equals(ajniVar.c()) && this.e == ajniVar.d() && this.f == ajniVar.e() && this.g == ajniVar.f() && this.h.equals(ajniVar.g()) && this.i.equals(ajniVar.h()) && this.j.equals(ajniVar.i()) && this.k.equals(ajniVar.j())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ajni
    public final boolean f() {
        return this.g;
    }

    @Override // defpackage.ajni
    public final dcep<dqym> g() {
        return this.h;
    }

    @Override // defpackage.ajni
    public final dqyy h() {
        return this.i;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003;
        if (true == this.g) {
            i = 1231;
        }
        int hashCode2 = (((hashCode ^ i) * 1000003) ^ this.h.hashCode()) * 1000003;
        dqyy dqyyVar = this.i;
        int i2 = dqyyVar.bC;
        if (i2 == 0) {
            i2 = dsst.a.b(dqyyVar).c(dqyyVar);
            dqyyVar.bC = i2;
        }
        int i3 = (hashCode2 ^ i2) * 1000003;
        dqza dqzaVar = this.j;
        int i4 = dqzaVar.bC;
        if (i4 == 0) {
            i4 = dsst.a.b(dqzaVar).c(dqzaVar);
            dqzaVar.bC = i4;
        }
        int i5 = (i3 ^ i4) * 1000003;
        dqzg dqzgVar = this.k;
        int i6 = dqzgVar.bC;
        if (i6 == 0) {
            i6 = dsst.a.b(dqzgVar).c(dqzgVar);
            dqzgVar.bC = i6;
        }
        return i5 ^ i6;
    }

    @Override // defpackage.ajni
    public final dqza i() {
        return this.j;
    }

    @Override // defpackage.ajni
    public final dqzg j() {
        return this.k;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        boolean z = this.e;
        boolean z2 = this.f;
        boolean z3 = this.g;
        String valueOf4 = String.valueOf(this.h);
        String valueOf5 = String.valueOf(this.i);
        String valueOf6 = String.valueOf(this.j);
        String valueOf7 = String.valueOf(this.k);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        int length5 = String.valueOf(valueOf5).length();
        StringBuilder sb = new StringBuilder(length + 283 + length2 + length3 + length4 + length5 + String.valueOf(valueOf6).length() + String.valueOf(valueOf7).length());
        sb.append("ReportingTask{durationBetweenCollections=");
        sb.append(valueOf);
        sb.append(", expiration=");
        sb.append(valueOf2);
        sb.append(", accounts=");
        sb.append(valueOf3);
        sb.append(", useForegroundService=");
        sb.append(z);
        sb.append(", usePeriodicCollectionTask=");
        sb.append(z2);
        sb.append(", checkInternetConnectivityBeforeReporting=");
        sb.append(z3);
        sb.append(", collectionReasons=");
        sb.append(valueOf4);
        sb.append(", locationCollectionParameters=");
        sb.append(valueOf5);
        sb.append(", locationQualityRequirements=");
        sb.append(valueOf6);
        sb.append(", locationUploadParameters=");
        sb.append(valueOf7);
        sb.append("}");
        return sb.toString();
    }
}
