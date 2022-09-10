package defpackage;

import com.google.android.apps.gmm.locationsharing.api.PersonId;
import java.util.List;
/* compiled from: PG */
/* renamed from: aidf  reason: default package */
/* loaded from: classes2.dex */
final class aidf {
    public final akzh a;
    public final List<aicq> b;
    public dbsg<akra> c = dbpy.a;
    @dzsi
    public aidg d;
    public final boolean e;
    public boolean f;
    final /* synthetic */ aidh g;
    private double h;
    private double i;
    private final dbsg<PersonId> j;

    public aidf(aidh aidhVar, aicq aicqVar, akzh akzhVar, dhjz dhjzVar, boolean z, dbsg<PersonId> dbsgVar) {
        this.g = aidhVar;
        boolean z2 = false;
        this.f = false;
        this.a = akzhVar;
        this.b = dchl.b(aicqVar);
        this.e = z;
        this.j = dbsgVar;
        if (dbsgVar.a() && dbsgVar.b().equals(aicqVar.a().a())) {
            z2 = true;
        }
        this.f = z2;
        this.d = aidhVar.a(akyx.n(akzhVar, akra.e(dhjzVar.c, dhjzVar.b)), this.f);
        this.h = dhjzVar.c;
        this.i = dhjzVar.b;
    }

    public final boolean a(@dzsi aidg aidgVar) {
        aidg aidgVar2 = this.d;
        return (aidgVar2 == null || aidgVar == null || aidgVar2.a.y(aidgVar.a) > ((float) (aidgVar2.b + aidgVar.b))) ? false : true;
    }

    public final boolean b(aidf aidfVar) {
        return a(aidfVar.d);
    }

    public final void c(aidf aidfVar) {
        this.b.addAll(aidfVar.b);
        this.h += aidfVar.h;
        this.i += aidfVar.i;
        if (!this.f) {
            for (aicq aicqVar : aidfVar.b) {
                boolean z = false;
                if (this.f || (this.j.a() && aicqVar.a().a().equals(this.j.b()))) {
                    z = true;
                }
                this.f = z;
            }
        }
        this.d = this.g.a(akyx.n(this.a, d()), this.f);
    }

    public final akra d() {
        if (this.c.a()) {
            return this.c.b();
        }
        double d = this.h;
        double size = this.b.size();
        Double.isNaN(size);
        double d2 = d / size;
        double d3 = this.i;
        double size2 = this.b.size();
        Double.isNaN(size2);
        return akra.e(d2, d3 / size2);
    }
}
