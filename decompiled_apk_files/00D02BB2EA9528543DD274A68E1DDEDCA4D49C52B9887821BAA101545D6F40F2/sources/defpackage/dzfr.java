package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: PG */
/* renamed from: dzfr  reason: default package */
/* loaded from: classes6.dex */
public final class dzfr extends Enum<dzfr> {
    public static final dzfr a;
    private static final /* synthetic */ dzfr[] b;

    static {
        dzfr dzfrVar = new dzfr();
        a = dzfrVar;
        b = new dzfr[]{dzfrVar};
    }

    private dzfr() {
    }

    public static Object a(Throwable th) {
        return new dzfq(th);
    }

    public static Object b(dzak dzakVar) {
        return new dzfp(dzakVar);
    }

    public static <T> boolean c(Object obj, dyzw<? super T> dyzwVar) {
        if (obj == a) {
            dyzwVar.e();
            return true;
        } else if (obj instanceof dzfq) {
            dyzwVar.d(((dzfq) obj).a);
            return true;
        } else if (obj instanceof dzfp) {
            dyzwVar.b(((dzfp) obj).a);
            return false;
        } else {
            dyzwVar.c(obj);
            return false;
        }
    }

    public static dzfr[] values() {
        return (dzfr[]) b.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "NotificationLite.Complete";
    }
}
