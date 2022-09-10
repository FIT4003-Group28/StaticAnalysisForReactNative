package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
import java.util.List;
/* compiled from: PG */
/* renamed from: ahpa  reason: default package */
/* loaded from: classes2.dex */
final class ahpa {
    final /* synthetic */ ahpe a;

    public ahpa(ahpe ahpeVar) {
        this.a = ahpeVar;
    }

    public final void a(gdx gdxVar) {
        ahpe ahpeVar = this.a;
        boolean z = gdxVar.a;
        ahpeVar.g = z;
        if (z) {
            ahpeVar.c.clear();
            ahpeVar.d.clear();
            ahpeVar.c();
            return;
        }
        ahoz ahozVar = ahpeVar.b;
        if (ahozVar == null) {
            return;
        }
        List<GmmLocation> list = ahpeVar.c;
        List<GmmLocation> list2 = ahpeVar.d;
        if (ahozVar.a != null) {
            ahozVar.b.a(list, ckea.j, list2, ckea.i);
            ahozVar.b.b(list, ckea.c, list2, ckea.b);
            ahns ahnsVar = ahozVar.b;
            ckgz ckgzVar = ckea.h;
            try {
                if (list.size() == list2.size()) {
                    for (int i = 0; i < list.size(); i++) {
                        GmmLocation gmmLocation = list.get(i);
                        if (ahns.c(gmmLocation, list2.get(i)) >= 10.0d && gmmLocation.hasAccuracy()) {
                            ckco ckcoVar = (ckco) ahnsVar.a.a(ckgzVar);
                            float accuracy = gmmLocation.getAccuracy();
                            ckcoVar.a(accuracy < 5.0f ? ahnr.a(1) : accuracy < 10.0f ? ahnr.a(2) : accuracy < 15.0f ? ahnr.a(3) : accuracy < 20.0f ? ahnr.a(4) : accuracy < 30.0f ? ahnr.a(5) : accuracy < 50.0f ? ahnr.a(6) : accuracy < 100.0f ? ahnr.a(7) : accuracy < 200.0f ? ahnr.a(8) : accuracy < 300.0f ? ahnr.a(9) : accuracy < 400.0f ? ahnr.a(10) : accuracy < 500.0f ? ahnr.a(11) : ahnr.a(12));
                        }
                    }
                }
            } catch (Exception e) {
                bvoo.j(e);
            }
        }
        ahpe ahpeVar2 = this.a;
        ahpeVar2.b.a(ahpeVar2.e, ahpeVar2.f);
    }
}
