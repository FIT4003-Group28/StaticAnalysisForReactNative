package defpackage;
/* compiled from: PG */
/* renamed from: cjum  reason: default package */
/* loaded from: classes4.dex */
final class cjum extends cjuq {
    private final int a;
    private final long b;

    public cjum(int i, long j) {
        this.a = i;
        this.b = j;
    }

    @Override // defpackage.cjuq
    public final int a() {
        return this.a;
    }

    @Override // defpackage.cjuq
    public final long b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cjuq) {
            cjuq cjuqVar = (cjuq) obj;
            if (this.a == cjuqVar.a() && this.b == cjuqVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        long j = this.b;
        return ((i ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }
}
