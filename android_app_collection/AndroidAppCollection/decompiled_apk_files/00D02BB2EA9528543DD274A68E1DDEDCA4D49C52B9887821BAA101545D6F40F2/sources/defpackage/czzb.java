package defpackage;

import android.graphics.drawable.Drawable;
/* compiled from: PG */
/* renamed from: czzb  reason: default package */
/* loaded from: classes5.dex */
final class czzb extends Drawable.ConstantState {
    final /* synthetic */ czzc a;

    public czzb(czzc czzcVar) {
        this.a = czzcVar;
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
