package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: czev  reason: default package */
/* loaded from: classes5.dex */
public class czev {
    public final int b;
    public final List<CountDownLatch> c;
    final /* synthetic */ czex d;
    public final int e;
    public final int f;
    private dehn<czew> g;
    private final Object a = new Object();
    private boolean h = false;

    public czev(czex czexVar, int i) {
        int b;
        this.d = czexVar;
        this.e = i;
        int i2 = 4;
        if (i == 4) {
            b = decl.b(dybx.a.a().a());
        } else {
            b = decl.b(dybx.a.a().h());
        }
        this.b = b;
        this.f = i != 3 ? 5 : i2;
        this.c = new ArrayList();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.dehn<defpackage.czew> a(final boolean r7, final java.util.UUID r8, @defpackage.dzsi java.util.concurrent.CountDownLatch r9) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.czev.a(boolean, java.util.UUID, java.util.concurrent.CountDownLatch):dehn");
    }

    public void b(TimeUnit timeUnit) {
        boolean z;
        dehn<czew> dehnVar;
        synchronized (this.a) {
            dehn<czew> dehnVar2 = this.g;
            z = false;
            if (dehnVar2 != null && !dehnVar2.isDone()) {
                z = true;
            }
            dehnVar = this.g;
        }
        if (z) {
            dehnVar.get(30000L, timeUnit);
        }
        this.d.h.a();
    }

    public final cyes c(czdx czdxVar, @dzsi Object obj, boolean z) {
        if (!z && czdxVar.p()) {
            int u = czdxVar.u();
            int i = u - 1;
            if (u == 0) {
                throw null;
            }
            if (i >= this.e - 1) {
                return cyes.FAILED_DATA_FRESH;
            }
        }
        if (!cyui.a(this.d.a)) {
            return cyes.FAILED_NETWORK;
        }
        if (obj == null) {
            return cyes.FAILED_PEOPLE_API_RESPONSE_EMPTY;
        }
        return cyes.SUCCESS;
    }
}
