package defpackage;
/* compiled from: PG */
/* renamed from: aksk  reason: default package */
/* loaded from: classes.dex */
public abstract class aksk {
    public boolean e;

    public aksj b() {
        throw null;
    }

    public abstract akra f(int i);

    public abstract int h();

    public abstract void i(int i, akra[] akraVarArr);

    public abstract boolean j(akra akraVar);

    public boolean o(akrq akrqVar) {
        if (b().o(akrqVar)) {
            if (j(akrqVar.x(0)) || akrqVar.j(f(0))) {
                return true;
            }
            int h = h();
            if (h != 0) {
                akra[] akraVarArr = new akra[2];
                akra akraVar = ((akrp) akrqVar).a;
                for (int i = 0; i < h; i++) {
                    i(i, akraVarArr);
                    akra akraVar2 = akraVar;
                    int i2 = 0;
                    while (i2 < 4) {
                        akra x = akrqVar.x(i2);
                        if (akrb.c(akraVarArr[0], akraVarArr[1], akraVar2, x)) {
                            return true;
                        }
                        i2++;
                        akraVar2 = x;
                    }
                }
            }
        }
        return false;
    }
}
