package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
/* compiled from: PG */
/* renamed from: qrm  reason: default package */
/* loaded from: classes4.dex */
public final class qrm implements ServiceConnection {
    public boolean a = false;
    public final BlockingQueue b = new LinkedBlockingQueue();
    private final /* synthetic */ int c;

    public qrm() {
    }

    public qrm(int i) {
        this.c = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.c != 0) {
            try {
                this.b.put(iBinder);
                return;
            } catch (InterruptedException unused) {
                return;
            }
        }
        this.b.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
