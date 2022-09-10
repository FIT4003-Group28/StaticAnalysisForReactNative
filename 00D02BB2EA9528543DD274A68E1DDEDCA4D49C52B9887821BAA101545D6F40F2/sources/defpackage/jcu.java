package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: jcu  reason: default package */
/* loaded from: classes7.dex */
public final class jcu extends ImageView {
    private static final cqkv g = new jcw();
    public Executor a;
    public Executor b;
    public jdb c;
    public jde d;
    public final jcx[] e;
    @dzsi
    public Runnable f;
    private final Drawable h;
    @dzsi
    private Uri i;

    public jcu(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = null;
        this.f = null;
        ((jcv) bttc.a(jcv.class, this)).ww(this);
        this.h = context.getResources().getDrawable(R.color.qu_daynight_grey_200);
        this.e = new jcx[]{this.c, this.d};
    }

    public static <T extends cqkp> cqnf<T> a(cqlc<T, String> cqlcVar) {
        return cqjv.g(iug.IMAGE_URI, cqlcVar, g);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> b(cqmp<T>... cqmpVarArr) {
        return new cqmh(jcu.class, cqmpVarArr);
    }

    private final synchronized void e(Uri uri, int i, int i2) {
        jct jctVar = new jct(this, uri, i, i2);
        this.f = jctVar;
        this.b.execute(jctVar);
    }

    public final void c(@dzsi Bitmap bitmap) {
        if (bitmap == null) {
            super.setImageDrawable(null);
        } else if (getDrawable() == this.h) {
            TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{this.h, new BitmapDrawable(getContext().getResources(), bitmap)});
            transitionDrawable.setCrossFadeEnabled(true);
            super.setImageDrawable(transitionDrawable);
            transitionDrawable.startTransition(200);
        } else {
            super.setImageDrawable(new BitmapDrawable(bitmap));
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            int i5 = i3 - i;
            int i6 = i4 - i2;
            Uri uri = this.i;
            if (uri == null) {
                return;
            }
            e(uri, i5, i6);
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(@dzsi Drawable drawable) {
        throw new UnsupportedOperationException("Don't set drawable directly. Call setImageUri.");
    }

    public void setImageUri(@dzsi Uri uri) {
        if (dbsd.a(this.i, uri)) {
            return;
        }
        this.i = uri;
        if (uri == null) {
            super.setImageDrawable(null);
            return;
        }
        super.setImageDrawable(this.h);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth == 0 || measuredHeight == 0) {
            return;
        }
        e(uri, measuredWidth, measuredHeight);
    }
}
