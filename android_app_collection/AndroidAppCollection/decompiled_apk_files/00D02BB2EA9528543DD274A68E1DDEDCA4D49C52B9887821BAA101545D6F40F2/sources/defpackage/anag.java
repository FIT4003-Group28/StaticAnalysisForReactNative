package defpackage;
/* compiled from: PG */
/* renamed from: anag  reason: default package */
/* loaded from: classes.dex */
public final class anag {
    private static final ThreadLocal<anad> a = new ThreadLocal<>();

    public static anad a() {
        anad anadVar = a.get();
        if (anadVar == null) {
            return new anad();
        }
        anadVar.c(0);
        return anadVar;
    }

    public static void b(@dzsi anad anadVar) {
        anadVar.d();
        a.set(anadVar);
    }
}
