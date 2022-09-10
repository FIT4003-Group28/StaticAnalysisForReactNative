package com.google.firebase.messaging;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLConnection;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class FirebaseMessagingService extends deul {
    private static final Queue<String> a = new ArrayDeque(10);

    public void a(RemoteMessage remoteMessage) {
    }

    public void d() {
    }

    @Override // defpackage.deul
    public final boolean g(Intent intent) {
        if ("com.google.firebase.messaging.NOTIFICATION_OPEN".equals(intent.getAction())) {
            if (!deuz.shouldUploadScionMetrics(intent)) {
                return true;
            }
            deuz.logNotificationOpen(intent);
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.deul
    public final void h(Intent intent) {
        char c;
        String action = intent.getAction();
        if ("com.google.android.c2dm.intent.RECEIVE".equals(action) || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(action)) {
            String stringExtra = intent.getStringExtra("google.message_id");
            if (!TextUtils.isEmpty(stringExtra)) {
                Queue<String> queue = a;
                if (queue.contains(stringExtra)) {
                    return;
                }
                if (queue.size() >= 10) {
                    queue.remove();
                }
                queue.add(stringExtra);
            }
            String stringExtra2 = intent.getStringExtra("message_type");
            if (stringExtra2 == null) {
                stringExtra2 = "gcm";
            }
            switch (stringExtra2.hashCode()) {
                case -2062414158:
                    if (stringExtra2.equals("deleted_messages")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 102161:
                    if (stringExtra2.equals("gcm")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 814694033:
                    if (stringExtra2.equals("send_error")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 814800675:
                    if (stringExtra2.equals("send_event")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c != 0) {
                if (c == 1) {
                    return;
                }
                if (c == 2) {
                    intent.getStringExtra("google.message_id");
                    return;
                } else if (c != 3) {
                    if (stringExtra2.length() != 0) {
                        return;
                    }
                    new String("Received message with unknown type: ");
                    return;
                } else {
                    if (intent.getStringExtra("google.message_id") == null) {
                        intent.getStringExtra("message_id");
                    }
                    new devc(intent.getStringExtra("error"));
                    return;
                }
            }
            deuz.logNotificationReceived(intent);
            Bundle extras = intent.getExtras();
            if (extras == null) {
                extras = new Bundle();
            }
            extras.remove("androidx.content.wakelockid");
            if (deva.isNotification(extras)) {
                deva devaVar = new deva(extras);
                ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new cnxx("Firebase-Messaging-Network-Io"));
                try {
                    if (!devaVar.b("gcm.n.noui")) {
                        if (!((KeyguardManager) getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
                            int myPid = Process.myPid();
                            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) getSystemService("activity")).getRunningAppProcesses();
                            if (runningAppProcesses != null) {
                                Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        ActivityManager.RunningAppProcessInfo next = it.next();
                                        if (next.pid == myPid) {
                                            if (next.importance == 100) {
                                                newSingleThreadExecutor.shutdown();
                                                if (deuz.shouldUploadScionMetrics(intent)) {
                                                    deuz.logNotificationForeground(intent);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        final deuy create = deuy.create(devaVar.a("gcm.n.image"));
                        if (create != null) {
                            create.b = cpda.c(newSingleThreadExecutor, new Callable(create) { // from class: deux
                                private final deuy a;

                                {
                                    this.a = create;
                                }

                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    deuy deuyVar = this.a;
                                    String valueOf = String.valueOf(deuyVar.a);
                                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
                                    sb.append("Starting download of: ");
                                    sb.append(valueOf);
                                    sb.toString();
                                    URLConnection openConnection = deuyVar.a.openConnection();
                                    if (openConnection.getContentLength() > 1048576) {
                                        throw new IOException("Content-Length exceeds max size of 1048576");
                                    }
                                    InputStream inputStream = openConnection.getInputStream();
                                    try {
                                        deuyVar.c = inputStream;
                                        byte[] b = ddak.b(ddak.f(inputStream));
                                        if (inputStream != null) {
                                            inputStream.close();
                                        }
                                        int length = b.length;
                                        if (length <= 1048576) {
                                            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(b, 0, length);
                                            if (decodeByteArray != null) {
                                                return decodeByteArray;
                                            }
                                            String valueOf2 = String.valueOf(deuyVar.a);
                                            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 24);
                                            sb2.append("Failed to decode image: ");
                                            sb2.append(valueOf2);
                                            throw new IOException(sb2.toString());
                                        }
                                        throw new IOException("Image exceeds max size of 1048576");
                                    } catch (Throwable th) {
                                        if (inputStream != null) {
                                            try {
                                                inputStream.close();
                                            } catch (Throwable th2) {
                                                deki.a(th, th2);
                                            }
                                        }
                                        throw th;
                                    }
                                }
                            });
                        }
                        deuc a2 = deud.a(this, devaVar);
                        deug.a(a2.a, create);
                        ((NotificationManager) getSystemService("notification")).notify(a2.b, 0, a2.a.b());
                    }
                    return;
                } finally {
                    newSingleThreadExecutor.shutdown();
                }
            }
            a(new RemoteMessage(extras));
        } else if ("com.google.firebase.messaging.NOTIFICATION_DISMISS".equals(action)) {
            if (!deuz.shouldUploadScionMetrics(intent)) {
                return;
            }
            deuz.logNotificationDismiss(intent);
        } else if ("com.google.firebase.messaging.NEW_TOKEN".equals(action)) {
            intent.getStringExtra("token");
            d();
        } else if (String.valueOf(intent.getAction()).length() != 0) {
        } else {
            new String("Unknown intent action: ");
        }
    }

    @Override // defpackage.deul
    protected final Intent i() {
        return desd.getInstance().c.poll();
    }
}
