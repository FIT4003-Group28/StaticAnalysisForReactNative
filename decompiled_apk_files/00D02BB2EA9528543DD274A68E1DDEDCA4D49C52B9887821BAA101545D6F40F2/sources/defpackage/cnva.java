package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
/* compiled from: PG */
/* renamed from: cnva  reason: default package */
/* loaded from: classes.dex */
public abstract class cnva {
    private static final Object a = new Object();
    private static cnva b;

    public static cnva a(Context context) {
        synchronized (a) {
            if (b == null) {
                b = new cnvd(context.getApplicationContext());
            }
        }
        return b;
    }

    public abstract boolean b(cnuz cnuzVar, ServiceConnection serviceConnection, String str);

    public final void c(ComponentName componentName, ServiceConnection serviceConnection) {
        d(new cnuz(componentName), serviceConnection);
    }

    protected abstract void d(cnuz cnuzVar, ServiceConnection serviceConnection);

    public final void e(String str, String str2, int i, ServiceConnection serviceConnection, boolean z) {
        d(new cnuz(str, str2, i, z), serviceConnection);
    }
}
