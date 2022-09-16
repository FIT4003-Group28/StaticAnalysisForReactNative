package defpackage;

import android.os.Build;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: ml  reason: default package */
/* loaded from: classes3.dex */
public class ml {
    public final Object a;

    public ml() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.a = new mk(this);
        } else {
            this.a = new mj(this);
        }
    }

    public ml(Object obj) {
        this.a = obj;
    }

    public mh a(int i) {
        return null;
    }

    public mh b(int i) {
        return null;
    }

    public boolean c(int i, int i2, Bundle bundle) {
        return false;
    }
}
