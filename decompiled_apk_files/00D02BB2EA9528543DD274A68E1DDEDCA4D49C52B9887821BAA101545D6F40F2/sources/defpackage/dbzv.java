package defpackage;

import java.util.Comparator;
/* compiled from: PG */
/* renamed from: dbzv  reason: default package */
/* loaded from: classes.dex */
final class dbzv extends dbzx {
    static final dbzx j(int i) {
        return i < 0 ? dbzx.c : i > 0 ? dbzx.d : dbzx.b;
    }

    @Override // defpackage.dbzx
    public final dbzx a(Comparable comparable, Comparable comparable2) {
        return j(comparable.compareTo(comparable2));
    }

    @Override // defpackage.dbzx
    public final <T> dbzx b(T t, T t2, Comparator<T> comparator) {
        return j(comparator.compare(t, t2));
    }

    @Override // defpackage.dbzx
    public final dbzx c(int i, int i2) {
        return j(decl.c(i, i2));
    }

    @Override // defpackage.dbzx
    public final dbzx d(long j, long j2) {
        return j(decn.b(j, j2));
    }

    @Override // defpackage.dbzx
    public final dbzx e(float f, float f2) {
        return j(Float.compare(f, f2));
    }

    @Override // defpackage.dbzx
    public final dbzx f(double d, double d2) {
        return j(Double.compare(d, d2));
    }

    @Override // defpackage.dbzx
    public final dbzx g(boolean z, boolean z2) {
        return j(deby.a(z2, z));
    }

    @Override // defpackage.dbzx
    public final dbzx h(boolean z, boolean z2) {
        return j(deby.a(z, z2));
    }

    @Override // defpackage.dbzx
    public final int i() {
        return 0;
    }
}
