package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
class w0 extends n0 {

    /* renamed from: b  reason: collision with root package name */
    private final WeakReference<Context> f1414b;

    public w0(Context context, Resources resources) {
        super(resources);
        this.f1414b = new WeakReference<>(context);
    }

    @Override // androidx.appcompat.widget.n0, android.content.res.Resources
    public Drawable getDrawable(int i) {
        Drawable drawable = super.getDrawable(i);
        Context context = this.f1414b.get();
        if (drawable != null && context != null) {
            m0.a().a(context, i, drawable);
        }
        return drawable;
    }
}
