package defpackage;
/* compiled from: PG */
/* renamed from: gei  reason: default package */
/* loaded from: classes6.dex */
public final class gei {
    public static boolean a(gga ggaVar, gen genVar) {
        if (!ggaVar.ba || ggaVar.g().J()) {
            return false;
        }
        fd K = ggaVar.K();
        if (K != null && K.getClass().equals(genVar.getClass())) {
            return false;
        }
        genVar.aJ(ggaVar);
        return true;
    }

    @Deprecated
    public static void b(ff ffVar, ex exVar, String str) {
        if (ffVar.g().H(str) != null) {
            return;
        }
        try {
            exVar.Pl(ffVar.g().b(), str);
        } catch (IllegalStateException e) {
            bvoo.i(e);
        }
    }
}
