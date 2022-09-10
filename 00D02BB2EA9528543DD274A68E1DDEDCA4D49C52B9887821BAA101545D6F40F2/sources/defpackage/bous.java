package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: bous  reason: default package */
/* loaded from: classes3.dex */
final class bous implements dbrn<Map<String, Object>, Map<String, Object>> {
    final /* synthetic */ bouu a;

    public bous(bouu bouuVar) {
        this.a = bouuVar;
    }

    @Override // defpackage.dbrn
    public final /* bridge */ /* synthetic */ Map<String, Object> a(Map<String, Object> map) {
        final Map<String, Object> map2 = map;
        this.a.a.runOnUiThread(new Runnable(this, map2) { // from class: bour
            private final bous a;
            private final Map b;

            {
                this.a = this;
                this.b = map2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bous bousVar = this.a;
                Map map3 = this.b;
                bouu bouuVar = bousVar.a;
                dbsk.s(map3);
                Object obj = map3.get("label");
                dbsk.s(obj);
                fd K = bouuVar.a.K();
                dbsk.s(K);
                bbut bbutVar = bouuVar.c;
                bbuz m = bbve.m();
                m.e(bouuVar.e);
                m.g((String) obj);
                m.i(bouuVar.b.b());
                bbutVar.k(m.a(), (ges) K);
            }
        });
        return null;
    }
}
