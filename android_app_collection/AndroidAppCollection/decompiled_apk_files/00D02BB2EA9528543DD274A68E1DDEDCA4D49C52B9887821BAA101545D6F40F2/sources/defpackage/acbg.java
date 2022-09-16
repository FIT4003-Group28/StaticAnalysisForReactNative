package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: acbg  reason: default package */
/* loaded from: classes2.dex */
public final class acbg {
    public final int a;
    public final int b;
    public int c = 0;
    public int d = 0;
    public int e;
    public acax f;
    private final int g;

    public acbg(Application application) {
        int e = acbn.b.e(application);
        this.a = e;
        this.g = acbn.a.e(application);
        int e2 = abzz.a.e(application);
        this.b = e2;
        this.e = e;
        this.f = acbf.b(e + e2);
    }

    public final boolean a() {
        boolean z;
        int min = Math.min(this.a + this.d, this.g);
        int i = this.b + min;
        if (i != this.f.a().intValue()) {
            this.f = acbf.b(i);
            z = true;
        } else {
            z = false;
        }
        int min2 = Math.min(min, Math.max(this.g - this.c, this.a));
        if (min2 != this.e) {
            this.e = min2;
            return true;
        }
        return z;
    }
}
