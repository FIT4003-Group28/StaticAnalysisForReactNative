package defpackage;

import android.app.Notification;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.VibrationEffect;
import android.os.Vibrator;
/* compiled from: PG */
/* renamed from: qsd  reason: default package */
/* loaded from: classes7.dex */
public final class qsd extends affo {
    @dzsi
    public dxio<bvrv> a;
    public dxio<gdo> b;
    @dzsi
    private MediaPlayer c;
    @dzsi
    private Vibrator d;

    private final void a() {
        Vibrator vibrator = (Vibrator) getSystemService("vibrator");
        this.d = vibrator;
        if (vibrator == null) {
            return;
        }
        long[] jArr = {0, 100, 1000};
        if (Build.VERSION.SDK_INT >= 26) {
            this.d.vibrate(VibrationEffect.createWaveform(jArr, 0));
        } else {
            this.d.vibrate(jArr, 0);
        }
    }

    private final void b() {
        MediaPlayer mediaPlayer = this.c;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.c.release();
            this.c = null;
        }
        Vibrator vibrator = this.d;
        if (vibrator != null) {
            vibrator.cancel();
            this.d = null;
        }
    }

    @Override // android.app.Service
    @dzsi
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        dxiq.b(this);
        super.onCreate();
        this.b.a().b();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        b();
        this.b.a().e();
        dxio<bvrv> dxioVar = this.a;
        if (dxioVar != null && dxioVar.a() != null) {
            this.a.a().a();
        }
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        if (intent.getAction() == null) {
            return 2;
        }
        if (intent.getAction().equals(qsa.d)) {
            b();
        } else if (intent.getAction().equals(qsa.e)) {
            stopForeground(true);
            stopSelf();
        } else if (intent.getAction().equals(qsa.c)) {
            startForeground(intent.getIntExtra(qsa.b, 0), (Notification) intent.getParcelableExtra(qsa.a));
            int ringerMode = ((AudioManager) getApplicationContext().getSystemService("audio")).getRingerMode();
            if (ringerMode == 1) {
                a();
            } else if (ringerMode == 2) {
                Uri defaultUri = RingtoneManager.getDefaultUri(4);
                if (defaultUri == null && (defaultUri = RingtoneManager.getDefaultUri(2)) == null && (defaultUri = RingtoneManager.getDefaultUri(1)) == null) {
                    defaultUri = null;
                }
                if (defaultUri != null) {
                    MediaPlayer create = MediaPlayer.create(getApplicationContext(), defaultUri);
                    this.c = create;
                    if (create != null) {
                        create.setLooping(true);
                        this.c.start();
                    }
                }
                a();
            }
        }
        return 2;
    }
}
