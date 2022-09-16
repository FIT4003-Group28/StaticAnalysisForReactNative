package defpackage;

import java.io.File;
import java.util.Comparator;
import java.util.TreeSet;
/* compiled from: PG */
/* renamed from: aeac  reason: default package */
/* loaded from: classes.dex */
public final class aeac implements Comparator, pdi {
    final long a;
    private final TreeSet b;
    private final amqo c;
    private final long d;
    private final float e;
    private final long f;
    private final long g;
    private final float h;
    private boolean i;
    private long j;

    public aeac(amqo amqoVar, aqwp aqwpVar, aqwp aqwpVar2) {
        boolean z = false;
        if (aqwpVar != null && aqwpVar2 != null && aqwpVar.c > 0 && aqwpVar2.c > 0) {
            z = true;
        }
        this.c = amqoVar;
        long j = 1073741824;
        this.a = z ? aqwpVar.b : 1073741824L;
        this.d = z ? aqwpVar.c : 5368709120L;
        this.e = z ? aqwpVar.d : 0.2f;
        this.f = z ? aqwpVar2.b : 33554432L;
        this.g = z ? aqwpVar2.c : j;
        this.h = z ? aqwpVar2.d : 0.15f;
        this.b = new TreeSet(this);
    }

    private final void i(pde pdeVar) {
        long e = e();
        while (true) {
            long j = this.j;
            if (j <= 0 || j <= e) {
                return;
            }
            try {
                pdeVar.l((pdj) this.b.first());
            } catch (pdc unused) {
            }
        }
    }

    @Override // defpackage.pdd
    public final void a(pde pdeVar, pdj pdjVar) {
        this.b.add(pdjVar);
        this.j += pdjVar.c;
        if (this.i) {
            i(pdeVar);
        }
    }

    @Override // defpackage.pdd
    public final void b(pde pdeVar, pdj pdjVar, pdj pdjVar2) {
        c(pdjVar);
        a(pdeVar, pdjVar2);
    }

    @Override // defpackage.pdd
    public final void c(pdj pdjVar) {
        this.b.remove(pdjVar);
        this.j -= pdjVar.c;
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
        return this.j;
    }

    @Override // defpackage.pdi
    public final long e() {
        amqo amqoVar;
        if (!this.i || (amqoVar = this.c) == null) {
            return 0L;
        }
        File file = (File) amqoVar.get();
        long usableSpace = file.getUsableSpace();
        long min = Math.min(this.g, Float.valueOf(this.h * ((float) Math.max(0L, (usableSpace - Math.max(this.a, Math.min(this.d, Float.valueOf(((float) (file.getTotalSpace() - (file.getFreeSpace() - usableSpace))) * this.e).longValue()))) + this.j))).longValue());
        if (min >= this.f) {
            return min;
        }
        return 0L;
    }

    @Override // defpackage.pdi
    public final void f() {
        this.i = true;
    }

    @Override // defpackage.pdi
    public final boolean g() {
        return true;
    }

    @Override // defpackage.pdi
    public final void h(pde pdeVar, long j) {
        if (this.i) {
            i(pdeVar);
        }
    }
}
