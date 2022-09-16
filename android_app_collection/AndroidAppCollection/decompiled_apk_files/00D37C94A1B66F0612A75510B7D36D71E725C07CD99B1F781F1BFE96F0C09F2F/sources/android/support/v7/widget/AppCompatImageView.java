package android.support.v7.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
/* compiled from: PG */
/* loaded from: classes.dex */
public class AppCompatImageView extends ImageView {
    private final ty a;
    private final uf b;

    public AppCompatImageView(Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        ty tyVar = this.a;
        if (tyVar != null) {
            tyVar.a();
        }
        uf ufVar = this.b;
        if (ufVar != null) {
            ufVar.a();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return this.b.d() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        ty tyVar = this.a;
        if (tyVar != null) {
            tyVar.e();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        ty tyVar = this.a;
        if (tyVar != null) {
            tyVar.c(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        uf ufVar = this.b;
        if (ufVar != null) {
            ufVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        uf ufVar = this.b;
        if (ufVar != null) {
            ufVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        uf ufVar = this.b;
        if (ufVar != null) {
            ufVar.c(i);
        }
    }

    @Override // android.widget.ImageView
    public final void setImageURI(Uri uri) {
        super.setImageURI(uri);
        uf ufVar = this.b;
        if (ufVar != null) {
            ufVar.a();
        }
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        aaa.a(context);
        zy.d(this, getContext());
        ty tyVar = new ty(this);
        this.a = tyVar;
        tyVar.b(attributeSet, i);
        uf ufVar = new uf(this);
        this.b = ufVar;
        ufVar.b(attributeSet, i);
    }
}
