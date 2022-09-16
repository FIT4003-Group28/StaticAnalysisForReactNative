package defpackage;
/* compiled from: PG */
/* renamed from: azwe  reason: default package */
/* loaded from: classes2.dex */
public final class azwe {
    public static final azwe a = new azwe();
    public static final ThreadLocal b = new ThreadLocal();

    private azwe() {
    }

    public final azvg a() {
        ThreadLocal threadLocal = b;
        azvg azvgVar = (azvg) threadLocal.get();
        if (azvgVar == null) {
            azty aztyVar = new azty(Thread.currentThread());
            threadLocal.set(aztyVar);
            return aztyVar;
        }
        return azvgVar;
    }
}
