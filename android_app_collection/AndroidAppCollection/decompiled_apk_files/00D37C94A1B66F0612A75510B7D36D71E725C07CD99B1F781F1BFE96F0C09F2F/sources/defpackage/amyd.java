package defpackage;
/* compiled from: PG */
/* renamed from: amyd  reason: default package */
/* loaded from: classes.dex */
final class amyd extends amvt {
    final /* synthetic */ amyf a;

    public amyd(amyf amyfVar) {
        this.a = amyfVar;
    }

    @Override // defpackage.amvt
    public final Object c(int i) {
        return this.a.b.g(i);
    }

    @Override // defpackage.amub, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.contains(obj);
    }

    @Override // defpackage.amub
    public final boolean l() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.b.c;
    }
}
