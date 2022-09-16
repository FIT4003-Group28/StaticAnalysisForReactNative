package defpackage;

import android.media.AudioTrack;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: clse  reason: default package */
/* loaded from: classes5.dex */
public final class clse extends Thread {
    final /* synthetic */ AudioTrack a;
    final /* synthetic */ clsn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public clse(clsn clsnVar, AudioTrack audioTrack) {
        super("ExoPlayer:AudioTrackReleaseThread");
        this.b = clsnVar;
        this.a = audioTrack;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            this.a.flush();
            this.a.release();
        } finally {
            this.b.e.open();
        }
    }
}
