package defpackage;

import com.google.android.apps.maps.R;
import java.util.LinkedHashMap;
/* compiled from: PG */
/* renamed from: chrc  reason: default package */
/* loaded from: classes4.dex */
public final class chrc<T> extends btrh<T> {
    private final int d;

    public chrc(int i, Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        chtb chtbVar;
        chum b;
        baad S;
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                chra chraVar = (chra) this.a;
                azrb azrbVar = (azrb) obj;
                baad baadVar = azrbVar.a;
                if (azrbVar.b != 2 || baadVar == null) {
                    return;
                }
                if (chraVar.k.get(chsp.b(baadVar.l())) == null || (S = chraVar.S(baadVar)) == null) {
                    return;
                }
                chns chnsVar = chraVar.E;
                if (!baadVar.x()) {
                    return;
                }
                int d = chnsVar.l + (chnsVar.d(baadVar) - chnsVar.d(S));
                chnsVar.l = d;
                if (d < 0) {
                    chnsVar.l = 0;
                }
                chnsVar.g();
                chnsVar.h();
                return;
            }
            chra chraVar2 = (chra) this.a;
            baad baadVar2 = ((azrc) obj).a;
            if (baadVar2 == null) {
                return;
            }
            chxl chxlVar = chraVar2.k.get(chsp.b(baadVar2.l()));
            if (chxlVar == null) {
                return;
            }
            baad S2 = chraVar2.S(baadVar2);
            if (baadVar2.x() && dcft.m(chxlVar.u, chqj.a).a()) {
                chns chnsVar2 = chraVar2.E;
                if (!baadVar2.x()) {
                    return;
                }
                chnsVar2.l += chnsVar2.d(baadVar2);
                chnsVar2.g();
                chnsVar2.h();
                return;
            } else if (S2 == null || !S2.x() || baadVar2.x()) {
                return;
            } else {
                chns chnsVar3 = chraVar2.E;
                if (!S2.x()) {
                    return;
                }
                chnsVar3.l -= chnsVar3.d(S2);
                chnsVar3.g();
                chnsVar3.h();
                return;
            }
        }
        final chra chraVar3 = (chra) this.a;
        bqje bqjeVar = (bqje) obj;
        bvrj.UI_THREAD.c();
        final ilo c = bqjeVar.a.c();
        dbsk.s(c);
        chxr a = chsp.a(c.ai().o(), dbpy.a);
        chxl chxlVar2 = chraVar3.k.get(a);
        if (chxlVar2 == null) {
            return;
        }
        doco bo = c.bo();
        docg docgVar = bo.c;
        if (docgVar == null) {
            docgVar = docg.M;
        }
        docg docgVar2 = bo.d;
        if (docgVar2 == null) {
            docgVar2 = docg.M;
        }
        if ((2 & bo.a) != 0) {
            chraVar3.q.put(c.ai().o(), docgVar2);
        } else {
            chraVar3.q.remove(c.ai().o());
        }
        boolean z = chxlVar2.k == 0 && docgVar.q > 0;
        boolean z2 = !docgVar.r.isEmpty();
        dsqp dsqpVar = (dsqp) chxlVar2.cu(5);
        dsqpVar.bC(chxlVar2);
        chvz chvzVar = (chvz) dsqpVar;
        int i2 = docgVar2.q;
        if (chvzVar.c) {
            chvzVar.bF();
            chvzVar.c = false;
        }
        chxl chxlVar3 = (chxl) chvzVar.b;
        int i3 = chxlVar3.a | 128;
        chxlVar3.a = i3;
        chxlVar3.j = i2;
        int i4 = docgVar.q;
        int i5 = i3 | 256;
        chxlVar3.a = i5;
        chxlVar3.k = i4;
        int i6 = i5 | 512;
        chxlVar3.a = i6;
        chxlVar3.l = z2;
        String str = docgVar2.r;
        str.getClass();
        chxlVar3.a = i6 | 1024;
        chxlVar3.m = str;
        if ((docgVar2.a & 67108864) != 0) {
            dqwy dqwyVar = docgVar2.G;
            if (dqwyVar == null) {
                dqwyVar = dqwy.c;
            }
            if (chvzVar.c) {
                chvzVar.bF();
                chvzVar.c = false;
            }
            chxl chxlVar4 = (chxl) chvzVar.b;
            dqwyVar.getClass();
            chxlVar4.t = dqwyVar;
            chxlVar4.a |= 16384;
        }
        if ((docgVar.a & 67108864) != 0) {
            dqwy dqwyVar2 = docgVar.G;
            if (dqwyVar2 == null) {
                dqwyVar2 = dqwy.c;
            }
            if (chvzVar.c) {
                chvzVar.bF();
                chvzVar.c = false;
            }
            chxl chxlVar5 = (chxl) chvzVar.b;
            dqwyVar2.getClass();
            chxlVar5.s = dqwyVar2;
            chxlVar5.a |= 8192;
        }
        chxl bK = chvzVar.bK();
        chraVar3.k.put(a, bK);
        if (bqjeVar.c == 1) {
            if (z) {
                chraVar3.E.b();
                if (chraVar3.r.c()) {
                    chraVar3.H.c(a);
                }
                if (chraVar3.r.a()) {
                    chraVar3.G.d(bK);
                }
            }
            if (z2) {
                chns chnsVar4 = chraVar3.E;
                chnsVar4.l += chnsVar4.f().c(dpwe.REVIEW) - chnsVar4.f().c(dpwe.RATING);
                chnsVar4.g();
                chnsVar4.h();
                if (chraVar3.r.c() && (b = (chtbVar = chraVar3.H).b(a)) != null) {
                    dsqp dsqpVar2 = (dsqp) b.cu(5);
                    dsqpVar2.bC(b);
                    chul chulVar = (chul) dsqpVar2;
                    int i7 = b.k + 1;
                    if (chulVar.c) {
                        chulVar.bF();
                        chulVar.c = false;
                    }
                    chum chumVar = (chum) chulVar.b;
                    chumVar.a |= 512;
                    chumVar.k = i7;
                    int h = b.l + chtbVar.h(0, 1);
                    if (chulVar.c) {
                        chulVar.bF();
                        chulVar.c = false;
                    }
                    chum chumVar2 = (chum) chulVar.b;
                    chumVar2.a |= 1024;
                    chumVar2.l = h;
                    chtbVar.g(b.b, chulVar.bK());
                }
                if (chraVar3.r.a()) {
                    chrm chrmVar = chraVar3.G;
                    dwlh dwlhVar = bK.d;
                    if (dwlhVar == null) {
                        dwlhVar = dwlh.n;
                    }
                    dpsr dpsrVar = dwlhVar.f;
                    if (dpsrVar == null) {
                        dpsrVar = dpsr.c;
                    }
                    String str2 = dpsrVar.a;
                    chru chruVar = (chru) chrmVar;
                    if (chruVar.b.containsKey(str2)) {
                        chug chugVar = chruVar.b.get(str2);
                        LinkedHashMap<String, chug> linkedHashMap = chruVar.b;
                        dsqp dsqpVar3 = (dsqp) chugVar.cu(5);
                        dsqpVar3.bC(chugVar);
                        chuf chufVar = (chuf) dsqpVar3;
                        int i8 = chugVar.f + 1;
                        if (chufVar.c) {
                            chufVar.bF();
                            chufVar.c = false;
                        }
                        chug chugVar2 = (chug) chufVar.b;
                        chugVar2.a |= 16;
                        chugVar2.f = i8;
                        int j = chugVar.d + chruVar.j(0, 1);
                        if (chufVar.c) {
                            chufVar.bF();
                            chufVar.c = false;
                        }
                        chug chugVar3 = (chug) chufVar.b;
                        chugVar3.a |= 4;
                        chugVar3.d = j;
                        linkedHashMap.put(str2, chufVar.bK());
                        chruVar.i();
                    }
                }
                if (chraVar3.J.a().q()) {
                    chraVar3.u.a(chts.e(cqrt.l(R.string.SUBMIT_REVIEW_SNACKBAR_MESSAGE), cqrt.l(R.string.VIEW_SUBMITTED_REVIEW_LINK_LABEL), new Runnable(chraVar3, c) { // from class: chqi
                        private final chra a;
                        private final ilo b;

                        {
                            this.a = chraVar3;
                            this.b = c;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.a.m(this.b, bege.REVIEWS, jjn.FULLY_EXPANDED, true);
                        }
                    }, cjtd.a(dtxl.hG)));
                }
            }
        }
        chraVar3.af();
    }
}
