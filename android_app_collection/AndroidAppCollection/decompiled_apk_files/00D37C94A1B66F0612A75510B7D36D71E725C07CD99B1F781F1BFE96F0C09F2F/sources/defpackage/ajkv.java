package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.widget.ImageView;
import com.google.android.youtube.R;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: ajkv  reason: default package */
/* loaded from: classes.dex */
public final class ajkv extends cyr {
    @dfs(a = 13)
    afts A;
    @dfs(a = 3)
    int B;
    Integer C;
    Integer D;
    afsk E;
    avhm F;
    Integer G;
    @dfs(a = 13)
    aodt H;
    @dfs(a = 13)
    aodt I;
    @dfs(a = 13)

    /* renamed from: J  reason: collision with root package name */
    aodt f58J;
    @dfs(a = 14)
    private ajku K;
    @dfs(a = 13)
    Boolean a;
    @dfs(a = 13)
    tfl b;
    @dfs(a = 13)
    snc c;
    @dfs(a = 13)
    tda d;
    @dfs(a = 13)
    Executor e;
    @dfs(a = 13)
    ajmm f;
    @dfs(a = 13)
    ajmy g;
    @dfs(a = 0)
    float v;
    @dfs(a = 13)
    teh w;
    @dfs(a = 3)
    int x;
    @dfs(a = 13)
    teb y;
    @dfs(a = 3)
    boolean z;

    public ajkv() {
        super("YouTubeImage");
        this.K = new ajku();
    }

    @Override // defpackage.czb
    protected final int F() {
        return 30;
    }

