package defpackage;
/* compiled from: PG */
/* renamed from: chtl  reason: default package */
/* loaded from: classes4.dex */
final class chtl extends chtp {
    private final chtq a;
    private final dcdc<chxl> b;
    private final dcdc<chxl> c;
    private final boolean d;
    private final boolean e;

    public chtl(chtq chtqVar, dcdc<chxl> dcdcVar, dcdc<chxl> dcdcVar2, boolean z, boolean z2) {
        this.a = chtqVar;
        if (dcdcVar != null) {
            this.b = dcdcVar;
            if (dcdcVar2 != null) {
                this.c = dcdcVar2;
                this.d = z;
                this.e = z2;
                return;
            }
            throw new NullPointerException("Null weeklyTodolistHighlightedItems");
        }
        throw new NullPointerException("Null items");
    }

    @Override // defpackage.chtp
    public final chtq a() {
        return this.a;
    }

    @Override // defpackage.chtp
    public final dcdc<chxl> b() {
        return this.b;
    }

    @Override // defpackage.chtp
    public final dcdc<chxl> c() {
        return this.c;
    }

    @Override // defpackage.chtp
    public final boolean d() {
        return this.d;
    }

    @Override // defpackage.chtp
    public final boolean e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof chtp) {
            chtp chtpVar = (chtp) obj;
            if (this.a.equals(chtpVar.a()) && dchl.m(this.b, chtpVar.b()) && dchl.m(this.c, chtpVar.c()) && this.d == chtpVar.d() && this.e == chtpVar.e()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003;
        if (true == this.e) {
            i = 1231;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        boolean z = this.d;
        boolean z2 = this.e;
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 95 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("FilteredTodolist{mode=");
        sb.append(valueOf);
        sb.append(", items=");
        sb.append(valueOf2);
        sb.append(", weeklyTodolistHighlightedItems=");
        sb.append(valueOf3);
        sb.append(", completed=");
        sb.append(z);
        sb.append(", failed=");
        sb.append(z2);
        sb.append("}");
        return sb.toString();
    }
}
