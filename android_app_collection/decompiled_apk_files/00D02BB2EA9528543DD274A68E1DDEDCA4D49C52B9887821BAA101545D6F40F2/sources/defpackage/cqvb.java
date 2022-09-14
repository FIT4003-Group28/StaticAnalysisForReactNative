package defpackage;

import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: cqvb  reason: default package */
/* loaded from: classes5.dex */
final class cqvb extends StateListDrawable {
    private final HashMap<Drawable, ColorFilter> a = new HashMap<>();

    public final void a(int[] iArr, Drawable drawable, @dzsi ColorFilter colorFilter) {
        this.a.put(drawable, colorFilter);
        super.addState(iArr, drawable);
    }

    @Override // android.graphics.drawable.DrawableContainer
    public final boolean selectDrawable(int i) {
        if (super.selectDrawable(i)) {
            Drawable current = getCurrent();
            if (current == null) {
                return true;
            }
            current.setColorFilter(this.a.get(current));
            return true;
        }
        return false;
    }
}
