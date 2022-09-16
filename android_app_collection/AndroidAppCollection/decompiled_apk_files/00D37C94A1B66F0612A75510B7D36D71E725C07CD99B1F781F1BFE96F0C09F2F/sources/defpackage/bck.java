package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: bck  reason: default package */
/* loaded from: classes2.dex */
public final class bck implements aze {
    private azh a;
    private bcr b;
    private boolean c;

    private final boolean a(azf azfVar) {
        bcm bcmVar = new bcm();
        if (bcmVar.b(azfVar, true) && (bcmVar.a & 2) == 2) {
            int min = Math.min(bcmVar.e, 8);
            pwu pwuVar = new pwu(min);
            azfVar.j(pwuVar.a, 0, min);
            b(pwuVar);
            if (pwuVar.a() < 5 || pwuVar.i() != 127 || pwuVar.p() != 1179402563) {
                b(pwuVar);
                try {
                    if (ja.K(1, pwuVar, true)) {
                        this.b = new bct();
                    }
                } catch (pjq unused) {
                }
                b(pwuVar);
                byte[] bArr = bco.a;
                if (pwuVar.a() >= 8) {
                    byte[] bArr2 = new byte[8];
                    pwuVar.B(bArr2, 0, 8);
                    if (Arrays.equals(bArr2, bco.a)) {
                        this.b = new bco();
                    }
                }
            } else {
                this.b = new bcj();
            }
            return true;
        }
        return false;
    }

    private static void b(pwu pwuVar) {
        pwuVar.G(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.aze
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int d(defpackage.azf r19, defpackage.azv r20) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bck.d(azf, azv):int");
    }

    @Override // defpackage.aze
    public final void e(azh azhVar) {
        this.a = azhVar;
    }

    @Override // defpackage.aze
    public final void f() {
    }

    @Override // defpackage.aze
    public final void g(long j, long j2) {
        bcr bcrVar = this.b;
        if (bcrVar != null) {
            bcl bclVar = bcrVar.b;
            bclVar.a.a();
            bclVar.b.C(0);
            bclVar.c = -1;
            bclVar.d = false;
            if (j == 0) {
                bcrVar.b(!bcrVar.m);
            } else if (bcrVar.i == 0) {
            } else {
                long e = bcrVar.e(j2);
                bcrVar.f = e;
                bcn bcnVar = bcrVar.e;
                int i = pxi.a;
                bcnVar.c(e);
                bcrVar.i = 2;
            }
        }
    }

    @Override // defpackage.aze
    public final boolean h(azf azfVar) {
        try {
            return a(azfVar);
        } catch (pjq unused) {
            return false;
        }
    }
}
