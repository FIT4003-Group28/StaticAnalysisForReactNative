package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: nmx  reason: default package */
/* loaded from: classes3.dex */
public class nmx {
    public final String a;
    public final nmc b;
    int c = 0;
    public nmk d = nmk.NOT_ENGAGING;
    apzg e;

    public nmx(String str, nmc nmcVar) {
        this.a = str;
        this.b = nmcVar;
    }

    private final void b() {
        int i = this.c;
        if (i == 1) {
            this.b.o(this.e);
        } else if (i == 2) {
            this.b.A(this.e);
            this.b.b().d();
        } else if (i == 3) {
            this.b.z();
            this.b.b().c();
        } else if (i == 4) {
            this.b.n();
        } else if (i != 5) {
        } else {
            this.b.y();
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof nmx)) {
            return false;
        }
        nmx nmxVar = (nmx) obj;
        return akzj.f(this.a, nmxVar.a) && akzj.f(this.b, nmxVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public void a(int i) {
        if (i == 5) {
            int i2 = this.c;
            if (i2 == 0) {
                return;
            }
            if (i2 == 1) {
                this.c = 5;
                b();
                return;
            }
        }
        while (true) {
            int i3 = this.c;
            if (i3 != i) {
                if (i > i3) {
                    aqxo.y(true);
                    this.c++;
                    b();
                } else if (i >= i3) {
                    continue;
                } else {
                    aqxo.y(i3 < 5);
                    int i4 = this.c;
                    if (i4 <= 2) {
                        return;
                    }
                    if (i4 == 4) {
                        i4 = 3;
                    }
                    this.c = i4 - 1;
                    b();
                }
            } else {
                return;
            }
        }
    }
}
