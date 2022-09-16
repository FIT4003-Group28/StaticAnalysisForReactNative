package c.e.a.c.y;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import c.e.a.c.a0.g;
import c.e.a.c.a0.k;
import c.e.a.c.a0.n;
/* loaded from: classes.dex */
public class a extends Drawable implements n, androidx.core.graphics.drawable.b {

    /* renamed from: b  reason: collision with root package name */
    private b f4801b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        g f4802a;

        /* renamed from: b  reason: collision with root package name */
        boolean f4803b;

        public b(g gVar) {
            this.f4802a = gVar;
            this.f4803b = false;
        }

        public b(b bVar) {
            this.f4802a = (g) bVar.f4802a.getConstantState().newDrawable();
            this.f4803b = bVar.f4803b;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public a newDrawable() {
            return new a(new b(this));
        }
    }

    public a(k kVar) {
        this(new b(new g(kVar)));
    }

    private a(b bVar) {
        this.f4801b = bVar;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        b bVar = this.f4801b;
        if (bVar.f4803b) {
            bVar.f4802a.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f4801b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f4801b.f4802a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable mutate() {
        mo164mutate();
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    /* renamed from: mutate  reason: collision with other method in class */
    public a mo164mutate() {
        this.f4801b = new b(this.f4801b);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f4801b.f4802a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.f4801b.f4802a.setState(iArr)) {
            onStateChange = true;
        }
        boolean a2 = c.e.a.c.y.b.a(iArr);
        b bVar = this.f4801b;
        if (bVar.f4803b != a2) {
            bVar.f4803b = a2;
            return true;
        }
        return onStateChange;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f4801b.f4802a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f4801b.f4802a.setColorFilter(colorFilter);
    }

    @Override // c.e.a.c.a0.n
    public void setShapeAppearanceModel(k kVar) {
        this.f4801b.f4802a.setShapeAppearanceModel(kVar);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTint(int i) {
        this.f4801b.f4802a.setTint(i);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintList(ColorStateList colorStateList) {
        this.f4801b.f4802a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintMode(PorterDuff.Mode mode) {
        this.f4801b.f4802a.setTintMode(mode);
    }
}
