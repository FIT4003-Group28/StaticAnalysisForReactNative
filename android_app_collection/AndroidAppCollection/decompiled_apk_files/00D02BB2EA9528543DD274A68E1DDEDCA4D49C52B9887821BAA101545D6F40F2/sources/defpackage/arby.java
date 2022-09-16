package defpackage;
/* compiled from: PG */
/* renamed from: arby  reason: default package */
/* loaded from: classes.dex */
final class arby extends arda {
    private final int a;
    private final boolean b;

    public arby(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    @Override // defpackage.arda
    public final int a() {
        return this.a;
    }

    @Override // defpackage.arda
    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof arda) {
            arda ardaVar = (arda) obj;
            if (this.a == ardaVar.a() && this.b == ardaVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        int i = this.a;
        boolean z = this.b;
        StringBuilder sb = new StringBuilder(61);
        sb.append("FilledStylesCacheKey{colorArgb=");
        sb.append(i);
        sb.append(", hasOutline=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
