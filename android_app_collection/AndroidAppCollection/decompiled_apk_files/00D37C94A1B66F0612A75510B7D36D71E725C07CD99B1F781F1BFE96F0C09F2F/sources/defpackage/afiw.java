package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.libraries.youtube.innertube.model.player.TrackingUrlModel;
import java.io.UnsupportedEncodingException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: afiw  reason: default package */
/* loaded from: classes.dex */
public final class afiw {
    public final afwu a;
    public final afsw b;
    public final afvm c;
    public final String d;
    public final afiv[] e;
    public final CountDownLatch f;
    final Deque g;
    afix h = new afix();
    public TrackingUrlModel i;
    public boolean j;
    public boolean k;
    private final Executor l;
    private final aujv m;
    private zgp n;
    private int o;
    private int p;
    private boolean q;
    private boolean r;

    public afiw(afwu afwuVar, afsw afswVar, Executor executor, afvn afvnVar, CountDownLatch countDownLatch, aujv aujvVar, afiv... afivVarArr) {
        this.a = afwuVar;
        this.b = afswVar;
        this.l = executor;
        this.c = afvnVar.c();
        this.d = afvnVar.g();
        this.e = afivVarArr;
        countDownLatch.getClass();
        this.f = countDownLatch;
        this.m = aujvVar;
        this.o = 1100;
        this.p = 1100;
        this.g = new ArrayDeque();
        this.r = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final boolean g(String str) {
        return TextUtils.equals("cat", str);
    }

    private final int j(String str, String str2) {
        List list = (List) this.h.a.get(str);
        return ((list == null || list.isEmpty()) ? str.length() + 1 : 0) + str2.length() + 1;
    }

    private final void k(final afix afixVar) {
        final zgp c = zgp.c(this.n);
        if (!this.r) {
            zgp zgpVar = this.n;
            zgpVar.j("fexp");
            c(zgpVar);
            this.r = true;
        }
        this.l.execute(new Runnable() { // from class: afiu
            @Override // java.lang.Runnable
            public final void run() {
                Pair pair;
                afwt c2;
                afiw afiwVar = afiw.this;
                afix afixVar2 = afixVar;
                zgp zgpVar2 = c;
                for (afiv afivVar : afiwVar.e) {
                    afivVar.c(afixVar2);
                }
                try {
                    afiwVar.f.await(10L, TimeUnit.SECONDS);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
                if (afiwVar.j || afiwVar.k) {
                    StringBuilder sb = new StringBuilder();
                    StringBuilder sb2 = new StringBuilder();
                    for (Map.Entry entry : afixVar2.a()) {
                        List list = (List) entry.getValue();
                        String str = (String) entry.getKey();
                        if (!list.isEmpty()) {
                            if (afiw.g(str)) {
                                zgpVar2.f(str, TextUtils.join(",", list));
                            } else {
                                if (sb.length() > 0) {
                                    sb.append('&');
                                    sb2.append('&');
                                }
                                String encode = Uri.encode(str, ",:;");
                                String encode2 = Uri.encode(TextUtils.join(",", list), ",:;");
                                sb.append(encode);
                                sb.append('=');
                                sb.append(encode2);
                                sb2.append(encode);
                                sb2.append('=');
                                if (afjh.a.contains(encode)) {
                                    sb2.append("(scrubbed)");
                                } else {
                                    sb2.append(encode2);
                                }
                            }
                            list.clear();
                        }
                    }
                    try {
                        pair = new Pair(sb.toString().getBytes("UTF-8"), sb2.toString());
                    } catch (UnsupportedEncodingException e) {
                        String valueOf = String.valueOf(e);
                        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 31);
                        sb3.append("Failed to encode qoe post body.");
                        sb3.append(valueOf);
                        zep.b(sb3.toString());
                        pair = new Pair(new byte[0], sb2.toString());
                    }
                    Uri a = zgpVar2.a();
                    String str2 = (String) pair.second;
                    String valueOf2 = String.valueOf(afjh.a(a));
                    StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf2).length() + 10 + String.valueOf(str2).length());
                    sb4.append("Pinging ");
                    sb4.append(valueOf2);
                    sb4.append("  ");
                    sb4.append(str2);
                    zep.l(sb4.toString());
                    c2 = afwu.c((byte[]) pair.first, "qoe");
                    c2.b(a);
                    c2.d = true;
                    c2.a(new acwk(afiwVar.i, 1));
                    c2.g = afiwVar.c;
                    c2.h = afiwVar.d;
                } else {
                    for (Map.Entry entry2 : afixVar2.a()) {
                        List list2 = (List) entry2.getValue();
                        String str3 = (String) entry2.getKey();
                        if (!list2.isEmpty()) {
                            if (afiw.g(str3)) {
                                zgpVar2.f(str3, TextUtils.join(",", list2));
                            } else {
                                zgpVar2.i(str3, TextUtils.join(",", list2), ",:;");
                            }
                            list2.clear();
                        }
                    }
                    Uri a2 = zgpVar2.a();
                    String valueOf3 = String.valueOf(afjh.a(a2));
                    StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf3).length() + 8);
                    sb5.append("Pinging ");
                    sb5.append(valueOf3);
                    zep.l(sb5.toString());
                    c2 = afwu.d("qoe");
                    c2.b(a2);
                    c2.d = true;
                    c2.a(new acwk(afiwVar.i, 1));
                    c2.g = afiwVar.c;
                    c2.h = afiwVar.d;
                }
                afiwVar.a.b(afiwVar.b, c2, afzr.a);
            }
        });
    }

    public final synchronized void a(String str, String str2) {
        int j = j(str, str2);
        long j2 = true != this.k ? 1900L : 95000L;
        int i = this.p;
        for (afiv afivVar : this.e) {
            i += afivVar.a();
        }
        if (i + j > j2) {
            h();
            j = j(str, str2);
        }
        this.p += j;
        this.h.c(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void b() {
        if (this.m.E || this.g.isEmpty()) {
            return;
        }
        boolean z = this.i != null;
        boolean z2 = this.n != null;
        boolean z3 = this.q;
        StringBuilder sb = new StringBuilder(97);
        sb.append("QoeStatsClient: Ping overflow, trackingUrl=");
        sb.append(z);
        sb.append(", baseQoeUriBuilder=");
        sb.append(z2);
        sb.append(", allowSendingPing=");
        sb.append(z3);
        String sb2 = sb.toString();
        afus.b(2, 6, sb2);
        afkj.b(afki.QOE, "%s", sb2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void c(zgp zgpVar) {
        this.n = zgpVar;
        int length = zgpVar.a().toString().length();
        this.p += length - this.o;
        this.o = length;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void d(boolean z) {
        this.k = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void e(TrackingUrlModel trackingUrlModel) {
        this.i = trackingUrlModel;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void f(boolean z) {
        this.j = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void h() {
        Iterator it = this.h.a.values().iterator();
        while (true) {
            if (it.hasNext()) {
                if (!((List) it.next()).isEmpty()) {
                    this.g.addLast(this.h);
                    this.h = new afix();
                    this.p = this.o;
                    break;
                }
            } else if (this.g.isEmpty()) {
                return;
            }
        }
        if (!this.q || this.n == null || this.i == null) {
            return;
        }
        while (!this.g.isEmpty()) {
            k((afix) this.g.removeFirst());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void i() {
        this.q = true;
        if (this.n != null && this.i != null) {
            while (!this.g.isEmpty()) {
                k((afix) this.g.removeFirst());
            }
        }
    }
}
