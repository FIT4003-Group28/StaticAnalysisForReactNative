package com.google.android.apps.gmm.ugc.phototaken;

import android.app.AlarmManager;
import android.app.IntentService;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import com.google.android.apps.gmm.ugc.phototaken.PhotoTakenNotifierService;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class PhotoTakenNotifierService extends IntentService {
    public static final String a = String.valueOf(PhotoTakenNotifierService.class.getCanonicalName()).concat(".ACTION_PHOTO_TAKEN");
    public static final String b = String.valueOf(PhotoTakenNotifierService.class.getCanonicalName()).concat(".ACTION_PHOTO_PROCESSING_TIMED_OUT");
    public gdo c;
    public axru d;
    public cdgj e;
    public ckcw f;
    public btvo g;
    public cqat h;
    public bvrv i;
    public AlarmManager j;
    private final cdgi k;

    public PhotoTakenNotifierService() {
        super("PhotoTakenNotifierService()");
        this.k = new cdgc(this);
    }

    public final PendingIntent a(String str) {
        return PendingIntent.getService(this, 0, new Intent(str, Uri.EMPTY, this, PhotoTakenNotifierService.class), 0);
    }

    public final void b(int i) {
        ((ckco) this.f.a(ckdz.p)).a(i - 1);
    }

    @Override // android.app.IntentService, android.app.Service
    public final void onCreate() {
        dxiq.b(this);
        super.onCreate();
        this.c.b();
        this.j = (AlarmManager) getSystemService("alarm");
        this.f.f(ckhc.PHOTO_TAKEN_NOTIFICATION_SERVICE);
        setIntentRedelivery(true);
    }

    @Override // android.app.IntentService, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.c.e();
        this.f.g(ckhc.PHOTO_TAKEN_NOTIFICATION_SERVICE);
        this.i.a();
    }

    @Override // android.app.IntentService
    protected final void onHandleIntent(Intent intent) {
        if (intent != null && intent.getAction().equals(a)) {
            final long b2 = this.h.b();
            if (intent.getData() == null) {
                return;
            }
            Uri data = intent.getData();
            boolean b3 = cdgj.b(data);
            boolean c = cdgj.c(data);
            if (!b3 && !c) {
                b(3);
            } else if (Build.VERSION.SDK_INT != 23 || this.d.a("android.permission.READ_EXTERNAL_STORAGE")) {
                try {
                    final btou btouVar = new btou(this, data, "_data", "datetaken");
                    try {
                        int i = btouVar.i();
                        if (i == 0) {
                            b(4);
                        } else if (i != 1) {
                            b(5);
                        } else if (((Boolean) btouVar.f(new dbrn(this, btouVar) { // from class: cdga
                            private final PhotoTakenNotifierService a;
                            private final btou b;

                            {
                                this.a = this;
                                this.b = btouVar;
                            }

                            @Override // defpackage.dbrn
                            public final Object a(Object obj) {
                                PhotoTakenNotifierService photoTakenNotifierService = this.a;
                                btou btouVar2 = this.b;
                                btos btosVar = (btos) obj;
                                if (!cdgj.a((String) btosVar.a(btouVar2.a("_data")).c(""))) {
                                    photoTakenNotifierService.b(6);
                                    return dbpy.a;
                                }
                                return btosVar.a(btouVar2.c("datetaken"));
                            }
                        }).h(new dbrn(this, b2) { // from class: cdgb
                            private final PhotoTakenNotifierService a;
                            private final long b;

                            {
                                this.a = this;
                                this.b = b2;
                            }

                            @Override // defpackage.dbrn
                            public final Object a(Object obj) {
                                PhotoTakenNotifierService photoTakenNotifierService = this.a;
                                long j = this.b;
                                Long l = (Long) obj;
                                ((ckcp) photoTakenNotifierService.f.a(ckdz.o)).a(TimeUnit.MILLISECONDS.toMinutes(j - l.longValue()));
                                if (l.longValue() < j - TimeUnit.SECONDS.toMillis(photoTakenNotifierService.g.getPhotoTakenNotificationParameters().l)) {
                                    photoTakenNotifierService.b(7);
                                    return false;
                                }
                                return true;
                            }
                        }).c(false)).booleanValue()) {
                            b(1);
                        }
                        btouVar.close();
                    } catch (Throwable th) {
                        try {
                            btouVar.close();
                        } catch (Throwable th2) {
                            deki.a(th, th2);
                        }
                        throw th;
                    }
                } catch (btnv unused) {
                    b(8);
                } catch (btnx unused2) {
                    b(9);
                }
            } else {
                b(2);
            }
            this.e.d(this.k, data);
        }
    }

    @Override // android.app.IntentService, android.app.Service
    public final void onStart(@dzsi Intent intent, int i) {
        if (intent == null || intent.getAction() == null) {
            return;
        }
        String str = b;
        if (str.equals(intent.getAction())) {
            ((ckcn) this.f.a(ckdz.d)).a();
            this.j.cancel(a(str));
            stopSelf();
            return;
        }
        super.onStart(intent, i);
    }
}
