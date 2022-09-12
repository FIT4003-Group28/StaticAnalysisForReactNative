package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
/* compiled from: PG */
/* renamed from: aht  reason: default package */
/* loaded from: classes2.dex */
public abstract class aht implements ServiceConnection {
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
    }
}
