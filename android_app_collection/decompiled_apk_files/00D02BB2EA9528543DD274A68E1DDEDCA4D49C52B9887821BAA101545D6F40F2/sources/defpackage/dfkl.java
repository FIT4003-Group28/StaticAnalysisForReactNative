package defpackage;

import android.view.Choreographer;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dfkl  reason: default package */
/* loaded from: classes6.dex */
public final class dfkl implements Choreographer.FrameCallback, Runnable {
    final /* synthetic */ dfkm a;

    public dfkl(dfkm dfkmVar) {
        this.a = dfkmVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.a.b();
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.b();
    }
}
