package defpackage;
/* compiled from: PG */
/* renamed from: cswf  reason: default package */
/* loaded from: classes5.dex */
public final class cswf {
    private static cswf a;

    public static synchronized cswf a() {
        cswf cswfVar;
        synchronized (cswf.class) {
            if (a == null) {
                a = new cswf();
            }
            cswfVar = a;
        }
        return cswfVar;
    }
}
