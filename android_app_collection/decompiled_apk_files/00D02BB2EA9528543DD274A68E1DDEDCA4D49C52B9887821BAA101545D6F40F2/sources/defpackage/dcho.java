package defpackage;

import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
/* compiled from: PG */
/* renamed from: dcho  reason: default package */
/* loaded from: classes5.dex */
class dcho<K, V> extends dcbi<K, V> implements Serializable {
    private static final long serialVersionUID = 3;
    final dcic a;
    final dcic b;
    final dbrl<Object> c;
    final int d;
    transient ConcurrentMap<K, V> e;

    public dcho(dcic dcicVar, dcic dcicVar2, dbrl<Object> dbrlVar, int i, ConcurrentMap<K, V> concurrentMap) {
        this.a = dcicVar;
        this.b = dcicVar2;
        this.c = dbrlVar;
        this.d = i;
        this.e = concurrentMap;
    }

    @Override // defpackage.dcbn, defpackage.dcbq
    protected final /* bridge */ /* synthetic */ Object SC() {
        return this.e;
    }

    @Override // defpackage.dcbi
    protected final ConcurrentMap<K, V> a() {
        return this.e;
    }

    @Override // defpackage.dcbi, defpackage.dcbn
    protected final /* bridge */ /* synthetic */ Map c() {
        return this.e;
    }
}
