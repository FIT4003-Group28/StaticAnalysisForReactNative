package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: svq  reason: default package */
/* loaded from: classes7.dex */
public final class svq {
    private static final dcqe a = dcqe.c("svq");
    private final wuw b;
    private final swj c;
    private final swl d;
    private final swh e;

    public svq(wuw wuwVar, swj swjVar, swl swlVar, swh swhVar) {
        this.b = wuwVar;
        this.c = swjVar;
        this.d = swlVar;
        this.e = swhVar;
    }

    public static dbsg<cqix<?>> b(cqkp cqkpVar) {
        if (cqkpVar instanceof swc) {
            return dbsg.i(cqgr.fT(new svy(), (swc) cqkpVar));
        }
        if (cqkpVar instanceof swd) {
            return dbsg.i(cqgr.fT(new swa(), (swd) cqkpVar));
        }
        return cqkpVar instanceof swb ? dbsg.i(cqgr.fT(new svw(), (swb) cqkpVar)) : dbpy.a;
    }

    public final dbsg<svr> a(sxa sxaVar, tlv tlvVar, amve amveVar) {
        dqvj dqvjVar = dqvj.DRIVE;
        dqvj c = dqvj.c(amveVar.b().b);
        if (c == null) {
            c = dqvj.DRIVE;
        }
        int ordinal = c.ordinal();
        if (ordinal != 0 && ordinal != 1 && ordinal != 2) {
            if (ordinal == 3) {
                swl swlVar = this.d;
                Activity activity = (Activity) ((dxjd) swlVar.a).a;
                swl.a(activity, 1);
                sve a2 = swlVar.b.a();
                swl.a(a2, 2);
                ycj a3 = swlVar.c.a();
                swl.a(a3, 3);
                xkm a4 = swlVar.d.a();
                swl.a(a4, 4);
                swl.a(tlvVar, 5);
                swl.a(amveVar, 6);
                return dbsg.i(new swk(activity, a2, a3, a4, tlvVar, amveVar));
            } else if (ordinal != 5) {
                if (ordinal == 7) {
                    dbsg j = dbsg.j(this.b.a(amveVar, tlvVar.w(amveVar).b().intValue()));
                    if (!j.a() || ((wuv) j.b()).e()) {
                        return (!j.a() || !((wuv) j.b()).e()) ? dbpy.a : dbsg.i(this.c.a(tlvVar, amveVar));
                    }
                    swh swhVar = this.e;
                    tmi a5 = swhVar.a.a();
                    swh.a(a5, 1);
                    swp a6 = swhVar.b.a();
                    swh.a(a6, 2);
                    swh.a(swhVar.c.a(), 3);
                    swh.a(swhVar.d.a(), 4);
                    suq a7 = swhVar.e.a();
                    swh.a(a7, 5);
                    swh.a(sxaVar, 6);
                    swh.a(tlvVar, 7);
                    swh.a(amveVar, 8);
                    return dbsg.i(new swg(a5, a6, a7, sxaVar, tlvVar, amveVar));
                } else if (ordinal != 8) {
                    bvoo.h("Attempted to display invalid trip in result list.", new Object[0]);
                    return dbpy.a;
                }
            }
        }
        return dbsg.i(this.c.a(tlvVar, amveVar));
    }
}
