package defpackage;

import java.io.Serializable;
import java.util.Comparator;
/* compiled from: PG */
/* renamed from: amvp  reason: default package */
/* loaded from: classes.dex */
final class amvp implements Serializable {
    private static final long serialVersionUID = 0;
    final Comparator a;
    final Object[] b;

    public amvp(Comparator comparator, Object[] objArr) {
        this.a = comparator;
        this.b = objArr;
    }

    Object readResolve() {
        Comparator comparator = this.a;
        amvl amvlVar = new amvl();
        comparator.getClass();
        amvo.b(this.b, amvlVar);
        return amvo.a(comparator, amvlVar);
    }
}
