package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public class c1 extends Resources {

    /* renamed from: b  reason: collision with root package name */
    private static boolean f1226b = false;

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<Context> f1227a;

    public c1(Context context, Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f1227a = new WeakReference<>(context);
    }

    public static boolean a() {
        return f1226b;
    }

    public static boolean b() {
        return a() && Build.VERSION.SDK_INT <= 20;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Drawable a(int i) {
        return super.getDrawable(i);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i) {
        Context context = this.f1227a.get();
        return context != null ? m0.a().a(context, this, i) : super.getDrawable(i);
    }
}
