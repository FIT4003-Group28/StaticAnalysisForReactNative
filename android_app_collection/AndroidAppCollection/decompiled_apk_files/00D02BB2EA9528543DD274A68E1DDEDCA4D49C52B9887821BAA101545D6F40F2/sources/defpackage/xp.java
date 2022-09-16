package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.widget.ProgressBar;
/* compiled from: PG */
/* renamed from: xp  reason: default package */
/* loaded from: classes7.dex */
class xp {
    private static final int[] b = {16843067, 16843068};
    public Bitmap a;
    private final ProgressBar c;

    public xp(ProgressBar progressBar) {
        this.c = progressBar;
    }

    private final Drawable b(Drawable drawable, boolean z) {
        if (drawable instanceof ku) {
            ku kuVar = (ku) drawable;
            Drawable drawable2 = kuVar.c;
            if (drawable2 != null) {
                kuVar.a(b(drawable2, z));
            }
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i = 0; i < numberOfLayers; i++) {
                int id = layerDrawable.getId(i);
                drawableArr[i] = b(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i2 = 0; i2 < numberOfLayers; i2++) {
                layerDrawable2.setId(i2, layerDrawable.getId(i2));
            }
            return layerDrawable2;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (this.a == null) {
                this.a = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        return drawable;
    }

    public void a(AttributeSet attributeSet, int i) {
        aeq b2 = aeq.b(this.c.getContext(), attributeSet, b, i, 0);
        Drawable e = b2.e(0);
        if (e != null) {
            ProgressBar progressBar = this.c;
            if (e instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) e;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                AnimationDrawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i2 = 0; i2 < numberOfFrames; i2++) {
                    Drawable b3 = b(animationDrawable.getFrame(i2), true);
                    b3.setLevel(10000);
                    animationDrawable2.addFrame(b3, animationDrawable.getDuration(i2));
                }
                animationDrawable2.setLevel(10000);
                e = animationDrawable2;
            }
            progressBar.setIndeterminateDrawable(e);
        }
        Drawable e2 = b2.e(1);
        if (e2 != null) {
            this.c.setProgressDrawable(b(e2, false));
        }
        b2.q();
    }
}
