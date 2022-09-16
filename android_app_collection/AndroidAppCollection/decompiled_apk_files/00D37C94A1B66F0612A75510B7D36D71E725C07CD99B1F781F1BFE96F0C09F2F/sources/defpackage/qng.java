package defpackage;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.cast.framework.media.CastMediaOptions;
import com.google.android.gms.cast.framework.media.ImageHints;
import com.google.android.gms.cast.framework.media.MediaIntentReceiver;
import com.google.android.gms.cast.framework.media.NotificationAction;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.google.android.gms.common.images.WebImage;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: qng  reason: default package */
/* loaded from: classes4.dex */
public final class qng extends Service {
    public static final qpu a = new qpu("MediaNotificationService");
    public static Runnable b;
    public qnf c;
    public qkp d;
    private NotificationOptions e;
    private ComponentName f;
    private ComponentName g;
    private int[] i;
    private long j;
    private qoj k;
    private ImageHints l;
    private Resources m;
    private qne n;
    private NotificationManager o;
    private Notification p;
    private tnk r;
    private List h = new ArrayList();
    private final BroadcastReceiver q = new qnc(this);

    public static boolean b(CastOptions castOptions) {
        NotificationOptions notificationOptions;
        CastMediaOptions castMediaOptions = castOptions.e;
        if (castMediaOptions == null || (notificationOptions = castMediaOptions.c) == null) {
            return false;
        }
        qna qnaVar = notificationOptions.G;
        if (qnaVar == null) {
            return true;
        }
        List d = d(qnaVar);
        int[] g = g(qnaVar);
        int size = d == null ? 0 : d.size();
        if (d == null || d.isEmpty()) {
            a.b(String.valueOf(qnm.class.getSimpleName()).concat(" doesn't provide any action."), new Object[0]);
        } else if (d.size() > 5) {
            a.b(String.valueOf(qnm.class.getSimpleName()).concat(" provides more than 5 actions."), new Object[0]);
        } else if (g != null && (r2 = g.length) != 0) {
            for (int i : g) {
                if (i < 0 || i >= size) {
                    a.b(String.valueOf(qnm.class.getSimpleName()).concat("provides a compact view action whose index is out of bounds."), new Object[0]);
                }
            }
            return true;
        } else {
            a.b(String.valueOf(qnm.class.getSimpleName()).concat(" doesn't provide any actions for compact view."), new Object[0]);
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final ff c(String str) {
        char c;
        int i;
        int i2;
        switch (str.hashCode()) {
            case -1699820260:
                if (str.equals(MediaIntentReceiver.ACTION_REWIND)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -945151566:
                if (str.equals(MediaIntentReceiver.ACTION_SKIP_NEXT)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -945080078:
                if (str.equals(MediaIntentReceiver.ACTION_SKIP_PREV)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -668151673:
                if (str.equals(MediaIntentReceiver.ACTION_STOP_CASTING)) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -124479363:
                if (str.equals(MediaIntentReceiver.ACTION_DISCONNECT)) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 235550565:
                if (str.equals(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1362116196:
                if (str.equals(MediaIntentReceiver.ACTION_FORWARD)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        PendingIntent pendingIntent = null;
        switch (c) {
            case 0:
                qne qneVar = this.n;
                int i3 = qneVar.c;
                boolean z = qneVar.b;
                if (i3 == 2) {
                    NotificationOptions notificationOptions = this.e;
                    i = notificationOptions.g;
                    i2 = notificationOptions.u;
                } else {
                    NotificationOptions notificationOptions2 = this.e;
                    i = notificationOptions2.h;
                    i2 = notificationOptions2.v;
                }
                if (!z) {
                    i = this.e.i;
                }
                if (!z) {
                    i2 = this.e.w;
                }
                Intent intent = new Intent(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK);
                intent.setComponent(this.f);
                return new fe(i, this.m.getString(i2), rfi.b(this, 0, intent, rfi.a)).a();
            case 1:
                if (this.n.f) {
                    Intent intent2 = new Intent(MediaIntentReceiver.ACTION_SKIP_NEXT);
                    intent2.setComponent(this.f);
                    pendingIntent = rfi.b(this, 0, intent2, rfi.a);
                }
                NotificationOptions notificationOptions3 = this.e;
                return new fe(notificationOptions3.j, this.m.getString(notificationOptions3.x), pendingIntent).a();
            case 2:
                if (this.n.g) {
                    Intent intent3 = new Intent(MediaIntentReceiver.ACTION_SKIP_PREV);
                    intent3.setComponent(this.f);
                    pendingIntent = rfi.b(this, 0, intent3, rfi.a);
                }
                NotificationOptions notificationOptions4 = this.e;
                return new fe(notificationOptions4.k, this.m.getString(notificationOptions4.y), pendingIntent).a();
            case 3:
                long j = this.j;
                Intent intent4 = new Intent(MediaIntentReceiver.ACTION_FORWARD);
                intent4.setComponent(this.f);
                intent4.putExtra(MediaIntentReceiver.EXTRA_SKIP_STEP_MS, j);
                PendingIntent b2 = rfi.b(this, 0, intent4, rfi.a | 134217728);
                NotificationOptions notificationOptions5 = this.e;
                int i4 = notificationOptions5.l;
                int i5 = notificationOptions5.z;
                if (j == 10000) {
                    i4 = notificationOptions5.m;
                    i5 = notificationOptions5.A;
                } else if (j == 30000) {
                    i4 = notificationOptions5.n;
                    i5 = notificationOptions5.B;
                }
                return new fe(i4, this.m.getString(i5), b2).a();
            case 4:
                long j2 = this.j;
                Intent intent5 = new Intent(MediaIntentReceiver.ACTION_REWIND);
                intent5.setComponent(this.f);
                intent5.putExtra(MediaIntentReceiver.EXTRA_SKIP_STEP_MS, j2);
                PendingIntent b3 = rfi.b(this, 0, intent5, rfi.a | 134217728);
                NotificationOptions notificationOptions6 = this.e;
                int i6 = notificationOptions6.o;
                int i7 = notificationOptions6.C;
                if (j2 == 10000) {
                    i6 = notificationOptions6.p;
                    i7 = notificationOptions6.D;
                } else if (j2 == 30000) {
                    i6 = notificationOptions6.q;
                    i7 = notificationOptions6.E;
                }
                return new fe(i6, this.m.getString(i7), b3).a();
            case 5:
                Intent intent6 = new Intent(MediaIntentReceiver.ACTION_STOP_CASTING);
                intent6.setComponent(this.f);
                PendingIntent b4 = rfi.b(this, 0, intent6, rfi.a);
                NotificationOptions notificationOptions7 = this.e;
                return new fe(notificationOptions7.r, this.m.getString(notificationOptions7.F), b4).a();
            case 6:
                Intent intent7 = new Intent(MediaIntentReceiver.ACTION_DISCONNECT);
                intent7.setComponent(this.f);
                PendingIntent b5 = rfi.b(this, 0, intent7, rfi.a);
                NotificationOptions notificationOptions8 = this.e;
                return new fe(notificationOptions8.r, this.m.getString(notificationOptions8.F, ""), b5).a();
            default:
                a.b("Action: %s is not a pre-defined action.", str);
                return null;
        }
    }

    private static List d(qna qnaVar) {
        try {
            return qnaVar.a();
        } catch (RemoteException e) {
            a.c(e, "Unable to call %s on %s.", "getNotificationActions", qna.class.getSimpleName());
            return null;
        }
    }

    private final void e(qna qnaVar) {
        ff c;
        int[] g = g(qnaVar);
        this.i = g == null ? null : (int[]) g.clone();
        List<NotificationAction> d = d(qnaVar);
        this.h = new ArrayList();
        if (d == null) {
            return;
        }
        for (NotificationAction notificationAction : d) {
            String str = notificationAction.a;
            if (str.equals(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK) || str.equals(MediaIntentReceiver.ACTION_SKIP_NEXT) || str.equals(MediaIntentReceiver.ACTION_SKIP_PREV) || str.equals(MediaIntentReceiver.ACTION_FORWARD) || str.equals(MediaIntentReceiver.ACTION_REWIND) || str.equals(MediaIntentReceiver.ACTION_STOP_CASTING) || str.equals(MediaIntentReceiver.ACTION_DISCONNECT)) {
                c = c(notificationAction.a);
            } else {
                Intent intent = new Intent(notificationAction.a);
                intent.setComponent(this.f);
                c = new fe(notificationAction.b, notificationAction.c, rfi.b(this, 0, intent, rfi.a)).a();
            }
            if (c != null) {
                this.h.add(c);
            }
        }
    }

    private final void f() {
        this.h = new ArrayList();
        for (String str : this.e.c) {
            ff c = c(str);
            if (c != null) {
                this.h.add(c);
            }
        }
        this.i = (int[]) this.e.a().clone();
    }

    private static int[] g(qna qnaVar) {
        try {
            return qnaVar.f();
        } catch (RemoteException e) {
            a.c(e, "Unable to call %s on %s.", "getCompactViewActionIndices", qna.class.getSimpleName());
            return null;
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        this.o = (NotificationManager) getSystemService("notification");
        qkp b2 = qkp.b(this);
        this.d = b2;
        CastMediaOptions castMediaOptions = b2.c().e;
        qnm.b(castMediaOptions);
        NotificationOptions notificationOptions = castMediaOptions.c;
        qnm.b(notificationOptions);
        this.e = notificationOptions;
        this.r = castMediaOptions.a();
        this.m = getResources();
        this.f = new ComponentName(getApplicationContext(), castMediaOptions.a);
        if (!TextUtils.isEmpty(this.e.e)) {
            this.g = new ComponentName(getApplicationContext(), this.e.e);
        } else {
            this.g = null;
        }
        NotificationOptions notificationOptions2 = this.e;
        this.j = notificationOptions2.d;
        int dimensionPixelSize = this.m.getDimensionPixelSize(notificationOptions2.s);
        this.l = new ImageHints(1, dimensionPixelSize, dimensionPixelSize);
        this.k = new qoj(getApplicationContext(), this.l);
        ComponentName componentName = this.g;
        if (componentName != null) {
            registerReceiver(this.q, new IntentFilter(componentName.flattenToString()));
        }
        if (!twx.g()) {
            return;
        }
        NotificationChannel notificationChannel = new NotificationChannel("cast_media_notification", "Cast", 2);
        notificationChannel.setShowBadge(false);
        this.o.createNotificationChannel(notificationChannel);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        qoj qojVar = this.k;
        if (qojVar != null) {
            qojVar.a();
        }
        if (this.g != null) {
            try {
                unregisterReceiver(this.q);
            } catch (IllegalArgumentException e) {
                a.c(e, "Unregistering trampoline BroadcastReceiver failed", new Object[0]);
            }
        }
        b = null;
        this.o.cancel(1);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, final int i2) {
        WebImage webImage;
        qne qneVar;
        MediaInfo mediaInfo = (MediaInfo) intent.getParcelableExtra("extra_media_info");
        qnm.b(mediaInfo);
        MediaMetadata mediaMetadata = mediaInfo.d;
        qnm.b(mediaMetadata);
        int intExtra = intent.getIntExtra("extra_remote_media_client_player_state", 0);
        CastDevice castDevice = (CastDevice) intent.getParcelableExtra("extra_cast_device");
        qnm.b(castDevice);
        qne qneVar2 = new qne(intExtra == 2, mediaInfo.b, mediaMetadata.a("com.google.android.gms.cast.metadata.TITLE"), castDevice.d, (MediaSessionCompat$Token) intent.getParcelableExtra("extra_media_session_token"), intent.getBooleanExtra("extra_can_skip_next", false), intent.getBooleanExtra("extra_can_skip_prev", false));
        if (intent.getBooleanExtra("extra_media_notification_force_update", false) || (qneVar = this.n) == null || qneVar2.b != qneVar.b || qneVar2.c != qneVar.c || !qpl.j(qneVar2.d, qneVar.d) || !qpl.j(qneVar2.e, qneVar.e) || qneVar2.f != qneVar.f || qneVar2.g != qneVar.g) {
            this.n = qneVar2;
            a();
        }
        if (this.r != null) {
            int i3 = this.l.a;
            webImage = tnk.k(mediaMetadata);
        } else {
            webImage = mediaMetadata.c() ? (WebImage) mediaMetadata.a.get(0) : null;
        }
        qnf qnfVar = new qnf(webImage);
        qnf qnfVar2 = this.c;
        if (qnfVar2 == null || !qpl.j(qnfVar.a, qnfVar2.a)) {
            this.k.d = new qnd(this, qnfVar);
            this.k.b(qnfVar.a);
        }
        startForeground(1, this.p);
        b = new Runnable() { // from class: qnb
            @Override // java.lang.Runnable
            public final void run() {
                qng.this.stopSelf(i2);
            }
        };
        return 2;
    }

    public final void a() {
        if (this.n == null) {
            return;
        }
        qnf qnfVar = this.c;
        PendingIntent pendingIntent = null;
        Bitmap bitmap = qnfVar == null ? null : qnfVar.b;
        fi fiVar = new fi(this, "cast_media_notification");
        fiVar.n(bitmap);
        fiVar.r(this.e.f);
        fiVar.k(this.n.d);
        fiVar.j(this.m.getString(this.e.t, this.n.e));
        fiVar.o(true);
        fiVar.l = false;
        fiVar.A = 1;
        ComponentName componentName = this.g;
        if (componentName != null) {
            Intent intent = new Intent();
            intent.putExtra("targetActivity", componentName);
            intent.setAction(componentName.flattenToString());
            pendingIntent = rfi.b(this, 1, intent, rfi.a | 134217728);
        }
        if (pendingIntent != null) {
            fiVar.g = pendingIntent;
        }
        qna qnaVar = this.e.G;
        if (qnaVar != null) {
            a.a("actionsProvider != null", new Object[0]);
            e(qnaVar);
        } else {
            a.a("actionsProvider == null", new Object[0]);
            f();
        }
        for (ff ffVar : this.h) {
            fiVar.f(ffVar);
        }
        asi asiVar = new asi();
        int[] iArr = this.i;
        if (iArr != null) {
            asiVar.a = iArr;
        }
        MediaSessionCompat$Token mediaSessionCompat$Token = this.n.a;
        if (mediaSessionCompat$Token != null) {
            asiVar.f = mediaSessionCompat$Token;
        }
        fiVar.s(asiVar);
        Notification b2 = fiVar.b();
        this.p = b2;
        startForeground(1, b2);
    }
}
