package defpackage;

import com.google.android.libraries.social.populous.Autocompletion;
import com.google.android.libraries.social.populous.core.AutocompletionCallbackMetadata;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: cxyg  reason: default package */
/* loaded from: classes5.dex */
public final class cxyg {
    public final Object a = new Object();
    public final dbug b;
    public dccx<Autocompletion> c;
    public dcdc<Autocompletion> d;
    public long e;
    @dzsi
    public cytq f;
    public final cytg g;
    public int h;
    private final long i;
    private final long j;

    public cxyg(dbug dbugVar, long j, long j2, TimeUnit timeUnit) {
        cytg m = cyth.m();
        m.b(0);
        m.d(true);
        m.f(0);
        m.i(8);
        m.h(dcdc.e());
        cydr e = AutocompletionCallbackMetadata.e();
        cybv cybvVar = (cybv) e;
        cybvVar.b = 3;
        cybvVar.a = 1;
        e.b(cyds.DID_NOT_WAIT_FOR_RESULTS);
        m.e(e.a());
        this.g = m;
        this.b = dbugVar;
        this.i = timeUnit.toNanos(j);
        this.j = timeUnit.toNanos(j2);
        b();
    }

    public final void a() {
        synchronized (this.a) {
            int i = this.h;
            if (i == 2 || i == 3) {
                long a = this.b.a() - this.e;
                if (a >= this.j) {
                    b();
                } else if (a >= this.i) {
                    this.h = 3;
                }
            }
        }
    }

    public final void b() {
        synchronized (this.a) {
            this.f = null;
            this.h = 1;
            this.d = dcdc.e();
            this.e = 0L;
        }
    }
}
