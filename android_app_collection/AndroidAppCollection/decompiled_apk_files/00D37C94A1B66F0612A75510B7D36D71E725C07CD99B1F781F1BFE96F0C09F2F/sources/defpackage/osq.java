package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: osq  reason: default package */
/* loaded from: classes4.dex */
public final class osq {
    private static volatile osq a;
    private final Context b;

    private osq(Context context) {
        this.b = context;
    }

    public static osq a() {
        osq osqVar = a;
        if (osqVar != null) {
            return osqVar;
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (a == null) {
            synchronized (osq.class) {
                if (a == null) {
                    a = new osq(context);
                }
            }
        }
    }

    public final osn c() {
        return new osp(this.b);
    }
}
