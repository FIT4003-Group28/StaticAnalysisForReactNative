package defpackage;

import android.text.TextUtils;
import android.util.Pair;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
/* compiled from: PG */
/* renamed from: ifw  reason: default package */
/* loaded from: classes3.dex */
public final class ifw implements aikx {
    private final igh a;
    private final aadd b;

    public ifw(igh ighVar, aadd aaddVar) {
        this.a = ighVar;
        this.b = aaddVar;
    }

    @Override // defpackage.aikx
    public final Pair a(PlaybackStartDescriptor playbackStartDescriptor, String str, aijp aijpVar, boolean z) {
        if (((ReelWatchEndpointOuterClass$ReelWatchEndpoint) playbackStartDescriptor.b.qm(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) == null) {
            return new Pair(null, null);
        }
        playbackStartDescriptor.l();
        return new Pair(d(str, playbackStartDescriptor, aijpVar, z), c(playbackStartDescriptor));
    }

    @Override // defpackage.aikx
    public final ankt b(PlaybackStartDescriptor playbackStartDescriptor, String str, int i, aijp aijpVar) {
        return null;
    }

    @Override // defpackage.aikx
    public final ankt c(PlaybackStartDescriptor playbackStartDescriptor) {
        afze afzeVar = new afze();
        afzeVar.o(null);
        return afzeVar;
    }

    @Override // defpackage.aikx
    public final ankt d(String str, PlaybackStartDescriptor playbackStartDescriptor, aijp aijpVar, boolean z) {
        apzg apzgVar = playbackStartDescriptor.b;
        if (((ReelWatchEndpointOuterClass$ReelWatchEndpoint) apzgVar.qm(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) == null) {
            return null;
        }
        afze afzeVar = new afze();
        this.a.e(apzgVar, str, false, aanr.h(this.b, playbackStartDescriptor.f(), str, playbackStartDescriptor.c(), aijpVar.h, playbackStartDescriptor.z()) != null && !TextUtils.isEmpty(playbackStartDescriptor.l()), afzj.a, afzeVar);
        return afzeVar;
    }
}
