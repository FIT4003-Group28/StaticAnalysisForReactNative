package c.e.a.c.l;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final TimeInterpolator f4733a = new LinearInterpolator();

    /* renamed from: b  reason: collision with root package name */
    public static final TimeInterpolator f4734b = new a.l.a.a.b();

    /* renamed from: c  reason: collision with root package name */
    public static final TimeInterpolator f4735c = new a.l.a.a.a();

    /* renamed from: d  reason: collision with root package name */
    public static final TimeInterpolator f4736d = new a.l.a.a.c();

    /* renamed from: e  reason: collision with root package name */
    public static final TimeInterpolator f4737e = new DecelerateInterpolator();

    public static float a(float f2, float f3, float f4) {
        return f2 + (f4 * (f3 - f2));
    }
}
