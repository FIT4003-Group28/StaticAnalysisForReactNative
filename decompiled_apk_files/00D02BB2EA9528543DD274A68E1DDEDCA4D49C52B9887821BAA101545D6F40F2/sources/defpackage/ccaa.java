package defpackage;
/* compiled from: PG */
/* renamed from: ccaa  reason: default package */
/* loaded from: classes4.dex */
final class ccaa extends ccap {
    private final boolean e;
    private final boolean f;
    private final boolean g;

    public ccaa(boolean z, boolean z2, boolean z3) {
        this.e = z;
        this.f = z2;
        this.g = z3;
    }

    @Override // defpackage.ccaq
    public final boolean a() {
        return this.e;
    }

    @Override // defpackage.ccaq
    public final boolean b() {
        return this.f;
    }

    @Override // defpackage.ccaq
    public final boolean c() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ccap) {
            ccap ccapVar = (ccap) obj;
            if (this.e == ccapVar.a() && this.f == ccapVar.b() && this.g == ccapVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((((true != this.e ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003;
        if (true == this.g) {
            i = 1231;
        }
        return i2 ^ i;
    }

    public final String toString() {
        boolean z = this.e;
        boolean z2 = this.f;
        boolean z3 = this.g;
        StringBuilder sb = new StringBuilder(89);
        sb.append("Impl{shouldShowWhenCollapsed=");
        sb.append(z);
        sb.append(", shouldShowWhenExpanded=");
        sb.append(z2);
        sb.append(", shouldAlwaysShow=");
        sb.append(z3);
        sb.append("}");
        return sb.toString();
    }
}
