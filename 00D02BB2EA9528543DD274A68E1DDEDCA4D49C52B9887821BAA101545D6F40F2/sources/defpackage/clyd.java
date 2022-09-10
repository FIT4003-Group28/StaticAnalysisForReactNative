package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: clyd  reason: default package */
/* loaded from: classes5.dex */
public final class clyd implements clun {
    private clup a;
    private clyk b;
    private boolean c;

    static {
        int i = clyc.a;
    }

    private final boolean a(cluk clukVar) {
        clyf clyfVar = new clyf();
        if (clyfVar.d(clukVar, true) && (clyfVar.a & 2) == 2) {
            int min = Math.min(clyfVar.e, 8);
            cmnk cmnkVar = new cmnk(min);
            clukVar.f(cmnkVar.a, 0, min);
            b(cmnkVar);
            if (cmnkVar.d() < 5 || cmnkVar.l() != 127 || cmnkVar.p() != 1179402563) {
                b(cmnkVar);
                try {
                    if (clvp.c(1, cmnkVar, true)) {
                        this.b = new clym();
                    }
                } catch (clob unused) {
                }
                b(cmnkVar);
                byte[] bArr = clyh.a;
                if (cmnkVar.d() >= 8) {
                    byte[] bArr2 = new byte[8];
                    cmnkVar.j(bArr2, 0, 8);
                    if (Arrays.equals(bArr2, clyh.a)) {
                        this.b = new clyh();
                    }
                }
            } else {
                this.b = new clyb();
            }
            return true;
        }
        return false;
    }

    private static void b(cmnk cmnkVar) {
        cmnkVar.f(0);
    }

    @Override // defpackage.clun
    public final void d(clup clupVar) {
        this.a = clupVar;
    }

    @Override // defpackage.clun
    public final void e(long j, long j2) {
        clyk clykVar = this.b;
        if (clykVar != null) {
            clye clyeVar = clykVar.b;
            clyeVar.a.a();
            clyeVar.b.a(0);
            clyeVar.c = -1;
            clyeVar.d = false;
            if (j == 0) {
                clykVar.a(!clykVar.m);
            } else if (clykVar.i == 0) {
            } else {
                long e = clykVar.e(j2);
                clykVar.f = e;
                clykVar.e.a(e);
                clykVar.i = 2;
            }
        }
    }

    @Override // defpackage.clun
    public final boolean f(cluk clukVar) {
        try {
            return a(clukVar);
        } catch (clob unused) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.clun
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int g(defpackage.cluk r23, defpackage.clvd r24) {
        /*
            Method dump skipped, instructions count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clyd.g(cluk, clvd):int");
    }
}
