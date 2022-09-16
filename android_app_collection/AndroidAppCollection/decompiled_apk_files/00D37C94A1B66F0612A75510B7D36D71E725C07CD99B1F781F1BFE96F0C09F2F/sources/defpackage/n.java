package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
/* compiled from: PG */
/* renamed from: n  reason: default package */
/* loaded from: classes3.dex */
public class n extends Service implements apy {
    private final ab a = new ab(this);

    @Override // defpackage.apy
    public final apu getLifecycle() {
        return this.a.a;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        this.a.a(aps.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.a.a(aps.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        ab abVar = this.a;
        abVar.a(aps.ON_STOP);
        abVar.a(aps.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i) {
        this.a.a(aps.ON_START);
        super.onStart(intent, i);
    }
}
