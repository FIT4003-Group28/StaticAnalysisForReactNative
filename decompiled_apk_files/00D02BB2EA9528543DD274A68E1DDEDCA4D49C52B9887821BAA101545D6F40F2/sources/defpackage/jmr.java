package defpackage;

import android.os.Handler;
import android.view.View;
/* compiled from: PG */
/* renamed from: jmr  reason: default package */
/* loaded from: classes7.dex */
final class jmr extends bvou {
    final /* synthetic */ Runnable a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jmr(View view, Runnable runnable) {
        super(view);
        this.a = runnable;
    }

    @Override // defpackage.bvou
    public final void a() {
        new Handler().postDelayed(this.a, 30L);
    }
}
