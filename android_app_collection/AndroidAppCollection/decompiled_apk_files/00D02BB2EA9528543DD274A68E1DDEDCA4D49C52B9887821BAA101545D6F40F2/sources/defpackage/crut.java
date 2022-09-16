package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
/* compiled from: PG */
/* renamed from: crut  reason: default package */
/* loaded from: classes5.dex */
final class crut implements ServiceConnection {
    final /* synthetic */ cruu a;
    final /* synthetic */ Context b;

    public crut(cruu cruuVar, Context context) {
        this.a = cruuVar;
        this.b = context;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.a.a(((crur) iBinder).a);
        this.b.unbindService(this);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
