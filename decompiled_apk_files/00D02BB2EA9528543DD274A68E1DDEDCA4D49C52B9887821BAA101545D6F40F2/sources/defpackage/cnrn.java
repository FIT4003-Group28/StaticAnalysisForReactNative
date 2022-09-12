package defpackage;

import android.app.ActivityManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.TelemetryData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: cnrn  reason: default package */
/* loaded from: classes.dex */
public final class cnrn implements Handler.Callback {
    public static final Status a = new Status(4, "Sign-out occurred while this API call was in progress.");
    public static final Status b = new Status(4, "The user must be signed in to make this API call.");
    public static final Object e = new Object();
    public static cnrn f;
    public final Context g;
    public final cnmq h;
    public final cnvi i;
    public final Handler n;
    public volatile boolean o;
    private TelemetryData p;
    private cnwj q;
    public long c = 10000;
    public boolean d = false;
    private final AtomicInteger r = new AtomicInteger(1);
    public final AtomicInteger j = new AtomicInteger(0);
    public final Map<cnpa<?>, cnrj<?>> k = new ConcurrentHashMap(5, 0.75f, 1);
    public cnpz l = null;
    public final Set<cnpa<?>> m = new aih();
    private final Set<cnpa<?>> s = new aih();

    private cnrn(Context context, Looper looper, cnmq cnmqVar) {
        boolean z = true;
        this.o = true;
        this.g = context;
        cojb cojbVar = new cojb(looper, this);
        this.n = cojbVar;
        this.h = cnmqVar;
        this.i = new cnvi(cnmqVar);
        PackageManager packageManager = context.getPackageManager();
        if (cnxo.b == null) {
            cnxo.b = Boolean.valueOf((!cnxs.a() || !packageManager.hasSystemFeature("android.hardware.type.automotive")) ? false : z);
        }
        if (cnxo.b.booleanValue()) {
            this.o = false;
        }
        cojbVar.sendMessage(cojbVar.obtainMessage(6));
    }

    public static cnrn a(Context context) {
        cnrn cnrnVar;
        synchronized (e) {
            if (f == null) {
                HandlerThread handlerThread = new HandlerThread("GoogleApiHandler", 9);
                handlerThread.start();
                f = new cnrn(context.getApplicationContext(), handlerThread.getLooper(), cnmq.a);
            }
            cnrnVar = f;
        }
        return cnrnVar;
    }

