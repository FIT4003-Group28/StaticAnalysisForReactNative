package com.google.firebase.messaging;

import android.content.Context;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class FirebaseMessaging {
    static clcw e;
    public final dela a;
    public final FirebaseInstanceId b;
    public final deuq c;
    public final Executor d;
    private final Context f;
    private final cpcq<devi> g;

    public FirebaseMessaging(dela delaVar, final FirebaseInstanceId firebaseInstanceId, desq<devr> desqVar, desq<derf> desqVar2, desz deszVar, clcw clcwVar, dera deraVar) {
        try {
            Class.forName("com.google.firebase.iid.FirebaseInstanceIdReceiver");
            e = clcwVar;
            this.a = delaVar;
            this.b = firebaseInstanceId;
            this.c = new deuq(this, deraVar);
            Context a = delaVar.a();
            this.f = a;
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new cnxx("Firebase-Messaging-Init"));
            this.d = scheduledThreadPoolExecutor;
            scheduledThreadPoolExecutor.execute(new Runnable(this, firebaseInstanceId) { // from class: deum
                private final FirebaseMessaging a;
                private final FirebaseInstanceId b;

                {
                    this.a = this;
                    this.b = firebaseInstanceId;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    FirebaseMessaging firebaseMessaging = this.a;
                    FirebaseInstanceId firebaseInstanceId2 = this.b;
                    if (firebaseMessaging.c.b()) {
                        firebaseInstanceId2.n();
                    }
                }
            });
            cpcq<devi> a2 = devi.a(delaVar, firebaseInstanceId, new derx(a), desqVar, desqVar2, deszVar, a, new ScheduledThreadPoolExecutor(1, new cnxx("Firebase-Messaging-Topics-Io")));
            this.g = a2;
            a2.p(new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new cnxx("Firebase-Messaging-Trigger-Topics-Io")), new cpcl(this) { // from class: deun
                private final FirebaseMessaging a;

                {
                    this.a = this;
                }

                @Override // defpackage.cpcl
                public final void c(Object obj) {
                    devi deviVar = (devi) obj;
                    if (!this.a.c.b() || deviVar.d.a() == null || deviVar.e()) {
                        return;
                    }
                    deviVar.b(0L);
                }
            });
        } catch (ClassNotFoundException unused) {
            throw new IllegalStateException("FirebaseMessaging and FirebaseInstanceId versions not compatible. Update to latest version of firebase-messaging.");
        }
    }

    public static synchronized FirebaseMessaging getInstance() {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = getInstance(dela.getInstance());
        }
        return firebaseMessaging;
    }

    public static clcw getTransportFactory() {
        return e;
    }

    static synchronized FirebaseMessaging getInstance(dela delaVar) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) delaVar.d(FirebaseMessaging.class);
            cnwc.n(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }
}
