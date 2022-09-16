package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
/* compiled from: PG */
/* renamed from: ctx  reason: default package */
/* loaded from: classes3.dex */
public final class ctx extends ctr {
    private static final Handler b = new Handler(Looper.getMainLooper(), new ctw());
    public final cgg a;

    public ctx(cgg cggVar, int i, int i2) {
        super(i, i2);
        this.a = cggVar;
    }

    @Override // defpackage.ctz
    public final void a(Drawable drawable) {
    }

    @Override // defpackage.ctz
    public final void b(Object obj, cug cugVar) {
        cth cthVar = this.c;
        if (cthVar == null || !cthVar.l()) {
            return;
        }
        b.obtainMessage(1, this).sendToTarget();
    }
}
