package defpackage;
/* compiled from: PG */
/* renamed from: amyg  reason: default package */
/* loaded from: classes.dex */
public final class amyg extends amvn {
    public static final amyg a;
    private static final Object[] f;
    final transient Object[] b;
    public final transient int c;
    final transient Object[] d;
    public final transient int e;
    private final transient int g;

    static {
        Object[] objArr = new Object[0];
        f = objArr;
        a = new amyg(objArr, 0, objArr, 0, 0);
    }

    public amyg(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.b = objArr;
        this.c = i;
        this.d = objArr2;
        this.g = i2;
        this.e = i3;
    }

    @Override // defpackage.amvn
    public final boolean a() {
        return true;
    }

    @Override // defpackage.amub
    public final int b(Object[] objArr, int i) {
        System.arraycopy(this.b, 0, objArr, i, this.e);
        return i + this.e;
    }

    @Override // defpackage.amub, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        Object[] objArr = this.d;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int G = arey.G(obj);
        while (true) {
            int i = G & this.g;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            G = i + 1;
        }
    }

    @Override // defpackage.amub
    public final int d() {
        return this.e;
    }

    @Override // defpackage.amub
    public final int e() {
        return 0;
    }

    @Override // defpackage.amvn
    public final amuk h() {
        return amuk.j(this.b, this.e);
    }

    @Override // defpackage.amvn, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.c;
    }

    @Override // defpackage.amvn, defpackage.amub, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: k */
    public final amzs iterator() {
        return g().listIterator();
    }

    @Override // defpackage.amub
    public final boolean l() {
        return false;
    }

    @Override // defpackage.amub
    public final Object[] m() {
        return this.b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.e;
    }
}
