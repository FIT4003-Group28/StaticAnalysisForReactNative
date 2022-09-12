package defpackage;
/* compiled from: PG */
/* renamed from: cyeq  reason: default package */
/* loaded from: classes5.dex */
public final class cyeq {
    public static boolean a(duej duejVar, duej duejVar2) {
        if (duejVar != duejVar2) {
            if (duejVar != duej.PROFILE && duejVar != duej.DOMAIN_PROFILE) {
                return false;
            }
            if (duejVar2 != duej.PROFILE && duejVar2 != duej.DOMAIN_PROFILE) {
                return false;
            }
        }
        return true;
    }

    public static int b(duej duejVar) {
        duej duejVar2 = duej.UNKNOWN_CONTAINER;
        int ordinal = duejVar.ordinal();
        return (ordinal == 1 || ordinal == 7 || ordinal == 4 || ordinal == 5) ? 0 : 1;
    }

    public static boolean c(duej duejVar) {
        return b(duejVar) == 0;
    }
}
