package defpackage;

import android.os.Build;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: pg  reason: default package */
/* loaded from: classes.dex */
public class pg {
    public final Object a;

    public pg() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.a = new pf(this);
        } else {
            this.a = new pe(this);
        }
    }

    public pg(Object obj) {
        this.a = obj;
    }

    public pc a(int i) {
        return null;
    }

    public boolean b(int i, int i2, Bundle bundle) {
        return false;
    }

    public pc c(int i) {
        return null;
    }
}
