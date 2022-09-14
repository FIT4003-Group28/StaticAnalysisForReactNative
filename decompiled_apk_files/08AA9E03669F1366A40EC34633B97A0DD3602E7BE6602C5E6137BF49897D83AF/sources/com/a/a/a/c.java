package com.a.a.a;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Property;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
/* compiled from: MarkerAnimation.java */
/* loaded from: classes.dex */
public class c {
    public static void a(Marker marker, LatLng latLng, Float f, final a aVar, Animator.AnimatorListener animatorListener, int i) {
        if (marker == null) {
            return;
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(marker, PropertyValuesHolder.ofObject(Property.of(Marker.class, LatLng.class, "position"), new TypeEvaluator<LatLng>() { // from class: com.a.a.a.c.1
            @Override // android.animation.TypeEvaluator
            /* renamed from: a */
            public LatLng evaluate(float f2, LatLng latLng2, LatLng latLng3) {
                return a.this.a(f2, latLng2, latLng3);
            }
        }, latLng), PropertyValuesHolder.ofFloat("rotation", f.floatValue()));
        ofPropertyValuesHolder.setDuration(i);
        ofPropertyValuesHolder.addListener(animatorListener);
        ofPropertyValuesHolder.start();
    }

    public static void a(ImageView imageView, Float f, Animator.AnimatorListener animatorListener, int i) {
        if (imageView == null) {
            return;
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(imageView, PropertyValuesHolder.ofFloat("rotation", f.floatValue()));
        ofPropertyValuesHolder.setDuration(i);
        if (animatorListener != null) {
            ofPropertyValuesHolder.addListener(animatorListener);
        }
        ofPropertyValuesHolder.start();
    }

    public static void a(final com.baidu.mapapi.map.Marker marker, final com.baidu.mapapi.model.LatLng latLng, float f, final a aVar, final float f2, final Animator.AnimatorListener animatorListener) {
        final com.baidu.mapapi.model.LatLng position = marker.getPosition();
        final Handler handler = new Handler();
        final long uptimeMillis = SystemClock.uptimeMillis();
        final LinearInterpolator linearInterpolator = new LinearInterpolator();
        handler.post(new Runnable() { // from class: com.a.a.a.c.2

            /* renamed from: a  reason: collision with root package name */
            long f1359a;

            /* renamed from: b  reason: collision with root package name */
            float f1360b;

            /* renamed from: c  reason: collision with root package name */
            float f1361c;

            @Override // java.lang.Runnable
            public void run() {
                this.f1359a = SystemClock.uptimeMillis() - uptimeMillis;
                this.f1360b = ((float) this.f1359a) / f2;
                this.f1361c = linearInterpolator.getInterpolation(this.f1360b);
                marker.setPosition(aVar.a(this.f1361c, position, latLng));
                if (this.f1360b < 1.0f) {
                    handler.postDelayed(this, 16L);
                } else {
                    animatorListener.onAnimationEnd(null);
                }
            }
        });
    }
}
