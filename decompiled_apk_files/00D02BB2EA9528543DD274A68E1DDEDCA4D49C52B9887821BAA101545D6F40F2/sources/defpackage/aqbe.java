package defpackage;

import java.lang.ref.WeakReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aqbe  reason: default package */
/* loaded from: classes2.dex */
public final class aqbe implements Runnable {
    private final WeakReference<aqbo> a;
    private final int b;

    public aqbe(aqbo aqboVar, int i) {
        this.a = new WeakReference<>(aqboVar);
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        aqbo aqboVar = this.a.get();
        if (aqboVar == null) {
            return;
        }
        aqboVar.h(this.b);
    }
}
