package defpackage;

import android.os.Handler;
import android.os.Looper;
/* compiled from: PG */
/* renamed from: dapt  reason: default package */
/* loaded from: classes5.dex */
public final class dapt implements daoz {
    private final Handler a = new Handler(Looper.getMainLooper());
    private boolean b = false;
    private boolean c = false;

    private final void b(boolean z) {
        this.a.post(new daps());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(boolean z) {
        if (z == this.b) {
            return;
        }
        if (!z) {
            b(false);
            this.b = false;
            this.c = true;
        } else if (this.c) {
        } else {
            b(true);
            this.b = true;
        }
    }
}
