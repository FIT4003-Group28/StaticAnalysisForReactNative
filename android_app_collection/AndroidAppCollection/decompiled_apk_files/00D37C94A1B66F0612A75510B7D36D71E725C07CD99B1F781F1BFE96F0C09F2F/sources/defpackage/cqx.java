package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cqx  reason: default package */
/* loaded from: classes3.dex */
public final class cqx extends Drawable.ConstantState {
    final crf a;

    public cqx(crf crfVar) {
        this.a = crfVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new cqy(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return newDrawable();
    }
}
