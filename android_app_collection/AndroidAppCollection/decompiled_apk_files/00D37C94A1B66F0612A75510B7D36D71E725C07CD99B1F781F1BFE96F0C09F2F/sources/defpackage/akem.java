package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import com.google.android.libraries.youtube.rendering.ui.spec.motion.TouchFeedbackDrawable;
/* compiled from: PG */
/* renamed from: akem  reason: default package */
/* loaded from: classes.dex */
public final class akem {
    private final amqo a;

    public akem(amqo amqoVar) {
        this.a = amqoVar;
    }

    public akem(final tqe tqeVar) {
        this.a = aqxo.i(new amqo() { // from class: tvz
            @Override // defpackage.amqo
            public final Object get() {
                tqh b = tqe.this.b();
                return b == tqh.UNDEFINED ? tqh.SHARED_PREFERENCES_ONLY : b;
            }
        });
    }

    public final Drawable a(View view, Drawable drawable) {
        if (!d()) {
            return null;
        }
        akej a = akej.a(view.getContext());
        a.b = drawable;
        return a.b();
    }

    public final void b(View view, Drawable drawable) {
        view.getClass();
        if (d() && (drawable instanceof TouchFeedbackDrawable) && !(view.getBackground() instanceof TouchFeedbackDrawable)) {
            zav.c(view, drawable);
        }
    }

    public final void c(View view, Drawable drawable) {
        view.getClass();
        if (Build.VERSION.SDK_INT >= 23 && d() && (drawable instanceof TouchFeedbackDrawable) && !(view.getForeground() instanceof TouchFeedbackDrawable)) {
            zav.d(view, drawable);
        }
    }

    public final boolean d() {
        return ((Boolean) this.a.get()).booleanValue();
    }

    public final tqh e() {
        return (tqh) this.a.get();
    }
}
