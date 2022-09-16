package defpackage;

import java.io.Serializable;
import java.util.Set;
/* compiled from: PG */
/* renamed from: amvk  reason: default package */
/* loaded from: classes.dex */
public final class amvk extends amrx implements Serializable {
    public static final amvk a = new amvk(amuk.q());
    public static final amvk b = new amvk(amuk.r(amxt.a));
    private final transient amuk c;

    public amvk(amuk amukVar) {
        this.c = amukVar;
    }

    public static amvi c() {
        return new amvi();
    }

    @Override // defpackage.amxv
    public final /* bridge */ /* synthetic */ Set d() {
        if (this.c.isEmpty()) {
            return amyg.a;
        }
        return new amyh(this.c, amxt.c());
    }

    Object writeReplace() {
        return new amvj(this.c);
    }
}
