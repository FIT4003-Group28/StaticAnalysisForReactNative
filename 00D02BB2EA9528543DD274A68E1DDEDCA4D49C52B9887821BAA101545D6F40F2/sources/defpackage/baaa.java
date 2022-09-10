package defpackage;
/* compiled from: PG */
/* renamed from: baaa  reason: default package */
/* loaded from: classes3.dex */
public final class baaa extends baak {
    private final akqi a;
    private final akqq b;
    private final boolean c;
    private final String d;

    public baaa(akqi akqiVar, akqq akqqVar, boolean z, String str) {
        if (akqiVar != null) {
            this.a = akqiVar;
            if (akqqVar != null) {
                this.b = akqqVar;
                this.c = z;
                if (str != null) {
                    this.d = str;
                    return;
                }
                throw new NullPointerException("Null singleLineAddress");
            }
            throw new NullPointerException("Null latLng");
        }
        throw new NullPointerException("Null featureId");
    }

    @Override // defpackage.baak
    public final akqi a() {
        return this.a;
    }

    @Override // defpackage.baak
    public final akqq b() {
        return this.b;
    }

    @Override // defpackage.baak
    public final boolean c() {
        return this.c;
    }

    @Override // defpackage.baak
    public final String d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof baak) {
            baak baakVar = (baak) obj;
            if (this.a.equals(baakVar.a()) && this.b.equals(baakVar.b()) && this.c == baakVar.c() && this.d.equals(baakVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        boolean z = this.c;
        String str = this.d;
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 67 + String.valueOf(valueOf2).length() + str.length());
        sb.append("PlaceData{featureId=");
        sb.append(valueOf);
        sb.append(", latLng=");
        sb.append(valueOf2);
        sb.append(", isGeocode=");
        sb.append(z);
        sb.append(", singleLineAddress=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
