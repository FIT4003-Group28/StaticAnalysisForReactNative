package defpackage;
/* compiled from: PG */
/* renamed from: cvwu  reason: default package */
/* loaded from: classes5.dex */
public final class cvwu<AccountT> extends cvwy<AccountT> {
    private final nc<AccountT> a;
    private final cwjw<AccountT> b;
    private final dtgb c;
    private final cwla d;
    private final cvub<AccountT> e;
    private final cvub<AccountT> f;
    private final dbsg<Integer> g;
    private final dbsg<cvub<AccountT>> h;
    private final cwii i;

    public cvwu(nc<AccountT> ncVar, cwjw<AccountT> cwjwVar, dtgb dtgbVar, cwla cwlaVar, cvub<AccountT> cvubVar, cvub<AccountT> cvubVar2, dbsg<Integer> dbsgVar, dbsg<cvub<AccountT>> dbsgVar2, cwii cwiiVar) {
        this.a = ncVar;
        this.b = cwjwVar;
        this.c = dtgbVar;
        this.d = cwlaVar;
        this.e = cvubVar;
        this.f = cvubVar2;
        this.g = dbsgVar;
        this.h = dbsgVar2;
        this.i = cwiiVar;
    }

    @Override // defpackage.cvwy
    public final nc<AccountT> a() {
        return this.a;
    }

    @Override // defpackage.cvwy
    public final cwjw<AccountT> b() {
        return this.b;
    }

    @Override // defpackage.cvwy
    public final dtgb c() {
        return this.c;
    }

    @Override // defpackage.cvwy
    public final cwla d() {
        return this.d;
    }

    @Override // defpackage.cvwy
    public final cvub<AccountT> e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cvwy) {
            cvwy cvwyVar = (cvwy) obj;
            if (this.a.equals(cvwyVar.a()) && this.b.equals(cvwyVar.b()) && this.c.equals(cvwyVar.c()) && this.d.equals(cvwyVar.d()) && this.e.equals(cvwyVar.e()) && this.f.equals(cvwyVar.f()) && this.g.equals(cvwyVar.g()) && this.h.equals(cvwyVar.h()) && this.i.equals(cvwyVar.i())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cvwy
    public final cvub<AccountT> f() {
        return this.f;
    }

    @Override // defpackage.cvwy
    public final dbsg<Integer> g() {
        return this.g;
    }

    @Override // defpackage.cvwy
    public final dbsg<cvub<AccountT>> h() {
        return this.h;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        dtgb dtgbVar = this.c;
        int i = dtgbVar.bC;
        if (i == 0) {
            i = dsst.a.b(dtgbVar).c(dtgbVar);
            dtgbVar.bC = i;
        }
        return ((((((((((((hashCode ^ i) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode();
    }

    @Override // defpackage.cvwy
    public final cwii i() {
        return this.i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        String valueOf6 = String.valueOf(this.f);
        String valueOf7 = String.valueOf(this.g);
        String valueOf8 = String.valueOf(this.h);
        String valueOf9 = String.valueOf(this.i);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        int length5 = String.valueOf(valueOf5).length();
        int length6 = String.valueOf(valueOf6).length();
        int length7 = String.valueOf(valueOf7).length();
        StringBuilder sb = new StringBuilder(length + 206 + length2 + length3 + length4 + length5 + length6 + length7 + String.valueOf(valueOf8).length() + String.valueOf(valueOf9).length());
        sb.append("PolicyFooterSpec{accountSupplier=");
        sb.append(valueOf);
        sb.append(", eventLogger=");
        sb.append(valueOf2);
        sb.append(", logContext=");
        sb.append(valueOf3);
        sb.append(", visualElements=");
        sb.append(valueOf4);
        sb.append(", privacyPolicyClickListener=");
        sb.append(valueOf5);
        sb.append(", termsOfServiceClickListener=");
        sb.append(valueOf6);
        sb.append(", customItemLabelStringId=");
        sb.append(valueOf7);
        sb.append(", customItemClickListener=");
        sb.append(valueOf8);
        sb.append(", clickRunnables=");
        sb.append(valueOf9);
        sb.append("}");
        return sb.toString();
    }
}
