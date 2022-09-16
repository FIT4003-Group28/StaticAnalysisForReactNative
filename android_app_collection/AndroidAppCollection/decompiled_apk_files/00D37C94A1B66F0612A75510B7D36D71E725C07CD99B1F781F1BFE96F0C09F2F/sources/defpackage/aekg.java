package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: aekg  reason: default package */
/* loaded from: classes.dex */
public final class aekg {
    static final Character[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public final amqo b;
    public final long c;
    public final snc d;
    public final ScheduledExecutorService e;
    public final aeki f;
    public final long g;
    public long h;
    public final long i;
    public final ArrayList j;
    public final Set k;
    public String l;
    public boolean m;
    public final yrd n;
    private final yrj o;
    private final int p;
    private final boolean q;
    private boolean r;

    public aekg(amqo amqoVar, String str, List list, long j, long j2, int i, snc sncVar, ScheduledExecutorService scheduledExecutorService, yrj yrjVar, aeki aekiVar, aant aantVar, yrd yrdVar, Set set) {
        afms.a(amqoVar);
        this.b = amqoVar;
        this.c = j > 0 ? j : 25000L;
        this.i = j2;
        afms.a(sncVar);
        this.d = sncVar;
        this.g = sncVar.d();
        afms.a(scheduledExecutorService);
        this.e = scheduledExecutorService;
        this.f = aekiVar;
        this.r = false;
        this.l = "ns";
        this.o = yrjVar;
        this.p = i;
        this.n = yrdVar;
        this.k = set;
        ArrayList arrayList = new ArrayList();
        this.j = arrayList;
        if (list.isEmpty()) {
            this.q = true;
            zgh.m(str);
            Uri parse = Uri.parse(str);
            arrayList.add(new aekd(this, parse, aantVar));
            arrayList.add(new aekd(this, a(parse), aantVar));
            arrayList.add(new aekd(this, parse.buildUpon().appendQueryParameter("cmo", "pf=1").build(), aantVar));
            return;
        }
        this.q = false;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.j.add(new aekd(this, Uri.parse((String) it.next()), aantVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Uri a(Uri uri) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 16; i++) {
            Character[] chArr = a;
            int length = chArr.length;
            sb.append(chArr[random.nextInt(16)].charValue());
        }
        zgp b = zgp.b(uri);
        b.g("id", sb.toString());
        return b.a();
    }

    public static void f(aekd aekdVar) {
        Uri uri;
        try {
            try {
                if (!aekdVar.f.get().aS()) {
                    uri = aekdVar.a;
                } else {
                    uri = aeny.a(aekdVar.a);
                }
                aekdVar.e.h(new asy(uri));
                aekdVar.f(aekdVar.e.i());
                aekdVar.d();
                try {
                    aekdVar.e.j();
                } catch (ate unused) {
                }
            } catch (Throwable th) {
                try {
                    aekdVar.e.j();
                } catch (ate unused2) {
                }
                throw th;
            }
        } catch (ate unused3) {
            aekdVar.c();
            try {
                aekdVar.e.j();
            } catch (ate unused4) {
            }
        }
    }

    private final aenx j(String str) {
        aenx a2;
        if (str == null) {
            a2 = this.f.b();
        } else {
            a2 = this.f.a(str);
        }
        if (a2 != null) {
            return a2;
        }
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            aekd aekdVar = (aekd) arrayList.get(i);
            String b = aekdVar.b();
            if (b != null && !TextUtils.equals(b, str)) {
                return new aenx(b, -1, aekdVar.a());
            }
        }
        return null;
    }

    public final synchronized long b() {
        return ((aekd) this.j.get(0)).c;
    }

    public final synchronized aenx c(String str) {
        return j(str);
    }

    public final synchronized aenx d() {
        return j(null);
    }

    public final void e(Uri uri) {
        aeki aekiVar = this.f;
        String host = uri == null ? null : uri.getHost();
        if (host != null) {
            aekiVar.b.put(host, uri);
            aelw aelwVar = (aelw) aekiVar.a.get(host);
            if (aelwVar == null) {
                return;
            }
            aelwVar.b = uri;
        }
    }

    public final synchronized void g(long j) {
        this.l = null;
        this.m = true;
        if (!this.r) {
            this.h = this.d.d();
            this.r = true;
            this.e.schedule(new aekf(this, this.o, this.q, this.p), j, TimeUnit.MILLISECONDS);
        }
    }

    public final synchronized void h(String str) {
        this.l = str;
        this.m = false;
    }

    public aekg() {
    }
}
