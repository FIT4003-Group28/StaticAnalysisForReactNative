package defpackage;

import android.os.Build;
/* compiled from: PG */
/* renamed from: bhl  reason: default package */
/* loaded from: classes2.dex */
public final class bhl {
    public boolean a;
    boolean b;

    public final bhm a() {
        return new bhm(this);
    }

    public final void b(boolean z) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.b = z;
        }
    }
}
