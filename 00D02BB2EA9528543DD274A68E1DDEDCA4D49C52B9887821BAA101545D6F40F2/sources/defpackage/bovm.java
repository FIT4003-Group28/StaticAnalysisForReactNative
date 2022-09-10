package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: bovm  reason: default package */
/* loaded from: classes3.dex */
final class bovm implements dbrn<Map<String, Object>, Map<String, Object>> {
    final /* synthetic */ bovq a;

    public bovm(bovq bovqVar) {
        this.a = bovqVar;
    }

    @Override // defpackage.dbrn
    public final /* bridge */ /* synthetic */ Map<String, Object> a(@dzsi Map<String, Object> map) {
        ilo d;
        Map<String, Object> map2 = map;
        final boty botyVar = new boty();
        if (map2 != null && (map2.get("proposalId") instanceof String)) {
            botyVar.a = (String) map2.get("proposalId");
        }
        if (map2 != null && (map2.get("pendingEdits") instanceof String)) {
            try {
                botyVar.b = (dnvs) dsqw.cr(dnvs.d, ddae.e.j((String) map2.get("pendingEdits")), dsqa.c());
            } catch (Exception unused) {
            }
        }
        bwrs<ilo> bwrsVar = this.a.b;
        if (bwrsVar == null) {
            if (map2 != null && map2.containsKey("featureId") && map2.containsKey("lat") && map2.containsKey("lng")) {
                ily ilyVar = new ily();
                ilyVar.k((String) map2.get("featureId"));
                ilyVar.q(new akqq(((Double) map2.get("lat")).doubleValue(), ((Double) map2.get("lng")).doubleValue()));
                d = ilyVar.d();
            }
            this.a.a.runOnUiThread(new Runnable(this, botyVar) { // from class: bovl
                private final bovm a;
                private final bovo b;

                {
                    this.a = this;
                    this.b = botyVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    bovm bovmVar = this.a;
                    boty botyVar2 = (boty) this.b;
                    bovmVar.a.d(new botz(botyVar2.a, botyVar2.b, botyVar2.c));
                }
            });
            return bvwy.a;
        }
        d = bwrsVar.c();
        dbsk.s(d);
        botyVar.c = bbvh.e(d).f(dgpu.LOCAL);
        this.a.a.runOnUiThread(new Runnable(this, botyVar) { // from class: bovl
            private final bovm a;
            private final bovo b;

            {
                this.a = this;
                this.b = botyVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bovm bovmVar = this.a;
                boty botyVar2 = (boty) this.b;
                bovmVar.a.d(new botz(botyVar2.a, botyVar2.b, botyVar2.c));
            }
        });
        return bvwy.a;
    }
}
