package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: amxm  reason: default package */
/* loaded from: classes.dex */
final class amxm extends amyr {
    final /* synthetic */ amrw a;

    public amxm(amrw amrwVar) {
        this.a = amrwVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof amxk) {
            amxk amxkVar = (amxk) obj;
            if (amxkVar.a() > 0 && this.a.a(amxkVar.a) == amxkVar.a()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return this.a.e();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (obj instanceof amxk) {
            amxk amxkVar = (amxk) obj;
            Object obj2 = amxkVar.a;
            int a = amxkVar.a();
            if (a == 0) {
                return false;
            }
            return this.a.h(obj2, a);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.b();
    }

    public amxm() {
    }
}
