package defpackage;

import android.content.res.Resources;
import java.util.Set;
/* compiled from: PG */
/* renamed from: arcg  reason: default package */
/* loaded from: classes2.dex */
public final class arcg {
    public final ardc a;
    public final arcf b;
    public final Set<arcb> c;
    public final arcq d;
    public final arcq e;
    public float f;
    public float g;
    private final float h;

    public arcg(Resources resources, akxa akxaVar) {
        ardc ardcVar = new ardc(resources, akxaVar);
        arcf arcfVar = new arcf(ardcVar);
        this.f = 1.0f;
        this.g = 1.0f;
        this.a = ardcVar;
        this.b = arcfVar;
        arcq e = arcfVar.a.e(arcfVar.a(), "Navigation ghost chevron", 3);
        this.d = e;
        arcq e2 = arcfVar.a.e(arcfVar.b(), "Navigation ghost chevron disc", 2);
        this.e = e2;
        if (resources.getDisplayMetrics() != null) {
            this.h = (resources.getDisplayMetrics().density * 92.0f) / e2.c();
        } else {
            this.h = 92.0f / e2.c();
        }
        this.c = dcnm.d(e, e2);
    }

    public final void a(@dzsi area areaVar, akzh akzhVar) {
        if (areaVar == null) {
            b(false);
            return;
        }
        b(true);
        alad p = akzhVar.p();
        areaVar.q = ardi.b(p.k, p.l);
        akra akraVar = areaVar.a;
        float a = this.h * ardi.a(this.d.c(), areaVar.q);
        this.d.e(akraVar, Float.valueOf(this.f * a), areaVar.k ? Float.valueOf(-areaVar.e) : null, null);
        this.e.e(akraVar, Float.valueOf(a), Float.valueOf(-akzhVar.p().m), Float.valueOf(this.g));
    }

    public final void b(boolean z) {
        for (arcb arcbVar : this.c) {
            arcbVar.a(z);
        }
    }
}
