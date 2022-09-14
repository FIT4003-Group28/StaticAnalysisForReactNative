package android.support.v4.b.a;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.b.a.d;
/* compiled from: WrappedDrawableApi19.java */
/* loaded from: classes.dex */
class e extends d {
    /* JADX INFO: Access modifiers changed from: package-private */
    public e(Drawable drawable) {
        super(drawable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(d.a aVar, Resources resources) {
        super(aVar, resources);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        this.f355c.setAutoMirrored(z);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f355c.isAutoMirrored();
    }

    @Override // android.support.v4.b.a.d
    d.a b() {
        return new a(this.f354b, null);
    }

    /* compiled from: WrappedDrawableApi19.java */
    /* loaded from: classes.dex */
    private static class a extends d.a {
        a(d.a aVar, Resources resources) {
            super(aVar, resources);
        }

        @Override // android.support.v4.b.a.d.a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new e(this, resources);
        }
    }
}
