package defpackage;

import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.PictureDrawable;
import android.widget.ImageView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: vwy  reason: default package */
/* loaded from: classes7.dex */
public final class vwy {
    static final int[] a;
    static final int[] b;
    static final int[] c;
    private static final int[] f;
    private static final int[] g;
    private static final int[] h;
    private static final int[][] i;
    public final AnimationDrawable d;
    public boolean e;
    @dzsi
    private ImageView j;

    static {
        int[] iArr = {R.raw.hike_1, R.raw.hike_2, R.raw.hike_3, R.raw.hike_4, R.raw.hike_5, R.raw.hike_6, R.raw.hike_7, R.raw.hike_8, R.raw.hike_9, R.raw.hike_10, R.raw.hike_11, R.raw.hike_12};
        f = iArr;
        int[] iArr2 = {R.raw.car_1, R.raw.car_2, R.raw.car_3, R.raw.car_4, R.raw.car_5, R.raw.car_6, R.raw.car_7, R.raw.car_8, R.raw.car_9, R.raw.car_10, R.raw.car_11, R.raw.car_12, R.raw.car_13, R.raw.car_14, R.raw.car_15, R.raw.car_16, R.raw.car_17};
        a = iArr2;
        int[] iArr3 = {R.raw.train_1, R.raw.train_2, R.raw.train_3, R.raw.train_4, R.raw.train_5, R.raw.train_6, R.raw.train_7, R.raw.train_8, R.raw.train_9, R.raw.train_10, R.raw.train_11, R.raw.train_12, R.raw.train_13, R.raw.train_14};
        g = iArr3;
        int[] iArr4 = {R.raw.walk_1, R.raw.walk_2, R.raw.walk_3, R.raw.walk_4, R.raw.walk_5, R.raw.walk_6, R.raw.walk_7, R.raw.walk_8, R.raw.walk_9, R.raw.walk_10, R.raw.walk_11, R.raw.walk_12, R.raw.walk_13, R.raw.walk_14, R.raw.walk_15, R.raw.walk_16};
        b = iArr4;
        int[] iArr5 = {R.raw.taxi_1, R.raw.taxi_2, R.raw.taxi_3, R.raw.taxi_4, R.raw.taxi_5, R.raw.taxi_6, R.raw.taxi_7, R.raw.taxi_8, R.raw.taxi_9, R.raw.taxi_10, R.raw.taxi_11, R.raw.taxi_12, R.raw.taxi_13, R.raw.taxi_14, R.raw.taxi_15, R.raw.taxi_16, R.raw.taxi_17};
        h = iArr5;
        int[] iArr6 = {R.raw.bike_1, R.raw.bike_2, R.raw.bike_3, R.raw.bike_4, R.raw.bike_5, R.raw.bike_6, R.raw.bike_7, R.raw.bike_8, R.raw.bike_9, R.raw.bike_10, R.raw.bike_11, R.raw.bike_12, R.raw.bike_13, R.raw.bike_14, R.raw.bike_15, R.raw.bike_16, R.raw.bike_17, R.raw.bike_18, R.raw.bike_19, R.raw.bike_20, R.raw.bike_21, R.raw.bike_22, R.raw.bike_23, R.raw.bike_24, R.raw.bike_25, R.raw.bike_26, R.raw.bike_27};
        c = iArr6;
        i = new int[][]{iArr6, iArr5, iArr4, iArr3, iArr2, iArr};
    }

    public vwy(Activity activity, ImageView imageView, @dzsi dqvj dqvjVar) {
        int[] iArr;
        this.j = imageView;
        if (dqvjVar == null) {
            iArr = b();
        } else {
            int ordinal = dqvjVar.ordinal();
            if (ordinal == 0) {
                iArr = a;
            } else if (ordinal != 1) {
                iArr = ordinal != 2 ? b() : b;
            } else {
                iArr = c;
            }
        }
        AnimationDrawable animationDrawable = new AnimationDrawable();
        for (int i2 : iArr) {
            animationDrawable.addFrame(new PictureDrawable(dxer.a(activity.getResources(), i2).a), 41);
        }
        this.d = animationDrawable;
    }

    private static int[] b() {
        int[][] iArr = i;
        boolean z = false;
        int i2 = 0;
        for (int i3 = 0; i3 < 6; i3++) {
            i2 += iArr[i3].length;
        }
        int[] iArr2 = new int[i2];
        int[][] iArr3 = i;
        int i4 = 0;
        for (int i5 = 0; i5 < 6; i5++) {
            int[] iArr4 = iArr3[i5];
            int length = iArr4.length;
            System.arraycopy(iArr4, 0, iArr2, i4, length);
            i4 += length;
        }
        if (i2 == i4) {
            z = true;
        }
        dbsk.l(z);
        return iArr2;
    }

    public final void a() {
        bvrj.UI_THREAD.c();
        if (this.e) {
            return;
        }
        this.e = true;
        ImageView imageView = this.j;
        if (imageView != null) {
            imageView.setImageDrawable(this.d);
            this.j = null;
        }
        this.d.start();
    }
}
