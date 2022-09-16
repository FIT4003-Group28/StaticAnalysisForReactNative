package defpackage;

import android.os.Handler;
import com.google.android.libraries.youtube.player.stats.HeartbeatClient$HeartbeatClientState;
import java.security.SecureRandom;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: aits  reason: default package */
/* loaded from: classes.dex */
public final class aits {
    public final aawx a;
    public final String b;
    public final aitr c;
    public final arzt d;
    public final byte[] e;
    public final String f;
    public volatile long g;
    public int h;
    private final snc i;
    private final Executor j;
    private final Handler k;
    private final SecureRandom l;
    private final acrr m;
    private volatile boolean p;
    private final AtomicInteger o = new AtomicInteger();
    private final Runnable n = new aitq(this);

    public aits(snc sncVar, Executor executor, Handler handler, SecureRandom secureRandom, aawx aawxVar, String str, aitr aitrVar, arzt arztVar, byte[] bArr, String str2, acrr acrrVar) {
        this.i = sncVar;
        this.j = executor;
        this.k = handler;
        this.l = secureRandom;
        this.a = aawxVar;
        this.b = str;
        this.c = aitrVar;
        this.d = arztVar;
        this.e = bArr;
        this.f = str2;
        this.m = acrrVar;
    }

    public final synchronized HeartbeatClient$HeartbeatClientState a() {
        return new HeartbeatClient$HeartbeatClientState(this.d, this.e, this.f, this.g, this.h);
    }

    public final synchronized void b() {
        if (this.g == 0) {
            this.g = this.i.d() + 2000;
        }
    }

    public final synchronized void c(ahhx ahhxVar) {
        if (!ahhxVar.j() || this.p || this.g == 0 || this.g > this.i.d()) {
            return;
        }
        this.p = true;
        this.j.execute(this.n);
    }

    public final void d(final aikd aikdVar, asaa asaaVar, boolean z) {
        this.o.set(0);
        this.p = false;
        this.g = 0L;
        aopa createBuilder = arfw.a.createBuilder();
        if (asaaVar != null) {
            aoob aoobVar = asaaVar.p;
            createBuilder.copyOnWrite();
            arfw arfwVar = (arfw) createBuilder.instance;
            aoobVar.getClass();
            arfwVar.b |= 1;
            arfwVar.c = aoobVar;
        }
        createBuilder.copyOnWrite();
        arfw arfwVar2 = (arfw) createBuilder.instance;
        arfwVar2.b |= 2;
        arfwVar2.d = z;
        arrf a = arrh.a();
        a.copyOnWrite();
        ((arrh) a.instance).cC((arfw) createBuilder.mo39build());
        this.m.c((arrh) a.mo39build());
        this.k.post(new Runnable() { // from class: aito
            @Override // java.lang.Runnable
            public final void run() {
                aits aitsVar = aits.this;
                aitsVar.c.e(aikdVar);
            }
        });
    }

    public final void e() {
        this.o.set(0);
        this.p = false;
        this.g = this.i.d() + this.d.d;
    }

    public final void f(Exception exc, int i) {
        int incrementAndGet = this.o.incrementAndGet();
        arzt arztVar = this.d;
        if (incrementAndGet <= arztVar.e) {
            this.p = false;
            this.g = (this.o.get() * 2000) + this.i.d() + (this.l.nextInt(999) - 499);
        } else if (arztVar.g) {
            e();
        } else {
            d(new aikd(i, exc), null, true);
        }
    }
}
