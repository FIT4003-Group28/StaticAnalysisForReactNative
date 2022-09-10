package defpackage;

import java.util.Collection;
import java.util.Set;
/* compiled from: PG */
/* renamed from: dcmv  reason: default package */
/* loaded from: classes5.dex */
public abstract class dcmv<R, C, V> extends dcfg<R, C, V> {
    public static <R, C, V> dcmv<R, C, V> v(dcdc<dcot<R, C, V>> dcdcVar, dcep<R> dcepVar, dcep<C> dcepVar2) {
        if (dcdcVar.size() > (dcepVar.size() * dcepVar2.size()) / 2) {
            return new dcar(dcdcVar, dcepVar, dcepVar2);
        }
        return new dcnt(dcdcVar, dcepVar, dcepVar2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void w(R r, C c, V v, V v2) {
        if (v == null) {
            return;
        }
        throw new IllegalArgumentException(dbtx.b("Duplicate key: (row=%s, column=%s), values: [%s, %s].", r, c, v2, v));
    }

    @Override // defpackage.dbyu
    public final /* bridge */ /* synthetic */ Set g() {
        return c() ? dcmr.a : new dcmt(this);
    }

    @Override // defpackage.dbyu
    public final /* bridge */ /* synthetic */ Collection i() {
        return c() ? dcdc.e() : new dcmu(this);
    }

    public abstract dcot<R, C, V> m(int i);

    public abstract V n(int i);
}
