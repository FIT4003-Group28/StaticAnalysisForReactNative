package defpackage;

import android.util.Pair;
import java.nio.ByteBuffer;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: szc  reason: default package */
/* loaded from: classes4.dex */
public final class szc implements tek {
    private final teb a;
    private final Map b;
    private final Map c;
    private final boolean d;

    public szc(Map map, Map map2, ampq ampqVar, teb tebVar) {
        this.a = tebVar;
        this.d = ((Boolean) ampqVar.e(false)).booleanValue();
        amum amumVar = new amum();
        for (Map.Entry entry : ((amup) map).entrySet()) {
            tck tckVar = (tck) entry.getValue();
            amumVar.f(189078944, (tck) entry.getValue());
        }
        amum amumVar2 = new amum();
        for (Map.Entry entry2 : ((amup) map2).entrySet()) {
            amumVar2.f(Integer.valueOf(((tex) ((Pair) entry2.getValue()).first).a().a()), (Pair) entry2.getValue());
        }
        this.b = amumVar.b();
        this.c = amumVar2.b();
    }

    private static void d(tda tdaVar, dal dalVar) {
        Map map = tdaVar.i;
        if (map != null) {
            map.put(dalVar, true);
        }
    }

    @Override // defpackage.tek
    public final int a() {
        return 168774549;
    }

    @Override // defpackage.tek
    public final /* bridge */ /* synthetic */ aodt b(ByteBuffer byteBuffer) {
        return axni.aH(byteBuffer);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0279 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:205:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01bf  */
    @Override // defpackage.tel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void c(defpackage.cyv r24, defpackage.tda r25, java.lang.String r26, java.lang.Object r27, defpackage.tdq r28, defpackage.tcr r29) {
        /*
            Method dump skipped, instructions count: 1101
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.szc.c(cyv, tda, java.lang.String, java.lang.Object, tdq, tcr):void");
    }

    @Override // defpackage.tel
    public final void e(tdq tdqVar) {
        cyp a = tdqVar.a();
        a.p(1.0f);
        a.s(true);
    }
}
