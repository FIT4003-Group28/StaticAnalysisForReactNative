package defpackage;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: bfle  reason: default package */
/* loaded from: classes3.dex */
public class bfle extends bfkr {
    public static final bfke a;
    public static final bfke b;
    private final bmea c;
    private final bflb d;
    private final bego e;
    private final bfic f;
    @dzsi
    private bruz g;
    private cqtv h;
    private float i;
    private boolean j;
    private jjn k;

    static {
        bfkd h = bfke.h();
        bfkb bfkbVar = (bfkb) h;
        bfkbVar.a = dtxy.hI;
        bfkbVar.e = dtxy.hL;
        bfkbVar.b = dtxy.hM;
        bfkbVar.c = dtxy.hJ;
        bfkbVar.d = dtxy.hK;
        a = h.a();
        bfkd h2 = bfke.h();
        bfkb bfkbVar2 = (bfkb) h2;
        bfkbVar2.a = dtxy.iB;
        bfkbVar2.e = dtxy.iE;
        bfkbVar2.b = dtxy.iF;
        bfkbVar2.c = dtxy.iC;
        bfkbVar2.d = dtxy.iD;
        b = h2.a();
    }

    public bfle(Activity activity, cjqy cjqyVar, bhat bhatVar, btvo btvoVar, bbut bbutVar, bflb bflbVar, bwsh bwshVar, bvrb bvrbVar, cqhn cqhnVar, dxio<apqd> dxioVar, bvjj bvjjVar, bvpe bvpeVar, huc hucVar, bmdy bmdyVar, cqhu cqhuVar, bego begoVar, bfic bficVar) {
        super(activity, cjqyVar, bhatVar, btvoVar, bbutVar, bflbVar, bwshVar, bvrbVar, cqhnVar, dxioVar, bvjjVar, bvpeVar, hucVar, bmdyVar);
        this.h = ibn.k();
        this.k = jjn.HIDDEN;
        this.c = new bmeb(bbutVar, bwshVar);
        this.d = bflbVar;
        this.e = begoVar;
        this.f = bficVar;
    }

    private final boolean R() {
        return this.e.a(O());
    }

    @Override // defpackage.bfkr, defpackage.bfkk
    public Boolean D() {
        return true;
    }

    @Override // defpackage.bfkr, defpackage.bfkk
    public cqtv E() {
        return R() ? this.h : cqrp.d(dcyn.a);
    }

    @Override // defpackage.bfkr, defpackage.bfkk
    public Float F() {
        return Float.valueOf(this.i);
    }

    @Override // defpackage.bfkr, defpackage.bfkk
    public void G(float f) {
        this.i = f;
    }

    public void P(@dzsi bruz bruzVar) {
        this.g = bruzVar;
    }

    public void Q(jjn jjnVar) {
        this.k = jjnVar;
        M(jjnVar);
        if (jjnVar.b()) {
            N(b);
        } else if (jjnVar == jjn.COLLAPSED) {
            N(a);
        }
        if (R()) {
            this.f.a = jjnVar;
        }
    }

    @Override // defpackage.bfkr, defpackage.bfkk
    public Boolean b() {
        if (!R() || this.k.b()) {
            return super.b();
        }
        return false;
    }

    @Override // defpackage.bfkr
    protected final List<jbp> g(ilo iloVar, List<dwfl> list) {
        bruz bruzVar = this.g;
        if (bruzVar != null) {
            bruzVar.QR(bwrs.a(iloVar));
        }
        ArrayList arrayList = new ArrayList();
        bmea bmeaVar = R() ? this.f : this.c;
        int i = 0;
        for (dwfl dwflVar : list) {
            arrayList.add(this.d.a(dwflVar, i, iloVar, bmeaVar, L(dwflVar), false, null));
            i++;
        }
        return arrayList;
    }

    @Override // defpackage.bfkr
    protected final bmea h() {
        return this.c;
    }

    @Override // defpackage.bfkr
    public void t(ilo iloVar) {
        ilo O = O();
        super.t(iloVar);
        if (this.j || (O != null && !O.cr(iloVar))) {
            View o = cqkx.o(this);
            if (o == null) {
                this.j = true;
                return;
            }
            RecyclerView recyclerView = (RecyclerView) cqkx.e(o, bfka.b, RecyclerView.class);
            if (recyclerView == null) {
                return;
            }
            recyclerView.l(0);
            this.j = false;
        }
    }

    @Override // defpackage.bfkr, defpackage.bfkm
    @dzsi
    public aeqd w() {
        bruz bruzVar = this.g;
        if (bruzVar == null) {
            return null;
        }
        aeqd G = bruzVar.G();
        if (bruzVar.F().intValue() != 1 && G.b() != null) {
            return G;
        }
        return null;
    }

    @Override // defpackage.bfkr, defpackage.bfkk
    public void x(cqtv cqtvVar) {
        this.h = cqtvVar;
    }

    @Override // defpackage.bfkr, defpackage.bfkk
    public Boolean z() {
        bruz bruzVar;
        boolean z = false;
        if (R() && (bruzVar = this.g) != null && bruzVar.r().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
