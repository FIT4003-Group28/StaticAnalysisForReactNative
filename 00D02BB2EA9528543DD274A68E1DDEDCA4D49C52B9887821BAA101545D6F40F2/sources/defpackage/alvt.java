package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: alvt  reason: default package */
/* loaded from: classes.dex */
public final class alvt extends alyf {
    public final int a;
    public final int b;
    public final int c;
    public final float d;
    public final float e;
    public final float f;
    public final int g;
    public final boolean h;

    public alvt(int i, int i2, int i3, float f, float f2, float f3, int i4, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = f;
        this.e = f2;
        this.f = f3;
        this.g = i4;
        this.h = z;
    }

    @Override // defpackage.alyf
    public final int a() {
        return this.a;
    }

    @Override // defpackage.alyf
    public final int b() {
        return this.b;
    }

    @Override // defpackage.alyf
    public final int c() {
        return this.c;
    }

    @Override // defpackage.alyf
    public final float d() {
        return this.d;
    }

    @Override // defpackage.alyf
    public final float e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof alyf) {
            alyf alyfVar = (alyf) obj;
            if (this.a == alyfVar.a() && this.b == alyfVar.b() && this.c == alyfVar.c() && Float.floatToIntBits(this.d) == Float.floatToIntBits(alyfVar.d()) && Float.floatToIntBits(this.e) == Float.floatToIntBits(alyfVar.e()) && Float.floatToIntBits(this.f) == Float.floatToIntBits(alyfVar.f()) && this.g == alyfVar.g() && this.h == alyfVar.h()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.alyf
    public final float f() {
        return this.f;
    }

    @Override // defpackage.alyf
    public final int g() {
        return this.g;
    }

    @Override // defpackage.alyf
    public final boolean h() {
        return this.h;
    }

    public final int hashCode() {
        return ((((((((((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ Float.floatToIntBits(this.d)) * 1000003) ^ Float.floatToIntBits(this.e)) * 1000003) ^ Float.floatToIntBits(this.f)) * 1000003) ^ this.g) * 1000003) ^ (true != this.h ? 1237 : 1231);
    }

    @Override // defpackage.alyf
    public final alye i() {
        return new alvs(this);
    }
}
