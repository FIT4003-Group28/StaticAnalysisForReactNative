package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aajr  reason: default package */
/* loaded from: classes2.dex */
public final class aajr {
    public dbsg<aajq> a = dbpy.a;
    private final aajs b;
    private final btpc c;
    private final bvrb d;
    private final buph e;

    public aajr(aajs aajsVar, btpc btpcVar, buph buphVar, bvrb bvrbVar) {
        this.b = aajsVar;
        this.c = btpcVar;
        this.e = buphVar;
        this.d = bvrbVar;
    }

    public final void a() {
        dijh bZ;
        if (!this.a.a()) {
            throw new IllegalStateException("Option is not present.");
        }
        aajq b = this.a.b();
        Executor g = this.d.g(b.e());
        dbsk.s(g);
        if (!this.c.i()) {
            final bvqg<dbsg<diwb>> d = b.d();
            g.execute(new Runnable(d) { // from class: aajn
                private final bvqg a;

                {
                    this.a = d;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.NU(dbpy.a);
                }
            });
            return;
        }
        aajs aajsVar = this.b;
        String a = b.a();
        dpuk b2 = b.b();
        boolean c = b.c();
        if (b2 == dpuk.MAJOR_EVENT) {
            bZ = aajsVar.a(c);
        } else {
            bZ = diji.e.bZ();
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        diji dijiVar = (diji) bZ.b;
        diji dijiVar2 = diji.e;
        a.getClass();
        int i = dijiVar.a | 1;
        dijiVar.a = i;
        dijiVar.b = a;
        dijiVar.c = b2.e;
        dijiVar.a = i | 2;
        aajo aajoVar = new aajo(b.d());
        this.e.b(bZ.bK(), aajoVar, g);
    }
}
