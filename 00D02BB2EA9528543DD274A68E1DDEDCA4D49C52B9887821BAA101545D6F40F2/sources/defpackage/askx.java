package defpackage;

import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: askx  reason: default package */
/* loaded from: classes2.dex */
public final class askx extends askq implements asmo, asxv {
    private final Rect q;
    private final btvo r;
    private List<crqg> s;
    private final asxw t;

    public askx(Resources resources, akox akoxVar, gll gllVar, arbu arbuVar, asvx asvxVar, asxw asxwVar, asky askyVar, btvo btvoVar, cjqq cjqqVar) {
        super(resources, akoxVar, gllVar, arbuVar, asvxVar, asxwVar, askyVar, btvoVar, cjqqVar, arym.FREE_NAV);
        this.q = new Rect();
        this.r = btvoVar;
        dbsk.s(asxwVar);
        this.t = asxwVar;
    }

    private final Rect g() {
        if (!this.r.getNavigationParameters().B()) {
            return this.e.b();
        }
        int dimensionPixelOffset = this.f.getDimensionPixelOffset(R.dimen.map_visiblerect_padding);
        Rect b = this.e.b();
        akyy akyyVar = this.d.k().b;
        if (akyyVar == null) {
            return b;
        }
        Rect c = akyyVar.c();
        if (b.bottom >= c.bottom - dimensionPixelOffset) {
            return b;
        }
        this.q.set(c);
        this.q.inset(dimensionPixelOffset, dimensionPixelOffset);
        return this.q;
    }

    @Override // defpackage.asxv
    public final void a(aszm aszmVar, @dzsi aszm aszmVar2) {
        GmmLocation gmmLocation;
        if (!aszmVar.b()) {
            m();
            l();
            return;
        }
        crqd crqdVar = aszmVar.l;
        if (crqdVar == null || (gmmLocation = crqdVar.a) == null) {
            return;
        }
        this.s = crqdVar.g;
        k(aszmVar, crqdVar.f, gmmLocation);
    }

    @Override // defpackage.askq, defpackage.asmo
    public final void b() {
        super.b();
        this.t.F(this);
    }

    @Override // defpackage.askq, defpackage.asmo
    public final void c() {
        this.t.G(this);
        super.c();
    }

    @Override // defpackage.askq
    protected final void p(boolean z) {
        if (this.n == null) {
            return;
        }
        Point i = this.e.i();
        v(z, z().c(this.n, null, null, g(), this.o, i.x, i.y, this.f.getDisplayMetrics().density));
    }

    @Override // defpackage.askq
    protected final void q(boolean z) {
        List<crqg> list;
        alad aladVar = null;
        if (this.n != null && (list = this.s) != null) {
            akra[] akraVarArr = new akra[list.size() + 1];
            int i = 0;
            akraVarArr[0] = this.n.C();
            while (i < this.s.size()) {
                int i2 = i + 1;
                akqq akqqVar = this.s.get(i).a.e;
                dbsk.s(akqqVar);
                akraVarArr[i2] = akra.f(akqqVar);
                i = i2;
            }
            akrp f = akrp.f(akraVarArr);
            Point i3 = this.e.i();
            aladVar = z().m(f, g(), i3.x, i3.y, this.f.getDisplayMetrics().density, 0.0f);
        }
        w(z, aladVar);
    }

    @Override // defpackage.askq
    @dzsi
    protected final alad u() {
        if (this.i == null) {
            return null;
        }
        Point i = this.e.i();
        aslm aslmVar = this.i;
        dcdc<akra> dcdcVar = aslmVar.f;
        if (aslmVar.a == asld.INSPECT_RESULTS_ON_MAP_WITHOUT_LOCATION) {
            if (!dcdcVar.isEmpty()) {
                return z().i(dcdcVar, this.i.i, g(), i.x, i.y, this.f.getDisplayMetrics().density);
            }
            return null;
        } else if (this.n != null) {
            return z().h(dcdcVar, this.i.i, this.n.C(), g(), i.x, i.y, this.f.getDisplayMetrics().density);
        } else {
            return null;
        }
    }
}
