package defpackage;

import java.util.Random;
/* compiled from: PG */
/* renamed from: vak  reason: default package */
/* loaded from: classes4.dex */
public final class vak {
    static final val a = new vai(baaw.a, true);
    private final Random b;
    private final snc c;
    private final uzy d;

    public vak(Random random, uzy uzyVar, snc sncVar) {
        this.b = random;
        this.c = sncVar;
        this.d = uzyVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final val a(baaw baawVar) {
        int i = azst.i(baawVar.d);
        boolean z = true;
        if (i == 0) {
            i = 1;
        }
        int i2 = i - 1;
        if (i2 == 1) {
            if (baawVar.c != 1000) {
                z = false;
            }
            return new vai(baawVar, z);
        } else if (i2 == 3) {
            if (this.b.nextDouble() * 1000.0d >= baawVar.c) {
                z = false;
            }
            return new vai(baawVar, z);
        } else if (i2 == 4) {
            return new vaj(baawVar, this.b, this.d, this.c);
        } else {
            if (i2 == 5) {
                baawVar = baaw.a;
            }
            return new vai(baawVar, true);
        }
    }
}
