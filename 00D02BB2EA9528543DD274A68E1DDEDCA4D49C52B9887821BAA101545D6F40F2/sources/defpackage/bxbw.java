package defpackage;

import android.view.Choreographer;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bxbw  reason: default package */
/* loaded from: classes4.dex */
public final class bxbw implements Choreographer.FrameCallback {
    final /* synthetic */ bxbx a;

    public bxbw(bxbx bxbxVar) {
        this.a = bxbxVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        bxbx bxbxVar = this.a;
        bxbxVar.c = false;
        bxbxVar.b.b();
    }
}
