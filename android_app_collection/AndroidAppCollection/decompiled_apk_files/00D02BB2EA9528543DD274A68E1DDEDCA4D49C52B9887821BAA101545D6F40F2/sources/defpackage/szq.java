package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: szq  reason: default package */
/* loaded from: classes7.dex */
public final class szq {
    private static final dcqe a = dcqe.c("szq");
    private final wuw b;
    private final tdm c;
    private final tdo d;
    private final tdq e;
    private final tdy f;
    private final tds g;
    private final teb h;
    private final ted i;
    private final tef j;

    public szq(wuw wuwVar, tdm tdmVar, tdo tdoVar, tdq tdqVar, teb tebVar, tdy tdyVar, tds tdsVar, ted tedVar, tef tefVar) {
        this.b = wuwVar;
        this.c = tdmVar;
        this.d = tdoVar;
        this.e = tdqVar;
        this.h = tebVar;
        this.f = tdyVar;
        this.g = tdsVar;
        this.i = tedVar;
        this.j = tefVar;
    }

    public static dbsg<cqix<?>> b(tdh tdhVar) {
        if (tdhVar instanceof tdb) {
            return dbsg.i(cqgr.fT(new tbc(), (tdb) tdhVar));
        }
        if (tdhVar instanceof tdc) {
            return dbsg.i(cqgr.fT(new tbh(), (tdc) tdhVar));
        }
        if (tdhVar instanceof tdd) {
            return dbsg.i(cqgr.fT(new tbo(), (tdd) tdhVar));
        }
        if (tdhVar instanceof tdg) {
            return dbsg.i(cqgr.fT(new tcj(), (tdg) tdhVar));
        }
        if (tdhVar instanceof tde) {
            return dbsg.i(cqgr.fT(new tby(), (tde) tdhVar));
        }
        if (tdhVar instanceof tdi) {
            return dbsg.i(cqgr.fT(new tcq(), (tdi) tdhVar));
        }
        if (tdhVar instanceof tdj) {
            return dbsg.i(cqgr.fT(new tct(), (tdj) tdhVar));
        }
        return tdhVar instanceof tdk ? dbsg.i(cqgr.fT(new tda(), (tdk) tdhVar)) : dbpy.a;
    }

