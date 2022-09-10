package defpackage;
/* compiled from: PG */
/* renamed from: avkn  reason: default package */
/* loaded from: classes3.dex */
public final class avkn extends avks {
    public final dcdn<dspd, dltm> a;
    public final dcdn<dspd, dltm> b;
    public final dcep<dspd> c;
    public final boolean d;
    public final dlug e;
    public final boolean f;
    public final boolean g;
    private final dlug h;

    public avkn(dcdn<dspd, dltm> dcdnVar, dcdn<dspd, dltm> dcdnVar2, dcep<dspd> dcepVar, boolean z, @dzsi dlug dlugVar, @dzsi dlug dlugVar2, boolean z2, boolean z3) {
        if (dcdnVar != null) {
            this.a = dcdnVar;
            if (dcdnVar2 != null) {
                this.b = dcdnVar2;
                if (dcepVar != null) {
                    this.c = dcepVar;
                    this.d = z;
                    this.h = dlugVar;
                    this.e = dlugVar2;
                    this.f = z2;
                    this.g = z3;
                    return;
                }
                throw new NullPointerException("Null getRemovedRegionIds");
            }
            throw new NullPointerException("Null getChangedRegions");
        }
        throw new NullPointerException("Null getNewRegions");
    }

    @Override // defpackage.avks
    public final dcdn<dspd, dltm> a() {
        return this.a;
    }

    @Override // defpackage.avks
    public final dcdn<dspd, dltm> b() {
        return this.b;
    }

    @Override // defpackage.avks
    public final dcep<dspd> c() {
        return this.c;
    }

    @Override // defpackage.avks
    public final boolean d() {
        return this.d;
    }

    @Override // defpackage.avks
    @dzsi
    public final dlug e() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        dlug dlugVar;
        dlug dlugVar2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof avks) {
            avks avksVar = (avks) obj;
            if (this.a.equals(avksVar.a()) && this.b.equals(avksVar.b()) && this.c.equals(avksVar.c()) && this.d == avksVar.d() && ((dlugVar = this.h) != null ? dlugVar.equals(avksVar.e()) : avksVar.e() == null) && ((dlugVar2 = this.e) != null ? dlugVar2.equals(avksVar.f()) : avksVar.f() == null) && this.f == avksVar.g() && this.g == avksVar.h()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.avks
    @dzsi
    public final dlug f() {
        return this.e;
    }

    @Override // defpackage.avks
    public final boolean g() {
        return this.f;
    }

    @Override // defpackage.avks
    public final boolean h() {
        return this.g;
    }

    public final int hashCode() {
        int i;
        int i2 = 1237;
        int hashCode = (((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003;
        dlug dlugVar = this.h;
        int i3 = 0;
        if (dlugVar == null) {
            i = 0;
        } else {
            i = dlugVar.bC;
            if (i == 0) {
                i = dsst.a.b(dlugVar).c(dlugVar);
                dlugVar.bC = i;
            }
        }
        int i4 = (hashCode ^ i) * 1000003;
        dlug dlugVar2 = this.e;
        if (dlugVar2 != null && (i3 = dlugVar2.bC) == 0) {
            i3 = dsst.a.b(dlugVar2).c(dlugVar2);
            dlugVar2.bC = i3;
        }
        int i5 = (((i4 ^ i3) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003;
        if (true == this.g) {
            i2 = 1231;
        }
        return i5 ^ i2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        boolean z = this.d;
        String valueOf4 = String.valueOf(this.h);
        String valueOf5 = String.valueOf(this.e);
        boolean z2 = this.f;
        boolean z3 = this.g;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 247 + length2 + length3 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
        sb.append("OfflineRegionsStateDiff{getNewRegions=");
        sb.append(valueOf);
        sb.append(", getChangedRegions=");
        sb.append(valueOf2);
        sb.append(", getRemovedRegionIds=");
        sb.append(valueOf3);
        sb.append(", anyRecommendationStateChanges=");
        sb.append(z);
        sb.append(", getNewDynamicPaddingCoverage=");
        sb.append(valueOf4);
        sb.append(", getChangedDynamicPaddingCoverage=");
        sb.append(valueOf5);
        sb.append(", isDynamicPaddingCoverageRemoved=");
        sb.append(z2);
        sb.append(", hasPreviousState=");
        sb.append(z3);
        sb.append("}");
        return sb.toString();
    }
}
