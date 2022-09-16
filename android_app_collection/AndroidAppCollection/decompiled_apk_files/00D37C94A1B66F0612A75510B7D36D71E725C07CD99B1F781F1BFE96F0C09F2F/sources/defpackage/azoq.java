package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: PG */
/* renamed from: azoq  reason: default package */
/* loaded from: classes2.dex */
public final class azoq extends Enum {
    public static final azoq a;
    private static final /* synthetic */ azoq[] b;

    static {
        azoq azoqVar = new azoq();
        a = azoqVar;
        b = new azoq[]{azoqVar};
    }

    private azoq() {
    }

    public static Object a(aypg aypgVar) {
        return new azon(aypgVar);
    }

    public static Object b(Throwable th) {
        return new azoo(th);
    }

    public static Object c(bamf bamfVar) {
        return new azop(bamfVar);
    }

    public static Throwable d(Object obj) {
        return ((azoo) obj).a;
    }

    public static boolean e(Object obj, ayom ayomVar) {
        if (obj == a) {
            ayomVar.sm();
            return true;
        } else if (obj instanceof azoo) {
            ayomVar.b(((azoo) obj).a);
            return true;
        } else {
            ayomVar.c(obj);
            return false;
        }
    }

    public static boolean f(Object obj, ayom ayomVar) {
        if (obj == a) {
            ayomVar.sm();
            return true;
        } else if (obj instanceof azoo) {
            ayomVar.b(((azoo) obj).a);
            return true;
        } else if (obj instanceof azon) {
            ayomVar.sj(((azon) obj).a);
            return false;
        } else {
            ayomVar.c(obj);
            return false;
        }
    }

    public static boolean g(Object obj) {
        return obj == a;
    }

    public static boolean h(Object obj) {
        return obj instanceof azoo;
    }

    public static azoq[] values() {
        return (azoq[]) b.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "NotificationLite.Complete";
    }
}
