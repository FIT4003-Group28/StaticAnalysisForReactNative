package defpackage;

import java.util.Arrays;
import java.util.Set;
/* compiled from: PG */
/* renamed from: amvg  reason: default package */
/* loaded from: classes.dex */
public abstract class amvg extends amvh implements amxj {
    private transient amuk a;
    private transient amvn b;

    @Override // defpackage.amub
    public final int b(Object[] objArr, int i) {
        amzs it = j().iterator();
        while (it.hasNext()) {
            amxk amxkVar = (amxk) it.next();
            Arrays.fill(objArr, i, amxkVar.a() + i, amxkVar.a);
            i += amxkVar.a();
        }
        return i;
    }

    @Override // defpackage.amxj
    @Deprecated
    public final int c(Object obj, int i) {
        throw null;
    }

    @Override // defpackage.amub, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return a(obj) > 0;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        return amxp.f(this, obj);
    }

    @Override // defpackage.amxj
    @Deprecated
    public final void f(Object obj, int i) {
        throw null;
    }

    @Override // defpackage.amub
    public final amuk g() {
        amuk amukVar = this.a;
        if (amukVar == null) {
            amuk g = super.g();
            this.a = g;
            return g;
        }
        return amukVar;
    }

    @Override // defpackage.amxj
    @Deprecated
    public final boolean h(Object obj, int i) {
        throw null;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return amyv.b(j());
    }

    @Override // defpackage.amxj
    public /* bridge */ /* synthetic */ Set i() {
        throw null;
    }

    @Override // defpackage.amub, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: k */
    public final amzs iterator() {
        return new amvc(j().iterator());
    }

    public abstract amvn n();

    @Override // defpackage.amxj
    /* renamed from: o */
    public final amvn j() {
        amvn amvnVar = this.b;
        if (amvnVar == null) {
            if (isEmpty()) {
                amvnVar = amyg.a;
            } else {
                amvnVar = new amve(this);
            }
            this.b = amvnVar;
        }
        return amvnVar;
    }

    public abstract amxk p(int i);

    @Override // java.util.AbstractCollection
    public final String toString() {
        return j().toString();
    }

    @Override // defpackage.amub
    abstract Object writeReplace();
}
