package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
/* compiled from: PG */
/* renamed from: dbbb  reason: default package */
/* loaded from: classes5.dex */
final class dbbb implements ServiceConnection {
    final /* synthetic */ dbbk a;

    public dbbb(dbbk dbbkVar) {
        this.a = dbbkVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.a.d(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.a.e();
    }
}
