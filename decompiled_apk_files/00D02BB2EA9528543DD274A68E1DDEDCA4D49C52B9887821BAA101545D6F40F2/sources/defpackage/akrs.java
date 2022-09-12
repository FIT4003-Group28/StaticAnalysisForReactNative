package defpackage;
/* compiled from: PG */
/* renamed from: akrs  reason: default package */
/* loaded from: classes2.dex */
public final class akrs extends akrq {
    protected final akra a;
    public final int b;
    public final int c;
    public final float d;

    public akrs(akra akraVar, int i, int i2, float f) {
        this.a = akraVar;
        this.b = i;
        this.c = i2;
        this.d = f;
    }

    public final void a(akra akraVar) {
        akraVar.aa(this.a);
    }

    public final boolean equals(@dzsi Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof akrs) {
            akrs akrsVar = (akrs) obj;
            if (akrsVar.a.equals(this.a) && akrsVar.b == this.b && akrsVar.c == this.c && akrsVar.d == this.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() + 31) * 31) + this.b) * 31) + this.c) * 31) + ((int) (this.d * 1000.0f));
    }

    @Override // defpackage.akrq, defpackage.akqd
    public final boolean j(akra akraVar) {
        int i;
        akra akraVar2 = new akra();
        akraVar2.aa(this.a);
        akraVar2.Y(Math.toRadians(this.d));
        int i2 = akraVar2.a;
        int i3 = this.b / 2;
        int i4 = i2 + i3;
        int i5 = akraVar2.b;
        int i6 = this.c / 2;
        int i7 = i5 + i6;
        int i8 = i5 - i6;
        akraVar.Y(Math.toRadians(this.d));
        int i9 = akraVar.a;
        return i9 >= i2 - i3 && i9 <= i4 && (i = akraVar.b) <= i7 && i >= i8;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        float f = this.d;
        int i = this.b;
        int i2 = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 69);
        sb.append("Center: ");
        sb.append(valueOf);
        sb.append(" Bearing: ");
        sb.append(f);
        sb.append(" Dimensions: ");
        sb.append(i);
        sb.append("x");
        sb.append(i2);
        return sb.toString();
    }

    @Override // defpackage.akrq
    public final int w() {
        return 4;
    }

    @Override // defpackage.akrq
    public final akra x(int i) {
        if (i <= 3) {
            akra akraVar = new akra();
            if (i == 0) {
                akraVar.t((-this.b) / 2, (-this.c) / 2);
            } else if (i == 1) {
                akraVar.t((-this.b) / 2, this.c / 2);
            } else if (i == 2) {
                akraVar.t(this.b / 2, this.c / 2);
            } else if (i == 3) {
                akraVar.t(this.b / 2, (-this.c) / 2);
            }
            akra akraVar2 = this.a;
            akraVar.Y(Math.toRadians(-this.d));
            return akraVar2.C(akraVar);
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    @Override // defpackage.akrq
    public final akra y() {
        return x(3);
    }
}
