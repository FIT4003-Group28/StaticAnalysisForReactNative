package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dcfg  reason: default package */
/* loaded from: classes5.dex */
public abstract class dcfg<R, C, V> extends dbyu<R, C, V> implements Serializable {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static <R, C, V> dcot<R, C, V> q(R r, C c, V v) {
        dbsk.t(r, "rowKey");
        dbsk.t(c, "columnKey");
        dbsk.t(v, "value");
        return dcox.a(r, c, v);
    }

    @Override // defpackage.dbyu
    @Deprecated
    public final void d() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.dbyu
    public final /* bridge */ /* synthetic */ Iterator h() {
        throw new AssertionError("should never be called");
    }

    public abstract dcdn<C, Map<R, V>> j();

    public abstract dcdn<R, Map<C, V>> k();

    public abstract dcff o();

    @Override // defpackage.dcou
    public /* bridge */ /* synthetic */ Map p() {
        throw null;
    }

    @Override // defpackage.dbyu, defpackage.dcou
    /* renamed from: r */
    public final dcep<dcot<R, C, V>> f() {
        return (dcep) super.f();
    }

    public final dccr<V> s() {
        Collection<V> collection = this.a;
        if (collection == null) {
            collection = i();
            this.a = collection;
        }
        return (dccr) collection;
    }

    public final dcep<C> t() {
        return j().keySet();
    }

    public final dcep<R> u() {
        return k().keySet();
    }

    final Object writeReplace() {
        return o();
    }
}
