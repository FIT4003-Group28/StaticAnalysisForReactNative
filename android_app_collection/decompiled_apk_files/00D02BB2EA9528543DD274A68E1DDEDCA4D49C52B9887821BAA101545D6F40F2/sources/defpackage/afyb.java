package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: afyb  reason: default package */
/* loaded from: classes2.dex */
public abstract class afyb implements Serializable {
    public static final afyb a = g().a();

    public static afya g() {
        afwy afwyVar = new afwy();
        afwyVar.g(afyc.UNSPECIFIED);
        afwyVar.a = 2;
        afwyVar.b(false);
        afwyVar.e(false);
        afwyVar.d(false);
        afwyVar.c(false);
        return afwyVar;
    }

    public static afyb h(btvo btvoVar, dweu dweuVar) {
        if ((dweuVar.a & 2) != 0) {
            dweb b = dweb.b(dweuVar.e);
            if (b == null) {
                b = dweb.UNKNOWN_CATEGORY;
            }
            if (b.equals(dweb.MENU)) {
                return i(btvoVar, afyc.MENU_PHOTO_TAB);
            }
        }
        dknm dknmVar = btvoVar.getLensParameters().d;
        if (dknmVar == null) {
            dknmVar = dknm.b;
        }
        if (dknmVar.a) {
            return i(btvoVar, afyc.DEMO_LENS_ICON);
        }
        return i(btvoVar, afyc.PHOTO_TABS);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.afyb i(defpackage.btvo r6, defpackage.afyc r7) {
        /*
            afyc r0 = defpackage.afyc.UNSPECIFIED
            r1 = 1
            r2 = 0
            if (r7 == r0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            java.lang.String r3 = "Entry point must be specified if creating LensPhotoOptions with this method."
            defpackage.dbsk.b(r0, r3)
            dknr r0 = r6.getLensParameters()
            if (r0 == 0) goto L24
            dknr r0 = r6.getLensParameters()
            dknm r0 = r0.d
            if (r0 != 0) goto L1e
            dknm r0 = defpackage.dknm.b
        L1e:
            boolean r0 = r0.a
            if (r0 == 0) goto L24
            r0 = 1
            goto L25
        L24:
            r0 = 0
        L25:
            int r3 = r7.ordinal()
            r4 = 3
            r5 = 2
            switch(r3) {
                case 1: goto L8e;
                case 2: goto L8e;
                case 3: goto L8e;
                case 4: goto L86;
                case 5: goto L7e;
                case 6: goto L61;
                case 7: goto L33;
                default: goto L2e;
            }
        L2e:
            r6 = 0
            r0 = 0
        L30:
            r1 = 0
        L31:
            r4 = 2
            goto L91
        L33:
            dknr r0 = r6.getLensParameters()
            dkng r0 = r0.i
            if (r0 != 0) goto L3d
            dkng r0 = defpackage.dkng.c
        L3d:
            dknd r0 = r0.b
            if (r0 != 0) goto L43
            dknd r0 = defpackage.dknd.e
        L43:
            boolean r3 = r0.a
            if (r3 == 0) goto L4c
            boolean r0 = r0.d
            if (r0 == 0) goto L4c
            goto L4d
        L4c:
            r1 = 0
        L4d:
            dknr r6 = r6.getLensParameters()
            dkng r6 = r6.i
            if (r6 != 0) goto L57
            dkng r6 = defpackage.dkng.c
        L57:
            dknf r6 = r6.a
            if (r6 != 0) goto L5d
            dknf r6 = defpackage.dknf.h
        L5d:
            boolean r6 = r6.g
            r0 = r1
            goto L30
        L61:
            dknr r6 = r6.getLensParameters()
            dkng r6 = r6.i
            if (r6 != 0) goto L6b
            dkng r6 = defpackage.dkng.c
        L6b:
            dknf r0 = r6.a
            if (r0 != 0) goto L71
            dknf r0 = defpackage.dknf.h
        L71:
            boolean r1 = r0.a
            dknd r6 = r6.b
            if (r6 != 0) goto L79
            dknd r6 = defpackage.dknd.e
        L79:
            boolean r6 = r6.a
            r0 = r6
            r6 = r1
            goto L30
        L7e:
            if (r0 == 0) goto L83
            r6 = 0
            r0 = 0
            goto L91
        L83:
            afyb r6 = defpackage.afyb.a
            return r6
        L86:
            if (r0 == 0) goto L8b
            r6 = 0
            r0 = 0
            goto L31
        L8b:
            afyb r6 = defpackage.afyb.a
            return r6
        L8e:
            r6 = 1
            r0 = 0
            r2 = 1
        L91:
            afya r3 = defpackage.afwz.g()
            r3.g(r7)
            r3.b(r1)
            r3.f(r4)
            r3.c(r2)
            r3.d(r0)
            r3.e(r6)
            afyb r6 = r3.a()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afyb.i(btvo, afyc):afyb");
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c();

    public abstract boolean d();

    public abstract afyc e();

    public abstract int f();
}
