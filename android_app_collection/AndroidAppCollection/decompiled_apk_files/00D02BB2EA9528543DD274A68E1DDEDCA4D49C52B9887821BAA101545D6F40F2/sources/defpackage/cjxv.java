package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: cjxv  reason: default package */
/* loaded from: classes4.dex */
public final class cjxv extends cjxw {
    final /* synthetic */ Runnable a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjxv(View view, cjyb cjybVar, Runnable runnable) {
        super(view, cjybVar);
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.run();
    }
}
