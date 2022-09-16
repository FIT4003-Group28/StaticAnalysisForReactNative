package defpackage;

import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.PlaybackStateCompat;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bfg  reason: default package */
/* loaded from: classes2.dex */
public final class bfg extends ik {
    final /* synthetic */ bfl d;

    public bfg(bfl bflVar) {
        this.d = bflVar;
    }

    @Override // defpackage.ik
    public final void a(MediaMetadataCompat mediaMetadataCompat) {
        this.d.F = mediaMetadataCompat == null ? null : mediaMetadataCompat.b();
        this.d.p();
        this.d.o(false);
    }

    @Override // defpackage.ik
    public final void b(PlaybackStateCompat playbackStateCompat) {
        bfl bflVar = this.d;
        bflVar.E = playbackStateCompat;
        bflVar.o(false);
    }

    @Override // defpackage.ik
    public final void c() {
        bfl bflVar = this.d;
        ip ipVar = bflVar.C;
        if (ipVar != null) {
            ipVar.e(bflVar.D);
            this.d.C = null;
        }
    }
}
