package defpackage;
/* compiled from: PG */
/* renamed from: ctmp  reason: default package */
/* loaded from: classes5.dex */
public final class ctmp {
    private static ctmp a;

    public static synchronized ctmp a() {
        ctmp ctmpVar;
        synchronized (ctmp.class) {
            if (a == null) {
                a = new ctmp();
            }
            ctmpVar = a;
        }
        return ctmpVar;
    }
}
