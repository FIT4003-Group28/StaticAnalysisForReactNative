package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: easp  reason: default package */
/* loaded from: classes6.dex */
public final class easp extends earz implements easg, easj, easb {
    static final easp a = new easp();

    protected easp() {
    }

    @Override // defpackage.earz, defpackage.easg
    public final long a(Object obj, eaok eaokVar) {
        return eaul.j.b(eaokVar).i((String) obj);
    }

    @Override // defpackage.earz, defpackage.easj
    public final int[] d(eapt eaptVar, Object obj, eaok eaokVar, eatp eatpVar) {
        eaou eaouVar = eatpVar.f;
        if (eaouVar != null) {
            eaokVar = eaokVar.c(eaouVar);
        }
        return eaokVar.g(eaptVar, eatpVar.b(eaokVar).i((String) obj));
    }

    @Override // defpackage.easb
    public final Class<?> f() {
        return String.class;
    }
}
