package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: amvj  reason: default package */
/* loaded from: classes.dex */
final class amvj implements Serializable {
    private final amuk a;

    public amvj(amuk amukVar) {
        this.a = amukVar;
    }

    Object readResolve() {
        if (this.a.isEmpty()) {
            return amvk.a;
        }
        if (amxp.v(this.a, amuk.r(amxt.a))) {
            return amvk.b;
        }
        return new amvk(this.a);
    }
}
