package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: aaks  reason: default package */
/* loaded from: classes.dex */
public final class aaks {
    public aako a;
    public aako b;
    public aako c;
    public aako d;
    public aako e;
    public aako f;
    public aako g;
    public aako h;
    public aako i;

    public aaks(apjj apjjVar, ampg ampgVar) {
        int p;
        apjjVar.getClass();
        Iterator it = apjjVar.b.iterator();
        while (true) {
            int i = 1;
            if (it.hasNext()) {
                apji apjiVar = (apji) it.next();
                switch ((akpq.p(apjiVar.c) != 0 ? p : i) - 1) {
                    case 1:
                    case 5:
                        this.a = new aako(apjiVar, ampgVar);
                        break;
                    case 2:
                        this.c = new aako(apjiVar, ampgVar);
                        break;
                    case 3:
                        this.b = new aako(apjiVar, ampgVar);
                        break;
                    case 4:
                        this.d = new aako(apjiVar, ampgVar);
                        break;
                    case 6:
                        this.e = new aako(apjiVar, ampgVar);
                        break;
                }
            } else {
                for (apji apjiVar2 : apjjVar.c) {
                    int p2 = akpq.p(apjiVar2.c);
                    int i2 = (p2 == 0 ? 1 : p2) - 1;
                    if (i2 == 1) {
                        this.f = new aako(apjiVar2, ampgVar);
                    } else if (i2 == 2) {
                        this.h = new aako(apjiVar2, ampgVar);
                    } else if (i2 == 3) {
                        this.g = new aako(apjiVar2, ampgVar);
                    } else if (i2 == 4) {
                        this.i = new aako(apjiVar2, ampgVar);
                    }
                }
                return;
            }
        }
    }

    public final aako a(boolean z, boolean z2, boolean z3, boolean z4) {
        aako aakoVar;
        aako aakoVar2;
        aako aakoVar3;
        aako aakoVar4;
        boolean z5 = true;
        boolean z6 = z2 && b();
        boolean z7 = z && c();
        if (!z3 || !d()) {
            z5 = false;
        }
        return z6 ? this.e : (z7 || z5) ? !z7 ? (!z4 || (aakoVar3 = this.h) == null) ? this.c : aakoVar3 : !z5 ? (!z4 || (aakoVar2 = this.g) == null) ? this.b : aakoVar2 : (!z4 || (aakoVar = this.i) == null) ? this.d : aakoVar : (!z4 || (aakoVar4 = this.f) == null) ? this.a : aakoVar4;
    }

    public final boolean b() {
        return this.e != null;
    }

    public final boolean c() {
        return this.b != null;
    }

    public final boolean d() {
        return this.c != null;
    }
}
