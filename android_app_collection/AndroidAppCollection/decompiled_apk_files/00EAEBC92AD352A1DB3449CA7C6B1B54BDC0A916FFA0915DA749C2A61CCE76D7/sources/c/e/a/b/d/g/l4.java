package c.e.a.b.d.g;

import c.e.a.b.d.g.b5;
import java.util.List;
/* loaded from: classes.dex */
final class l4 implements o8 {

    /* renamed from: a  reason: collision with root package name */
    private final j4 f4275a;

    private l4(j4 j4Var) {
        e5.a(j4Var, "output");
        this.f4275a = j4Var;
        this.f4275a.f4231a = this;
    }

    public static l4 a(j4 j4Var) {
        l4 l4Var = j4Var.f4231a;
        return l4Var != null ? l4Var : new l4(j4Var);
    }

    @Override // c.e.a.b.d.g.o8
    public final void a(int i) {
        this.f4275a.a(i, 3);
    }

    @Override // c.e.a.b.d.g.o8
    public final void a(int i, double d2) {
        this.f4275a.a(i, d2);
    }

    @Override // c.e.a.b.d.g.o8
    public final void a(int i, float f2) {
        this.f4275a.a(i, f2);
    }

    @Override // c.e.a.b.d.g.o8
    public final void a(int i, int i2) {
        this.f4275a.d(i, i2);
    }

    @Override // c.e.a.b.d.g.o8
    public final void a(int i, long j) {
        this.f4275a.c(i, j);
    }

    @Override // c.e.a.b.d.g.o8
    public final void a(int i, v3 v3Var) {
        this.f4275a.a(i, v3Var);
    }

    @Override // c.e.a.b.d.g.o8
    public final void a(int i, Object obj) {
        if (obj instanceof v3) {
            this.f4275a.b(i, (v3) obj);
        } else {
            this.f4275a.a(i, (k6) obj);
        }
    }

    @Override // c.e.a.b.d.g.o8
    public final void a(int i, Object obj, b7 b7Var) {
        j4 j4Var = this.f4275a;
        j4Var.a(i, 3);
        b7Var.a((b7) ((k6) obj), (o8) j4Var.f4231a);
        j4Var.a(i, 4);
    }

    @Override // c.e.a.b.d.g.o8
    public final void a(int i, String str) {
        this.f4275a.a(i, str);
    }

