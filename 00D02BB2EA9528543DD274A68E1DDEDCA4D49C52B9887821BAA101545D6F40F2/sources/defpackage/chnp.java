package defpackage;

import com.google.android.apps.maps.R;
import com.google.ar.core.ImageMetadata;
import java.util.HashMap;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: chnp  reason: default package */
/* loaded from: classes4.dex */
final class chnp implements btzi<dwtm, dwul> {
    final /* synthetic */ chns a;

    public chnp(chns chnsVar) {
        this.a = chnsVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dwtm> btzrVar, btzy btzyVar) {
        this.a.f.f();
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dwtm> btzrVar, dwul dwulVar) {
        dpwf bK;
        dwul dwulVar2 = dwulVar;
        crzo<chtr> crzoVar = this.a.b;
        if ((dwulVar2.a & 8192) != 0) {
            bK = dwulVar2.m;
            if (bK == null) {
                bK = dpwf.b;
            }
        } else {
            dpwa bZ = dpwf.b.bZ();
            dpwb bZ2 = dpwc.d.bZ();
            dpwe dpweVar = dpwe.RATING;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dpwc dpwcVar = (dpwc) bZ2.b;
            dpwcVar.b = dpweVar.n;
            int i = dpwcVar.a | 1;
            dpwcVar.a = i;
            dpwcVar.a = i | 2;
            dpwcVar.c = 1;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dpwf dpwfVar = (dpwf) bZ.b;
            dpwc bK2 = bZ2.bK();
            bK2.getClass();
            dsrj<dpwc> dsrjVar = dpwfVar.a;
            if (!dsrjVar.a()) {
                dpwfVar.a = dsqw.cl(dsrjVar);
            }
            dpwfVar.a.add(bK2);
            bK = bZ.bK();
        }
        HashMap hashMap = new HashMap();
        for (dpwc dpwcVar2 : bK.a) {
            dpwe b = dpwe.b(dpwcVar2.b);
            if (b == null) {
                b = dpwe.UNKNOWN_TYPE;
            }
            if (b != dpwe.UNKNOWN_TYPE) {
                dpwe b2 = dpwe.b(dpwcVar2.b);
                if (b2 == null) {
                    b2 = dpwe.UNKNOWN_TYPE;
                }
                hashMap.put(b2, Integer.valueOf(dpwcVar2.c));
            }
        }
        crzoVar.a(chtr.b(dcdn.r(hashMap)));
        chns chnsVar = this.a;
        dpvt dpvtVar = dwulVar2.o;
        if (dpvtVar == null) {
            dpvtVar = dpvt.c;
        }
        chnsVar.h = dpvtVar;
        chns chnsVar2 = this.a;
        if (!chnsVar2.p) {
            chry chryVar = chnsVar2.g;
            if (chryVar.e.a().t()) {
                int s = chryVar.b.s(bvjk.kf, 0);
                dhpt dhptVar = chryVar.a.getContributionsPageParameters().h;
                if (dhptVar == null) {
                    dhptVar = dhpt.w;
                }
                dhpr dhprVar = dhptVar.n;
                if (dhprVar == null) {
                    dhprVar = dhpr.d;
                }
                if (s < dhprVar.a) {
                    eapd eapdVar = new eapd(chryVar.b.w(bvjk.ke, 0L));
                    dhpt dhptVar2 = chryVar.a.getContributionsPageParameters().h;
                    if (dhptVar2 == null) {
                        dhptVar2 = dhpt.w;
                    }
                    dhpr dhprVar2 = dhptVar2.n;
                    if (dhprVar2 == null) {
                        dhprVar2 = dhpr.d;
                    }
                    if (!eapd.a().x(eapdVar.e(eaow.c(dhprVar2.b)))) {
                        chns chnsVar3 = this.a;
                        chny chnyVar = chnsVar3.f;
                        String string = chnsVar3.g.c.getResources().getString(R.string.CZ_TOOLTIP_MESSAGE_ON_POINT_COUNTER);
                        chry chryVar2 = this.a.g;
                        dhpt dhptVar3 = chryVar2.a.getContributionsPageParameters().h;
                        if (dhptVar3 == null) {
                            dhptVar3 = dhpt.w;
                        }
                        dhpr dhprVar3 = dhptVar3.n;
                        if (dhprVar3 == null) {
                            dhprVar3 = dhpr.d;
                        }
                        int i2 = dhprVar3.c;
                        if (chryVar2.d.d(chryVar2.c)) {
                            i2 *= 10;
                        }
                        chnw d = chnx.d(chnyVar.d());
                        ((choa) d).a = 5L;
                        chvf bZ3 = chvi.f.bZ();
                        chxu bZ4 = chxv.d.bZ();
                        if (bZ4.c) {
                            bZ4.bF();
                            bZ4.c = false;
                        }
                        chxv chxvVar = (chxv) bZ4.b;
                        string.getClass();
                        int i3 = chxvVar.a | 1;
                        chxvVar.a = i3;
                        chxvVar.b = string;
                        chxvVar.a = i3 | 2;
                        chxvVar.c = i2;
                        if (bZ3.c) {
                            bZ3.bF();
                            bZ3.c = false;
                        }
                        chvi chviVar = (chvi) bZ3.b;
                        chxv bK3 = bZ4.bK();
                        bK3.getClass();
                        chviVar.e = bK3;
                        chviVar.a |= 8;
                        d.c(bZ3.bK());
                        chnx a = d.a();
                        chnw d2 = chnx.d(a);
                        ((choa) d2).a = 0L;
                        d2.c(chvi.f);
                        chnyVar.e.addAll(dcdc.g(a, d2.a()));
                        chnyVar.e();
                        chry chryVar3 = this.a.g;
                        chryVar3.b.ao(bvjk.kf);
                        chryVar3.b.Z(bvjk.ke, eapd.a().a);
                    }
                }
            }
            chns chnsVar4 = this.a;
            dpvt dpvtVar2 = chnsVar4.h;
            if ((dpvtVar2.a & 1) != 0) {
                chnsVar4.f.b(dpvtVar2.b, dwulVar2.e);
            }
        }
        dori doriVar = dwulVar2.b;
        if (doriVar == null) {
            doriVar = dori.l;
        }
        if ((doriVar.a & 8192) != 0) {
            chns chnsVar5 = this.a;
            dori doriVar2 = dwulVar2.b;
            if (doriVar2 == null) {
                doriVar2 = dori.l;
            }
            chnsVar5.m = dbsg.i(Integer.valueOf(doriVar2.i));
        }
        chns chnsVar6 = this.a;
        dori doriVar3 = dwulVar2.b;
        if (doriVar3 == null) {
            doriVar3 = dori.l;
        }
        chnsVar6.n = doriVar3.g;
        dpvx dpvxVar = dwulVar2.n;
        if (dpvxVar == null) {
            dpvxVar = dpvx.d;
        }
        if ((dpvxVar.a & 2) != 0) {
            chns chnsVar7 = this.a;
            dpvx dpvxVar2 = dwulVar2.n;
            if (dpvxVar2 == null) {
                dpvxVar2 = dpvx.d;
            }
            dpvw dpvwVar = dpvxVar2.c;
            if (dpvwVar == null) {
                dpvwVar = dpvw.d;
            }
            chnsVar7.j = dbsg.i(dpvwVar);
            this.a.i = dwulVar2.e;
        }
        dpvx dpvxVar3 = dwulVar2.n;
        if (dpvxVar3 == null) {
            dpvxVar3 = dpvx.d;
        }
        if ((dpvxVar3.a & 1) != 0) {
            dpvx dpvxVar4 = dwulVar2.n;
            if (dpvxVar4 == null) {
                dpvxVar4 = dpvx.d;
            }
            dpvw dpvwVar2 = dpvxVar4.b;
            if (dpvwVar2 == null) {
                dpvwVar2 = dpvw.d;
            }
            dpoj dpojVar = dpvwVar2.c;
            if (dpojVar == null) {
                dpojVar = dpoj.e;
            }
            if (dpojVar.equals(chnr.a())) {
                chns chnsVar8 = this.a;
                chnsVar8.l = Math.max(dpvwVar2.b, chnsVar8.l);
            }
        }
        if ((dwulVar2.a & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) != 0) {
            chns chnsVar9 = this.a;
            dqkh dqkhVar = dwulVar2.p;
            if (dqkhVar == null) {
                dqkhVar = dqkh.a;
            }
            chnsVar9.k = dbsg.i(dqkhVar);
        }
        this.a.h();
        chns chnsVar10 = this.a;
        Executor executor = chnsVar10.c;
        final chny chnyVar2 = chnsVar10.f;
        chnyVar2.getClass();
        executor.execute(new Runnable(chnyVar2) { // from class: chno
            private final chny a;

            {
                this.a = chnyVar2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.c();
            }
        });
    }
}
