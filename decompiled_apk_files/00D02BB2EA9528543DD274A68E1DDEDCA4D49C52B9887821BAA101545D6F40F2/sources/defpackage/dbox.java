package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
@Deprecated
/* renamed from: dbox  reason: default package */
/* loaded from: classes5.dex */
public final class dbox implements ServiceConnection {
    public final Context b;
    public CountDownLatch e;
    public final Executor a = Executors.newSingleThreadExecutor();
    public final AtomicReference<dbou> c = new AtomicReference<>();
    public volatile dboo f = null;
    public volatile boolean d = true;

    public dbox(Context context) {
        this.b = context;
    }

    public final void a() {
        dbou dbouVar = this.c.get();
        if (dbouVar == null) {
            if (this.f != null) {
                if (this.d) {
                    throw new dbou("Disconnected from service");
                }
                return;
            }
            throw new dbou("Service not yet connected");
        }
        throw dbouVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        dboo dbooVar;
        if (iBinder == null) {
            dbooVar = null;
        } else {
            try {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.commerce.tapandpay.android.seclient.ISecureElementService");
                if (queryLocalInterface instanceof dboo) {
                    dbooVar = (dboo) queryLocalInterface;
                } else {
                    dbooVar = new dboo(iBinder);
                }
            } catch (Exception e) {
                this.c.set(new dbou("Unable to initialize service object (binder null?)", e));
                this.e.countDown();
                return;
            }
        }
        this.f = dbooVar;
        if (this.f == null) {
            this.c.set(new dbou("Initialized service object invalid (null)"));
            this.e.countDown();
            return;
        }
        this.c.set(null);
        this.e.countDown();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.c.set(new dbou("Unexpectedly lost connection to service"));
        this.e.countDown();
    }
}
