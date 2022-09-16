package defpackage;

import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: airq  reason: default package */
/* loaded from: classes.dex */
public final class airq {
    final /* synthetic */ airr a;

    public airq(airr airrVar) {
        this.a = airrVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(PlaybackStartDescriptor playbackStartDescriptor, aijp aijpVar, boolean z) {
        ylr.c();
        this.a.r.c();
        if (z) {
            this.a.p.b();
            this.a.o.d();
        }
        ajah ajahVar = this.a.q.a;
        if (ajahVar == null || !ajahVar.Z(playbackStartDescriptor, aijpVar)) {
            this.a.s.e(playbackStartDescriptor, aijpVar);
        }
    }
}