    @Override // c.e.a.b.d.g.o8
    public final void a(int i, List<v3> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f4275a.a(i, list.get(i2));
        }
    }

    @Override // c.e.a.b.d.g.o8
    public final void a(int i, List<?> list, b7 b7Var) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            a(i, list.get(i2), b7Var);
        }
    }

    @Override // c.e.a.b.d.g.o8
    public final void a(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f4275a.c(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.f4275a.a(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += j4.g(list.get(i4).longValue());
        }
        this.f4275a.b(i3);
        while (i2 < list.size()) {
            this.f4275a.c(list.get(i2).longValue());
            i2++;
        }
    }

    @Override // c.e.a.b.d.g.o8
    public final void a(int i, boolean z) {
        this.f4275a.a(i, z);
    }

    @Override // c.e.a.b.d.g.o8
    public final void b(int i) {
        this.f4275a.a(i, 4);
    }

    @Override // c.e.a.b.d.g.o8
    public final void b(int i, int i2) {
        this.f4275a.b(i, i2);
    }

    @Override // c.e.a.b.d.g.o8
    public final void b(int i, long j) {
        this.f4275a.a(i, j);
    }

    @Override // c.e.a.b.d.g.o8
    public final void b(int i, Object obj, b7 b7Var) {
        this.f4275a.a(i, (k6) obj, b7Var);
    }

    @Override // c.e.a.b.d.g.o8
    public final void b(int i, List<String> list) {
        int i2 = 0;
        if (!(list instanceof v5)) {
            while (i2 < list.size()) {
                this.f4275a.a(i, list.get(i2));
                i2++;
            }
            return;
        }
        v5 v5Var = (v5) list;
        while (i2 < list.size()) {
            Object b2 = v5Var.b(i2);
            if (b2 instanceof String) {
                this.f4275a.a(i, (String) b2);
            } else {
                this.f4275a.a(i, (v3) b2);
            }
            i2++;
        }
    }

    @Override // c.e.a.b.d.g.o8
    public final void b(int i, List<?> list, b7 b7Var) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            b(i, list.get(i2), b7Var);
        }
    }

    @Override // c.e.a.b.d.g.o8
    public final void b(int i, List<Boolean> list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f4275a.a(i, list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        this.f4275a.a(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += j4.b(list.get(i4).booleanValue());
        }
        this.f4275a.b(i3);
        while (i2 < list.size()) {
            this.f4275a.a(list.get(i2).booleanValue());
            i2++;
        }
    }

    @Override // c.e.a.b.d.g.o8
    public final void c(int i, int i2) {
        this.f4275a.b(i, i2);
    }

    @Override // c.e.a.b.d.g.o8
    public final void c(int i, long j) {
        this.f4275a.c(i, j);
    }

    @Override // c.e.a.b.d.g.o8
    public final void c(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f4275a.b(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.f4275a.a(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += j4.f(list.get(i4).longValue());
        }
        this.f4275a.b(i3);
        while (i2 < list.size()) {
            this.f4275a.b(list.get(i2).longValue());
            i2++;
        }
    }

    @Override // c.e.a.b.d.g.o8
    public final void d(int i, int i2) {
        this.f4275a.e(i, i2);
    }

    @Override // c.e.a.b.d.g.o8
    public final void d(int i, long j) {
        this.f4275a.b(i, j);
    }

    @Override // c.e.a.b.d.g.o8
    public final void d(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f4275a.b(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.f4275a.a(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += j4.f(list.get(i4).intValue());
        }
        this.f4275a.b(i3);
        while (i2 < list.size()) {
            this.f4275a.a(list.get(i2).intValue());
            i2++;
        }
    }

    @Override // c.e.a.b.d.g.o8
    public final void e(int i, int i2) {
        this.f4275a.c(i, i2);
    }

    @Override // c.e.a.b.d.g.o8
    public final void e(int i, long j) {
        this.f4275a.a(i, j);
    }

    @Override // c.e.a.b.d.g.o8
    public final void e(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f4275a.a(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.f4275a.a(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += j4.e(list.get(i4).longValue());
        }
        this.f4275a.b(i3);
        while (i2 < list.size()) {
            this.f4275a.a(list.get(i2).longValue());
            i2++;
        }
    }

    @Override // c.e.a.b.d.g.o8
    public final int f() {
        return b5.f.k;
    }

    @Override // c.e.a.b.d.g.o8
    public final void f(int i, int i2) {
        this.f4275a.e(i, i2);
    }

    @Override // c.e.a.b.d.g.o8
    public final void f(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f4275a.b(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.f4275a.a(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += j4.k(list.get(i4).intValue());
        }
        this.f4275a.b(i3);
        while (i2 < list.size()) {
            this.f4275a.a(list.get(i2).intValue());
            i2++;
        }
    }

    @Override // c.e.a.b.d.g.o8
    public final void g(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f4275a.d(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.f4275a.a(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += j4.h(list.get(i4).intValue());
        }
        this.f4275a.b(i3);
        while (i2 < list.size()) {
            this.f4275a.c(list.get(i2).intValue());
            i2++;
        }
    }

    @Override // c.e.a.b.d.g.o8
    public final void h(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f4275a.a(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.f4275a.a(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += j4.d(list.get(i4).longValue());
        }
        this.f4275a.b(i3);
        while (i2 < list.size()) {
            this.f4275a.a(list.get(i2).longValue());
            i2++;
        }
    }

    @Override // c.e.a.b.d.g.o8
    public final void i(int i, List<Double> list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f4275a.a(i, list.get(i2).doubleValue());
                i2++;
            }
            return;
        }
        this.f4275a.a(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += j4.b(list.get(i4).doubleValue());
        }
        this.f4275a.b(i3);
        while (i2 < list.size()) {
            this.f4275a.a(list.get(i2).doubleValue());
            i2++;
        }
    }

    @Override // c.e.a.b.d.g.o8
    public final void j(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f4275a.c(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.f4275a.a(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += j4.h(list.get(i4).longValue());
        }
        this.f4275a.b(i3);
        while (i2 < list.size()) {
            this.f4275a.c(list.get(i2).longValue());
            i2++;
        }
    }

    @Override // c.e.a.b.d.g.o8
    public final void k(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f4275a.e(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.f4275a.a(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += j4.i(list.get(i4).intValue());
        }
        this.f4275a.b(i3);
        while (i2 < list.size()) {
            this.f4275a.d(list.get(i2).intValue());
            i2++;
        }
    }

    @Override // c.e.a.b.d.g.o8
    public final void l(int i, List<Float> list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f4275a.a(i, list.get(i2).floatValue());
                i2++;
            }
            return;
        }
        this.f4275a.a(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += j4.b(list.get(i4).floatValue());
        }
        this.f4275a.b(i3);
        while (i2 < list.size()) {
            this.f4275a.a(list.get(i2).floatValue());
            i2++;
        }
    }

    @Override // c.e.a.b.d.g.o8
    public final void m(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f4275a.c(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.f4275a.a(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += j4.g(list.get(i4).intValue());
        }
        this.f4275a.b(i3);
        while (i2 < list.size()) {
            this.f4275a.b(list.get(i2).intValue());
            i2++;
        }
    }

    @Override // c.e.a.b.d.g.o8
    public final void n(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f4275a.e(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.f4275a.a(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += j4.j(list.get(i4).intValue());
        }
        this.f4275a.b(i3);
        while (i2 < list.size()) {
            this.f4275a.d(list.get(i2).intValue());
            i2++;
        }
    }
}
