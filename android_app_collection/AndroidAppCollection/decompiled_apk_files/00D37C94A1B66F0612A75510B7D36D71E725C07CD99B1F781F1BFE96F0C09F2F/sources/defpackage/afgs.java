package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: afgs  reason: default package */
/* loaded from: classes.dex */
public final class afgs extends afev {
    private final PlayerConfigModel c;
    private final aepf d;
    private final yrj e;
    private final zgz f;
    private final adzz g;
    private final String h;
    private final String i;

    public afgs(afjz afjzVar, PlayerConfigModel playerConfigModel, aepf aepfVar, yrj yrjVar, zgz zgzVar, adzz adzzVar, String str, aeub aeubVar) {
        super(afjzVar, aeubVar);
        this.c = playerConfigModel;
        this.d = aepfVar;
        this.e = yrjVar;
        this.f = zgzVar;
        this.g = adzzVar;
        this.h = str;
        this.i = true != playerConfigModel.aX() ? "249" : "250";
    }

    @Override // defpackage.afev
    public final void a(List list, long j, long j2, afes[] afesVarArr, afer aferVar) {
        amuk o;
        afes afesVar;
        afes afesVar2;
        ArrayList arrayList = new ArrayList();
        for (afes afesVar3 : afesVarArr) {
            if (!this.b.o().as || afeu.c(this.g, this.h, this.c, afesVar3)) {
                arrayList.add(afesVar3);
            }
        }
        if (arrayList.isEmpty()) {
            o = amuk.p(afesVarArr);
        } else {
            o = amuk.o(arrayList);
        }
        amuk amukVar = o;
        Iterator it = amukVar.iterator();
        while (true) {
            if (!it.hasNext()) {
                afesVar = null;
                break;
            }
            afesVar = (afes) it.next();
            if (afeu.b(this.g, afesVar, this.h, this.c, true, j)) {
                break;
            } else if (h(this.g, afesVar, this.h, this.c, j)) {
                break;
            }
        }
        afes afesVar4 = aferVar.c;
        Object a = this.f.a();
        long j3 = j + j2;
        if (!this.b.aj()) {
            int a2 = this.b.a();
            if (a != null) {
                FormatStreamModel formatStreamModel = (FormatStreamModel) a;
                if (formatStreamModel.d() <= a2) {
                    afesVar2 = (afes) arey.s(amukVar);
                    afjz afjzVar = this.b;
                    if (afjzVar.G() && afjzVar.o().ah && !aank.w().contains(Integer.valueOf(formatStreamModel.e()))) {
                        Iterator it2 = amukVar.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            afes afesVar5 = (afes) it2.next();
                            if (afesVar5.d().equals(this.i)) {
                                afesVar2 = afesVar5;
                                break;
                            }
                        }
                    }
                }
            }
            afesVar2 = (afes) amukVar.get(0);
        } else {
            long e = this.d.e();
            long j4 = a != null ? ((FormatStreamModel) a).f : 0;
            Iterator it3 = amukVar.iterator();
            while (true) {
                if (it3.hasNext()) {
                    afesVar2 = (afes) it3.next();
                    if (afesVar2.a() + j4 < e) {
                        break;
                    }
                } else {
                    afesVar2 = (afes) arey.s(amukVar);
                    break;
                }
            }
        }
        int i = 1;
        if (afesVar != null) {
            int a3 = afesVar.a();
            int a4 = afesVar2.a();
            boolean o2 = this.e.o();
            boolean b = afeu.b(this.g, afesVar, this.h, this.c, true, j3);
            if ((!o2) || a3 > a4 || b) {
                afesVar2 = afesVar;
            }
        }
        int size = list.size();
        if (!this.b.o().T && afesVar2 != null) {
            size = afeu.a(list, j, this.c.E(this.e.a()), new afgr(afesVar2));
        }
        if (afesVar4 != null) {
            i = !afesVar2.equals(afesVar4) ? 3 : 0;
        }
        new afeq(afesVar2, i, 0, size).a(aferVar);
    }

    @Override // defpackage.afev
    public final void b(boolean z) {
    }

    @Override // defpackage.afev
    public final void c() {
    }

    @Override // defpackage.afev
    public final void d(float f) {
    }

    @Override // defpackage.afev
    public final void e() {
    }

    @Override // defpackage.afev
    public final void f(aegx aegxVar) {
    }

    @Override // defpackage.afev
    public final void g(afmv afmvVar) {
    }
}
