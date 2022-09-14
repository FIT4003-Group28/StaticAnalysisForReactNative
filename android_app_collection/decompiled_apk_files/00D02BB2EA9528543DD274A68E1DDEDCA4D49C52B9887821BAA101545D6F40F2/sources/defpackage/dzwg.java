package defpackage;
/* compiled from: PG */
/* renamed from: dzwg  reason: default package */
/* loaded from: classes6.dex */
public class dzwg implements Iterable<Integer> {
    public final int a;
    public final int b;
    public final int c = 1;

    public dzwg(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // java.lang.Iterable
    /* renamed from: a */
    public final dzty iterator() {
        return new dzwh(this.a, this.b, 1);
    }

    public boolean b() {
        return this.a > this.b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof dzwg) {
            if (b() && ((dzwg) obj).b()) {
                return true;
            }
            dzwg dzwgVar = (dzwg) obj;
            if (this.a == dzwgVar.a && this.b == dzwgVar.b) {
                int i = dzwgVar.c;
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
