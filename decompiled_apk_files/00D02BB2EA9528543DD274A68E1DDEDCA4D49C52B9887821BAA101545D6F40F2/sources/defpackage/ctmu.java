package defpackage;

import android.os.Handler;
import android.os.Looper;
/* compiled from: PG */
/* renamed from: ctmu  reason: default package */
/* loaded from: classes5.dex */
public final class ctmu {
    public final Handler a = new Handler(Looper.getMainLooper());

    public static boolean a(dyjb dyjbVar) {
        if (dyjbVar == null) {
            return false;
        }
        dyiy dyiyVar = dyiy.OK;
        int ordinal = dyjbVar.p.ordinal();
        return ordinal == 1 || ordinal == 4 || ordinal == 8 || ordinal == 10 || ordinal == 13 || ordinal == 14;
    }
}
