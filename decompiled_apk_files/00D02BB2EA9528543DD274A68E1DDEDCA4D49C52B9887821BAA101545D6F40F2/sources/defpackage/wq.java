package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatImageView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: wq  reason: default package */
/* loaded from: classes7.dex */
public final class wq extends AppCompatImageView implements wu {
    final /* synthetic */ wt a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wq(wt wtVar, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.a = wtVar;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        afb.a(this, getContentDescription());
        setOnTouchListener(new wp(this, this));
    }

    @Override // defpackage.wu
    public final boolean d() {
        return false;
    }

    @Override // defpackage.wu
    public final boolean e() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.a.j();
        return true;
    }

    @Override // android.widget.ImageView
    protected final boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int max = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            background.setHotspotBounds(paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
        }
        return frame;
    }
}