package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: ahqr  reason: default package */
/* loaded from: classes2.dex */
public final class ahqr implements ahqs {
    public final ahqs a;
    public final btnc<bqyh, List<ahqq>> b;

    public ahqr(ahqs ahqsVar, @dzsi btmv btmvVar) {
        this.a = ahqsVar;
        this.b = new btnc<>(cpnx.a, btmz.CURVED_SEGMENTS, btmvVar);
    }

    public static akra b(bqyh bqyhVar) {
        akra akraVar = new akra();
        akra.H(bqyhVar.b, bqyhVar.c, 0.5f, akraVar);
        return akraVar;
    }

    private static akra c(akra akraVar, akra akraVar2, float f, float f2) {
        float y = akraVar.y(akraVar2);
        float min = Math.min(f, y / 2.0f);
        if (min < f2) {
            return akraVar;
        }
        akra akraVar3 = new akra();
        akra.H(akraVar, akraVar2, min / y, akraVar3);
        return akraVar3;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01d9  */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<defpackage.ahqq> a(defpackage.bqyh r24) {
        /*
            Method dump skipped, instructions count: 501
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahqr.a(bqyh):java.util.List");
    }
}
