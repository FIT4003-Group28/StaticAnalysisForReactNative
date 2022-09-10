package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: amab  reason: default package */
/* loaded from: classes.dex */
public final class amab extends ambv {
    private final akry a;
    private final alyh b;
    private final amcm c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final String g;
    private final int h;
    private final boolean i;
    private final int j;

    public amab(akry akryVar, alyh alyhVar, @dzsi amcm amcmVar, int i, boolean z, boolean z2, boolean z3, String str, int i2, boolean z4) {
        if (akryVar != null) {
            this.a = akryVar;
            if (alyhVar != null) {
                this.b = alyhVar;
                this.c = amcmVar;
                if (i != 0) {
                    this.j = i;
                    this.d = z;
                    this.e = z2;
                    this.f = z3;
                    if (str != null) {
                        this.g = str;
                        this.h = i2;
                        this.i = z4;
                        return;
                    }
                    throw new NullPointerException("Null getPaintVersionId");
                }
                throw new NullPointerException("Null getFetchType");
            }
            throw new NullPointerException("Null getCoords");
        }
        throw new NullPointerException("Null getTileType");
    }

    @Override // defpackage.ambv
    public final akry a() {
        return this.a;
    }

    @Override // defpackage.ambv
    public final alyh b() {
        return this.b;
    }

    @Override // defpackage.ambv
    @dzsi
    public final amcm c() {
        return this.c;
    }

    @Override // defpackage.ambv
    public final boolean d() {
        return this.d;
    }

    @Override // defpackage.ambv
    public final boolean e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        amcm amcmVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ambv) {
            ambv ambvVar = (ambv) obj;
            if (this.a.equals(ambvVar.a()) && this.b.equals(ambvVar.b()) && ((amcmVar = this.c) != null ? amcmVar.equals(ambvVar.c()) : ambvVar.c() == null) && this.j == ambvVar.k() && this.d == ambvVar.d() && this.e == ambvVar.e() && ambvVar.f() == 0 && this.f == ambvVar.g() && this.g.equals(ambvVar.h()) && this.h == ambvVar.i() && this.i == ambvVar.j()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ambv
    public final int f() {
        return 0;
    }

    @Override // defpackage.ambv
    public final boolean g() {
        return this.f;
    }

    @Override // defpackage.ambv
    public final String h() {
        return this.g;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        amcm amcmVar = this.c;
        int i = 1237;
        int hashCode2 = (((((((((((((hashCode ^ (amcmVar == null ? 0 : amcmVar.hashCode())) * 1000003) ^ this.j) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (true != this.e ? 1237 : 1231)) * (-721379959)) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h) * 1000003;
        if (true == this.i) {
            i = 1231;
        }
        return hashCode2 ^ i;
    }

    @Override // defpackage.ambv
    public final int i() {
        return this.h;
    }

    @Override // defpackage.ambv
    public final boolean j() {
        return this.i;
    }

    @Override // defpackage.ambv
    public final int k() {
        return this.j;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(Integer.toString(this.j));
        boolean z = this.d;
        boolean z2 = this.e;
        boolean z3 = this.f;
        String str = this.g;
        int i = this.h;
        boolean z4 = this.i;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 282 + length2 + length3 + String.valueOf(valueOf4).length() + str.length());
        sb.append("SingleTileRequest{getTileType=");
        sb.append(valueOf);
        sb.append(", getCoords=");
        sb.append(valueOf2);
        sb.append(", getCallback=");
        sb.append(valueOf3);
        sb.append(", getFetchType=");
        sb.append(valueOf4);
        sb.append(", shouldFetchMissing=");
        sb.append(z);
        sb.append(", shouldFetchUpdate=");
        sb.append(z2);
        sb.append(", getExperimentEpoch=");
        sb.append(0);
        sb.append(", isUpdateRequest=");
        sb.append(z3);
        sb.append(", getPaintVersionId=");
        sb.append(str);
        sb.append(", getLastKnownServerPerTileEpoch=");
        sb.append(i);
        sb.append(", getEnableUnchangedEpochDetection=");
        sb.append(z4);
        sb.append("}");
        return sb.toString();
    }
}
