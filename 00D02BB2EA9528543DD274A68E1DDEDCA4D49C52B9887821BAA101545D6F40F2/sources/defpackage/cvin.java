package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.io.File;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cvin  reason: default package */
/* loaded from: classes5.dex */
public final class cvin {
    private static final dbsz<avcc> c = new cvif();
    private static final dbsz<avcc> d = new cvig();
    private static final dbsz<avcc> e = new cvih();
    public final cvik a;
    protected final List<WeakReference<avcc>> b;
    private final Context f;
    private final Executor g;
    private final ConnectivityManager h;
    private final Map<String, cvie> i;
    private final Map<String, HttpURLConnection> j;
    private final Queue<cvie> k;
    private boolean l;
    private final BroadcastReceiver m;
    private final cvio n;

    public cvin(cvio cvioVar, Context context, Executor executor) {
        cvik cvikVar = new cvik();
        this.i = new HashMap();
        this.j = new HashMap();
        this.k = new ConcurrentLinkedQueue();
        this.b = new ArrayList();
        this.l = false;
        this.m = new cvii(this);
        this.f = context;
        this.n = cvioVar;
        this.g = executor;
        this.a = cvikVar;
        this.h = (ConnectivityManager) context.getSystemService("connectivity");
    }

    public static String k(File file, String str) {
        String absolutePath = file.getAbsolutePath();
        StringBuilder sb = new StringBuilder(String.valueOf(absolutePath).length() + 1 + String.valueOf(str).length());
        sb.append(absolutePath);
        sb.append("/");
        sb.append(str);
        return sb.toString();
    }

    public static void l(@dzsi HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (IllegalStateException | NullPointerException unused) {
            }
        }
    }

    private static boolean n(Context context, String str) {
        return akm.d(context, str) == 0;
    }

    private static final void o(List<avcc> list, dbsz<avcc> dbszVar) {
        for (avcc avccVar : list) {
            dbszVar.NU(avccVar);
        }
    }

    public final cvie a(String str, File file, String str2, cvib cvibVar) {
        return new cvie(this, str, file, str2, cvibVar, new cvhy(file, str2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void b(cvie cvieVar) {
        String k = k(cvieVar.b, cvieVar.c);
        if (!this.i.containsKey(k)) {
            this.i.put(k, cvieVar);
            d(cvieVar);
        } else if (String.valueOf(k).length() != 0) {
        } else {
            new String("Request is already being executed for key: ");
        }
    }

    public final synchronized HttpURLConnection c(String str, String str2) {
        HttpURLConnection a;
        if (!n(this.f, "android.permission.INTERNET")) {
            throw new IllegalStateException("Missing INTERNET permission, can't start download");
        }
        a = this.n.a.a(new URL(str2));
        String str3 = this.a.b;
        this.j.put(str, a);
        return a;
    }

    public final void d(cvie cvieVar) {
        o(j(), d);
        this.g.execute(new cvij(this, cvieVar));
    }

    public final synchronized void e(File file, String str) {
        String k = k(file, str);
        cvie cvieVar = this.i.get(k);
        if (cvieVar != null) {
            cvieVar.e();
        } else if (String.valueOf(k).length() == 0) {
            new String("Attempted to setCanceled unknown request: ");
        }
        l(this.j.get(k));
        if (cvieVar != null) {
            i();
        }
    }

    public final void f(File file, String str, cvib cvibVar, @dzsi cvia cviaVar, File file2, long j) {
        List<avcc> list;
        List<avcc> j2;
        String k = k(file, str);
        synchronized (this) {
            this.i.remove(k);
            this.j.remove(k);
            list = null;
            if (this.i.isEmpty()) {
                list = j();
                j2 = null;
            } else {
                j2 = this.k.containsAll(this.i.values()) ? j() : null;
            }
        }
        if (cviaVar == null) {
            cvibVar.b(file2);
        } else {
            cvibVar.a(file2, cviaVar);
        }
        if (list != null) {
            o(list, e);
        } else if (j2 == null) {
        } else {
            o(j2, c);
        }
    }

    public final synchronized boolean g(cvid cvidVar) {
        if (cvidVar == cvid.NONE) {
            return true;
        }
        if (!n(this.f, "android.permission.ACCESS_NETWORK_STATE")) {
            throw new IllegalStateException("Attempting to determine connectivity without the ACCESS_NETWORK_STATE permission.");
        }
        NetworkInfo activeNetworkInfo = this.h.getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return false;
        }
        if (!activeNetworkInfo.isConnected()) {
            return false;
        }
        int ordinal = cvidVar.ordinal();
        if (ordinal == 0) {
            return !this.h.isActiveNetworkMetered() || activeNetworkInfo.getType() == 1 || activeNetworkInfo.getType() == 9 || activeNetworkInfo.getType() == 17;
        } else if (ordinal == 1) {
            return activeNetworkInfo.getType() == 0 || activeNetworkInfo.getType() == 4 || activeNetworkInfo.getType() == 6 || activeNetworkInfo.getType() == 7 || activeNetworkInfo.getType() == 1 || activeNetworkInfo.getType() == 9 || activeNetworkInfo.getType() == 17;
        } else {
            if (String.valueOf(cvidVar.name()).length() == 0) {
                new String("Unknown connectivity type checked: ");
            }
            return true;
        }
    }

    public final void h(cvie cvieVar) {
        List<avcc> j;
        synchronized (this) {
            boolean isEmpty = this.k.isEmpty();
            this.k.add(cvieVar);
            if (isEmpty) {
                this.f.registerReceiver(this.m, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                this.l = true;
                i();
            }
            j = this.k.containsAll(this.i.values()) ? j() : null;
        }
        if (j != null) {
            o(j, c);
        }
    }

    public final synchronized void i() {
        int size = this.k.size();
        StringBuilder sb = new StringBuilder(49);
        sb.append("Running ");
        sb.append(size);
        sb.append(" requests pending connectivity");
        sb.toString();
        Iterator<cvie> it = this.k.iterator();
        while (it.hasNext()) {
            cvie next = it.next();
            if (g(next.b()) || next.c()) {
                it.remove();
                d(next);
            }
        }
        if (!this.k.isEmpty() || !this.l) {
            return;
        }
        this.f.unregisterReceiver(this.m);
        this.l = false;
    }

    protected final synchronized List<avcc> j() {
        dccx F;
        F = dcdc.F();
        Iterator<WeakReference<avcc>> it = this.b.iterator();
        while (it.hasNext()) {
            avcc avccVar = it.next().get();
            if (avccVar == null) {
                it.remove();
            } else {
                F.g(avccVar);
            }
        }
        return F.f();
    }

    public final synchronized void m(avcc avccVar) {
        this.b.add(new WeakReference<>(avccVar));
    }
}
