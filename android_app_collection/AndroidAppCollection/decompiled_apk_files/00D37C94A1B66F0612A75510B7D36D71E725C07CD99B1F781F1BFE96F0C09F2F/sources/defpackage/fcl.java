package defpackage;

import java.util.Collection;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: fcl  reason: default package */
/* loaded from: classes3.dex */
public final class fcl {
    public final azqb a;
    public final afvn b;
    public final aahf c;
    public volatile amuk d = amuk.q();
    public final aypg e;
    private final azqb f;
    private final azqb g;
    private final faw h;
    private final axxh i;

    public fcl(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, axxh axxhVar, ayor ayorVar, afvn afvnVar, aahf aahfVar, faw fawVar) {
        this.f = azqbVar;
        this.a = azqbVar2;
        this.g = azqbVar3;
        this.i = axxhVar;
        this.b = afvnVar;
        this.c = aahfVar;
        this.h = fawVar;
        this.e = aahfVar.a(afvnVar.c()).h(emn.d(), true).X(ayorVar).I(efx.k).V(dzy.r).k(asyv.class).B().at(new fck(this, 1), new fck(this));
    }

    public final int a() {
        try {
            return ((Integer) zna.r(this.h.b(fau.a().a()).E(dzy.q)).get(4L, TimeUnit.SECONDS)).intValue();
        } catch (InterruptedException e) {
            zep.d("Get offlined Downloads Count was interrupted", e);
            return 0;
        } catch (ExecutionException e2) {
            zep.d("Failed to get offlined Downloads Count", e2);
            return 0;
        } catch (TimeoutException e3) {
            zep.d("Get offlined Downloads Count timed out", e3);
            return 0;
        }
    }

    public final ankt b() {
        return ((fcm) this.g.get()).h();
    }

    public final synchronized void c(asyv asyvVar) {
        amuf f = amuk.f();
        amzt listIterator = ((amuk) asyvVar.getItemsModels()).listIterator();
        while (listIterator.hasNext()) {
            asyq a = ((asys) listIterator.next()).a();
            if (a != null) {
                f.h(a.d());
            }
        }
        this.d = f.g();
    }

    public final boolean d() {
        try {
            return ((Boolean) ((ankq) ((fcm) this.g.get()).h()).b).booleanValue();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return false;
        } catch (Exception e) {
            zep.d("Failed to get has access to offline.", e);
            return false;
        }
    }

    public final boolean e() {
        return ((ahdn) this.f.get()).c() && (!((agrf) this.a.get()).a().k().f(agqq.b(2)).isEmpty() || f());
    }

    public final boolean f() {
        return !this.d.isEmpty();
    }

    public final boolean g(String str) {
        return this.d.contains(str);
    }

    public final boolean h() {
        if (!((ahdn) this.f.get()).c()) {
            return false;
        }
        if (this.i.c().booleanValue()) {
            return f() || a() > 0;
        }
        try {
            if (((Collection) ((agrf) this.a.get()).a().m().i().get(4L, TimeUnit.SECONDS)).isEmpty()) {
                if (!f()) {
                    return false;
                }
            }
            return true;
        } catch (InterruptedException e) {
            zep.d("Get offline video snapshots was interrupted", e);
            return false;
        } catch (ExecutionException e2) {
            zep.d("Failed to get offline video snapshots", e2);
            return false;
        } catch (TimeoutException e3) {
            zep.d("Get offline video snapshots timed out", e3);
            return false;
        }
    }

    public final boolean i(String str) {
        return !amps.e(str) && j() && ((agrf) this.a.get()).a().i().e(str) != null;
    }

    public final boolean j() {
        return ((ahdn) this.f.get()).c() && !((agrf) this.a.get()).a().i().j().isEmpty();
    }

    public final boolean k() {
        return ((ahdn) this.f.get()).c() && !((agrf) this.a.get()).a().m().k().isEmpty();
    }

    public final boolean l(String str) {
        agqv e;
        return h() && (e = ((agrf) this.a.get()).a().m().e(str)) != null && !e.s();
    }

    public final boolean m() {
        return ((ahdn) this.f.get()).c() && !((agrf) this.a.get()).a().k().e().isEmpty();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005f, code lost:
        if (((defpackage.agrf) r4.a.get()).a().k().e().size() > ((defpackage.agrf) r4.a.get()).a().k().m().size()) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean n() {
        /*
            r4 = this;
            axxh r0 = r4.i
            java.lang.Boolean r0 = r0.c()
            boolean r0 = r0.booleanValue()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L1c
            boolean r0 = r4.f()
            if (r0 == 0) goto L1b
            int r0 = r4.a()
            if (r0 > 0) goto L1b
            return r1
        L1b:
            return r2
        L1c:
            boolean r0 = r4.m()
            if (r0 == 0) goto L6f
            boolean r0 = r4.e()
            if (r0 == 0) goto L6f
            boolean r0 = r4.m()
            if (r0 != 0) goto L2f
            goto L62
        L2f:
            azqb r0 = r4.a
            java.lang.Object r0 = r0.get()
            agrf r0 = (defpackage.agrf) r0
            agvx r0 = r0.a()
            agwc r0 = r0.k()
            java.util.Collection r0 = r0.m()
            int r0 = r0.size()
            azqb r3 = r4.a
            java.lang.Object r3 = r3.get()
            agrf r3 = (defpackage.agrf) r3
            agvx r3 = r3.a()
            agwc r3 = r3.k()
            java.util.Collection r3 = r3.e()
            int r3 = r3.size()
            if (r3 <= r0) goto L62
            goto L6f
        L62:
            boolean r0 = r4.k()
            if (r0 != 0) goto L6f
            boolean r0 = r4.j()
            if (r0 != 0) goto L6f
            return r1
        L6f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fcl.n():boolean");
    }
}
