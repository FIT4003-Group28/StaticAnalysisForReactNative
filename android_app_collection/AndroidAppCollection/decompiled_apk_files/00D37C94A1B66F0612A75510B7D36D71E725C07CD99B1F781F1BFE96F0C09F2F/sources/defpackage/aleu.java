package defpackage;
/* compiled from: PG */
/* renamed from: aleu  reason: default package */
/* loaded from: classes.dex */
public final class aleu extends alfw {
    private final asfs a;
    private final aldn b;
    private final albf c;
    private final alhl e;

    public aleu(snc sncVar, aadd aaddVar, asfs asfsVar, aldn aldnVar, akze akzeVar, albf albfVar, alez alezVar, alht alhtVar, alhl alhlVar) {
        super(avuo.UPLOAD_PROCESSOR_TYPE_FILE_ANALYSIS, sncVar, aaddVar, akzeVar, albfVar, alezVar, aldnVar, alhtVar);
        this.a = asfsVar;
        this.b = aldnVar;
        this.c = albfVar;
        this.e = alhlVar;
    }

    @Override // defpackage.algt
    public final albu a(alcw alcwVar) {
        if (!alcwVar.s || !alcwVar.u) {
            return null;
        }
        return this.e;
    }

    @Override // defpackage.algt
    public final alct b(alcw alcwVar) {
        alct alctVar = alcwVar.w;
        return alctVar == null ? alct.a : alctVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x026e, code lost:
        r4 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0430, code lost:
        if (r2 != '\b') goto L162;
     */
    /* JADX WARN: Removed duplicated region for block: B:180:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x053f  */
    @Override // defpackage.aleo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ankt c(java.lang.String r31, defpackage.akzp r32, defpackage.alcw r33) {
        /*
            Method dump skipped, instructions count: 1442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aleu.c(java.lang.String, akzp, alcw):ankt");
    }

    @Override // defpackage.algt
    public final aypx e() {
        return akxp.p;
    }

    @Override // defpackage.algt
    public final String f() {
        return "FileAnalysisTask";
    }

    @Override // defpackage.algt
    public final boolean h() {
        return false;
    }

    @Override // defpackage.aleo
    public final boolean i(alcw alcwVar) {
        int i = alcwVar.b;
        return ((i & 2) == 0 || (i & 64) == 0) ? false : true;
    }

    @Override // defpackage.algt
    public final void r(long j, alcw alcwVar) {
        if (alcwVar != null) {
            albf albfVar = this.c;
            String str = alcwVar.k;
            String str2 = alcwVar.e;
            alcq alcqVar = alcwVar.v;
            if (alcqVar == null) {
                alcqVar = alcq.a;
            }
            int I = aqxo.I(alcqVar.c);
            int i = 1;
            if (I == 0) {
                I = 1;
            }
            aqxo.p(j >= 0);
            aopa createBuilder = avtx.a.createBuilder();
            avtw a = albfVar.a(str);
            createBuilder.copyOnWrite();
            avtx avtxVar = (avtx) createBuilder.instance;
            a.getClass();
            avtxVar.c = a;
            avtxVar.b |= 1;
            createBuilder.copyOnWrite();
            avtx avtxVar2 = (avtx) createBuilder.instance;
            avtxVar2.b |= 4;
            avtxVar2.e = j;
            int i2 = I - 1;
            if (i2 == 1) {
                i = 3;
            } else if (i2 == 2) {
                i = 4;
            } else if (i2 == 3) {
                i = 5;
            } else if (i2 == 4) {
                i = 6;
            } else if (i2 == 5) {
                i = 8;
            }
            createBuilder.copyOnWrite();
            avtx avtxVar3 = (avtx) createBuilder.instance;
            avtxVar3.d = i - 1;
            avtxVar3.b |= 2;
            arrf a2 = arrh.a();
            a2.copyOnWrite();
            ((arrh) a2.instance).dS((avtx) createBuilder.mo39build());
            albfVar.b(str2, (arrh) a2.mo39build());
        }
    }
}
