package defpackage;

import android.util.Pair;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
/* compiled from: PG */
/* renamed from: agsk  reason: default package */
/* loaded from: classes.dex */
public final class agsk implements aikx {
    private final agub a;
    private final aguk b;

    public agsk(agub agubVar, aguk agukVar) {
        this.a = agubVar;
        this.b = agukVar;
    }

    @Override // defpackage.aikx
    public final Pair a(PlaybackStartDescriptor playbackStartDescriptor, String str, aijp aijpVar, boolean z) {
        return new Pair(this.a.a(playbackStartDescriptor), e(playbackStartDescriptor));
    }

    @Override // defpackage.aikx
    public final ankt b(PlaybackStartDescriptor playbackStartDescriptor, String str, int i, aijp aijpVar) {
        return this.a.b(playbackStartDescriptor);
    }

    @Override // defpackage.aikx
    public final ankt c(PlaybackStartDescriptor playbackStartDescriptor) {
        return e(playbackStartDescriptor);
    }

    @Override // defpackage.aikx
    public final ankt d(String str, PlaybackStartDescriptor playbackStartDescriptor, aijp aijpVar, boolean z) {
        return this.a.a(playbackStartDescriptor);
    }

    protected final ankt e(PlaybackStartDescriptor playbackStartDescriptor) {
        return this.b.b(playbackStartDescriptor, true);
    }
}
