package defpackage;

import android.media.session.MediaController;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.PlaybackStateCompat;
/* compiled from: PG */
/* renamed from: ik  reason: default package */
/* loaded from: classes3.dex */
public class ik implements IBinder.DeathRecipient {
    public final MediaController.Callback a = new ii(this);
    ij b;
    public ie c;

    public void a(MediaMetadataCompat mediaMetadataCompat) {
        throw null;
    }

    public void b(PlaybackStateCompat playbackStateCompat) {
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        d(8, null, null);
    }

    public void c() {
        throw null;
    }

    public final void d(int i, Object obj, Bundle bundle) {
        ij ijVar = this.b;
        if (ijVar != null) {
            Message obtainMessage = ijVar.obtainMessage(i, obj);
            obtainMessage.setData(bundle);
            obtainMessage.sendToTarget();
        }
    }

    public final void e(Handler handler) {
        if (handler != null) {
            ij ijVar = new ij(this, handler.getLooper());
            this.b = ijVar;
            ijVar.a = true;
            return;
        }
        ij ijVar2 = this.b;
        if (ijVar2 == null) {
            return;
        }
        ijVar2.a = false;
        ijVar2.removeCallbacksAndMessages(null);
        this.b = null;
    }
}
