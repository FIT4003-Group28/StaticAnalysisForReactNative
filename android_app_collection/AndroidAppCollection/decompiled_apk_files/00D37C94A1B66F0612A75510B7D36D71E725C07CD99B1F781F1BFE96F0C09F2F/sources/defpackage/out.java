package defpackage;

import android.media.AudioTrack;
/* compiled from: PG */
/* renamed from: out  reason: default package */
/* loaded from: classes4.dex */
final class out extends Thread {
    final /* synthetic */ AudioTrack a;
    final /* synthetic */ ouz b;

    public out(ouz ouzVar, AudioTrack audioTrack) {
        this.b = ouzVar;
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
