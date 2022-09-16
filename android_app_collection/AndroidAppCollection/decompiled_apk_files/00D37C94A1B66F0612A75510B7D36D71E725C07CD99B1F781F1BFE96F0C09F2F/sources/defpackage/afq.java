package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: afq  reason: default package */
/* loaded from: classes.dex */
public final class afq extends AbstractSet {
    final /* synthetic */ afw a;

    public afq(afw afwVar) {
        this.a = afwVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new aft(this.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.j;
    }
}
