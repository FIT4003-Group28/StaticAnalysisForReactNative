package defpackage;
/* compiled from: PG */
/* renamed from: bpyo  reason: default package */
/* loaded from: classes4.dex */
final class bpyo extends bqcl {
    private final boolean a;
    private final boolean b;
    private final boolean c;

    public bpyo(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    @Override // defpackage.bqcl
    public final boolean a() {
        return this.a;
    }

    @Override // defpackage.bqcl
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.bqcl
    public final boolean c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bqcl) {
            bqcl bqclVar = (bqcl) obj;
            if (this.a == bqclVar.a() && this.b == bqclVar.b() && this.c == bqclVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003;
        if (true == this.c) {
            i = 1231;
        }
        return i2 ^ i;
    }

    public final String toString() {
        boolean z = this.a;
        boolean z2 = this.b;
        boolean z3 = this.c;
        StringBuilder sb = new StringBuilder(92);
        sb.append("EnabledActions{addButtonEnabled=");
        sb.append(z);
        sb.append(", removeButtonEnabled=");
        sb.append(z2);
        sb.append(", finishButtonEnabled=");
        sb.append(z3);
        sb.append("}");
        return sb.toString();
    }
}
