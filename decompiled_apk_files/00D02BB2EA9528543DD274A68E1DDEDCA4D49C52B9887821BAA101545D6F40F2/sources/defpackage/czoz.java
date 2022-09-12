package defpackage;

import android.content.Context;
import java.security.SecureRandom;
/* compiled from: PG */
/* renamed from: czoz  reason: default package */
/* loaded from: classes5.dex */
public final class czoz {
    private static czoz b;
    cnjz a;
    private final String c;

    private czoz() {
        long currentTimeMillis = System.currentTimeMillis();
        long abs = Math.abs(new SecureRandom().nextLong());
        StringBuilder sb = new StringBuilder(41);
        sb.append(currentTimeMillis);
        sb.append("_");
        sb.append(abs);
        this.c = sb.toString();
    }

    public static czoz a() {
        if (b == null) {
            b = new czoz();
        }
        return b;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0259  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00d0 -> B:86:0x00d4). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void e(final defpackage.dtww r7, defpackage.dstv r8, defpackage.dspt r9, android.content.Context r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 642
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.czoz.e(dtww, dstv, dspt, android.content.Context, java.lang.String):void");
    }

    public final void b(dtub dtubVar, dstv dstvVar, dspt dsptVar, Context context, String str) {
        dtww bZ = dtwx.f.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dtubVar.getClass();
        ((dtwx) bZ.b).c = dtubVar;
        e(bZ, dstvVar, dsptVar, context, str);
    }

    public final void c(dtwv dtwvVar, dstv dstvVar, dspt dsptVar, Context context, String str) {
        dtww bZ = dtwx.f.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dtwvVar.getClass();
        ((dtwx) bZ.b).d = dtwvVar;
        e(bZ, dstvVar, dsptVar, context, str);
    }

    public final void d(dtuu dtuuVar, dstv dstvVar, dspt dsptVar, Context context, String str) {
        dtww bZ = dtwx.f.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dtuuVar.getClass();
        ((dtwx) bZ.b).e = dtuuVar;
        e(bZ, dstvVar, dsptVar, context, str);
    }
}
