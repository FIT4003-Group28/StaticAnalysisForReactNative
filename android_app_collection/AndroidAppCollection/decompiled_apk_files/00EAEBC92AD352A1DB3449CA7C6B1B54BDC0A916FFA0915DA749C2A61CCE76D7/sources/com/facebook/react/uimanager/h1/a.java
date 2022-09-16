package com.facebook.react.uimanager.h1;

import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.BaseInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.facebook.react.bridge.ReadableMap;
import java.util.Map;
/* loaded from: classes.dex */
abstract class a {

    /* renamed from: e  reason: collision with root package name */
    private static final Map<d, BaseInterpolator> f5933e = com.facebook.react.common.f.a(d.LINEAR, new LinearInterpolator(), d.EASE_IN, new AccelerateInterpolator(), d.EASE_OUT, new DecelerateInterpolator(), d.EASE_IN_EASE_OUT, new AccelerateDecelerateInterpolator());

    /* renamed from: a  reason: collision with root package name */
    private Interpolator f5934a;

    /* renamed from: b  reason: collision with root package name */
    private int f5935b;

    /* renamed from: c  reason: collision with root package name */
    protected b f5936c;

    /* renamed from: d  reason: collision with root package name */
    protected int f5937d;

    private static Interpolator a(d dVar, ReadableMap readableMap) {
        BaseInterpolator nVar = dVar.equals(d.SPRING) ? new n(n.a(readableMap)) : f5933e.get(dVar);
        if (nVar != null) {
            return nVar;
        }
        throw new IllegalArgumentException("Missing interpolator for type : " + dVar);
    }

    public final Animation a(View view, int i, int i2, int i3, int i4) {
        if (!a()) {
            return null;
        }
        Animation b2 = b(view, i, i2, i3, i4);
        if (b2 != null) {
            b2.setDuration(this.f5937d * 1);
            b2.setStartOffset(this.f5935b * 1);
            b2.setInterpolator(this.f5934a);
        }
        return b2;
    }

    public void a(ReadableMap readableMap, int i) {
        this.f5936c = readableMap.hasKey("property") ? b.a(readableMap.getString("property")) : null;
        if (readableMap.hasKey("duration")) {
            i = readableMap.getInt("duration");
        }
        this.f5937d = i;
        this.f5935b = readableMap.hasKey("delay") ? readableMap.getInt("delay") : 0;
        if (readableMap.hasKey("type")) {
            this.f5934a = a(d.a(readableMap.getString("type")), readableMap);
            if (a()) {
                return;
            }
            throw new com.facebook.react.uimanager.g("Invalid layout animation : " + readableMap);
        }
        throw new IllegalArgumentException("Missing interpolation type.");
    }

    abstract boolean a();

    abstract Animation b(View view, int i, int i2, int i3, int i4);

    public void b() {
        this.f5936c = null;
        this.f5937d = 0;
        this.f5935b = 0;
        this.f5934a = null;
    }
}
