package defpackage;

import android.content.Context;
import android.os.Handler;
/* compiled from: PG */
/* renamed from: qzc  reason: default package */
/* loaded from: classes4.dex */
public final class qzc {
    public final qzi a;
    public final Handler b;

    public qzc(Context context) {
        this.a = qzi.c(context);
        this.b = new rfm(context.getMainLooper());
    }

    public final void a(qze qzeVar) {
        this.b.removeCallbacksAndMessages(qzeVar);
    }
}
