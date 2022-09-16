package defpackage;

import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: anda  reason: default package */
/* loaded from: classes.dex */
public final class anda extends AbstractSet {
    final int a = -1;
    final /* synthetic */ andb b;

    public anda(andb andbVar) {
        this.b = andbVar;
    }

    final int a() {
        return this.b.c[this.a + 1];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int b() {
        if (this.a == -1) {
            return 0;
        }
        return this.b.c[0];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return Arrays.binarySearch(this.b.b, b(), a(), obj, this.a == -1 ? andb.a : andd.a) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new ancz(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return a() - b();
    }
}
