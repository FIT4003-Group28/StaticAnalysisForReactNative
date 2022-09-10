package defpackage;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bvlk  reason: default package */
/* loaded from: classes.dex */
public final class bvlk extends Drawable.ConstantState {
    public final bvll a;
    public final Paint b;

    public bvlk(bvll bvllVar, Paint paint) {
        this.a = bvllVar;
        this.b = paint;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new bvlm(this);
    }
}
