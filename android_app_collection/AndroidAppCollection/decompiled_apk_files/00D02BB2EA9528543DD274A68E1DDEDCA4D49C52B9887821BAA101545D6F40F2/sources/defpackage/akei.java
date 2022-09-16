package defpackage;
/* compiled from: PG */
/* renamed from: akei  reason: default package */
/* loaded from: classes2.dex */
final class akei extends akeu {
    private final dcep<btlt> a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;

    public akei(dcep<btlt> dcepVar, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.a = dcepVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
    }

    @Override // defpackage.akeu
    public final dcep<btlt> a() {
        return this.a;
    }

    @Override // defpackage.akeu
    public final int b() {
        return this.b;
    }

    @Override // defpackage.akeu
    public final int c() {
        return this.c;
    }

    @Override // defpackage.akeu
    public final int d() {
        return this.d;
    }

    @Override // defpackage.akeu
    public final int e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akeu) {
            akeu akeuVar = (akeu) obj;
            if (this.a.equals(akeuVar.a()) && this.b == akeuVar.b() && this.c == akeuVar.c() && this.d == akeuVar.d() && this.e == akeuVar.e() && this.f == akeuVar.f() && this.g == akeuVar.g() && this.h == akeuVar.h()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.akeu
    public final int f() {
        return this.f;
    }

    @Override // defpackage.akeu
    public final int g() {
        return this.g;
    }

    @Override // defpackage.akeu
    public final int h() {
        return this.h;
    }

    public final int hashCode() {
        return ((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f) * 1000003) ^ this.g) * 1000003) ^ this.h;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        int i = this.b;
        int i2 = this.c;
        int i3 = this.d;
        int i4 = this.e;
        int i5 = this.f;
        int i6 = this.g;
        int i7 = this.h;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 281);
        sb.append("EnsuredAccountOptions{accountTypeRequirements=");
        sb.append(valueOf);
        sb.append(", loginAppBarTitle=");
        sb.append(i);
        sb.append(", loginAppBarTitleContentDescription=");
        sb.append(i2);
        sb.append(", loginTitle=");
        sb.append(i3);
        sb.append(", loginSubtitle=");
        sb.append(i4);
        sb.append(", incognitoTitle=");
        sb.append(i5);
        sb.append(", incognitoTitleContentDescription=");
        sb.append(i6);
        sb.append(", incognitoSubtitle=");
        sb.append(i7);
        sb.append("}");
        return sb.toString();
    }
}
