package defpackage;

import android.text.TextUtils;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: rnv  reason: default package */
/* loaded from: classes7.dex */
public final class rnv implements saf {
    public static final AtomicInteger e = new AtomicInteger(0);
    public final gfq a;
    public final cqkj b;
    public final Executor c;
    public cqkf<cqkp> d;
    private final bzqa f;
    private final cjnx g;
    private final btvo h;

    public rnv(bzqa bzqaVar, cjnx cjnxVar, btvo btvoVar, gfq gfqVar, cqkj cqkjVar, Executor executor) {
        this.f = bzqaVar;
        this.g = cjnxVar;
        this.h = btvoVar;
        this.a = gfqVar;
        this.b = cqkjVar;
        this.c = executor;
    }

    public static void a() {
        e.set(0);
    }

    public static void f(rmf<?> rmfVar) {
        if (rmfVar.aD) {
            rmfVar.b.a(rmfVar.i(rmfVar.aJ()));
        }
    }

    private final String g() {
        String str = this.h.getCommuteSetupParameters().f;
        if (TextUtils.isEmpty(str)) {
            duwv duwvVar = this.h.getLocationParameters().g;
            if (duwvVar == null) {
                duwvVar = duwv.d;
            }
            return duwvVar.c;
        }
        return str;
    }

    @Override // defpackage.saf
    public final boolean b() {
        return this.g.m() || e.get() == 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean c() {
        return !b() && e.get() == 0;
    }

    public final void d(final rmf<?> rmfVar) {
        this.f.a(new int[]{2, 15}, new rnu(-1), g());
        this.g.k().Pk(new Runnable(this, rmfVar) { // from class: rns
            private final rnv a;
            private final rmf b;

            {
                this.a = this;
                this.b = rmfVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                rnv rnvVar = this.a;
                rmf rmfVar2 = this.b;
                if (!rnvVar.c()) {
                    rnv.f(rmfVar2);
                }
            }
        }, this.c);
    }

    @Override // defpackage.saf
    public final void e() {
        this.f.a(new int[]{2, 15}, new rnu(1), g());
    }
}
