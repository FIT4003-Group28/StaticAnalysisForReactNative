package defpackage;

import android.content.Context;
import android.view.WindowManager;
/* compiled from: PG */
/* renamed from: cwyb  reason: default package */
/* loaded from: classes5.dex */
final class cwyb {
    public static volatile int a;
    private static volatile int b;

    private cwyb() {
    }

    public static int a(Context context) {
        if (b == 0) {
            synchronized (cwyb.class) {
                if (b == 0) {
                    b = Math.round(((WindowManager) context.getApplicationContext().getSystemService("window")).getDefaultDisplay().getRefreshRate());
                }
            }
        }
        return b;
    }
}
