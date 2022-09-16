package defpackage;

import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: aage  reason: default package */
/* loaded from: classes.dex */
public final class aage implements tdb {
    private final aagi a;
    private final azqb b;

    public aage(azqb azqbVar, aagi aagiVar) {
        this.a = aagiVar;
        this.b = azqbVar;
    }

    public static final aynr f(boolean z, aajs aajsVar) {
        if (!z) {
            aahb aahbVar = (aahb) aajsVar;
            if (aahbVar.c.getAndSet(true)) {
                return aahb.c();
            }
            return aahbVar.a.k(aahbVar.b, false);
        }
        return aajsVar.b();
    }

    private final aajl g() {
        return this.a.c();
    }

    @Override // defpackage.tdb
    public final ayoi a(String str) {
        return g().i(str).V(yps.q);
    }

    @Override // defpackage.tdb
    public final /* synthetic */ void b(String str, byte[] bArr) {
        c(str, bArr, true);
    }

    @Override // defpackage.tdb
    public final void c(final String str, final byte[] bArr, final boolean z) {
        final aajl g = g();
        g.f(str).t(new ayqe() { // from class: aagb
            @Override // defpackage.ayqe
            public final Object a(Object obj) {
                aage aageVar = aage.this;
                String str2 = str;
                boolean z2 = z;
                aajl aajlVar = g;
                byte[] bArr2 = bArr;
                aajj aajjVar = (aajj) obj;
                if (aajjVar instanceof aajq) {
                    aahb c = ((aagu) aajlVar).c();
                    c.j(((aajr) aajjVar.mo145getType()).a(bArr2));
                    return aage.f(z2, c).L();
                }
                return aageVar.e(str2, bArr2, z2);
            }
        }, new ayqe() { // from class: aagc
            @Override // defpackage.ayqe
            public final Object a(Object obj) {
                Throwable th = (Throwable) obj;
                return aage.this.e(str, bArr, z);
            }
        }, new Callable() { // from class: aagd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return aage.this.e(str, bArr, z);
            }
        }).U(aaga.a, new aaga(1));
    }

    @Override // defpackage.tdb
    public final void d(String str) {
        aahb c = ((aagu) g()).c();
        c.g(str);
        c.b();
    }

    public final ayoc e(String str, byte[] bArr, boolean z) {
        aahb c = ((aagu) g()).c();
        c.j(((aakk) this.b.get()).b(str, bArr));
        return f(z, c).L();
    }
}
