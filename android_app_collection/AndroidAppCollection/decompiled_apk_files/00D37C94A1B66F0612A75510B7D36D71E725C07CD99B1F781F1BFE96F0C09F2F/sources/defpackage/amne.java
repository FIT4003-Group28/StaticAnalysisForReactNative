package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: amne  reason: default package */
/* loaded from: classes.dex */
public final class amne extends anjz {
    private amne(ankt anktVar) {
        super(anktVar);
    }

    public static amne f(ankt anktVar) {
        if (anktVar instanceof amne) {
            return (amne) anktVar;
        }
        return new amne(anktVar);
    }

    public final amne b(Class cls, ampg ampgVar, Executor executor) {
        return new amne(anhq.h(this.b, cls, ammo.a(ampgVar), executor));
    }

    public final amne c(Class cls, anir anirVar, Executor executor) {
        return new amne(amnt.c(this.b, cls, anirVar, executor));
    }

    public final amne h(ampg ampgVar, Executor executor) {
        return new amne(amnt.e(this.b, ampgVar, executor));
    }

    public final amne i(anir anirVar, Executor executor) {
        return new amne(amnt.f(this.b, anirVar, executor));
    }
}
