package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: bovb  reason: default package */
/* loaded from: classes3.dex */
final class bovb implements dbrn<Map<String, Object>, Map<String, Object>> {
    final /* synthetic */ bovc a;

    public bovb(bovc bovcVar) {
        this.a = bovcVar;
    }

    @Override // defpackage.dbrn
    public final /* bridge */ /* synthetic */ Map<String, Object> a(@dzsi Map<String, Object> map) {
        final Map<String, Object> map2 = map;
        this.a.a.runOnUiThread(new Runnable(this, map2) { // from class: bova
            private final bovb a;
            private final Map b;

            {
                this.a = this;
                this.b = map2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bovb bovbVar = this.a;
                Map map3 = this.b;
                bovc bovcVar = bovbVar.a;
                if (map3 == null || !map3.containsKey("featureId")) {
                    return;
                }
                ily ilyVar = new ily();
                ilyVar.k((String) map3.get("featureId"));
                begj begjVar = new begj();
                begjVar.b(ilyVar.d());
                begjVar.K = true;
                bovcVar.b.a().o(begjVar, false, null);
            }
        });
        return bvwy.a;
    }
}
