package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import java.security.Key;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: aegk  reason: default package */
/* loaded from: classes.dex */
public final class aegk {
    public final aeae a;
    public aegj b;
    private final amqo d;
    private final pde e;
    private final Key f;
    private final Key g;
    private final afjm h;
    private final Object i;
    private final pwx j;
    private final ampq k;
    private final Object l;
    private final snc n;
    private long o;
    private long p;
    private final aegg q;
    public volatile boolean c = false;
    private volatile boolean m = false;

    public aegk(amqo amqoVar, pde pdeVar, Key key, Key key2, afjm afjmVar, aegg aeggVar, snc sncVar, Object obj, aeae aeaeVar, pwx pwxVar, ampq ampqVar) {
        this.d = amqoVar;
        this.e = pdeVar;
        this.f = key;
        this.g = key2;
        afjmVar.getClass();
        this.h = afjmVar;
        this.q = aeggVar;
        this.n = sncVar;
        this.i = obj;
        this.a = aeaeVar;
        this.j = pwxVar;
        ampqVar.getClass();
        this.k = ampqVar;
        this.l = new Object();
        this.o = -1L;
    }

    private final asv c() {
        pdt pdtVar = new pdt("Downloader");
        Key key = this.f;
        return key != null ? new ayk(key.getEncoded(), pdtVar) : pdtVar;
    }

    public final void a(boolean z) {
        synchronized (this.l) {
            this.c = true;
            this.m = z;
        }
    }

    public final void b(FormatStreamModel formatStreamModel, long j, long j2, String str, afjk afjkVar, afjk afjkVar2) {
        String str2;
        int g;
        pde pdeVar;
        synchronized (this.i) {
            asy asyVar = new asy(TextUtils.isEmpty(str) ? formatStreamModel.d : formatStreamModel.l(str), j, j2, aear.c(formatStreamModel.b, formatStreamModel.e(), formatStreamModel.w(), formatStreamModel.k()), null);
            asv a = this.h.a();
            amqo amqoVar = this.d;
            if (amqoVar != null && (pdeVar = (pde) amqoVar.get()) != null) {
                a = new pdh(pdeVar, a, c(), null, 5, afjkVar);
            }
            if (this.k.h()) {
                a = ((afjl) this.k.c()).a(a);
            }
            asv asvVar = a;
            axd pdgVar = new pdg(this.q.a, 20480);
            Key key = this.g;
            int i = 4096;
            int i2 = -10;
            aya ayaVar = new aya(new pdh(this.e, asvVar, c(), key != null ? new ayj(key.getEncoded(), pdgVar, new byte[4096]) : pdgVar, 5, afjkVar2), this.j, -10);
            byte[] bArr = new byte[4096];
            int i3 = 0;
            asy asyVar2 = asyVar;
            boolean z = false;
            while (!z) {
                this.j.a(i2);
                this.j.d();
                long j3 = 0;
                try {
                    ayaVar.h(asyVar2);
                    while (!this.c && (g = ayaVar.g(bArr, i3, i)) >= 0) {
                        j3 += g;
                        long j4 = asyVar2.g + j3;
                        if (j4 == this.o) {
                            if (this.n.d() - this.p >= TimeUnit.MILLISECONDS.convert(30L, TimeUnit.SECONDS)) {
                                throw new aegp();
                                break;
                            }
                        } else {
                            this.o = j4;
                            this.p = this.n.d();
                            aegj aegjVar = this.b;
                            if (aegjVar != null) {
                                aegjVar.g(formatStreamModel, j4);
                            }
                        }
                        i = 4096;
                        i3 = 0;
                    }
                    z = true;
                } catch (pww unused) {
                    z = j3 == asyVar2.h;
                    if (!z) {
                        asyVar2 = asyVar2.b(j3);
                    }
                } finally {
                    ayaVar.j();
                }
                this.j.c(-10);
                i = 4096;
                i3 = 0;
                i2 = -10;
            }
            if (this.c) {
                if (this.m && (str2 = asyVar.i) != null) {
                    for (pdj pdjVar : this.e.f(str2)) {
                        long j5 = pdjVar.b;
                        long j6 = asyVar.g;
                        if (j5 >= j6 && j5 + pdjVar.c <= j6 + asyVar.h) {
                            this.e.l(pdjVar);
                        }
                    }
                }
            }
        }
    }
}