    @Override // defpackage.czb
    protected final Object L(Context context) {
        return new ajlb(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final void M(cyv cyvVar) {
        dcz dczVar = new dcz();
        dczVar.a = new AtomicReference(null);
        this.K.a = (AtomicReference) dczVar.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final void Q(cyv cyvVar, cyz cyzVar) {
        avhm v;
        double d;
        double d2;
        dcz dczVar = new dcz();
        dcz dczVar2 = new dcz();
        dcz dczVar3 = new dcz();
        dcz dczVar4 = new dcz();
        aodt aodtVar = this.f58J;
        int i = this.B;
        tfl tflVar = this.b;
        ajmm ajmmVar = this.f;
        aopc aopcVar = (aopc) avhn.a.createBuilder();
        for (int i2 = 0; i2 < aodtVar.aa(); i2++) {
            axnb ab = aodtVar.ab(i2);
            String m = ab.m();
            if (m != null) {
                aopa createBuilder = avhm.a.createBuilder();
                createBuilder.copyOnWrite();
                avhm avhmVar = (avhm) createBuilder.instance;
                avhmVar.b |= 1;
                avhmVar.c = m;
                long aH = ab.aH();
                createBuilder.copyOnWrite();
                avhm avhmVar2 = (avhm) createBuilder.instance;
                avhmVar2.b |= 2;
                avhmVar2.d = (int) aH;
                long aG = ab.aG();
                createBuilder.copyOnWrite();
                avhm avhmVar3 = (avhm) createBuilder.instance;
                avhmVar3.b |= 4;
                avhmVar3.e = (int) aG;
                aopcVar.cw(createBuilder);
            }
        }
        avhn avhnVar = (avhn) aopcVar.mo39build();
        dczVar3.a = Integer.valueOf(cyzVar.H());
        dczVar4.a = Integer.valueOf(cyzVar.C());
        if (avhnVar.c.size() > 0 && cyzVar.H() > 0 && cyzVar.C() > 0) {
            ImageView.ScaleType e = ajna.e(aodtVar.Y());
            int H = cyzVar.H();
            int C = cyzVar.C();
            if (i == 1) {
                v = akel.v(avhnVar, H, C);
            } else if (i != 2) {
                if (i != 3) {
                    v = akel.w(avhnVar, H, C);
                } else {
                    if (e == ImageView.ScaleType.CENTER_CROP && H != 0 && C != 0) {
                        if (H > C) {
                            d = H;
                            d2 = C;
                            Double.isNaN(d);
                            Double.isNaN(d2);
                        } else {
                            d = C;
                            d2 = H;
                            Double.isNaN(d);
                            Double.isNaN(d2);
                        }
                        if (d / d2 > 2.0d) {
                            v = akel.v(avhnVar, H, C);
                        }
                    }
                    v = akel.w(avhnVar, H, C);
                }
            } else if (e == ImageView.ScaleType.CENTER_CROP) {
                v = akel.v(avhnVar, H, C);
            } else {
                v = akel.w(avhnVar, H, C);
            }
            if (v != null) {
                dczVar.a = v;
                if (tflVar != null) {
                    dczVar2.a = (afsk) ajmmVar.b().a(ajks.c(Uri.parse(v.c)));
                }
            }
        }
        this.F = (avhm) dczVar.a;
        this.E = (afsk) dczVar2.a;
        this.G = (Integer) dczVar3.a;
        this.D = (Integer) dczVar4.a;
    }

    @Override // defpackage.czb
    public final void R(cyv cyvVar, cyz cyzVar, int i, int i2, ddj ddjVar) {
        float aH;
        aodt aodtVar = this.f58J;
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
        AtomicReference atomicReference;
        avhm avhmVar;
        aodt aodtVar;
        tda tdaVar;
        boolean z;
        boolean z2;
        final ajlb ajlbVar = (ajlb) obj;
        aodt aodtVar2 = this.f58J;
        aodt aodtVar3 = this.H;
        aodt aodtVar4 = this.I;
        Boolean bool = this.a;
        int i = this.x;
        ajmy ajmyVar = this.g;
        tfl tflVar = this.b;
        afts aftsVar = this.A;
        snc sncVar = this.c;
        ajmm ajmmVar = this.f;
        tda tdaVar2 = this.d;
        avhm avhmVar2 = this.F;
        this.G.intValue();
        this.D.intValue();
        afsk afskVar = this.E;
        this.C.intValue();
        teh tehVar = this.w;
        teb tebVar = this.y;
        boolean z3 = this.z;
        AtomicReference atomicReference2 = this.K.a;
        Context context = cyvVar.b;
        if (bool == null || !bool.booleanValue()) {
            atomicReference = atomicReference2;
        } else {
            atomicReference = atomicReference2;
            ajlbVar.setTag(R.id.elements_image, tfy.h(aodtVar2));
        }
        ajlbVar.d = aodtVar2;
        ajlbVar.b = tehVar;
        ajlbVar.c = tebVar;
        if (aodtVar2.aa() == 0 && aodtVar2.aC() != null) {
            ajlbVar.setImageBitmap(Bitmap.createBitmap(1, 1, Bitmap.Config.ALPHA_8));
            return;
        }
        if (avhmVar2 != null) {
            Uri j = zgt.j(avhmVar2.c);
            ajmt a = ajmu.a();
            a.d = ajnb.a();
            a.c(false);
            if (tflVar == null) {
                a.c = new ajla(context, aodtVar3, aodtVar4);
                ajmyVar.i(ajlbVar, j, a.a());
                aodtVar = aodtVar2;
                tdaVar = tdaVar2;
                avhmVar = avhmVar2;
                z2 = true;
                z = z3;
            } else {
                avhmVar = avhmVar2;
                tdaVar = tdaVar2;
                z = z3;
                ajks ajksVar = new ajks(aodtVar4, context, ajlbVar, tflVar, aftsVar, ajmmVar, sncVar, null, tebVar);
                atomicReference.set(ajksVar);
                if (aodtVar3 != null) {
                    aolu.t(aodtVar3, ajlbVar, context);
                }
                if (afskVar != null) {
                    ajksVar.d((Bitmap) afskVar.a);
                } else {
                    ajmyVar.m(j, ajksVar);
                }
                aodtVar = aodtVar2;
                z2 = true;
            }
        } else {
            avhmVar = avhmVar2;
            aodtVar = aodtVar2;
            tdaVar = tdaVar2;
            z = z3;
            int c = tbz.c(context, aodtVar);
            if (c > 0) {
                ajlbVar.setImageDrawable(gw.f(context.getResources(), c, null));
            } else {
                ampq c2 = tck.c(aodtVar);
                if (c2.h()) {
                    ajlbVar.setImageDrawable(tck.a(context, (byte[]) c2.c()));
                } else {
                    z2 = false;
                }
            }
            z2 = true;
        }
        if (avhmVar != null && i == 1) {
            ajlbVar.post(new Runnable() { // from class: ajky
                @Override // java.lang.Runnable
                public final void run() {
                    ajlb ajlbVar2 = ajlb.this;
                    if (ajlbVar2.getDrawable() == null) {
                        ajlbVar2.a = true;
                    }
                }
            });
        }
        if (!z || z2) {
            return;
        }
        int aa = aodtVar.aa();
        StringBuilder sb = new StringBuilder(207);
        sb.append("Failed to find a valid source for the image. Sources: ");
        sb.append(aa);
        sb.append(". Please make sure image source array is not empty and each image source has proper remote url / client resource name / serialized image data.");
        tebVar.c(23, sb.toString(), tdaVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final void V(cyv cyvVar) {
        dcz dczVar = new dcz();
        aodt aodtVar = this.f58J;
        dczVar.a = 0;
        if (aodtVar.aa() > 0 && aodtVar.ab(0).aI() != null) {
            dczVar.a = Integer.valueOf((int) aodtVar.ab(0).aI().r());
        }
        this.C = (Integer) dczVar.a;
        float f = this.v;
        if (f > 0.0f) {
            B(new tfp(f), cyvVar.f);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final void W(cyv cyvVar, Object obj) {
        ajlb ajlbVar = (ajlb) obj;
        ajmy ajmyVar = this.g;
        Boolean bool = this.a;
        tfl tflVar = this.b;
        AtomicReference atomicReference = this.K.a;
        ajmyVar.e(ajlbVar);
        ajks ajksVar = (ajks) atomicReference.getAndSet(null);
        if (ajksVar != null) {
            ajksVar.e();
        }
        if (bool != null && bool.booleanValue()) {
            ajlbVar.setTag(R.id.elements_image, null);
        }
        if (tflVar != null) {
            tflVar.d();
            tflVar.a();
        }
        ajlbVar.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final void X(ddl ddlVar, ddl ddlVar2) {
        ((ajku) ddlVar2).a = ((ajku) ddlVar).a;
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
    public final boolean ac() {
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
        ajkv ajkvVar = (ajkv) cyrVar;
        ajkv ajkvVar2 = (ajkv) cyrVar2;
        aodt aodtVar = null;
        dad dadVar = new dad(ajkvVar.f58J, ajkvVar2 == null ? null : ajkvVar2.f58J);
        dad dadVar2 = new dad(ajkvVar.H, ajkvVar2 == null ? null : ajkvVar2.H);
        aodt aodtVar2 = ajkvVar.I;
        if (ajkvVar2 != null) {
            aodtVar = ajkvVar2.I;
        }
        dad dadVar3 = new dad(aodtVar2, aodtVar);
        return !tfy.c((aodt) dadVar.b, (aodt) dadVar.a) || !tfy.c((aodt) dadVar2.b, (aodt) dadVar2.a) || !tfy.c((aodt) dadVar3.b, (aodt) dadVar3.a);
    }

    @Override // defpackage.czb
    public final int aj() {
        return 3;
    }

    @Override // defpackage.czb
    public final void al() {
        ajna.f(this.g, this.b, this.F, this.G.intValue(), this.D.intValue(), this.y, this.d, this.e);
    }

    @Override // defpackage.czb
    public final void am() {
    }

    @Override // defpackage.cyr
    public final boolean e(cyr cyrVar) {
        if (this == cyrVar) {
            return true;
        }
        if (cyrVar == null || getClass() != cyrVar.getClass()) {
            return false;
        }
        ajkv ajkvVar = (ajkv) cyrVar;
        if (this.k == ajkvVar.k) {
            return true;
        }
        Boolean bool = this.a;
        if (bool == null ? ajkvVar.a != null : !bool.equals(ajkvVar.a)) {
            return false;
        }
        tfl tflVar = this.b;
        if (tflVar == null ? ajkvVar.b != null : !tflVar.equals(ajkvVar.b)) {
            return false;
        }
        snc sncVar = this.c;
        if (sncVar == null ? ajkvVar.c != null : !sncVar.equals(ajkvVar.c)) {
            return false;
        }
        tda tdaVar = this.d;
        if (tdaVar == null ? ajkvVar.d != null : !tdaVar.equals(ajkvVar.d)) {
            return false;
        }
        aodt aodtVar = this.H;
        if (aodtVar == null ? ajkvVar.H != null : !aodtVar.equals(ajkvVar.H)) {
            return false;
        }
        aodt aodtVar2 = this.I;
        if (aodtVar2 == null ? ajkvVar.I != null : !aodtVar2.equals(ajkvVar.I)) {
            return false;
        }
        Executor executor = this.e;
        if (executor == null ? ajkvVar.e != null : !executor.equals(ajkvVar.e)) {
            return false;
        }
        aodt aodtVar3 = this.f58J;
        if (aodtVar3 == null ? ajkvVar.f58J != null : !aodtVar3.equals(ajkvVar.f58J)) {
            return false;
        }
        ajmm ajmmVar = this.f;
        if (ajmmVar == null ? ajkvVar.f != null : !ajmmVar.equals(ajkvVar.f)) {
            return false;
        }
        ajmy ajmyVar = this.g;
        if (ajmyVar == null ? ajkvVar.g != null : !ajmyVar.equals(ajkvVar.g)) {
            return false;
        }
        if (Float.compare(this.v, ajkvVar.v) != 0) {
            return false;
        }
        teh tehVar = this.w;
        if (tehVar == null ? ajkvVar.w != null : !tehVar.equals(ajkvVar.w)) {
            return false;
        }
        if (this.x != ajkvVar.x) {
            return false;
        }
        teb tebVar = this.y;
        if (tebVar == null ? ajkvVar.y != null : !tebVar.equals(ajkvVar.y)) {
            return false;
        }
        if (this.z != ajkvVar.z) {
            return false;
        }
        afts aftsVar = this.A;
        if (aftsVar == null ? ajkvVar.A != null : !aftsVar.equals(ajkvVar.A)) {
            return false;
        }
        if (this.B != ajkvVar.B) {
            return false;
        }
        AtomicReference atomicReference = this.K.a;
        AtomicReference atomicReference2 = ajkvVar.K.a;
        return atomicReference == null ? atomicReference2 == null : atomicReference.equals(atomicReference2);
    }

    @Override // defpackage.cyr, defpackage.dan
    public final /* bridge */ /* synthetic */ boolean f(Object obj) {
        return f((cyr) obj);
    }

    @Override // defpackage.cyr
    public final /* bridge */ /* synthetic */ cyr j() {
        ajkv ajkvVar = (ajkv) super.j();
        ajkvVar.C = null;
        ajkvVar.D = null;
        ajkvVar.E = null;
        ajkvVar.F = null;
        ajkvVar.G = null;
        ajkvVar.K = new ajku();
        return ajkvVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cyr
    public final ddl m() {
        return this.K;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cyr
    public final void p(cyr cyrVar) {
        ajkv ajkvVar = (ajkv) cyrVar;
        this.C = ajkvVar.C;
        this.D = ajkvVar.D;
        this.E = ajkvVar.E;
        this.F = ajkvVar.F;
        this.G = ajkvVar.G;
    }
}
