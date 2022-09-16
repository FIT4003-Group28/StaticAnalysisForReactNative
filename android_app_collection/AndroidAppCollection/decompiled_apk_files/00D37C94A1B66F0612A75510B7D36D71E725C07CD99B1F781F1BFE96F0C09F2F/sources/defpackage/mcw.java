package defpackage;

import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: mcw  reason: default package */
/* loaded from: classes3.dex */
public final class mcw implements fec {
    private final String a;
    private final long b;
    private final aadd c;

    public mcw(airr airrVar, aadd aaddVar) {
        this.a = airrVar.q();
        this.b = airrVar.n() == null ? 0L : airrVar.n().b();
        this.c = aaddVar;
    }

    @Override // defpackage.fec
    public final void a(PlaybackStartDescriptor playbackStartDescriptor) {
        String str = this.a;
        if (str == null || !str.equals(playbackStartDescriptor.l()) || this.b - playbackStartDescriptor.c() <= eog.k(this.c)) {
            return;
        }
        playbackStartDescriptor.q(this.b);
    }
}
