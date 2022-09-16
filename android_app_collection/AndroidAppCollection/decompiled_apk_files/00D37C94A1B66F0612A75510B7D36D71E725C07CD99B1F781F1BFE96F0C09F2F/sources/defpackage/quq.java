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
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.TelemetryData;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: quq  reason: default package */
/* loaded from: classes4.dex */
public final class quq implements Handler.Callback {
    public static final Status a = new Status(4, "Sign-out occurred while this API call was in progress.");
    public static final Status b = new Status(4, "The user must be signed in to make this API call.");
    public static final Object c = new Object();
    public static quq d;
    public final Context g;
    public final qrq h;
    public final qxj i;
    public final Handler o;
    public volatile boolean p;
    private TelemetryData q;
    private qxx r;
    public long e = 10000;
    public boolean f = false;
    public final AtomicInteger j = new AtomicInteger(1);
    public final AtomicInteger k = new AtomicInteger(0);
    public final Map l = new ConcurrentHashMap(5, 0.75f, 1);
    public quf m = null;
    public final Set n = new afy();
    private final Set s = new afy();

    private quq(Context context, Looper looper, qrq qrqVar) {
        boolean z = true;
        this.p = true;
        this.g = context;
        rfm rfmVar = new rfm(looper, this);
        this.o = rfmVar;
        this.h = qrqVar;
        this.i = new qxj(qrqVar);
        PackageManager packageManager = context.getPackageManager();
        if (trz.b == null) {
            trz.b = Boolean.valueOf((!twx.g() || !packageManager.hasSystemFeature("android.hardware.type.automotive")) ? false : z);
        }
        if (trz.b.booleanValue()) {
            this.p = false;
        }
        rfmVar.sendMessage(rfmVar.obtainMessage(6));
    }

    public static Status a(qtp qtpVar, ConnectionResult connectionResult) {
        String a2 = qtpVar.a();
        String valueOf = String.valueOf(connectionResult);
        StringBuilder sb = new StringBuilder(a2.length() + 63 + String.valueOf(valueOf).length());
        sb.append("API: ");
        sb.append(a2);
        sb.append(" is not available on this device. Connection failed with: ");
        sb.append(valueOf);
        return new Status(connectionResult, sb.toString(), 17);
    }

    public static quq c(Context context) {
        quq quqVar;
        synchronized (c) {
            if (d == null) {
                HandlerThread handlerThread = new HandlerThread("GoogleApiHandler", 9);
                handlerThread.start();
                d = new quq(context.getApplicationContext(), handlerThread.getLooper(), qrq.a);
            }
            quqVar = d;
        }
        return quqVar;
    }

    private final qum j(qst qstVar) {
        qtp qtpVar = qstVar.A;
        qum qumVar = (qum) this.l.get(qtpVar);
        if (qumVar == null) {
            qumVar = new qum(this, qstVar);
            this.l.put(qtpVar, qumVar);
        }
        if (qumVar.o()) {
            this.s.add(qtpVar);
        }
        qumVar.d();
        return qumVar;
    }

    private final qxx k() {
        if (this.r == null) {
            this.r = new qyd(this.g, qxy.a);
        }
        return this.r;
    }

