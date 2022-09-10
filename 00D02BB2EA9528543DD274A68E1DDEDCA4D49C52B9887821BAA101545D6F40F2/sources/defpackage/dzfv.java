package defpackage;
/* compiled from: PG */
/* renamed from: dzfv  reason: default package */
/* loaded from: classes6.dex */
public final class dzfv {
    public static <T, U> boolean a(boolean z, boolean z2, dyzw dyzwVar, dzbq dzbqVar, dzak dzakVar, dzfs<T, U> dzfsVar) {
        if (((dzbw) dzfsVar).c) {
            dzbqVar.f();
            dzakVar.SQ();
            return true;
        } else if (!z || !z2) {
            return false;
        } else {
            dzakVar.SQ();
            dyzwVar.e();
            return true;
        }
    }

    public static <T, U> void b(dzbp<T> dzbpVar, dyzw<? super U> dyzwVar, dzak dzakVar, dzfs<T, U> dzfsVar) {
        int i = 1;
        do {
            dzbw dzbwVar = (dzbw) dzfsVar;
            if (a(dzbwVar.d, dzbpVar.SO(), dyzwVar, dzbpVar, dzakVar, dzfsVar)) {
                return;
            }
            while (true) {
                boolean z = dzbwVar.d;
                T SP = dzbpVar.SP();
                boolean z2 = SP == null;
                if (a(z, z2, dyzwVar, dzbpVar, dzakVar, dzfsVar)) {
                    return;
                }
                if (!z2) {
                    dzfsVar.h(SP);
                } else {
                    i = dzfsVar.g(-i);
                }
            }
        } while (i != 0);
    }
}
