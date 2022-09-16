package defpackage;

import android.content.res.Resources;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: brrn  reason: default package */
/* loaded from: classes4.dex */
public class brrn implements brrk {
    private final dcdc<String> a;
    private final cjtd b;
    private final brrm c;
    @dzsi
    private final String d;
    private final ilo e;

    public brrn(ilo iloVar, boolean z, brrm brrmVar, int i, @dzsi GmmLocation gmmLocation, bvsl bvslVar, final Resources resources) {
        String str;
        dccx F = dcdc.F();
        String a = isl.a(gmmLocation, iloVar.aj(), bvslVar);
        if (!dbsj.d(a)) {
            F.g(a);
        }
        String ar = iloVar.ar();
        if (!dbsj.d(ar)) {
            F.g(ar);
        }
        ArrayList arrayList = new ArrayList();
        dvxz dvxzVar = iloVar.h().s;
        dvxzVar = dvxzVar == null ? dvxz.h : dvxzVar;
        String av = iloVar.av();
        if (iloVar.h().an) {
            String n = iloVar.n();
            boolean aW = iloVar.aW();
            if (!av.isEmpty() && !n.contains(av) && !av.contains(n)) {
                arrayList.add(av);
            }
            if ((dvxzVar.a & 4) != 0 && !dvxzVar.d.equals(n) && (!aW || !n.contains(dvxzVar.d))) {
                arrayList.add(dvxzVar.d);
            }
        } else {
            if ((dvxzVar.a & 1) != 0) {
                arrayList.add(dvxzVar.b);
            }
            if (arrayList.isEmpty() && !av.isEmpty()) {
                arrayList.add(av);
            }
            if ((dvxzVar.a & 4) != 0) {
                arrayList.add(dvxzVar.d);
            }
        }
        String G = iloVar.G();
        if (arrayList.isEmpty() && G != null) {
            arrayList.add(G);
        }
        F.i(arrayList);
        this.a = F.f();
        cjta c = cjtd.c(iloVar.bZ());
        c.d = dtxy.j;
        c.i(i);
        this.b = c.a();
        if (z) {
            dpzu dpzuVar = iloVar.h().bh;
            str = dbrz.e(" ").j().g(dcft.o((dpzuVar == null ? dpzu.b : dpzuVar).a, new dbrn(resources) { // from class: brrl
                private final Resources a;

                {
                    this.a = resources;
                }

                @Override // defpackage.dbrn
                public final Object a(Object obj) {
                    Resources resources2 = this.a;
                    dqfj dqfjVar = (dqfj) obj;
                    if (dqfjVar.a.isEmpty()) {
                        return null;
                    }
                    return resources2.getString(R.string.QUOTED_TEXT, dqfjVar.a);
                }
            }));
        } else {
            str = null;
        }
        this.d = str;
        this.e = iloVar;
        this.c = brrmVar;
    }

    @Override // defpackage.brrk
    public Boolean a() {
        return Boolean.valueOf(this.d != null);
    }

    @Override // defpackage.brrk
    public CharSequence b() {
        return dbsj.e(this.d);
    }

    @Override // defpackage.brrk
    public CharSequence c() {
        return this.e.n();
    }

    @Override // defpackage.brrk
    public cqkl e() {
        this.c.a(this.e);
        return cqkl.a;
    }

    @Override // defpackage.brrk
    @dzsi
    public jic f() {
        dwfl bJ = this.e.bJ();
        if (bJ == null || (bJ.a & 128) == 0) {
            return null;
        }
        return new jic(bJ.h, jfv.b(bJ), 0, 250);
    }

    @Override // defpackage.brrk
    public cjtd g() {
        return this.b;
    }

    @Override // defpackage.brrk
    /* renamed from: h */
    public dcdc<String> d() {
        return this.a;
    }
}
