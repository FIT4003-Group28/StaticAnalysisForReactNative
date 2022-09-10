package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: daiq  reason: default package */
/* loaded from: classes5.dex */
public final class daiq implements ServiceConnection {
    final /* synthetic */ dair a;

    public daiq(dair dairVar) {
        this.a = dairVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.a.b.c("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.a.c(new daio(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.a.b.c("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.a.c(new daip(this));
    }
}
