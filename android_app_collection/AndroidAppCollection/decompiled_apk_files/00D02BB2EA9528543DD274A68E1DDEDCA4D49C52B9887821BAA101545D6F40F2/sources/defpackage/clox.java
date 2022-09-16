package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: clox  reason: default package */
/* loaded from: classes5.dex */
public final class clox {
    public final Handler a;
    public final clou b;
    public final AudioManager c;
    public int d;
    private final Context e;
    private int f;
    private boolean g;

    public clox(Context context, Handler handler, clou clouVar) {
        Context applicationContext = context.getApplicationContext();
        this.e = applicationContext;
        this.a = handler;
        this.b = clouVar;
        AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
        cmmn.e(audioManager);
        this.c = audioManager;
        this.d = 3;
        this.f = audioManager.getStreamVolume(3);
        this.g = b(audioManager, this.d);
        try {
            applicationContext.registerReceiver(new clow(this), new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
        } catch (RuntimeException e) {
            cmna.a("Error registering stream volume receiver", e);
        }
    }

    private static boolean b(AudioManager audioManager, int i) {
        if (cmny.a >= 23) {
            return audioManager.isStreamMute(i);
        }
        return audioManager.getStreamVolume(i) == 0;
    }

    public final void a() {
        int streamVolume = this.c.getStreamVolume(this.d);
        boolean b = b(this.c, this.d);
        if (this.f == streamVolume && this.g == b) {
            return;
        }
        this.f = streamVolume;
        this.g = b;
        Iterator<cltm> it = ((clos) this.b).a.h.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }
}
