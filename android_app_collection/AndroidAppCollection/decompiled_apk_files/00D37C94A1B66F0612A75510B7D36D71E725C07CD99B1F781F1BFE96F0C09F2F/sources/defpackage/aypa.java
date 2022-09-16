package defpackage;
/* compiled from: PG */
/* renamed from: aypa  reason: default package */
/* loaded from: classes2.dex */
public final class aypa {
    private static final ayor a;

    static {
        ayqe ayqeVar = aydc.a;
        try {
            ayor ayorVar = ayoz.a;
            if (ayorVar == null) {
                throw new NullPointerException("Scheduler Callable returned null");
            }
            a = ayorVar;
        } catch (Throwable th) {
            throw azom.b(th);
        }
    }

    public static ayor a() {
        ayor ayorVar = a;
        if (ayorVar != null) {
            ayqe ayqeVar = aydc.b;
            return ayorVar;
        }
        throw new NullPointerException("scheduler == null");
    }
}
