package defpackage;

import android.graphics.drawable.Drawable;
/* compiled from: PG */
/* renamed from: aljz  reason: default package */
/* loaded from: classes.dex */
final class aljz extends Drawable.ConstantState {
    final /* synthetic */ alka a;

    public aljz(alka alkaVar) {
        this.a = alkaVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return this.a;
    }
}
