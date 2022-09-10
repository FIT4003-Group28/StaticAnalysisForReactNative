package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dbyt  reason: default package */
/* loaded from: classes5.dex */
public final class dbyt extends AbstractSet<dcot> {
    final /* synthetic */ dbyu a;

    public dbyt(dbyu dbyuVar) {
        this.a = dbyuVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.d();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof dcot) {
            dcot dcotVar = (dcot) obj;
            Map map = (Map) dcjz.A(this.a.p(), dcotVar.a());
            if (map != null && dbze.b(map.entrySet(), dcjz.p(dcotVar.b(), dcotVar.c()))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<dcot> iterator() {
        return this.a.h();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (obj instanceof dcot) {
            dcot dcotVar = (dcot) obj;
            Map map = (Map) dcjz.A(this.a.p(), dcotVar.a());
            if (map != null && dbze.c(map.entrySet(), dcjz.p(dcotVar.b(), dcotVar.c()))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.l();
    }
}
