package defpackage;

import java.util.ArrayList;
import java.util.PriorityQueue;
/* compiled from: PG */
/* renamed from: dcxb  reason: default package */
/* loaded from: classes5.dex */
public final class dcxb {
    public final dcxa a;
    int b = 0;
    public final ArrayList<dcvf> c = new ArrayList<>();
    public final PriorityQueue<dcxf> d = new PriorityQueue<>(10, new dcxe());
    public final /* synthetic */ dcxg e;

    public dcxb(dcxg dcxgVar, dcxa dcxaVar) {
        this.e = dcxgVar;
        this.a = dcxaVar;
    }

    private final int c() {
        return 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
        if (r5.b <= r2.b) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
        if (r0.b.m(r1.b) != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.dcxd a(defpackage.dcve r12) {
        /*
            r11 = this;
            dcxa r0 = r11.a
            dcvu r1 = r12.b()
            dcvv r0 = (defpackage.dcvv) r0
            boolean r0 = r0.s(r1)
            if (r0 == 0) goto L67
            byte r0 = r12.b
            dcxg r1 = r11.e
            int r2 = r1.b
            r3 = 0
            r4 = 1
            if (r0 < r2) goto L4c
            int r0 = r0 + r4
            int r1 = r1.c
            if (r0 > r1) goto L4b
            dcxa r0 = r11.a
            dcvu r1 = r12.b()
            dcvv r0 = (defpackage.dcvv) r0
            dcuu r2 = r0.a
            dcuu r5 = r1.a
            boolean r6 = r5.d()
            if (r6 == 0) goto L30
            goto L41
        L30:
            double r6 = r5.a
            double r8 = r2.a
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 < 0) goto L4c
            double r5 = r5.b
            double r7 = r2.b
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 <= 0) goto L41
            goto L4c
        L41:
            dcva r0 = r0.b
            dcva r1 = r1.b
            boolean r0 = r0.m(r1)
            if (r0 == 0) goto L4c
        L4b:
            r3 = 1
        L4c:
            dcxd r0 = new dcxd
            r0.<init>()
            r0.a = r12
            r0.b = r3
            if (r3 != 0) goto L61
            int r12 = r11.c()
            int r12 = r4 << r12
            dcxd[] r12 = new defpackage.dcxd[r12]
            r0.d = r12
        L61:
            int r12 = r11.b
            int r12 = r12 + r4
            r11.b = r12
            return r0
        L67:
            r12 = 0
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dcxb.a(dcve):dcxd");
    }

    public final void b(dcxd dcxdVar) {
        dcve[] dcveVarArr;
        if (dcxdVar == null) {
            return;
        }
        if (!dcxdVar.b) {
            dcve dcveVar = dcxdVar.a;
            byte b = dcveVar.b;
            int i = 4;
            dcve[] dcveVarArr2 = new dcve[4];
            for (int i2 = 0; i2 < 4; i2++) {
                dcveVarArr2[i2] = new dcve();
            }
            if (!dcveVar.d.j()) {
                dcvf q = dcveVar.d.q();
                long e = dcveVar.d.e();
                dcuw dcuwVar = new dcuw(dcwz.f.a(dcwz.d(dcvf.f(e))), dcwz.f.a(dcwz.d((int) e)));
                double d = dcuwVar.a;
                double d2 = dcuwVar.b;
                int i3 = 0;
                while (i3 < i) {
                    dcve dcveVar2 = dcveVarArr2[i3];
                    dcveVar2.a = dcveVar.a;
                    dcveVar2.b = (byte) (dcveVar.b + 1);
                    dcveVar2.c = (byte) (dcveVar.c ^ dcvc.a(i3));
                    dcveVar2.d = q;
                    int b2 = dcvc.b(dcveVar.c, i3);
                    if ((b2 & 2) != 0) {
                        dcveVar2.e = d;
                        dcveVarArr = dcveVarArr2;
                        dcveVar2.f = dcveVar.f;
                    } else {
                        dcveVarArr = dcveVarArr2;
                        dcveVar2.e = dcveVar.e;
                        dcveVar2.f = d;
                    }
                    if ((b2 & 1) != 0) {
                        dcveVar2.g = d2;
                        dcveVar2.h = dcveVar.h;
                    } else {
                        dcveVar2.g = dcveVar.g;
                        dcveVar2.h = d2;
                    }
                    i3++;
                    q = q.r();
                    dcveVarArr2 = dcveVarArr;
                    i = 4;
                }
            }
            dcve[] dcveVarArr3 = dcveVarArr2;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                dcxd a = a(dcveVarArr3[i5]);
                if (a != null) {
                    dcxd[] dcxdVarArr = dcxdVar.d;
                    int i6 = dcxdVar.c;
                    dcxdVar.c = i6 + 1;
                    dcxdVarArr[i6] = a;
                    if (a.b) {
                        i4++;
                    }
                }
            }
            if (dcxdVar.c == 0) {
                return;
            }
            if (i4 != (1 << c()) || dcxdVar.a.b < this.e.b) {
                byte b3 = dcxdVar.a.b;
                int c = c();
                int i7 = dcxdVar.c;
                this.d.add(new dcxf(-((((b3 << c) + i7) << c()) + i4), dcxdVar));
                return;
            }
            dcxdVar.b = true;
            b(dcxdVar);
            return;
        }
        this.c.add(dcxdVar.a.d);
    }
}
