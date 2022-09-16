package android.support.v4.j.b;

import android.view.animation.Interpolator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
/* compiled from: LookupTableInterpolator.java */
/* loaded from: classes.dex */
abstract class d implements Interpolator {

    /* renamed from: a  reason: collision with root package name */
    private final float[] f502a;

    /* renamed from: b  reason: collision with root package name */
    private final float f503b;

    /* JADX INFO: Access modifiers changed from: protected */
    public d(float[] fArr) {
        this.f502a = fArr;
        this.f503b = 1.0f / (this.f502a.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= BitmapDescriptorFactory.HUE_RED) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        int min = Math.min((int) ((this.f502a.length - 1) * f), this.f502a.length - 2);
        return this.f502a[min] + (((f - (min * this.f503b)) / this.f503b) * (this.f502a[min + 1] - this.f502a[min]));
    }
}
