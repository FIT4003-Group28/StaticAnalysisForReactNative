package defpackage;
/* compiled from: PG */
/* renamed from: ngx  reason: default package */
/* loaded from: classes3.dex */
public final class ngx extends ngm {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ngx(defpackage.aafo r10, defpackage.lya r11, defpackage.yni r12, defpackage.luy r13, defpackage.lva r14, defpackage.acti r15, com.google.android.libraries.youtube.innertube.model.BrowseResponseModel r16) {
        /*
            r9 = this;
            r7 = r16
            arlt r0 = r7.a
            arlo r0 = r0.d
            if (r0 != 0) goto La
            arlo r0 = defpackage.arlo.a
        La:
            int r1 = r0.b
            r2 = 102883021(0x621decd, float:3.0444423E-35)
            if (r1 != r2) goto L16
            java.lang.Object r0 = r0.c
            aqgc r0 = (defpackage.aqgc) r0
            goto L18
        L16:
            aqgc r0 = defpackage.aqgc.a
        L18:
            r8 = r0
            r0 = r9
            r1 = r10
            r2 = r12
            r3 = r11
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ngx.<init>(aafo, lya, yni, luy, lva, acti, com.google.android.libraries.youtube.innertube.model.BrowseResponseModel):void");
    }

    @Override // defpackage.ngm, defpackage.ngj
    public final amvn a(amvn amvnVar) {
        apok apokVar = ((aqgc) this.a).d;
        if (apokVar == null) {
            apokVar = apok.a;
        }
        if ((apokVar.b & 1) == 0) {
            return amyg.a;
        }
        aafo aafoVar = this.e;
        apok apokVar2 = ((aqgc) this.a).d;
        if (apokVar2 == null) {
            apokVar2 = apok.a;
        }
        apoj apojVar = apokVar2.c;
        if (apojVar == null) {
            apojVar = apoj.a;
        }
        return amvn.r(new lmg(aafoVar, apojVar));
    }

    @Override // defpackage.ngj
    public final CharSequence c() {
        arag aragVar;
        aqgc aqgcVar = (aqgc) this.a;
        if ((aqgcVar.b & 1) != 0) {
            aragVar = aqgcVar.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        return zgh.d(ajgl.b(aragVar));
    }
}
