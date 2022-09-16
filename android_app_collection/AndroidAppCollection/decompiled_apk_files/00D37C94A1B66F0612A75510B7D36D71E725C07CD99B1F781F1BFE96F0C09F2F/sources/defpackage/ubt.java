package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.TrafficStats;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ubt  reason: default package */
/* loaded from: classes4.dex */
public final class ubt {
    public static final String a = "ubt";
    private static final ampw d = new ubn(1);
    private static final ampw e = new ubn();
    private static final ampw f = new ubn(2);
    public final ubp b;
    protected final List c;
    private final Context g;
    private final Executor h;
    private final ConnectivityManager i;
    private final Map j;
    private final Map k;
    private final Queue l;
    private boolean m;
    private final BroadcastReceiver n;
    private final ubg o;

    public ubt(ubg ubgVar, Context context, Executor executor) {
        ubp ubpVar = new ubp();
        this.j = new HashMap();
        this.k = new HashMap();
        this.l = new ConcurrentLinkedQueue();
        this.c = new ArrayList();
        this.m = false;
        this.n = new ubo(this);
        this.g = context;
        this.o = ubgVar;
        this.h = executor;
        this.b = ubpVar;
        this.i = (ConnectivityManager) context.getSystemService("connectivity");
    }

    public static String a(File file, String str) {
        String absolutePath = file.getAbsolutePath();
        StringBuilder sb = new StringBuilder(String.valueOf(absolutePath).length() + 1 + str.length());
        sb.append(absolutePath);
        sb.append("/");
        sb.append(str);
        return sb.toString();
    }

