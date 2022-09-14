package defpackage;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
/* compiled from: PG */
/* renamed from: btdq  reason: default package */
/* loaded from: classes4.dex */
final class btdq extends InsetDrawable {
    public btdq(Drawable drawable, int i) {
        super(drawable, i);
    }

    @Override // android.graphics.drawable.InsetDrawable, android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        return false;
    }
}
