package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: btzw  reason: default package */
/* loaded from: classes4.dex */
public final class btzw {
    public final List<btzu> a = new ArrayList();
    public long b;
    public long c;
    @dzsi
    private final cqat d;

    public btzw(@dzsi cqat cqatVar) {
        this.d = cqatVar;
    }

    public final dehn<List<btzv>> a() {
        dehn<List<btzv>> j;
        synchronized (this) {
            ArrayList arrayList = new ArrayList();
            for (btzu btzuVar : this.a) {
                int i = btzu.m;
                arrayList.add(btzuVar.k);
            }
            j = deha.j(arrayList);
        }
        return j;
    }

    public final void b() {
        cqat cqatVar = this.d;
        if (cqatVar != null) {
            this.b = cqatVar.e();
        }
    }

    public final void c(@dzsi dehq dehqVar) {
        cqat cqatVar = this.d;
        if (cqatVar != null) {
            this.c = cqatVar.e();
        }
        synchronized (this) {
            for (final btzu btzuVar : this.a) {
                int i = btzu.m;
                if (!btzuVar.k.isDone()) {
                    bvqd.a(dehqVar.d(new Runnable(btzuVar) { // from class: btzt
                        private final btzu a;

                        {
                            this.a = btzuVar;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.a.a();
                        }
                    }, btzu.a, TimeUnit.MILLISECONDS), dehqVar);
                }
            }
        }
    }
}
