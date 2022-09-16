package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: ayum  reason: default package */
/* loaded from: classes2.dex */
public final class ayum extends aynx {
    final bamd[] b;
    final Iterable c;
    final ayqe d;
    final int e;

    public ayum(Iterable iterable, ayqe ayqeVar, int i) {
        this.b = null;
        this.c = iterable;
        this.d = ayqeVar;
        this.e = i;
    }

    public ayum(bamd[] bamdVarArr, ayqe ayqeVar, int i) {
        this.b = bamdVarArr;
        this.c = null;
        this.d = ayqeVar;
        this.e = i;
    }

    @Override // defpackage.aynx
    public final void ae(bame bameVar) {
        int length;
        bamd[] bamdVarArr = this.b;
        if (bamdVarArr == null) {
            bamdVarArr = new bamd[8];
            try {
                Iterator it = this.c.iterator();
                ayrd.b(it, "The iterator returned is null");
                length = 0;
                while (it.hasNext()) {
                    try {
                        try {
                            bamd bamdVar = (bamd) it.next();
                            ayrd.b(bamdVar, "The publisher returned by the iterator is null");
                            if (length == bamdVarArr.length) {
                                bamd[] bamdVarArr2 = new bamd[(length >> 2) + length];
                                System.arraycopy(bamdVarArr, 0, bamdVarArr2, 0, length);
                                bamdVarArr = bamdVarArr2;
                            }
                            bamdVarArr[length] = bamdVar;
                            length++;
                        } catch (Throwable th) {
                            bapv.j(th);
                            azoc.f(th, bameVar);
                            return;
                        }
                    } catch (Throwable th2) {
                        bapv.j(th2);
                        azoc.f(th2, bameVar);
                        return;
                    }
                }
            } catch (Throwable th3) {
                bapv.j(th3);
                azoc.f(th3, bameVar);
                return;
            }
        } else {
            length = bamdVarArr.length;
        }
        if (length == 0) {
            azoc.b(bameVar);
        } else if (length == 1) {
            bamdVarArr[0].ad(new ayxl(bameVar, new ayul(this)));
        } else {
            ayuj ayujVar = new ayuj(bameVar, this.d, length, this.e);
            bameVar.f(ayujVar);
            ayuk[] ayukVarArr = ayujVar.c;
            for (int i = 0; i < length && !ayujVar.k && !ayujVar.i; i++) {
                bamdVarArr[i].ad(ayukVarArr[i]);
            }
        }
    }
}
