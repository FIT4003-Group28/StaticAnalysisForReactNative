package defpackage;

import android.view.Surface;
/* compiled from: PG */
/* renamed from: oua  reason: default package */
/* loaded from: classes4.dex */
final class oua implements Runnable {
    final /* synthetic */ Surface a;
    final /* synthetic */ oud b;

    public oua(oud oudVar, Surface surface) {
        this.b = oudVar;
        this.a = surface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.d(this.a);
    }
}
