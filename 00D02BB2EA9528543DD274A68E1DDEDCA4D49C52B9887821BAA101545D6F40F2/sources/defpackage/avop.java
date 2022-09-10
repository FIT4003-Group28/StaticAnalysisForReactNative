package defpackage;
/* compiled from: PG */
/* renamed from: avop  reason: default package */
/* loaded from: classes.dex */
public final class avop {
    public final ckcw a;

    public avop(ckcw ckcwVar) {
        this.a = ckcwVar;
    }

    public static int f(int i) {
        dltz dltzVar = dltz.AUTOMATIC;
        int i2 = i - 1;
        int i3 = 1;
        if (i2 != 1) {
            i3 = 2;
            if (i2 != 2) {
                i3 = 3;
                if (i2 != 3) {
                    return 4;
                }
            }
        }
        return i3;
    }

    public final void a(int i) {
        ((ckco) this.a.a(ckia.t)).a(i);
    }

    public final void b() {
        ((ckco) this.a.a(ckia.u)).a(0);
    }

    public final void c(int i) {
        b();
        if (i != 0) {
            ((ckco) this.a.a(ckia.u)).a(i);
        }
    }

    public final void d() {
        ((ckcn) this.a.a(ckia.y)).a();
    }

    public final void e(int i, int i2) {
        ((ckco) this.a.a(ckia.b)).a(i);
        ((ckco) this.a.a(ckia.c)).a(ckhz.a(f(i2)));
    }
}
