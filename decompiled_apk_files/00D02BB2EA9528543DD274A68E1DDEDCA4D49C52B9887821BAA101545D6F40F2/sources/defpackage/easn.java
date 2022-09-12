package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: easn  reason: default package */
/* loaded from: classes6.dex */
public final class easn extends earz implements easj {
    static final easn a = new easn();

    protected easn() {
    }

    @Override // defpackage.earz, defpackage.easg, defpackage.easj
    public final eaok b(Object obj, eaou eaouVar) {
        return e(obj).c(eaouVar);
    }

    @Override // defpackage.earz
    public final int[] c(eapt eaptVar, Object obj, eaok eaokVar) {
        eapt eaptVar2 = (eapt) obj;
        int e = eaptVar.e();
        int[] iArr = new int[e];
        for (int i = 0; i < e; i++) {
            iArr[i] = eaptVar2.h(eaptVar.x(i));
        }
        eaokVar.f(eaptVar, iArr);
        return iArr;
    }

    @Override // defpackage.earz, defpackage.easg, defpackage.easj
    public final eaok e(Object obj) {
        return eaor.d(((eapt) obj).j());
    }

    @Override // defpackage.easb
    public final Class<?> f() {
        return eapt.class;
    }
}
