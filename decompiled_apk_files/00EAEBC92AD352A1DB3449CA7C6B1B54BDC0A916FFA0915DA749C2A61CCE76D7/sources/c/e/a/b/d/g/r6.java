package c.e.a.b.d.g;

import java.util.Iterator;
import java.util.Map;
/* loaded from: classes.dex */
final class r6<T> implements b7<T> {

    /* renamed from: a  reason: collision with root package name */
    private final k6 f4386a;

    /* renamed from: b  reason: collision with root package name */
    private final u7<?, ?> f4387b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f4388c;

    /* renamed from: d  reason: collision with root package name */
    private final r4<?> f4389d;

    private r6(u7<?, ?> u7Var, r4<?> r4Var, k6 k6Var) {
        this.f4387b = u7Var;
        this.f4388c = r4Var.a(k6Var);
        this.f4389d = r4Var;
        this.f4386a = k6Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> r6<T> a(u7<?, ?> u7Var, r4<?> r4Var, k6 k6Var) {
        return new r6<>(u7Var, r4Var, k6Var);
    }

    @Override // c.e.a.b.d.g.b7
    public final int a(T t) {
        int hashCode = this.f4387b.a(t).hashCode();
        return this.f4388c ? (hashCode * 53) + this.f4389d.a(t).hashCode() : hashCode;
    }

    @Override // c.e.a.b.d.g.b7
    public final void a(T t, o8 o8Var) {
        Iterator<Map.Entry<?, Object>> c2 = this.f4389d.a(t).c();
        if (c2.hasNext()) {
            ((u4) c2.next().getKey()).l();
            throw null;
        }
        u7<?, ?> u7Var = this.f4387b;
        u7Var.b((u7<?, ?>) u7Var.a(t), o8Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0099 A[EDGE_INSN: B:57:0x0099->B:34:0x0099 ?: BREAK  , SYNTHETIC] */
    @Override // c.e.a.b.d.g.b7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(T r10, byte[] r11, int r12, int r13, c.e.a.b.d.g.q3 r14) {
        /*
            r9 = this;
            r0 = r10
            c.e.a.b.d.g.b5 r0 = (c.e.a.b.d.g.b5) r0
            c.e.a.b.d.g.t7 r1 = r0.zzb
            c.e.a.b.d.g.t7 r2 = c.e.a.b.d.g.t7.d()
            if (r1 != r2) goto L11
            c.e.a.b.d.g.t7 r1 = c.e.a.b.d.g.t7.e()
            r0.zzb = r1
        L11:
            c.e.a.b.d.g.b5$b r10 = (c.e.a.b.d.g.b5.b) r10
            r10.n()
            r10 = 0
            r0 = r10
        L18:
            if (r12 >= r13) goto La4
            int r4 = c.e.a.b.d.g.r3.a(r11, r12, r14)
            int r2 = r14.f4367a
            r12 = 11
            r3 = 2
            if (r2 == r12) goto L51
            r12 = r2 & 7
            if (r12 != r3) goto L4c
            c.e.a.b.d.g.r4<?> r12 = r9.f4389d
            c.e.a.b.d.g.p4 r0 = r14.f4370d
            c.e.a.b.d.g.k6 r3 = r9.f4386a
            int r5 = r2 >>> 3
            java.lang.Object r12 = r12.a(r0, r3, r5)
            r0 = r12
            c.e.a.b.d.g.b5$d r0 = (c.e.a.b.d.g.b5.d) r0
            if (r0 != 0) goto L43
            r3 = r11
            r5 = r13
            r6 = r1
            r7 = r14
            int r12 = c.e.a.b.d.g.r3.a(r2, r3, r4, r5, r6, r7)
            goto L18
        L43:
            c.e.a.b.d.g.y6.a()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L4c:
            int r12 = c.e.a.b.d.g.r3.a(r2, r11, r4, r13, r14)
            goto L18
        L51:
            r12 = 0
            r2 = r10
        L53:
            if (r4 >= r13) goto L99
            int r4 = c.e.a.b.d.g.r3.a(r11, r4, r14)
            int r5 = r14.f4367a
            int r6 = r5 >>> 3
            r7 = r5 & 7
            if (r6 == r3) goto L7b
            r8 = 3
            if (r6 == r8) goto L65
            goto L90
        L65:
            if (r0 != 0) goto L72
            if (r7 != r3) goto L90
            int r4 = c.e.a.b.d.g.r3.e(r11, r4, r14)
            java.lang.Object r2 = r14.f4369c
            c.e.a.b.d.g.v3 r2 = (c.e.a.b.d.g.v3) r2
            goto L53
        L72:
            c.e.a.b.d.g.y6.a()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L7b:
            if (r7 != 0) goto L90
            int r4 = c.e.a.b.d.g.r3.a(r11, r4, r14)
            int r12 = r14.f4367a
            c.e.a.b.d.g.r4<?> r0 = r9.f4389d
            c.e.a.b.d.g.p4 r5 = r14.f4370d
            c.e.a.b.d.g.k6 r6 = r9.f4386a
            java.lang.Object r0 = r0.a(r5, r6, r12)
            c.e.a.b.d.g.b5$d r0 = (c.e.a.b.d.g.b5.d) r0
            goto L53
        L90:
            r6 = 12
            if (r5 == r6) goto L99
            int r4 = c.e.a.b.d.g.r3.a(r5, r11, r4, r13, r14)
            goto L53
        L99:
            if (r2 == 0) goto La1
            int r12 = r12 << 3
            r12 = r12 | r3
            r1.a(r12, r2)
        La1:
            r12 = r4
            goto L18
        La4:
            if (r12 != r13) goto La7
            return
        La7:
            c.e.a.b.d.g.j5 r10 = c.e.a.b.d.g.j5.e()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: c.e.a.b.d.g.r6.a(java.lang.Object, byte[], int, int, c.e.a.b.d.g.q3):void");
    }

    @Override // c.e.a.b.d.g.b7
    public final boolean a(T t, T t2) {
        if (!this.f4387b.a(t).equals(this.f4387b.a(t2))) {
            return false;
        }
        if (!this.f4388c) {
            return true;
        }
        return this.f4389d.a(t).equals(this.f4389d.a(t2));
    }

    @Override // c.e.a.b.d.g.b7
    public final void b(T t, T t2) {
        d7.a(this.f4387b, t, t2);
        if (this.f4388c) {
            d7.a(this.f4389d, t, t2);
        }
    }

    @Override // c.e.a.b.d.g.b7
    public final boolean b(T t) {
        return this.f4389d.a(t).e();
    }

    @Override // c.e.a.b.d.g.b7
    public final void c(T t) {
        this.f4387b.b(t);
        this.f4389d.c(t);
    }

    @Override // c.e.a.b.d.g.b7
    public final int d(T t) {
        u7<?, ?> u7Var = this.f4387b;
        int c2 = u7Var.c(u7Var.a(t)) + 0;
        return this.f4388c ? c2 + this.f4389d.a(t).f() : c2;
    }

    @Override // c.e.a.b.d.g.b7
    public final T f() {
        return (T) this.f4386a.e().w();
    }
}
