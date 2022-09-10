package defpackage;

import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dcds  reason: default package */
/* loaded from: classes5.dex */
public final class dcds<K, V> extends dcfi<K> {
    private final dcdn<K, V> a;

    public dcds(dcdn<K, V> dcdnVar) {
        this.a = dcdnVar;
    }

    @Override // defpackage.dcfi, defpackage.dcep, defpackage.dccr
    public final dcpd<K> SE() {
        return this.a.SJ();
    }

    @Override // defpackage.dccr
    public final boolean SI() {
        return true;
    }

    @Override // defpackage.dcfi
    public final K b(int i) {
        return this.a.entrySet().v().get(i).getKey();
    }

    @Override // defpackage.dccr, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // defpackage.dcfi, defpackage.dcep, defpackage.dccr, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.size();
    }

    @Override // defpackage.dcep, defpackage.dccr
    Object writeReplace() {
        return new dcdr(this.a);
    }
}
