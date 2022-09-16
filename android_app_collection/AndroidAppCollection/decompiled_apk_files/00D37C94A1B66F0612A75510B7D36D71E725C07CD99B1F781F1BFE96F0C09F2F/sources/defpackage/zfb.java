package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: zfb  reason: default package */
/* loaded from: classes4.dex */
final class zfb extends AbstractSet {
    final /* synthetic */ zfi a;

    public zfb(zfi zfiVar) {
        this.a = zfiVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        zfg b;
        if (!(obj instanceof Map.Entry) || (b = this.a.b(((Map.Entry) obj).getKey())) == null) {
            return false;
        }
        if (b.get() == null && !b.b) {
            return false;
        }
        return obj.equals(b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zfh(this.a, new zfa());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (contains(obj)) {
            this.a.remove(((Map.Entry) obj).getKey());
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.size();
    }
}
