package defpackage;
/* compiled from: PG */
/* renamed from: alfi  reason: default package */
/* loaded from: classes.dex */
public final class alfi extends aleo {
    private final afvn a;
    private final asfs b;
    private final albc c;
    private final akze e;
    private final albs f;

    public alfi(aadd aaddVar, afvn afvnVar, asfs asfsVar, albc albcVar, albs albsVar, akze akzeVar, albf albfVar, alht alhtVar) {
        super(aaddVar, avuo.UPLOAD_PROCESSOR_TYPE_REGISTER_VIDEO, albfVar, akzeVar, alhtVar);
        this.a = afvnVar;
        this.b = asfsVar;
        this.c = albcVar;
        this.e = akzeVar;
        this.f = albsVar;
    }

    @Override // defpackage.algt
    public final albu a(alcw alcwVar) {
        return this.f;
    }

    @Override // defpackage.algt
    public final alct b(alcw alcwVar) {
        alct alctVar = alcwVar.L;
        return alctVar == null ? alct.a : alctVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01e6  */
    @Override // defpackage.aleo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ankt c(java.lang.String r7, defpackage.akzp r8, defpackage.alcw r9) {
        /*
            Method dump skipped, instructions count: 517
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alfi.c(java.lang.String, akzp, alcw):ankt");
    }

    @Override // defpackage.algt
    public final aypx e() {
        return akxp.r;
    }

    @Override // defpackage.algt
    public final String f() {
        return "RegisterVideoTask";
    }

    @Override // defpackage.algt
    public final boolean h() {
        return true;
    }

    @Override // defpackage.aleo
    public final boolean i(alcw alcwVar) {
        return (alcwVar.b & 1) != 0;
    }

    @Override // defpackage.aleo
    public final akzs k(Throwable th, alcw alcwVar, boolean z) {
        if (th instanceof aart) {
            alht alhtVar = this.d;
            avun avunVar = avun.UPLOAD_PROCESSOR_FAILURE_REASON_INNERTUBE_FAILED;
            alct alctVar = alcwVar.L;
            if (alctVar == null) {
                alctVar = alct.a;
            }
            alctVar.getClass();
            return t(alhtVar.d(avunVar, alctVar, this.b.f, this.e), z);
        }
        return super.k(th, alcwVar, z);
    }
}
