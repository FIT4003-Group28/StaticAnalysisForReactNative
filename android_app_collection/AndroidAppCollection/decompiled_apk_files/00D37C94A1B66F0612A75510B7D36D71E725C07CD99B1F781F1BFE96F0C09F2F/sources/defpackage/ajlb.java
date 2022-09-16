package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.support.rastermill.FrameSequenceDrawable;
import android.widget.ImageView;
/* compiled from: PG */
/* renamed from: ajlb  reason: default package */
/* loaded from: classes.dex */
public final class ajlb extends ImageView {
    public boolean a;
    public teh b;
    public teb c;
    public aodt d;

    public ajlb(Context context) {
        super(context);
        this.d = null;
        this.b = null;
        this.a = false;
    }

    private final Drawable d(Drawable drawable, aodt aodtVar) {
        drawable.setAutoMirrored(aodtVar.ad());
        int r = (aodtVar.aa() <= 0 || aodtVar.ab(0).aI() == null) ? 0 : (int) aodtVar.ab(0).aI().r();
        if (r != 0) {
            drawable.mutate().setColorFilter(r, PorterDuff.Mode.SRC_IN);
        }
        if (this.a) {
            TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{new ColorDrawable(0), drawable});
            transitionDrawable.startTransition(getResources().getInteger(17694720));
            return transitionDrawable;
        }
        return drawable;
    }

    public final void a() {
        super.setImageDrawable(null);
        this.b = null;
        this.d = null;
        this.a = false;
    }

    public final void b(Bitmap bitmap, aodt aodtVar) {
        teh tehVar;
        Drawable drawable = null;
        if (bitmap == null) {
            super.setImageDrawable(null);
            return;
        }
        ImageView.ScaleType e = ajna.e(aodtVar.Y());
        aodt aC = aodtVar.aC();
        if (e == ImageView.ScaleType.CENTER_INSIDE) {
            e = ImageView.ScaleType.FIT_CENTER;
        }
        if (aC != null && (tehVar = this.b) != null) {
            drawable = tehVar.a(aC, bitmap, e);
        }
        if (drawable == null) {
            drawable = new srn(bitmap, e, this.c);
        }
        super.setImageDrawable(d(drawable, aodtVar));
    }

    public final void c(Drawable drawable, aodt aodtVar) {
        if (drawable == null) {
            super.setImageDrawable(null);
        } else if (drawable instanceof BitmapDrawable) {
            b(((BitmapDrawable) drawable).getBitmap(), aodtVar);
        } else {
            if (drawable instanceof FrameSequenceDrawable) {
                FrameSequenceDrawable frameSequenceDrawable = (FrameSequenceDrawable) drawable;
                if (aodtVar.aC() != null && aodtVar.aC().T() == 154604025) {
                    frameSequenceDrawable.setCornerRadius((int) tfo.g(axmp.aH(aodtVar.aC().V()).aG(), getContext().getResources().getDisplayMetrics()));
                }
            }
            setScaleType(ajna.e(aodtVar.Y()));
            super.setImageDrawable(d(drawable, aodtVar));
        }
    }

    @Override // android.widget.ImageView
    public final void setImageBitmap(Bitmap bitmap) {
        aodt aodtVar = this.d;
        if (aodtVar == null && bitmap == null) {
            super.setImageBitmap(null);
        } else if (aodtVar == null) {
            this.c.b(28, "YouTubeImageView.setImage() was not called");
        } else {
            b(bitmap, aodtVar);
        }
    }

    @Override // android.widget.ImageView
    public final void setImageDrawable(Drawable drawable) {
        aodt aodtVar = this.d;
        if (aodtVar == null && drawable == null) {
            super.setImageDrawable(null);
        } else if (aodtVar == null) {
            this.c.b(28, "YouTubeImageView.setImage() was not called");
        } else {
            c(drawable, aodtVar);
        }
    }
}
