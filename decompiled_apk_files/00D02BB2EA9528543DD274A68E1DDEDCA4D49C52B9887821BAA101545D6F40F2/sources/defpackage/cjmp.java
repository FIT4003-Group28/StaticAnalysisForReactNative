package defpackage;
/* compiled from: PG */
/* renamed from: cjmp  reason: default package */
/* loaded from: classes4.dex */
public final class cjmp extends cjmr {
    private final int a;
    private final int b;

    public cjmp(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.cjmr
    public final int a() {
        return this.a;
    }

    @Override // defpackage.cjmr
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cjmr) {
            cjmr cjmrVar = (cjmr) obj;
            if (this.a == cjmrVar.a() && this.b == cjmrVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        StringBuilder sb = new StringBuilder(95);
        sb.append("GmmWindowInsetsState{systemWindowTopInsetPx=");
        sb.append(i);
        sb.append(", systemWindowBottomInsetPx=");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }
}
