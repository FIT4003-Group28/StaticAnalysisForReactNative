package defpackage;
/* compiled from: PG */
/* renamed from: bnin  reason: default package */
/* loaded from: classes3.dex */
final class bnin extends bnjd {
    private final int a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final boolean g;

    public bnin(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
    }

    @Override // defpackage.bnjd
    public final int a() {
        return this.a;
    }

    @Override // defpackage.bnjd
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.bnjd
    public final boolean c() {
        return this.c;
    }

    @Override // defpackage.bnjd
    public final boolean d() {
        return this.d;
    }

    @Override // defpackage.bnjd
    public final boolean e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bnjd) {
            bnjd bnjdVar = (bnjd) obj;
            if (this.a == bnjdVar.a() && this.b == bnjdVar.b() && this.c == bnjdVar.c() && this.d == bnjdVar.d() && this.e == bnjdVar.e() && this.f == bnjdVar.f() && this.g == bnjdVar.g()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.bnjd
    public final boolean f() {
        return this.f;
    }

    @Override // defpackage.bnjd
    public final boolean g() {
        return this.g;
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = (((((((((((this.a ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003;
        if (true == this.g) {
            i = 1231;
        }
        return i2 ^ i;
    }

    public final String toString() {
        int i = this.a;
        boolean z = this.b;
        boolean z2 = this.c;
        boolean z3 = this.d;
        boolean z4 = this.e;
        boolean z5 = this.f;
        boolean z6 = this.g;
        StringBuilder sb = new StringBuilder(217);
        sb.append("Options{maxLines=");
        sb.append(i);
        sb.append(", isVisited=");
        sb.append(z);
        sb.append(", isVisitHistorySearch=");
        sb.append(z2);
        sb.append(", shouldForceHideListAnnotations=");
        sb.append(z3);
        sb.append(", shouldUseRankedAnnotations=");
        sb.append(z4);
        sb.append(", shouldUsePhotoTiles=");
        sb.append(z5);
        sb.append(", shouldUsePersonalScoreJustifications=");
        sb.append(z6);
        sb.append("}");
        return sb.toString();
    }
}
