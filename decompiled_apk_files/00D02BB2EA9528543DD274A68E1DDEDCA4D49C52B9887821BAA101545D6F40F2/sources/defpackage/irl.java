package defpackage;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
/* compiled from: PG */
@Deprecated
/* renamed from: irl  reason: default package */
/* loaded from: classes6.dex */
final class irl extends InsetDrawable {
    public irl(Drawable drawable, int i) {
        super(drawable, i);
    }

    @Override // android.graphics.drawable.InsetDrawable, android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        return false;
    }
}
