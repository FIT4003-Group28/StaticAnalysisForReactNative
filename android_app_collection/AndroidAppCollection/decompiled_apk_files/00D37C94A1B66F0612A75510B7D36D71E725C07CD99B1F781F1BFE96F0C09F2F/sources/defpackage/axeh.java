package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.google.vr.cardboard.ExternalSurfaceManager;
/* compiled from: PG */
/* renamed from: axeh  reason: default package */
/* loaded from: classes2.dex */
public final class axeh implements axee {
    private final Runnable a;
    private final long b;
    private final Handler c = new Handler(Looper.getMainLooper());

    public axeh(long j, long j2) {
        this.a = new bank(j, 1);
        this.b = j2;
    }

    @Override // defpackage.axee
    public final void a() {
        this.c.removeCallbacks(this.a);
    }

    @Override // defpackage.axee
    public final void b() {
        ExternalSurfaceManager.nativeCallback(this.b);
    }

    @Override // defpackage.axee
    public final void c() {
        this.c.post(this.a);
    }
}
