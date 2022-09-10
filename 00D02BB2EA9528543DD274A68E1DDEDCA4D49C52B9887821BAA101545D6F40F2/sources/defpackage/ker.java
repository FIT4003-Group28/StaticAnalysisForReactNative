package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ker  reason: default package */
/* loaded from: classes7.dex */
public final class ker {
    public final bvjj a;
    public final Executor b;
    private final mfo d;
    public final crzp<dbsg<dhjv>> c = new keq(this);
    private final crzo<dhjs> e = new crzo<>();

    public ker(mfo mfoVar, bvjj bvjjVar, Executor executor) {
        this.d = mfoVar;
        this.a = bvjjVar;
        this.b = executor;
    }

    public final void a(crzm<dbsg<dhjv>> crzmVar) {
        dbsg<dhjv> l = crzmVar.l();
        dbsk.s(l);
        dhjv c = l.c(dhjv.c);
        dhjt dhjtVar = c.b;
        if (dhjtVar == null) {
            this.e.b(null);
        } else {
            crzo<dhjs> crzoVar = this.e;
            dhjs b = dhjs.b(dhjtVar.c);
            if (b == null) {
                b = dhjs.UNRECOGNIZED;
            }
            crzoVar.b(b);
        }
        dhjt dhjtVar2 = c.b;
        if (dhjtVar2 == null) {
            dhjtVar2 = dhjt.d;
        }
        int i = dhjtVar2.a;
        boolean z = false;
        char c2 = 4;
        if (i == 0) {
            c2 = 2;
        } else if (i == 1) {
            c2 = 3;
        } else if (i != 2) {
            c2 = i != 3 ? i != 4 ? (char) 0 : (char) 6 : (char) 5;
        }
        if (c2 == 0) {
            c2 = 1;
        }
        if (c2 == 5 || c2 == 6 || c2 == 2) {
            z = true;
        }
        mfo mfoVar = this.d;
        mfoVar.h();
        if (mfoVar.a != z) {
            mfoVar.a = z;
            mfoVar.g();
        }
        mfoVar.h();
    }
}
