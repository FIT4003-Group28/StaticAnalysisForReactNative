package defpackage;

import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: amif  reason: default package */
/* loaded from: classes.dex */
public final class amif implements akso {
    private final amlm b;
    private final dzsj<akwt> c;
    private final anbe d;
    public final amgu a = new amgu();
    private final Set<Integer> e = dcnm.c();

    public amif(amlm amlmVar, dzsj<akwt> dzsjVar, anbe anbeVar) {
        this.b = amlmVar;
        this.c = dzsjVar;
        this.d = anbeVar;
    }

    public static int c(dmrt dmrtVar, dmrt dmrtVar2) {
        return dbzx.b.e(alww.a(f(dmrtVar), dmrtVar.h), alww.a(f(dmrtVar2), dmrtVar2.h)).c(System.identityHashCode(dmrtVar), System.identityHashCode(dmrtVar2)).i();
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0579  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x05c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.dbsg<defpackage.dmpn> d(defpackage.dmpn r21, defpackage.amic r22, android.util.SparseArray<defpackage.dmrt> r23, int r24, defpackage.dcdc<java.lang.Integer> r25) {
        /*
            Method dump skipped, instructions count: 1551
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amif.d(dmpn, amic, android.util.SparseArray, int, dcdc):dbsg");
    }

    private static boolean e(List<Integer> list, List<Integer> list2) {
        for (int i = 0; i < list.size(); i++) {
            if (list2.contains(list.get(i))) {
                return true;
            }
        }
        return false;
    }

    private static int f(dmrt dmrtVar) {
        Object b;
        dsqv<dmrt, alwt> dsqvVar = alwu.d;
        dmrtVar.f(dsqvVar);
        if (dmrtVar.V.k(dsqvVar.d)) {
            dsqv<dmrt, alwt> dsqvVar2 = alwu.d;
            dmrtVar.f(dsqvVar2);
            Object l = dmrtVar.V.l(dsqvVar2.d);
            if (l == null) {
                b = dsqvVar2.b;
            } else {
                b = dsqvVar2.b(l);
            }
            return ((alwt) b).d;
        }
        return 0;
    }

    @Override // defpackage.akso
    public final synchronized void a(Set<Integer> set) {
        this.e.clear();
        this.e.addAll(set);
    }

    /* JADX WARN: Removed duplicated region for block: B:167:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x050e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.util.List<defpackage.amkk> r29, float r30, java.util.List<defpackage.dmrt> r31) {
        /*
            Method dump skipped, instructions count: 1307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amif.b(java.util.List, float, java.util.List):void");
    }
}
