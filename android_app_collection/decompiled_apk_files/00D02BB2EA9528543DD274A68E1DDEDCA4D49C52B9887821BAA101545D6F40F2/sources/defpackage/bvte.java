package defpackage;
/* compiled from: PG */
/* renamed from: bvte  reason: default package */
/* loaded from: classes4.dex */
public final class bvte extends bvtf {
    private final int a;
    private final int b;
    private final int c;

    public bvte(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    @Override // defpackage.bvtf
    public final int a() {
        return this.a;
    }

    @Override // defpackage.bvtf
    public final int b() {
        return this.b;
    }

    @Override // defpackage.bvtf
    public final int c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bvtf) {
            bvtf bvtfVar = (bvtf) obj;
            if (this.a == bvtfVar.a() && this.b == bvtfVar.b() && this.c == bvtfVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }
}
