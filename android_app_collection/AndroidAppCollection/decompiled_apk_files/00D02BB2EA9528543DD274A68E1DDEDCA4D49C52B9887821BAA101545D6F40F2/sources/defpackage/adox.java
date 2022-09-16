package defpackage;
/* compiled from: PG */
/* renamed from: adox  reason: default package */
/* loaded from: classes2.dex */
final class adox extends adpt {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final boolean f;
    private final boolean g;

    public adox(int i, int i2, int i3, int i4, int i5, boolean z, boolean z2) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = z;
        this.g = z2;
    }

    @Override // defpackage.adpt
    public final int a() {
        return this.a;
    }

    @Override // defpackage.adpt
    public final int b() {
        return this.b;
    }

    @Override // defpackage.adpt
    public final int c() {
        return this.c;
    }

    @Override // defpackage.adpt
    public final int d() {
        return this.d;
    }

    @Override // defpackage.adpt
    public final int e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof adpt) {
            adpt adptVar = (adpt) obj;
            if (this.a == adptVar.a() && this.b == adptVar.b() && this.c == adptVar.c() && this.d == adptVar.d() && this.e == adptVar.e() && this.f == adptVar.f() && this.g == adptVar.g()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.adpt
    public final boolean f() {
        return this.f;
    }

    @Override // defpackage.adpt
    public final boolean g() {
        return this.g;
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = (((((((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003;
        if (true == this.g) {
            i = 1231;
        }
        return i2 ^ i;
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        int i4 = this.d;
        int i5 = this.e;
        boolean z = this.f;
        boolean z2 = this.g;
        StringBuilder sb = new StringBuilder(217);
        sb.append("Options{paddingTopInDp=");
        sb.append(i);
        sb.append(", paddingBottomInDp=");
        sb.append(i2);
        sb.append(", paddingStartInDp=");
        sb.append(i3);
        sb.append(", paddingEndInDp=");
        sb.append(i4);
        sb.append(", marginBetweenTextAndPhotoInDp=");
        sb.append(i5);
        sb.append(", useFixedLayoutHeight=");
        sb.append(z);
        sb.append(", showPlaceImage=");
        sb.append(z2);
        sb.append("}");
        return sb.toString();
    }
}
