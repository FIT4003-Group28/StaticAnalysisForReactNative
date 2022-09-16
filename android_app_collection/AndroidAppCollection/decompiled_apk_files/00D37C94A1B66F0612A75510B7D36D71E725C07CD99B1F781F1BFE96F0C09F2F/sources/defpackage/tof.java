package defpackage;

import java.util.Collections;
/* compiled from: PG */
/* renamed from: tof  reason: default package */
/* loaded from: classes4.dex */
public final class tof {
    public final tnq a;

    public tof(tnq tnqVar) {
        this.a = tnqVar;
    }

    public static void a(aopc[] aopcVarArr, int i, boolean z) {
        aopc aopcVar = aopcVarArr[i];
        if (aopcVar.qn(anfb.a)) {
            z = true;
        } else if (z) {
            aopg aopgVar = anfb.a;
            anfi anfiVar = (anfi) aopcVar.instance;
            aopcVar.e(aopgVar, Long.valueOf((anfiVar.c << 32) | anfiVar.d));
        }
        for (Integer num : Collections.unmodifiableList(((anfi) aopcVar.instance).e)) {
            a(aopcVarArr, num.intValue(), z);
        }
    }
}
