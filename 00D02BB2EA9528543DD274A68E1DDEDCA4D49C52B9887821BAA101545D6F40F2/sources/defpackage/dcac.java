package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: dcac  reason: default package */
/* loaded from: classes5.dex */
final class dcac extends dbyp {
    final /* synthetic */ dcae b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dcac(dcae dcaeVar) {
        super(dcaeVar);
        this.b = dcaeVar;
    }

    private final List<dcla> b() {
        ArrayList g = dchl.g(size());
        dcgh.g(g, iterator());
        return g;
    }

    @Override // defpackage.dbyp, defpackage.dcle
    public final /* bridge */ /* synthetic */ dclb a() {
        return this.b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return b().toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) b().toArray(tArr);
    }
}
