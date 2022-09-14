package defpackage;

import android.view.Choreographer;
/* compiled from: PG */
/* renamed from: csks  reason: default package */
/* loaded from: classes5.dex */
final class csks extends cskt {
    private final Choreographer a = Choreographer.getInstance();

    @Override // defpackage.cskt
    public final void a(cskr cskrVar) {
        this.a.postFrameCallback(cskrVar.b());
    }

    @Override // defpackage.cskt
    public final void b(cskr cskrVar) {
        this.a.removeFrameCallback(cskrVar.b());
    }
}
