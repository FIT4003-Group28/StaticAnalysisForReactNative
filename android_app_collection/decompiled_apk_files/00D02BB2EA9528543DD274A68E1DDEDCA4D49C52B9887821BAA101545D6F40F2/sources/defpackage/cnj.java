package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import com.google.android.apps.auto.sdk.nav.ClientMode;
import com.google.android.apps.auto.sdk.nav.NavigationClientConfig;
/* compiled from: PG */
/* renamed from: cnj  reason: default package */
/* loaded from: classes.dex */
public abstract class cnj extends Service {
    public NavigationClientConfig a;
    public final cnb b = new cnb(new Handler(Looper.getMainLooper()));
    public cni c;

    public final synchronized NavigationClientConfig a() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public cnm b() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public cns c() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract int d();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract int e();

    /* JADX INFO: Access modifiers changed from: protected */
    public void f(ClientMode clientMode) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void g() {
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.c;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.c = new cni(this, getApplicationContext());
    }

    @Override // android.app.Service
    public void onDestroy() {
        if (c() != null) {
            c().b.b();
        }
        this.b.b();
        super.onDestroy();
    }
}
