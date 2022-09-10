package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
/* compiled from: PG */
/* renamed from: dbxf  reason: default package */
/* loaded from: classes5.dex */
final class dbxf extends dcbs {
    final Set a;
    final /* synthetic */ dbxg b;

    public dbxf(dbxg dbxgVar) {
        this.b = dbxgVar;
        this.a = dbxgVar.b.keySet();
    }

    @Override // defpackage.dcbh, defpackage.dcbq
    protected final /* bridge */ /* synthetic */ Object SC() {
        return this.a;
    }

    @Override // defpackage.dcbs
    protected final Set a() {
        return this.a;
    }

    @Override // defpackage.dcbs, defpackage.dcbh
    protected final /* bridge */ /* synthetic */ Collection b() {
        return this.a;
    }

    @Override // defpackage.dcbh, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return dcjz.b(this.b.entrySet().iterator());
    }

    @Override // defpackage.dcbh, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return e();
    }

    @Override // defpackage.dcbq
    public final String toString() {
        StringBuilder f = dbze.f(size());
        f.append('[');
        boolean z = true;
        for (Object obj : this) {
            if (!z) {
                f.append(", ");
            }
            if (obj == this) {
                f.append("(this Collection)");
            } else {
                f.append(obj);
            }
            z = false;
        }
        f.append(']');
        return f.toString();
    }

    @Override // defpackage.dcbh, java.util.Collection, java.util.Set
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) dclq.e(this, tArr);
    }
}
