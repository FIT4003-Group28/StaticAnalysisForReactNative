package defpackage;

import android.os.Build;
/* compiled from: PG */
/* renamed from: lr  reason: default package */
/* loaded from: classes3.dex */
public final class lr {
    private final lu a;

    public lr() {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new lt();
        } else if (Build.VERSION.SDK_INT >= 29) {
            this.a = new lt();
        } else {
            this.a = new ls();
        }
    }

    public final mb a() {
        return this.a.a();
    }

    @Deprecated
    public final void b(gz gzVar) {
        this.a.b(gzVar);
    }

    @Deprecated
    public final void c(gz gzVar) {
        this.a.c(gzVar);
    }

    public lr(mb mbVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new lt(mbVar);
        } else if (Build.VERSION.SDK_INT >= 29) {
            this.a = new lt(mbVar);
        } else {
            this.a = new ls(mbVar);
        }
    }
}
