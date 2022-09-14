package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.SparseArray;
import com.google.android.gms.cloudmessaging.CloudMessagingMessengerCompat;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cnlv  reason: default package */
/* loaded from: classes5.dex */
public final class cnlv implements ServiceConnection {
    cnlw c;
    final /* synthetic */ cnmb f;
    int a = 0;
    final Messenger b = new Messenger(new cojb(Looper.getMainLooper(), new Handler.Callback(this) { // from class: cnlp
        private final cnlv a;

        {
            this.a = this;
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            cnlv cnlvVar = this.a;
            int i = message.arg1;
            synchronized (cnlvVar) {
                cnly<?> cnlyVar = cnlvVar.e.get(i);
                if (cnlyVar == null) {
                    StringBuilder sb = new StringBuilder(50);
                    sb.append("Received response for unknown request: ");
                    sb.append(i);
                    sb.toString();
                    return true;
                }
                cnlvVar.e.remove(i);
                cnlvVar.c();
                Bundle data = message.getData();
                if (data.getBoolean("unsupported", false)) {
                    cnlyVar.d(new cnlz("Not supported by GmsCore"));
                    return true;
                }
                cnlyVar.b(data);
                return true;
            }
        }
    }));
    final Queue<cnly<?>> d = new ArrayDeque();
    final SparseArray<cnly<?>> e = new SparseArray<>();

    public cnlv(cnmb cnmbVar) {
        this.f = cnmbVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        this.f.b.execute(new Runnable(this) { // from class: cnls
            private final cnlv a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final cnlv cnlvVar = this.a;
                while (true) {
                    synchronized (cnlvVar) {
                        if (cnlvVar.a != 2) {
                            return;
                        }
                        if (!cnlvVar.d.isEmpty()) {
                            final cnly<?> poll = cnlvVar.d.poll();
                            cnlvVar.e.put(poll.a, poll);
                            cnlvVar.f.b.schedule(new Runnable(cnlvVar, poll) { // from class: cnlu
                                private final cnlv a;
                                private final cnly b;

                                {
                                    this.a = cnlvVar;
                                    this.b = poll;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    this.a.e(this.b.a);
                                }
                            }, 30L, TimeUnit.SECONDS);
                            Context context = cnlvVar.f.a;
                            Messenger messenger = cnlvVar.b;
                            Message obtain = Message.obtain();
                            obtain.what = poll.c;
                            obtain.arg1 = poll.a;
                            obtain.replyTo = messenger;
                            Bundle bundle = new Bundle();
                            bundle.putBoolean("oneWay", poll.a());
                            bundle.putString("pkg", context.getPackageName());
                            bundle.putBundle("data", poll.d);
                            obtain.setData(bundle);
                            try {
                                cnlw cnlwVar = cnlvVar.c;
                                Messenger messenger2 = cnlwVar.a;
                                if (messenger2 == null) {
                                    CloudMessagingMessengerCompat cloudMessagingMessengerCompat = cnlwVar.b;
                                    if (cloudMessagingMessengerCompat != null) {
                                        cloudMessagingMessengerCompat.a(obtain);
                                    } else {
                                        throw new IllegalStateException("Both messengers are null");
                                        break;
                                    }
                                } else {
                                    messenger2.send(obtain);
                                }
                            } catch (RemoteException e) {
                                cnlvVar.f(e.getMessage());
                            }
                        } else {
                            cnlvVar.c();
                            return;
                        }
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void c() {
        if (this.a == 2 && this.d.isEmpty() && this.e.size() == 0) {
            this.a = 3;
            cnxg.a().c(this.f.a, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void d() {
        if (this.a == 1) {
            f("Timed out while binding");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void e(int i) {
        cnly<?> cnlyVar = this.e.get(i);
        if (cnlyVar != null) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("Timing out request: ");
            sb.append(i);
            sb.toString();
            this.e.remove(i);
            cnlyVar.d(new cnlz("Timed out waiting for response"));
            c();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        this.f.b.execute(new Runnable(this, iBinder) { // from class: cnlr
            private final cnlv a;
            private final IBinder b;

            {
                this.a = this;
                this.b = iBinder;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cnlv cnlvVar = this.a;
                IBinder iBinder2 = this.b;
                synchronized (cnlvVar) {
                    try {
                        if (iBinder2 == null) {
                            cnlvVar.f("Null service connection");
                            return;
                        }
                        try {
                            cnlvVar.c = new cnlw(iBinder2);
                            cnlvVar.a = 2;
                            cnlvVar.b();
                        } catch (RemoteException e) {
                            cnlvVar.f(e.getMessage());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f.b.execute(new Runnable(this) { // from class: cnlt
            private final cnlv a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.f("Service disconnected");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void f(String str) {
        int i = this.a;
        if (i != 0) {
            if (i != 1 && i != 2) {
                if (i != 3) {
                    return;
                }
                this.a = 4;
                return;
            }
            this.a = 4;
            cnxg.a().c(this.f.a, this);
            cnlz cnlzVar = new cnlz(str);
            for (cnly<?> cnlyVar : this.d) {
                cnlyVar.d(cnlzVar);
            }
            this.d.clear();
            for (int i2 = 0; i2 < this.e.size(); i2++) {
                this.e.valueAt(i2).d(cnlzVar);
            }
            this.e.clear();
            return;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean a(cnly<?> cnlyVar) {
        int i = this.a;
        boolean z = false;
        if (i != 0) {
            if (i == 1) {
                this.d.add(cnlyVar);
                return true;
            } else if (i != 2) {
                return false;
            } else {
                this.d.add(cnlyVar);
                b();
                return true;
            }
        }
        this.d.add(cnlyVar);
        if (this.a == 0) {
            z = true;
        }
        cnwc.b(z);
        this.a = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        if (!cnxg.a().b(this.f.a, intent, this, 1)) {
            f("Unable to bind to service");
        } else {
            this.f.b.schedule(new Runnable(this) { // from class: cnlq
                private final cnlv a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.d();
                }
            }, 30L, TimeUnit.SECONDS);
        }
        return true;
    }
}
