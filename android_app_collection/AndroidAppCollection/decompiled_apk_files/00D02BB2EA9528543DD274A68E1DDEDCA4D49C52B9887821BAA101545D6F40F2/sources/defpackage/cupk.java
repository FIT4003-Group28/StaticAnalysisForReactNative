package defpackage;

import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: cupk  reason: default package */
/* loaded from: classes5.dex */
final class cupk extends cuqq {
    private final cuqn a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;

    public cupk(cuqn cuqnVar, int i, int i2, int i3, int i4) {
        this.a = cuqnVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    @Override // defpackage.cuqq
    public final cuqn a() {
        return this.a;
    }

    @Override // defpackage.cuqq
    public final int b() {
        return this.b;
    }

    @Override // defpackage.cuqq
    public final int c() {
        return this.c;
    }

    @Override // defpackage.cuqq
    public final int d() {
        return this.d;
    }

    @Override // defpackage.cuqq
    public final int e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cuqq) {
            cuqq cuqqVar = (cuqq) obj;
            if (this.a.equals(cuqqVar.a()) && this.b == cuqqVar.b() && this.c == cuqqVar.c() && this.d == cuqqVar.d() && this.e == cuqqVar.e()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        int i = this.b;
        int i2 = this.c;
        int i3 = this.d;
        int i4 = this.e;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + R.styleable.AppCompatTheme_windowFixedHeightMajor);
        sb.append("UiElement{element=");
        sb.append(valueOf);
        sb.append(", paddingStart=");
        sb.append(i);
        sb.append(", paddingTop=");
        sb.append(i2);
        sb.append(", paddingEnd=");
        sb.append(i3);
        sb.append(", paddingBottom=");
        sb.append(i4);
        sb.append("}");
        return sb.toString();
    }
}
