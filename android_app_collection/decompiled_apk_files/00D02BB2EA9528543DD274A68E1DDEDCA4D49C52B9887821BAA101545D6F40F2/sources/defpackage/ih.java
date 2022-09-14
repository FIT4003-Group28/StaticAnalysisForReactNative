package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.graphics.drawable.IconCompat;
import android.text.TextUtils;
import android.widget.RemoteViews;
import com.google.android.apps.maps.R;
import java.io.InputStream;
/* compiled from: PG */
/* renamed from: ih  reason: default package */
/* loaded from: classes.dex */
public class ih {
    protected ib d;
    CharSequence e;
    public CharSequence f;
    public boolean g = false;

    protected String a() {
        throw null;
    }

    public void b(hw hwVar) {
        throw null;
    }

    public void c(Bundle bundle) {
        if (this.g) {
            bundle.putCharSequence("android.summaryText", this.f);
        }
        CharSequence charSequence = this.e;
        if (charSequence != null) {
            bundle.putCharSequence("android.title.big", charSequence);
        }
        String a = a();
        if (a != null) {
            bundle.putString("android.support.v4.app.extra.COMPAT_TEMPLATE", a);
        }
    }

    public void d(Bundle bundle) {
        if (bundle.containsKey("android.summaryText")) {
            this.f = bundle.getCharSequence("android.summaryText");
            this.g = true;
        }
        this.e = bundle.getCharSequence("android.title.big");
    }

    public final Bitmap j(IconCompat iconCompat, int i, int i2) {
        Drawable drawable;
        BitmapDrawable bitmapDrawable;
        int i3;
        Context context = this.d.a;
        iconCompat.j(context);
        if (Build.VERSION.SDK_INT >= 23) {
            drawable = iconCompat.i(context).loadDrawable(context);
        } else {
            BitmapDrawable bitmapDrawable2 = null;
            switch (iconCompat.a) {
                case 1:
                    bitmapDrawable = new BitmapDrawable(context.getResources(), (Bitmap) iconCompat.b);
                    bitmapDrawable2 = bitmapDrawable;
                    break;
                case 2:
                    String e = iconCompat.e();
                    if (TextUtils.isEmpty(e)) {
                        e = context.getPackageName();
                    }
                    try {
                        bitmapDrawable2 = IconCompat.l(context, e).getDrawable(iconCompat.e, context.getTheme());
                        break;
                    } catch (RuntimeException unused) {
                        break;
                    }
                case 3:
                    bitmapDrawable = new BitmapDrawable(context.getResources(), BitmapFactory.decodeByteArray((byte[]) iconCompat.b, iconCompat.e, iconCompat.f));
                    bitmapDrawable2 = bitmapDrawable;
                    break;
                case 4:
                    InputStream k = iconCompat.k(context);
                    if (k != null) {
                        bitmapDrawable2 = new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(k));
                        break;
                    }
                    break;
                case 5:
                    bitmapDrawable = new BitmapDrawable(context.getResources(), IconCompat.q((Bitmap) iconCompat.b, false));
                    bitmapDrawable2 = bitmapDrawable;
                    break;
                case 6:
                    InputStream k2 = iconCompat.k(context);
                    if (k2 != null) {
                        if (Build.VERSION.SDK_INT < 26) {
                            bitmapDrawable2 = new BitmapDrawable(context.getResources(), IconCompat.q(BitmapFactory.decodeStream(k2), false));
                            break;
                        } else {
                            bitmapDrawable2 = new AdaptiveIconDrawable(null, new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(k2)));
                            break;
                        }
                    }
                    break;
            }
            if (bitmapDrawable2 != null && (iconCompat.g != null || iconCompat.i != IconCompat.h)) {
                bitmapDrawable2.mutate();
                bitmapDrawable2.setTintList(iconCompat.g);
                bitmapDrawable2.setTintMode(iconCompat.i);
            }
            drawable = bitmapDrawable2;
        }
        if (i2 == 0) {
            i3 = drawable.getIntrinsicWidth();
            i2 = 0;
        } else {
            i3 = i2;
        }
        if (i2 == 0) {
            i2 = drawable.getIntrinsicHeight();
        }
        Bitmap createBitmap = Bitmap.createBitmap(i3, i2, Bitmap.Config.ARGB_8888);
        drawable.setBounds(0, 0, i3, i2);
        if (i != 0) {
            drawable.mutate().setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        }
        drawable.draw(new Canvas(createBitmap));
        return createBitmap;
    }

    public final Bitmap k(int i, int i2, int i3, int i4) {
        if (i4 == 0) {
            i4 = 0;
        }
        Bitmap j = j(IconCompat.a(this.d.a, R.drawable.notification_icon_background), i4, i2);
        Canvas canvas = new Canvas(j);
        Drawable mutate = this.d.a.getResources().getDrawable(i).mutate();
        mutate.setFilterBitmap(true);
        int i5 = (i2 - i3) / 2;
        int i6 = i3 + i5;
        mutate.setBounds(i5, i5, i6, i6);
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
        mutate.draw(canvas);
        return j;
    }

    public RemoteViews m() {
        return null;
    }

    public RemoteViews n() {
        return null;
    }

    public RemoteViews o() {
        return null;
    }
}
