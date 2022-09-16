package defpackage;
/* compiled from: PG */
/* renamed from: dzwi  reason: default package */
/* loaded from: classes6.dex */
public final class dzwi extends dzwg {
    public static final dzwi d = new dzwi(1, 0);

    public dzwi(int i, int i2) {
        super(i, i2);
    }

    @Override // defpackage.dzwg
    public final boolean b() {
        return this.a > this.b;
    }

    @Override // defpackage.dzwg
    public final boolean equals(Object obj) {
        if (obj instanceof dzwi) {
            if (b() && ((dzwi) obj).b()) {
                return true;
            }
            dzwi dzwiVar = (dzwi) obj;
            if (this.a == dzwiVar.a && this.b == dzwiVar.b) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dzwg
    public final int hashCode() {
        if (b()) {
            return -1;
        }
        return (this.a * 31) + this.b;
    }

    @Override // defpackage.dzwg
    public final String toString() {
        return this.a + ".." + this.b;
    }
}
