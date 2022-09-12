package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
/* compiled from: PG */
/* renamed from: zf  reason: default package */
/* loaded from: classes7.dex */
final class zf extends sx {
    public boolean b;

    public zf(Drawable drawable) {
        super(drawable);
        this.b = true;
    }

    @Override // defpackage.sx, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.b) {
            super.draw(canvas);
        }
    }

    @Override // defpackage.sx, android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f2) {
        if (this.b) {
            super.setHotspot(f, f2);
        }
    }

    @Override // defpackage.sx, android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        if (this.b) {
            super.setHotspotBounds(i, i2, i3, i4);
        }
    }

    @Override // defpackage.sx, android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        if (this.b) {
            return super.setState(iArr);
        }
        return false;
    }

    @Override // defpackage.sx, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        if (this.b) {
            return super.setVisible(z, z2);
        }
        return false;
    }
}
