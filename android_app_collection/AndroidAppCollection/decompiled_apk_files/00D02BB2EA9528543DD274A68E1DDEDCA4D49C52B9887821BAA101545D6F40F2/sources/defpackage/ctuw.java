package defpackage;

import android.content.Context;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ctuw  reason: default package */
/* loaded from: classes5.dex */
public final class ctuw {
    public static ctqu a(ctyy ctyyVar, Context context, dxnk dxnkVar, ctxo ctxoVar, long j) {
        dspd dspdVar;
        dbsg i;
        dbsg dbsgVar;
        ctqt m = ctqu.m();
        m.f(dxnkVar.a);
        dxne dxneVar = dxnkVar.b;
        if (dxneVar == null) {
            dxneVar = dxne.d;
        }
        m.b(dxneVar.c);
        ctpr ctprVar = (ctpr) m;
        ctprVar.e = dbsg.i(Long.valueOf(j));
        if (!dxnkVar.i.isEmpty()) {
            ctprVar.a = dbsg.i(dxnkVar.i);
        }
        dxne dxneVar2 = dxnkVar.b;
        if (dxneVar2 == null) {
            dxneVar2 = dxne.d;
        }
        String str = "";
        if (!(dxneVar2.a == 2 ? (String) dxneVar2.b : str).isEmpty()) {
            dxne dxneVar3 = dxnkVar.b;
            if (dxneVar3 == null) {
                dxneVar3 = dxne.d;
            }
            if (dxneVar3.a == 2) {
                str = (String) dxneVar3.b;
            }
            m.c(str);
        } else {
            dxne dxneVar4 = dxnkVar.b;
            if (dxneVar4 == null) {
                dxneVar4 = dxne.d;
            }
            if (dxneVar4.a == 1) {
                dspdVar = (dspd) dxneVar4.b;
            } else {
                dspdVar = dspd.b;
            }
            m.g(dspdVar.G());
        }
        if (dxnkVar.c != null) {
            ctqp b = ctqq.b();
            ArrayList arrayList = new ArrayList();
            dxmy dxmyVar = dxnkVar.c;
            if (dxmyVar == null) {
                dxmyVar = dxmy.b;
            }
            for (dxnc dxncVar : dxmyVar.a) {
                arrayList.add(ctus.c(dxncVar));
            }
            b.b(arrayList);
            ctprVar.b = dbsg.i(b.a());
        }
        HashMap hashMap = new HashMap();
        Map unmodifiableMap = Collections.unmodifiableMap(dxnkVar.d);
        for (String str2 : unmodifiableMap.keySet()) {
            hashMap.put(str2, ((dsok) unmodifiableMap.get(str2)).bS());
        }
        m.e(hashMap);
        dccx F = dcdc.F();
        csvo.a(context);
        if (csvo.v(dxzy.a.a().k())) {
            for (dxnp dxnpVar : dxnkVar.e) {
                dxmm dxmmVar = dxnpVar.b;
                if (dxmmVar == null) {
                    dxmmVar = dxmm.j;
                }
                dbsg<ctzl> a = ctug.a(context, dxmmVar, dbpy.a, dbpy.a);
                if (a.a()) {
                    cuge d = cugf.d();
                    d.d(dxnpVar.a);
                    d.b(a.b());
                    F.g(d.a());
                }
            }
            m.d(F.f());
        } else {
            m.d(F.f());
        }
        csvo.a(context);
        if (csvo.v(dxzy.a.a().E())) {
            dxof dxofVar = dxnkVar.h;
            if (dxofVar == null) {
                dxofVar = dxof.c;
            }
            cugg c = cugh.c();
            c.b(0);
            c.c(0);
            dxmo dxmoVar = dxofVar.a;
            if (dxmoVar != null) {
                int i2 = dxmoVar.a;
                int i3 = i2 != 0 ? i2 != 1 ? 0 : 3 : 2;
                if (i3 == 0) {
                    i3 = 1;
                }
                if (i3 - 2 != 1) {
                    c.b(0);
                } else {
                    c.b(1);
                }
            }
            if (csvo.u(csvo.a(context).a.O)) {
                int i4 = dxofVar.b;
                int i5 = i4 != 0 ? i4 != 1 ? 0 : 3 : 2;
                if (i5 == 0) {
                    i5 = 1;
                }
                if (i5 - 2 != 1) {
                    c.c(1);
                } else {
                    c.c(2);
                }
            }
            ctprVar.c = dbsg.i(c.a());
        }
        dccx F2 = dcdc.F();
        if (csvo.u(csvo.a(context).a.az)) {
            for (dxnp dxnpVar2 : dxnkVar.f) {
                dbpy<Object> dbpyVar = dbpy.a;
                dbpy<Object> dbpyVar2 = dbpy.a;
                cuge d2 = cugf.d();
                dxmm dxmmVar2 = dxnpVar2.b;
                if (dxmmVar2 == null) {
                    dxmmVar2 = dxmm.j;
                }
                dbsg<ctzl> a2 = ctug.a(context, dxmmVar2, dbpyVar, dbpyVar2);
                if (!a2.a()) {
                    i = dbpy.a;
                } else {
                    d2.d(dxnpVar2.a);
                    d2.b(a2.b());
                    if (!dxnpVar2.c.u()) {
                        d2.c(dxnpVar2.c.G());
                    }
                    i = dbsg.i(d2.a());
                }
                if (i.a()) {
                    F2.g((cugf) i.b());
                }
            }
            m.h(F2.f());
        } else {
            m.h(F2.f());
        }
        if (csvo.a(context).d()) {
            dxms dxmsVar = dxnkVar.g;
            if (dxmsVar == null) {
                dxmsVar = dxms.c;
            }
            int a3 = dxou.a(dxmsVar.a);
            if (a3 == 0) {
                a3 = 1;
            }
            if (a3 - 2 == 1) {
                int a4 = dxou.a(dxmsVar.a);
                if (a4 == 0 || a4 != 3) {
                    cstl.a("RichTextCustomViewContentProtoConverter");
                    dbsgVar = dbpy.a;
                } else {
                    try {
                        dsok dsokVar = dxmsVar.b;
                        if (dsokVar == null) {
                            dsokVar = dsok.c;
                        }
                        dspd dspdVar2 = dsokVar.b;
                        dsqa c2 = dsqa.c();
                        dxsm dxsmVar = dxsm.b;
                        try {
                            dspj s = dspdVar2.s();
                            dsqw dsqwVar = (dsqw) dxsmVar.cu(4);
                            try {
                                dstc b2 = dsst.a.b(dsqwVar);
                                b2.f(dsqwVar, dspk.n(s), c2);
                                b2.j(dsqwVar);
                                try {
                                    s.b(0);
                                    dsqw.cv(dsqwVar);
                                    cuhv a5 = ctvj.a(ctyyVar, context, (dxsm) dsqwVar, "RICH_TEXT_ACCESSORY_VIEW", ctxoVar);
                                    cuhw c3 = cuhx.c();
                                    c3.b(a5);
                                    dbsgVar = dbsg.i(c3.a());
                                } catch (dsrm e) {
                                    throw e;
                                }
                            } catch (IOException e2) {
                                if (!(e2.getCause() instanceof dsrm)) {
                                    throw new dsrm(e2.getMessage());
                                }
                                throw ((dsrm) e2.getCause());
                            } catch (RuntimeException e3) {
                                if (e3.getCause() instanceof dsrm) {
                                    throw ((dsrm) e3.getCause());
                                }
                                throw e3;
                            }
                        } catch (dsrm e4) {
                            throw e4;
                        }
                    } catch (dsrm unused) {
                        cstl.a("RichTextCustomViewContentProtoConverter");
                        dbsgVar = dbpy.a;
                    }
                }
                if (dbsgVar.a()) {
                    ctprVar.d = dbsg.i((cufx) dbsgVar.b());
                }
            }
        }
        return m.a();
    }
}
