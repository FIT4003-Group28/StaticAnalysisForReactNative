package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: zfc  reason: default package */
/* loaded from: classes4.dex */
final class zfc extends AbstractSet {
    final /* synthetic */ zfi a;

    public zfc(zfi zfiVar) {
        this.a = zfiVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zfh(this.a, new zfd(1));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (this.a.containsKey(obj)) {
            this.a.remove(obj);
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.size();
    }
}
