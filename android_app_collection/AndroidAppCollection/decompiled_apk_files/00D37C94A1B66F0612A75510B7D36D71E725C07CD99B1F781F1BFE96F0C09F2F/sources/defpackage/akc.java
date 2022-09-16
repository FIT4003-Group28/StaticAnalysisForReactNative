package defpackage;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.IBinder;
import java.util.ArrayList;
import java.util.HashMap;
/* compiled from: PG */
@Deprecated
/* renamed from: akc  reason: default package */
/* loaded from: classes.dex */
public abstract class akc extends Service {
    static final Object a = new Object();
    static final HashMap b = new HashMap();
    akb c;
    aju d;
    boolean e = false;
    final ArrayList f;
    ajz g;

    public akc() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f = null;
        } else {
            this.f = new ArrayList();
        }
    }

    static akb a(Context context, ComponentName componentName, boolean z, int i) {
        akb ajvVar;
        HashMap hashMap = b;
        akb akbVar = (akb) hashMap.get(componentName);
        if (akbVar == null) {
            if (Build.VERSION.SDK_INT < 26) {
                ajvVar = new ajv(context, componentName);
            } else if (!z) {
                throw new IllegalArgumentException("Can't be here without a job id");
            } else {
                ajvVar = new aka(context, componentName, i);
            }
            akb akbVar2 = ajvVar;
            hashMap.put(componentName, akbVar2);
            return akbVar2;
        }
        return akbVar;
    }

    public static void d(Context context, Class cls, Intent intent) {
        ComponentName componentName = new ComponentName(context, cls);
        synchronized (a) {
            akb a2 = a(context, componentName, true, 1000);
            a2.e(1000);
            a2.a(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(boolean z) {
        if (this.d == null) {
            this.d = new aju(this);
            akb akbVar = this.c;
            if (akbVar != null && z) {
                akbVar.c();
            }
            this.d.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        ArrayList arrayList = this.f;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.d = null;
                ArrayList arrayList2 = this.f;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    b(false);
                } else if (!this.e) {
                    this.c.b();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void e();

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        ajz ajzVar = this.g;
        if (ajzVar != null) {
            return ajzVar.getBinder();
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            this.g = new ajz(this);
            this.c = null;
            return;
        }
        this.g = null;
        this.c = a(this, new ComponentName(this, getClass()), false, 0);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        ArrayList arrayList = this.f;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.e = true;
                this.c.b();
            }
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        if (this.f != null) {
            this.c.d();
            synchronized (this.f) {
                ArrayList arrayList = this.f;
                if (intent == null) {
                    new Intent();
                }
                arrayList.add(new ajw(this, i2));
                b(true);
            }
            return 3;
        }
        return 2;
    }
}
