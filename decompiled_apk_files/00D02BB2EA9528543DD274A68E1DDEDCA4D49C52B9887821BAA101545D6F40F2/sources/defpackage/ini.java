package defpackage;
/* compiled from: PG */
/* renamed from: ini  reason: default package */
/* loaded from: classes6.dex */
final class ini extends ioo {
    private final int a;
    private final int b;
    private final boolean c;

    public ini(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    @Override // defpackage.ioo
    public final int a() {
        return this.a;
    }

    @Override // defpackage.ioo
    public final int b() {
        return this.b;
    }

    @Override // defpackage.ioo
    public final boolean c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ioo) {
            ioo iooVar = (ioo) obj;
            if (this.a == iooVar.a() && this.b == iooVar.b() && this.c == iooVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        boolean z = this.c;
        StringBuilder sb = new StringBuilder(74);
        sb.append("CardState{index=");
        sb.append(i);
        sb.append(", width=");
        sb.append(i2);
        sb.append(", isCompletelyVisible=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
