package defpackage;

import com.google.android.apps.gmm.locationsharing.ui.sendkit.JourneySharingSendKitActivity;
import com.google.android.apps.gmm.navigation.ui.freenav.shortcut.FreeNavCreateShortcutActivity;
/* compiled from: PG */
/* renamed from: fxp  reason: default package */
/* loaded from: classes.dex */
final class fxp implements aszn, akbk, btsy, ajun, jlh, idd {
    final /* synthetic */ fyu a;
    private final rb b;
    private volatile Object c = new dxjf();
    private volatile Object d = new dxjf();
    private volatile Object e = new dxjf();

    public fxp(fyu fyuVar, rb rbVar) {
        this.a = fyuVar;
        this.b = rbVar;
    }

    private final ite d() {
        dxjg.e(this.a.a.tr());
        cjqq tp = this.a.a.tp();
        dxjg.e(tp);
        dxjg.e(this.a.a.rB());
        return new ite(tp);
    }

    private final cqkj e() {
        Object obj;
        Object obj2;
        iuk iukVar;
        Object obj3 = this.e;
        if (obj3 instanceof dxjf) {
            synchronized (obj3) {
                obj = this.e;
                if (obj instanceof dxjf) {
                    Object obj4 = this.d;
                    if (obj4 instanceof dxjf) {
                        synchronized (obj4) {
                            obj2 = this.d;
                            if (obj2 instanceof dxjf) {
                                rb rbVar = this.b;
                                Object obj5 = this.c;
                                if (obj5 instanceof dxjf) {
                                    synchronized (obj5) {
                                        Object obj6 = this.c;
                                        boolean z = obj6 instanceof dxjf;
                                        iukVar = obj6;
                                        if (z) {
                                            iuk b = iul.b(this.a.q());
                                            btmv rY = this.a.a.rY();
                                            dxjg.e(rY);
                                            b.a(rY);
                                            dxjc.d(this.c, b);
                                            this.c = b;
                                            iukVar = b;
                                        }
                                    }
                                    obj5 = iukVar;
                                }
                                dxjg.e(this.a.a.tm());
                                dehp tl = this.a.a.tl();
                                dxjg.e(tl);
                                cjqy tr = this.a.a.tr();
                                dxjg.e(tr);
                                bvjj rB = this.a.a.rB();
                                dxjg.e(rB);
                                obj2 = new iui(rbVar, rbVar, (iuk) obj5, tl, tr, rB, d());
                                dxjc.d(this.d, obj2);
                                this.d = obj2;
                            }
                        }
                        obj4 = obj2;
                    }
                    obj = ium.b((iui) obj4);
                    dxjc.d(this.e, obj);
                    this.e = obj;
                }
            }
            obj3 = obj;
        }
        return (cqkj) obj3;
    }

    private final isd f() {
        return new isd(this.a.al(), this.a.aw());
    }

    @Override // defpackage.aszn
    public final void a(FreeNavCreateShortcutActivity freeNavCreateShortcutActivity) {
        btvo rp = this.a.a.rp();
        dxjg.e(rp);
        freeNavCreateShortcutActivity.k = rp;
        cjqy tr = this.a.a.tr();
        dxjg.e(tr);
        freeNavCreateShortcutActivity.l = tr;
        cjqq tp = this.a.a.tp();
        dxjg.e(tp);
        freeNavCreateShortcutActivity.m = tp;
    }

    @Override // defpackage.ajun
    public final void b(JourneySharingSendKitActivity journeySharingSendKitActivity) {
        bvrb tn = this.a.a.tn();
        dxjg.e(tn);
        journeySharingSendKitActivity.k = tn;
        akfa rK = this.a.a.rK();
        dxjg.e(rK);
        journeySharingSendKitActivity.l = rK;
        dxjg.e(this.a.a.tr());
        dxjg.e(this.a.a.tp());
        bvjj rB = this.a.a.rB();
        dxjg.e(rB);
        journeySharingSendKitActivity.m = rB;
        journeySharingSendKitActivity.n = this.a.oo();
        journeySharingSendKitActivity.o = this.a.b();
        journeySharingSendKitActivity.t = this.a.op();
        journeySharingSendKitActivity.p = this.a.fC();
        journeySharingSendKitActivity.q = e();
    }

    @Override // defpackage.akbk
    public final void c() {
    }

    @Override // defpackage.jlh
    public final void wA(jlg jlgVar) {
        jlgVar.d = e();
        cjqy tr = this.a.a.tr();
        dxjg.e(tr);
        jlgVar.e = tr;
        jlgVar.f = f();
        jlgVar.g = d();
    }

    @Override // defpackage.idd
    public final void wv(idc idcVar) {
        idcVar.g = e();
        cjqy tr = this.a.a.tr();
        dxjg.e(tr);
        idcVar.h = tr;
        idcVar.i = f();
        idcVar.j = d();
    }
}
