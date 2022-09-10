package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: cfpn  reason: default package */
/* loaded from: classes4.dex */
final class cfpn implements dbrn<Map<String, Object>, Map<String, Object>> {
    final /* synthetic */ cfpo a;

    public cfpn(cfpo cfpoVar) {
        this.a = cfpoVar;
    }

    @Override // defpackage.dbrn
    public final /* bridge */ /* synthetic */ Map<String, Object> a(@dzsi Map<String, Object> map) {
        final Map<String, Object> map2 = map;
        this.a.a.runOnUiThread(new Runnable(this, map2) { // from class: cfpm
            private final cfpn a;
            private final Map b;

            {
                this.a = this;
                this.b = map2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                dbsg<dpum> dbsgVar;
                cfpn cfpnVar = this.a;
                Map map3 = this.b;
                cfpo cfpoVar = cfpnVar.a;
                if (map3 == null) {
                    dbsgVar = dbpy.a;
                } else if (!map3.containsKey("center")) {
                    dbsgVar = dbpy.a;
                } else {
                    String[] split = ((String) map3.get("center")).split(",");
                    if (split.length != 2) {
                        dbsgVar = dbpy.a;
                    } else {
                        try {
                            double parseDouble = Double.parseDouble(split[0]);
                            double parseDouble2 = Double.parseDouble(split[1]);
                            dpul bZ = dpum.d.bZ();
                            if (bZ.c) {
                                bZ.bF();
                                bZ.c = false;
                            }
                            dpum dpumVar = (dpum) bZ.b;
                            int i = 1 | dpumVar.a;
                            dpumVar.a = i;
                            dpumVar.b = parseDouble;
                            dpumVar.a = 2 | i;
                            dpumVar.c = parseDouble2;
                            dbsgVar = dbsg.i(bZ.bK());
                        } catch (NumberFormatException unused) {
                            dbsgVar = dbpy.a;
                        }
                    }
                }
                cfpoVar.b.a().d(cqf.a(dnqb.MISSING_SERVICE_AREA_BUSINESS_LINK), dbsgVar);
            }
        });
        return bvwy.a;
    }
}
