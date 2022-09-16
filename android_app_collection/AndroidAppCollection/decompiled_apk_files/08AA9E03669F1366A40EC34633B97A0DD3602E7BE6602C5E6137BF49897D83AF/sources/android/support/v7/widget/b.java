package android.support.v7.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
/* compiled from: ActionBarBackgroundDrawable.java */
/* loaded from: classes.dex */
class b extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    final ActionBarContainer f942a;

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public b(ActionBarContainer actionBarContainer) {
        this.f942a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f942a.f800d) {
            if (this.f942a.f799c == null) {
                return;
            }
            this.f942a.f799c.draw(canvas);
            return;
        }
        if (this.f942a.f797a != null) {
            this.f942a.f797a.draw(canvas);
        }
        if (this.f942a.f798b == null || !this.f942a.e) {
            return;
        }
        this.f942a.f798b.draw(canvas);
    }
}
