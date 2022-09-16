package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.libraries.youtube.player.state.PlaybackServiceState;
/* compiled from: PG */
/* renamed from: aire  reason: default package */
/* loaded from: classes.dex */
public interface aire extends ajem, aheu, aizk {
    void a(aiqk aiqkVar);

    boolean b();

    @Override // defpackage.ajem
    void d(PlaybackStartDescriptor playbackStartDescriptor);

    void e(PlaybackStartDescriptor playbackStartDescriptor, aijp aijpVar);

    void f(PlaybackServiceState playbackServiceState);

    void g(PlaybackServiceState playbackServiceState, aijp aijpVar);

    void h(int i);

    boolean i(aiqk aiqkVar);

    void j(PlaybackStartDescriptor playbackStartDescriptor, aijp aijpVar, PlayerResponseModel playerResponseModel);
}
