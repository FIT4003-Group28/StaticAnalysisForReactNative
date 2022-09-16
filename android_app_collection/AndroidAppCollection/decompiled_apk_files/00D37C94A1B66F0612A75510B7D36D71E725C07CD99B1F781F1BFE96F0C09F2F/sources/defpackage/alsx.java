package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: alsx  reason: default package */
/* loaded from: classes.dex */
public final class alsx implements ServiceConnection {
    final /* synthetic */ alsy a;

    public alsx(alsy alsyVar) {
        this.a = alsyVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.a.d(new alsv(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.a.d(new alsw(this));
    }
}
