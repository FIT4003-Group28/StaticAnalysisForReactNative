package defpackage;
/* compiled from: PG */
/* renamed from: vnv  reason: default package */
/* loaded from: classes7.dex */
public final class vnv {
    private static final dcqe a = dcqe.c("vnv");

    private static vnu b(vnu vnuVar, dcdc<vnu> dcdcVar) {
        vnu vnuVar2;
        if (vnuVar == null || !c(vnuVar.d())) {
            return vnuVar;
        }
        int i = 0;
        while (true) {
            if (i >= dcdcVar.size()) {
                vnuVar2 = null;
                break;
            }
            vnuVar2 = dcdcVar.get(i);
            if (vnuVar2.l(vnuVar)) {
                break;
            }
            i++;
        }
        return (vnuVar2 == null || !vnuVar2.e() || c(vnuVar2.d())) ? vnuVar : vnuVar2.i(false);
    }

    private static boolean c(vwn vwnVar) {
        if (vwnVar.u()) {
            return true;
        }
        if (!vwnVar.t()) {
            return false;
        }
        amte p = vwnVar.p();
        return p == null || p.a.n() == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.dcdc<defpackage.vnu> a(defpackage.dcdc<defpackage.vnu> r9, defpackage.vwn r10, @defpackage.dzsi defpackage.vun r11, defpackage.dqvj r12) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vnv.a(dcdc, vwn, vun, dqvj):dcdc");
    }
}
