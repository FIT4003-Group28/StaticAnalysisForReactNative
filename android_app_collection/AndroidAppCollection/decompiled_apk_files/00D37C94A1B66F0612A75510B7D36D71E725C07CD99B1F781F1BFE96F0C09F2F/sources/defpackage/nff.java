package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.EdgeEffect;
import j$.util.function.Consumer;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;
/* compiled from: PG */
/* renamed from: nff  reason: default package */
/* loaded from: classes3.dex */
public final class nff extends EdgeEffect {
    public static final /* synthetic */ int b = 0;
    public final WeakHashMap a;

    public nff(Context context) {
        super(context);
        this.a = new WeakHashMap();
    }

    private final void a(Consumer consumer) {
        for (Map.Entry entry : this.a.entrySet()) {
            View view = (View) entry.getKey();
            EdgeEffect edgeEffect = (EdgeEffect) ((WeakReference) entry.getValue()).get();
            if (edgeEffect != null) {
                consumer.accept(edgeEffect);
                view.invalidate();
            }
        }
    }

    @Override // android.widget.EdgeEffect
    public final void finish() {
        super.finish();
        a(khv.c);
    }

    @Override // android.widget.EdgeEffect
    public final void onAbsorb(int i) {
        super.onAbsorb(i);
        a(new khu(i, 5));
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f) {
        super.onPull(f);
        a(new kmf(f, 2));
    }

    @Override // android.widget.EdgeEffect
    public final float onPullDistance(float f, float f2) {
        a(new nfe(f, f2));
        return super.onPullDistance(f, f2);
    }

    @Override // android.widget.EdgeEffect
    public final void onRelease() {
        super.onRelease();
        a(khv.d);
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f, float f2) {
        super.onPull(f, f2);
        a(new nfe(f, f2, 1));
    }
}
