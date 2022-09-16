package defpackage;
/* compiled from: PG */
/* renamed from: bccb  reason: default package */
/* loaded from: classes3.dex */
final class bccb implements bcbu {
    private final dcdn<dspd, bbuq> a;
    private final bckv b;
    private final dcdc<dweu> c;
    private final dcdc<bclv> d;

    /* JADX WARN: Removed duplicated region for block: B:33:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x016a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public bccb(defpackage.dcdc<defpackage.dweu> r27, defpackage.dcdn<defpackage.dspd, defpackage.bbuq> r28, @defpackage.dzsi defpackage.ilo r29, defpackage.cjtd r30, boolean r31, int r32, defpackage.bcmv r33, defpackage.bcof r34, defpackage.btvo r35, defpackage.bckv r36, boolean r37, defpackage.afxw r38) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bccb.<init>(dcdc, dcdn, ilo, cjtd, boolean, int, bcmv, bcof, btvo, bckv, boolean, afxw):void");
    }

    private static boolean a(dweu dweuVar, bcbn bcbnVar, dcdc<dweu> dcdcVar) {
        dbsg<dspd> a = bcbnVar.a();
        if (a.a()) {
            return dweuVar.d.equals(a.b());
        }
        dweb dwebVar = (dweb) bcbnVar.b().h(bcca.a).c(dweb.UNKNOWN_CATEGORY);
        if (dwebVar.equals(dweb.UNKNOWN_CATEGORY)) {
            if (dcdcVar != null && !dcdcVar.isEmpty()) {
                return dweuVar.equals(dcdcVar.get(0));
            }
            return false;
        }
        if ((dweuVar.a & 2) != 0) {
            dweb b = dweb.b(dweuVar.e);
            if (b == null) {
                b = dweb.UNKNOWN_CATEGORY;
            }
            if (b.equals(dwebVar)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.bcbu
    public final boolean c(dweu dweuVar) {
        return a(dweuVar, this.b.k(), this.c);
    }

    @Override // defpackage.bcbu
    public final dcdc<bclv> e() {
        return this.d;
    }

    @Override // defpackage.bcbu
    public final dcdn<dspd, bbuq> f() {
        return this.a;
    }
}
