package defpackage;
/* compiled from: PG */
/* renamed from: yoj  reason: default package */
/* loaded from: classes7.dex */
public class yoj extends qjg implements ynj {
    private static final dcqe b = dcqe.c("yoj");
    private final yiq c;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public yoj(android.app.Activity r13, defpackage.cqhn r14, defpackage.yiq r15, java.lang.Boolean r16, defpackage.cqkn<defpackage.qjc> r17) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yoj.<init>(android.app.Activity, cqhn, yiq, java.lang.Boolean, cqkn):void");
    }

    private static String g(yiq yiqVar) {
        int i = yiqVar.a;
        if (i == 1) {
            dqvh b2 = dqvh.b(((Integer) yiqVar.b).intValue());
            if (b2 == null) {
                b2 = dqvh.TRANSIT_VEHICLE_TYPE_UNKNOWN;
            }
            int i2 = b2.h;
            StringBuilder sb = new StringBuilder(19);
            sb.append("transit.");
            sb.append(i2);
            return sb.toString();
        } else if (i != 2) {
            return "Unknown ModeOption, not transit or non_transit";
        } else {
            drsm b3 = drsm.b(((Integer) yiqVar.b).intValue());
            if (b3 == null) {
                b3 = drsm.UNSPECIFIED_NON_TRANSIT_MODE;
            }
            int i3 = b3.j;
            StringBuilder sb2 = new StringBuilder(23);
            sb2.append("non_transit.");
            sb2.append(i3);
            return sb2.toString();
        }
    }

    @Override // defpackage.qjg, defpackage.qjc
    public cqtd e() {
        cqtd e = super.e();
        dbsk.s(e);
        return e;
    }

    @Override // defpackage.ynj
    public yiq f() {
        return this.c;
    }
}
