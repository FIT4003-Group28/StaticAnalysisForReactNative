package defpackage;
/* compiled from: PG */
/* renamed from: crah  reason: default package */
/* loaded from: classes5.dex */
public final class crah extends crat {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final doxu f;
    private final String g;
    private final boolean h;

    public crah(int i, int i2, int i3, int i4, int i5, doxu doxuVar, String str, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = doxuVar;
        this.g = str;
        this.h = z;
    }

    @Override // defpackage.crat
    public final int a() {
        return this.a;
    }

    @Override // defpackage.crat
    public final int b() {
        return this.b;
    }

    @Override // defpackage.crat
    public final int c() {
        return this.c;
    }

    @Override // defpackage.crat
    public final int d() {
        return this.d;
    }

    @Override // defpackage.crat
    public final int e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof crat) {
            crat cratVar = (crat) obj;
            if (this.a == cratVar.a() && this.b == cratVar.b() && this.c == cratVar.c() && this.d == cratVar.d() && this.e == cratVar.e() && this.f.equals(cratVar.f()) && this.g.equals(cratVar.g()) && this.h == cratVar.h()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.crat
    public final doxu f() {
        return this.f;
    }

    @Override // defpackage.crat
    public final String g() {
        return this.g;
    }

    @Override // defpackage.crat
    public final boolean h() {
        return this.h;
    }

    public final int hashCode() {
        return ((((((((((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ (true != this.h ? 1237 : 1231);
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        int i4 = this.d;
        int i5 = this.e;
        String valueOf = String.valueOf(this.f);
        String str = this.g;
        boolean z = this.h;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 227 + String.valueOf(str).length());
        sb.append("StepGuidance{stepIndex=");
        sb.append(i);
        sb.append(", stepGuidanceIndex=");
        sb.append(i2);
        sb.append(", minRelevanceDistanceMeters=");
        sb.append(i3);
        sb.append(", minRelevanceSeconds=");
        sb.append(i4);
        sb.append(", relevanceRangeEndMeters=");
        sb.append(i5);
        sb.append(", eventType=");
        sb.append(valueOf);
        sb.append(", spokenText=");
        sb.append(str);
        sb.append(", isNextStepRelevant=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
