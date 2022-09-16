package defpackage;
/* compiled from: PG */
/* renamed from: azup  reason: default package */
/* loaded from: classes2.dex */
public final class azup {
    public static final boolean a;

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0028, code lost:
        if (r0.equals("on") != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
        if (r0.equals("") != false) goto L19;
     */
    static {
        /*
            java.lang.String r0 = "kotlinx.coroutines.scheduler"
            java.lang.String r0 = defpackage.azyh.a(r0)
            r1 = 1
            if (r0 == 0) goto L54
            int r2 = r0.hashCode()
            if (r2 == 0) goto L2b
            r3 = 3551(0xddf, float:4.976E-42)
            if (r2 == r3) goto L22
            r1 = 109935(0x1ad6f, float:1.54052E-40)
            if (r2 != r1) goto L34
            java.lang.String r1 = "off"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L34
            r1 = 0
            goto L54
        L22:
            java.lang.String r2 = "on"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L34
            goto L54
        L2b:
            java.lang.String r2 = ""
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L34
            goto L54
        L34:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "System property 'kotlinx.coroutines.scheduler' has unrecognized value '"
            r1.append(r2)
            r1.append(r0)
            r0 = 39
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L54:
            defpackage.azup.a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azup.<clinit>():void");
    }

    public static final String a(azrd azrdVar) {
        azuu azuuVar;
        azrdVar.getClass();
        if (azuy.a && (azuuVar = (azuu) azrdVar.get(azuu.b)) != null) {
            if (((azuv) azrdVar.get(azuv.a)) != null) {
                throw null;
            }
            return "coroutine#" + azuuVar.a;
        }
        return null;
    }

    public static final azrd b(azuw azuwVar, azrd azrdVar) {
        azrd plus = ((azxo) azuwVar).a.plus(azrdVar);
        azrd plus2 = azuy.a ? plus.plus(new azuu(azuy.c.incrementAndGet())) : plus;
        azur azurVar = azvd.a;
        return (plus == azvd.a || plus.get(azqz.a) != null) ? plus2 : plus2.plus(azvd.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [azrj] */
    /* JADX WARN: Type inference failed for: r1v6 */
    public static final void c(azqy azqyVar, azrd azrdVar) {
        azwh azwhVar;
        azrj callerFrame;
        azrdVar.getClass();
        azrj azrjVar = azqyVar;
        if (azrdVar.get(azwi.a) != null) {
            while (!(azrjVar instanceof azva) && (callerFrame = azrjVar.getCallerFrame()) != null) {
                boolean z = callerFrame instanceof azwh;
                azrjVar = callerFrame;
                if (z) {
                    azwhVar = (azwh) callerFrame;
                    break;
                }
            }
            azwhVar = null;
            if (azwhVar != null) {
                throw null;
            }
        }
    }
}
