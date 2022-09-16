package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.ref.WeakReference;
/* compiled from: VectorEnabledTintResources.java */
/* loaded from: classes.dex */
public class ar extends Resources {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<Context> f940a;

    public static boolean a() {
        return android.support.v7.app.b.a() && Build.VERSION.SDK_INT <= 20;
    }

    public ar(Context context, Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f940a = new WeakReference<>(context);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i) {
        Context context = this.f940a.get();
        if (context != null) {
            return h.a().a(context, this, i);
        }
        return super.getDrawable(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Drawable a(int i) {
        return super.getDrawable(i);
    }
}
