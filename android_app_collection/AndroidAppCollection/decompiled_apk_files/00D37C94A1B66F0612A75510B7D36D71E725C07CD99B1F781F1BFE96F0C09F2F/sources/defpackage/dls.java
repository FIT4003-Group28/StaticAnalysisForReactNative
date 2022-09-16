package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.ImageSpan;
import android.view.View;
/* compiled from: PG */
/* renamed from: dls  reason: default package */
/* loaded from: classes3.dex */
public final class dls extends cyr {
    @dfs(a = 0)
    public float A;
    @dfs(a = 3)
    public boolean B;
    @dfs(a = 13)
    public CharSequence C;
    @dfs(a = 13)
    final ColorStateList D;
    @dfs(a = 3)
    public int E;
    @dfs(a = 3)
    final int F;
    @dfs(a = 3)
    public boolean G;
    @dfs(a = 13)
    final Typeface H;
    ClickableSpan[] I;

    /* renamed from: J  reason: collision with root package name */
    Layout f177J;
    ImageSpan[] K;
    Layout L;
    Integer M;
    Float N;
    Integer O;
    CharSequence P;
    Layout Q;
    Float R;
    @dfs(a = 13)
    int S;
    @dfs(a = 13)
    final int T;
    @dfs(a = 13)
    public swe U;
    @dfs(a = 3)
    public boolean a;
    @dfs(a = 3)
    public int b;
    @dfs(a = 3)
    public boolean c;
    @dfs(a = 13)
    public CharSequence d;
    @dfs(a = 13)
    TextUtils.TruncateAt e;
    @dfs(a = 3)
    public boolean f;
    @dfs(a = 0)
    public float g;
    @dfs(a = 3)
    public int v;
    @dfs(a = 3)
    public int w;
    @dfs(a = 3)
    public int x;
    @dfs(a = 0)
    public float y;
    @dfs(a = 0)
    public float z;

