package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.ActionBarContainer;
/* compiled from: PG */
/* renamed from: wf  reason: default package */
/* loaded from: classes7.dex */
public final class wf extends Drawable {
    final ActionBarContainer a;

    public wf(ActionBarContainer actionBarContainer) {
        this.a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.a;
        if (actionBarContainer.e) {
            Drawable drawable = actionBarContainer.d;
            if (drawable == null) {
                return;
            }
            drawable.draw(canvas);
            return;
        }
        Drawable drawable2 = actionBarContainer.b;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.a;
        Drawable drawable3 = actionBarContainer2.c;
        if (drawable3 == null || !actionBarContainer2.f) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.a;
        if (actionBarContainer.e) {
            Drawable drawable = actionBarContainer.d;
            if (drawable == null) {
                return;
            }
            drawable.getOutline(outline);
            return;
        }
        Drawable drawable2 = actionBarContainer.b;
        if (drawable2 == null) {
            return;
        }
        drawable2.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
