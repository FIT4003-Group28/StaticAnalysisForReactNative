package com.google.firebase.messaging;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.iid.q0;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* loaded from: classes.dex */
public class FirebaseMessagingService extends g {

    /* renamed from: g  reason: collision with root package name */
    private static final Queue<String> f9426g = new ArrayDeque(10);

    private c.e.a.b.g.h<Void> c(String str) {
        if (TextUtils.isEmpty(str)) {
            return c.e.a.b.g.k.a((Object) null);
        }
        Bundle bundle = new Bundle();
        bundle.putString("google.message_id", str);
        return com.google.firebase.iid.y.a(this).a(2, bundle);
    }

    private void d(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        extras.remove("androidx.content.wakelockid");
        if (r.a(extras)) {
            r rVar = new r(extras);
            ExecutorService b2 = h.b();
            try {
                if (new c(this, rVar, b2).a()) {
                    return;
                }
                if (q.t(intent)) {
                    q.p(intent);
                }
            } finally {
                b2.shutdown();
            }
        }
        a(new s(extras));
    }

    private boolean d(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (!f9426g.contains(str)) {
            if (f9426g.size() >= 10) {
                f9426g.remove();
            }
            f9426g.add(str);
            return false;
        } else if (!Log.isLoggable("FirebaseMessaging", 3)) {
            return true;
        } else {
            String valueOf = String.valueOf(str);
            Log.d("FirebaseMessaging", valueOf.length() != 0 ? "Received duplicate message: ".concat(valueOf) : new String("Received duplicate message: "));
            return true;
        }
    }

    private String e(Intent intent) {
        String stringExtra = intent.getStringExtra("google.message_id");
        return stringExtra == null ? intent.getStringExtra("message_id") : stringExtra;
    }

    private void f(Intent intent) {
        String stringExtra = intent.getStringExtra("google.message_id");
        c.e.a.b.g.h<Void> c2 = c(stringExtra);
        if (!d(stringExtra)) {
            h(intent);
        }
        try {
            c.e.a.b.g.k.a(c2, a(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            String valueOf = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
            sb.append("Message ack failed: ");
            sb.append(valueOf);
            Log.w("FirebaseMessaging", sb.toString());
        }
    }

    private void g(Intent intent) {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
                Log.e("FirebaseMessaging", "Notification pending intent canceled");
            }
        }
        if (q.t(intent)) {
            q.q(intent);
        }
    }

    private void h(Intent intent) {
        String stringExtra = intent.getStringExtra("message_type");
        if (stringExtra == null) {
            stringExtra = "gcm";
        }
        char c2 = 65535;
        switch (stringExtra.hashCode()) {
            case -2062414158:
                if (stringExtra.equals("deleted_messages")) {
                    c2 = 1;
                    break;
                }
                break;
            case 102161:
                if (stringExtra.equals("gcm")) {
                    c2 = 0;
                    break;
                }
                break;
            case 814694033:
                if (stringExtra.equals("send_error")) {
                    c2 = 3;
                    break;
                }
                break;
            case 814800675:
                if (stringExtra.equals("send_event")) {
                    c2 = 2;
                    break;
                }
                break;
        }
        if (c2 == 0) {
            if (q.t(intent)) {
                q.a(intent, (c.e.a.a.f<String>) null);
            }
            if (q.s(intent)) {
                c.e.a.a.g c3 = FirebaseMessaging.c();
                if (c3 != null) {
                    q.a(intent, c3.a("FCM_CLIENT_EVENT_LOGGING", String.class, c.e.a.a.b.a("json"), m.f9468a));
                } else {
                    Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
                }
            }
            d(intent);
        } else if (c2 == 1) {
            b();
        } else if (c2 == 2) {
            a(intent.getStringExtra("google.message_id"));
        } else if (c2 == 3) {
            a(e(intent), new u(intent.getStringExtra("error")));
        } else {
            String valueOf = String.valueOf(stringExtra);
            Log.w("FirebaseMessaging", valueOf.length() != 0 ? "Received message with unknown type: ".concat(valueOf) : new String("Received message with unknown type: "));
        }
    }

    long a() {
        return TimeUnit.SECONDS.toMillis(1L);
    }

    @Override // com.google.firebase.messaging.g
    protected Intent a(Intent intent) {
        return q0.b().a();
    }

    public void a(s sVar) {
    }

    public void a(String str) {
    }

    public void a(String str, Exception exc) {
    }

    public void b() {
    }

    @Override // com.google.firebase.messaging.g
    public void b(Intent intent) {
        String action = intent.getAction();
        if ("com.google.android.c2dm.intent.RECEIVE".equals(action) || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(action)) {
            f(intent);
        } else if ("com.google.firebase.messaging.NOTIFICATION_DISMISS".equals(action)) {
            if (!q.t(intent)) {
                return;
            }
            q.o(intent);
        } else if ("com.google.firebase.messaging.NEW_TOKEN".equals(action)) {
            b(intent.getStringExtra("token"));
        } else {
            String valueOf = String.valueOf(intent.getAction());
            Log.d("FirebaseMessaging", valueOf.length() != 0 ? "Unknown intent action: ".concat(valueOf) : new String("Unknown intent action: "));
        }
    }

    public void b(String str) {
    }

    @Override // com.google.firebase.messaging.g
    public boolean c(Intent intent) {
        if ("com.google.firebase.messaging.NOTIFICATION_OPEN".equals(intent.getAction())) {
            g(intent);
            return true;
        }
        return false;
    }
}
