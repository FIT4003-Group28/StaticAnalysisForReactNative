package defpackage;

import java.util.Arrays;
import java.util.Map;
/* compiled from: PG */
/* renamed from: buby  reason: default package */
/* loaded from: classes4.dex */
final class buby extends dyga {
    final /* synthetic */ bubz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public buby(bubz bubzVar, dyew dyewVar) {
        super(dyewVar);
        this.a = bubzVar;
    }

    @Override // defpackage.dyir, defpackage.dyew
    public final void a(dyhw dyhwVar) {
        ckha a;
        if (dyhwVar.g(bucm.j)) {
            String str = (String) dyhwVar.h(bucm.j);
            if (!dbsj.d(str)) {
                this.a.a.b.a().g(str);
            }
        }
        if (dyhwVar.g(bucm.k)) {
            String str2 = (String) dyhwVar.h(bucm.k);
            if (!dbsj.d(str2)) {
                this.a.a.a.a().ac(bvjk.bt, str2);
            }
        }
        if (dyhwVar.g(bucm.l)) {
            try {
                djpy djpyVar = (djpy) dsqw.cq(djpy.d, (byte[]) dyhwVar.h(bucm.l));
                if ((djpyVar.a & 1) != 0) {
                    this.a.a.b.a().e(djpyVar.b);
                }
                if ((djpyVar.a & 2) != 0) {
                    this.a.a.b.a().f(djpyVar.c);
                }
            } catch (dsrm unused) {
            }
        }
        if (dyhwVar.g(bucm.m)) {
            Map<String, Map<String, String>> a2 = bvgt.a(Arrays.asList((String) dyhwVar.h(bucm.m)));
            if (a2.containsKey("gfet4t7")) {
                Map<String, String> map = a2.get("gfet4t7");
                if (map.containsKey("dur") && (a = ckjl.a(this.a.a.e)) != null) {
                    ((ckcp) this.a.a.c.a().a(a)).a(Math.round(Double.parseDouble(map.get("dur"))));
                }
            }
        }
        super.a(dyhwVar);
    }
}
