package defpackage;

import android.text.TextUtils;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: cxeo  reason: default package */
/* loaded from: classes5.dex */
final class cxeo extends cxej implements cwwr, cxed {
    public final cwwo a;
    public final dxio<cxec> b;
    public final dxio<cxef> c;
    public final cxew d;
    public final cxez e;
    public final AtomicReference<cxev> f;
    private final dehq g;

    public cxeo(cwwp cwwpVar, dehq dehqVar, final dxio<cxec> dxioVar, dxio<cxef> dxioVar2, cwuc cwucVar, dzsj<cxfg> dzsjVar, cxew cxewVar) {
        AtomicReference<cxev> atomicReference = new AtomicReference<>();
        this.f = atomicReference;
        this.g = dehqVar;
        this.b = dxioVar;
        this.c = dxioVar2;
        this.d = cxewVar;
        this.a = cwwpVar.a(dehqVar, cxek.a, dzsjVar);
        this.e = cxez.a(new dzsj(dxioVar) { // from class: cxel
            private final dxio a;

            {
                this.a = dxioVar;
            }

            @Override // defpackage.dzsj
            public final Object a() {
                dxio dxioVar3 = this.a;
                return Integer.valueOf(((cxec) dxioVar3.a()).e() ? ((cxec) dxioVar3.a()).a() : 10);
            }
        });
        cwucVar.c(this);
        atomicReference.set(cxew.a(1.0f));
    }

    @Override // defpackage.cwud
    public final void Sz() {
        cxeq.b();
    }

    @Override // defpackage.cxed
    public final boolean a(String str) {
        if (this.f.get().a() && this.a.a()) {
            return cxeq.d(str);
        }
        return false;
    }

    @Override // defpackage.cxed
    public final void c(String str, long j, long j2) {
        cxei cxeiVar;
        if (TextUtils.isEmpty(str) || j2 <= 0 || (cxeiVar = cxeq.a.get()) == null || cxeiVar.b.c > j) {
            return;
        }
        cxdy cxdyVar = new cxdy(str, j, j + j2, Thread.currentThread().getId(), 4);
        synchronized (cxeiVar.d) {
            cxeiVar.d.add(cxdyVar);
        }
        cxeiVar.b();
    }

    @Override // defpackage.cxed
    public final dehn<Void> d(String str, @dzsi String str2) {
        if (true != TextUtils.isEmpty(str2)) {
            str = str2;
        }
        final cxei e = cxeq.e(str);
        if (e == null) {
            return dehk.a;
        }
        return deha.f(new deff(this, e) { // from class: cxen
            private final cxeo a;
            private final cxei b;

            {
                this.a = this;
                this.b = e;
            }

            @Override // defpackage.deff
            public final dehn a() {
                cxeo cxeoVar = this.a;
                cxei cxeiVar = this.b;
                if (cxeoVar.c.a().b() != 3) {
                    return dehk.a;
                }
                if (cxeoVar.b.a().e()) {
                    return dehk.a;
                }
                if (cxeoVar.e.c()) {
                    return dehk.a;
                }
                cxeoVar.e.d();
                List<eaam> c = cxeq.c(cxeiVar);
                if (c == null || c.isEmpty()) {
                    return dehk.a;
                }
                eaah bZ = eaaj.f.bZ();
                long leastSignificantBits = UUID.randomUUID().getLeastSignificantBits();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                eaaj eaajVar = (eaaj) bZ.b;
                eaajVar.a |= 1;
                eaajVar.b = leastSignificantBits;
                eaaj eaajVar2 = (eaaj) bZ.b;
                eaajVar2.c();
                dsod.bv(c, eaajVar2.d);
                eaaj bK = bZ.bK();
                eacc bZ2 = eacd.u.bZ();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                eacd eacdVar = (eacd) bZ2.b;
                bK.getClass();
                eacdVar.n = bK;
                eacdVar.a |= 32768;
                eacd bK2 = bZ2.bK();
                long j = bK.b;
                if (bK.d.size() > 0) {
                    String str3 = bK.d.get(0).b;
                }
                cwwo cwwoVar = cxeoVar.a;
                cwwi f = cwwj.f();
                f.c(bK2);
                return cwwoVar.c(f.a());
            }
        }, this.g);
    }

    @Override // defpackage.cxed
    public final void e() {
        cxei andSet = cxeq.a.getAndSet(null);
        if (andSet != null) {
            String str = andSet.b.b;
        }
    }

    @Override // defpackage.cwwr
    public final void g() {
        deha.e(new Runnable(this) { // from class: cxem
            private final cxeo a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cxeo cxeoVar = this.a;
                try {
                    cxeoVar.f.set(cxew.a(cxeoVar.b.a().e() ? 1.0f : cxeoVar.c.a().c()));
                } catch (Throwable unused) {
                    cxeoVar.f.set(cxew.a(0.0f));
                }
            }
        }, this.g);
    }
}
