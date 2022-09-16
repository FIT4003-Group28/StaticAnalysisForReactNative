package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: pkp  reason: default package */
/* loaded from: classes4.dex */
public final class pkp {
    public final Context a;
    public final Handler b;
    public final AudioManager c;
    public pko d;
    public int e;
    private final pkm f;
    private int g;
    private boolean h;

    public pkp(Context context, Handler handler, pkm pkmVar) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = handler;
        this.f = pkmVar;
        AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
        ptx.b(audioManager);
        this.c = audioManager;
        this.e = 3;
        this.g = c(audioManager, 3);
        this.h = d(audioManager, this.e);
        pko pkoVar = new pko(this);
        try {
            applicationContext.registerReceiver(pkoVar, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.d = pkoVar;
        } catch (RuntimeException e) {
            pns.f("StreamVolumeManager", "Error registering stream volume receiver", e);
        }
    }

    private static int c(AudioManager audioManager, int i) {
        try {
            return audioManager.getStreamVolume(i);
        } catch (RuntimeException e) {
            StringBuilder sb = new StringBuilder(60);
            sb.append("Could not retrieve stream volume for stream type ");
            sb.append(i);
            pns.f("StreamVolumeManager", sb.toString(), e);
            return audioManager.getStreamMaxVolume(i);
        }
    }

    private static boolean d(AudioManager audioManager, int i) {
        if (pxi.a >= 23) {
            return audioManager.isStreamMute(i);
        }
        return c(audioManager, i) == 0;
    }

    public final void a(int i) {
        if (this.e == i) {
            return;
        }
        this.e = i;
        b();
        pkj pkjVar = (pkj) this.f;
        phq t = pkl.t(pkjVar.a.h);
        if (t.equals(pkjVar.a.s)) {
            return;
        }
        pkl pklVar = pkjVar.a;
        pklVar.s = t;
        Iterator it = pklVar.e.iterator();
        while (it.hasNext()) {
            ((pjx) it.next()).X();
        }
    }

    public final void b() {
        int c = c(this.c, this.e);
        boolean d = d(this.c, this.e);
        if (this.g == c && this.h == d) {
            return;
        }
        this.g = c;
        this.h = d;
        Iterator it = ((pkj) this.f).a.e.iterator();
        while (it.hasNext()) {
            ((pjx) it.next()).Y();
        }
    }
}
