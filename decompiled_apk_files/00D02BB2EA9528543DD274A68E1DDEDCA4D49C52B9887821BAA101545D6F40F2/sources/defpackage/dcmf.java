package defpackage;

import java.io.Serializable;
import java.lang.Comparable;
/* compiled from: PG */
/* renamed from: dcmf  reason: default package */
/* loaded from: classes5.dex */
final class dcmf<C extends Comparable> implements Serializable {
    final dclz<C> a;
    final dcau<C> b;

    public dcmf(dclz<C> dclzVar, dcau<C> dcauVar) {
        this.a = dclzVar;
        this.b = dcauVar;
    }

    private Object readResolve() {
        return new dcmg(this.a, this.b);
    }
}
