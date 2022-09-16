package defpackage;
/* compiled from: PG */
/* renamed from: agcj  reason: default package */
/* loaded from: classes.dex */
public final class agcj {
    public static final amup a = amup.m(0, "ACTION1_CLICKED", 1, "ACTION2_CLICKED", 2, "ACTION3_CLICKED");

    public static void a(azqb azqbVar, String str, aadd aaddVar) {
        if (d(aaddVar, azqbVar)) {
            ((vpg) ((akvm) azqbVar.get()).j.get()).b(str);
        }
    }

    public static void b(azqb azqbVar, String str, aadd aaddVar) {
        if (d(aaddVar, azqbVar)) {
            ((vpg) ((akvm) azqbVar.get()).m.get()).b(str);
        }
    }

    public static void c(azqb azqbVar, String str, boolean z, aadd aaddVar) {
        if (d(aaddVar, azqbVar)) {
            ((vpg) ((akvm) azqbVar.get()).n.get()).b(str, Boolean.valueOf(z));
        }
    }

    public static boolean d(aadd aaddVar, azqb azqbVar) {
        if (aaddVar == null || aaddVar.a() == null) {
            return false;
        }
        atps atpsVar = aaddVar.a().p;
        if (atpsVar == null) {
            atpsVar = atps.a;
        }
        return atpsVar != null && atpsVar.l && g(azqbVar);
    }

    public static void e(azqb azqbVar, String str) {
        if (g(azqbVar)) {
            ((vpg) ((akvm) azqbVar.get()).l.get()).b(str, false);
        }
    }

    public static void f(azqb azqbVar, String str, aadd aaddVar) {
        if (d(aaddVar, azqbVar)) {
            e(azqbVar, str);
        }
    }

    private static boolean g(azqb azqbVar) {
        return azqbVar != null;
    }
}
