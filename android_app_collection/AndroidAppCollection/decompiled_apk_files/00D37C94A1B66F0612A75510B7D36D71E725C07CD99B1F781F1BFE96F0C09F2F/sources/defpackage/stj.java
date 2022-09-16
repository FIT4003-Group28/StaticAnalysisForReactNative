package defpackage;

import android.content.Context;
import com.airbnb.lottie.LottieAnimationView;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: stj  reason: default package */
/* loaded from: classes4.dex */
public final class stj extends cyr {
    @dfs(a = 13)
    tcu a;
    @dfs(a = 13)
    tda b;
    @dfs(a = 13)
    String c;
    @dfs(a = 13)
    teb d;
    @dfs(a = 13)
    tfw e;
    @dfs(a = 13)
    tfw f;
    @dfs(a = 13)
    axmm g;
    bxt v;
    @dfs(a = 13)
    suc w;

    public stj() {
        super("AnimatedType");
    }

    @Override // defpackage.czb
    protected final int F() {
        return 3;
    }

    @Override // defpackage.czb
    protected final Object L(Context context) {
        return stq.a(context);
    }

    @Override // defpackage.czb
    protected final void S(cyv cyvVar, Object obj) {
        stq.d(cyvVar, (LottieAnimationView) obj, this.v, this.a, this.b, this.w, this.g, this.e, this.f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final void V(cyv cyvVar) {
        dcz dczVar = new dcz();
        stq.b(cyvVar, this.g, dczVar);
        this.v = (bxt) dczVar.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final void W(cyv cyvVar, Object obj) {
        stq.e((LottieAnimationView) obj, this.w);
    }

    @Override // defpackage.czb
    public final boolean Y() {
        return true;
    }

    @Override // defpackage.czb
    public final boolean ag() {
        return true;
    }

    @Override // defpackage.czb
    protected final boolean ai(cyr cyrVar, cyr cyrVar2) {
        stj stjVar = (stj) cyrVar;
        stj stjVar2 = (stj) cyrVar2;
        String str = null;
        dad dadVar = new dad(stjVar.g, stjVar2 == null ? null : stjVar2.g);
        String str2 = stjVar.c;
        if (stjVar2 != null) {
            str = stjVar2.c;
        }
        return stq.c(dadVar, new dad(str2, str));
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
        stj stjVar = (stj) cyrVar;
        if (this.k == stjVar.k) {
            return true;
        }
        tcu tcuVar = this.a;
        if (tcuVar == null ? stjVar.a != null : !tcuVar.equals(stjVar.a)) {
            return false;
        }
        tda tdaVar = this.b;
        if (tdaVar == null ? stjVar.b != null : !tdaVar.equals(stjVar.b)) {
            return false;
        }
        suc sucVar = this.w;
        if (sucVar == null ? stjVar.w != null : !sucVar.equals(stjVar.w)) {
            return false;
        }
        String str = this.c;
        if (str == null ? stjVar.c != null : !str.equals(stjVar.c)) {
            return false;
        }
        teb tebVar = this.d;
        if (tebVar == null ? stjVar.d != null : !tebVar.equals(stjVar.d)) {
            return false;
        }
        tfw tfwVar = this.e;
        if (tfwVar == null ? stjVar.e != null : !tfwVar.equals(stjVar.e)) {
            return false;
        }
        tfw tfwVar2 = this.f;
        if (tfwVar2 == null ? stjVar.f != null : !tfwVar2.equals(stjVar.f)) {
            return false;
        }
        axmm axmmVar = this.g;
        return axmmVar == null ? stjVar.g == null : axmmVar.equals(stjVar.g);
    }

    @Override // defpackage.cyr, defpackage.dan
    public final /* bridge */ /* synthetic */ boolean f(Object obj) {
        return f((cyr) obj);
    }

    @Override // defpackage.cyr
    public final /* bridge */ /* synthetic */ cyr j() {
        stj stjVar = (stj) super.j();
        stjVar.v = null;
        return stjVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cyr
    public final void p(cyr cyrVar) {
        this.v = ((stj) cyrVar).v;
    }
}
