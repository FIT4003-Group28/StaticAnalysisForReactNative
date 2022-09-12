package defpackage;

import java.util.Comparator;
import java.util.NoSuchElementException;
/* compiled from: PG */
/* renamed from: dzly  reason: default package */
/* loaded from: classes6.dex */
final class dzly extends dzky {
    final /* synthetic */ dzmd a;

    public dzly(dzmd dzmdVar) {
        this.a = dzmdVar;
    }

    @Override // defpackage.dzkr, defpackage.dzmy
    public final boolean c(long j) {
        return this.a.d(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.SortedSet
    public final /* bridge */ /* synthetic */ Comparator<? super Long> comparator() {
        return null;
    }

    @Override // defpackage.dzkx
    public final boolean e(long j) {
        dzmd dzmdVar = this.a;
        int i = dzmdVar.j;
        dzmdVar.b(j);
        return this.a.j != i;
    }

    @Override // defpackage.dzky, defpackage.dzkx, defpackage.dzkr, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: g */
    public final dzne iterator() {
        return new dzlx(this.a);
    }

    @Override // defpackage.dzni
    public final long h() {
        dzmd dzmdVar = this.a;
        if (dzmdVar.j == 0) {
            throw new NoSuchElementException();
        }
        return dzmdVar.a[dzmdVar.e];
    }

    @Override // defpackage.dzni
    public final long i() {
        dzmd dzmdVar = this.a;
        if (dzmdVar.j == 0) {
            throw new NoSuchElementException();
        }
        return dzmdVar.a[dzmdVar.f];
    }

    @Override // defpackage.dzni
    public final dzni j() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.dzni
    public final dzni k() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.dzni
    public final dzni l() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.j;
    }
}
