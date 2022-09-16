package defpackage;

import android.media.AudioTrack;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: plw  reason: default package */
/* loaded from: classes4.dex */
public final class plw extends Thread {
    final /* synthetic */ AudioTrack a;
    final /* synthetic */ pmf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public plw(pmf pmfVar, AudioTrack audioTrack) {
        super("ExoPlayer:AudioTrackReleaseThread");
        this.b = pmfVar;
        this.a = audioTrack;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            this.a.flush();
            this.a.release();
        } finally {
            this.b.a.open();
        }
    }
}
