package defpackage;

import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dctt  reason: default package */
/* loaded from: classes.dex */
public final class dctt<T> extends AbstractSet<T> {
    final int a = -1;
    final /* synthetic */ dctu b;

    public dctt(dctu dctuVar, int i) {
        this.b = dctuVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a() {
        if (this.a == -1) {
            return 0;
        }
        return this.b.c[0];
    }

    final int b() {
        return this.b.c[this.a + 1];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return Arrays.binarySearch(this.b.b, a(), b(), obj, this.a == -1 ? dctu.a : dctw.a) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<T> iterator() {
        return new dcts(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return b() - a();
    }
}
