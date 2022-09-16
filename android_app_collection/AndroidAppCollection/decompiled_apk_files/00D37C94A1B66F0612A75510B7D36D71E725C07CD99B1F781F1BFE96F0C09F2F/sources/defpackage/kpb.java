package defpackage;

import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.libraries.youtube.player.sequencer.navigation.AutoplaySetSequenceNavigator$AutoplaySetSequenceNavigatorState;
import com.google.android.libraries.youtube.player.sequencer.state.OmegaSequencerState;
import com.google.android.libraries.youtube.player.sequencer.state.SequenceNavigatorState;
import com.google.android.libraries.youtube.player.sequencer.state.SequencerState;
/* compiled from: PG */
/* renamed from: kpb  reason: default package */
/* loaded from: classes3.dex */
public final class kpb implements aiqc {
    private final aipq a;
    private final aipw b;
    private final aiey c;
    private final axxq d;

    public kpb(aipq aipqVar, aipw aipwVar, aiey aieyVar, axxq axxqVar) {
        this.a = aipqVar;
        this.b = aipwVar;
        this.c = aieyVar;
        this.d = axxqVar;
    }

    @Override // defpackage.aiqc
    public final aiqb b(PlaybackStartDescriptor playbackStartDescriptor) {
        aiql aiqhVar;
        if (!playbackStartDescriptor.k().isEmpty() && this.d.a().booleanValue()) {
            aiqhVar = this.c.b(playbackStartDescriptor);
        } else {
            aiqhVar = new aiqh(playbackStartDescriptor.k(), this.a.d(), jny.d);
        }
        return this.b.a(aiqhVar);
    }

    @Override // defpackage.aiqc
    public final aiqb c(SequencerState sequencerState) {
        if (sequencerState instanceof OmegaSequencerState) {
            SequenceNavigatorState sequenceNavigatorState = ((OmegaSequencerState) sequencerState).c;
            aiqh aiqhVar = sequenceNavigatorState instanceof AutoplaySetSequenceNavigator$AutoplaySetSequenceNavigatorState ? new aiqh((AutoplaySetSequenceNavigator$AutoplaySetSequenceNavigatorState) sequenceNavigatorState, jny.e) : null;
            if (aiqhVar != null) {
                return this.b.a(aiqhVar);
            }
            return null;
        }
        return null;
    }

    @Override // defpackage.aiqc
    public final boolean f(PlaybackStartDescriptor playbackStartDescriptor, aiqb aiqbVar) {
        if (!(aiqbVar instanceof aipv) || !this.d.a().booleanValue()) {
            return false;
        }
        if (playbackStartDescriptor.k().isEmpty()) {
            return ((aipv) aiqbVar).h(aifc.class);
        }
        return ((aipv) aiqbVar).h(aiqh.class);
    }
}
