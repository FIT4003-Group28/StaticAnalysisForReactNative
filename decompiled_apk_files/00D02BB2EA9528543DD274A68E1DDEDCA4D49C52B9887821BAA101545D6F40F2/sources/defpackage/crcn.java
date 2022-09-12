package defpackage;

import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.media.audiofx.LoudnessEnhancer;
import android.os.Build;
/* compiled from: PG */
/* renamed from: crcn  reason: default package */
/* loaded from: classes5.dex */
public final class crcn extends crbc {
    @dzsi
    public crbb a;
    @dzsi
    private crck b;
    private boolean c;
    private cres d;
    @dzsi
    private MediaPlayer e;
    private final bvrb f;
    private final int g;

    public crcn(MediaPlayer mediaPlayer, cres cresVar, bvrb bvrbVar, int i) {
        this.e = mediaPlayer;
        this.d = cresVar;
        this.f = bvrbVar;
        this.g = i;
        if (Build.VERSION.SDK_INT >= 22) {
            mediaPlayer.setAudioAttributes(new AudioAttributes.Builder().setUsage(12).setContentType(1).build());
        }
        if (ehm.a()) {
            this.b = new crck();
        }
        i();
    }

    private final synchronized void h() {
        MediaPlayer mediaPlayer = this.e;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.e.release();
            this.e = null;
        }
    }

    private final void i() {
        crck crckVar;
        MediaPlayer mediaPlayer = this.e;
        if (mediaPlayer == null) {
            return;
        }
        mediaPlayer.setVolume(1.0f, 1.0f);
        int audioSessionId = this.e.getAudioSessionId();
        if (!ehm.a() || (crckVar = this.b) == null) {
            return;
        }
        int i = this.d.d;
        try {
            crckVar.a = new LoudnessEnhancer(audioSessionId);
            crckVar.a.setEnabled(true);
            crckVar.a(i);
        } catch (Exception unused) {
        }
    }

    @Override // defpackage.crbc
    public final boolean a() {
        this.c = true;
        MediaPlayer mediaPlayer = this.e;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.prepare();
                return true;
            } catch (Exception e) {
                bvoo.j(e);
                MediaPlayer mediaPlayer2 = this.e;
                if (mediaPlayer2 != null) {
                    mediaPlayer2.release();
                    this.e = null;
                    this.c = false;
                }
            }
        }
        return false;
    }

    @Override // defpackage.crbc
    public final synchronized void b(crbb crbbVar) {
        dbsk.l(this.c);
        this.a = crbbVar;
        MediaPlayer mediaPlayer = this.e;
        if (mediaPlayer == null) {
            if (crbbVar == null) {
                return;
            }
            crbbVar.b(this);
            return;
        }
        mediaPlayer.setOnCompletionListener(new crcm(this));
        i();
        crbb crbbVar2 = this.a;
        if (crbbVar2 != null) {
            crbbVar2.a(this);
        }
        MediaPlayer mediaPlayer2 = this.e;
        if (mediaPlayer2 == null) {
            return;
        }
        mediaPlayer2.start();
    }

    @Override // defpackage.crbc
    public final void c() {
        g();
    }

    @Override // defpackage.crbc
    public final long d() {
        MediaPlayer mediaPlayer = this.e;
        return mediaPlayer == null ? -1 : mediaPlayer.getDuration();
    }

    @Override // defpackage.crbc
    public final void e(cres cresVar) {
        crck crckVar;
        this.d = cresVar;
        if (!ehm.a() || (crckVar = this.b) == null) {
            return;
        }
        crckVar.a(cresVar.d);
    }

    @Override // defpackage.crbc
    public final int f() {
        return this.g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g() {
        crck crckVar;
        h();
        if (ehm.a() && (crckVar = this.b) != null) {
            LoudnessEnhancer loudnessEnhancer = crckVar.a;
            if (loudnessEnhancer != null) {
                loudnessEnhancer.release();
                crckVar.a = null;
            }
            this.b = null;
        }
        this.f.b(new Runnable(this) { // from class: crcl
            private final crcn a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                crcn crcnVar = this.a;
                crbb crbbVar = crcnVar.a;
                if (crbbVar != null) {
                    crbbVar.b(crcnVar);
                }
                crcnVar.a = null;
            }
        }, bvrj.UI_THREAD);
    }
}
