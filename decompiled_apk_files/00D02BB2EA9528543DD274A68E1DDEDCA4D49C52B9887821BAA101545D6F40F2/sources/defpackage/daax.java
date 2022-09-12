package defpackage;

import android.text.TextPaint;
import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: daax  reason: default package */
/* loaded from: classes.dex */
public final class daax {
    public final TextPaint a = new TextPaint(1);
    public final dadf b = new daav(this);
    public boolean c = true;
    public WeakReference<daaw> d;
    public dade e;
    private float f;

    public daax(daaw daawVar) {
        this.d = new WeakReference<>(null);
        this.d = new WeakReference<>(daawVar);
    }

    public final float a(String str) {
        if (this.c) {
            float measureText = str == null ? 0.0f : this.a.measureText((CharSequence) str, 0, str.length());
            this.f = measureText;
            this.c = false;
            return measureText;
        }
        return this.f;
    }
}
