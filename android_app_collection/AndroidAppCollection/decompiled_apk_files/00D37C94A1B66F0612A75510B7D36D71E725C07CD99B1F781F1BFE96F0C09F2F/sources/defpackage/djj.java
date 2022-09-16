package defpackage;

import android.content.Context;
import android.view.View;
import com.facebook.litho.ComponentTree;
import com.facebook.yoga.YogaDirection;
/* compiled from: PG */
/* renamed from: djj  reason: default package */
/* loaded from: classes3.dex */
public final class djj extends cyr {
    @dfs(a = 14)
    private dji A;
    @dfs(a = 10)
    public cyr a;
    @dfs(a = 3)
    public boolean b;
    @dfs(a = 3)
    public int c;
    @dfs(a = 3)
    public int d;
    @dfs(a = 13)
    public dll e;
    @dfs(a = 3)
    public boolean f;
    Integer g;
    Integer v;
    YogaDirection w;
    Integer x;
    Integer y;
    @dfs(a = 13)
    public swv z;

    public djj() {
        super("HorizontalScroll");
        this.c = -1;
        this.d = 0;
        this.f = true;
        this.A = new dji();
    }

    @Override // defpackage.czb
    protected final int F() {
        return 3;
    }

    @Override // defpackage.czb
    protected final Object L(Context context) {
        return new djl(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final void M(cyv cyvVar) {
        dcz dczVar = new dcz();
        dcz dczVar2 = new dcz();
        cyr cyrVar = this.a;
        dczVar.a = new dmm(this.c);
        czf c = ComponentTree.c(new cyv(cyvVar.b, cyvVar.c, cyvVar.l, cyvVar.n(), (byte[]) null), cyrVar);
        c.d = false;
        dczVar2.a = c.a();
        dji djiVar = this.A;
        djiVar.b = (dmm) dczVar.a;
        djiVar.a = (ComponentTree) dczVar2.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final void Q(cyv cyvVar, cyz cyzVar) {
        dcz dczVar = new dcz();
        dcz dczVar2 = new dcz();
        dcz dczVar3 = new dcz();
        cyr cyrVar = this.a;
        boolean z = this.b;
        ComponentTree componentTree = this.A.a;
        Integer num = this.y;
        Integer num2 = this.x;
        int H = (cyzVar.H() - cyzVar.E()) - cyzVar.F();
        if (num == null || num2 == null) {
            ddj ddjVar = new ddj();
            componentTree.p(cyrVar, View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(cyzVar.C(), 1073741824), ddjVar);
            int i = ddjVar.a;
            if (true != z) {
                H = 0;
            }
            int max = Math.max(i, H);
            int i2 = ddjVar.b;
            dczVar.a = Integer.valueOf(max);
            dczVar2.a = Integer.valueOf(i2);
        } else {
            int intValue = num.intValue();
            if (true != z) {
                H = 0;
            }
            dczVar.a = Integer.valueOf(Math.max(intValue, H));
            dczVar2.a = num2;
        }
        dczVar3.a = cyzVar.L();
        this.v = (Integer) dczVar.a;
        this.g = (Integer) dczVar2.a;
        this.w = (YogaDirection) dczVar3.a;
    }

    @Override // defpackage.czb
    public final void R(cyv cyvVar, cyz cyzVar, int i, int i2, ddj ddjVar) {
        dcz dczVar = new dcz();
        dcz dczVar2 = new dcz();
        cyr cyrVar = this.a;
        ComponentTree componentTree = this.A.a;
        ddj ddjVar2 = new ddj();
        componentTree.p(cyrVar, View.MeasureSpec.makeMeasureSpec(0, 0), i2, ddjVar2);
        cyrVar.r(cyvVar, View.MeasureSpec.makeMeasureSpec(0, 0), i2, ddjVar2);
        int i3 = ddjVar2.a;
        int i4 = ddjVar2.b;
        dczVar.a = Integer.valueOf(i3);
        dczVar2.a = Integer.valueOf(i4);
        if (View.MeasureSpec.getMode(i) != 0) {
            i3 = View.MeasureSpec.getSize(i);
        }
        ddjVar.a = i3;
        ddjVar.b = i4;
        this.y = (Integer) dczVar.a;
        this.x = (Integer) dczVar2.a;
    }

    @Override // defpackage.czb
    protected final void S(cyv cyvVar, Object obj) {
        djl djlVar = (djl) obj;
        boolean z = this.f;
        swv swvVar = this.z;
        dll dllVar = this.e;
        int i = this.d;
        dji djiVar = this.A;
        dmm dmmVar = djiVar.b;
        ComponentTree componentTree = djiVar.a;
        int intValue = this.v.intValue();
        int intValue2 = this.g.intValue();
        YogaDirection yogaDirection = this.w;
        djlVar.setHorizontalScrollBarEnabled(z);
        djlVar.setOverScrollMode(i);
        djlVar.a.G(componentTree);
        djlVar.f = dmmVar;
        djlVar.d = swvVar;
        djlVar.b = intValue;
        djlVar.c = intValue2;
        if (dllVar != null) {
            djlVar.e = new djb();
            djlVar.e.a = dllVar;
        }
        djlVar.getViewTreeObserver().addOnPreDrawListener(new djk(djlVar, dmmVar, yogaDirection, null));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final void W(cyv cyvVar, Object obj) {
        djl djlVar = (djl) obj;
        djlVar.a.J();
        djlVar.a.G(null);
        djlVar.b = 0;
        djlVar.c = 0;
        djlVar.f = null;
        djlVar.d = null;
        djb djbVar = djlVar.e;
        if (djbVar != null) {
            djbVar.a = null;
            djlVar.e = null;
        }
        djlVar.setScrollX(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final void X(ddl ddlVar, ddl ddlVar2) {
        dji djiVar = (dji) ddlVar;
        dji djiVar2 = (dji) ddlVar2;
        djiVar2.a = djiVar.a;
        djiVar2.b = djiVar.b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final boolean Z() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final boolean ac() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final boolean af() {
        return true;
    }

    @Override // defpackage.czb
    public final int aj() {
        return 3;
    }

    @Override // defpackage.cyr
    public final boolean e(cyr cyrVar) {
        if (this == cyrVar) {
            return true;
        }
        if (cyrVar == null || getClass() != cyrVar.getClass()) {
            return false;
        }
        djj djjVar = (djj) cyrVar;
        if (this.k == djjVar.k) {
            return true;
        }
        cyr cyrVar2 = this.a;
        if (cyrVar2 == null ? djjVar.a != null : !cyrVar2.f(djjVar.a)) {
            return false;
        }
        if (this.b != djjVar.b || this.c != djjVar.c) {
            return false;
        }
        swv swvVar = this.z;
        if (swvVar == null ? djjVar.z != null : !swvVar.equals(djjVar.z)) {
            return false;
        }
        if (this.d != djjVar.d) {
            return false;
        }
        dll dllVar = this.e;
        if (dllVar == null ? djjVar.e != null : !dllVar.equals(djjVar.e)) {
            return false;
        }
        if (this.f != djjVar.f) {
            return false;
        }
        ComponentTree componentTree = this.A.a;
        if (componentTree == null ? djjVar.A.a != null : !componentTree.equals(djjVar.A.a)) {
            return false;
        }
        dmm dmmVar = this.A.b;
        dmm dmmVar2 = djjVar.A.b;
        return dmmVar == null ? dmmVar2 == null : dmmVar.equals(dmmVar2);
    }

    @Override // defpackage.cyr, defpackage.dan
    public final /* bridge */ /* synthetic */ boolean f(Object obj) {
        return f((cyr) obj);
    }

    @Override // defpackage.cyr
    public final /* bridge */ /* synthetic */ cyr j() {
        djj djjVar = (djj) super.j();
        cyr cyrVar = djjVar.a;
        djjVar.a = cyrVar != null ? cyrVar.j() : null;
        djjVar.g = null;
        djjVar.v = null;
        djjVar.w = null;
        djjVar.x = null;
        djjVar.y = null;
        djjVar.A = new dji();
        return djjVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cyr
    public final ddl m() {
        return this.A;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cyr
    public final void p(cyr cyrVar) {
        djj djjVar = (djj) cyrVar;
        this.g = djjVar.g;
        this.v = djjVar.v;
        this.w = djjVar.w;
        this.x = djjVar.x;
        this.y = djjVar.y;
    }
}
