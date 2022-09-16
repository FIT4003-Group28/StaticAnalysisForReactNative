package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: adig  reason: default package */
/* loaded from: classes.dex */
public abstract class adig {
    public static int q(Bundle bundle) {
        int i;
        if (bundle == null || (i = bundle.getInt("mdx_session_type", -1)) == -1) {
            return 0;
        }
        int V = almu.V(i);
        int i2 = V - 1;
        if (V == 0) {
            throw null;
        }
        if (i2 != 1 && i2 != 2 && i2 != 3) {
            return 0;
        }
        return V;
    }

    public abstract String b();

    public abstract String c();

    public abstract int d();

    public abstract String g();

    public abstract boolean i(adig adigVar);

    public abstract Bundle r();
}
