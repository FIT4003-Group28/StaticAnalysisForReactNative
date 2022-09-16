package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
/* compiled from: PG */
/* renamed from: aidd  reason: default package */
/* loaded from: classes.dex */
public final class aidd implements Runnable, aidq {
    private final aids a;
    private final PlaybackStartDescriptor b;
    private final aiec c;
    private final agp d;

    public aidd(aids aidsVar, agp agpVar, PlaybackStartDescriptor playbackStartDescriptor, aiec aiecVar) {
        this.a = aidsVar;
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
        aids aidsVar = this.a;
        PlaybackStartDescriptor playbackStartDescriptor = this.b;
        aiec aiecVar = this.c;
        aidsVar.b(playbackStartDescriptor, aiecVar.b, this, aiecVar.a, null);
    }
}
