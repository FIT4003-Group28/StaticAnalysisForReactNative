package defpackage;
/* compiled from: PG */
/* renamed from: byeg  reason: default package */
/* loaded from: classes4.dex */
public final class byeg {
    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean a(@dzsi dgsj dgsjVar) {
        if (dgsjVar == null || !e(dgsjVar)) {
            return false;
        }
        dgsf dgsfVar = dgsjVar.d;
        if (dgsfVar == null) {
            dgsfVar = dgsf.i;
        }
        if (!d(dgsfVar)) {
            return false;
        }
        dgsf dgsfVar2 = dgsjVar.e;
        if (dgsfVar2 == null) {
            dgsfVar2 = dgsf.i;
        }
        return d(dgsfVar2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean b(@dzsi dgsj dgsjVar) {
        if (dgsjVar == null || !e(dgsjVar)) {
            return false;
        }
        dgsf dgsfVar = dgsjVar.d;
        if (dgsfVar == null) {
            dgsfVar = dgsf.i;
        }
        if (!c(dgsfVar)) {
            return false;
        }
        dgsf dgsfVar2 = dgsjVar.e;
        if (dgsfVar2 == null) {
            dgsfVar2 = dgsf.i;
        }
        return c(dgsfVar2);
    }

    private static boolean c(@dzsi dgsf dgsfVar) {
        if (dgsfVar == null || (dgsfVar.a & 8) == 0) {
            return false;
        }
        int a = dgsc.a(dgsfVar.f);
        return a == 0 || a == 1;
    }

    private static boolean d(@dzsi dgsf dgsfVar) {
        return (dgsfVar == null || (dgsfVar.a & 4) == 0) ? false : true;
    }

    private static boolean e(dgsj dgsjVar) {
        int a;
        return !dgsjVar.c && (a = dgsi.a(dgsjVar.b)) != 0 && a == 2;
    }
}
