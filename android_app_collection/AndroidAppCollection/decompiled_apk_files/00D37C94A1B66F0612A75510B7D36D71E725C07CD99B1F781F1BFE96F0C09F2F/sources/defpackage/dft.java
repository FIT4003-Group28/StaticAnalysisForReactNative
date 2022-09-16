package defpackage;

import android.view.Choreographer;
/* compiled from: PG */
/* renamed from: dft  reason: default package */
/* loaded from: classes3.dex */
final class dft implements Choreographer.FrameCallback {
    final /* synthetic */ dfv a;

    public dft(dfv dfvVar) {
        this.a = dfvVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.a.d(j);
    }
}
