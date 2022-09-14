package defpackage;

import com.google.ar.sceneform.animation.ModelSkeletonRig;
/* compiled from: PG */
/* renamed from: dbdn  reason: default package */
/* loaded from: classes5.dex */
public final class dbdn implements Runnable {
    private final long a;

    public dbdn(long j) {
        this.a = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j = this.a;
        if (j == 0) {
            return;
        }
        ModelSkeletonRig.destroySkeletonRigNative(j);
    }
}
