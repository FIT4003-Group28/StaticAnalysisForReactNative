package defpackage;

import java.util.Arrays;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: amvl  reason: default package */
/* loaded from: classes.dex */
public final class amvl extends amtz {
    Object[] d;
    private int e;

    public amvl() {
        super(4);
    }

    @Override // defpackage.amtz, defpackage.amua
    /* renamed from: h */
    public final void c(Object obj) {
        obj.getClass();
        if (this.d != null) {
            int f = amvn.f(this.b);
            Object[] objArr = this.d;
            int length = objArr.length;
            if (f <= length) {
                objArr.getClass();
                int i = length - 1;
                int hashCode = obj.hashCode();
                int F = arey.F(hashCode);
                while (true) {
                    int i2 = F & i;
                    Object[] objArr2 = this.d;
                    Object obj2 = objArr2[i2];
                    if (obj2 != null) {
                        if (obj2.equals(obj)) {
                            return;
                        }
                        F = i2 + 1;
                    } else {
                        objArr2[i2] = obj;
                        this.e += hashCode;
                        super.b(obj);
                        return;
                    }
                }
            }
        }
        this.d = null;
        super.b(obj);
    }

    public final void i(Object... objArr) {
        if (this.d != null) {
            for (Object obj : objArr) {
                c(obj);
            }
            return;
        }
        super.d(objArr);
    }

    public final void j(Iterable iterable) {
        iterable.getClass();
        if (this.d != null) {
            for (Object obj : iterable) {
                c(obj);
            }
            return;
        }
        super.e(iterable);
    }

    public final void k(Iterator it) {
        it.getClass();
        while (it.hasNext()) {
            c(it.next());
        }
    }

    public final void l(amvl amvlVar) {
        if (this.d != null) {
            for (int i = 0; i < amvlVar.b; i++) {
                Object obj = amvlVar.a[i];
                obj.getClass();
                c(obj);
            }
            return;
        }
        a(amvlVar.a, amvlVar.b);
    }

    public amvl(int i) {
        super(i);
        this.d = new Object[amvn.f(i)];
    }

    public final amvn g() {
        amvn n;
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                Object obj = this.a[0];
                obj.getClass();
                return amvn.r(obj);
            }
            if (this.d == null || amvn.f(i) != this.d.length) {
                n = amvn.n(this.b, this.a);
                this.b = n.size();
            } else {
                Object[] copyOf = amvn.x(this.b, this.a.length) ? Arrays.copyOf(this.a, this.b) : this.a;
                int i2 = this.e;
                Object[] objArr = this.d;
                n = new amyg(copyOf, i2, objArr, objArr.length - 1, this.b);
            }
            this.c = true;
            this.d = null;
            return n;
        }
        return amyg.a;
    }
}
