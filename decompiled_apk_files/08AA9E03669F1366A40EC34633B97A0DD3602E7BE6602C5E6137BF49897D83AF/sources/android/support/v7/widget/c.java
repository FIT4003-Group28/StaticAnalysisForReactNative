package android.support.v7.widget;

import android.graphics.Outline;
/* compiled from: ActionBarBackgroundDrawableV21.java */
/* loaded from: classes.dex */
class c extends b {
    public c(ActionBarContainer actionBarContainer) {
        super(actionBarContainer);
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.f942a.f800d) {
            if (this.f942a.f799c == null) {
                return;
            }
            this.f942a.f799c.getOutline(outline);
        } else if (this.f942a.f797a == null) {
        } else {
            this.f942a.f797a.getOutline(outline);
        }
    }
}
