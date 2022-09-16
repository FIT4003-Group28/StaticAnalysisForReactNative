package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: dcen  reason: default package */
/* loaded from: classes.dex */
public class dcen<E> extends dccp<E> {
    Object[] d;
    private int e;

    public dcen() {
        super(4);
    }

    @Override // defpackage.dccp, defpackage.dccq
    /* renamed from: g */
    public void b(E e) {
        dbsk.s(e);
        if (this.d != null) {
            int J = dcep.J(this.b);
            int length = this.d.length;
            if (J <= length) {
                int i = length - 1;
                int hashCode = e.hashCode();
                int a = dccj.a(hashCode);
                while (true) {
                    int i2 = a & i;
                    Object[] objArr = this.d;
                    Object obj = objArr[i2];
                    if (obj != null) {
                        if (obj.equals(e)) {
                            return;
                        }
                        a = i2 + 1;
                    } else {
                        objArr[i2] = e;
                        this.e += hashCode;
                        super.a(e);
                        return;
                    }
                }
            }
        }
        this.d = null;
        super.a(e);
    }

    public final void h(E... eArr) {
        if (this.d != null) {
            for (E e : eArr) {
                b(e);
            }
            return;
        }
        super.c(eArr);
    }

    public void i(Iterable<? extends E> iterable) {
        dbsk.s(iterable);
        if (this.d != null) {
            for (E e : iterable) {
                b(e);
            }
            return;
        }
        super.d(iterable);
    }

    public dcen(int i) {
        super(i);
        this.d = new Object[dcep.J(i)];
    }

    public dcep<E> f() {
        dcep<E> H;
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                return dcep.B(this.a[0]);
            }
            if (this.d == null || dcep.J(i) != this.d.length) {
                H = dcep.H(this.b, this.a);
                this.b = H.size();
            } else {
                Object[] copyOf = dcep.I(this.b, this.a.length) ? Arrays.copyOf(this.a, this.b) : this.a;
                int i2 = this.e;
                Object[] objArr = this.d;
                H = new dcmr<>(copyOf, i2, objArr, objArr.length - 1, this.b);
            }
            this.c = true;
            this.d = null;
            return H;
        }
        return dcmr.a;
    }
}
