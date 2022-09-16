package defpackage;

import com.google.android.apps.youtube.app.extensions.reel.watch.player.ReelSequenceNavigator$ReelSequenceNavigatorState;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.libraries.youtube.player.sequencer.state.OmegaSequencerState;
import com.google.android.libraries.youtube.player.sequencer.state.SequencerState;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
/* compiled from: PG */
/* renamed from: kox  reason: default package */
/* loaded from: classes3.dex */
public final class kox implements aiqc {
    private final igk a;
    private final aipw b;

    public kox(igk igkVar, aipw aipwVar) {
        this.a = igkVar;
        this.b = aipwVar;
    }

    @Override // defpackage.aiqc
    public final aiqb b(PlaybackStartDescriptor playbackStartDescriptor) {
        apzg apzgVar = playbackStartDescriptor.b;
        boolean z = false;
        if (apzgVar != null && apzgVar.qn(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) {
            z = true;
        }
        aqxo.u(z, "[%s] should be reel playback", playbackStartDescriptor);
        return this.b.a(this.a.a());
    }

    @Override // defpackage.aiqc
    public final aiqb c(SequencerState sequencerState) {
        if ((sequencerState instanceof OmegaSequencerState) && (((OmegaSequencerState) sequencerState).c instanceof ReelSequenceNavigator$ReelSequenceNavigatorState)) {
            return this.b.a(this.a.a());
        }
        return null;
    }

    @Override // defpackage.aiqc
    public final /* synthetic */ boolean f(PlaybackStartDescriptor playbackStartDescriptor, aiqb aiqbVar) {
        return false;
    }
}
