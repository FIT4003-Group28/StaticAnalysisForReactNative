package defpackage;
/* compiled from: PG */
/* renamed from: cqod  reason: default package */
/* loaded from: classes5.dex */
final class cqod extends cqoz {
    private final int a;
    private final int b;
    private final cqtv c;

    public cqod(int i, int i2, cqtv cqtvVar) {
        this.a = i;
        this.b = i2;
        if (cqtvVar != null) {
            this.c = cqtvVar;
            return;
        }
        throw new NullPointerException("Null margin");
    }

    @Override // defpackage.cqoz
    public final int a() {
        return this.a;
    }

    @Override // defpackage.cqoz
    public final int b() {
        return this.b;
    }

    @Override // defpackage.cqoz
    public final cqtv c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cqoz) {
            cqoz cqozVar = (cqoz) obj;
            if (this.a == cqozVar.a() && this.b == cqozVar.b() && this.c.equals(cqozVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ ((cqrp) this.c).a;
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        String valueOf = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 55);
        sb.append("Margin{viewId=");
        sb.append(i);
        sb.append(", anchor=");
        sb.append(i2);
        sb.append(", margin=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
