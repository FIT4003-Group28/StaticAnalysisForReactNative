package defpackage;

import android.os.Handler;
import android.os.Looper;
/* compiled from: PG */
/* renamed from: bhe  reason: default package */
/* loaded from: classes2.dex */
final class bhe {
    public final Handler a = new Handler(Looper.getMainLooper());
    public final Runnable b;
    public long c;
    public long d;
    public boolean e;

    public bhe(Runnable runnable) {
        this.b = runnable;
    }
}
