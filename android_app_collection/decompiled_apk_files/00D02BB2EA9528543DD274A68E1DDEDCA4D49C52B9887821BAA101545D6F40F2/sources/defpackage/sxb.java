package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: sxb  reason: default package */
/* loaded from: classes7.dex */
public final class sxb {
    private static final dcqe a = dcqe.c("sxb");
    private final wuw b;
    private final sze c;
    private final szm d;
    private final szp e;
    private final szj f;
    private final szh g;
    private final szc h;

    public sxb(wuw wuwVar, sze szeVar, szm szmVar, szp szpVar, szj szjVar, szh szhVar, szc szcVar) {
        this.b = wuwVar;
        this.c = szeVar;
        this.d = szmVar;
        this.e = szpVar;
        this.f = szjVar;
        this.g = szhVar;
        this.h = szcVar;
    }

    public final dbsg<szn> a(tlv tlvVar, amve amveVar) {
        dqvj dqvjVar = dqvj.DRIVE;
        dqvj c = dqvj.c(amveVar.b().b);
        if (c == null) {
            c = dqvj.DRIVE;
        }
        int ordinal = c.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal == 2) {
                szp szpVar = this.e;
                twk a2 = szpVar.a.a();
                szp.a(a2, 1);
                sxq a3 = szpVar.b.a();
                szp.a(a3, 2);
                sxo a4 = szpVar.c.a();
                szp.a(a4, 3);
                sut a5 = szpVar.d.a();
                szp.a(a5, 4);
                szp.a(tlvVar, 5);
                szp.a(amveVar, 6);
                return dbsg.i(new szo(a2, a3, a4, a5, tlvVar, amveVar));
            } else if (ordinal == 3) {
                szm szmVar = this.d;
                Activity activity = (Activity) ((dxjd) szmVar.a).a;
                szm.a(activity, 1);
                cqat a6 = szmVar.b.a();
                szm.a(a6, 2);
                twk a7 = szmVar.c.a();
                szm.a(a7, 3);
                byyp a8 = szmVar.d.a();
                szm.a(a8, 4);
                bzgl a9 = szmVar.e.a();
                szm.a(a9, 5);
                cqhn a10 = szmVar.f.a();
                szm.a(a10, 6);
                ahvo a11 = szmVar.g.a();
                szm.a(a11, 7);
                suw a12 = szmVar.h.a();
                szm.a(a12, 8);
                dxio a13 = ((dxjh) szmVar.i).a();
                szm.a(a13, 9);
                gdc a14 = szmVar.j.a();
                szm.a(a14, 10);
                szm.a(tlvVar, 11);
                szm.a(amveVar, 12);
                return dbsg.i(new szl(activity, a6, a7, a8, a9, a10, a11, a12, a13, a14, tlvVar, amveVar));
            } else if (ordinal != 5) {
                if (ordinal != 7) {
                    if (ordinal == 8) {
                        szc szcVar = this.h;
                        twk a15 = szcVar.a.a();
                        szc.a(a15, 1);
                        sxq a16 = szcVar.b.a();
                        szc.a(a16, 2);
                        qho a17 = szcVar.c.a();
                        szc.a(a17, 3);
                        sxg a18 = szcVar.d.a();
                        szc.a(a18, 4);
                        szc.a(tlvVar, 5);
                        szc.a(amveVar, 6);
                        return dbsg.i(new szb(a15, a16, a17, a18, tlvVar, amveVar));
                    }
                    bvoo.h("Attempted to display invalid trip in trip details footer.", new Object[0]);
                    return dbpy.a;
                }
                dbsg j = dbsg.j(this.b.a(amveVar, tlvVar.w(amveVar).b().intValue()));
                if (!j.a() || ((wuv) j.b()).e()) {
                    if (!j.a() || !((wuv) j.b()).e()) {
                        return dbpy.a;
                    }
                    szh szhVar = this.g;
                    Activity activity2 = (Activity) ((dxjd) szhVar.a).a;
                    szh.a(activity2, 1);
                    sxq a19 = szhVar.b.a();
                    szh.a(a19, 2);
                    wts a20 = szhVar.c.a();
                    szh.a(a20, 3);
                    szh.a(tlvVar, 4);
                    szh.a(amveVar, 5);
                    return dbsg.i(new szg(activity2, a19, a20, tlvVar, amveVar));
                }
                szj szjVar = this.f;
                wuv wuvVar = (wuv) j.b();
                Activity activity3 = (Activity) ((dxjd) szjVar.a).a;
                szj.a(activity3, 1);
                sxg a21 = szjVar.b.a();
                szj.a(a21, 2);
                szj.a(wuvVar, 3);
                return dbsg.i(new szi(activity3, a21, wuvVar));
            }
        }
        sze szeVar = this.c;
        twk a22 = szeVar.a.a();
        sze.a(a22, 1);
        sxq a23 = szeVar.b.a();
        sze.a(a23, 2);
        sze.a(tlvVar, 3);
        sze.a(amveVar, 4);
        return dbsg.i(new szd(a22, a23, tlvVar, amveVar));
    }
}
