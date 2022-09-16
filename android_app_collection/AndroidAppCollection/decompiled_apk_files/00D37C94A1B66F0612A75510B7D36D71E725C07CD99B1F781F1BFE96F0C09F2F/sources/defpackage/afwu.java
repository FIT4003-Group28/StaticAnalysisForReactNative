package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: afwu  reason: default package */
/* loaded from: classes.dex */
public final class afwu {
    public final afwz a;
    public final yrj b;
    public final afsv c;
    public final yme d;
    public final afwx e;
    private final afvn f;
    private final Set g;
    private final yqw h;
    private final snc i;
    private final Executor j;
    private final Executor k;
    private final Executor l;

    public afwu(afvn afvnVar, yqw yqwVar, afwz afwzVar, snc sncVar, yrj yrjVar, afsv afsvVar, Executor executor, Executor executor2, yme ymeVar, afwx afwxVar, Set set) {
        this.f = afvnVar;
        this.h = yqwVar;
        this.a = afwzVar;
        this.i = sncVar;
        this.b = yrjVar;
        this.c = afsvVar;
        this.j = executor;
        this.k = executor2;
        this.l = anlz.g(executor2);
        this.d = ymeVar;
        this.e = afwxVar;
        this.g = set;
    }

    public static final afwt c(byte[] bArr, String str) {
        return new afwt(bArr, str);
    }

    public static final afwt d(String str) {
        return new afwt(1, str);
    }

    public static final afwt e(String str) {
        return new afwt(2, str);
    }

    @Deprecated
    public final void a(afwt afwtVar, cez cezVar) {
        b(null, afwtVar, cezVar);
    }

    public final void b(afsw afswVar, afwt afwtVar, final cez cezVar) {
        int b;
        final Uri uri = afwtVar.b;
        if (uri == null || uri.getScheme() == null || uri.getHost() == null) {
            this.j.execute(new Runnable() { // from class: afwp
                @Override // java.lang.Runnable
                public final void run() {
                    cez cezVar2 = cez.this;
                    String valueOf = String.valueOf(uri);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 12);
                    sb.append("Invalid URI ");
                    sb.append(valueOf);
                    cezVar2.kV(new afwg(sb.toString()));
                }
            });
            return;
        }
        int i = afwtVar.k;
        String uri2 = afwtVar.b.toString();
        String str = afwtVar.a;
        long j = afwtVar.e;
        afsv afsvVar = this.c;
        if (afswVar != null) {
            b = afswVar.a();
        } else {
            b = afsvVar.b();
        }
        long c = this.i.c() + TimeUnit.HOURS.toMillis(b);
        long j2 = (j <= 0 || j >= c) ? c : j;
        long millis = afswVar != null ? TimeUnit.MINUTES.toMillis(afswVar.b()) : 0L;
        ArrayList arrayList = new ArrayList();
        if (afswVar != null) {
            for (Integer num : afswVar.c()) {
                int intValue = num.intValue();
                if (intValue > 0) {
                    arrayList.add(Long.valueOf(TimeUnit.SECONDS.toMillis(intValue)));
                }
            }
        }
        byte[] bArr = afwtVar.c;
        Map map = afwtVar.f;
        Set set = this.g;
        snc sncVar = this.i;
        int d = this.c.d();
        afvm afvmVar = afwtVar.g;
        if (afvmVar == null) {
            afvmVar = this.f.c();
        }
        afwo afwoVar = new afwo(i, uri2, str, j2, millis, arrayList, bArr, map, cezVar, set, sncVar, d, afvmVar, afwtVar.h, afwtVar.j);
        boolean d2 = afswVar != null ? afswVar.d() : this.c.g();
        boolean z = afwtVar.d;
        if (!d2 || !z || this.a == afwz.d) {
            this.h.a(afwoVar);
            return;
        }
        afwq afwqVar = new afwq(this, afwoVar);
        if (this.c.h()) {
            this.l.execute(afwqVar);
        } else {
            this.k.execute(afwqVar);
        }
    }
}
