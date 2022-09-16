package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
/* compiled from: PG */
/* renamed from: aicy  reason: default package */
/* loaded from: classes.dex */
final class aicy implements Runnable, aidq {
    private final aids a;
    private final PlaybackStartDescriptor b;
    private final aiec c;
    private final agp d;
    private final aicx e;

    public aicy(aids aidsVar, aicx aicxVar, agp agpVar, PlaybackStartDescriptor playbackStartDescriptor, aiec aiecVar) {
        this.a = aidsVar;
        this.e = aicxVar;
        this.d = agpVar;
        this.b = playbackStartDescriptor;
        this.c = aiecVar;
    }

    @Override // defpackage.aidq
    public final void a(PlayerResponseModel playerResponseModel) {
        if (playerResponseModel == null) {
            this.d.d(new IllegalArgumentException("Empty prefetch response."));
        }
        if (!aijr.i(playerResponseModel.t())) {
            this.d.d(new IllegalArgumentException("Prefetch not playable."));
        }
        aicx aicxVar = this.e;
        agp agpVar = this.d;
        aiec aiecVar = this.c;
        aego aegoVar = (aego) aicxVar.a.get();
        aegoVar.getClass();
        aicw aicwVar = new aicw(aegoVar, agpVar, aiecVar);
        ylr.b();
        aicwVar.a.a(playerResponseModel, playerResponseModel.c().F(), aicwVar.b.a, aicwVar);
    }

    @Override // defpackage.aidq
    public final void b(int i) {
        if (i == 4) {
            this.d.d(new IllegalArgumentException("Prefetch failed."));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ylr.b();
        this.a.a(this.b, this.c.b, this);
    }
}
