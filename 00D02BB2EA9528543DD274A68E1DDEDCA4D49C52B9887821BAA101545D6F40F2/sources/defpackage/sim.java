package defpackage;

import android.app.Application;
import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: sim  reason: default package */
/* loaded from: classes7.dex */
public final class sim {
    public final Context a;
    public final dzsj<qsm> b;
    public final sii c;
    private final shs d;
    private final Executor e;

    public sim(Application application, shs shsVar, dzsj<qsm> dzsjVar, sii siiVar, Executor executor) {
        this.a = application;
        this.d = shsVar;
        this.b = dzsjVar;
        this.c = siiVar;
        this.e = executor;
    }

    public final void a(final int i, final degu<CharSequence> deguVar) {
        final shs shsVar = this.d;
        dehn<?> w = shsVar.b.w();
        final dehn<qjn> a = shsVar.c.a();
        final dehn h = deew.h(deha.m(w, a).b(new Callable(shsVar, a) { // from class: shq
            private final shs a;
            private final dehn b;

            {
                this.a = shsVar;
                this.b = a;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return sie.c(this.a.a, (qjn) deha.s(this.b));
            }
        }, shsVar.e), new dbrn(shsVar, i) { // from class: shp
            private final shs a;
            private final int b;

            {
                this.a = shsVar;
                this.b = i;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                dbsg<dnlg> s;
                dnld dnldVar;
                dnld dnldVar2;
                dngu n;
                shs shsVar2 = this.a;
                int i2 = this.b;
                sie sieVar = (sie) obj;
                if (sieVar == null || sieVar.a() == null || sieVar.b() == null) {
                    return shr.e(i2);
                }
                if (i2 == 1) {
                    s = shsVar2.b.p();
                } else {
                    s = shsVar2.b.s();
                }
                if (!s.a()) {
                    return shr.e(i2);
                }
                dnlg b = s.b();
                if (b.a == 3) {
                    dnldVar = (dnld) b.b;
                } else {
                    dnldVar = dnld.e;
                }
                if ((dnldVar.a & 2) == 0) {
                    return shr.e(i2);
                }
                if (b.a == 3) {
                    dnldVar2 = (dnld) b.b;
                } else {
                    dnldVar2 = dnld.e;
                }
                dspd dspdVar = dnldVar2.c;
                shu shuVar = shsVar2.d;
                dcep<Integer> j = shsVar2.b.j();
                if (i2 == 1) {
                    n = shsVar2.b.l();
                } else {
                    n = shsVar2.b.n();
                }
                return new shm(i2, dspdVar, i2 == 1 ? sieVar.d() : sieVar.e(), shuVar.a(j, n));
            }
        }, shsVar.e);
        h.Pk(new Runnable(this, h, deguVar) { // from class: sij
            private final sim a;
            private final dehn b;
            private final degu c;

            {
                this.a = this;
                this.b = h;
                this.c = deguVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
            /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    r14 = this;
                    sim r0 = r14.a
                    dehn r1 = r14.b
                    degu r2 = r14.c
                    java.lang.Object r1 = defpackage.deha.s(r1)
                    shr r1 = (defpackage.shr) r1
                    if (r1 == 0) goto L83
                    dspd r3 = r1.a()
                    boolean r3 = r3.u()
                    if (r3 == 0) goto L19
                    goto L83
                L19:
                    sii r3 = r0.c
                    int r4 = r1.d()
                    dspd r5 = r1.a()
                    r6 = 1
                    if (r4 != r6) goto L29
                    sih r3 = r3.a
                    goto L2b
                L29:
                    sih r3 = r3.b
                L2b:
                    r4 = 0
                    if (r3 == 0) goto L3b
                    sho r3 = (defpackage.sho) r3
                    dspd r7 = r3.a
                    boolean r5 = r7.equals(r5)
                    if (r5 == 0) goto L3b
                    java.lang.CharSequence r3 = r3.b
                    goto L3c
                L3b:
                    r3 = r4
                L3c:
                    if (r3 == 0) goto L42
                    r2.b(r3)
                    return
                L42:
                    dzsj<qsm> r3 = r0.b
                    java.lang.Object r3 = r3.a()
                    r7 = r3
                    qsm r7 = (defpackage.qsm) r7
                    r7.e()
                    sik r13 = new sik
                    r13.<init>(r0, r1, r2, r7)
                    int r0 = r1.d()
                    if (r0 == 0) goto L82
                    if (r0 != r6) goto L6e
                    dcdc r8 = r1.b()
                    dwbk r9 = defpackage.qsm.b
                    dspd r10 = r1.a()
                    eaph r11 = r1.c()
                    r12 = r13
                    r7.b(r8, r9, r10, r11, r12)
                    return
                L6e:
                    dcdc r8 = r1.b()
                    dwbk r9 = defpackage.qsm.b
                    dspd r10 = r1.a()
                    eaph r11 = r1.c()
                    dbpy<java.lang.Object> r12 = defpackage.dbpy.a
                    r7.c(r8, r9, r10, r11, r12, r13)
                    return
                L82:
                    throw r4
                L83:
                    sil r0 = new sil
                    r0.<init>()
                    r2.a(r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.sij.run():void");
            }
        }, this.e);
    }
}
