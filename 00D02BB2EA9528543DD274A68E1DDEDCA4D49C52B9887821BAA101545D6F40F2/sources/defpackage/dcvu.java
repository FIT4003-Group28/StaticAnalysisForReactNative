package defpackage;

import java.io.IOException;
/* compiled from: PG */
/* renamed from: dcvu  reason: default package */
/* loaded from: classes.dex */
public final class dcvu extends dcvv {
    public dcvu(dcuu dcuuVar, dcva dcvaVar) {
        super(dcuuVar, dcvaVar);
    }

    public static dcvu c() {
        return new dcvu(dcuu.a(), dcva.d());
    }

    public static dcvu d() {
        return new dcvu(e(), dcva.e());
    }

    public static dcuu e() {
        return new dcuu(-1.5707963267948966d, 1.5707963267948966d);
    }

    public static dcvu f(dcvs dcvsVar, dcvs dcvsVar2) {
        return new dcvu(dcuu.b(dcvsVar.f().b, dcvsVar2.f().b), dcva.f(dcvsVar.h().b, dcvsVar2.h().b));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dcvu j(dcur dcurVar) {
        byte a = dcurVar.a();
        if (a != 1) {
            StringBuilder sb = new StringBuilder(46);
            sb.append("Unsupported S2LatLngRect encoding version ");
            sb.append((int) a);
            throw new IOException(sb.toString());
        }
        dcvu dcvuVar = new dcvu(new dcuu(dcurVar.c(), dcurVar.c()), new dcva(dcurVar.c(), dcurVar.c()));
        if (Math.abs(dcvuVar.a.a) <= 1.5707963267948966d && Math.abs(dcvuVar.a.b) <= 1.5707963267948966d) {
            dcva dcvaVar = dcvuVar.b;
            if (Math.abs(dcvaVar.a) <= 3.141592653589793d && Math.abs(dcvaVar.b) <= 3.141592653589793d) {
                double d = dcvaVar.a;
                if ((d != -3.141592653589793d || dcvaVar.b == 3.141592653589793d) && ((dcvaVar.b != -3.141592653589793d || d == 3.141592653589793d) && dcvuVar.a.d() == dcvuVar.b.i())) {
                    return dcvuVar;
                }
            }
        }
        throw new IOException("Decoded S2LatLngRect is invalid.");
    }

    @Override // defpackage.dcvv
    public final dcuu a() {
        return this.a;
    }

    @Override // defpackage.dcvv
    public final dcva b() {
        return this.b;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        return new dcvu(o(), p());
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.dcvu g(defpackage.dcvs r14) {
        /*
            r13 = this;
            dcvu r0 = new dcvu
            dcuu r1 = r13.a
            dcuy r2 = r14.f()
            double r2 = r2.b
            dcuu r1 = r1.h(r2)
            dcuu r2 = e()
            dcuu r1 = r1.j(r2)
            dcva r2 = r13.b
            dcuy r14 = r14.h()
            double r3 = r14.b
            dcva r14 = new dcva
            r14.<init>(r2)
            r5 = 0
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 < 0) goto L48
            boolean r2 = r14.i()
            if (r2 == 0) goto L30
            goto L86
        L30:
            double r5 = r14.k()
            double r7 = defpackage.dcvc.c
            double r9 = r3 + r3
            double r5 = r5 + r9
            double r7 = r7 + r7
            double r5 = r5 + r7
            r7 = 4618760256179416344(0x401921fb54442d18, double:6.283185307179586)
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 < 0) goto L61
            r14.c()
            goto L86
        L48:
            boolean r2 = r14.h()
            if (r2 != 0) goto L86
            double r7 = r14.k()
            double r9 = defpackage.dcvc.c
            double r11 = r3 + r3
            double r7 = r7 + r11
            double r9 = r9 + r9
            double r7 = r7 - r9
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 > 0) goto L61
            r14.b()
            goto L86
        L61:
            double r5 = r14.a
            double r5 = r5 - r3
            double r6 = defpackage.dcus.b(r5)
            double r8 = r14.b
            double r8 = r8 + r3
            double r8 = defpackage.dcus.b(r8)
            r10 = 0
            r5 = r14
            r5.a(r6, r8, r10)
            double r2 = r14.a
            r4 = -4609115380302729960(0xc00921fb54442d18, double:-3.141592653589793)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 > 0) goto L86
            r2 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
            r14.a = r2
        L86:
            r0.<init>(r1, r14)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dcvu.g(dcvs):dcvu");
    }

    public final dcvu i() {
        dcuu dcuuVar = this.a;
        return (dcuuVar.a == -1.5707963267948966d || dcuuVar.b == 1.5707963267948966d) ? new dcvu(dcuuVar, dcva.e()) : this;
    }

    public dcvu(dcvs dcvsVar, dcvs dcvsVar2) {
        super(dcvsVar, dcvsVar2);
    }
}
