package defpackage;
/* compiled from: PG */
/* renamed from: aefy  reason: default package */
/* loaded from: classes.dex */
public final class aefy {
    public static boolean a(acyu acyuVar) {
        return b(acyuVar, 50);
    }

    public static boolean b(acyu acyuVar, int i) {
        return acyuVar.c() <= acyuVar.u() + jmj.a(acyuVar.o().getContext(), i);
    }

    public static ddmo c(acyu acyuVar) {
        return d(acyuVar, acyuVar.u());
    }

    public static ddmo d(acyu acyuVar, int i) {
        int c = acyuVar.c();
        if (c == 0) {
            return ddmo.HIDDEN;
        }
        if (c <= i) {
            return ddmo.COLLAPSED;
        }
        if (c < acyuVar.o().getHeight()) {
            return ddmo.PARTIAL_EXPANSION;
        }
        return ddmo.FULL_EXPANSION;
    }
}
