package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: l  reason: default package */
/* loaded from: classes3.dex */
public class l extends apu {
    private final WeakReference c;
    public final acn a = new acn();
    private int d = 0;
    private boolean e = false;
    private boolean f = false;
    private final ArrayList g = new ArrayList();
    public apt b = apt.INITIALIZED;

    public l(apy apyVar) {
        this.c = new WeakReference(apyVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static apt b(apt aptVar, apt aptVar2) {
        return (aptVar2 == null || aptVar2.compareTo(aptVar) >= 0) ? aptVar : aptVar2;
    }

    public static final void g(String str) {
        if (acl.a().b()) {
            return;
        }
        throw new IllegalStateException("Method " + str + " must be called on the main thread");
    }

    private final apt h(apx apxVar) {
        acn acnVar = this.a;
        apt aptVar = null;
        acq acqVar = acnVar.d(apxVar) ? ((acq) acnVar.a.get(apxVar)).d : null;
        apt aptVar2 = acqVar != null ? ((k) acqVar.b).a : null;
        if (!this.g.isEmpty()) {
            ArrayList arrayList = this.g;
            aptVar = (apt) arrayList.get(arrayList.size() - 1);
        }
        return b(b(this.b, aptVar2), aptVar);
    }

    private final void i(apt aptVar) {
        if (this.b == aptVar) {
            return;
        }
        this.b = aptVar;
        if (this.e || this.d != 0) {
            this.f = true;
            return;
        }
        this.e = true;
        l();
        this.e = false;
    }

    private final void j() {
        ArrayList arrayList = this.g;
        arrayList.remove(arrayList.size() - 1);
    }

    private final void k(apt aptVar) {
        this.g.add(aptVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
        r6.f = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void l() {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l.l():void");
    }

    @Override // defpackage.apu
    public final apt a() {
        return this.b;
    }

    @Override // defpackage.apu
    public final void c(apx apxVar) {
        apy apyVar;
        g("addObserver");
        k kVar = new k(apxVar, this.b == apt.DESTROYED ? apt.DESTROYED : apt.INITIALIZED);
        if (((k) this.a.b(apxVar, kVar)) == null && (apyVar = (apy) this.c.get()) != null) {
            boolean z = this.d != 0 || this.e;
            apt h = h(apxVar);
            this.d++;
            while (kVar.a.compareTo(h) < 0 && this.a.d(apxVar)) {
                k(kVar.a);
                aps b = aps.b(kVar.a);
                if (b != null) {
                    kVar.a(apyVar, b);
                    j();
                    h = h(apxVar);
                } else {
                    throw new IllegalStateException("no event up from " + kVar.a);
                }
            }
            if (!z) {
                l();
            }
            this.d--;
        }
    }

    public void d(aps apsVar) {
        g("handleLifecycleEvent");
        i(apsVar.c());
    }

    @Override // defpackage.apu
    public final void e(apx apxVar) {
        g("removeObserver");
        this.a.c(apxVar);
    }

    public final void f(apt aptVar) {
        g("setCurrentState");
        i(aptVar);
    }
}
