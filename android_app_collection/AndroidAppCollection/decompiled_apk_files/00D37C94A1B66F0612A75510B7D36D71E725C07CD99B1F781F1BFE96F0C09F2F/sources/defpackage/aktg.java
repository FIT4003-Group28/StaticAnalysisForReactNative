package defpackage;

import android.content.Context;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: aktg  reason: default package */
/* loaded from: classes.dex */
public final class aktg extends aksz {
    static final long a = TimeUnit.MINUTES.toSeconds(2);
    long b;
    private boolean c = false;
    private final afug d;
    private final snc e;

    public aktg(afug afugVar, snc sncVar) {
        this.d = afugVar;
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
        List l;
        long c = this.e.c();
        this.d.m();
        if (c < this.b || (l = this.d.l()) == null || l.size() == 0) {
            return false;
        }
        aopaVar.copyOnWrite();
        aven avenVar = aven.a;
        ((aven) aopaVar.instance).h = aven.emptyProtobufList();
        aopaVar.aR(l);
        return true;
    }
}
