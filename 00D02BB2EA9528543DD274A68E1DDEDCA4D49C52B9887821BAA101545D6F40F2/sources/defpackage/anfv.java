package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: anfv  reason: default package */
/* loaded from: classes2.dex */
public final class anfv implements anhi {
    public final angv a;
    public final cjnx b;
    private final cqat c;
    private final anfu f = new anfu(this);
    private final crzo<anhh> d = new crzo<>(anhh.c(dbpy.a));
    private final AtomicBoolean e = new AtomicBoolean(false);

    public anfv(cqat cqatVar, angv angvVar, cjnx cjnxVar) {
        this.c = cqatVar;
        this.a = angvVar;
        this.b = cjnxVar;
    }

    public final synchronized void a() {
        if (this.e.compareAndSet(false, true)) {
            c();
            this.a.j(this.f);
        }
    }

    @Override // defpackage.anhi
    public final crzm<anhh> b() {
        a();
        return this.d.a;
    }

    public final void c() {
        dbsg<dvyw> dbsgVar;
        crzo<anhh> crzoVar = this.d;
        dcdc<aogb> d = d();
        int size = d.size();
        int i = 0;
        while (true) {
            if (i < size) {
                angs<aoge> b = this.a.a(d.get(i)).b();
                if (b.e() && !b.f().d().isEmpty()) {
                    dbsgVar = b.f().k();
                    break;
                }
                i++;
            } else {
                dbsgVar = dbpy.a;
                break;
            }
        }
        crzoVar.b(anhh.c(dbsgVar));
    }

    public final dcdc<aogb> d() {
        aogb f = aogb.f(new eapg(this.c.b(), eaou.b));
        return dcdc.h(f.j(), f, f.i());
    }
}
