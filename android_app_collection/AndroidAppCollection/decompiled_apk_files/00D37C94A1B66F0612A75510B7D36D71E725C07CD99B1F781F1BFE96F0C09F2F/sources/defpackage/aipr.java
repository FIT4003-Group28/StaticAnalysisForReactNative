package defpackage;

import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.libraries.youtube.player.sequencer.navigation.AutoplaySetSequenceNavigator$AutoplaySetSequenceNavigatorState;
import com.google.android.libraries.youtube.player.sequencer.navigation.VideoIdsSequenceNavigator$VideoIdsSequenceNavigatorState;
import com.google.android.libraries.youtube.player.sequencer.state.OmegaSequencerState;
import com.google.android.libraries.youtube.player.sequencer.state.SequenceNavigatorState;
import com.google.android.libraries.youtube.player.sequencer.state.SequencerState;
/* compiled from: PG */
/* renamed from: aipr  reason: default package */
/* loaded from: classes.dex */
public final class aipr implements aiqc {
    private final aipw a;
    private final aipz b;

    public aipr(aipz aipzVar, aipw aipwVar) {
        this.b = aipzVar;
        this.a = aipwVar;
    }

    @Override // defpackage.aiqc
    public final aiqb b(PlaybackStartDescriptor playbackStartDescriptor) {
        aiql aiqhVar;
        ylr.c();
        aipz aipzVar = this.b;
        playbackStartDescriptor.getClass();
        if (playbackStartDescriptor.m() != null) {
            aiqhVar = new aiqn(playbackStartDescriptor);
        } else {
            aiqhVar = new aiqh(playbackStartDescriptor.k(), aipzVar.a.d(), aipzVar.b);
        }
        return this.a.a(aiqhVar);
    }

    @Override // defpackage.aiqc
    public final aiqb c(SequencerState sequencerState) {
        aiql aiqhVar;
        if (sequencerState == null) {
            return null;
        }
        if (sequencerState instanceof OmegaSequencerState) {
            aipz aipzVar = this.b;
            SequenceNavigatorState sequenceNavigatorState = ((OmegaSequencerState) sequencerState).c;
            if (sequenceNavigatorState instanceof VideoIdsSequenceNavigator$VideoIdsSequenceNavigatorState) {
                aiqhVar = new aiqn((VideoIdsSequenceNavigator$VideoIdsSequenceNavigatorState) sequenceNavigatorState);
            } else {
                aiqhVar = sequenceNavigatorState instanceof AutoplaySetSequenceNavigator$AutoplaySetSequenceNavigatorState ? new aiqh((AutoplaySetSequenceNavigator$AutoplaySetSequenceNavigatorState) sequenceNavigatorState, aipzVar.b) : null;
            }
            if (aiqhVar != null) {
                return this.a.a(aiqhVar);
            }
            return null;
        }
        String valueOf = String.valueOf(sequencerState.getClass().getSimpleName());
        afus.b(1, 10, valueOf.length() != 0 ? "Sequencer state restoration failed: ".concat(valueOf) : new String("Sequencer state restoration failed: "));
        return null;
    }

    @Override // defpackage.aiqc
    public final /* synthetic */ boolean f(PlaybackStartDescriptor playbackStartDescriptor, aiqb aiqbVar) {
        return false;
    }
}
