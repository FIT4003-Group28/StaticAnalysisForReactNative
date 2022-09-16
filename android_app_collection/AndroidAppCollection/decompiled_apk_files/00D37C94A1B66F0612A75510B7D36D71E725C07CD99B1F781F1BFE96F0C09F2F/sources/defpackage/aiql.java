package defpackage;

import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.libraries.youtube.player.sequencer.state.SequenceNavigatorState;
/* compiled from: PG */
/* renamed from: aiql  reason: default package */
/* loaded from: classes.dex */
public interface aiql {
    PlaybackStartDescriptor a(aiqk aiqkVar);

    aijp b(aiqk aiqkVar);

    aiqk c(PlaybackStartDescriptor playbackStartDescriptor, aijp aijpVar);

    SequenceNavigatorState d();

    void e(boolean z);

    void f(aiqk aiqkVar, PlaybackStartDescriptor playbackStartDescriptor);

    void g();

    void h(WatchNextResponseModel watchNextResponseModel);

    boolean i();

    int j(aiqk aiqkVar);

    void k(aipt aiptVar);

    void l(aipt aiptVar);
}
