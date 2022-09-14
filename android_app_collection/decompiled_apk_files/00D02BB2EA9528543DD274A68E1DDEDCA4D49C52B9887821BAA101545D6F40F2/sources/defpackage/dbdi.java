package defpackage;

import com.google.ar.sceneform.animation.ModelAnimationData;
/* compiled from: PG */
/* renamed from: dbdi  reason: default package */
/* loaded from: classes5.dex */
public final class dbdi implements Runnable {
    private final long a;

    public dbdi(long j) {
        this.a = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j = this.a;
        if (j == 0) {
            return;
        }
        ModelAnimationData.destroyAnimationDataNative(j);
    }
}
