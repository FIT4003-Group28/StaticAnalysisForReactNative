package defpackage;

import android.graphics.drawable.Drawable;
/* compiled from: PG */
/* renamed from: cqlp  reason: default package */
/* loaded from: classes5.dex */
final class cqlp extends cqls {
    private final Drawable.ConstantState a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final boolean f;

    public cqlp(Drawable.ConstantState constantState, int i, int i2, int i3, int i4, boolean z) {
        if (constantState != null) {
            this.a = constantState;
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
            this.f = z;
            return;
        }
        throw new NullPointerException("Null constantState");
    }

    @Override // defpackage.cqls
    public final Drawable.ConstantState a() {
        return this.a;
    }

    @Override // defpackage.cqls
    public final int b() {
        return this.b;
    }

    @Override // defpackage.cqls
    public final int c() {
        return this.c;
    }

    @Override // defpackage.cqls
    public final int d() {
        return this.d;
    }

    @Override // defpackage.cqls
    public final int e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cqls) {
            cqls cqlsVar = (cqls) obj;
            if (this.a.equals(cqlsVar.a()) && this.b == cqlsVar.b() && this.c == cqlsVar.c() && this.d == cqlsVar.d() && this.e == cqlsVar.e() && this.f == cqlsVar.f()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cqls
    public final boolean f() {
        return this.f;
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ (true != this.f ? 1237 : 1231);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        int i = this.b;
        int i2 = this.c;
        int i3 = this.d;
        int i4 = this.e;
        boolean z = this.f;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 162);
        sb.append("DropShadowBitmapState{constantState=");
        sb.append(valueOf);
        sb.append(", shadowRadiusPx=");
        sb.append(i);
        sb.append(", shadowDxPx=");
        sb.append(i2);
        sb.append(", shadowDyPx=");
        sb.append(i3);
        sb.append(", shadowColor=");
        sb.append(i4);
        sb.append(", keepOriginalSize=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
