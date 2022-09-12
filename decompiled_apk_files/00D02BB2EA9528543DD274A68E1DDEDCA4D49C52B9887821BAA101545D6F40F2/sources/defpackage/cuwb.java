package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
/* compiled from: PG */
/* renamed from: cuwb  reason: default package */
/* loaded from: classes5.dex */
public final class cuwb extends ViewOutlineProvider {
    private final float a;

    public cuwb(float f) {
        this.a = f;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(view.getPaddingStart(), view.getPaddingTop(), view.getWidth() - view.getPaddingEnd(), view.getHeight() - view.getPaddingBottom(), this.a);
    }
}
