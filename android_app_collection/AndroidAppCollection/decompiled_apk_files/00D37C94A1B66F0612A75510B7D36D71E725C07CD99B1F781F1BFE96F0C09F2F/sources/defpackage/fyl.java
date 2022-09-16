package defpackage;

import android.view.Choreographer;
/* compiled from: PG */
/* renamed from: fyl  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class fyl implements Choreographer.FrameCallback {
    public static final /* synthetic */ fyl a = new fyl();

    private /* synthetic */ fyl() {
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        fyn.a.a++;
        if (fyn.b.get()) {
            Choreographer.getInstance().postFrameCallback(fyn.c);
        }
    }
}
