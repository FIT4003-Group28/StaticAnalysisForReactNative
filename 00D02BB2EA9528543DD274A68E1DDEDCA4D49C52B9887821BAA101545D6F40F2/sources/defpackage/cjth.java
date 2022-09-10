package defpackage;
/* compiled from: PG */
/* renamed from: cjth  reason: default package */
/* loaded from: classes4.dex */
public final class cjth {
    /* JADX WARN: Removed duplicated region for block: B:25:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x015d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.ddhh a(defpackage.cjtd r7, long r8, int r10) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjth.a(cjtd, long, int):ddhh");
    }

    public static ddhk b(ddhp ddhpVar) {
        ddhh ddhhVar = (ddhh) ddhk.k.bZ();
        int b = ddhpVar.b();
        if (ddhhVar.c) {
            ddhhVar.bF();
            ddhhVar.c = false;
        }
        ddhk ddhkVar = (ddhk) ddhhVar.b;
        ddhkVar.a |= 1;
        ddhkVar.b = b;
        return (ddhk) ddhhVar.bK();
    }

    public static dwxc c(cjtd cjtdVar, long j, int i) {
        ddhk ddhkVar = (ddhk) a(cjtdVar, j, i).bK();
        dwxc bZ = dwxd.d.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwxd dwxdVar = (dwxd) bZ.b;
        ddhkVar.getClass();
        dwxdVar.b = ddhkVar;
        dwxdVar.a |= 1;
        String str = cjtdVar.l;
        if (str != null) {
            dwwy bZ2 = dwwz.c.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dwwz dwwzVar = (dwwz) bZ2.b;
            str.getClass();
            dwwzVar.a |= 1;
            dwwzVar.b = str;
            dwwz bK = bZ2.bK();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dwxd dwxdVar2 = (dwxd) bZ.b;
            bK.getClass();
            dwxdVar2.c = bK;
            dwxdVar2.a |= 2;
        }
        return bZ;
    }

    @Deprecated
    public static ddho d(int i) {
        dddv.a();
        dddv dddvVar = dddv.a.get(new dddu(i));
        return dddvVar != null ? dddvVar : new dtxi(i);
    }
}
