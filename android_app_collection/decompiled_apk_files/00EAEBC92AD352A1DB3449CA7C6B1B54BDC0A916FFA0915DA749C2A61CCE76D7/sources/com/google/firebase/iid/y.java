package com.google.firebase.iid;

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
import android.util.Log;
import android.util.SparseArray;
import com.google.firebase.iid.y;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class y {

    /* renamed from: e  reason: collision with root package name */
    private static y f9307e;

    /* renamed from: a  reason: collision with root package name */
    private final Context f9308a;

    /* renamed from: b  reason: collision with root package name */
    private final ScheduledExecutorService f9309b;

    /* renamed from: c  reason: collision with root package name */
    private b f9310c = new b();

    /* renamed from: d  reason: collision with root package name */
    private int f9311d = 1;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b implements ServiceConnection {

        /* renamed from: a  reason: collision with root package name */
        int f9312a;

        /* renamed from: b  reason: collision with root package name */
        final Messenger f9313b;

        /* renamed from: c  reason: collision with root package name */
        c f9314c;

        /* renamed from: d  reason: collision with root package name */
        final Queue<e<?>> f9315d;

        /* renamed from: e  reason: collision with root package name */
        final SparseArray<e<?>> f9316e;

        private b() {
            this.f9312a = 0;
            this.f9313b = new Messenger(new c.e.a.b.d.d.e(Looper.getMainLooper(), new Handler.Callback(this) { // from class: com.google.firebase.iid.z

                /* renamed from: a  reason: collision with root package name */
                private final y.b f9332a;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.f9332a = this;
                }

                @Override // android.os.Handler.Callback
                public final boolean handleMessage(Message message) {
                    return this.f9332a.a(message);
                }
            }));
            this.f9315d = new ArrayDeque();
            this.f9316e = new SparseArray<>();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final /* synthetic */ void a() {
            a(2, "Service disconnected");
        }

        synchronized void a(int i) {
            e<?> eVar = this.f9316e.get(i);
            if (eVar != null) {
                StringBuilder sb = new StringBuilder(31);
                sb.append("Timing out request: ");
                sb.append(i);
                Log.w("MessengerIpcClient", sb.toString());
                this.f9316e.remove(i);
                eVar.a(new f(3, "Timed out waiting for response"));
                f();
            }
        }

        synchronized void a(int i, String str) {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                String valueOf = String.valueOf(str);
                Log.d("MessengerIpcClient", valueOf.length() != 0 ? "Disconnected: ".concat(valueOf) : new String("Disconnected: "));
            }
            int i2 = this.f9312a;
            if (i2 != 0) {
                if (i2 == 1 || i2 == 2) {
                    if (Log.isLoggable("MessengerIpcClient", 2)) {
                        Log.v("MessengerIpcClient", "Unbinding service");
                    }
                    this.f9312a = 4;
                    com.google.android.gms.common.stats.a.a().a(y.this.f9308a, this);
                    a(new f(i, str));
                    return;
                } else if (i2 == 3) {
                    this.f9312a = 4;
                    return;
                } else if (i2 == 4) {
                    return;
                } else {
                    int i3 = this.f9312a;
                    StringBuilder sb = new StringBuilder(26);
                    sb.append("Unknown state: ");
                    sb.append(i3);
                    throw new IllegalStateException(sb.toString());
                }
            }
            throw new IllegalStateException();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final /* synthetic */ void a(IBinder iBinder) {
            synchronized (this) {
                try {
                    if (iBinder == null) {
                        a(0, "Null service connection");
                        return;
                    }
                    try {
                        this.f9314c = new c(iBinder);
                        this.f9312a = 2;
                        c();
                    } catch (RemoteException e2) {
                        a(0, e2.getMessage());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        void a(f fVar) {
            for (e<?> eVar : this.f9315d) {
                eVar.a(fVar);
            }
            this.f9315d.clear();
            for (int i = 0; i < this.f9316e.size(); i++) {
                this.f9316e.valueAt(i).a(fVar);
            }
            this.f9316e.clear();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean a(Message message) {
            int i = message.arg1;
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                StringBuilder sb = new StringBuilder(41);
                sb.append("Received response to request: ");
                sb.append(i);
                Log.d("MessengerIpcClient", sb.toString());
            }
            synchronized (this) {
                e<?> eVar = this.f9316e.get(i);
                if (eVar != null) {
                    this.f9316e.remove(i);
                    f();
                    eVar.a(message.getData());
                    return true;
                }
                StringBuilder sb2 = new StringBuilder(50);
                sb2.append("Received response for unknown request: ");
                sb2.append(i);
                Log.w("MessengerIpcClient", sb2.toString());
                return true;
            }
        }

        synchronized boolean a(e<?> eVar) {
            int i = this.f9312a;
            if (i == 0) {
                this.f9315d.add(eVar);
                d();
                return true;
            } else if (i == 1) {
                this.f9315d.add(eVar);
                return true;
            } else if (i == 2) {
                this.f9315d.add(eVar);
                c();
                return true;
            } else {
                if (i != 3 && i != 4) {
                    int i2 = this.f9312a;
                    StringBuilder sb = new StringBuilder(26);
                    sb.append("Unknown state: ");
                    sb.append(i2);
                    throw new IllegalStateException(sb.toString());
                }
                return false;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final /* synthetic */ void b() {
            final e<?> poll;
            while (true) {
                synchronized (this) {
                    if (this.f9312a != 2) {
                        return;
                    }
                    if (this.f9315d.isEmpty()) {
                        f();
                        return;
                    }
                    poll = this.f9315d.poll();
                    this.f9316e.put(poll.f9320a, poll);
                    y.this.f9309b.schedule(new Runnable(this, poll) { // from class: com.google.firebase.iid.e0

                        /* renamed from: b  reason: collision with root package name */
                        private final y.b f9217b;

                        /* renamed from: c  reason: collision with root package name */
                        private final y.e f9218c;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.f9217b = this;
                            this.f9218c = poll;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f9217b.b(this.f9218c);
                        }
                    }, 30L, TimeUnit.SECONDS);
                }
                c(poll);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final /* synthetic */ void b(e eVar) {
            a(eVar.f9320a);
        }

        void c() {
            y.this.f9309b.execute(new Runnable(this) { // from class: com.google.firebase.iid.c0

                /* renamed from: b  reason: collision with root package name */
                private final y.b f9213b;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.f9213b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f9213b.b();
                }
            });
        }

        void c(e<?> eVar) {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                String valueOf = String.valueOf(eVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 8);
                sb.append("Sending ");
                sb.append(valueOf);
                Log.d("MessengerIpcClient", sb.toString());
            }
            try {
                this.f9314c.a(eVar.a(y.this.f9308a, this.f9313b));
            } catch (RemoteException e2) {
                a(2, e2.getMessage());
            }
        }

        void d() {
            com.google.android.gms.common.internal.s.b(this.f9312a == 0);
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Starting bind to GmsCore");
            }
            this.f9312a = 1;
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            if (!com.google.android.gms.common.stats.a.a().a(y.this.f9308a, intent, this, 1)) {
                a(0, "Unable to bind to service");
            } else {
                y.this.f9309b.schedule(new Runnable(this) { // from class: com.google.firebase.iid.a0

                    /* renamed from: b  reason: collision with root package name */
                    private final y.b f9206b;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.f9206b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f9206b.e();
                    }
                }, 30L, TimeUnit.SECONDS);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public synchronized void e() {
            if (this.f9312a == 1) {
                a(1, "Timed out while binding");
            }
        }

        synchronized void f() {
            if (this.f9312a == 2 && this.f9315d.isEmpty() && this.f9316e.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.f9312a = 3;
                com.google.android.gms.common.stats.a.a().a(y.this.f9308a, this);
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Service connected");
            }
            y.this.f9309b.execute(new Runnable(this, iBinder) { // from class: com.google.firebase.iid.b0

                /* renamed from: b  reason: collision with root package name */
                private final y.b f9209b;

                /* renamed from: c  reason: collision with root package name */
                private final IBinder f9210c;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.f9209b = this;
                    this.f9210c = iBinder;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f9209b.a(this.f9210c);
                }
            });
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Service disconnected");
            }
            y.this.f9309b.execute(new Runnable(this) { // from class: com.google.firebase.iid.d0

                /* renamed from: b  reason: collision with root package name */
                private final y.b f9215b;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.f9215b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f9215b.a();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        private final Messenger f9318a;

        /* renamed from: b  reason: collision with root package name */
        private final i f9319b;

        c(IBinder iBinder) {
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if ("android.os.IMessenger".equals(interfaceDescriptor)) {
                this.f9318a = new Messenger(iBinder);
                this.f9319b = null;
            } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
                this.f9319b = new i(iBinder);
                this.f9318a = null;
            } else {
                String valueOf = String.valueOf(interfaceDescriptor);
                Log.w("MessengerIpcClient", valueOf.length() != 0 ? "Invalid interface descriptor: ".concat(valueOf) : new String("Invalid interface descriptor: "));
                throw new RemoteException();
            }
        }

        void a(Message message) {
            Messenger messenger = this.f9318a;
            if (messenger != null) {
                messenger.send(message);
                return;
            }
            i iVar = this.f9319b;
            if (iVar == null) {
                throw new IllegalStateException("Both messengers are null");
            }
            iVar.a(message);
        }
    }

    /* loaded from: classes.dex */
    private static class d extends e<Void> {
        d(int i, int i2, Bundle bundle) {
            super(i, i2, bundle);
        }

        @Override // com.google.firebase.iid.y.e
        void b(Bundle bundle) {
            if (bundle.getBoolean("ack", false)) {
                a((d) null);
            } else {
                a(new f(4, "Invalid response to one way request"));
            }
        }

        @Override // com.google.firebase.iid.y.e
        boolean b() {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static abstract class e<T> {

        /* renamed from: a  reason: collision with root package name */
        final int f9320a;

        /* renamed from: b  reason: collision with root package name */
        final c.e.a.b.g.i<T> f9321b = new c.e.a.b.g.i<>();

        /* renamed from: c  reason: collision with root package name */
        final int f9322c;

        /* renamed from: d  reason: collision with root package name */
        final Bundle f9323d;

        e(int i, int i2, Bundle bundle) {
            this.f9320a = i;
            this.f9322c = i2;
            this.f9323d = bundle;
        }

        Message a(Context context, Messenger messenger) {
            Message obtain = Message.obtain();
            obtain.what = this.f9322c;
            obtain.arg1 = this.f9320a;
            obtain.replyTo = messenger;
            Bundle bundle = new Bundle();
            bundle.putBoolean("oneWay", b());
            bundle.putString("pkg", context.getPackageName());
            bundle.putBundle("data", this.f9323d);
            obtain.setData(bundle);
            return obtain;
        }

        c.e.a.b.g.h<T> a() {
            return this.f9321b.a();
        }

        void a(Bundle bundle) {
            if (bundle.getBoolean("unsupported", false)) {
                a(new f(4, "Not supported by GmsCore"));
            } else {
                b(bundle);
            }
        }

        void a(f fVar) {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                String valueOf = String.valueOf(this);
                String valueOf2 = String.valueOf(fVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14 + String.valueOf(valueOf2).length());
                sb.append("Failing ");
                sb.append(valueOf);
                sb.append(" with ");
                sb.append(valueOf2);
                Log.d("MessengerIpcClient", sb.toString());
            }
            this.f9321b.a(fVar);
        }

        void a(T t) {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                String valueOf = String.valueOf(this);
                String valueOf2 = String.valueOf(t);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16 + String.valueOf(valueOf2).length());
                sb.append("Finishing ");
                sb.append(valueOf);
                sb.append(" with ");
                sb.append(valueOf2);
                Log.d("MessengerIpcClient", sb.toString());
            }
            this.f9321b.a((c.e.a.b.g.i<T>) t);
        }

        abstract void b(Bundle bundle);

        abstract boolean b();

        public String toString() {
            int i = this.f9322c;
            int i2 = this.f9320a;
            boolean b2 = b();
            StringBuilder sb = new StringBuilder(55);
            sb.append("Request { what=");
            sb.append(i);
            sb.append(" id=");
            sb.append(i2);
            sb.append(" oneWay=");
            sb.append(b2);
            sb.append("}");
            return sb.toString();
        }
    }

    /* loaded from: classes.dex */
    public static class f extends Exception {
        public f(int i, String str) {
            super(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class g extends e<Bundle> {
        g(int i, int i2, Bundle bundle) {
            super(i, i2, bundle);
        }

        @Override // com.google.firebase.iid.y.e
        void b(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle("data");
            if (bundle2 == null) {
                bundle2 = Bundle.EMPTY;
            }
            a((g) bundle2);
        }

        @Override // com.google.firebase.iid.y.e
        boolean b() {
            return false;
        }
    }

    y(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f9309b = scheduledExecutorService;
        this.f9308a = context.getApplicationContext();
    }

    private synchronized int a() {
        int i;
        i = this.f9311d;
        this.f9311d = i + 1;
        return i;
    }

    private synchronized <T> c.e.a.b.g.h<T> a(e<T> eVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(eVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 9);
            sb.append("Queueing ");
            sb.append(valueOf);
            Log.d("MessengerIpcClient", sb.toString());
        }
        if (!this.f9310c.a((e<?>) eVar)) {
            this.f9310c = new b();
            this.f9310c.a((e<?>) eVar);
        }
        return eVar.a();
    }

    public static synchronized y a(Context context) {
        y yVar;
        synchronized (y.class) {
            if (f9307e == null) {
                f9307e = new y(context, c.e.a.b.d.d.a.a().a(1, new com.google.android.gms.common.util.q.a("MessengerIpcClient"), c.e.a.b.d.d.f.f3854a));
            }
            yVar = f9307e;
        }
        return yVar;
    }

    public c.e.a.b.g.h<Void> a(int i, Bundle bundle) {
        return a(new d(a(), i, bundle));
    }

    public c.e.a.b.g.h<Bundle> b(int i, Bundle bundle) {
        return a(new g(a(), i, bundle));
    }
}
