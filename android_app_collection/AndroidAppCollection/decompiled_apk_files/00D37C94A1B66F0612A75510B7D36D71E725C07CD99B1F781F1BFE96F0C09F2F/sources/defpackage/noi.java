package defpackage;

import android.text.TextUtils;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: noi  reason: default package */
/* loaded from: classes3.dex */
public final class noi {
    public final acti a;
    public aqvq b;
    public asjj c;
    public String d;
    public apzg e;
    private final ezh f;
    private final azpm g = azpm.e();
    private aypg h;
    private final aacz i;

    public noi(aacz aaczVar, ezh ezhVar, acti actiVar) {
        this.f = ezhVar;
        this.a = actiVar;
        this.i = aaczVar;
    }

    public static Queue a() {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.offer(new acte(actj.ENGAGEMENT_PANEL_RESIZABLE_HEADER));
        arrayDeque.offer(new acte(actj.ENGAGEMENT_PANEL_CLOSE_BUTTON));
        return arrayDeque;
    }

    public final void b() {
        final boolean aE = eog.aE(this.i);
        final ayoi q = this.f.h().V(lyd.u).B().q(nqs.b);
        final ayoi q2 = this.f.h().V(nox.b).B().q(nqs.b);
        this.h = this.g.af(new ayqe() { // from class: noh
            @Override // defpackage.ayqe
            public final Object a(Object obj) {
                boolean z = aE;
                ayoi ayoiVar = q2;
                ayoi ayoiVar2 = q;
                if (!((Boolean) obj).booleanValue()) {
                    return ayoi.T(false);
                }
                return z ? ayoiVar : ayoiVar2;
            }
        }).as(new ayqb() { // from class: nog
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                auqh auqhVar;
                int i;
                noi noiVar = noi.this;
                if (!((Boolean) obj).booleanValue()) {
                    noiVar.d = noiVar.a.k();
                    aqvq aqvqVar = noiVar.b;
                    if (aqvqVar != null) {
                        noiVar.a.q(acte.a(aqvqVar), noiVar.c);
                    }
                    noiVar.a.t();
                    return;
                }
                aqvq aqvqVar2 = noiVar.b;
                int i2 = 32633;
                if (aqvqVar2 != null && (i = aqvqVar2.w) > 0) {
                    i2 = i;
                }
                if (TextUtils.isEmpty(noiVar.d)) {
                    acti actiVar = noiVar.a;
                    acup a = acuo.a(i2);
                    acuc acucVar = acuc.OVERLAY;
                    apzg apzgVar = noiVar.e;
                    actiVar.e(a, acucVar, apzgVar, acty.a(apzgVar, askh.b), acty.a(noiVar.e, askh.a));
                    asvv b = acun.b(noiVar.b);
                    if (b == null || (b.c & 1) == 0) {
                        aqvq aqvqVar3 = noiVar.b;
                        if (aqvqVar3 == null) {
                            return;
                        }
                        aqvo aqvoVar = aqvqVar3.g;
                        if (aqvoVar == null) {
                            aqvoVar = aqvo.a;
                        }
                        if (aqvoVar.b != 49399797) {
                            return;
                        }
                        aqvq aqvqVar4 = noiVar.b;
                        aqvqVar4.getClass();
                        acti actiVar2 = noiVar.a;
                        aqvo aqvoVar2 = aqvqVar4.g;
                        if (aqvoVar2 == null) {
                            aqvoVar2 = aqvo.a;
                        }
                        if (aqvoVar2.b == 49399797) {
                            auqhVar = (auqh) aqvoVar2.c;
                        } else {
                            auqhVar = auqh.a;
                        }
                        actiVar2.D(new acte(auqhVar.m.I()));
                        return;
                    }
                    noiVar.a.D(new acte(b.d));
                    noiVar.a.v(noiVar.b, aoob.b, noiVar.c);
                    return;
                }
                acti actiVar3 = noiVar.a;
                acup a2 = acuo.a(i2);
                acuc acucVar2 = acuc.OVERLAY;
                aopc aopcVar = (aopc) noiVar.e.mo52toBuilder();
                aopg aopgVar = atno.b;
                aopa mo52toBuilder = ((atnp) noiVar.e.qm(atno.b)).mo52toBuilder();
                String str = noiVar.d;
                str.getClass();
                mo52toBuilder.copyOnWrite();
                atnp atnpVar = (atnp) mo52toBuilder.instance;
                atnpVar.b |= 32;
                atnpVar.f = str;
                aopcVar.e(aopgVar, (atnp) mo52toBuilder.mo39build());
                actiVar3.e(a2, acucVar2, (apzg) aopcVar.mo39build(), acty.a(noiVar.e, askh.b), acty.a(noiVar.e, askh.a));
            }
        });
    }

    public final void c() {
        aypg aypgVar = this.h;
        if (aypgVar == null || aypgVar.e()) {
            return;
        }
        ayqi.c((AtomicReference) this.h);
    }

    public final void d() {
        this.g.c(false);
    }

    public final void e(apzg apzgVar) {
        this.e = apzgVar;
        this.g.c(true);
    }

    public final void f() {
        this.d = null;
        this.g.c(false);
    }

    public final void g(aqvq aqvqVar, asjj asjjVar) {
        this.b = aqvqVar;
        this.c = asjjVar;
    }
}
