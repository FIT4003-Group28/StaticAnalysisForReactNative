package defpackage;

import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: dzaf  reason: default package */
/* loaded from: classes6.dex */
public final class dzaf {
    private static final dyzz a;

    static {
        dzba<Callable<dyzz>, dyzz> dzbaVar = dzad.a;
        try {
            dyzz dyzzVar = dzae.a;
            if (dyzzVar == null) {
                throw new NullPointerException("Scheduler Callable returned null");
            }
            a = dyzzVar;
        } catch (Throwable th) {
            throw dzfo.a(th);
        }
    }

    public static dyzz a() {
        dyzz dyzzVar = a;
        if (dyzzVar != null) {
            dzba<dyzz, dyzz> dzbaVar = dzad.b;
            return dyzzVar;
        }
        throw new NullPointerException("scheduler == null");
    }
}
