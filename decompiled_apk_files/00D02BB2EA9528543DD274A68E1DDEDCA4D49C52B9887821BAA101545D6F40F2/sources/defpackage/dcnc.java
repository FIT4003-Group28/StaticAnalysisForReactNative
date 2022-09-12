package defpackage;

import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dcnc  reason: default package */
/* loaded from: classes.dex */
public final class dcnc extends dcnk {
    final /* synthetic */ Set a;
    final /* synthetic */ Set b;

    public dcnc(Set set, Set set2) {
        this.a = set;
        this.b = set2;
    }

    @Override // defpackage.dcnk, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: a */
    public final dcpd iterator() {
        return new dcnb(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.a.contains(obj) || this.b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.a.isEmpty() && this.b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int size = this.a.size();
        for (Object obj : this.b) {
            if (!this.a.contains(obj)) {
                size++;
            }
        }
        return size;
    }
}