    private final void l() {
        TelemetryData telemetryData = this.q;
        if (telemetryData != null) {
            if (telemetryData.a > 0 || h()) {
                k().a(telemetryData);
            }
            this.q = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final qum b(qtp qtpVar) {
        return (qum) this.l.get(qtpVar);
    }

    public final void d(rvh rvhVar, int i, qst qstVar) {
        if (i != 0) {
            qtp qtpVar = qstVar.A;
            qvf qvfVar = null;
            if (h()) {
                RootTelemetryConfiguration rootTelemetryConfiguration = qxw.a().a;
                boolean z = true;
                if (rootTelemetryConfiguration != null) {
                    if (rootTelemetryConfiguration.b) {
                        boolean z2 = rootTelemetryConfiguration.c;
                        qum b2 = b(qtpVar);
                        if (b2 != null) {
                            qsn qsnVar = b2.b;
                            if (qsnVar instanceof qwr) {
                                qwr qwrVar = (qwr) qsnVar;
                                if (qwrVar.K() && !qwrVar.x()) {
                                    ConnectionTelemetryConfiguration b3 = qvf.b(b2, qwrVar, i);
                                    if (b3 != null) {
                                        b2.k++;
                                        z = b3.c;
                                    }
                                }
                            }
                        }
                        z = z2;
                    }
                }
                qvfVar = new qvf(this, i, qtpVar, z ? System.currentTimeMillis() : 0L, z ? SystemClock.elapsedRealtime() : 0L);
            }
            if (qvfVar == null) {
                return;
            }
            rvj rvjVar = rvhVar.a;
            Handler handler = this.o;
            handler.getClass();
            rvjVar.m(new pmc(handler, 2), qvfVar);
        }
    }

    public final void e(ConnectionResult connectionResult, int i) {
        if (!i(connectionResult, i)) {
            Handler handler = this.o;
            handler.sendMessage(handler.obtainMessage(5, i, 0, connectionResult));
        }
    }

    public final void f() {
        Handler handler = this.o;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final void g(quf qufVar) {
        synchronized (c) {
            if (this.m != qufVar) {
                this.m = qufVar;
                this.n.clear();
            }
            this.n.addAll(qufVar.d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean h() {
        if (this.f) {
            return false;
        }
        RootTelemetryConfiguration rootTelemetryConfiguration = qxw.a().a;
        if (rootTelemetryConfiguration != null && !rootTelemetryConfiguration.b) {
            return false;
        }
        int b2 = this.i.b(203400000);
        return b2 == -1 || b2 == 0;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        Status status;
        Feature[] b2;
        long j = 300000;
        qum qumVar = null;
        switch (message.what) {
            case 1:
                if (true == ((Boolean) message.obj).booleanValue()) {
                    j = 10000;
                }
                this.e = j;
                this.o.removeMessages(12);
                for (qtp qtpVar : this.l.keySet()) {
                    Handler handler = this.o;
                    handler.sendMessageDelayed(handler.obtainMessage(12, qtpVar), this.e);
                }
                break;
            case 2:
                qtq qtqVar = (qtq) message.obj;
                Iterator it = qtqVar.a.keySet().iterator();
                while (true) {
                    if (it.hasNext()) {
                        qtp qtpVar2 = (qtp) it.next();
                        qum qumVar2 = (qum) this.l.get(qtpVar2);
                        if (qumVar2 != null) {
                            if (!qumVar2.b.w()) {
                                qnm.f(qumVar2.l.o);
                                ConnectionResult connectionResult = qumVar2.j;
                                if (connectionResult == null) {
                                    qnm.f(qumVar2.l.o);
                                    qumVar2.e.add(qtqVar);
                                    qumVar2.d();
                                } else {
                                    qtqVar.a(qtpVar2, connectionResult, null);
                                }
                            } else {
                                qtqVar.a(qtpVar2, ConnectionResult.a, qumVar2.b.s());
                            }
                        } else {
                            qtqVar.a(qtpVar2, new ConnectionResult(13), null);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            case 3:
                for (qum qumVar3 : this.l.values()) {
                    qumVar3.c();
                    qumVar3.d();
                }
                break;
            case 4:
            case 8:
            case 13:
                qvi qviVar = (qvi) message.obj;
                qum qumVar4 = (qum) this.l.get(qviVar.c.A);
                if (qumVar4 == null) {
                    qumVar4 = j(qviVar.c);
                }
                if (!qumVar4.o() || this.k.get() == qviVar.b) {
                    qumVar4.e(qviVar.a);
                    break;
                } else {
                    qviVar.a.d(a);
                    qumVar4.m();
                    break;
                }
            case 5:
                int i = message.arg1;
                ConnectionResult connectionResult2 = (ConnectionResult) message.obj;
                Iterator it2 = this.l.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        qum qumVar5 = (qum) it2.next();
                        if (qumVar5.g == i) {
                            qumVar = qumVar5;
                        }
                    }
                }
                if (qumVar != null) {
                    if (connectionResult2.c != 13) {
                        qumVar.f(a(qumVar.c, connectionResult2));
                        break;
                    } else {
                        String j2 = qse.j();
                        String str = connectionResult2.e;
                        StringBuilder sb = new StringBuilder(String.valueOf(j2).length() + 69 + String.valueOf(str).length());
                        sb.append("Error resolution was canceled by the user, original error message: ");
                        sb.append(j2);
                        sb.append(": ");
                        sb.append(str);
                        qumVar.f(new Status(17, sb.toString()));
                        break;
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder(76);
                    sb2.append("Could not find API instance ");
                    sb2.append(i);
                    sb2.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb2.toString(), new Exception());
                    break;
                }
            case 6:
                if (this.g.getApplicationContext() instanceof Application) {
                    qts.b((Application) this.g.getApplicationContext());
                    qts.a.a(new quh(this));
                    qts qtsVar = qts.a;
                    if (!qtsVar.c.get()) {
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                        ActivityManager.getMyMemoryState(runningAppProcessInfo);
                        if (!qtsVar.c.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                            qtsVar.b.set(true);
                        }
                    }
                    if (!qtsVar.b.get()) {
                        this.e = 300000L;
                        break;
                    }
                }
                break;
            case 7:
                j((qst) message.obj);
                break;
            case 9:
                if (this.l.containsKey(message.obj)) {
                    qum qumVar6 = (qum) this.l.get(message.obj);
                    qnm.f(qumVar6.l.o);
                    if (qumVar6.h) {
                        qumVar6.d();
                        break;
                    }
                }
                break;
            case 10:
                for (qtp qtpVar3 : this.s) {
                    qum qumVar7 = (qum) this.l.remove(qtpVar3);
                    if (qumVar7 != null) {
                        qumVar7.m();
                    }
                }
                this.s.clear();
                break;
            case 11:
                if (this.l.containsKey(message.obj)) {
                    qum qumVar8 = (qum) this.l.get(message.obj);
                    qnm.f(qumVar8.l.o);
                    if (qumVar8.h) {
                        qumVar8.n();
                        quq quqVar = qumVar8.l;
                        if (quqVar.h.g(quqVar.g) == 18) {
                            status = new Status(21, "Connection timed out waiting for Google Play services update to complete.");
                        } else {
                            status = new Status(22, "API failed to connect while resuming due to an unknown error.");
                        }
                        qumVar8.f(status);
                        qumVar8.b.f("Timing out connection while resuming.");
                        break;
                    }
                }
                break;
            case 12:
                if (this.l.containsKey(message.obj)) {
                    qum qumVar9 = (qum) this.l.get(message.obj);
                    qnm.f(qumVar9.l.o);
                    if (qumVar9.b.w() && qumVar9.f.size() == 0) {
                        que queVar = qumVar9.d;
                        if (!queVar.a.isEmpty() || !queVar.b.isEmpty()) {
                            qumVar9.l();
                            break;
                        } else {
                            qumVar9.b.f("Timing out service connection.");
                            break;
                        }
                    }
                }
                break;
            case 14:
                tzc tzcVar = (tzc) message.obj;
                throw null;
            case 15:
                qun qunVar = (qun) message.obj;
                if (this.l.containsKey(qunVar.a)) {
                    qum qumVar10 = (qum) this.l.get(qunVar.a);
                    if (qumVar10.i.contains(qunVar) && !qumVar10.h) {
                        if (!qumVar10.b.w()) {
                            qumVar10.d();
                            break;
                        } else {
                            qumVar10.g();
                            break;
                        }
                    }
                }
                break;
            case 16:
                qun qunVar2 = (qun) message.obj;
                if (this.l.containsKey(qunVar2.a)) {
                    qum qumVar11 = (qum) this.l.get(qunVar2.a);
                    if (qumVar11.i.remove(qunVar2)) {
                        qumVar11.l.o.removeMessages(15, qunVar2);
                        qumVar11.l.o.removeMessages(16, qunVar2);
                        Feature feature = qunVar2.b;
                        ArrayList arrayList = new ArrayList(qumVar11.a.size());
                        for (qto qtoVar : qumVar11.a) {
                            if ((qtoVar instanceof qti) && (b2 = ((qti) qtoVar).b(qumVar11)) != null && tqn.h(b2, feature)) {
                                arrayList.add(qtoVar);
                            }
                        }
                        int size = arrayList.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            qto qtoVar2 = (qto) arrayList.get(i2);
                            qumVar11.a.remove(qtoVar2);
                            qtoVar2.e(new qth(feature));
                        }
                        break;
                    }
                }
                break;
            case 17:
                l();
                break;
            case 18:
                qvg qvgVar = (qvg) message.obj;
                if (qvgVar.c == 0) {
                    k().a(new TelemetryData(qvgVar.b, Arrays.asList(qvgVar.a)));
                    break;
                } else {
                    TelemetryData telemetryData = this.q;
                    if (telemetryData != null) {
                        List list = telemetryData.b;
                        if (telemetryData.a != qvgVar.b || (list != null && list.size() >= qvgVar.d)) {
                            this.o.removeMessages(17);
                            l();
                        } else {
                            TelemetryData telemetryData2 = this.q;
                            MethodInvocation methodInvocation = qvgVar.a;
                            if (telemetryData2.b == null) {
                                telemetryData2.b = new ArrayList();
                            }
                            telemetryData2.b.add(methodInvocation);
                        }
                    }
                    if (this.q == null) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(qvgVar.a);
                        this.q = new TelemetryData(qvgVar.b, arrayList2);
                        Handler handler2 = this.o;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), qvgVar.c);
                        break;
                    }
                }
                break;
            case 19:
                this.f = false;
                break;
            default:
                int i3 = message.what;
                StringBuilder sb3 = new StringBuilder(31);
                sb3.append("Unknown message id: ");
                sb3.append(i3);
                Log.w("GoogleApiManager", sb3.toString());
                return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean i(ConnectionResult connectionResult, int i) {
        qrq qrqVar = this.h;
        Context context = this.g;
        if (!qzv.j(context)) {
            PendingIntent j = connectionResult.b() ? connectionResult.d : qrqVar.j(context, connectionResult.c, null);
            if (j != null) {
                qrqVar.e(context, connectionResult.c, rfi.a(context, 0, GoogleApiActivity.a(context, j, i, true), rfi.a | 134217728));
                return true;
            }
        }
        return false;
    }
}
