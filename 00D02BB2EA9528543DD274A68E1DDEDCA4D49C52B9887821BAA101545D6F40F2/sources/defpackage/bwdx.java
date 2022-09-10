package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: bwdx  reason: default package */
/* loaded from: classes4.dex */
public final class bwdx extends bweo {
    private final String c;
    @dzsi
    private final String d;
    @dzsi
    private final String e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public bwdx(defpackage.ilo r17, java.lang.String r18, boolean r19, defpackage.btvo r20) {
        /*
            Method dump skipped, instructions count: 515
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bwdx.<init>(ilo, java.lang.String, boolean, btvo):void");
    }

    @Override // defpackage.bweo
    @dzsi
    public final String a(Context context, @dzsi bwfq bwfqVar) {
        return j(this.c, this.d);
    }

    @Override // defpackage.bweo
    @dzsi
    public final String b(Context context, @dzsi bwfq bwfqVar) {
        return this.c;
    }

    @Override // defpackage.bweo
    public final int d() {
        return 2;
    }

    @Override // defpackage.bweo
    public final dhrt f() {
        dhrr bZ = dhrt.d.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhrt dhrtVar = (dhrt) bZ.b;
        dhrtVar.b = 1;
        dhrtVar.a = 1 | dhrtVar.a;
        if (!dbsj.d(this.e)) {
            String str = this.e;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dhrt dhrtVar2 = (dhrt) bZ.b;
            str.getClass();
            dhrtVar2.a |= 4;
            dhrtVar2.c = str;
        }
        return bZ.bK();
    }
}
