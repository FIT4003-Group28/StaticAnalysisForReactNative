package defpackage;

import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: chlp  reason: default package */
/* loaded from: classes4.dex */
public final class chlp implements btzi<duvu, duvx> {
    final /* synthetic */ chls a;

    public chlp(chls chlsVar) {
        this.a = chlsVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<duvu> btzrVar, btzy btzyVar) {
        this.a.Q(R.string.CHECK_NETWORK_CONNECTION);
        this.a.N = false;
        cqkx.p(this.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0085  */
    @Override // defpackage.btzi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void QZ(defpackage.btzr<defpackage.duvu> r5, defpackage.duvx r6) {
        /*
            r4 = this;
            duvx r6 = (defpackage.duvx) r6
            int r0 = r6.b
            int r0 = defpackage.dpvz.a(r0)
            if (r0 != 0) goto Lb
            goto L72
        Lb:
            r1 = 2
            if (r0 != r1) goto L72
            chls r0 = r4.a
            r2 = 0
            r0.k = r2
            defpackage.chls.R(r0)
            int r0 = r6.a
            r0 = r0 & 16
            if (r0 == 0) goto L25
            chls r0 = r4.a
            java.lang.String r3 = r6.f
            r0.i = r3
            r0.P(r3)
        L25:
            int r0 = r6.a
            r0 = r0 & 8
            if (r0 == 0) goto L35
            chls r0 = r4.a
            dqdk r3 = r6.e
            if (r3 != 0) goto L33
            dqdk r3 = defpackage.dqdk.e
        L33:
            r0.j = r3
        L35:
            int r0 = r6.a
            r0 = r0 & r1
            if (r0 == 0) goto L3b
            goto L72
        L3b:
            btlu r5 = r5.c
            btlu r5 = defpackage.btlu.q(r5)
            java.lang.String r5 = r5.t()
            if (r5 == 0) goto L66
            java.util.regex.Pattern r6 = android.util.Patterns.EMAIL_ADDRESS
            java.util.regex.Matcher r6 = r6.matcher(r5)
            boolean r6 = r6.matches()
            if (r6 == 0) goto L66
            chls r6 = r4.a
            android.content.res.Resources r0 = r6.b
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r5
            r5 = 2131954459(0x7f130b1b, float:1.9545418E38)
            java.lang.String r5 = r0.getString(r5, r1)
            r6.h = r5
            goto L78
        L66:
            chls r5 = r4.a
            android.content.res.Resources r6 = r5.b
            r0 = 2131954458(0x7f130b1a, float:1.9545416E38)
            java.lang.String r6 = r6.getString(r0)
            goto L76
        L72:
            chls r5 = r4.a
            java.lang.String r6 = r6.c
        L76:
            r5.h = r6
        L78:
            chls r5 = r4.a
            java.lang.String r6 = r5.h
            if (r6 == 0) goto L81
            r6 = 0
            r5.g = r6
        L81:
            java.lang.String r6 = r5.i
            if (r6 != 0) goto L89
            dqdk r6 = r5.j
            if (r6 == 0) goto L8c
        L89:
            defpackage.chls.R(r5)
        L8c:
            chls r5 = r4.a
            defpackage.chls.S(r5)
            chls r5 = r4.a
            defpackage.cqkx.p(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chlp.QZ(btzr, java.lang.Object):void");
    }
}
