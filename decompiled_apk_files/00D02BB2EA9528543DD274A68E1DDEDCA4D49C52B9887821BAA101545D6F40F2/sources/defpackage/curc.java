package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: curc  reason: default package */
/* loaded from: classes5.dex */
public final class curc extends AppCompatImageView implements cuvv {
    public cuqx a;
    public int b;
    public boolean c;

    public curc(Context context) {
        this(context, null, 0);
    }

    public final void a(String str) {
        Bitmap decodeFile = BitmapFactory.decodeFile(str);
        if (decodeFile == null || str == null || str.isEmpty()) {
            if (this.c) {
                return;
            }
            setImageResource(2131232186);
            setScaleType(ImageView.ScaleType.CENTER);
            return;
        }
        setImageBitmap(decodeFile);
        setScaleType(ImageView.ScaleType.CENTER_CROP);
    }

    @Override // defpackage.cuvv
    public void setPresenter(cuqx cuqxVar) {
        this.a = cuqxVar;
    }

    public curc(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public curc(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = false;
        setBackgroundColor(akm.c(getContext(), R.color.image_element_background));
        setAdjustViewBounds(false);
        setFocusable(true);
    }
}
