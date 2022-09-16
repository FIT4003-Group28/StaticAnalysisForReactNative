package defpackage;

import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
/* compiled from: PG */
/* renamed from: ooy  reason: default package */
/* loaded from: classes3.dex */
public final class ooy {
    final /* synthetic */ opc a;

    public ooy(opc opcVar) {
        this.a = opcVar;
    }

    public final void a(final PlaybackStartDescriptor playbackStartDescriptor) {
        this.a.v.execute(new Runnable() { // from class: oox
            @Override // java.lang.Runnable
            public final void run() {
                ooy ooyVar = ooy.this;
                PlaybackStartDescriptor playbackStartDescriptor2 = playbackStartDescriptor;
                opc opcVar = ooyVar.a;
                opcVar.k(playbackStartDescriptor2, opcVar.f);
            }
        });
    }
}
