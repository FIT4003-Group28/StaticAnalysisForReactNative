package defpackage;

import java.lang.Comparable;
/* compiled from: PG */
/* renamed from: dcpb  reason: default package */
/* loaded from: classes5.dex */
public final class dcpb<K extends Comparable, V> extends dbyj<dclz<K>, V> {
    public final dclz<K> a;
    public final V b;

    public dcpb(dclz<K> dclzVar, V v) {
        this.a = dclzVar;
        this.b = v;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final dcak<K> a() {
        return this.a.c;
    }

    @Override // defpackage.dbyj, java.util.Map.Entry
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.a;
    }

    @Override // defpackage.dbyj, java.util.Map.Entry
    public final V getValue() {
        return this.b;
    }
}
