package defpackage;

import android.media.MediaPlayer;
/* compiled from: PG */
/* renamed from: crcm  reason: default package */
/* loaded from: classes5.dex */
final class crcm implements MediaPlayer.OnCompletionListener {
    final /* synthetic */ crcn a;

    public crcm(crcn crcnVar) {
        this.a = crcnVar;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        this.a.g();
    }
}
