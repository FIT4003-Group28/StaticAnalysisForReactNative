package defpackage;

import android.content.Context;
import android.os.Process;
/* compiled from: PG */
/* renamed from: cwuv  reason: default package */
/* loaded from: classes.dex */
public final class cwuv {
    public static eaat a(Context context) {
        return b(null, context);
    }

    public static eaat b(String str, Context context) {
        eaas bZ = eaat.f.bZ();
        long elapsedCpuTime = Process.getElapsedCpuTime();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        eaat eaatVar = (eaat) bZ.b;
        eaatVar.a |= 1;
        eaatVar.b = elapsedCpuTime;
        boolean b = cwuu.b(context);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        eaat eaatVar2 = (eaat) bZ.b;
        eaatVar2.a |= 2;
        eaatVar2.c = b;
        int activeCount = Thread.activeCount();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        eaat eaatVar3 = (eaat) bZ.b;
        int i = eaatVar3.a | 4;
        eaatVar3.a = i;
        eaatVar3.d = activeCount;
        if (str != null) {
            str.getClass();
            eaatVar3.a = i | 8;
            eaatVar3.e = str;
        }
        return bZ.bK();
    }
}
