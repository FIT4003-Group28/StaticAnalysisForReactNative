package defpackage;
/* compiled from: PG */
/* renamed from: bwzt  reason: default package */
/* loaded from: classes4.dex */
final class bwzt extends bwzw {
    private final ilo a;
    private final dcdc<dwfl> b;
    private final dcde<bwzv, dwfl> c;
    private final boolean d;

    public bwzt(@dzsi ilo iloVar, dcdc<dwfl> dcdcVar, dcde<bwzv, dwfl> dcdeVar, boolean z) {
        this.a = iloVar;
        this.b = dcdcVar;
        this.c = dcdeVar;
        this.d = z;
    }

    @Override // defpackage.bwzw
    @dzsi
    public final ilo a() {
        return this.a;
    }

    @Override // defpackage.bwzw
    public final dcdc<dwfl> b() {
        return this.b;
    }

    @Override // defpackage.bwzw
    public final dcde<bwzv, dwfl> c() {
        return this.c;
    }

    @Override // defpackage.bwzw
    public final boolean d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bwzw) {
            bwzw bwzwVar = (bwzw) obj;
            ilo iloVar = this.a;
            if (iloVar != null ? iloVar.equals(bwzwVar.a()) : bwzwVar.a() == null) {
                if (dchl.m(this.b, bwzwVar.b()) && dckz.f(this.c, bwzwVar.c()) && this.d == bwzwVar.d()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        ilo iloVar = this.a;
        return (((((((iloVar == null ? 0 : iloVar.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (true != this.d ? 1237 : 1231);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        boolean z = this.d;
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 77 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("PhotoOverlayData{placemark=");
        sb.append(valueOf);
        sb.append(", photos=");
        sb.append(valueOf2);
        sb.append(", photosByCategory=");
        sb.append(valueOf3);
        sb.append(", showPlaceInfo=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
