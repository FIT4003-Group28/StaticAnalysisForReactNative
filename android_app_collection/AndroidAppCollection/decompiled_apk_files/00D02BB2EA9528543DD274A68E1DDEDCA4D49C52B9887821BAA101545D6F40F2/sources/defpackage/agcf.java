package defpackage;
/* compiled from: PG */
/* renamed from: agcf  reason: default package */
/* loaded from: classes2.dex */
public final class agcf extends agia {
    private final int a;
    private final boolean b;
    private final boolean c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;
    private final ddho h;

    public agcf(int i, boolean z, boolean z2, int i2, int i3, int i4, int i5, ddho ddhoVar) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = ddhoVar;
    }

    @Override // defpackage.agia
    public final int a() {
        return this.a;
    }

    @Override // defpackage.agia
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.agia
    public final boolean c() {
        return this.c;
    }

    @Override // defpackage.agia
    public final int d() {
        return this.d;
    }

    @Override // defpackage.agia
    public final int e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof agia) {
            agia agiaVar = (agia) obj;
            if (this.a == agiaVar.a() && this.b == agiaVar.b() && this.c == agiaVar.c() && this.d == agiaVar.d() && this.e == agiaVar.e() && this.f == agiaVar.f() && this.g == agiaVar.g() && this.h.equals(agiaVar.h())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.agia
    public final int f() {
        return this.f;
    }

    @Override // defpackage.agia
    public final int g() {
        return this.g;
    }

    @Override // defpackage.agia
    public final ddho h() {
        return this.h;
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = (((this.a ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003;
        if (true == this.c) {
            i = 1231;
        }
        return ((((((((((i2 ^ i) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f) * 1000003) ^ this.g) * 1000003) ^ this.h.hashCode();
    }

    public final String toString() {
        int i = this.a;
        boolean z = this.b;
        boolean z2 = this.c;
        int i2 = this.d;
        int i3 = this.e;
        int i4 = this.f;
        int i5 = this.g;
        String valueOf = String.valueOf(this.h);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 227);
        sb.append("Options{maxLinesInHeadline=");
        sb.append(i);
        sb.append(", alwaysAllocateMaxLinesInHeadline=");
        sb.append(z);
        sb.append(", showCoverPhoto=");
        sb.append(z2);
        sb.append(", paddingTopInDp=");
        sb.append(i2);
        sb.append(", paddingBottomInDp=");
        sb.append(i3);
        sb.append(", paddingStartInDp=");
        sb.append(i4);
        sb.append(", paddingEndInDp=");
        sb.append(i5);
        sb.append(", uiType=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
