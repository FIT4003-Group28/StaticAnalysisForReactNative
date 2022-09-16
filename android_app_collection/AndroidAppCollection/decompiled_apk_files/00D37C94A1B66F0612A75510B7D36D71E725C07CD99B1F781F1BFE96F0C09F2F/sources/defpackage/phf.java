package defpackage;

import android.media.AudioManager;
import android.os.Handler;
import android.util.Log;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: phf  reason: default package */
/* loaded from: classes4.dex */
public final class phf implements AudioManager.OnAudioFocusChangeListener {
    final /* synthetic */ phh a;
    private final Handler b;

    public phf(phh phhVar, Handler handler) {
        this.a = phhVar;
        this.b = handler;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(final int i) {
        this.b.post(new Runnable() { // from class: phe
            @Override // java.lang.Runnable
            public final void run() {
                phf phfVar = phf.this;
                int i2 = i;
                phh phhVar = phfVar.a;
                if (i2 == -3 || i2 == -2) {
                    if (i2 != -2) {
                        phhVar.c(3);
                        return;
                    }
                    phhVar.b(0);
                    phhVar.c(2);
                } else if (i2 == -1) {
                    phhVar.b(-1);
                    phhVar.a();
                } else if (i2 == 1) {
                    phhVar.c(1);
                    phhVar.b(1);
                } else {
                    StringBuilder sb = new StringBuilder(38);
                    sb.append("Unknown focus change type: ");
                    sb.append(i2);
                    Log.w("AudioFocusManager", sb.toString());
                }
            }
        });
    }
}
