package defpackage;

import android.graphics.Rect;
/* compiled from: PG */
/* renamed from: kxj  reason: default package */
/* loaded from: classes7.dex */
final class kxj extends kxo {
    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;
    private final Rect i;
    private final dcdc<Rect> j;

    public kxj(boolean z, boolean z2, boolean z3, int i, int i2, int i3, int i4, int i5, @dzsi Rect rect, dcdc<Rect> dcdcVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = i4;
        this.h = i5;
        this.i = rect;
        this.j = dcdcVar;
    }

    @Override // defpackage.kxo
    public final boolean a() {
        return this.a;
    }

    @Override // defpackage.kxo
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.kxo
    public final boolean c() {
        return this.c;
    }

    @Override // defpackage.kxo
    public final int d() {
        return this.d;
    }

    @Override // defpackage.kxo
    public final int e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        Rect rect;
        if (obj == this) {
            return true;
        }
        if (obj instanceof kxo) {
            kxo kxoVar = (kxo) obj;
            if (this.a == kxoVar.a() && this.b == kxoVar.b() && this.c == kxoVar.c() && this.d == kxoVar.d() && this.e == kxoVar.e() && this.f == kxoVar.f() && this.g == kxoVar.g() && this.h == kxoVar.h() && ((rect = this.i) != null ? rect.equals(kxoVar.i()) : kxoVar.i() == null) && dchl.m(this.j, kxoVar.j())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.kxo
    public final int f() {
        return this.f;
    }

    @Override // defpackage.kxo
    public final int g() {
        return this.g;
    }

    @Override // defpackage.kxo
    public final int h() {
        return this.h;
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003;
        if (true == this.c) {
            i = 1231;
        }
        int i3 = (((((((((((i2 ^ i) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f) * 1000003) ^ this.g) * 1000003) ^ this.h) * 1000003;
        Rect rect = this.i;
        return ((i3 ^ (rect == null ? 0 : rect.hashCode())) * 1000003) ^ this.j.hashCode();
    }

    @Override // defpackage.kxo
    @dzsi
    public final Rect i() {
        return this.i;
    }

    @Override // defpackage.kxo
    public final dcdc<Rect> j() {
        return this.j;
    }

    public final String toString() {
        boolean z = this.a;
        boolean z2 = this.b;
        boolean z3 = this.c;
        int i = this.d;
        int i2 = this.e;
        int i3 = this.f;
        int i4 = this.g;
        int i5 = this.h;
        String valueOf = String.valueOf(this.i);
        String valueOf2 = String.valueOf(this.j);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 230 + String.valueOf(valueOf2).length());
        sb.append("MapViewportConstraints{hasHeader=");
        sb.append(z);
        sb.append(", hasSidePanel=");
        sb.append(z2);
        sb.append(", hasCustomMargin=");
        sb.append(z3);
        sb.append(", customMargin=");
        sb.append(i);
        sb.append(", endSideMargin=");
        sb.append(i2);
        sb.append(", startSideMargin=");
        sb.append(i3);
        sb.append(", bottomMargin=");
        sb.append(i4);
        sb.append(", width=");
        sb.append(i5);
        sb.append(", unobscured=");
        sb.append(valueOf);
        sb.append(", cards=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