    public dls() {
        super("Text");
        this.b = 0;
        this.c = true;
        this.v = -16776961;
        this.w = Integer.MAX_VALUE;
        this.x = -7829368;
        this.B = true;
        this.D = dmf.a;
        this.E = -1;
        this.F = dmf.b;
        this.H = dmf.c;
        this.T = dmf.d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final int D(int i, int i2) {
        return dmf.a(i, i2, this.C, this.Q, this.I);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final int E() {
        return dmf.b(this.a, this.I);
    }

    @Override // defpackage.czb
    protected final int F() {
        return 30;
    }

    @Override // defpackage.czb
    protected final Object L(Context context) {
        return dmf.d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final void Q(cyv cyvVar, cyz cyzVar) {
        dcz dczVar = new dcz();
        dcz dczVar2 = new dcz();
        dcz dczVar3 = new dcz();
        dcz dczVar4 = new dcz();
        dcz dczVar5 = new dcz();
        dmf.f(cyvVar, cyzVar, this.C, this.e, this.B, this.w, this.A, this.y, this.z, this.x, this.D, this.v, this.E, this.g, this.T, this.F, this.H, this.S, this.b, this.d, this.f, this.G, this.f177J, this.L, this.O, this.M, dczVar, dczVar2, dczVar3, dczVar4, dczVar5);
        this.P = (CharSequence) dczVar.a;
        this.Q = (Layout) dczVar2.a;
        this.R = (Float) dczVar3.a;
        this.I = (ClickableSpan[]) dczVar4.a;
        this.K = (ImageSpan[]) dczVar5.a;
    }

    @Override // defpackage.czb
    public final void R(cyv cyvVar, cyz cyzVar, int i, int i2, ddj ddjVar) {
        dcz dczVar = new dcz();
        dcz dczVar2 = new dcz();
        dcz dczVar3 = new dcz();
        dcz dczVar4 = new dcz();
        dcz dczVar5 = new dcz();
        dmf.g(cyvVar, cyzVar, i, i2, ddjVar, this.C, this.e, this.B, this.w, this.A, this.y, this.z, this.x, this.D, this.v, this.E, this.d, this.g, this.F, this.H, this.S, this.b, dczVar, dczVar2, dczVar3, dczVar4, dczVar5);
        this.L = (Layout) dczVar.a;
        this.f177J = (Layout) dczVar2.a;
        this.O = (Integer) dczVar3.a;
        this.M = (Integer) dczVar4.a;
        this.N = (Float) dczVar5.a;
    }

    @Override // defpackage.czb
    protected final void S(cyv cyvVar, Object obj) {
        dmf.h(cyvVar, (dlw) obj, this.D, this.c, this.U, this.P, this.Q, this.R, this.I, this.K);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final void T(View view, mh mhVar) {
        dmf.i(view, mhVar, this.C);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final void U(mh mhVar, int i, int i2, int i3) {
        dmf.c(mhVar, i, i2, i3, this.C, this.Q, this.I);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final void W(cyv cyvVar, Object obj) {
        dmf.e((dlw) obj, this.C);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final boolean Z() {
        return true;
    }

    @Override // defpackage.czb
    public final boolean ad() {
        return true;
    }

    @Override // defpackage.czb
    public final boolean ae() {
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
    public final int aj() {
        return 2;
    }

    @Override // defpackage.cyr
    public final boolean e(cyr cyrVar) {
        if (this == cyrVar) {
            return true;
        }
        if (cyrVar == null || getClass() != cyrVar.getClass()) {
            return false;
        }
        dls dlsVar = (dls) cyrVar;
        if (this.k == dlsVar.k) {
            return true;
        }
        if (this.a != dlsVar.a) {
            return false;
        }
        int i = this.S;
        if (i == 0 ? dlsVar.S != 0 : i != dlsVar.S) {
            return false;
        }
        if (this.b != dlsVar.b || Float.compare(0.0f, 0.0f) != 0 || this.c != dlsVar.c) {
            return false;
        }
        CharSequence charSequence = this.d;
        if (charSequence == null ? dlsVar.d != null : !charSequence.equals(dlsVar.d)) {
            return false;
        }
        TextUtils.TruncateAt truncateAt = this.e;
        if (truncateAt == null ? dlsVar.e != null : !truncateAt.equals(dlsVar.e)) {
            return false;
        }
        if (this.f != dlsVar.f || Float.compare(this.g, dlsVar.g) != 0 || Float.compare(0.0f, 0.0f) != 0 || Float.compare(Float.MAX_VALUE, Float.MAX_VALUE) != 0 || this.v != dlsVar.v || this.w != dlsVar.w || this.x != dlsVar.x || Float.compare(this.y, dlsVar.y) != 0 || Float.compare(this.z, dlsVar.z) != 0 || Float.compare(this.A, dlsVar.A) != 0 || this.B != dlsVar.B || Float.compare(1.0f, 1.0f) != 0) {
            return false;
        }
        CharSequence charSequence2 = this.C;
        if (charSequence2 == null ? dlsVar.C != null : !charSequence2.equals(dlsVar.C)) {
            return false;
        }
        ColorStateList colorStateList = this.D;
        if (colorStateList == null ? dlsVar.D != null : !colorStateList.equals(dlsVar.D)) {
            return false;
        }
        swe sweVar = this.U;
        if (sweVar == null ? dlsVar.U != null : !sweVar.equals(dlsVar.U)) {
            return false;
        }
        if (this.E != dlsVar.E || this.F != dlsVar.F || this.G != dlsVar.G) {
            return false;
        }
        Typeface typeface = this.H;
        if (typeface == null ? dlsVar.H != null : !typeface.equals(dlsVar.H)) {
            return false;
        }
        int i2 = this.T;
        int i3 = dlsVar.T;
        return i2 == 0 ? i3 == 0 : i3 == 1;
    }

    @Override // defpackage.cyr, defpackage.dan
    public final /* bridge */ /* synthetic */ boolean f(Object obj) {
        return f((cyr) obj);
    }

    @Override // defpackage.cyr
    public final /* bridge */ /* synthetic */ cyr j() {
        dls dlsVar = (dls) super.j();
        dlsVar.I = null;
        dlsVar.f177J = null;
        dlsVar.K = null;
        dlsVar.L = null;
        dlsVar.M = null;
        dlsVar.N = null;
        dlsVar.O = null;
        dlsVar.P = null;
        dlsVar.Q = null;
        dlsVar.R = null;
        return dlsVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cyr
    public final void p(cyr cyrVar) {
        dls dlsVar = (dls) cyrVar;
        this.I = dlsVar.I;
        this.f177J = dlsVar.f177J;
        this.K = dlsVar.K;
        this.L = dlsVar.L;
        this.M = dlsVar.M;
        this.N = dlsVar.N;
        this.O = dlsVar.O;
        this.P = dlsVar.P;
        this.Q = dlsVar.Q;
        this.R = dlsVar.R;
    }
}
