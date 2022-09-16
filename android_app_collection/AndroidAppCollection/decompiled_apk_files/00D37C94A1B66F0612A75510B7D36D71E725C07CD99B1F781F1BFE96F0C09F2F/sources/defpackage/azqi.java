package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: azqi  reason: default package */
/* loaded from: classes2.dex */
public final class azqi implements Serializable, azqe {
    private azrr a;
    private volatile Object b = azqk.a;
    private final Object c = this;

    public azqi(azrr azrrVar) {
        this.a = azrrVar;
    }

    private final Object writeReplace() {
        return new azqd(a());
    }

    public final String toString() {
        return this.b != azqk.a ? String.valueOf(a()) : "Lazy value not initialized yet.";
    }

    @Override // defpackage.azqe
    public final Object a() {
        Object obj;
        Object obj2 = this.b;
        if (obj2 != azqk.a) {
            return obj2;
        }
        synchronized (this.c) {
            obj = this.b;
            if (obj == azqk.a) {
                azrr azrrVar = this.a;
                azrrVar.getClass();
                obj = azrrVar.mo26invoke();
                this.b = obj;
                this.a = null;
            }
        }
        return obj;
    }
}
