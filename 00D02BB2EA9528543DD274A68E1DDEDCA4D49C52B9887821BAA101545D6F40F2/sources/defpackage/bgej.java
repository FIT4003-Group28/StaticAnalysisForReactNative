package defpackage;

import android.app.Application;
import android.graphics.Point;
import android.os.SystemClock;
import android.view.WindowManager;
import com.google.android.filament.R;
import com.google.ar.core.ImageMetadata;
/* compiled from: PG */
/* renamed from: bgej  reason: default package */
/* loaded from: classes3.dex */
public final class bgej extends bttk<dvzj, dvzl> {
    public final dvzj a;
    @dzsi
    public ilo b;
    @dzsi
    private final begr c;
    private final long d;

    /* JADX WARN: Removed duplicated region for block: B:149:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0549  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0565  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public bgej(defpackage.dbsg<defpackage.ff> r25, java.lang.String r26, defpackage.akqi r27, defpackage.bgei r28, @defpackage.dzsi defpackage.dnnn r29, defpackage.dnwb r30, @defpackage.dzsi defpackage.dnqh r31, @defpackage.dzsi defpackage.begr r32, boolean r33, boolean r34, boolean r35, boolean r36, boolean r37, defpackage.aehr r38, defpackage.aeht r39, android.app.Application r40, defpackage.btvo r41, boolean r42, defpackage.dbsg<defpackage.aeui> r43, @defpackage.dzsi defpackage.dqhw r44, defpackage.dbsg<defpackage.dobd> r45, @defpackage.dzsi defpackage.dvzd r46, @defpackage.dzsi defpackage.bkgy r47, @defpackage.dzsi defpackage.bkgz r48, @defpackage.dzsi defpackage.abfa r49, @defpackage.dzsi defpackage.dnyh r50, @defpackage.dzsi java.lang.String r51, boolean r52, boolean r53, @defpackage.dzsi defpackage.dmmq r54, @defpackage.dzsi defpackage.dgba r55, @defpackage.dzsi java.lang.String r56) {
        /*
            Method dump skipped, instructions count: 1426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bgej.<init>(dbsg, java.lang.String, akqi, bgei, dnnn, dnwb, dnqh, begr, boolean, boolean, boolean, boolean, boolean, aehr, aeht, android.app.Application, btvo, boolean, dbsg, dqhw, dbsg, dvzd, bkgy, bkgz, abfa, dnyh, java.lang.String, boolean, boolean, dmmq, dgba, java.lang.String):void");
    }

    public static dvzi b(Application application, akox akoxVar, dhjx dhjxVar, dnwb dnwbVar, boolean z, btvo btvoVar, aehr aehrVar, aeht aehtVar, boolean z2, @dzsi bkgy bkgyVar, @dzsi bkgz bkgzVar, @dzsi abfa abfaVar) {
        bvrj.UI_THREAD.c();
        return e(application, bgei.a(akoxVar, dhjxVar), null, dnwbVar, z, false, btvoVar, aehrVar, aehtVar, z2, null, null, bkgyVar, bkgzVar, abfaVar, null, null);
    }

    private final void d() {
        ((ckcp) ((ckcu) btsr.a(ckcu.class)).rU().a(ckix.b)).a(SystemClock.elapsedRealtime() - this.d);
    }

    private static dvzi e(Application application, bgei bgeiVar, @dzsi dnnn dnnnVar, dnwb dnwbVar, boolean z, boolean z2, btvo btvoVar, aehr aehrVar, aeht aehtVar, boolean z3, @dzsi dqhw dqhwVar, @dzsi dvzd dvzdVar, @dzsi bkgy bkgyVar, @dzsi bkgz bkgzVar, @dzsi abfa abfaVar, @dzsi dnyh dnyhVar, @dzsi String str) {
        dvzd dvzdVar2;
        int max;
        dqhw bK;
        dvzi dvziVar = (dvzi) dvzj.y.bZ();
        dhjx dhjxVar = bgeiVar.a;
        if (dvziVar.c) {
            dvziVar.bF();
            dvziVar.c = false;
        }
        dvzj dvzjVar = (dvzj) dvziVar.b;
        dhjxVar.getClass();
        dvzjVar.e = dhjxVar;
        dvzjVar.a |= 8;
        dvxt b = brma.b(bgeiVar.c, application.getResources());
        if (dvziVar.c) {
            dvziVar.bF();
            dvziVar.c = false;
        }
        dvzj dvzjVar2 = (dvzj) dvziVar.b;
        b.getClass();
        dvzjVar2.k = b;
        dvzjVar2.a |= 512;
        dvxj dvxjVar = dvxj.SVG_LIGHT;
        if (dvziVar.c) {
            dvziVar.bF();
            dvziVar.c = false;
        }
        dvzj dvzjVar3 = (dvzj) dvziVar.b;
        dvxjVar.getClass();
        dsrf dsrfVar = dvzjVar3.f;
        if (!dsrfVar.a()) {
            dvzjVar3.f = dsqw.cg(dsrfVar);
        }
        dvzjVar3.f.h(dvxjVar.u);
        if (dvzdVar == null) {
            dvyz bZ = dvzd.o.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dvzd dvzdVar3 = (dvzd) bZ.b;
            dvzdVar3.b = 1;
            dvzdVar3.a |= 1;
            dvzdVar2 = bZ.bK();
        } else {
            dvzdVar2 = dvzdVar;
        }
        if (dvziVar.c) {
            dvziVar.bF();
            dvziVar.c = false;
        }
        dvzj dvzjVar4 = (dvzj) dvziVar.b;
        dvzdVar2.getClass();
        dvzjVar4.g = dvzdVar2;
        int i = dvzjVar4.a | 16;
        dvzjVar4.a = i;
        dvzjVar4.a = i | 32;
        dvzjVar4.h = false;
        dvzj dvzjVar5 = (dvzj) dvziVar.b;
        dvzjVar5.a |= 2097152;
        dvzjVar5.r = true;
        dqhs bZ2 = dqht.b.bZ();
        if (dqhwVar != null) {
            bK = dqhwVar;
        } else {
            float f = application.getResources().getDisplayMetrics().density;
            dqhu bZ3 = dqhw.g.bZ();
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dqhw dqhwVar2 = (dqhw) bZ3.b;
            dqhwVar2.a |= 2;
            dqhwVar2.c = f;
            dhkc bZ4 = dhkd.d.bZ();
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            dhkd dhkdVar = (dhkd) bZ4.b;
            dhkdVar.a |= 2;
            dhkdVar.c = R.styleable.AppCompatTheme_textAppearanceListItem;
            Point point = new Point();
            ((WindowManager) application.getSystemService("window")).getDefaultDisplay().getRealSize(point);
            boolean b2 = btpf.b(application);
            if (b2) {
                max = Math.min(point.x, point.y);
            } else {
                max = Math.max(point.x, point.y);
            }
            int i2 = (int) (max / f);
            int i3 = true != b2 ? 4 : 64;
            int min = Math.min(i2 - (i3 + i3), (int) (2048.0f / f));
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            dhkd dhkdVar2 = (dhkd) bZ4.b;
            dhkdVar2.a |= 1;
            dhkdVar2.b = min;
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dqhw dqhwVar3 = (dqhw) bZ3.b;
            dhkd bK2 = bZ4.bK();
            bK2.getClass();
            dqhwVar3.b = bK2;
            dqhwVar3.a |= 1;
            int i4 = bgeh.b;
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dqhw dqhwVar4 = (dqhw) bZ3.b;
            int i5 = i4 - 1;
            if (i4 == 0) {
                throw null;
            }
            dqhwVar4.e = i5;
            dqhwVar4.a |= 8;
            int i6 = bgeh.a;
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dqhw dqhwVar5 = (dqhw) bZ3.b;
            int i7 = dqhwVar5.a | 16;
            dqhwVar5.a = i7;
            dqhwVar5.f = i6;
            int i8 = bgeiVar.b;
            dqhwVar5.a = i7 | 4;
            dqhwVar5.d = i8;
            bK = bZ3.bK();
        }
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dqht dqhtVar = (dqht) bZ2.b;
        bK.getClass();
        dqhtVar.b();
        dqhtVar.a.add(bK);
        if (dvziVar.c) {
            dvziVar.bF();
            dvziVar.c = false;
        }
        dvzj dvzjVar6 = (dvzj) dvziVar.b;
        dqht bK3 = bZ2.bK();
        bK3.getClass();
        dvzjVar6.n = bK3;
        dvzjVar6.a |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        dwev bZ5 = dwew.e.bZ();
        cknx.m(bZ5);
        cknx.i(bZ5);
        cknx.k(bZ5, true, true);
        if (z3) {
            cknx.g(bZ5);
        }
        dwfs bZ6 = dwfv.m.bZ();
        if (bZ6.c) {
            bZ6.bF();
            bZ6.c = false;
        }
        dwfv dwfvVar = (dwfv) bZ6.b;
        dwew bK4 = bZ5.bK();
        bK4.getClass();
        dwfvVar.b = bK4;
        dwfvVar.a |= 1;
        dwdu bZ7 = dwdv.a.bZ();
        if (bZ7.c) {
            bZ7.bF();
            bZ7.c = false;
        }
        dwdv.c((dwdv) bZ7.b);
        if (bZ6.c) {
            bZ6.bF();
            bZ6.c = false;
        }
        dwfv dwfvVar2 = (dwfv) bZ6.b;
        dwdv bK5 = bZ7.bK();
        bK5.getClass();
        dwfvVar2.e = bK5;
        dwfvVar2.a |= 16;
        dwei bZ8 = dwej.b.bZ();
        dwfp bZ9 = dwfr.h.bZ();
        int i9 = (int) (application.getResources().getDisplayMetrics().density * 160.0f);
        if (btvoVar.getPlaceSheetParameters().n()) {
            l(bZ8, dweb.MENU, i9);
            bZ9.a(drbz.ATTRIBUTION);
        }
        l(bZ8, dweb.FOOD_AND_DRINK, i9);
        l(bZ8, dweb.ROOM, i9);
        l(bZ8, dweb.VIBE, i9);
        l(bZ8, dweb.AMENITY, i9);
        l(bZ8, dweb.IN_STORE, i9);
        dwej bK6 = bZ8.bK();
        if (bZ6.c) {
            bZ6.bF();
            bZ6.c = false;
        }
        dwfv dwfvVar3 = (dwfv) bZ6.b;
        bK6.getClass();
        dwfvVar3.f = bK6;
        dwfvVar3.a |= 32;
        dwfv.c(dwfvVar3);
        dwdy bZ10 = dwdz.c.bZ();
        if (bZ10.c) {
            bZ10.bF();
            bZ10.c = false;
        }
        dwdz dwdzVar = (dwdz) bZ10.b;
        dwdzVar.a |= 1;
        dwdzVar.b = true;
        if (bZ6.c) {
            bZ6.bF();
            bZ6.c = false;
        }
        dwfv dwfvVar4 = (dwfv) bZ6.b;
        dwdz bK7 = bZ10.bK();
        bK7.getClass();
        dwfvVar4.i = bK7;
        dwfvVar4.a |= 256;
        dwfw bZ11 = dwfx.d.bZ();
        if (bZ11.c) {
            bZ11.bF();
            bZ11.c = false;
        }
        dwfx.c((dwfx) bZ11.b);
        dwfx bK8 = bZ11.bK();
        if (bZ6.c) {
            bZ6.bF();
            bZ6.c = false;
        }
        dwfv dwfvVar5 = (dwfv) bZ6.b;
        bK8.getClass();
        dwfvVar5.h = bK8;
        dwfvVar5.a |= 128;
        if (btvoVar.getLensParameters().g) {
            bZ9.a(drbz.OCR_INFO);
        }
        if (!new dsrh(((dwfr) bZ9.b).c, dwfr.d).isEmpty()) {
            if (bZ6.c) {
                bZ6.bF();
                bZ6.c = false;
            }
            dwfv dwfvVar6 = (dwfv) bZ6.b;
            dwfr bK9 = bZ9.bK();
            bK9.getClass();
            dwfvVar6.c = bK9;
            dwfvVar6.a |= 2;
        }
        dwfv bK10 = bZ6.bK();
        if (dvziVar.c) {
            dvziVar.bF();
            dvziVar.c = false;
        }
        dvzj dvzjVar7 = (dvzj) dvziVar.b;
        bK10.getClass();
        dvzjVar7.j = bK10;
        dvzjVar7.a |= 128;
        dvxv c = bfki.c(application.getResources(), str);
        if (dvziVar.c) {
            dvziVar.bF();
            dvziVar.c = false;
        }
        dvzj dvzjVar8 = (dvzj) dvziVar.b;
        c.getClass();
        dvzjVar8.o = c;
        dvzjVar8.a |= 131072;
        dnzj f2 = f(btvoVar, aehrVar, aehtVar, z, z2, bkgyVar, bkgzVar, dnyhVar, abfaVar, dnnnVar);
        if (dvziVar.c) {
            dvziVar.bF();
            dvziVar.c = false;
        }
        dvzj dvzjVar9 = (dvzj) dvziVar.b;
        f2.getClass();
        dvzjVar9.m = f2;
        int i10 = dvzjVar9.a | 16384;
        dvzjVar9.a = i10;
        dnwbVar.getClass();
        dvzjVar9.s = dnwbVar;
        dvzjVar9.a = i10 | 4194304;
        dqvp bZ12 = dqvq.d.bZ();
        boolean ak = btvoVar.getPlaceSheetParameters().ak();
        if (bZ12.c) {
            bZ12.bF();
            bZ12.c = false;
        }
        dqvq dqvqVar = (dqvq) bZ12.b;
        int i11 = 64 | dqvqVar.a;
        dqvqVar.a = i11;
        dqvqVar.b = ak;
        dqvqVar.a = i11 | 256;
        dqvqVar.c = false;
        dqvq bK11 = bZ12.bK();
        if (dvziVar.c) {
            dvziVar.bF();
            dvziVar.c = false;
        }
        dvzj dvzjVar10 = (dvzj) dvziVar.b;
        bK11.getClass();
        dvzjVar10.v = bK11;
        dvzjVar10.a |= 134217728;
        return dvziVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:180:0x066a  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x068a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static defpackage.dnzj f(defpackage.btvo r6, defpackage.aehr r7, defpackage.aeht r8, boolean r9, boolean r10, @defpackage.dzsi defpackage.bkgy r11, @defpackage.dzsi defpackage.bkgz r12, @defpackage.dzsi defpackage.dnyh r13, @defpackage.dzsi defpackage.abfa r14, @defpackage.dzsi defpackage.dnnn r15) {
        /*
            Method dump skipped, instructions count: 2232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bgej.f(btvo, aehr, aeht, boolean, boolean, bkgy, bkgz, dnyh, abfa, dnnn):dnzj");
    }

    private static dnyw g(@dzsi bkgy bkgyVar, @dzsi bkgz bkgzVar, btvo btvoVar) {
        dnyt bZ = dnyw.c.bZ();
        bZ.b(dnwv.RESTAURANT_RESERVATION);
        bZ.b(dnwv.SEARCH_INVENTORY);
        bZ.b(dnwv.WAITLIST);
        if (bkgyVar != null && bkgyVar.a()) {
            bZ.b(dnwv.CHATTY_BOOK);
            dnyu bZ2 = dnyv.c.bZ();
            dnwv dnwvVar = dnwv.CHATTY_BOOK;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dnyv dnyvVar = (dnyv) bZ2.b;
            dnyvVar.b = dnwvVar.s;
            dnyvVar.a |= 1;
            dnyv.b(dnyvVar);
            bZ.a(bZ2.bK());
        }
        if ((bkgyVar != null && bkgyVar.b()) || (bkgzVar != null && bkgzVar.a())) {
            bZ.b(dnwv.GET_A_QUOTE);
            dnyu bZ3 = dnyv.c.bZ();
            dnwv dnwvVar2 = dnwv.GET_A_QUOTE;
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dnyv dnyvVar2 = (dnyv) bZ3.b;
            dnyvVar2.b = dnwvVar2.s;
            dnyvVar2.a |= 1;
            dnyv.b(dnyvVar2);
            bZ.a(bZ3.bK());
        }
        if (btvoVar.getPlaceSheetParameters().u()) {
            bZ.bC(btvoVar.getPlaceSheetParameters().t());
        } else {
            dnyu bZ4 = dnyv.c.bZ();
            dnwv dnwvVar3 = dnwv.ORDER_FOOD;
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            dnyv dnyvVar3 = (dnyv) bZ4.b;
            dnyvVar3.b = dnwvVar3.s;
            dnyvVar3.a |= 1;
            dnyv.b(dnyvVar3);
            bZ.a(bZ4.bK());
            dnyu bZ5 = dnyv.c.bZ();
            dnwv dnwvVar4 = dnwv.RESTAURANT_RESERVATION;
            if (bZ5.c) {
                bZ5.bF();
                bZ5.c = false;
            }
            dnyv dnyvVar4 = (dnyv) bZ5.b;
            dnyvVar4.b = dnwvVar4.s;
            dnyvVar4.a |= 1;
            dnyv.b(dnyvVar4);
            bZ.a(bZ5.bK());
            dnyu bZ6 = dnyv.c.bZ();
            dnwv dnwvVar5 = dnwv.SEARCH_INVENTORY;
            if (bZ6.c) {
                bZ6.bF();
                bZ6.c = false;
            }
            dnyv dnyvVar5 = (dnyv) bZ6.b;
            dnyvVar5.b = dnwvVar5.s;
            dnyvVar5.a |= 1;
            dnyv.b(dnyvVar5);
            bZ.a(bZ6.bK());
            dnyu bZ7 = dnyv.c.bZ();
            dnwv dnwvVar6 = dnwv.WAITLIST;
            if (bZ7.c) {
                bZ7.bF();
                bZ7.c = false;
            }
            dnyv dnyvVar6 = (dnyv) bZ7.b;
            dnyvVar6.b = dnwvVar6.s;
            dnyvVar6.a |= 1;
            dnyv.b(dnyvVar6);
            bZ.a(bZ7.bK());
        }
        return bZ.bK();
    }

    private static dnnn h(@dzsi dnnn dnnnVar, aehr aehrVar, aeht aehtVar) {
        if (!aehrVar.i()) {
            return aehtVar.e(dbsg.j(dnnnVar));
        }
        if (dnnnVar == null) {
            dnnnVar = aehr.a();
        }
        return aehrVar.h(dnnnVar);
    }

    private static void j(dnyc dnycVar, @dzsi abfa abfaVar) {
        dnxz dnxzVar = ((dnzj) dnycVar.b).l;
        if (dnxzVar == null) {
            dnxzVar = dnxz.c;
        }
        dsqp dsqpVar = (dsqp) dnxzVar.cu(5);
        dsqpVar.bC(dnxzVar);
        dnxy dnxyVar = (dnxy) dsqpVar;
        if (abfaVar != null) {
            boolean z = true;
            if (!abfaVar.h() && !abfaVar.a.getHotelBookingModuleParameters().e()) {
                z = false;
            }
            if (dnxyVar.c) {
                dnxyVar.bF();
                dnxyVar.c = false;
            }
            dnxz dnxzVar2 = (dnxz) dnxyVar.b;
            dnxzVar2.a |= 4;
            dnxzVar2.b = z;
        }
        dnxz bK = dnxyVar.bK();
        if (dnycVar.c) {
            dnycVar.bF();
            dnycVar.c = false;
        }
        dnzj dnzjVar = (dnzj) dnycVar.b;
        bK.getClass();
        dnzjVar.l = bK;
        dnzjVar.a |= 2097152;
    }

    private static void l(dwei dweiVar, dweb dwebVar, int i) {
        dweg bZ = dweh.d.bZ();
        dwee bZ2 = dwef.c.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dwef dwefVar = (dwef) bZ2.b;
        dwefVar.b = dwebVar.i;
        dwefVar.a |= 1;
        bZ.b(bZ2.bK());
        dhkc bZ3 = dhkd.d.bZ();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dhkd dhkdVar = (dhkd) bZ3.b;
        int i2 = dhkdVar.a | 2;
        dhkdVar.a = i2;
        dhkdVar.c = i;
        dhkdVar.a = i2 | 1;
        dhkdVar.b = i;
        dhkd bK = bZ3.bK();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dweh dwehVar = (dweh) bZ.b;
        bK.getClass();
        dwehVar.c = bK;
        dwehVar.a |= 1;
        dweiVar.b(bZ.bK());
    }

    @Override // defpackage.bttu
    public final void a(@dzsi bttq bttqVar) {
        ilo iloVar = this.b;
        begr begrVar = this.c;
        if (begrVar == null || iloVar == null) {
            return;
        }
        if (bttqVar == null) {
            begrVar.a(this, iloVar);
        } else {
            begrVar.b(this, iloVar, bttqVar);
        }
    }

    @dzsi
    public final bttq c(dvzl dvzlVar) {
        if ((dvzlVar.a & 1) != 0) {
            dvyw dvywVar = dvzlVar.b;
            if (dvywVar == null) {
                dvywVar = dvyw.bv;
            }
            ily ilyVar = new ily();
            ilyVar.E(dvywVar);
            ilyVar.G(dvzlVar.c);
            dvus dvusVar = dvzlVar.d;
            if (dvusVar == null) {
                dvusVar = dvus.c;
            }
            dvva dvvaVar = dvusVar.a;
            if (dvvaVar == null) {
                dvvaVar = dvva.b;
            }
            if (dvvaVar.a.size() > 0) {
                ((ckcn) ((ckcu) btsr.a(ckcu.class)).rU().a(ckiy.a)).a();
                dvus dvusVar2 = dvzlVar.d;
                if (dvusVar2 == null) {
                    dvusVar2 = dvus.c;
                }
                dvva dvvaVar2 = dvusVar2.a;
                if (dvvaVar2 == null) {
                    dvvaVar2 = dvva.b;
                }
                ilyVar.h(dvvaVar2.a.get(0), false);
            }
            if ((dvzlVar.a & 4) != 0) {
                dhze dhzeVar = dvzlVar.e;
                if (dhzeVar == null) {
                    dhzeVar = dhze.m;
                }
                ilyVar.D = dhzeVar;
            }
            if ((dvzlVar.a & 16) != 0) {
                dhld dhldVar = dvzlVar.f;
                if (dhldVar == null) {
                    dhldVar = dhld.b;
                }
                ilyVar.E = dhldVar;
            }
            this.b = ilyVar.d();
            dvzj dvzjVar = this.a;
            String str = dvzjVar.b;
            String str2 = dvzjVar.c;
            d();
            return null;
        }
        d();
        return bttq.SINGLE_REQUEST_ERROR;
    }

    public bgej(dvzj dvzjVar, @dzsi begr begrVar) {
        dunt duntVar = dunt.UNKNOWN_REQUEST_ID;
        bvrj bvrjVar = bvrj.CURRENT;
        this.a = dvzjVar;
        this.c = begrVar;
        this.d = SystemClock.elapsedRealtime();
    }
}
