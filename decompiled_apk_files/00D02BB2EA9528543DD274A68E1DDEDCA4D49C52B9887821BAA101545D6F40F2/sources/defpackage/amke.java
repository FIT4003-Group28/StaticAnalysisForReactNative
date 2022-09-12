package defpackage;

import java.util.Comparator;
/* compiled from: PG */
/* renamed from: amke  reason: default package */
/* loaded from: classes.dex */
final class amke implements Comparator<amhh> {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(amhh amhhVar, amhh amhhVar2) {
        amhh amhhVar3 = amhhVar;
        amhh amhhVar4 = amhhVar2;
        int h = amkg.h(amhhVar3, amhhVar4);
        if (h == 0 && (h = Float.compare(amhhVar3.f(), amhhVar4.f())) == 0) {
            dmpn a = amhhVar3.s().a();
            dsqv<dmpn, Integer> dsqvVar = akvj.d;
            a.f(dsqvVar);
            Object l = a.V.l(dsqvVar.d);
            int intValue = ((Integer) (l == null ? dsqvVar.b : dsqvVar.b(l))).intValue();
            dmpn a2 = amhhVar4.s().a();
            dsqv<dmpn, Integer> dsqvVar2 = akvj.d;
            a2.f(dsqvVar2);
            Object l2 = a2.V.l(dsqvVar2.d);
            h = decl.c(intValue, ((Integer) (l2 == null ? dsqvVar2.b : dsqvVar2.b(l2))).intValue());
            if (h == 0) {
                return amkg.i(amhhVar3, amhhVar4);
            }
        }
        return h;
    }
}
