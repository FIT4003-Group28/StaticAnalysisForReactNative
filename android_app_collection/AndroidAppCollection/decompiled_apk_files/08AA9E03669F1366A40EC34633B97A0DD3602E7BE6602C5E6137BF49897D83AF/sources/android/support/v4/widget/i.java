package android.support.v4.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;
/* compiled from: ImageViewCompat.java */
/* loaded from: classes.dex */
public class i {

    /* renamed from: a  reason: collision with root package name */
    static final b f673a;

    /* compiled from: ImageViewCompat.java */
    /* loaded from: classes.dex */
    interface b {
        ColorStateList a(ImageView imageView);

        void a(ImageView imageView, ColorStateList colorStateList);

        void a(ImageView imageView, PorterDuff.Mode mode);

        PorterDuff.Mode b(ImageView imageView);
    }

    /* compiled from: ImageViewCompat.java */
    /* loaded from: classes.dex */
    static class a implements b {
        a() {
        }

        @Override // android.support.v4.widget.i.b
        public ColorStateList a(ImageView imageView) {
            if (imageView instanceof o) {
                return ((o) imageView).getSupportImageTintList();
            }
            return null;
        }

        @Override // android.support.v4.widget.i.b
        public void a(ImageView imageView, ColorStateList colorStateList) {
            if (imageView instanceof o) {
                ((o) imageView).setSupportImageTintList(colorStateList);
            }
        }

        @Override // android.support.v4.widget.i.b
        public void a(ImageView imageView, PorterDuff.Mode mode) {
            if (imageView instanceof o) {
                ((o) imageView).setSupportImageTintMode(mode);
            }
        }

        @Override // android.support.v4.widget.i.b
        public PorterDuff.Mode b(ImageView imageView) {
            if (imageView instanceof o) {
                return ((o) imageView).getSupportImageTintMode();
            }
            return null;
        }
    }

    /* compiled from: ImageViewCompat.java */
    /* loaded from: classes.dex */
    static class c extends a {
        c() {
        }

        @Override // android.support.v4.widget.i.a, android.support.v4.widget.i.b
        public ColorStateList a(ImageView imageView) {
            return imageView.getImageTintList();
        }

        @Override // android.support.v4.widget.i.a, android.support.v4.widget.i.b
        public void a(ImageView imageView, ColorStateList colorStateList) {
            imageView.setImageTintList(colorStateList);
            if (Build.VERSION.SDK_INT == 21) {
                Drawable drawable = imageView.getDrawable();
                boolean z = (imageView.getImageTintList() == null || imageView.getImageTintMode() == null) ? false : true;
                if (drawable == null || !z) {
                    return;
                }
                if (drawable.isStateful()) {
                    drawable.setState(imageView.getDrawableState());
                }
                imageView.setImageDrawable(drawable);
            }
        }

        @Override // android.support.v4.widget.i.a, android.support.v4.widget.i.b
        public void a(ImageView imageView, PorterDuff.Mode mode) {
            imageView.setImageTintMode(mode);
            if (Build.VERSION.SDK_INT == 21) {
                Drawable drawable = imageView.getDrawable();
                boolean z = (imageView.getImageTintList() == null || imageView.getImageTintMode() == null) ? false : true;
                if (drawable == null || !z) {
                    return;
                }
                if (drawable.isStateful()) {
                    drawable.setState(imageView.getDrawableState());
                }
                imageView.setImageDrawable(drawable);
            }
        }

        @Override // android.support.v4.widget.i.a, android.support.v4.widget.i.b
        public PorterDuff.Mode b(ImageView imageView) {
            return imageView.getImageTintMode();
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 21) {
            f673a = new c();
        } else {
            f673a = new a();
        }
    }

    public static ColorStateList a(ImageView imageView) {
        return f673a.a(imageView);
    }

    public static void a(ImageView imageView, ColorStateList colorStateList) {
        f673a.a(imageView, colorStateList);
    }

    public static PorterDuff.Mode b(ImageView imageView) {
        return f673a.b(imageView);
    }

    public static void a(ImageView imageView, PorterDuff.Mode mode) {
        f673a.a(imageView, mode);
    }
}
