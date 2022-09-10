package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dauj  reason: default package */
/* loaded from: classes5.dex */
public final class dauj extends AbstractSet<Map.Entry<String, Object>> {
    final /* synthetic */ daul a;
    private final daue b;

    public dauj(daul daulVar) {
        this.a = daulVar;
        this.b = new dauf(daulVar, daulVar.d.b).entrySet();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.c.clear();
        this.b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<String, Object>> iterator() {
        return new daui(this.a, this.b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.c.size() + this.b.size();
    }
}
