package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: alb  reason: default package */
/* loaded from: classes.dex */
public final class alb {
    public static final agc a = new agc(16);
    public static final ExecutorService b;
    public static final Object c;
    public static final agd d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new pgw(1));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        b = threadPoolExecutor;
        c = new Object();
        d = new agd();
    }

    public static ala a(String str, Context context, akv akvVar, int i) {
        int length;
        Typeface typeface = (Typeface) a.c(str);
        if (typeface == null) {
            try {
                alc a2 = aku.a(context, akvVar, null);
                int i2 = 0;
                if (a2.a != 0) {
                    i2 = -2;
                } else {
                    ald[] aldVarArr = a2.b;
                    if (aldVarArr == null || (length = aldVarArr.length) == 0) {
                        i2 = 1;
                    } else {
                        int i3 = 0;
                        while (true) {
                            if (i3 >= length) {
                                break;
                            }
                            int i4 = aldVarArr[i3].e;
                            if (i4 != 0) {
                                i2 = i4 < 0 ? -3 : i4;
                            } else {
                                i3++;
                            }
                        }
                    }
                }
                if (i2 == 0) {
                    Typeface b2 = hc.b(context, null, a2.b, i);
                    if (b2 != null) {
                        a.d(str, b2);
                        return new ala(b2);
                    }
                    return new ala(-3);
                }
                return new ala(i2);
            } catch (PackageManager.NameNotFoundException unused) {
                return new ala(-1);
            }
        }
        return new ala(typeface);
    }

    public static String b(akv akvVar, int i) {
        return akvVar.f + "-" + i;
    }
}
