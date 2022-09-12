package defpackage;
/* compiled from: PG */
/* renamed from: abww  reason: default package */
/* loaded from: classes2.dex */
final class abww extends abyr {
    private final dhjx a;
    private final String b;
    private final dqmi c;
    private final Boolean d;
    private final dqlu e;

    public abww(@dzsi dhjx dhjxVar, @dzsi String str, @dzsi dqmi dqmiVar, Boolean bool, dqlu dqluVar) {
        this.a = dhjxVar;
        this.b = str;
        this.c = dqmiVar;
        this.d = bool;
        this.e = dqluVar;
    }

    @Override // defpackage.abyr
    @dzsi
    public final dhjx a() {
        return this.a;
    }

    @Override // defpackage.abyr
    @dzsi
    public final String b() {
        return this.b;
    }

    @Override // defpackage.abyr
    @dzsi
    public final dqmi c() {
        return this.c;
    }

    @Override // defpackage.abyr
    public final Boolean d() {
        return this.d;
    }

    @Override // defpackage.abyr
    public final dqlu e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof abyr) {
            abyr abyrVar = (abyr) obj;
            dhjx dhjxVar = this.a;
            if (dhjxVar != null ? dhjxVar.equals(abyrVar.a()) : abyrVar.a() == null) {
                String str = this.b;
                if (str != null ? str.equals(abyrVar.b()) : abyrVar.b() == null) {
                    dqmi dqmiVar = this.c;
                    if (dqmiVar != null ? dqmiVar.equals(abyrVar.c()) : abyrVar.c() == null) {
                        if (this.d.equals(abyrVar.d()) && this.e.equals(abyrVar.e())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String str = this.b;
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.e);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(str).length();
        int length3 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 144 + length2 + length3 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("PaginationRequest{cameraForLastPhotosRequest=");
        sb.append(valueOf);
        sb.append(", continuationToken=");
        sb.append(str);
        sb.append(", rankingStrategyForLastPhotosRequest=");
        sb.append(valueOf2);
        sb.append(", canFetchMorePhotos=");
        sb.append(valueOf3);
        sb.append(", filteringOptions=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        int i;
        dhjx dhjxVar = this.a;
        int i2 = 0;
        if (dhjxVar == null) {
            i = 0;
        } else {
            i = dhjxVar.bC;
            if (i == 0) {
                i = dsst.a.b(dhjxVar).c(dhjxVar);
                dhjxVar.bC = i;
            }
        }
        int i3 = (i ^ 1000003) * 1000003;
        String str = this.b;
        int hashCode = (i3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        dqmi dqmiVar = this.c;
        if (dqmiVar != null) {
            i2 = dqmiVar.hashCode();
        }
        int hashCode2 = (((i2 ^ hashCode) * 1000003) ^ this.d.hashCode()) * 1000003;
        dqlu dqluVar = this.e;
        int i4 = dqluVar.bC;
        if (i4 == 0) {
            i4 = dsst.a.b(dqluVar).c(dqluVar);
            dqluVar.bC = i4;
        }
        return hashCode2 ^ i4;
    }
}
