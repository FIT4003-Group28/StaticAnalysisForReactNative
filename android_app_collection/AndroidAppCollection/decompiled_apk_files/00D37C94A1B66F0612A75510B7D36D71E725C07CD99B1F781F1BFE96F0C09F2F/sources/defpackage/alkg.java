package defpackage;

import android.graphics.drawable.Drawable;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
/* compiled from: PG */
/* renamed from: alkg  reason: default package */
/* loaded from: classes.dex */
public final class alkg {
    final /* synthetic */ FloatingActionButton a;

    public alkg(FloatingActionButton floatingActionButton) {
        this.a = floatingActionButton;
    }

    public final void a(Drawable drawable) {
        if (drawable != null) {
            super/*allm*/.setBackgroundDrawable(drawable);
        }
    }

    public final boolean b() {
        return this.a.b;
    }
}
