package defpackage;

import android.util.Pair;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: ggi  reason: default package */
/* loaded from: classes3.dex */
public final class ggi implements fpf {
    public final fpg a;
    public asku b;
    private final ggk c;
    private final ezf d;
    private final acth e;
    private final aafo f;
    private final acuh g;
    private final akge h;

    public ggi(fpg fpgVar, ggk ggkVar, ezf ezfVar, acth acthVar, aafo aafoVar, niw niwVar, acuh acuhVar, akge akgeVar) {
        this.a = fpgVar;
        this.c = ggkVar;
        this.d = ezfVar;
        this.e = acthVar;
        this.f = aafoVar;
        this.g = acuhVar;
        this.h = akgeVar;
        ggkVar.b = niwVar;
    }

    private final boolean g() {
        asku askuVar = this.b;
        return askuVar != null && !askuVar.p;
    }

    public final void a(asku askuVar) {
        this.b = askuVar;
        if (askuVar == null) {
            this.c.a();
        }
    }

    public final boolean b() {
        return this.c.d();
    }

    @Override // defpackage.fpc
    public final int c() {
        return 6000;
    }

    @Override // defpackage.fpc
    public final void d() {
        a(null);
    }

    @Override // defpackage.fpc
    public final void e() {
        apoj apojVar;
        apoj apojVar2;
        if (this.b == null) {
            return;
        }
        if (!b() && !g()) {
            this.c.b(this.b, new Pair("overlay_controller_param", new akbi() { // from class: ggh
                @Override // defpackage.akbi
                public final void oL(aopc aopcVar) {
                    ggi ggiVar = ggi.this;
                    ggiVar.a.f(ggiVar);
                    ggiVar.b = null;
                }
            }));
        }
        if (!g()) {
            return;
        }
        if (!this.g.b(this.b)) {
            this.g.a(this.b);
            for (apzg apzgVar : this.b.o) {
                if (apzgVar != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this.b);
                    this.f.c(apzgVar, hashMap);
                }
            }
        }
        acti oi = this.e.oi();
        oi.u(new acte(this.b.n), null);
        apok apokVar = this.b.k;
        if (apokVar == null) {
            apokVar = apok.a;
        }
        if ((apokVar.b & 1) != 0) {
            apok apokVar2 = this.b.k;
            if (apokVar2 == null) {
                apokVar2 = apok.a;
            }
            apojVar = apokVar2.c;
            if (apojVar == null) {
                apojVar = apoj.a;
            }
        } else {
            apojVar = null;
        }
        apok apokVar3 = this.b.m;
        if (apokVar3 == null) {
            apokVar3 = apok.a;
        }
        if ((apokVar3.b & 1) != 0) {
            apok apokVar4 = this.b.m;
            if (apokVar4 == null) {
                apokVar4 = apok.a;
            }
            apojVar2 = apokVar4.c;
            if (apojVar2 == null) {
                apojVar2 = apoj.a;
            }
        } else {
            apojVar2 = null;
        }
        if (apojVar != null && (apojVar.b & 1048576) != 0) {
            oi.u(new acte(apojVar.t.I()), null);
        }
        if (apojVar2 != null && (apojVar2.b & 1048576) != 0) {
            oi.u(new acte(apojVar2.t), null);
        }
        this.b = null;
    }

    @Override // defpackage.fpf
    public final boolean f() {
        return !this.d.k() && !this.h.j();
    }
}
