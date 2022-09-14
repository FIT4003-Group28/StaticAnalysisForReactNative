package defpackage;

import com.google.ar.sceneform.animation.ModelAnimatorImpl;
/* compiled from: PG */
/* renamed from: dbdl  reason: default package */
/* loaded from: classes5.dex */
public final class dbdl implements Runnable {
    private final long a;

    public dbdl(long j) {
        this.a = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j = this.a;
        if (j == 0) {
            return;
        }
        ModelAnimatorImpl.destroyAnimatorNative(j);
    }
}
