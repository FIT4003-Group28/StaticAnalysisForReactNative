package defpackage;

import com.google.android.apps.maps.R;
import java.util.LinkedHashMap;
/* compiled from: PG */
/* renamed from: chqu  reason: default package */
/* loaded from: classes4.dex */
final class chqu implements bqlb {
    final /* synthetic */ chxr a;
    final /* synthetic */ int b;
    final /* synthetic */ chra c;

    public chqu(chra chraVar, chxr chxrVar, int i) {
        this.c = chraVar;
        this.a = chxrVar;
        this.b = i;
    }

    @Override // defpackage.bqlb
    public final void d(bqlf bqlfVar) {
        bvrj.UI_THREAD.c();
        dcqe dcqeVar = chra.a;
        crzo<chts> crzoVar = this.c.u;
        int i = this.b;
        final chxr chxrVar = this.a;
        crzoVar.a(chts.e(cqrt.o(R.plurals.RATED_STARS_NOTICE, i, Integer.valueOf(i)), cqrt.l(R.string.UNDO), new Runnable(this, chxrVar) { // from class: chqt
            private final chqu a;
            private final chxr b;

            {
                this.a = this;
                this.b = chxrVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                chtb chtbVar;
                chum b;
                chqu chquVar = this.a;
                chxr chxrVar2 = this.b;
                chra chraVar = chquVar.c;
                bvrj.UI_THREAD.c();
                chxl chxlVar = chraVar.k.get(chxrVar2);
                if (chxlVar == null) {
                    return;
                }
                chns chnsVar = chraVar.E;
                int c = chnsVar.l - chnsVar.f().c(dpwe.RATING);
                chnsVar.l = c;
                if (c < 0) {
                    chnsVar.l = 0;
                }
                chnsVar.h();
                if (chraVar.r.c() && (b = (chtbVar = chraVar.H).b(chxrVar2)) != null) {
                    dsqp dsqpVar = (dsqp) b.cu(5);
                    dsqpVar.bC(b);
                    chul chulVar = (chul) dsqpVar;
                    int i2 = b.j - 1;
                    if (chulVar.c) {
                        chulVar.bF();
                        chulVar.c = false;
                    }
                    chum chumVar = (chum) chulVar.b;
                    chumVar.a |= 256;
                    chumVar.j = i2;
                    int h = b.l - chtbVar.h(1, 0);
                    if (chulVar.c) {
                        chulVar.bF();
                        chulVar.c = false;
                    }
                    chum chumVar2 = (chum) chulVar.b;
                    chumVar2.a |= 1024;
                    chumVar2.l = h;
                    chtbVar.g(b.b, chulVar.bK());
                }
                if (chraVar.r.a()) {
                    chrm chrmVar = chraVar.G;
                    dwlh dwlhVar = chxlVar.d;
                    if (dwlhVar == null) {
                        dwlhVar = dwlh.n;
                    }
                    dpsr dpsrVar = dwlhVar.f;
                    if (dpsrVar == null) {
                        dpsrVar = dpsr.c;
                    }
                    String str = dpsrVar.a;
                    chru chruVar = (chru) chrmVar;
                    if (chruVar.b.containsKey(str)) {
                        chug chugVar = chruVar.b.get(str);
                        LinkedHashMap<String, chug> linkedHashMap = chruVar.b;
                        dsqp dsqpVar2 = (dsqp) chugVar.cu(5);
                        dsqpVar2.bC(chugVar);
                        chuf chufVar = (chuf) dsqpVar2;
                        int i3 = chugVar.e - 1;
                        if (chufVar.c) {
                            chufVar.bF();
                            chufVar.c = false;
                        }
                        chug chugVar2 = (chug) chufVar.b;
                        chugVar2.a |= 8;
                        chugVar2.e = i3;
                        int max = Math.max(chugVar.d - chruVar.j(1, 0), 0);
                        if (chufVar.c) {
                            chufVar.bF();
                            chufVar.c = false;
                        }
                        chug chugVar3 = (chug) chufVar.b;
                        chugVar3.a |= 4;
                        chugVar3.d = max;
                        linkedHashMap.put(str, chufVar.bK());
                        chruVar.i();
                    }
                }
                bqji a = chraVar.B.a();
                bqku c2 = bqla.c();
                bqkw k = bqkx.k();
                dwlh dwlhVar2 = chxlVar.d;
                if (dwlhVar2 == null) {
                    dwlhVar2 = dwlh.n;
                }
                dniu dniuVar = dwlhVar2.b;
                if (dniuVar == null) {
                    dniuVar = dniu.i;
                }
                k.c(akqi.b(dniuVar.b));
                k.f(0);
                k.e("");
                c2.b(k.h());
                bqky h2 = bqkz.h();
                h2.d(bzwi.c(blpk.TODO_LIST));
                h2.c(dhpj.TODO_LIST);
                c2.c(h2.a());
                a.c(c2.d(), bwrs.a(chraVar.ak(chxlVar)), new chqv(chraVar));
                dsqp dsqpVar3 = (dsqp) chxlVar.cu(5);
                dsqpVar3.bC(chxlVar);
                chvz chvzVar = (chvz) dsqpVar3;
                if (chvzVar.c) {
                    chvzVar.bF();
                    chvzVar.c = false;
                }
                chxl chxlVar2 = (chxl) chvzVar.b;
                int i4 = chxlVar2.a & (-257);
                chxlVar2.a = i4;
                chxlVar2.k = 0;
                chxlVar2.a = i4 & (-513);
                chxlVar2.l = false;
                chraVar.k.put(chxrVar2, chvzVar.bK());
                chraVar.af();
            }
        }, cjtd.a(dtxl.hF)));
    }

    @Override // defpackage.bqlb
    public final void e() {
        bvrj.UI_THREAD.c();
        dcqe dcqeVar = chra.a;
        chra chraVar = this.c;
        cjxu.l(chraVar.e, chraVar.g.H(), "Failed to submit rating");
    }
}
