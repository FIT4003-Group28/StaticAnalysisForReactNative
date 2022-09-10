package defpackage;

import com.google.android.apps.maps.R;
import java.util.Map;
/* compiled from: PG */
/* renamed from: boux  reason: default package */
/* loaded from: classes3.dex */
final class boux implements dbrn<Map<String, Object>, Map<String, Object>> {
    final /* synthetic */ bouy a;

    public boux(bouy bouyVar) {
        this.a = bouyVar;
    }

    @Override // defpackage.dbrn
    public final /* bridge */ /* synthetic */ Map<String, Object> a(@dzsi Map<String, Object> map) {
        final Map<String, Object> map2 = map;
        this.a.a.runOnUiThread(new Runnable(this, map2) { // from class: bouw
            private final boux a;
            private final Map b;

            {
                this.a = this;
                this.b = map2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ilo iloVar;
                dosc doscVar;
                boux bouxVar = this.a;
                Map map3 = this.b;
                bouy bouyVar = bouxVar.a;
                fd K = bouyVar.a.K();
                dbsk.s(K);
                ges gesVar = (ges) K;
                bwrs<ilo> bwrsVar = bouyVar.b;
                akqq akqqVar = null;
                if (bwrsVar != null) {
                    iloVar = bwrsVar.c();
                    dbsk.s(iloVar);
                } else {
                    iloVar = null;
                }
                if (iloVar != null) {
                    akqqVar = iloVar.aj();
                }
                if (map3 != null && map3.containsKey("lat") && map3.containsKey("lng")) {
                    Double d = (Double) map3.get("lat");
                    Double d2 = (Double) map3.get("lng");
                    if (d != null && d2 != null) {
                        akqqVar = new akqq(d.doubleValue(), d2.doubleValue());
                    }
                }
                boolean z = true;
                if (map3 != null && map3.containsKey("shouldReverseGeocode") && map3.get("shouldReverseGeocode") != null) {
                    z = Boolean.parseBoolean(map3.get("shouldReverseGeocode").toString());
                }
                boolean z2 = false;
                if (map3 != null && map3.containsKey("shouldOpenInSatelliteMode") && map3.get("shouldOpenInSatelliteMode") != null) {
                    z2 = Boolean.parseBoolean(map3.get("shouldOpenInSatelliteMode").toString());
                }
                String string = bouyVar.a.getString(R.string.RAP_PANNABLE_TITLE);
                aneb z3 = anee.z();
                z3.r(string);
                z3.j(4);
                z3.q("");
                ((andx) z3).h = dbsg.i(aned.GM2_TOOLBAR);
                anee a = z3.a();
                if (iloVar == null) {
                    doscVar = dosc.TYPE_RAP_ADD_A_PLACE;
                } else if (iloVar.ce() == doay.TYPE_ESTABLISHMENT) {
                    doscVar = dosc.TYPE_REPORT_LOCAL_ISSUE;
                } else {
                    doscVar = dosc.TYPE_REPORT_MAPS_ISSUE;
                }
                gesVar.aZ(andr.bt(akqqVar, z, z2, doscVar, a));
            }
        });
        return null;
    }
}
