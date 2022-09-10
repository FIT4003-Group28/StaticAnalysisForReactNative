package defpackage;

import android.media.session.MediaController;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.PlaybackStateCompat;
/* compiled from: PG */
/* renamed from: mb  reason: default package */
/* loaded from: classes7.dex */
public class mb implements IBinder.DeathRecipient {
    public final MediaController.Callback a = new ly(this);
    lz b;
    public lw c;

    public void a(PlaybackStateCompat playbackStateCompat) {
    }

    public void b(MediaMetadataCompat mediaMetadataCompat) {
        throw null;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        d(8, null, null);
    }

    public final void c(Handler handler) {
        if (handler != null) {
            lz lzVar = new lz(this, handler.getLooper());
            this.b = lzVar;
            lzVar.a = true;
            return;
        }
        lz lzVar2 = this.b;
        if (lzVar2 == null) {
            return;
        }
        lzVar2.a = false;
        lzVar2.removeCallbacksAndMessages(null);
        this.b = null;
    }

    public final void d(int i, Object obj, Bundle bundle) {
        lz lzVar = this.b;
        if (lzVar != null) {
            Message obtainMessage = lzVar.obtainMessage(i, obj);
            obtainMessage.setData(bundle);
            obtainMessage.sendToTarget();
        }
    }
}
