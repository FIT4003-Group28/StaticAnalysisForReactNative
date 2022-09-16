package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.EditText;
/* compiled from: PG */
/* renamed from: dmc  reason: default package */
/* loaded from: classes3.dex */
final class dmc extends EditText {
    public dmc(Context context) {
        super(context);
    }

    @Override // android.view.View
    public final void invalidate() {
    }

    @Override // android.view.View
    public final void setBackground(Drawable drawable) {
        if (drawable != null) {
            drawable.mutate();
        }
        super.setBackground(drawable);
    }
}
