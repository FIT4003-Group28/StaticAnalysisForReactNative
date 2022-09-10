package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: dbyp  reason: default package */
/* loaded from: classes5.dex */
class dbyp extends dcle {
    final /* synthetic */ dbyq a;

    public dbyp(dbyq dbyqVar) {
        this.a = dbyqVar;
    }

    @Override // defpackage.dcle
    public dclb a() {
        return this.a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<dcla> iterator() {
        return this.a.d();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.e();
    }
}
