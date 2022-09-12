package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cvvq  reason: default package */
/* loaded from: classes5.dex */
public final class cvvq implements cvvk<Drawable> {
    public final ImageView a;
    public ObjectAnimator b = null;

    public cvvq(Context context) {
        this.a = (ImageView) LayoutInflater.from(context).inflate(R.layout.image_view_badge, (ViewGroup) null);
    }

    @Override // defpackage.cvvk
    public final void a(FrameLayout frameLayout) {
        frameLayout.removeView(this.a);
        od.U(frameLayout, null);
    }

    @Override // defpackage.cvvk
    public final /* bridge */ /* synthetic */ void b(Drawable drawable) {
        final Drawable drawable2 = drawable;
        final Drawable drawable3 = this.a.getDrawable();
        if (drawable3 == null || drawable3 == drawable2) {
            this.a.setImageDrawable(drawable2);
            return;
        }
        LayerDrawable layerDrawable = new LayerDrawable(drawable3, drawable2) { // from class: com.google.android.libraries.onegoogle.account.disc.DrawableBadgeViewHolder$AlphaLayerDrawable
            private final Drawable a;
            private final Drawable b;

            {
                super(new Drawable[]{drawable3, drawable2});
                this.a = drawable3;
                this.b = drawable2;
                drawable2.setCallback(this);
            }

            @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
            public int getAlpha() {
                return this.b.getAlpha();
            }

            @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
            public final int getOpacity() {
                return this.a.getOpacity();
            }

            @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable.Callback
            public final void invalidateDrawable(Drawable drawable4) {
                invalidateSelf();
            }

            @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable.Callback
            public final void scheduleDrawable(Drawable drawable4, Runnable runnable, long j) {
                scheduleSelf(runnable, j);
            }

            @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
            public void setAlpha(int i) {
                this.b.setAlpha(i);
                this.b.invalidateSelf();
            }

            @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
            public final void setColorFilter(ColorFilter colorFilter) {
                this.a.setColorFilter(colorFilter);
            }

            @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable.Callback
            public final void unscheduleDrawable(Drawable drawable4, Runnable runnable) {
                unscheduleSelf(runnable);
            }
        };
        ObjectAnimator duration = ObjectAnimator.ofInt(layerDrawable, "alpha", 0, 255).setDuration(this.a.getResources().getInteger(R.integer.og_decoration_transition_duration));
        duration.setInterpolator(new AccelerateInterpolator());
        duration.addListener(new cvvp(this, drawable2));
        ObjectAnimator objectAnimator = this.b;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.b = duration;
        this.a.setImageDrawable(layerDrawable);
        this.b.start();
    }
}
