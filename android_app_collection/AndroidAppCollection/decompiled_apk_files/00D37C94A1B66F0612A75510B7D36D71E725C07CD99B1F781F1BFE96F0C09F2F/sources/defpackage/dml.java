package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.litho.ComponentTree;
import com.facebook.litho.widget.LithoScrollView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: dml  reason: default package */
/* loaded from: classes3.dex */
public final class dml extends cyr {
    @dfs(a = 14)
    private dmk A;
    @dfs(a = 10)
    public cyr a;
    @dfs(a = 3)
    public boolean b;
    @dfs(a = 3)
    public boolean c;
    @dfs(a = 3)
    public boolean d;
    @dfs(a = 3)
    public int e;
    @dfs(a = 3)
    public boolean f;
    @dfs(a = 13)
    public nc g;
    @dfs(a = 3)
    public int v;
    @dfs(a = 13)
    public dll w;
    @dfs(a = 3)
    public boolean x;
    Integer y;
    Integer z;

    public dml() {
        super("VerticalScroll");
        this.v = 0;
        this.x = true;
        this.A = new dmk();
    }

    @Override // defpackage.czb
    protected final int F() {
        return 3;
    }

    @Override // defpackage.czb
    protected final Object L(Context context) {
        return (LithoScrollView) LayoutInflater.from(context).inflate(R.layout.litho_scroll_view, (ViewGroup) null, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final void M(cyv cyvVar) {
        dcz dczVar = new dcz();
        dcz dczVar2 = new dcz();
        cyr cyrVar = this.a;
        int i = this.e;
        boolean z = this.d;
        dmm dmmVar = new dmm();
        dmmVar.a = i;
        dczVar.a = dmmVar;
        czf c = ComponentTree.c(new cyv(cyvVar.b, cyvVar.c, cyvVar.l, cyvVar.n(), (byte[]) null), cyrVar);
        c.d = z;
        dczVar2.a = c.a();
        dmk dmkVar = this.A;
        dmkVar.b = (dmm) dczVar.a;
        dmkVar.a = (ComponentTree) dczVar2.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final void Q(cyv cyvVar, cyz cyzVar) {
        boolean z;
        cyr cyrVar = this.a;
        boolean z2 = this.c;
        boolean z3 = this.b;
        ComponentTree componentTree = this.A.a;
        Integer num = this.z;
        Integer num2 = this.y;
        int H = (cyzVar.H() - cyzVar.E()) - cyzVar.F();
        int C = (cyzVar.C() - cyzVar.G()) - cyzVar.D();
        if (num == null || num.intValue() != H) {
            z = z2;
        } else if (!z2) {
            return;
        } else {
            if (num2 != null && num2.intValue() == C) {
                return;
            }
            z = true;
        }
        dqt.t(cyvVar, View.MeasureSpec.makeMeasureSpec(cyzVar.H(), 1073741824), View.MeasureSpec.makeMeasureSpec(cyzVar.C(), 1073741824), new ddj(), componentTree, cyrVar, z, z3);
    }

    @Override // defpackage.czb
    public final void R(cyv cyvVar, cyz cyzVar, int i, int i2, ddj ddjVar) {
        dcz dczVar = new dcz();
        dcz dczVar2 = new dcz();
        dqt.t(cyvVar, i, i2, ddjVar, this.A.a, this.a, this.c, this.b);
        dczVar.a = Integer.valueOf(ddjVar.a);
        dczVar2.a = Integer.valueOf(ddjVar.b);
        this.z = (Integer) dczVar.a;
        this.y = (Integer) dczVar2.a;
    }

    @Override // defpackage.czb
    protected final void S(cyv cyvVar, Object obj) {
        LithoScrollView lithoScrollView = (LithoScrollView) obj;
        boolean z = this.x;
        boolean z2 = this.f;
        boolean z3 = this.d;
        nc ncVar = this.g;
        dll dllVar = this.w;
        int i = this.v;
        dmk dmkVar = this.A;
        ComponentTree componentTree = dmkVar.a;
        dmm dmmVar = dmkVar.b;
        lithoScrollView.d.G(componentTree);
        lithoScrollView.g = z3;
        lithoScrollView.e = dmmVar;
        djq djqVar = new djq(lithoScrollView, dmmVar);
        lithoScrollView.getViewTreeObserver().addOnPreDrawListener(djqVar);
        lithoScrollView.f = djqVar;
        if (dllVar != null) {
            lithoScrollView.h = new djb();
            lithoScrollView.h.a = dllVar;
        }
        lithoScrollView.setScrollbarFadingEnabled(true);
        lithoScrollView.setNestedScrollingEnabled(z2);
        lithoScrollView.setVerticalFadingEdgeEnabled(false);
        lithoScrollView.setFadingEdgeLength(0);
        lithoScrollView.setVerticalScrollBarEnabled(z);
        lithoScrollView.c = ncVar;
        lithoScrollView.setOverScrollMode(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final void W(cyv cyvVar, Object obj) {
        LithoScrollView lithoScrollView = (LithoScrollView) obj;
        lithoScrollView.c = null;
        lithoScrollView.d.J();
        lithoScrollView.d.G(null);
        lithoScrollView.e = null;
        lithoScrollView.getViewTreeObserver().removeOnPreDrawListener(lithoScrollView.f);
        lithoScrollView.f = null;
        djb djbVar = lithoScrollView.h;
        if (djbVar != null) {
            djbVar.a = null;
            lithoScrollView.h = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final void X(ddl ddlVar, ddl ddlVar2) {
        dmk dmkVar = (dmk) ddlVar;
        dmk dmkVar2 = (dmk) ddlVar2;
        dmkVar2.a = dmkVar.a;
        dmkVar2.b = dmkVar.b;
    }

    @Override // defpackage.czb
    public final boolean Y() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final boolean Z() {
        return true;
    }

    @Override // defpackage.czb
    public final boolean ab() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final boolean ac() {
        return true;
    }

    @Override // defpackage.czb
    public final boolean ag() {
        return true;
    }

    @Override // defpackage.czb
    protected final boolean ai(cyr cyrVar, cyr cyrVar2) {
        dml dmlVar = (dml) cyrVar;
        dml dmlVar2 = (dml) cyrVar2;
        Boolean bool = null;
        dad dadVar = new dad(dmlVar.a, dmlVar2 == null ? null : dmlVar2.a);
        dad dadVar2 = new dad(Boolean.valueOf(dmlVar.x), dmlVar2 == null ? null : Boolean.valueOf(dmlVar2.x));
        dad dadVar3 = new dad(true, dmlVar2 == null ? null : true);
        dad dadVar4 = new dad(Boolean.valueOf(dmlVar.c), dmlVar2 == null ? null : Boolean.valueOf(dmlVar2.c));
        dad dadVar5 = new dad(Boolean.valueOf(dmlVar.f), dmlVar2 == null ? null : Boolean.valueOf(dmlVar2.f));
        Boolean valueOf = Boolean.valueOf(dmlVar.d);
        if (dmlVar2 != null) {
            bool = Boolean.valueOf(dmlVar2.d);
        }
        dad dadVar6 = new dad(valueOf, bool);
        return !((cyr) dadVar.a).f((cyr) dadVar.b) || !((Boolean) dadVar2.a).equals(dadVar2.b) || !((Boolean) dadVar3.a).equals(dadVar3.b) || !((Boolean) dadVar4.a).equals(dadVar4.b) || !((Boolean) dadVar5.a).equals(dadVar5.b) || !((Boolean) dadVar6.a).equals(dadVar6.b);
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
        dml dmlVar = (dml) cyrVar;
        if (this.k == dmlVar.k) {
            return true;
        }
        cyr cyrVar2 = this.a;
        if (cyrVar2 == null ? dmlVar.a != null : !cyrVar2.f(dmlVar.a)) {
            return false;
        }
        if (this.b != dmlVar.b || this.c != dmlVar.c || this.d != dmlVar.d || this.e != dmlVar.e || this.f != dmlVar.f) {
            return false;
        }
        nc ncVar = this.g;
        if (ncVar == null ? dmlVar.g != null : !ncVar.equals(dmlVar.g)) {
            return false;
        }
        if (this.v != dmlVar.v) {
            return false;
        }
        dll dllVar = this.w;
        if (dllVar == null ? dmlVar.w != null : !dllVar.equals(dmlVar.w)) {
            return false;
        }
        if (this.x != dmlVar.x) {
            return false;
        }
        ComponentTree componentTree = this.A.a;
        if (componentTree == null ? dmlVar.A.a != null : !componentTree.equals(dmlVar.A.a)) {
            return false;
        }
        dmm dmmVar = this.A.b;
        dmm dmmVar2 = dmlVar.A.b;
        return dmmVar == null ? dmmVar2 == null : dmmVar.equals(dmmVar2);
    }

    @Override // defpackage.cyr, defpackage.dan
    public final /* bridge */ /* synthetic */ boolean f(Object obj) {
        return f((cyr) obj);
    }

    @Override // defpackage.cyr
    public final /* bridge */ /* synthetic */ cyr j() {
        dml dmlVar = (dml) super.j();
        cyr cyrVar = dmlVar.a;
        dmlVar.a = cyrVar != null ? cyrVar.j() : null;
        dmlVar.y = null;
        dmlVar.z = null;
        dmlVar.A = new dmk();
        return dmlVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cyr
    public final ddl m() {
        return this.A;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cyr
    public final void p(cyr cyrVar) {
        dml dmlVar = (dml) cyrVar;
        this.y = dmlVar.y;
        this.z = dmlVar.z;
    }
}
