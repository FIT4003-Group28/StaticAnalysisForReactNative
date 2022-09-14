package defpackage;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.IBinder;
import java.util.ArrayList;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: akh  reason: default package */
/* loaded from: classes2.dex */
public abstract class akh extends Service {
    static final HashMap<ComponentName, akg> e = new HashMap<>();
    akg a;
    aka b;
    boolean c = false;
    final ArrayList<akc> d;
    akf f;

    public akh() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.d = null;
        } else {
            this.d = new ArrayList<>();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void a(Intent intent);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(boolean z) {
        if (this.b == null) {
            this.b = new aka(this);
            akg akgVar = this.a;
            if (akgVar != null && z) {
                akgVar.b();
            }
            this.b.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        ArrayList<akc> arrayList = this.d;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.b = null;
                ArrayList<akc> arrayList2 = this.d;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    b(false);
                } else if (!this.c) {
                    this.a.c();
                }
            }
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        akf akfVar = this.f;
        if (akfVar != null) {
            return akfVar.getBinder();
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            this.f = new akf(this);
            this.a = null;
            return;
        }
        this.f = null;
        ComponentName componentName = new ComponentName(this, getClass());
        HashMap<ComponentName, akg> hashMap = e;
        akg akgVar = hashMap.get(componentName);
        if (akgVar == null) {
            if (Build.VERSION.SDK_INT >= 26) {
                throw new IllegalArgumentException("Can't be here without a job id");
            }
            akgVar = new akb(this, componentName);
            hashMap.put(componentName, akgVar);
        }
        this.a = akgVar;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        ArrayList<akc> arrayList = this.d;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.c = true;
                this.a.c();
            }
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        if (this.d != null) {
            this.a.a();
            synchronized (this.d) {
                ArrayList<akc> arrayList = this.d;
                if (intent == null) {
                    intent = new Intent();
                }
                arrayList.add(new akc(this, intent, i2));
                b(true);
            }
            return 3;
        }
        return 2;
    }
}
