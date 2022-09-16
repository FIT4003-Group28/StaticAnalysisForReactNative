package defpackage;

import defpackage.dcvq;
import java.util.List;
/* compiled from: PG */
/* renamed from: dcvr  reason: default package */
/* loaded from: classes5.dex */
public final class dcvr<T extends dcvq> {
    public final List<T> a;
    protected int b;
    private final dbrn<dcvf, Integer> c;

    protected dcvr(final List<T> list) {
        this.a = list;
        this.c = new dbrn(list) { // from class: dcvp
            private final List a;

            {
                this.a = list;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                List list2 = this.a;
                dcvf dcvfVar = (dcvf) obj;
                int size = list2.size() - 1;
                int i = 0;
                while (i <= size) {
                    int i2 = (i + size) / 2;
                    int b = decu.b(((dcvq) list2.get(i2)).a(), dcvfVar.b);
                    if (b > 0) {
                        i2--;
                    } else if (b < 0) {
                        i = i2 + 1;
                    } else if (i == i2) {
                        return Integer.valueOf(i2);
                    }
                    size = i2;
                }
                return Integer.valueOf(i);
            }
        };
    }

    protected dcvr(List<T> list, dbrn<dcvf, Integer> dbrnVar) {
        this.a = list;
        this.c = dbrnVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T extends dcvq> dcvr<T> a(List<T> list) {
        return new dcvr<>(list);
    }

    public final dcvr<T> b() {
        dcvr<T> dcvrVar = new dcvr<>(this.a, this.c);
        dcvrVar.b = this.b;
        return dcvrVar;
    }

    public final void c() {
        this.b = 0;
    }

    public final int d(dcvf dcvfVar) {
        return decu.b(g().a(), dcvfVar.b);
    }

    public final <T extends dcvq> boolean e(dcvr<T> dcvrVar) {
        return this.a == dcvrVar.a && this.b == dcvrVar.b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof dcvr) && e((dcvr) obj);
    }

    public final dcvf f() {
        return new dcvf(g().a());
    }

    public final T g() {
        return this.a.get(this.b);
    }

    public final dcwa h() {
        return dcwa.f(f().d());
    }

    public final int hashCode() {
        return (this.b * 31) + this.a.hashCode();
    }

    public final void i() {
        if (this.b < this.a.size()) {
            this.b++;
        }
    }

    public final void j() {
        int i = this.b;
        if (i > 0) {
            this.b = i - 1;
        }
    }

    public final boolean k() {
        return this.b == this.a.size();
    }

    public final boolean l() {
        return this.b == 0;
    }

    public final void m(dcvf dcvfVar) {
        this.b = this.c.a(dcvfVar).intValue();
    }

    public final boolean n(dcwa dcwaVar) {
        dcvf b = dcvf.b(dcwaVar);
        m(b);
        if (k() || !f().l().J(b)) {
            if (l()) {
                return false;
            }
            j();
            return f().m().K(b);
        }
        return true;
    }
}
