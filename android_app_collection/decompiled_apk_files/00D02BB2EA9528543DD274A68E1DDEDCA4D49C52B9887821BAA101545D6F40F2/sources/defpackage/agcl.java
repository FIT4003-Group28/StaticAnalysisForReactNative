package defpackage;
/* compiled from: PG */
/* renamed from: agcl  reason: default package */
/* loaded from: classes2.dex */
final class agcl extends agob {
    private final int a;
    private final boolean b;
    private final int c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final boolean g;

    public agcl(int i, boolean z, int i2, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.a = i;
        this.b = z;
        this.c = i2;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
    }

    @Override // defpackage.agob
    public final int a() {
        return this.a;
    }

    @Override // defpackage.agob
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.agob
    public final int c() {
        return this.c;
    }

    @Override // defpackage.agob
    public final boolean d() {
        return this.d;
    }

    @Override // defpackage.agob
    public final boolean e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof agob) {
            agob agobVar = (agob) obj;
            if (this.a == agobVar.a() && this.b == agobVar.b() && this.c == agobVar.c() && this.d == agobVar.d() && this.e == agobVar.e() && this.f == agobVar.f() && this.g == agobVar.g()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.agob
    public final boolean f() {
        return this.f;
    }

    @Override // defpackage.agob
    public final boolean g() {
        return this.g;
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = (((((((((((this.a ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ this.c) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003;
        if (true == this.g) {
            i = 1231;
        }
        return i2 ^ i;
    }

    public final String toString() {
        int i = this.a;
        boolean z = this.b;
        int i2 = this.c;
        boolean z2 = this.d;
        boolean z3 = this.e;
        boolean z4 = this.f;
        boolean z5 = this.g;
        StringBuilder sb = new StringBuilder(200);
        sb.append("Options{shortDescriptionMaxLines=");
        sb.append(i);
        sb.append(", showCoverPhoto=");
        sb.append(z);
        sb.append(", coverPhotoHeightInDp=");
        sb.append(i2);
        sb.append(", showEditorialSummary=");
        sb.append(z2);
        sb.append(", showPlaceRank=");
        sb.append(z3);
        sb.append(", showSaveButton=");
        sb.append(z4);
        sb.append(", useFixedLayoutHeight=");
        sb.append(z5);
        sb.append("}");
        return sb.toString();
    }
}
