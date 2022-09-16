package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: faa  reason: default package */
/* loaded from: classes3.dex */
public final class faa {
    public final snc b;
    public long c;
    private final aynx e;
    private final Executor f;
    public final AtomicInteger a = new AtomicInteger(0);
    private final aypf d = new aypf();

    public faa(aynx aynxVar, Executor executor, snc sncVar) {
        this.e = aynxVar;
        this.f = executor;
        this.b = sncVar;
        this.c = sncVar.d();
    }

    public final void a() {
        this.d.c();
        this.a.set(0);
        this.d.d(this.e.G(azpj.b(this.f)).Z(new ayqb() { // from class: ezz
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                atnw atnwVar = (atnw) obj;
                faa.this.a.incrementAndGet();
            }
        }));
        this.c = this.b.d();
    }
}
