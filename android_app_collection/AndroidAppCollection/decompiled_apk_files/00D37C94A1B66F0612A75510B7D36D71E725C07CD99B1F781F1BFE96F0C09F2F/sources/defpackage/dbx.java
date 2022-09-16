package defpackage;

import android.os.Handler;
import android.os.Looper;
/* compiled from: PG */
/* renamed from: dbx  reason: default package */
/* loaded from: classes3.dex */
public final class dbx extends Handler implements dby {
    public dbx(Looper looper) {
        super(looper);
    }

    @Override // defpackage.dby
    public final void a(Runnable runnable) {
        removeCallbacks(runnable);
    }

    @Override // defpackage.dby
    public final void b() {
    }

    @Override // defpackage.dby
    public final void c(Runnable runnable) {
        post(runnable);
    }
}