    public final dbsg<tdz> a(sxa sxaVar, tlv tlvVar, amve amveVar) {
        dqvj dqvjVar = dqvj.DRIVE;
        dqvj c = dqvj.c(amveVar.b().b);
        if (c == null) {
            c = dqvj.DRIVE;
        }
        int ordinal = c.ordinal();
        if (ordinal == 0) {
            tdq tdqVar = this.e;
            Activity activity = (Activity) ((dxjd) tdqVar.a).a;
            tdq.a(activity, 1);
            cqhn a2 = tdqVar.b.a();
            tdq.a(a2, 2);
            vtn a3 = tdqVar.c.a();
            tdq.a(a3, 3);
            tam a4 = tdqVar.d.a();
            tdq.a(a4, 4);
            tao a5 = tdqVar.e.a();
            tdq.a(a5, 5);
            zgv a6 = tdqVar.f.a();
            tdq.a(a6, 6);
            tdq.a(tlvVar, 7);
            tdq.a(amveVar, 8);
            return dbsg.i(new tdp(activity, a2, a3, a4, a5, a6, tlvVar, amveVar));
        } else if (ordinal == 1) {
            tdo tdoVar = this.d;
            Activity activity2 = (Activity) ((dxjd) tdoVar.a).a;
            tdo.a(activity2, 1);
            cqhn a7 = tdoVar.b.a();
            tdo.a(a7, 2);
            vtn a8 = tdoVar.c.a();
            tdo.a(a8, 3);
            bvsl a9 = tdoVar.d.a();
            tdo.a(a9, 4);
            tam a10 = tdoVar.e.a();
            tdo.a(a10, 5);
            tao a11 = tdoVar.f.a();
            tdo.a(a11, 6);
            tdo.a(tlvVar, 7);
            tdo.a(amveVar, 8);
            return dbsg.i(new tdn(activity2, a7, a8, a9, a10, a11, tlvVar, amveVar));
        } else if (ordinal == 2) {
            tef tefVar = this.j;
            Activity activity3 = (Activity) ((dxjd) tefVar.a).a;
            tef.a(activity3, 1);
            cqhn a12 = tefVar.b.a();
            tef.a(a12, 2);
            tef.a(tefVar.c.a(), 3);
            bvsl a13 = tefVar.d.a();
            tef.a(a13, 4);
            tam a14 = tefVar.e.a();
            tef.a(a14, 5);
            tao a15 = tefVar.f.a();
            tef.a(a15, 6);
            tef.a(tlvVar, 7);
            tef.a(amveVar, 8);
            return dbsg.i(new tee(activity3, a12, a13, a14, a15, tlvVar, amveVar));
        } else if (ordinal == 3) {
            cqhn a16 = this.i.a.a();
            ted.a(a16, 1);
            ted.a(amveVar, 2);
            return dbsg.i(new tec(a16, amveVar));
        } else if (ordinal == 5) {
            teb tebVar = this.h;
            Activity activity4 = (Activity) ((dxjd) tebVar.a).a;
            teb.a(activity4, 1);
            cqhn a17 = tebVar.b.a();
            teb.a(a17, 2);
            vtn a18 = tebVar.c.a();
            teb.a(a18, 3);
            tam a19 = tebVar.d.a();
            teb.a(a19, 4);
            tao a20 = tebVar.e.a();
            teb.a(a20, 5);
            zgv a21 = tebVar.f.a();
            teb.a(a21, 6);
            teb.a(tlvVar, 7);
            teb.a(amveVar, 8);
            return dbsg.i(new tea(activity4, a17, a18, a19, a20, a21, tlvVar, amveVar));
        } else if (ordinal != 7) {
            if (ordinal == 8) {
                tdm tdmVar = this.c;
                Activity activity5 = (Activity) ((dxjd) tdmVar.a).a;
                tdm.a(activity5, 1);
                qhn a22 = tdmVar.b.a();
                tdm.a(a22, 2);
                cqhn a23 = tdmVar.c.a();
                tdm.a(a23, 3);
                vtn a24 = tdmVar.d.a();
                tdm.a(a24, 4);
                tdm.a(tdmVar.e.a(), 5);
                tao a25 = tdmVar.f.a();
                tdm.a(a25, 6);
                suq a26 = tdmVar.g.a();
                tdm.a(a26, 7);
                twn a27 = tdmVar.h.a();
                tdm.a(a27, 8);
                qho a28 = tdmVar.i.a();
                tdm.a(a28, 9);
                tdm.a(tlvVar, 10);
                tdm.a(amveVar, 11);
                return dbsg.i(new tdl(activity5, a22, a23, a24, a25, a26, a27, a28, tlvVar, amveVar));
            }
            bvoo.h("Attempted to display invalid trip in result list.", new Object[0]);
            return dbpy.a;
        } else {
            dbsg j = dbsg.j(this.b.a(amveVar, tlvVar.w(amveVar).b().intValue()));
            if (!j.a() || ((wuv) j.b()).e()) {
                if (!j.a() || !((wuv) j.b()).e()) {
                    return dbpy.a;
                }
                tds tdsVar = this.g;
                wuv wuvVar = (wuv) j.b();
                Activity activity6 = (Activity) ((dxjd) tdsVar.a).a;
                tds.a(activity6, 1);
                gga a29 = tdsVar.b.a();
                tds.a(a29, 2);
                cqhn a30 = tdsVar.c.a();
                tds.a(a30, 3);
                tds.a(tdsVar.d.a(), 4);
                tds.a(tdsVar.e.a(), 5);
                tao a31 = tdsVar.f.a();
                tds.a(a31, 6);
                suq a32 = tdsVar.g.a();
                tds.a(a32, 7);
                tds.a(tdsVar.h.a(), 8);
                tds.a(tlvVar, 9);
                tds.a(amveVar, 10);
                tds.a(wuvVar, 11);
                return dbsg.i(new tdr(activity6, a29, a30, a31, a32, tlvVar, amveVar, wuvVar));
            }
            tdy tdyVar = this.f;
            tdy.a((Activity) ((dxjd) tdyVar.a).a, 1);
            cqhn a33 = tdyVar.b.a();
            tdy.a(a33, 2);
            cjqy a34 = tdyVar.c.a();
            tdy.a(a34, 3);
            tdy.a(tdyVar.d.a(), 4);
            tmi a35 = tdyVar.e.a();
            tdy.a(a35, 5);
            tdy.a(sxaVar, 6);
            tdy.a(tlvVar, 7);
            tdy.a(amveVar, 8);
            return dbsg.i(new tdx(a33, a34, a35, sxaVar, tlvVar, amveVar));
        }
    }
}
