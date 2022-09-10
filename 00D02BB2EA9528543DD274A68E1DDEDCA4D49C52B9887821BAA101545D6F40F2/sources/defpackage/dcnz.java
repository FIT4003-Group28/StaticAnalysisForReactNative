package defpackage;

import java.util.Iterator;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dcnz  reason: default package */
/* loaded from: classes5.dex */
public final class dcnz extends dcob<Map.Entry> {
    final /* synthetic */ dcoa a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dcnz(dcoa dcoaVar) {
        super(dcoaVar.a);
        this.a = dcoaVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (entry.getKey() != null && (entry.getValue() instanceof Map) && dbze.b(this.a.a.b.entrySet(), entry)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry> iterator() {
        return dcjz.m(this.a.a.b.keySet(), new dcny(this));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (entry.getKey() != null && (entry.getValue() instanceof Map) && this.a.a.b.entrySet().remove(entry)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.a.b.size();
    }
}
