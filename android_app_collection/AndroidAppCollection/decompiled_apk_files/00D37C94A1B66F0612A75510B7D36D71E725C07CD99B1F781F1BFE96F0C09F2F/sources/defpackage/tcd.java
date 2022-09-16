package defpackage;

import android.content.Context;
import android.widget.ImageView;
/* compiled from: PG */
/* renamed from: tcd  reason: default package */
/* loaded from: classes4.dex */
public final class tcd extends cyr {
    public static final /* synthetic */ int C = 0;
    @dfs(a = 13)
    aodt A;
    @dfs(a = 13)
    aodt B;
    @dfs(a = 13)
    Boolean a;
    @dfs(a = 13)
    tfl b;
    @dfs(a = 13)
    tda c;
    @dfs(a = 0)
    float d;
    @dfs(a = 13)
    teh e;
    @dfs(a = 3)
    int f;
    @dfs(a = 13)
    teb g;
    @dfs(a = 3)
    boolean v;
    cgd w;
    ddj x;
    @dfs(a = 13)
    akcq y;
    @dfs(a = 13)
    aodt z;

    public tcd() {
        super("GlideImage");
    }

    @Override // defpackage.czb
    protected final int F() {
        return 30;
    }

    @Override // defpackage.czb
    protected final Object L(Context context) {
        return tcj.a(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final void Q(cyv cyvVar, cyz cyzVar) {
        dcz dczVar = new dcz();
        dcz dczVar2 = new dcz();
        tcj.d(cyvVar, cyzVar, this.B, this.f, this.z, this.A, dczVar, dczVar2);
        this.w = (cgd) dczVar.a;
        this.x = (ddj) dczVar2.a;
    }

    @Override // defpackage.czb
    public final void R(cyv cyvVar, cyz cyzVar, int i, int i2, ddj ddjVar) {
        float aH;
        aodt aodtVar = this.B;
        int i3 = tcj.a;
        if (aodtVar.aa() == 0) {
            aH = 1.0f;
        } else {
            axnb ab = aodtVar.ab(0);
            aH = ((float) ab.aH()) / ((float) ab.aG());
        }
        dnt.g(i, i2, aH, ddjVar);
    }

    @Override // defpackage.czb
    protected final void S(cyv cyvVar, Object obj) {
        tcj.f(cyvVar, (ImageView) obj, this.B, this.z, this.A, this.y, this.a, this.c, this.b, this.w, this.x, this.g, this.e, this.v);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final void V(cyv cyvVar) {
        int i = tcj.a;
        tcj.b(cyvVar, this.d);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final void W(cyv cyvVar, Object obj) {
        tcj.g(cyvVar, (ImageView) obj, this.a, this.b);
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

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final boolean af() {
        return true;
    }

    @Override // defpackage.czb
    public final boolean ag() {
        return true;
    }

    @Override // defpackage.czb
    protected final boolean ai(cyr cyrVar, cyr cyrVar2) {
        tcd tcdVar = (tcd) cyrVar;
        tcd tcdVar2 = (tcd) cyrVar2;
        aodt aodtVar = null;
        dad dadVar = new dad(tcdVar.B, tcdVar2 == null ? null : tcdVar2.B);
        dad dadVar2 = new dad(tcdVar.z, tcdVar2 == null ? null : tcdVar2.z);
        aodt aodtVar2 = tcdVar.A;
        if (tcdVar2 != null) {
            aodtVar = tcdVar2.A;
        }
        return tcj.c(dadVar, dadVar2, new dad(aodtVar2, aodtVar));
    }

    @Override // defpackage.czb
    public final int aj() {
        return 3;
    }

    @Override // defpackage.czb
    public final void al() {
        tcj.e(this.w, this.x, this.B);
    }

    @Override // defpackage.czb
    public final void am() {
        int i = tcj.a;
    }

    @Override // defpackage.cyr
    public final boolean e(cyr cyrVar) {
        if (this == cyrVar) {
            return true;
        }
        if (cyrVar == null || getClass() != cyrVar.getClass()) {
            return false;
        }
        tcd tcdVar = (tcd) cyrVar;
        if (this.k == tcdVar.k) {
            return true;
        }
        Boolean bool = this.a;
        if (bool == null ? tcdVar.a != null : !bool.equals(tcdVar.a)) {
            return false;
        }
        tfl tflVar = this.b;
        if (tflVar == null ? tcdVar.b != null : !tflVar.equals(tcdVar.b)) {
            return false;
        }
        tda tdaVar = this.c;
        if (tdaVar == null ? tcdVar.c != null : !tdaVar.equals(tcdVar.c)) {
            return false;
        }
        aodt aodtVar = this.z;
        if (aodtVar == null ? tcdVar.z != null : !aodtVar.equals(tcdVar.z)) {
            return false;
        }
        aodt aodtVar2 = this.A;
        if (aodtVar2 == null ? tcdVar.A != null : !aodtVar2.equals(tcdVar.A)) {
            return false;
        }
        aodt aodtVar3 = this.B;
        if (aodtVar3 == null ? tcdVar.B != null : !aodtVar3.equals(tcdVar.B)) {
            return false;
        }
        akcq akcqVar = this.y;
        if (akcqVar == null ? tcdVar.y != null : !akcqVar.equals(tcdVar.y)) {
            return false;
        }
        if (Float.compare(this.d, tcdVar.d) != 0) {
            return false;
        }
        teh tehVar = this.e;
        if (tehVar == null ? tcdVar.e != null : !tehVar.equals(tcdVar.e)) {
            return false;
        }
        if (this.f != tcdVar.f) {
            return false;
        }
        teb tebVar = this.g;
        if (tebVar == null ? tcdVar.g != null : !tebVar.equals(tcdVar.g)) {
            return false;
        }
        return this.v == tcdVar.v;
    }

    @Override // defpackage.cyr, defpackage.dan
    public final /* bridge */ /* synthetic */ boolean f(Object obj) {
        return f((cyr) obj);
    }

    @Override // defpackage.cyr
    public final /* bridge */ /* synthetic */ cyr j() {
        tcd tcdVar = (tcd) super.j();
        tcdVar.w = null;
        tcdVar.x = null;
        return tcdVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cyr
    public final void p(cyr cyrVar) {
        tcd tcdVar = (tcd) cyrVar;
        this.w = tcdVar.w;
        this.x = tcdVar.x;
    }
}
