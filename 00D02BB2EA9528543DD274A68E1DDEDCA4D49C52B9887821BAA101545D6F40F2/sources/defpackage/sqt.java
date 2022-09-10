package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.directions.savedtrips.api.SavedTrip;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: sqt  reason: default package */
/* loaded from: classes7.dex */
public class sqt implements snh {
    public final gga a;
    public final wdt b;
    public final dzsj<String> c;
    public final Context d;
    public final cpv e;
    private final dxio<qbt> f;
    private final Executor g;
    private final Executor h;
    private final ahjq i;
    private final qsg j;
    private final cjtd k;
    private final cjtd l;
    private final String m;
    private final String n;
    private final cqtd o;
    private final cqss p;
    private final amvh q;
    @dzsi
    private final Runnable r;
    private final String s;
    private boolean t = false;

    public sqt(gga ggaVar, dxio<qbt> dxioVar, wdt wdtVar, dzsj<String> dzsjVar, Executor executor, Executor executor2, cqhn cqhnVar, ahjq ahjqVar, qsg qsgVar, Context context, cpv cpvVar, int i, String str, String str2, cqtd cqtdVar, cqss cqssVar, amvh amvhVar, @dzsi Runnable runnable, String str3, boolean z) {
        this.a = ggaVar;
        this.f = dxioVar;
        this.b = wdtVar;
        this.c = dzsjVar;
        this.g = executor;
        this.h = executor2;
        this.i = ahjqVar;
        this.j = qsgVar;
        this.d = context;
        this.e = cpvVar;
        this.m = str;
        this.n = str2;
        this.o = cqtdVar;
        this.p = cqssVar;
        this.q = amvhVar;
        this.r = runnable;
        this.s = ggaVar.getString(R.string.SUGGESTED_PIN_BUTTON_DESCRIPTION, new Object[]{str});
        cjta b = cjtd.b();
        b.d = z ? dtyc.fH : dtyc.fv;
        b.g(str3);
        b.i(i);
        this.k = b.a();
        cjta b2 = cjtd.b();
        b2.d = p(dxioVar.a()) ? dtyc.fP : dtyc.fw;
        b2.g(str3);
        b2.i(i);
        this.l = b2.a();
    }

    private static boolean p(qbt qbtVar) {
        return qbtVar.e().a() == dqvj.TRANSIT;
    }

    @Override // defpackage.snh
    public String a() {
        return this.m;
    }

    @Override // defpackage.snh
    public String b() {
        return this.n;
    }

    @Override // defpackage.snh
    public String c() {
        return "";
    }

    @Override // defpackage.snh
    public cqtd d() {
        return this.o;
    }

    @Override // defpackage.snh
    public cqss e() {
        return this.p;
    }

    @Override // defpackage.snh
    public cqkl f(cjqm cjqmVar) {
        dnqg bZ = dnqh.p.bZ();
        if (cjqmVar.a().a()) {
            String b = cjqmVar.a().b();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnqh dnqhVar = (dnqh) bZ.b;
            b.getClass();
            dnqhVar.a |= 2;
            dnqhVar.c = b;
            doeh bZ2 = doei.d.bZ();
            String b2 = cjqmVar.a().b();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            doei doeiVar = (doei) bZ2.b;
            b2.getClass();
            doeiVar.a |= 4;
            doeiVar.c = b2;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnqh dnqhVar2 = (dnqh) bZ.b;
            doei bK = bZ2.bK();
            bK.getClass();
            dnqhVar2.m = bK;
            dnqhVar2.a |= 262144;
        }
        qcw x = qcx.x();
        x.r(amvh.i(this.a));
        x.b(dcdc.f(this.q));
        x.v(bZ.bK());
        this.f.a().m(x.a());
        return cqkl.a;
    }

    @Override // defpackage.snh
    public cjtd g() {
        return this.k;
    }

    @Override // defpackage.snh
    public cqtd h() {
        return cqrt.g(2131232305, ibm.x());
    }

    public int hashCode() {
        return this.q.hashCode();
    }

