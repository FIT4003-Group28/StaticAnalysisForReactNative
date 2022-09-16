package defpackage;

import java.util.Comparator;
import java.util.TreeSet;
/* compiled from: PG */
/* renamed from: pdu  reason: default package */
/* loaded from: classes4.dex */
public final class pdu implements Comparator, pdi {
    private final long a;
    private final TreeSet b = new TreeSet(this);
    private long c;

    public pdu(long j) {
        this.a = j;
    }

    private final void i(pde pdeVar, long j) {
        while (this.c + j > this.a && !this.b.isEmpty()) {
            try {
                pdeVar.l((pdj) this.b.first());
            } catch (pdc unused) {
            }
        }
    }

    @Override // defpackage.pdd
    public final void a(pde pdeVar, pdj pdjVar) {
        this.b.add(pdjVar);
        this.c += pdjVar.c;
        i(pdeVar, 0L);
    }

    @Override // defpackage.pdd
    public final void b(pde pdeVar, pdj pdjVar, pdj pdjVar2) {
        c(pdjVar);
        a(pdeVar, pdjVar2);
    }

    @Override // defpackage.pdd
    public final void c(pdj pdjVar) {
        this.b.remove(pdjVar);
        this.c -= pdjVar.c;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        pdj pdjVar = (pdj) obj;
        pdj pdjVar2 = (pdj) obj2;
        long j = pdjVar.f;
        long j2 = pdjVar2.f;
        if (j - j2 == 0) {
            return pdjVar.compareTo(pdjVar2);
        }
        return j >= j2 ? 1 : -1;
    }

    @Override // defpackage.pdi
    public final long d() {
        return this.c;
    }

    @Override // defpackage.pdi
    public final long e() {
        return this.a;
    }

    @Override // defpackage.pdi
    public final void f() {
    }

    @Override // defpackage.pdi
    public final boolean g() {
        return true;
    }

    @Override // defpackage.pdi
    public final void h(pde pdeVar, long j) {
        if (j != -1) {
            i(pdeVar, j);
        }
    }
}
