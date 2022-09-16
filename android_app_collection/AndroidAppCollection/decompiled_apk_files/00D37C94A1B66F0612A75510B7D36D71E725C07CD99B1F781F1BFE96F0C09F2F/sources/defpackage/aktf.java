package defpackage;

import android.content.Context;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: aktf  reason: default package */
/* loaded from: classes.dex */
public final class aktf extends aksz {
    static final long a = TimeUnit.MINUTES.toSeconds(2);
    long b;
    private boolean c = false;
    private final azqb d;
    private final snc e;

    public aktf(azqb azqbVar, snc sncVar) {
        azqbVar.getClass();
        this.d = azqbVar;
        sncVar.getClass();
        this.e = sncVar;
    }

    @Override // defpackage.aktk
    public final void d(avff avffVar) {
        long millis;
        if (avffVar == null || (avffVar.b & 256) == 0) {
            return;
        }
        avex avexVar = avffVar.g;
        if (avexVar == null) {
            avexVar = avex.a;
        }
        this.c = avexVar.b;
        avex avexVar2 = avffVar.g;
        if (avexVar2 == null) {
            avexVar2 = avex.a;
        }
        long j = a;
        if (avexVar2.c <= j) {
            millis = TimeUnit.SECONDS.toMillis(j);
        } else {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            avex avexVar3 = avffVar.g;
            if (avexVar3 == null) {
                avexVar3 = avex.a;
            }
            millis = timeUnit.toMillis(avexVar3.c);
        }
        this.b = millis;
    }

    @Override // defpackage.aktk
    public final boolean e() {
        return this.c;
    }

    @Override // defpackage.aktk
    public final boolean f(Context context, aopa aopaVar) {
        long c = this.e.c();
        afuf afufVar = (afuf) this.d.get();
        amzs it = afufVar.a.keySet().iterator();
        long j = -1;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            long a2 = afufVar.a((String) it.next());
            if (a2 == -2) {
                j = -2;
                break;
            }
            j = Math.max(a2, j);
        }
        if (j == -1) {
            amzs it2 = afufVar.a.keySet().iterator();
            while (it2.hasNext()) {
                afufVar.c((String) it2.next());
            }
            amzs it3 = afufVar.a.keySet().iterator();
            while (it3.hasNext()) {
                afufVar.i((String) it3.next(), c);
            }
            return false;
        }
        if (j != -2 && c - j >= this.b) {
            HashMap hashMap = new HashMap();
            amzs it4 = afufVar.a.keySet().iterator();
            while (it4.hasNext()) {
                String str = (String) it4.next();
                aqlk b = afufVar.b(str, c);
                if (b != null) {
                    hashMap.put(str, b);
                }
            }
            if (hashMap.size() == 0) {
                hashMap = null;
            }
            if (hashMap != null && hashMap.size() != 0) {
                aopaVar.copyOnWrite();
                aven avenVar = aven.a;
                ((aven) aopaVar.instance).h = aven.emptyProtobufList();
                aopaVar.aR(hashMap.values());
                for (String str2 : hashMap.keySet()) {
                    afufVar.c(str2);
                    afufVar.i(str2, this.e.c());
                }
                return true;
            }
        }
        return false;
    }
}
