package defpackage;

import android.content.res.Resources;
import android.view.View;
/* compiled from: PG */
/* renamed from: yye  reason: default package */
/* loaded from: classes4.dex */
public class yye {
    private final afy a;
    public final View b;
    public int c;
    public long d;
    public long e;
    private int f;
    private zar g;

    public yye() {
    }

    public static int g(Resources resources) {
        if (resources != null) {
            return resources.getInteger(17694721);
        }
        return 0;
    }

    private final void n(boolean z, boolean z2) {
        this.g.c(this.b);
        if (z2) {
            if ((z ? this.e : this.d) > 0 && lj.aj(this.b)) {
                if (z) {
                    long j = this.e;
                    this.b.setVisibility(0);
                    o(1);
                    this.g.b(this.b, j, new yzc(this));
                    return;
                }
                long j2 = this.d;
                this.b.setVisibility(0);
                o(3);
                this.g.a(this.b, j2, new yzc(this, 1));
                return;
            }
        }
        if (z) {
            m();
        } else {
            i();
        }
    }

    private final void o(int i) {
        if (i == this.c) {
            return;
        }
        this.c = i;
        int i2 = 0;
        while (true) {
            afy afyVar = this.a;
            if (i2 >= afyVar.b) {
                return;
            }
            ((zas) afyVar.b(i2)).nH(i, this);
            i2++;
        }
    }

    public void a(boolean z, boolean z2) {
        if (!z2 || z != e()) {
            n(z, z2);
        }
    }

    public final void b(boolean z) {
        a(false, z);
    }

    public final void c(boolean z) {
        a(true, z);
    }

    public final boolean d() {
        int i = this.c;
        return i == 0 || i == 3;
    }

    public final boolean e() {
        int i = this.c;
        return i == 2 || i == 1;
    }

    public final boolean f() {
        int i = this.c;
        return i == 2 || i == 3;
    }

    public final void h(zas zasVar) {
        afy afyVar = this.a;
        zasVar.getClass();
        afyVar.add(zasVar);
    }

    public final void i() {
        this.b.setVisibility(this.f);
        o(0);
    }

    public final void j(zas zasVar) {
        afy afyVar = this.a;
        zasVar.getClass();
        afyVar.remove(zasVar);
    }

    public final void k(int i) {
        if (this.f == i) {
            return;
        }
        this.f = i;
        if (this.c != 0) {
            return;
        }
        i();
    }

    public final void l(zar zarVar) {
        zarVar.getClass();
        this.g = zarVar;
    }

    public final void m() {
        this.b.setVisibility(0);
        o(2);
    }

    public yye(View view) {
        this(view, null);
    }

    public yye(View view, byte[] bArr) {
        this(view, g(view.getResources()), 8);
    }

    public yye(View view, long j, int i) {
        this(view, j, new nmd(2), i);
    }

    public yye(View view, long j, zar zarVar, int i) {
        view.getClass();
        this.b = view;
        this.a = new afy();
        l(zarVar);
        this.e = j;
        this.d = j;
        this.f = i;
        n(view.getVisibility() == 0, false);
    }
}
