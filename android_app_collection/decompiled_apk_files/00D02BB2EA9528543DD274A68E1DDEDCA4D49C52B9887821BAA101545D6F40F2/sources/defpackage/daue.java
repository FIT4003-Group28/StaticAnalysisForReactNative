package defpackage;

import java.util.AbstractSet;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: daue  reason: default package */
/* loaded from: classes5.dex */
public final class daue extends AbstractSet<Map.Entry<String, Object>> {
    final /* synthetic */ dauf a;

    public daue(dauf daufVar) {
        this.a = daufVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: a */
    public final daud iterator() {
        return new daud(this.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        for (String str : this.a.b.d) {
            this.a.b.c(str).f(this.a.a, null);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        for (String str : this.a.b.d) {
            if (this.a.b.c(str).e(this.a.a) != null) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i = 0;
        for (String str : this.a.b.d) {
            if (this.a.b.c(str).e(this.a.a) != null) {
                i++;
            }
        }
        return i;
    }
}
