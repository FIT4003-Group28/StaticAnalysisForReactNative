package defpackage;

import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: afax  reason: default package */
/* loaded from: classes.dex */
public final class afax implements afhq {
    final /* synthetic */ afal a;

    public afax(afal afalVar) {
        this.a = afalVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
    @Override // defpackage.afhq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.aehn b(defpackage.aehm r9) {
        /*
            r8 = this;
            aeho r0 = r9.d
            if (r0 != 0) goto L6
            aeho r0 = defpackage.aeho.a
        L6:
            int r1 = r9.b
            r1 = r1 & 1
            if (r1 == 0) goto Lcb
            int r1 = r0.b
            r2 = r1 & 1
            if (r2 == 0) goto Lcb
            r1 = r1 & 2
            if (r1 == 0) goto Lcb
            afal r1 = r8.a
            int r2 = r9.c
            orl r2 = defpackage.orl.a(r2)
            if (r2 != 0) goto L22
            orl r2 = defpackage.orl.TRACK_TYPE_AUDIO
        L22:
            ajfw r3 = r0.c
            if (r3 != 0) goto L28
            ajfw r3 = defpackage.ajfw.a
        L28:
            int r0 = r0.d
            boolean r9 = r9.e
            afak r1 = r1.c(r2)
            java.util.List r9 = r1.c(r3, r0, r9)
            aehn r0 = defpackage.aehn.a
            aopa r0 = r0.createBuilder()
            r1 = 0
            r2 = -1
        L3c:
            r3 = -1
        L3d:
            int r4 = r9.size()
            if (r1 >= r4) goto Lc4
            java.lang.Object r4 = r9.get(r1)
            afaj r4 = (defpackage.afaj) r4
            if (r3 != r2) goto L4d
            int r3 = r4.b
        L4d:
            int r1 = r1 + 1
            int r5 = r9.size()
            if (r1 >= r5) goto L65
            java.lang.Object r5 = r9.get(r1)
            afaj r5 = (defpackage.afaj) r5
            ajfw r5 = r5.a
            ajfw r6 = r4.a
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L3d
        L65:
            aeho r5 = defpackage.aeho.a
            aopa r5 = r5.createBuilder()
            ajfw r6 = r4.a
            r5.copyOnWrite()
            aopi r7 = r5.instance
            aeho r7 = (defpackage.aeho) r7
            r6.getClass()
            r7.c = r6
            int r6 = r7.b
            r6 = r6 | 1
            r7.b = r6
            r5.copyOnWrite()
            aopi r6 = r5.instance
            aeho r6 = (defpackage.aeho) r6
            int r7 = r6.b
            r7 = r7 | 2
            r6.b = r7
            r6.d = r3
            int r3 = r4.b
            r5.copyOnWrite()
            aopi r4 = r5.instance
            aeho r4 = (defpackage.aeho) r4
            int r6 = r4.b
            r6 = r6 | 4
            r4.b = r6
            r4.e = r3
            aopi r3 = r5.mo39build()
            aeho r3 = (defpackage.aeho) r3
            r0.copyOnWrite()
            aopi r4 = r0.instance
            aehn r4 = (defpackage.aehn) r4
            r3.getClass()
            aopu r5 = r4.b
            boolean r6 = r5.c()
            if (r6 != 0) goto Lbd
            aopu r5 = defpackage.aopi.mutableCopy(r5)
            r4.b = r5
        Lbd:
            aopu r4 = r4.b
            r4.add(r3)
            goto L3c
        Lc4:
            aopi r9 = r0.mo39build()
            aehn r9 = (defpackage.aehn) r9
            return r9
        Lcb:
            aehn r9 = defpackage.aehn.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afax.b(aehm):aehn");
    }

    @Override // defpackage.afhq
    public final aehl a(aehk aehkVar) {
        if ((aehkVar.b & 1) == 0) {
            return aehl.a;
        }
        afal afalVar = this.a;
        orl a = orl.a(aehkVar.c);
        if (a == null) {
            a = orl.TRACK_TYPE_AUDIO;
        }
        afalVar.c(a).e();
        aopa createBuilder = aehl.a.createBuilder();
        createBuilder.copyOnWrite();
        aehl aehlVar = (aehl) createBuilder.instance;
        aehlVar.b |= 1;
        aehlVar.c = true;
        return (aehl) createBuilder.mo39build();
    }

    @Override // defpackage.afhq
    public final aehq c(aehp aehpVar) {
        if ((aehpVar.b & 1) == 0) {
            return aehq.a;
        }
        afal afalVar = this.a;
        long c = afag.c(aehpVar.c);
        ArrayList<orl> arrayList = new ArrayList(2);
        if (afalVar.a.i(c)) {
            arrayList.add(orl.TRACK_TYPE_AUDIO);
        }
        if (afalVar.b.i(c)) {
            arrayList.add(orl.TRACK_TYPE_VIDEO);
        }
        aopa createBuilder = aehq.a.createBuilder();
        createBuilder.copyOnWrite();
        aehq aehqVar = (aehq) createBuilder.instance;
        aopq aopqVar = aehqVar.b;
        if (!aopqVar.c()) {
            aehqVar.b = aopi.mutableCopy(aopqVar);
        }
        for (orl orlVar : arrayList) {
            aehqVar.b.g(orlVar.d);
        }
        return (aehq) createBuilder.mo39build();
    }
}
