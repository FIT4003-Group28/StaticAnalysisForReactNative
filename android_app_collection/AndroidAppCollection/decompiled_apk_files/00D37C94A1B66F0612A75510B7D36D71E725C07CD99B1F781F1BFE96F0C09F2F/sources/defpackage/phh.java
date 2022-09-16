package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
/* compiled from: PG */
/* renamed from: phh  reason: default package */
/* loaded from: classes4.dex */
public final class phh {
    public phg a;
    public float b = 1.0f;
    private final AudioManager c;
    private final phf d;
    private int e;

    public phh(Context context, Handler handler, phg phgVar) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        ptx.a(audioManager);
        this.c = audioManager;
        this.a = phgVar;
        this.d = new phf(this, handler);
        this.e = 0;
    }

    public static final void d() {
        if (!pxi.M(null, null)) {
            ptx.d(true, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
        }
    }

    public final void a() {
        if (this.e == 0) {
            return;
        }
        if (pxi.a < 26) {
            this.c.abandonAudioFocus(this.d);
        }
        c(0);
    }

    public final void b(int i) {
        phg phgVar = this.a;
        if (phgVar != null) {
            pkj pkjVar = (pkj) phgVar;
            boolean D = pkjVar.a.D();
            pkjVar.a.K(D, i, pkl.p(D, i));
        }
    }

    public final void c(int i) {
        if (this.e == i) {
            return;
        }
        this.e = i;
        float f = i == 3 ? 0.2f : 1.0f;
        if (this.b == f) {
            return;
        }
        this.b = f;
        phg phgVar = this.a;
        if (phgVar == null) {
            return;
        }
        ((pkj) phgVar).a.E();
    }

    public final int e(boolean z) {
        a();
        return z ? 1 : -1;
    }
}
