package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
/* compiled from: PG */
/* renamed from: q  reason: default package */
/* loaded from: classes7.dex */
public class q extends Service implements m {
    private final ah a = new ah(this);

    @Override // defpackage.m
    public final k Nh() {
        return this.a.a;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        this.a.a(i.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.a.a(i.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        ah ahVar = this.a;
        ahVar.a(i.ON_STOP);
        ahVar.a(i.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i) {
        this.a.a(i.ON_START);
        super.onStart(intent, i);
    }
}
