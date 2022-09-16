package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: azah  reason: default package */
/* loaded from: classes2.dex */
public final class azah extends ayua {
    final bamd[] c;
    final ayqe d;

    public azah(aynx aynxVar, bamd[] bamdVarArr, ayqe ayqeVar) {
        super(aynxVar);
        this.c = bamdVarArr;
        this.d = ayqeVar;
    }

    @Override // defpackage.aynx
    protected final void ae(bame bameVar) {
        bamd[] bamdVarArr = this.c;
        azaf azafVar = new azaf(bameVar, this.d);
        bameVar.f(azafVar);
        azag[] azagVarArr = azafVar.c;
        AtomicReference atomicReference = azafVar.e;
        for (int i = 0; i < 2 && atomicReference.get() != azof.a; i++) {
            bamdVarArr[i].ad(azagVarArr[i]);
        }
        this.b.ac(azafVar);
    }
}
