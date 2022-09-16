package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.StateSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
/* compiled from: PG */
/* renamed from: iex  reason: default package */
/* loaded from: classes3.dex */
public final class iex {
    public final Map a = new HashMap();

    private static Drawable c(Resources resources, Drawable drawable, int i) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        int i2 = i == 0 ? intrinsicWidth : i;
        if (i == 0) {
            i = intrinsicHeight;
        }
        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
        drawable.draw(new Canvas(createBitmap));
        if (i2 != intrinsicWidth || i != intrinsicHeight) {
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, i2, i, true);
            createBitmap.recycle();
            createBitmap = createScaledBitmap;
        }
        int max = Math.max(2, resources.getInteger(R.integer.reel_player_right_cell_shadow));
        float integer = resources.getInteger(R.integer.reel_player_right_cell_shadow_dx);
        float integer2 = resources.getInteger(R.integer.reel_player_right_cell_shadow_dy);
        Bitmap createBitmap2 = Bitmap.createBitmap(i2, i, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap2);
        Paint paint = new Paint(1);
        paint.setColor(((12 / (max / 2)) << 24) | 16777215);
        paint.setColorFilter(new LightingColorFilter(0, 0));
        while (max > 0) {
            float f = max;
            float f2 = integer - f;
            float f3 = integer2 - f;
            canvas.drawBitmap(createBitmap, f2, f3, paint);
            float f4 = integer2 + 0.0f;
            canvas.drawBitmap(createBitmap, f2, f4, paint);
            float f5 = integer2 + f;
            canvas.drawBitmap(createBitmap, f2, f5, paint);
            float f6 = 0.0f + integer;
            canvas.drawBitmap(createBitmap, f6, f3, paint);
            canvas.drawBitmap(createBitmap, f6, f5, paint);
            float f7 = f + integer;
            canvas.drawBitmap(createBitmap, f7, f3, paint);
            canvas.drawBitmap(createBitmap, f7, f4, paint);
            canvas.drawBitmap(createBitmap, f7, f5, paint);
            max -= 2;
        }
        canvas.drawBitmap(createBitmap, 0.0f, 0.0f, (Paint) null);
        createBitmap.recycle();
        BitmapDrawable bitmapDrawable = new BitmapDrawable(createBitmap2);
        bitmapDrawable.setBounds(0, 0, createBitmap2.getWidth(), createBitmap2.getHeight());
        return bitmapDrawable;
    }

    private static void d(View view, Drawable drawable) {
        if (view instanceof ImageView) {
            ((ImageView) view).setImageDrawable(drawable);
        } else if (view instanceof TextView) {
            TextView textView = (TextView) view;
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative.length != 4) {
                return;
            }
            boolean z = false;
            for (int i = 0; i < compoundDrawablesRelative.length; i++) {
                if (compoundDrawablesRelative[i] != null) {
                    compoundDrawablesRelative[i] = drawable;
                    z = true;
                }
            }
            if (!z) {
                return;
            }
            textView.setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
        } else {
            view.getContext();
        }
    }

    public final void a(View view, int i, int i2) {
        Resources resources;
        Drawable drawable;
        if (view == null || (drawable = (resources = view.getContext().getResources()).getDrawable(i2)) == null) {
            return;
        }
        int dimensionPixelSize = resources.getDimensionPixelSize(i);
        String format = String.format(Locale.US, "%d.%d", Integer.valueOf(dimensionPixelSize), Integer.valueOf(i2));
        Drawable drawable2 = (Drawable) this.a.get(format);
        if (drawable2 == null) {
            drawable2 = c(resources, drawable, dimensionPixelSize);
            this.a.put(format, drawable2);
        }
        d(view, drawable2);
    }

    public final void b(View view, int i, int i2) {
        if (view == null) {
            return;
        }
        Resources resources = view.getContext().getResources();
        Drawable drawable = resources.getDrawable(i);
        Drawable drawable2 = resources.getDrawable(i2);
        if (drawable == null || drawable2 == null) {
            return;
        }
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.reel_player_right_large_icon_size);
        Locale locale = Locale.US;
        Integer valueOf = Integer.valueOf(dimensionPixelSize);
        String format = String.format(locale, "%d.%d", valueOf, Integer.valueOf(i2));
        String format2 = String.format(Locale.US, "%d.%d", valueOf, Integer.valueOf(i));
        Drawable drawable3 = (Drawable) this.a.get(format);
        if (drawable3 == null) {
            drawable3 = c(resources, drawable2, dimensionPixelSize);
            this.a.put(format, drawable3);
        }
        Drawable drawable4 = (Drawable) this.a.get(format2);
        if (drawable4 == null) {
            drawable4 = c(resources, drawable, dimensionPixelSize);
            this.a.put(format2, drawable4);
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842913}, drawable3);
        stateListDrawable.addState(StateSet.WILD_CARD, drawable4);
        stateListDrawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        d(view, stateListDrawable);
    }
}
