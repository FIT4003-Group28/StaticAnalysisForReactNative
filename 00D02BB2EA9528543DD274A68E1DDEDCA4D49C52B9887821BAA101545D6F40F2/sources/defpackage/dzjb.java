package defpackage;

import java.util.Comparator;
import java.util.NoSuchElementException;
/* compiled from: PG */
/* renamed from: dzjb  reason: default package */
/* loaded from: classes6.dex */
final class dzjb extends dzih {
    final /* synthetic */ dzjg a;

    public dzjb(dzjg dzjgVar) {
        this.a = dzjgVar;
    }

    @Override // defpackage.dzia
    public final boolean c(int i) {
        return this.a.d(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.SortedSet
    public final /* bridge */ /* synthetic */ Comparator<? super Integer> comparator() {
        return null;
    }

    @Override // defpackage.dzig
    public final boolean e(int i) {
        dzjg dzjgVar = this.a;
        int i2 = dzjgVar.j;
        dzjgVar.b(i);
        return this.a.j != i2;
    }

    @Override // defpackage.dzih, defpackage.dzig, defpackage.dzia, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: g */
    public final dzkf iterator() {
        return new dzja(this.a);
    }

    @Override // defpackage.dzkh
    public final int h() {
        dzjg dzjgVar = this.a;
        if (dzjgVar.j == 0) {
            throw new NoSuchElementException();
        }
        return dzjgVar.a[dzjgVar.e];
    }

    @Override // defpackage.dzkh
    public final int i() {
        dzjg dzjgVar = this.a;
        if (dzjgVar.j == 0) {
            throw new NoSuchElementException();
        }
        return dzjgVar.a[dzjgVar.f];
    }

    @Override // defpackage.dzkh
    public final dzkh j() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.dzkh
    public final dzkh k() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.dzkh
    public final dzkh l() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.j;
    }
}
