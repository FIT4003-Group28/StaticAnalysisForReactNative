package defpackage;
/* compiled from: PG */
/* renamed from: aztc  reason: default package */
/* loaded from: classes2.dex */
public class aztc implements Iterable {
    public final int a;
    public final int b;
    public final int c = 1;

    public aztc(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // java.lang.Iterable
    /* renamed from: a */
    public final azqs iterator() {
        return new azqs(this.a, this.b, 1);
    }

    public boolean b() {
        return this.a > this.b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof aztc) {
            if (b() && ((aztc) obj).b()) {
                return true;
            }
            aztc aztcVar = (aztc) obj;
            if (this.a == aztcVar.a && this.b == aztcVar.b) {
                int i = aztcVar.c;
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (b()) {
            return -1;
        }
        return (((this.a * 31) + this.b) * 31) + 1;
    }

    public String toString() {
        return this.a + ".." + this.b + " step 1";
    }
}
