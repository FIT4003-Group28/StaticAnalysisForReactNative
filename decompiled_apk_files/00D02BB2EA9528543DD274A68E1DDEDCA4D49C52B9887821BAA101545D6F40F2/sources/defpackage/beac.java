package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: beac  reason: default package */
/* loaded from: classes3.dex */
public class beac extends bruj {
    private final Activity e;
    private final bmom f;
    private final Runnable g;

    public beac(Activity activity, bmom bmomVar, brsc brscVar, brrx brrxVar) {
        super(brscVar, brrxVar);
        this.e = activity;
        this.f = bmomVar;
        this.g = brrxVar.f().b();
    }

    @Override // defpackage.brvb
    public cqkl a(cjqm cjqmVar) {
        eapg g;
        bwrs<ilo> bwrsVar = this.d;
        if (bwrsVar == null) {
            return cqkl.a;
        }
        this.f.a(ckgo.i, bwrsVar.c());
        bmom bmomVar = this.f;
        Activity activity = this.e;
        Runnable runnable = this.g;
        ilo c = bwrsVar.c();
        if (c != null) {
            eapd eapdVar = new eapd(bmomVar.d.b());
            eapg g2 = bmdv.g(eapdVar.a, c.aT());
            if (c.bX().n.size() != 0) {
                dosf dosfVar = c.bX().n.get(0);
                dngq dngqVar = dosfVar.d;
                if (dngqVar == null) {
                    dngqVar = dngq.d;
                }
                if ((dngqVar.a & 2) == 0) {
                    g = bmdv.g(dosfVar.c - 1, c.aT());
                } else {
                    dngq dngqVar2 = dosfVar.d;
                    if (dngqVar2 == null) {
                        dngqVar2 = dngq.d;
                    }
                    dngs dngsVar = dngqVar2.c;
                    if (dngsVar == null) {
                        dngsVar = dngs.h;
                    }
                    g = aogc.o(dngsVar);
                }
                g2 = (eapg) dbzu.a(g2, g);
            }
            eapg eapgVar = g2;
            dnhy bZ = dnhz.e.bZ();
            long j = eapdVar.a;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnhz dnhzVar = (dnhz) bZ.b;
            dnhzVar.a |= 4;
            dnhzVar.d = j;
            dnhz bK = bZ.bK();
            dnqg bZ2 = dnqh.p.bZ();
            int i = ddda.gj.b;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dnqh dnqhVar = (dnqh) bZ2.b;
            dnqhVar.a |= 64;
            dnqhVar.g = i;
            dnqh bK2 = bZ2.bK();
            angp a = bmomVar.a.a();
            dvyw h = c.h();
            dnqp bZ3 = dnqq.f.bZ();
            dbsg<dqfw> c2 = bmon.c(bmomVar.e.f());
            if (c2.a()) {
                dnru bZ4 = dnrv.c.bZ();
                dqfw b = c2.b();
                if (bZ4.c) {
                    bZ4.bF();
                    bZ4.c = false;
                }
                dnrv dnrvVar = (dnrv) bZ4.b;
                b.getClass();
                dnrvVar.b = b;
                dnrvVar.a |= 1;
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                dnqq dnqqVar = (dnqq) bZ3.b;
                dnrv bK3 = bZ4.bK();
                bK3.getClass();
                dnqqVar.c = bK3;
                dnqqVar.a |= 4;
            }
            dnem dnemVar = c.bX().p;
            if (dnemVar == null) {
                dnemVar = dnem.h;
            }
            if ((dnemVar.a & 1) != 0) {
                dnru bZ5 = dnrv.c.bZ();
                dnem dnemVar2 = c.bX().p;
                if (dnemVar2 == null) {
                    dnemVar2 = dnem.h;
                }
                dqfw dqfwVar = dnemVar2.b;
                if (dqfwVar == null) {
                    dqfwVar = dqfw.a;
                }
                if (bZ5.c) {
                    bZ5.bF();
                    bZ5.c = false;
                }
                dnrv dnrvVar2 = (dnrv) bZ5.b;
                dqfwVar.getClass();
                dnrvVar2.b = dqfwVar;
                dnrvVar2.a |= 1;
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                dnqq dnqqVar2 = (dnqq) bZ3.b;
                dnrv bK4 = bZ5.bK();
                bK4.getClass();
                dnqqVar2.e = bK4;
                dnqqVar2.a |= 16;
            }
            a.j(h, bK, bK2, bZ3.bK(), dbsg.i(new bmol(bmomVar, eapdVar, c, bwrsVar, eapgVar, runnable, activity)));
        }
        return cqkl.a;
    }

    @Override // defpackage.brvb
    @dzsi
    public String b() {
        return this.e.getString(R.string.I_AM_HERE_BUTTON);
    }

    @Override // defpackage.bruj
    public String c() {
        return this.e.getString(R.string.I_AM_HERE_BUTTON);
    }

    @Override // defpackage.brvb
    public Boolean d() {
        ilo r = r();
        boolean z = false;
        if (r != null && !bmom.e(r) && this.f.c()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.brvb
    public cqtd f() {
        return cqrt.h(2131231586, ibm.x());
    }
}
