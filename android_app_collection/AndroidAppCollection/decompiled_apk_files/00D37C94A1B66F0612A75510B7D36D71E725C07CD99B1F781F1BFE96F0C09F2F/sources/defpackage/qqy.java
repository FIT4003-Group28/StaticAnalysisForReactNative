package defpackage;

import android.content.ComponentName;
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
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: qqy  reason: default package */
/* loaded from: classes4.dex */
public final class qqy implements ServiceConnection {
    qqz c;
    final /* synthetic */ qre f;
    int a = 0;
    final Messenger b = new Messenger(new rfm(Looper.getMainLooper(), new Handler.Callback() { // from class: qqu
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            qqy qqyVar = qqy.this;
            int i = message.arg1;
            synchronized (qqyVar) {
                qrb qrbVar = (qrb) qqyVar.e.get(i);
                if (qrbVar == null) {
                    StringBuilder sb = new StringBuilder(50);
                    sb.append("Received response for unknown request: ");
                    sb.append(i);
                    Log.w("MessengerIpcClient", sb.toString());
                    return true;
                }
                qqyVar.e.remove(i);
                qqyVar.d();
                Bundle data = message.getData();
                if (data.getBoolean("unsupported", false)) {
                    qrbVar.c(new qrc("Not supported by GmsCore"));
                    return true;
                }
                qrbVar.a(data);
                return true;
            }
        }
    }));
    final Queue d = new ArrayDeque();
    final SparseArray e = new SparseArray();

    public qqy(qre qreVar) {
        this.f = qreVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.f.b.execute(new qqv(this));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void b() {
        if (this.a == 1) {
            g("Timed out while binding");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void c(int i) {
        qrb qrbVar = (qrb) this.e.get(i);
        if (qrbVar != null) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("Timing out request: ");
            sb.append(i);
            Log.w("MessengerIpcClient", sb.toString());
            this.e.remove(i);
            qrbVar.c(new qrc("Timed out waiting for response"));
            d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void d() {
        if (this.a == 2 && this.d.isEmpty() && this.e.size() == 0) {
            this.a = 3;
            qyf.a().b(this.f.a, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void g(String str) {
        f(str, null);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        this.f.b.execute(new Runnable() { // from class: qqw
            @Override // java.lang.Runnable
            public final void run() {
                qqy qqyVar = qqy.this;
                IBinder iBinder2 = iBinder;
                synchronized (qqyVar) {
                    try {
                        if (iBinder2 == null) {
                            qqyVar.g("Null service connection");
                            return;
                        }
                        try {
                            qqyVar.c = new qqz(iBinder2);
                            qqyVar.a = 2;
                            qqyVar.a();
                        } catch (RemoteException e) {
                            qqyVar.g(e.getMessage());
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
        this.f.b.execute(new qqv(this, 1));
    }

    final synchronized void f(String str, Throwable th) {
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
            qyf.a().b(this.f.a, this);
            qrc qrcVar = new qrc(str, th);
            for (qrb qrbVar : this.d) {
                qrbVar.c(qrcVar);
            }
            this.d.clear();
            for (int i2 = 0; i2 < this.e.size(); i2++) {
                ((qrb) this.e.valueAt(i2)).c(qrcVar);
            }
            this.e.clear();
            return;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean e(qrb qrbVar) {
        int i = this.a;
        boolean z = false;
        if (i != 0) {
            if (i == 1) {
                this.d.add(qrbVar);
                return true;
            } else if (i != 2) {
                return false;
            } else {
                this.d.add(qrbVar);
                a();
                return true;
            }
        }
        this.d.add(qrbVar);
        if (this.a == 0) {
            z = true;
        }
        qnm.j(z);
        this.a = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            if (qyf.a().c(this.f.a, intent, this, 1)) {
                this.f.b.schedule(new qqv(this, 2), 30L, TimeUnit.SECONDS);
            } else {
                g("Unable to bind to service");
            }
        } catch (SecurityException e) {
            f("Unable to bind to service", e);
        }
        return true;
    }
}
