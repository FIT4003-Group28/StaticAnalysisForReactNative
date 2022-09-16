package defpackage;

import android.app.Activity;
import android.os.Build;
import java.util.HashSet;
import java.util.Observable;
import java.util.Observer;
import java.util.Set;
/* compiled from: PG */
/* renamed from: fdw  reason: default package */
/* loaded from: classes3.dex */
public final class fdw implements Observer, yzy, fdt {
    private static final boolean b;
    private static final boolean c;
    public final fdu a;
    private final Activity d;
    private final ezs e;
    private final boolean f;
    private final boolean g;
    private final Set h;
    private int i;

    static {
        boolean z = true;
        b = Build.VERSION.SDK_INT >= 24;
        if (Build.VERSION.SDK_INT >= 23) {
            z = false;
        }
        c = z;
    }

    public fdw(Activity activity, fdu fduVar, ezs ezsVar) {
        boolean z = b;
        boolean z2 = c;
        this.d = activity;
        this.a = fduVar;
        this.e = ezsVar;
        this.f = z;
        this.g = z2;
        this.h = new HashSet();
        this.i = 0;
    }

    private static int d(boolean z) {
        return z ? 4 : 3;
    }

    private final void e() {
        if (this.i == 0) {
            return;
        }
        h(1);
    }

    private final void f() {
        g(this.d.hasWindowFocus());
    }

    private final void g(boolean z) {
        if (!i(this.i)) {
            int i = 2;
            if (this.g) {
                if (z) {
                    z = true;
                }
                h(i);
            }
            int[] iArr = ezs.a;
            int i2 = 0;
            while (true) {
                if (i2 >= 3) {
                    i = d(z);
                    break;
                }
                if (akzj.f(this.e.a(iArr[i2]).a, afmv.a)) {
                    break;
                }
                i2++;
            }
            h(i);
        }
    }

    private final void h(int i) {
        int i2 = this.i;
        boolean z = i2 == 1 || i2 == 0;
        boolean z2 = i == 1 || i == 0;
        if (i2 != i) {
            if (z && z2) {
                return;
            }
            for (fdv fdvVar : this.h) {
                boolean i3 = i(i2);
                if (i != 0) {
                    if (i != 1) {
                        if (i != 3) {
                            if (i == 4) {
                                if (!i3) {
                                    fdvVar.e(true);
                                } else {
                                    fdvVar.c(true);
                                }
                            }
                        } else if (!i3) {
                            fdvVar.e(false);
                        } else {
                            fdvVar.c(false);
                        }
                    } else if (i3) {
                        fdvVar.d(false);
                    }
                } else if (i3) {
                    fdvVar.d(true);
                }
            }
            this.i = i;
            if (i2 == 2) {
                int[] iArr = ezs.a;
                for (int i4 = 0; i4 < 3; i4++) {
                    this.e.a(iArr[i4]).deleteObserver(this);
                }
            }
            if (i != 2) {
                return;
            }
            int[] iArr2 = ezs.a;
            for (int i5 = 0; i5 < 3; i5++) {
                this.e.a(iArr2[i5]).addObserver(this);
            }
        }
    }

    private static boolean i(int i) {
        return i == 4 || i == 3;
    }

    public final void a(int i) {
        if (i == 0) {
            this.a.e(fdq.WATCH_WHILE);
            if (!this.f) {
                return;
            }
            f();
        } else if (i == 1) {
            this.a.e(fdq.WATCH_WHILE);
            f();
        } else if (i != 2) {
            e();
        } else if (this.f) {
        } else {
            e();
        }
    }

    @Override // defpackage.yzy
    public final void b(boolean z) {
        if (i(this.i)) {
            h(d(z));
        } else if (this.i != 2) {
        } else {
            g(z);
        }
    }

    public final void c(fdv fdvVar) {
        fdvVar.getClass();
        this.h.add(fdvVar);
    }

    @Override // defpackage.fdt
    public final void k(fdq fdqVar) {
        if (fdqVar == fdq.WATCH_WHILE || this.i == 1) {
            return;
        }
        h(0);
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        if (this.i == 2) {
            f();
        }
    }
}