    @Override // defpackage.snh
    public cqkl i() {
        dehn a;
        Runnable runnable = this.r;
        if (runnable != null) {
            this.t = true;
            cqkx.p(this);
            if (p(this.f.a())) {
                GmmLocation a2 = this.i.a();
                if (a2 == null) {
                    a = deha.b(new IllegalStateException("Location is not available when pinning"));
                } else {
                    qsg qsgVar = this.j;
                    vum vumVar = new vum();
                    vumVar.c(dcdc.g(amvh.g(this.a, a2.B()), this.q));
                    dwal bZ = dwao.R.bZ();
                    dphm bZ2 = dphq.m.bZ();
                    dqvj dqvjVar = dqvj.TRANSIT;
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    dphq dphqVar = (dphq) bZ2.b;
                    dphqVar.b = dqvjVar.k;
                    dphqVar.a |= 1;
                    dphq dphqVar2 = (dphq) bZ2.b;
                    dphqVar2.c = 3;
                    dphqVar2.a |= 2;
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dwao dwaoVar = (dwao) bZ.b;
                    dphq bK = bZ2.bK();
                    bK.getClass();
                    dwaoVar.e = bK;
                    dwaoVar.a = 1 | dwaoVar.a;
                    dwbd bZ3 = dwbk.s.bZ();
                    if (bZ3.c) {
                        bZ3.bF();
                        bZ3.c = false;
                    }
                    dwbk.h((dwbk) bZ3.b);
                    dwbe bZ4 = dwbh.g.bZ();
                    if (bZ4.c) {
                        bZ4.bF();
                        bZ4.c = false;
                    }
                    dwbh dwbhVar = (dwbh) bZ4.b;
                    dwbhVar.a |= 16;
                    dwbhVar.f = false;
                    if (bZ3.c) {
                        bZ3.bF();
                        bZ3.c = false;
                    }
                    dwbk dwbkVar = (dwbk) bZ3.b;
                    dwbh bK2 = bZ4.bK();
                    bK2.getClass();
                    dwbkVar.o = bK2;
                    dwbkVar.a |= 32768;
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dwao dwaoVar2 = (dwao) bZ.b;
                    dwbk bK3 = bZ3.bK();
                    bK3.getClass();
                    dwaoVar2.f = bK3;
                    dwaoVar2.a |= 2;
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dwao dwaoVar3 = (dwao) bZ.b;
                    dwaoVar3.a |= 128;
                    dwaoVar3.l = 2;
                    vumVar.a = bZ.bK();
                    a = deew.h(qsgVar.c(vumVar.a()), new dbrn(this) { // from class: sqp
                        private final sqt a;

                        {
                            this.a = this;
                        }

                        @Override // defpackage.dbrn
                        public final Object a(Object obj) {
                            dbsg h = dcbg.b(((amte) obj).a(this.a.a)).r(sqq.a).h(sqr.a);
                            if (h.a()) {
                                return (SavedTrip.Data) h.b();
                            }
                            throw new IllegalStateException("Fetching transit route failed");
                        }
                    }, this.h);
                }
            } else {
                a = deha.a(SavedTrip.Data.j(null, this.q, dqvj.DRIVE, 1, null, dbpy.a, 3));
            }
            deha.q(deew.g(a, new defg(this) { // from class: sqo
                private final sqt a;

                {
                    this.a = this;
                }

                @Override // defpackage.defg
                public final dehn a(Object obj) {
                    sqt sqtVar = this.a;
                    return sqtVar.b.a(SavedTrip.d(sqtVar.c.a(), (SavedTrip.Data) obj));
                }
            }, this.h), new sqs(this, runnable), this.g);
        }
        return cqkl.a;
    }

    @Override // defpackage.snh
    public cjtd j() {
        return this.l;
    }

    @Override // defpackage.snh
    public CharSequence k() {
        return this.s;
    }

    @Override // defpackage.snh
    public Boolean l() {
        return Boolean.valueOf(this.r != null);
    }

    @Override // defpackage.snh
    public Boolean m() {
        return Boolean.valueOf(this.t);
    }

    public final void n(int i) {
        gga ggaVar = this.a;
        if (ggaVar.aZ) {
            ckos.a(ggaVar.findViewById(16908290), this.a.getString(i), 0).c();
        }
    }
}
