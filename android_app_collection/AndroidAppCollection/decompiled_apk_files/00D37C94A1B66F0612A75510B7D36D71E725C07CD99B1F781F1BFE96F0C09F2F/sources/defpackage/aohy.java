package defpackage;

import com.google.mediapipe.framework.GlSyncToken;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aohy  reason: default package */
/* loaded from: classes.dex */
public final class aohy extends aoie {
    final /* synthetic */ aohz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aohy(aohz aohzVar, int i, int i2, int i3) {
        super(i, i2, i3);
        this.a = aohzVar;
    }

    @Override // defpackage.aoie, com.google.mediapipe.framework.TextureFrame
    public final void release() {
        super.release();
        this.a.b(this);
    }

    @Override // defpackage.aoie, com.google.mediapipe.framework.TextureFrame, com.google.mediapipe.framework.TextureReleaseCallback
    public final void release(GlSyncToken glSyncToken) {
        super.release(glSyncToken);
        this.a.b(this);
    }
}
