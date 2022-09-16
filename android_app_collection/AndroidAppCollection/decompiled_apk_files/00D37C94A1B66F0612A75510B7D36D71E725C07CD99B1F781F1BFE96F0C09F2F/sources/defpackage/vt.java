package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
/* compiled from: PG */
/* renamed from: vt  reason: default package */
/* loaded from: classes4.dex */
final class vt extends qa {
    public boolean b;

    public vt(Drawable drawable) {
        super(drawable);
        this.b = true;
    }

    @Override // defpackage.qa, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.b) {
            super.draw(canvas);
        }
    }

    @Override // defpackage.qa, android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f2) {
        if (this.b) {
            super.setHotspot(f, f2);
        }
    }

    @Override // defpackage.qa, android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        if (this.b) {
            super.setHotspotBounds(i, i2, i3, i4);
        }
    }

    @Override // defpackage.qa, android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        if (this.b) {
            return super.setState(iArr);
        }
        return false;
    }

    @Override // defpackage.qa, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        if (this.b) {
            return super.setVisible(z, z2);
        }
        return false;
    }
}
