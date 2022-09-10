package defpackage;
/* compiled from: PG */
/* renamed from: alwl  reason: default package */
/* loaded from: classes.dex */
public final class alwl {
    public static int a(dmpn dmpnVar) {
        Object b;
        dsqv<dmpn, alwt> dsqvVar = alwu.c;
        dmpnVar.f(dsqvVar);
        if (dmpnVar.V.k(dsqvVar.d)) {
            dsqv<dmpn, alwt> dsqvVar2 = alwu.c;
            dmpnVar.f(dsqvVar2);
            Object l = dmpnVar.V.l(dsqvVar2.d);
            if (l == null) {
                b = dsqvVar2.b;
            } else {
                b = dsqvVar2.b(l);
            }
            return ((alwt) b).d;
        }
        return 0;
    }

    public static boolean b(dmpn dmpnVar) {
        dsqv<dmpn, alwt> dsqvVar = alwu.c;
        dmpnVar.f(dsqvVar);
        return !dmpnVar.V.k(dsqvVar.d);
    }
}
