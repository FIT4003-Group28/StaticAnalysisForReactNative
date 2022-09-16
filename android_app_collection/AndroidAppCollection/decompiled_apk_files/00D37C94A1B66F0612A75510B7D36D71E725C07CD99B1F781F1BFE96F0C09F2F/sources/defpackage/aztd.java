package defpackage;
/* compiled from: PG */
/* renamed from: aztd  reason: default package */
/* loaded from: classes2.dex */
public final class aztd extends aztc {
    public static final aztd d = new aztd(1, 0);

    public aztd(int i, int i2) {
        super(i, i2);
    }

    @Override // defpackage.aztc
    public final boolean b() {
        return this.a > this.b;
    }

    @Override // defpackage.aztc
    public final boolean equals(Object obj) {
        if (obj instanceof aztd) {
            if (b() && ((aztd) obj).b()) {
                return true;
            }
            aztd aztdVar = (aztd) obj;
            if (this.a == aztdVar.a && this.b == aztdVar.b) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.aztc
    public final int hashCode() {
        if (b()) {
            return -1;
        }
        return (this.a * 31) + this.b;
    }

    @Override // defpackage.aztc
    public final String toString() {
        return this.a + ".." + this.b;
    }
}
