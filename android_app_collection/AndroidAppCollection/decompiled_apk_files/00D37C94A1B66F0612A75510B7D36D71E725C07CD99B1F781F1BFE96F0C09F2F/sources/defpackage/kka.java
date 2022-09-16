package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: kka  reason: default package */
/* loaded from: classes3.dex */
public final class kka implements ahxx {
    public final aynx a;
    private final azqb b;
    private final azpa c;
    private final Executor d;
    private final ahxv e;

    public kka(final kjo kjoVar, azqb azqbVar, Executor executor, ahxv ahxvVar) {
        this.b = azqbVar;
        azpa ar = azpa.ar();
        this.c = ar;
        this.d = executor;
        this.e = ahxvVar;
        this.a = ar.n().C(new ayqe() { // from class: kjy
            @Override // defpackage.ayqe
            public final Object a(Object obj) {
                kjo kjoVar2 = kjo.this;
                kkb kkbVar = (kkb) obj;
                boolean a = kjoVar2.a(kkbVar);
                ahxt a2 = ahxu.a();
                a2.d(a);
                boolean z = true;
                long j = -1;
                if (kjoVar2.a(kkbVar) && kjo.d(kkbVar) == -1) {
                    z = false;
                }
                a2.b(z);
                if (a) {
                    long d = kjo.d(kkbVar);
                    if (d != -1) {
                        j = d == -2 ? zdg.a(kjoVar2.a.a).getRecommendedTimeoutMillis(2000, 6) : d;
                    }
                } else {
                    j = 2000;
                }
                a2.c(j);
                return a2.a();
            }
        });
    }

    @Override // defpackage.ahxx
    public final aynx a() {
        return this.e.a().v(new ayqe() { // from class: kjz
            @Override // defpackage.ayqe
            public final Object a(Object obj) {
                ahxu ahxuVar = (ahxu) obj;
                return ahxuVar.b ? aynx.B(ahxuVar) : kka.this.a;
            }
        }).n();
    }

    @Override // defpackage.ahxx
    public final void b() {
        this.e.b();
    }

    @Override // defpackage.ahxx
    public final void c() {
        this.e.c();
    }

    @Override // defpackage.ahxx
    public final void d() {
        ankt a = ((vne) this.b.get()).a();
        Executor executor = this.d;
        jou jouVar = jou.m;
        final azpa azpaVar = this.c;
        ylx.k(a, executor, jouVar, new ylw() { // from class: kjx
            @Override // defpackage.ylw, defpackage.zdt
            public final void a(Object obj) {
                azpa.this.c((kkb) obj);
            }
        });
        this.e.d();
    }
}
