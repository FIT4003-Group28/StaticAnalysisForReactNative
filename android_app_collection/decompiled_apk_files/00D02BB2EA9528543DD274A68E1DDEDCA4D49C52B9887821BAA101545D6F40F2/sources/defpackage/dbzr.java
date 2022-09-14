package defpackage;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dbzr  reason: default package */
/* loaded from: classes5.dex */
final class dbzr<K, V> extends dbzn<K, V> {
    transient long[] h;
    private transient int i;
    private transient int j;

    public dbzr() {
        super(3);
    }

    public static <K, V> dbzr<K, V> t(int i) {
        return new dbzr<>(i);
    }

    private final int u(int i) {
        return ((int) (this.h[i] >>> 32)) - 1;
    }

    @Override // defpackage.dbzn
    public final void c(int i) {
        super.c(i);
        this.i = -2;
        this.j = -2;
    }

    @Override // defpackage.dbzn, java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (d()) {
            return;
        }
        this.i = -2;
        this.j = -2;
        long[] jArr = this.h;
        if (jArr != null) {
            Arrays.fill(jArr, 0, size(), 0L);
        }
        super.clear();
    }

    @Override // defpackage.dbzn
    public final int e() {
        int e = super.e();
        this.h = new long[e];
        return e;
    }

    @Override // defpackage.dbzn
    public final Map<K, V> g(int i) {
        return new LinkedHashMap(i, 1.0f, false);
    }

    @Override // defpackage.dbzn
    public final Map<K, V> h() {
        Map<K, V> h = super.h();
        this.h = null;
        return h;
    }

    @Override // defpackage.dbzn
    public final void k(int i, K k, V v, int i2, int i3) {
        super.k(i, k, v, i2, i3);
        v(this.j, i);
        v(i, -2);
    }

    @Override // defpackage.dbzn
    public final void l(int i) {
        super.l(i);
        this.h = Arrays.copyOf(this.h, i);
    }

    @Override // defpackage.dbzn
    public final void o(int i, int i2) {
        int size = size() - 1;
        super.o(i, i2);
        v(u(i), q(i));
        if (i < size) {
            v(u(size), i);
            v(i, q(size));
        }
        this.h[size] = 0;
    }

    @Override // defpackage.dbzn
    public final int p() {
        return this.i;
    }

    @Override // defpackage.dbzn
    public final int q(int i) {
        return ((int) this.h[i]) - 1;
    }

    @Override // defpackage.dbzn
    public final int r(int i, int i2) {
        return i >= size() ? i2 : i;
    }

    public dbzr(int i) {
        super(i);
    }

    private final void v(int i, int i2) {
        if (i == -2) {
            this.i = i2;
            i = -2;
        } else {
            long[] jArr = this.h;
            jArr[i] = (jArr[i] & (-4294967296L)) | ((i2 + 1) & 4294967295L);
        }
        if (i2 == -2) {
            this.j = i;
            return;
        }
        long[] jArr2 = this.h;
        jArr2[i2] = (4294967295L & jArr2[i2]) | ((i + 1) << 32);
    }
}