    public static void i(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (IllegalStateException | NullPointerException unused) {
            }
        }
    }

    private static boolean n(Context context, String str) {
        return ake.c(context, str) == 0;
    }

    private static final void o(List list, ampw ampwVar) {
        amzt listIterator = ((amuk) list).listIterator();
        while (listIterator.hasNext()) {
            ampwVar.a((ubr) listIterator.next());
        }
    }

    public final synchronized HttpURLConnection b(String str, String str2) {
        HttpURLConnection httpURLConnection;
        if (n(this.g, "android.permission.INTERNET")) {
            ubf ubfVar = this.o.a;
            URLConnection openConnection = ubfVar.a.openConnection(new URL(str2));
            if (!(openConnection instanceof HttpURLConnection)) {
                throw new IOException("Cronet connection is not an HttpURLConnection");
            }
            httpURLConnection = (HttpURLConnection) openConnection;
            String str3 = this.b.b;
            this.k.put(str, httpURLConnection);
        } else {
            throw new IllegalStateException("Missing INTERNET permission, can't start download");
        }
        return httpURLConnection;
    }

    protected final synchronized List c() {
        amuf f2;
        f2 = amuk.f();
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ubr ubrVar = (ubr) ((WeakReference) it.next()).get();
            if (ubrVar == null) {
                it.remove();
            } else {
                f2.h(ubrVar);
            }
        }
        return f2.g();
    }

    public final synchronized void d(File file, String str) {
        String a2 = a(file, str);
        ubm ubmVar = (ubm) this.j.get(a2);
        if (ubmVar != null) {
            ubmVar.b();
        } else {
            String valueOf = String.valueOf(a2);
            if (valueOf.length() != 0) {
                "Attempted to setCanceled unknown request: ".concat(valueOf);
            }
        }
        i((HttpURLConnection) this.k.get(a2));
        if (ubmVar != null) {
            f();
        }
    }

    public final void e(ubm ubmVar) {
        List c;
        synchronized (this) {
            boolean isEmpty = this.l.isEmpty();
            this.l.add(ubmVar);
            if (isEmpty) {
                this.g.registerReceiver(this.n, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                this.m = true;
                f();
            }
            c = this.l.containsAll(this.j.values()) ? c() : null;
        }
        if (c != null) {
            o(c, d);
        }
    }

    public final synchronized void f() {
        this.l.size();
        Iterator it = this.l.iterator();
        while (it.hasNext()) {
            ubm ubmVar = (ubm) it.next();
            if (ubmVar.c() || j(ubmVar.a())) {
                it.remove();
                h(ubmVar);
            }
        }
        if (!this.l.isEmpty() || !this.m) {
            return;
        }
        this.g.unregisterReceiver(this.n);
        this.m = false;
    }

    public final synchronized void g(ubr ubrVar) {
        this.c.add(new WeakReference(ubrVar));
    }

    public final void h(ubm ubmVar) {
        o(c(), e);
        this.h.execute(new ubq(this, ubmVar));
    }

    public final synchronized boolean j(ubl ublVar) {
        if (ublVar == ubl.NONE) {
            return true;
        }
        if (!n(this.g, "android.permission.ACCESS_NETWORK_STATE")) {
            throw new IllegalStateException("Attempting to determine connectivity without the ACCESS_NETWORK_STATE permission.");
        }
        NetworkInfo activeNetworkInfo = this.i.getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return false;
        }
        if (!activeNetworkInfo.isConnected()) {
            return false;
        }
        int ordinal = ublVar.ordinal();
        if (ordinal == 0) {
            return !this.i.isActiveNetworkMetered() || activeNetworkInfo.getType() == 1 || activeNetworkInfo.getType() == 9 || activeNetworkInfo.getType() == 17;
        } else if (ordinal == 1) {
            return activeNetworkInfo.getType() == 0 || activeNetworkInfo.getType() == 4 || activeNetworkInfo.getType() == 6 || activeNetworkInfo.getType() == 7 || activeNetworkInfo.getType() == 1 || activeNetworkInfo.getType() == 9 || activeNetworkInfo.getType() == 16 || activeNetworkInfo.getType() == 17;
        } else {
            String str = a;
            String valueOf = String.valueOf(ublVar.name());
            Log.e(str, valueOf.length() != 0 ? "Unknown connectivity type checked: ".concat(valueOf) : new String("Unknown connectivity type checked: "));
            return true;
        }
    }

    public final void k(File file, String str, tsi tsiVar, ubk ubkVar, File file2) {
        List list;
        List list2;
        tpz tpzVar;
        String str2;
        String a2 = a(file, str);
        synchronized (this) {
            this.j.remove(a2);
            this.k.remove(a2);
            if (this.j.isEmpty()) {
                list = c();
                list2 = null;
            } else if (this.l.containsAll(this.j.values())) {
                list2 = c();
                list = null;
            } else {
                list = null;
                list2 = null;
            }
        }
        if (ubkVar == null) {
            file2.getName();
            int i = typ.a;
            tsiVar.a.c(null);
        } else {
            Throwable th = ubkVar.c;
            file2.getName();
            int i2 = typ.a;
            tpy a3 = tqa.a();
            int i3 = ubkVar.d;
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            switch (i4) {
                case 0:
                    tpzVar = tpz.ANDROID_DOWNLOADER_UNKNOWN;
                    break;
                case 1:
                    tpzVar = tpz.ANDROID_DOWNLOADER_CANCELED;
                    break;
                case 2:
                    tpzVar = tpz.ANDROID_DOWNLOADER_INVALID_REQUEST;
                    break;
                case 3:
                    tpzVar = tpz.ANDROID_DOWNLOADER_HTTP_ERROR;
                    break;
                case 4:
                    tpzVar = tpz.ANDROID_DOWNLOADER_REQUEST_ERROR;
                    break;
                case 5:
                    tpzVar = tpz.ANDROID_DOWNLOADER_RESPONSE_OPEN_ERROR;
                    break;
                case 6:
                    tpzVar = tpz.ANDROID_DOWNLOADER_RESPONSE_CLOSE_ERROR;
                    break;
                case 7:
                    tpzVar = tpz.ANDROID_DOWNLOADER_NETWORK_IO_ERROR;
                    break;
                case 8:
                    tpzVar = tpz.ANDROID_DOWNLOADER_DISK_IO_ERROR;
                    break;
                case 9:
                    tpzVar = tpz.ANDROID_DOWNLOADER_FILE_SYSTEM_ERROR;
                    break;
                case 10:
                    tpzVar = tpz.ANDROID_DOWNLOADER_UNKNOWN_IO_ERROR;
                    break;
                default:
                    tpzVar = tpz.UNKNOWN_ERROR;
                    break;
            }
            a3.a = tpzVar;
            int i5 = ubkVar.d;
            switch (i5) {
                case 1:
                    str2 = "UNKNOWN";
                    break;
                case 2:
                    str2 = "CANCELED";
                    break;
                case 3:
                    str2 = "INVALID_REQUEST";
                    break;
                case 4:
                    str2 = "HTTP_ERROR";
                    break;
                case 5:
                    str2 = "REQUEST_ERROR";
                    break;
                case 6:
                    str2 = "RESPONSE_OPEN_ERROR";
                    break;
                case 7:
                    str2 = "RESPONSE_CLOSE_ERROR";
                    break;
                case 8:
                    str2 = "NETWORK_IO_ERROR";
                    break;
                case 9:
                    str2 = "DISK_IO_ERROR";
                    break;
                case 10:
                    str2 = "FILE_SYSTEM_ERROR";
                    break;
                case 11:
                    str2 = "UNKNOWN_IO_ERROR";
                    break;
                default:
                    str2 = "null";
                    break;
            }
            if (i5 != 0) {
                StringBuilder sb = new StringBuilder(str2.length() + 21);
                sb.append("ANDROID_DOWNLOADER_");
                sb.append(str2);
                sb.append("; ");
                String sb2 = sb.toString();
                if (ubkVar.a >= 0) {
                    String valueOf = String.valueOf(sb2);
                    int i6 = ubkVar.a;
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 23);
                    sb3.append(valueOf);
                    sb3.append("HttpCode: ");
                    sb3.append(i6);
                    sb3.append("; ");
                    sb2 = sb3.toString();
                }
                if (ubkVar.b != null) {
                    String valueOf2 = String.valueOf(sb2);
                    String str3 = ubkVar.b;
                    StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf2).length() + 11 + String.valueOf(str3).length());
                    sb4.append(valueOf2);
                    sb4.append("Message: ");
                    sb4.append(str3);
                    sb4.append("; ");
                    sb2 = sb4.toString();
                }
                a3.b = sb2;
                if (th != null) {
                    a3.c = th;
                }
                tsiVar.a.d(a3.a());
            } else {
                throw null;
            }
        }
        if (list != null) {
            o(list, f);
        } else if (list2 == null) {
        } else {
            o(list2, d);
        }
    }

    public final synchronized void l(ubm ubmVar) {
        String a2 = a(ubmVar.b, ubmVar.c);
        if (this.j.containsKey(a2)) {
            String valueOf = String.valueOf(a2);
            if (valueOf.length() == 0) {
                return;
            }
            "Request is already being executed for key: ".concat(valueOf);
            return;
        }
        this.j.put(a2, ubmVar);
        h(ubmVar);
    }

    public final synchronized void m(HttpURLConnection httpURLConnection, int i) {
        if (i != -1) {
            if (!(httpURLConnection instanceof bahf)) {
                TrafficStats.setThreadStatsTag(i);
            } else {
                ((bahf) httpURLConnection).b(i);
            }
        }
    }
}
