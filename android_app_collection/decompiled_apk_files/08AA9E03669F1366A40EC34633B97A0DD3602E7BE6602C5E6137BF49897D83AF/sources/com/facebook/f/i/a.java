package com.facebook.f.i;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
/* compiled from: AspectRatioMeasure.java */
/* loaded from: classes.dex */
public class a {

    /* compiled from: AspectRatioMeasure.java */
    /* renamed from: com.facebook.f.i.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0056a {

        /* renamed from: a  reason: collision with root package name */
        public int f2477a;

        /* renamed from: b  reason: collision with root package name */
        public int f2478b;
    }

    private static boolean a(int i) {
        return i == 0 || i == -2;
    }

    public static void a(C0056a c0056a, float f, ViewGroup.LayoutParams layoutParams, int i, int i2) {
        if (f <= BitmapDescriptorFactory.HUE_RED || layoutParams == null) {
            return;
        }
        if (a(layoutParams.height)) {
            c0056a.f2478b = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) (((View.MeasureSpec.getSize(c0056a.f2477a) - i) / f) + i2), c0056a.f2478b), 1073741824);
        } else if (!a(layoutParams.width)) {
        } else {
            c0056a.f2477a = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) (((View.MeasureSpec.getSize(c0056a.f2478b) - i2) * f) + i), c0056a.f2477a), 1073741824);
        }
    }
}
