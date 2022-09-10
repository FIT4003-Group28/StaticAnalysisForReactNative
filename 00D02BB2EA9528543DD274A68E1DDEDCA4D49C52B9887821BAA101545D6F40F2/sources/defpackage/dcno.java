package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: dcno  reason: default package */
/* loaded from: classes5.dex */
public final class dcno<R, C, V> extends dcfg<R, C, V> {
    final R b;
    final C c;
    final V d;

    public dcno(R r, C c, V v) {
        dbsk.s(r);
        this.b = r;
        dbsk.s(c);
        this.c = c;
        dbsk.s(v);
        this.d = v;
    }

    @Override // defpackage.dbyu
    public final /* bridge */ /* synthetic */ Set g() {
        return dcep.B(q(this.b, this.c, this.d));
    }

    @Override // defpackage.dbyu
    public final /* bridge */ /* synthetic */ Collection i() {
        return dcep.B(this.d);
    }

    @Override // defpackage.dcfg
    public final dcdn<C, Map<R, V>> j() {
        return dcdn.k(this.c, dcdn.k(this.b, this.d));
    }

    @Override // defpackage.dcfg, defpackage.dcou
    /* renamed from: k */
    public final dcdn<R, Map<C, V>> p() {
        return dcdn.k(this.b, dcdn.k(this.c, this.d));
    }

    @Override // defpackage.dcou
    public final int l() {
        return 1;
    }

    @Override // defpackage.dcfg
    public final dcff o() {
        return dcff.a(this, new int[]{0}, new int[]{0});
    }
}
