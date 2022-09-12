package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: csnp  reason: default package */
/* loaded from: classes5.dex */
public final class csnp<V> extends csnw<V> {
    public dccx<csoa<V>> a;
    public dcdc<csoa<V>> b;

    @Override // defpackage.csnw
    public final csnx<V> a() {
        dccx<csoa<V>> dccxVar = this.a;
        if (dccxVar != null) {
            this.b = dccxVar.f();
        } else if (this.b == null) {
            this.b = dcdc.e();
        }
        return new csnq(this.b);
    }

    @Override // defpackage.csnw
    public final void b(List<csoa<V>> list) {
        if (this.a != null) {
            throw new IllegalStateException("Cannot set values after calling valuesBuilder()");
        }
        this.b = dcdc.r(list);
    }
}
