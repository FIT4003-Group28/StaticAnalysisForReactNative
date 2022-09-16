package defpackage;

import java.util.EnumMap;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: djt  reason: default package */
/* loaded from: classes6.dex */
public final class djt implements dfeq<dfgv> {
    private final czh a;
    private final cjqy b;
    private final Map<dfgu, ddhn> c;
    private final crow d;

    public djt(cjqy cjqyVar, crow crowVar, czh czhVar) {
        this.a = czhVar;
        this.b = cjqyVar;
        this.d = crowVar;
        EnumMap enumMap = new EnumMap(dfgu.class);
        int ordinal = czhVar.ordinal();
        if (ordinal == 0) {
            enumMap.put((EnumMap) dfgu.FULL_CALIBRATION, (dfgu) ddda.ab);
            enumMap.put((EnumMap) dfgu.RECALIBRATION, (dfgu) ddda.ad);
            enumMap.put((EnumMap) dfgu.LOCALIZED, (dfgu) ddda.ac);
            enumMap.put((EnumMap) dfgu.FAILED, (dfgu) ddda.aa);
        } else if (ordinal == 1) {
            enumMap.put((EnumMap) dfgu.FULL_CALIBRATION, (dfgu) ddda.V);
            enumMap.put((EnumMap) dfgu.RECALIBRATION, (dfgu) ddda.X);
            enumMap.put((EnumMap) dfgu.LOCALIZED, (dfgu) ddda.W);
            enumMap.put((EnumMap) dfgu.FAILED, (dfgu) ddda.U);
        } else if (ordinal == 3) {
            enumMap.put((EnumMap) dfgu.FULL_CALIBRATION, (dfgu) ddda.N);
            enumMap.put((EnumMap) dfgu.RECALIBRATION, (dfgu) ddda.P);
            enumMap.put((EnumMap) dfgu.LOCALIZED, (dfgu) ddda.O);
            enumMap.put((EnumMap) dfgu.FAILED, (dfgu) ddda.M);
        }
        this.c = enumMap;
    }

    @Override // defpackage.dfeq
    public final /* bridge */ /* synthetic */ void n(@dzsi dfgv dfgvVar) {
        crow crowVar;
        ddnr ddnrVar;
        dfgv dfgvVar2 = dfgvVar;
        if (dfgvVar2 == null) {
            return;
        }
        dfgu b = dfgu.b(dfgvVar2.b);
        if (b == null) {
            b = dfgu.NONE;
        }
        if (this.a == czh.WALKING_NAVIGATION && b == dfgu.LOCALIZED && (ddnrVar = (crowVar = this.d).e) != null) {
            int i = ((ddns) ddnrVar.b).a;
            if ((i & 4) == 0) {
                boolean z = true;
                if (1 != (i & 1)) {
                    z = false;
                }
                dbsk.l(z);
                int e = ((int) (crowVar.a.e() - crowVar.d)) - ((ddns) ddnrVar.b).b;
                if (ddnrVar.c) {
                    ddnrVar.bF();
                    ddnrVar.c = false;
                }
                ddns ddnsVar = (ddns) ddnrVar.b;
                ddnsVar.a |= 4;
                ddnsVar.d = e;
            }
        }
        if (!this.c.containsKey(b)) {
            return;
        }
        cjqy cjqyVar = this.b;
        cjsx i2 = cjsy.i();
        i2.b(this.c.get(b));
        cjqyVar.k(i2.a());
    }
}
