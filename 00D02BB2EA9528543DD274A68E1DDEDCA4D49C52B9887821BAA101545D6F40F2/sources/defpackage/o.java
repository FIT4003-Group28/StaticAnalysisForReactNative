package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: o  reason: default package */
/* loaded from: classes.dex */
public final class o extends k {
    private final WeakReference<m> c;
    private final ahh<aou, n> b = new ahh<>();
    private int d = 0;
    private boolean e = false;
    private boolean f = false;
    private final ArrayList<j> g = new ArrayList<>();
    public j a = j.INITIALIZED;

    public o(m mVar) {
        this.c = new WeakReference<>(mVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static j f(j jVar, j jVar2) {
        return (jVar2 == null || jVar2.compareTo(jVar) >= 0) ? jVar : jVar2;
    }

    public static final void g(String str) {
        if (ahd.a().b()) {
            return;
        }
        throw new IllegalStateException("Method " + str + " must be called on the main thread");
    }

    private final void h(j jVar) {
        if (this.a == jVar) {
            return;
        }
        this.a = jVar;
        if (this.e || this.d != 0) {
            this.f = true;
            return;
        }
        this.e = true;
        l();
        this.e = false;
    }

    private final j i(aou aouVar) {
        ahh<aou, n> ahhVar = this.b;
        j jVar = null;
        ahk<aou, n> ahkVar = ahhVar.c(aouVar) ? ahhVar.a.get(aouVar).d : null;
        j jVar2 = ahkVar != null ? ahkVar.b.a : null;
        if (!this.g.isEmpty()) {
            ArrayList<j> arrayList = this.g;
            jVar = arrayList.get(arrayList.size() - 1);
        }
        return f(f(this.a, jVar2), jVar);
    }

    private final void j() {
        ArrayList<j> arrayList = this.g;
        arrayList.remove(arrayList.size() - 1);
    }

    private final void k(j jVar) {
        this.g.add(jVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
        r6.f = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void l() {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o.l():void");
    }

    @Override // defpackage.k
    public final void a(aou aouVar) {
        n nVar;
        m mVar;
        g("addObserver");
        n nVar2 = new n(aouVar, this.a == j.DESTROYED ? j.DESTROYED : j.INITIALIZED);
        ahh<aou, n> ahhVar = this.b;
        ahk<aou, n> a = ahhVar.a(aouVar);
        if (a != null) {
            nVar = a.b;
        } else {
            ahhVar.a.put(aouVar, ahhVar.e(aouVar, nVar2));
            nVar = null;
        }
        if (nVar == null && (mVar = this.c.get()) != null) {
            boolean z = this.d != 0 || this.e;
            j i = i(aouVar);
            this.d++;
            while (nVar2.a.compareTo(i) < 0 && this.b.c(aouVar)) {
                k(nVar2.a);
                i b = i.b(nVar2.a);
                if (b != null) {
                    nVar2.a(mVar, b);
                    j();
                    i = i(aouVar);
                } else {
                    throw new IllegalStateException("no event up from " + nVar2.a);
                }
            }
            if (!z) {
                l();
            }
            this.d--;
        }
    }

    @Override // defpackage.k
    public final void b(aou aouVar) {
        g("removeObserver");
        this.b.b(aouVar);
    }

    @Override // defpackage.k
    public final j c() {
        return this.a;
    }

    public final void d(j jVar) {
        g("setCurrentState");
        h(jVar);
    }

    public final void e(i iVar) {
        g("handleLifecycleEvent");
        h(iVar.c());
    }
}
