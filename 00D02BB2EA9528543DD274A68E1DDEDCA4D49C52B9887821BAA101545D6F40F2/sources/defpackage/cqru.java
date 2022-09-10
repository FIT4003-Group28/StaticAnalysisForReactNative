package defpackage;

import android.content.Context;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
/* compiled from: PG */
/* renamed from: cqru  reason: default package */
/* loaded from: classes.dex */
public final class cqru extends cqrt implements cqrx {
    public cqru(int i) {
        super(i);
    }

    @Override // defpackage.cqrx
    public final Animation a(Context context) {
        return AnimationUtils.loadAnimation(context, this.a);
    }
}
