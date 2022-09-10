package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: avzo  reason: default package */
/* loaded from: classes3.dex */
public class avzo {
    public static final long a = TimeUnit.DAYS.toMillis(5);

    public static final boolean c(dltm dltmVar, long j) {
        int a2;
        int a3;
        int a4 = dltj.a(dltmVar.d);
        return ((a4 != 0 && a4 == 2) || (((a2 = dltj.a(dltmVar.d)) != 0 && a2 == 4) || ((a3 = dltj.a(dltmVar.d)) != 0 && a3 == 5))) && dltmVar.h < j + a;
    }

    public final boolean a(dltm dltmVar) {
        int a2;
        int a3;
        int a4 = dltj.a(dltmVar.d);
        if ((a4 == 0 || a4 != 2) && ((a2 = dltj.a(dltmVar.d)) == 0 || a2 != 4)) {
            if (dltmVar.o) {
                return false;
            }
            int a5 = dltj.a(dltmVar.d);
            if ((a5 == 0 || a5 != 6) && ((a3 = dltj.a(dltmVar.d)) == 0 || a3 != 7)) {
                return false;
            }
        }
        return true;
    }

    public final int b(dltm dltmVar) {
        if (!dltmVar.r) {
            return 1;
        }
        int a2 = dltj.a(dltmVar.d);
        if (a2 == 0) {
            a2 = 1;
        }
        int i = a2 - 1;
        if (i == 0) {
            return dltmVar.n ? 4 : 8;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return dltmVar.o ? 5 : 7;
                    }
                }
            }
            if (dltmVar.n) {
                return 4;
            }
            int a3 = dlth.a(dltmVar.e);
            return (a3 != 0 && a3 == 8) ? 10 : 9;
        }
        return dltmVar.n ? 6 : 8;
    }
}
