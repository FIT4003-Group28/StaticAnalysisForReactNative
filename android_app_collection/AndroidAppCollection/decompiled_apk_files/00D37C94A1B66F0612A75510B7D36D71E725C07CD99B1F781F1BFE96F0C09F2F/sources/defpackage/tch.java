package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.rastermill.FrameSequenceDrawable;
import android.view.View;
import android.widget.ImageView;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: tch  reason: default package */
/* loaded from: classes4.dex */
public final class tch extends ctv {
    private final ddj c;
    private final tfl d;
    private final teb e;
    private final teh f;
    private boolean g;
    private final akcq h;
    private final aodt i;
    private final aodt j;
    private final aodt k;

    public tch(ddj ddjVar, ImageView imageView, aodt aodtVar, akcq akcqVar, aodt aodtVar2, aodt aodtVar3, tfl tflVar, teb tebVar, teh tehVar) {
        super(imageView);
        this.g = false;
        this.c = ddjVar;
        this.i = aodtVar;
        this.h = akcqVar;
        this.j = aodtVar2;
        this.k = aodtVar3;
        this.d = tflVar;
        this.e = tebVar;
        this.f = tehVar;
    }

    private final void p() {
        this.g = true;
        akcq akcqVar = this.h;
        if (akcqVar != null) {
            View view = this.a;
            aodt aodtVar = this.i;
            ddj ddjVar = this.c;
            ajmt a = ajmu.a();
            a.d = ajnb.a();
            ajmu a2 = a.a();
            aopa createBuilder = avhm.a.createBuilder();
            int i = ddjVar.a;
            createBuilder.copyOnWrite();
            avhm avhmVar = (avhm) createBuilder.instance;
            avhmVar.b |= 2;
            avhmVar.d = i;
            int i2 = ddjVar.b;
            createBuilder.copyOnWrite();
            avhm avhmVar2 = (avhm) createBuilder.instance;
            avhmVar2.b |= 4;
            avhmVar2.e = i2;
            axnb j = tgo.j(aodtVar, ddjVar.a, ddjVar.b);
            if (j != null && j.m() != null) {
                String m = j.m();
                createBuilder.copyOnWrite();
                avhm avhmVar3 = (avhm) createBuilder.instance;
                m.getClass();
                avhmVar3.b = 1 | avhmVar3.b;
                avhmVar3.c = m;
            }
            aopc aopcVar = (aopc) avhn.a.createBuilder();
            aopcVar.cw(createBuilder);
            akcqVar.a.d((ImageView) view, a2, (avhn) aopcVar.mo39build());
        }
    }

    private static void q(AnimatedImageDrawable animatedImageDrawable) {
        animatedImageDrawable.setRepeatCount(-1);
        animatedImageDrawable.start();
    }

    private final Drawable r(Drawable drawable, aodt aodtVar) {
        teh tehVar;
        if (drawable instanceof BitmapDrawable) {
            aodt aC = aodtVar.aC();
            int Y = aodtVar.Y();
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            ImageView.ScaleType m = tfo.m(Y);
            if (m == ImageView.ScaleType.CENTER_INSIDE) {
                m = ImageView.ScaleType.FIT_CENTER;
            }
            Drawable drawable2 = null;
            if (aC != null && (tehVar = this.f) != null) {
                drawable2 = tehVar.a(aC, bitmap, m);
            }
            drawable = drawable2 == null ? new srn(bitmap, m, this.e) : drawable2;
        } else if (drawable instanceof FrameSequenceDrawable) {
            FrameSequenceDrawable frameSequenceDrawable = (FrameSequenceDrawable) drawable;
            if (aodtVar.aC() != null && aodtVar.aC().T() == 154604025) {
                frameSequenceDrawable.setCornerRadius((int) tfo.g(axmp.aH(aodtVar.aC().V()).aG(), ((ImageView) this.a).getContext().getResources().getDisplayMetrics()));
            }
        }
        if (!(drawable instanceof srn)) {
            ((ImageView) this.a).setScaleType(tfo.m(aodtVar.Y()));
        }
        drawable.setAutoMirrored(aodtVar.ad());
        tfo.p(drawable, aodtVar);
        return drawable;
    }

    @Override // defpackage.ctv, defpackage.ctq, defpackage.ctz
    public final void a(Drawable drawable) {
        aodt aodtVar;
        akcq akcqVar = this.h;
        if (akcqVar != null) {
            akcqVar.a.c((ImageView) this.a, null, null);
        }
        if (drawable != null && (aodtVar = this.j) != null) {
            drawable = r(drawable, aodtVar);
        }
        super.a(drawable);
    }

    @Override // defpackage.ctv, defpackage.ctz
    public final /* bridge */ /* synthetic */ void b(Object obj, cug cugVar) {
        Drawable drawable = (Drawable) obj;
        if (!this.g) {
            p();
        }
        akcq akcqVar = this.h;
        if (akcqVar != null) {
            akcqVar.a.e((ImageView) this.a, null, null);
        }
        aodt aodtVar = this.i;
        if (aodtVar != null) {
            drawable = r(drawable, aodtVar);
        }
        super.b(drawable, cugVar);
        tfl tflVar = this.d;
        if (tflVar == null || !(drawable instanceof FrameSequenceDrawable)) {
            return;
        }
        tflVar.b((FrameSequenceDrawable) drawable);
        this.d.c();
    }

    @Override // defpackage.cuc, defpackage.ctz
    public final void d(cty ctyVar) {
        ddj ddjVar = this.c;
        ctyVar.g(ddjVar.a, ddjVar.b);
    }

    @Override // defpackage.ctv, defpackage.ctq, defpackage.ctz
    public final void e(Drawable drawable) {
        aodt aodtVar;
        if (!this.g) {
            p();
        }
        akcq akcqVar = this.h;
        if (akcqVar != null) {
            akcqVar.a.b((ImageView) this.a, null, null);
        }
        if (drawable != null && (aodtVar = this.k) != null) {
            drawable = r(drawable, aodtVar);
            if (Build.VERSION.SDK_INT >= 28 && (drawable instanceof AnimatedImageDrawable)) {
                q((AnimatedImageDrawable) drawable);
            }
        }
        super.e(drawable);
    }

    @Override // defpackage.ctv, defpackage.ctq, defpackage.ctz
    public final void f(Drawable drawable) {
        aodt aodtVar;
        p();
        if (drawable != null && (aodtVar = this.j) != null) {
            drawable = r(drawable, aodtVar);
            if (Build.VERSION.SDK_INT >= 28 && (drawable instanceof AnimatedImageDrawable)) {
                q((AnimatedImageDrawable) drawable);
            }
        }
        super.f(drawable);
    }

    @Override // defpackage.ctv
    protected final /* bridge */ /* synthetic */ void i(Object obj) {
        ((ImageView) this.a).setImageDrawable((Drawable) obj);
    }
}
