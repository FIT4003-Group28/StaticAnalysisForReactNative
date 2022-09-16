package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: alei  reason: default package */
/* loaded from: classes.dex */
public final class alei extends alfw {
    public final asfs a;
    public final alak b;
    private final Context c;
    private final afvn e;
    private final vzm f;
    private final awyu g;
    private final akze h;
    private final alhn i;
    private final alhs k;
    private final albk l;
    private final aqxo m;

    public alei(Context context, snc sncVar, aadd aaddVar, asfs asfsVar, afvn afvnVar, vzm vzmVar, alak alakVar, albs albsVar, alhl alhlVar, akze akzeVar, alhn alhnVar, alhs alhsVar, aqxo aqxoVar, albf albfVar, alez alezVar, aldn aldnVar, alht alhtVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(avuo.UPLOAD_PROCESSOR_TYPE_CREATE_TRANSFER, sncVar, aaddVar, akzeVar, albfVar, alezVar, aldnVar, alhtVar);
        this.c = context;
        this.a = asfsVar;
        this.e = afvnVar;
        this.f = vzmVar;
        this.b = alakVar;
        this.h = akzeVar;
        this.i = alhnVar;
        this.k = alhsVar;
        this.m = aqxoVar;
        this.l = new albk(alhlVar, albsVar);
        awyt a = awyu.a();
        a.a = 0L;
        this.g = a.a();
    }

    @Override // defpackage.algt
    public final albu a(alcw alcwVar) {
        return this.l;
    }

    @Override // defpackage.algt
    public final alct b(alcw alcwVar) {
        alct alctVar = alcwVar.I;
        return alctVar == null ? alct.a : alctVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
        if (r1 == 0) goto L104;
     */
    @Override // defpackage.aleo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ankt c(java.lang.String r11, defpackage.akzp r12, defpackage.alcw r13) {
        /*
            Method dump skipped, instructions count: 546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alei.c(java.lang.String, akzp, alcw):ankt");
    }

    @Override // defpackage.algt
    public final aypx e() {
        return akxp.m;
    }

    @Override // defpackage.algt
    public final String f() {
        return "CreateScottyHandleTask";
    }

    @Override // defpackage.algt
    public final boolean h() {
        return true;
    }

    @Override // defpackage.aleo
    public final boolean i(alcw alcwVar) {
        int i = alcwVar.b;
        return ((i & 1) == 0 || (i & 2) == 0 || (i & 64) == 0) ? false : true;
    }
}
