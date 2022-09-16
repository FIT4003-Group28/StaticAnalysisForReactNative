package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: anbw  reason: default package */
/* loaded from: classes.dex */
final class anbw extends AbstractSet {
    final /* synthetic */ anby a;

    public anbw(anby anbyVar) {
        this.a = anbyVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new anbv(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.b;
    }
}
