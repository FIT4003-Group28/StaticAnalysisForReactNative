package defpackage;
/* compiled from: PG */
/* renamed from: dcqo  reason: default package */
/* loaded from: classes.dex */
final class dcqo extends dcqp {
    private final int d;
    private int f = 0;
    private final String b = "A";
    private final String c = "a";
    private final String e = "PG";

    public dcqo(int i) {
        this.d = i;
    }

    @Override // defpackage.dcqp
    public final String a() {
        return this.b.replace('/', '.');
    }

    @Override // defpackage.dcqp
    public final String b() {
        return this.c;
    }

    @Override // defpackage.dcqp
    public final int c() {
        return (char) this.d;
    }

    @Override // defpackage.dcqp
    public final String d() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dcqo) {
            dcqo dcqoVar = (dcqo) obj;
            if (this.b.equals(dcqoVar.b) && this.c.equals(dcqoVar.c) && this.d == dcqoVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f;
        if (i == 0) {
            int hashCode = ((((this.b.hashCode() + 4867) * 31) + this.c.hashCode()) * 31) + this.d;
            this.f = hashCode;
            return hashCode;
        }
        return i;
    }
}
