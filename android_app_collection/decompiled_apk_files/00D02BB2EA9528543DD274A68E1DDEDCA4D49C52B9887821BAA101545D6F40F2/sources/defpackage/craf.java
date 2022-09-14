package defpackage;
/* compiled from: PG */
/* renamed from: craf  reason: default package */
/* loaded from: classes5.dex */
public final class craf extends crar {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final dgau g;
    private final int h;
    private final dcdc<crat> i;

    public craf(int i, int i2, int i3, int i4, int i5, int i6, dgau dgauVar, int i7, dcdc<crat> dcdcVar) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = dgauVar;
        this.h = i7;
        this.i = dcdcVar;
    }

    @Override // defpackage.crar
    public final int a() {
        return this.a;
    }

    @Override // defpackage.crar
    public final int b() {
        return this.b;
    }

    @Override // defpackage.crar
    public final int c() {
        return this.c;
    }

    @Override // defpackage.crar
    public final int d() {
        return this.d;
    }

    @Override // defpackage.crar
    public final int e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof crar) {
            crar crarVar = (crar) obj;
            if (this.a == crarVar.a() && this.b == crarVar.b() && this.c == crarVar.c() && this.d == crarVar.d() && this.e == crarVar.e() && this.f == crarVar.f() && this.g.equals(crarVar.g()) && this.h == crarVar.h() && dchl.m(this.i, crarVar.i())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.crar
    public final int f() {
        return this.f;
    }

    @Override // defpackage.crar
    public final dgau g() {
        return this.g;
    }

    @Override // defpackage.crar
    public final int h() {
        return this.h;
    }

    public final int hashCode() {
        return ((((((((((((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h) * 1000003) ^ this.i.hashCode();
    }

    @Override // defpackage.crar
    public final dcdc<crat> i() {
        return this.i;
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        int i4 = this.d;
        int i5 = this.e;
        int i6 = this.f;
        String valueOf = String.valueOf(this.g);
        int i7 = this.h;
        String valueOf2 = String.valueOf(this.i);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 267 + String.valueOf(valueOf2).length());
        sb.append("Step{stepIndex=");
        sb.append(i);
        sb.append(", pointIndex=");
        sb.append(i2);
        sb.append(", stepNumber=");
        sb.append(i3);
        sb.append(", distanceFromPreviousStepMeters=");
        sb.append(i4);
        sb.append(", distanceFromStartMeters=");
        sb.append(i5);
        sb.append(", secondsFromPreviousStep=");
        sb.append(i6);
        sb.append(", maneuverType=");
        sb.append(valueOf);
        sb.append(", firstPrepareStepGuidanceIndex=");
        sb.append(i7);
        sb.append(", stepGuidances=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