    public static Status k(cnpa<?> cnpaVar, ConnectionResult connectionResult) {
        String name = cnpaVar.a.getName();
        String valueOf = String.valueOf(connectionResult);
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 63 + String.valueOf(valueOf).length());
        sb.append("API: ");
        sb.append(name);
        sb.append(" is not available on this device. Connection failed with: ");
        sb.append(valueOf);
        return new Status(1, 17, sb.toString(), connectionResult.d, connectionResult);
    }

    private final cnrj<?> l(cnof<?> cnofVar) {
        cnpa<?> cnpaVar = cnofVar.f;
        cnrj<?> cnrjVar = this.k.get(cnpaVar);
        if (cnrjVar == null) {
            cnrjVar = new cnrj<>(this, cnofVar);
            this.k.put(cnpaVar, cnrjVar);
        }
        if (cnrjVar.n()) {
            this.s.add(cnpaVar);
        }
        cnrjVar.m();
        return cnrjVar;
    }

    private final void m() {
        TelemetryData telemetryData = this.p;
        if (telemetryData != null) {
            if (telemetryData.a > 0 || g()) {
                n().a(telemetryData);
            }
            this.p = null;
        }
    }

    private final cnwj n() {
        if (this.q == null) {
            this.q = new cnxd(this.g, cnwk.a);
        }
        return this.q;
    }

    public final int b() {
        return this.r.getAndIncrement();
    }

    public final void c(cnof<?> cnofVar) {
        Handler handler = this.n;
        handler.sendMessage(handler.obtainMessage(7, cnofVar));
    }

    public final void d(cnpz cnpzVar) {
        synchronized (e) {
            if (this.l != cnpzVar) {
                this.l = cnpzVar;
                this.m.clear();
            }
            this.m.addAll(cnpzVar.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final cnrj e(cnpa<?> cnpaVar) {
        return this.k.get(cnpaVar);
    }

    public final void f() {
        Handler handler = this.n;
        handler.sendMessage(handler.obtainMessage(3));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean g() {
        if (this.d) {
            return false;
        }
        RootTelemetryConfiguration rootTelemetryConfiguration = cnwf.a().a;
        if (rootTelemetryConfiguration != null && !rootTelemetryConfiguration.b) {
            return false;
        }
        int c = this.i.c(203390000);
        return c == -1 || c == 0;
    }

    public final <T> void h(cpct<T> cpctVar, int i, cnof cnofVar) {
        if (i != 0) {
            cnpa<O> cnpaVar = cnofVar.f;
            cnsf cnsfVar = null;
            if (g()) {
                RootTelemetryConfiguration rootTelemetryConfiguration = cnwf.a().a;
                boolean z = true;
                if (rootTelemetryConfiguration != null) {
                    if (rootTelemetryConfiguration.b) {
                        boolean z2 = rootTelemetryConfiguration.c;
                        cnrj e2 = e(cnpaVar);
                        if (e2 == null || !e2.b.r() || !(e2.b instanceof cnui)) {
                            z = z2;
                        } else {
                            ConnectionTelemetryConfiguration b2 = cnsf.b(e2, i);
                            if (b2 != null) {
                                e2.i++;
                                z = b2.c;
                            }
                        }
                    }
                }
                cnsfVar = new cnsf(this, i, cnpaVar, z ? System.currentTimeMillis() : 0L);
            }
            if (cnsfVar == null) {
                return;
            }
            cpcx<T> cpcxVar = cpctVar.a;
            final Handler handler = this.n;
            handler.getClass();
            cpcxVar.n(new Executor(handler) { // from class: cnrd
                private final Handler a;

                {
                    this.a = handler;
                }

                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    this.a.post(runnable);
                }
            }, cnsfVar);
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        Status status;
        Feature[] a2;
        long j = 300000;
        cnrj<?> cnrjVar = null;
        switch (message.what) {
            case 1:
                if (true == ((Boolean) message.obj).booleanValue()) {
                    j = 10000;
                }
                this.c = j;
                this.n.removeMessages(12);
                for (cnpa<?> cnpaVar : this.k.keySet()) {
                    Handler handler = this.n;
                    handler.sendMessageDelayed(handler.obtainMessage(12, cnpaVar), this.c);
                }
                break;
            case 2:
                cnpd cnpdVar = (cnpd) message.obj;
                throw null;
            case 3:
                for (cnrj<?> cnrjVar2 : this.k.values()) {
                    cnrjVar2.i();
                    cnrjVar2.m();
                }
                break;
            case 4:
            case 8:
            case 13:
                cnsj cnsjVar = (cnsj) message.obj;
                cnrj<?> cnrjVar3 = this.k.get(cnsjVar.c.f);
                if (cnrjVar3 == null) {
                    cnrjVar3 = l(cnsjVar.c);
                }
                if (!cnrjVar3.n() || this.j.get() == cnsjVar.b) {
                    cnrjVar3.g(cnsjVar.a);
                    break;
                } else {
                    cnsjVar.a.c(a);
                    cnrjVar3.h();
                    break;
                }
                break;
            case 5:
                int i = message.arg1;
                ConnectionResult connectionResult = (ConnectionResult) message.obj;
                Iterator<cnrj<?>> it = this.k.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        cnrj<?> next = it.next();
                        if (next.f == i) {
                            cnrjVar = next;
                        }
                    }
                }
                if (cnrjVar != null) {
                    if (connectionResult.c != 13) {
                        cnrjVar.j(k(cnrjVar.c, connectionResult));
                        break;
                    } else {
                        String l = cnnl.l();
                        String str = connectionResult.e;
                        StringBuilder sb = new StringBuilder(String.valueOf(l).length() + 69 + String.valueOf(str).length());
                        sb.append("Error resolution was canceled by the user, original error message: ");
                        sb.append(l);
                        sb.append(": ");
                        sb.append(str);
                        cnrjVar.j(new Status(17, sb.toString()));
                        break;
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder(76);
                    sb2.append("Could not find API instance ");
                    sb2.append(i);
                    sb2.append(" while trying to fail enqueued calls.");
                    sb2.toString();
                    new Exception();
                    break;
                }
            case 6:
                if (this.g.getApplicationContext() instanceof Application) {
                    cnpf.a((Application) this.g.getApplicationContext());
                    cnpf.a.b(new cnre(this));
                    cnpf cnpfVar = cnpf.a;
                    if (!cnpfVar.c.get()) {
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                        ActivityManager.getMyMemoryState(runningAppProcessInfo);
                        if (!cnpfVar.c.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                            cnpfVar.b.set(true);
                        }
                    }
                    if (!cnpfVar.b.get()) {
                        this.c = 300000L;
                        break;
                    }
                }
                break;
            case 7:
                l((cnof) message.obj);
                break;
            case 9:
                if (this.k.containsKey(message.obj)) {
                    cnrj<?> cnrjVar4 = this.k.get(message.obj);
                    cnwc.j(cnrjVar4.j.n);
                    if (cnrjVar4.g) {
                        cnrjVar4.m();
                        break;
                    }
                }
                break;
            case 10:
                for (cnpa<?> cnpaVar2 : this.s) {
                    cnrj<?> remove = this.k.remove(cnpaVar2);
                    if (remove != null) {
                        remove.h();
                    }
                }
                this.s.clear();
                break;
            case 11:
                if (this.k.containsKey(message.obj)) {
                    cnrj<?> cnrjVar5 = this.k.get(message.obj);
                    cnwc.j(cnrjVar5.j.n);
                    if (cnrjVar5.g) {
                        cnrjVar5.k();
                        cnrn cnrnVar = cnrjVar5.j;
                        if (cnrnVar.h.i(cnrnVar.g) == 18) {
                            status = new Status(21, "Connection timed out waiting for Google Play services update to complete.");
                        } else {
                            status = new Status(22, "API failed to connect while resuming due to an unknown error.");
                        }
                        cnrjVar5.j(status);
                        cnrjVar5.b.h("Timing out connection while resuming.");
                        break;
                    }
                }
                break;
            case 12:
                if (this.k.containsKey(message.obj)) {
                    cnrj<?> cnrjVar6 = this.k.get(message.obj);
                    cnwc.j(cnrjVar6.j.n);
                    if (cnrjVar6.b.r() && cnrjVar6.e.size() == 0) {
                        cnpy cnpyVar = cnrjVar6.d;
                        if (!cnpyVar.a.isEmpty() || !cnpyVar.b.isEmpty()) {
                            cnrjVar6.l();
                            break;
                        } else {
                            cnrjVar6.b.h("Timing out service connection.");
                            break;
                        }
                    }
                }
                break;
            case 14:
                cnqa cnqaVar = (cnqa) message.obj;
                throw null;
            case 15:
                cnrk cnrkVar = (cnrk) message.obj;
                if (this.k.containsKey(cnrkVar.a)) {
                    cnrj<?> cnrjVar7 = this.k.get(cnrkVar.a);
                    if (cnrjVar7.h.contains(cnrkVar) && !cnrjVar7.g) {
                        if (!cnrjVar7.b.r()) {
                            cnrjVar7.m();
                            break;
                        } else {
                            cnrjVar7.f();
                            break;
                        }
                    }
                }
                break;
            case 16:
                cnrk cnrkVar2 = (cnrk) message.obj;
                if (this.k.containsKey(cnrkVar2.a)) {
                    cnrj<?> cnrjVar8 = this.k.get(cnrkVar2.a);
                    if (cnrjVar8.h.remove(cnrkVar2)) {
                        cnrjVar8.j.n.removeMessages(15, cnrkVar2);
                        cnrjVar8.j.n.removeMessages(16, cnrkVar2);
                        Feature feature = cnrkVar2.b;
                        ArrayList arrayList = new ArrayList(cnrjVar8.a.size());
                        for (cnoy cnoyVar : cnrjVar8.a) {
                            if ((cnoyVar instanceof cnos) && (a2 = ((cnos) cnoyVar).a(cnrjVar8)) != null && cnxi.a(a2, feature)) {
                                arrayList.add(cnoyVar);
                            }
                        }
                        int size = arrayList.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            cnoy cnoyVar2 = (cnoy) arrayList.get(i2);
                            cnrjVar8.a.remove(cnoyVar2);
                            cnoyVar2.d(new cnor(feature));
                        }
                        break;
                    }
                }
                break;
            case 17:
                m();
                break;
            case 18:
                cnsg cnsgVar = (cnsg) message.obj;
                if (cnsgVar.c == 0) {
                    n().a(new TelemetryData(cnsgVar.b, Arrays.asList(cnsgVar.a)));
                    break;
                } else {
                    TelemetryData telemetryData = this.p;
                    if (telemetryData != null) {
                        List<MethodInvocation> list = telemetryData.b;
                        if (telemetryData.a != cnsgVar.b || (list != null && list.size() >= cnsgVar.d)) {
                            this.n.removeMessages(17);
                            m();
                        } else {
                            TelemetryData telemetryData2 = this.p;
                            MethodInvocation methodInvocation = cnsgVar.a;
                            if (telemetryData2.b == null) {
                                telemetryData2.b = new ArrayList();
                            }
                            telemetryData2.b.add(methodInvocation);
                        }
                    }
                    if (this.p == null) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(cnsgVar.a);
                        this.p = new TelemetryData(cnsgVar.b, arrayList2);
                        Handler handler2 = this.n;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), cnsgVar.c);
                        break;
                    }
                }
                break;
            case 19:
                this.d = false;
                break;
            default:
                int i3 = message.what;
                StringBuilder sb3 = new StringBuilder(31);
                sb3.append("Unknown message id: ");
                sb3.append(i3);
                sb3.toString();
                return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean i(ConnectionResult connectionResult, int i) {
        cnmq cnmqVar = this.h;
        Context context = this.g;
        PendingIntent l = connectionResult.b() ? connectionResult.d : cnmqVar.l(context, connectionResult.c, null);
        if (l != null) {
            cnmqVar.g(context, connectionResult.c, PendingIntent.getActivity(context, 0, GoogleApiActivity.a(context, l, i, true), 134217728));
            return true;
        }
        return false;
    }

    public final void j(ConnectionResult connectionResult, int i) {
        if (!i(connectionResult, i)) {
            Handler handler = this.n;
            handler.sendMessage(handler.obtainMessage(5, i, 0, connectionResult));
        }
    }
}
