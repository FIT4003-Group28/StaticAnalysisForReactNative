package com.google.android.libraries.messaging.lighter.ui.avatar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class ContactAvatarView extends RelativeLayout implements cuvc {
    public cuuv a;
    ImageView b;
    ImageView c;
    public int[] d;
    public int e;
    int f;
    Bitmap g;
    Bitmap h;
    private final cuva i;

    public ContactAvatarView(Context context) {
        this(context, null);
    }

    @Override // defpackage.cuvc
    public final void a(cufj cufjVar) {
        Bitmap b = this.i.b(cufjVar, this.f, new cuve(this));
        this.h = b;
        this.b.setImageBitmap(b);
        Bitmap bitmap = this.g;
        if (bitmap != null) {
            this.c.setImageBitmap(bitmap);
        }
    }

    @Override // defpackage.cuww
    public final void b() {
        this.h = null;
        this.g = null;
    }

    public void setAvatarSize(int i) {
        this.f = i;
        Bitmap bitmap = this.h;
        if (bitmap != null) {
            this.b.setImageBitmap(Bitmap.createScaledBitmap(bitmap, i, i, false));
            Bitmap bitmap2 = this.g;
            if (bitmap2 == null) {
                return;
            }
            int i2 = (int) (this.f * 0.375f);
            this.c.setImageBitmap(Bitmap.createScaledBitmap(bitmap2, i2, i2, false));
        }
    }

    public void setBadge(Bitmap bitmap) {
        this.g = this.a.e(new BitmapDrawable(getResources(), bitmap), (int) (this.f * 0.375f));
    }

    @Override // defpackage.cuvv
    public void setPresenter(cuvb cuvbVar) {
    }

    public ContactAvatarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContactAvatarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainTypedArray;
        this.i = cuva.a();
        inflate(getContext(), R.layout.avatar_view_layout, this);
        this.b = (ImageView) findViewById(R.id.avatar_icon);
        this.c = (ImageView) findViewById(R.id.avatar_badge);
        setClickable(true);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cuvi.b, i, 0);
        this.f = obtainStyledAttributes.getDimensionPixelSize(2, cuwg.a(getContext(), 60.0f));
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            obtainTypedArray = getResources().obtainTypedArray(resourceId);
        } else {
            obtainTypedArray = getResources().obtainTypedArray(R.array.avatar_bg_colors_default_array);
        }
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        if (resourceId2 != 0) {
            this.e = akm.c(getContext(), resourceId2);
        } else {
            this.e = akm.c(getContext(), R.color.avatar_fg_color);
        }
        this.d = new int[obtainTypedArray.length()];
        for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
            this.d[i2] = obtainTypedArray.getColor(i2, -7829368);
        }
        obtainTypedArray.recycle();
        obtainStyledAttributes.recycle();
        this.a = cuuv.a();
    }
}
