package defpackage;

import com.facebook.yoga.YogaFlexDirection;
import java.util.concurrent.atomic.AtomicInteger;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: sva  reason: default package */
/* loaded from: classes4.dex */
public final class sva {
    public static final String a = "sva";
    public static final AtomicInteger b = new AtomicInteger(1);

    private sva() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static svy a() {
        return suz.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static YogaFlexDirection b(aodt aodtVar) {
        if (aodtVar == null) {
            return YogaFlexDirection.COLUMN;
        }
        axne axneVar = new axne();
        if (tfy.l(aodtVar, axneVar, 168772996, tcf.b)) {
            int aI = axneVar.aI();
            if (aI == 1) {
                return YogaFlexDirection.ROW;
            }
            if (aI == 2) {
                return YogaFlexDirection.ROW_REVERSE;
            }
            if (aI == 4) {
                return YogaFlexDirection.COLUMN_REVERSE;
            }
            return YogaFlexDirection.COLUMN;
        }
        return YogaFlexDirection.COLUMN;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static aodt c(aodt aodtVar) {
        if (aodtVar == null) {
            return null;
        }
        aodt aodtVar2 = new aodt();
        for (int i = 0; i < aodtVar.W(); i++) {
            aodtVar.aA(aodtVar2, i);
            if (aodtVar2.T() == 183314536) {
                return aodt.aB(aodtVar2.V());
            }
        }
        return null;
    }
}
