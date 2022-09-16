package com.facebook.react.uimanager.c;

import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.facebook.react.bridge.an;
import java.util.Map;
/* compiled from: AbstractLayoutAnimation.java */
/* loaded from: classes.dex */
abstract class a {

    /* renamed from: c  reason: collision with root package name */
    private static final Map<e, Interpolator> f3839c = com.facebook.react.b.f.a(e.LINEAR, new LinearInterpolator(), e.EASE_IN, new AccelerateInterpolator(), e.EASE_OUT, new DecelerateInterpolator(), e.EASE_IN_EASE_OUT, new AccelerateDecelerateInterpolator(), e.SPRING, new n());

    /* renamed from: a  reason: collision with root package name */
    protected b f3840a;

    /* renamed from: b  reason: collision with root package name */
    protected int f3841b;

    /* renamed from: d  reason: collision with root package name */
    private Interpolator f3842d;
    private int e;

    abstract Animation a(View view, int i, int i2, int i3, int i4);

    abstract boolean a();

    public void b() {
        this.f3840a = null;
        this.f3841b = 0;
        this.e = 0;
        this.f3842d = null;
    }

    public void a(an anVar, int i) {
        this.f3840a = anVar.hasKey("property") ? b.a(anVar.getString("property")) : null;
        if (anVar.hasKey("duration")) {
            i = anVar.getInt("duration");
        }
        this.f3841b = i;
        this.e = anVar.hasKey("delay") ? anVar.getInt("delay") : 0;
        if (!anVar.hasKey("type")) {
            throw new IllegalArgumentException("Missing interpolation type.");
        }
        this.f3842d = a(e.a(anVar.getString("type")));
        if (a()) {
            return;
        }
        throw new com.facebook.react.uimanager.e("Invalid layout animation : " + anVar);
    }

    public final Animation b(View view, int i, int i2, int i3, int i4) {
        if (!a()) {
            return null;
        }
        Animation a2 = a(view, i, i2, i3, i4);
        if (a2 != null) {
            a2.setDuration(this.f3841b * 1);
            a2.setStartOffset(this.e * 1);
            a2.setInterpolator(this.f3842d);
        }
        return a2;
    }

    private static Interpolator a(e eVar) {
        Interpolator interpolator = f3839c.get(eVar);
        if (interpolator == null) {
            throw new IllegalArgumentException("Missing interpolator for type : " + eVar);
        }
        return interpolator;
    }
}
