package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: dhd  reason: default package */
/* loaded from: classes3.dex */
public final class dhd {
    public final List a = new ArrayList();
    public dhj b;
    public dhc c;
    public int d;

    private dhd() {
    }

    public static dhd c(dhj dhjVar, boolean z) {
        return d(0, dhjVar, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dhd d(int i, dhj dhjVar, boolean z) {
        dhd dhdVar = new dhd();
        dhdVar.d = i;
        dhdVar.b = dhjVar;
        dhdVar.c = z ? new dhc() : null;
        return dhdVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dhd e(dhd dhdVar, dhd dhdVar2) {
        dhc dhcVar = null;
        int i = 0;
        dhd c = c(null, false);
        int i2 = dhdVar != null ? dhdVar.d : 0;
        if (dhdVar2 != null) {
            i = dhdVar2.d;
        }
        List list = c.a;
        dhc dhcVar2 = dhdVar != null ? dhdVar.c : null;
        if (dhdVar2 != null) {
            dhcVar = dhdVar2.c;
        }
        if (dhdVar != null) {
            for (dhb dhbVar : dhdVar.a) {
                list.add(dhb.b(dhbVar));
            }
        }
        if (dhdVar2 != null) {
            for (dhb dhbVar2 : dhdVar2.a) {
                list.add(dhb.c(dhbVar2, i2));
            }
        }
        c.d = i2 + i;
        if (dhcVar2 == null) {
            dhcVar2 = dhcVar;
        } else if (dhcVar != null) {
            dhcVar2 = dhcVar2.a(dhcVar);
        }
        c.c = dhcVar2;
        return c;
    }

    public final int a() {
        return this.a.size();
    }

    public final dhb b(int i) {
        return (dhb) this.a.get(i);
    }

    public final void f(dhb dhbVar) {
        int i;
        int i2;
        int i3;
        int i4;
        this.a.add(dhbVar);
        int i5 = dhbVar.a;
        int i6 = i5 != 1 ? i5 != 3 ? 0 : -1 : 1;
        this.d += i6;
        dhc dhcVar = this.c;
        if (dhcVar != null) {
            if (i5 != 0) {
                if (i5 == 1) {
                    i2 = 1;
                    i3 = 0;
                } else if (i5 != 2) {
                    i2 = 0;
                    i3 = 1;
                } else {
                    i2 = 0;
                    i3 = 0;
                    i4 = 1;
                    i = 0;
                }
                i4 = 0;
                i = 0;
            } else {
                i = dhbVar.d;
                i2 = 0;
                i3 = 0;
                i4 = 0;
            }
            this.c = dhcVar.a(new dhc(i6, i2, i3, i4, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g() {
        for (dhb dhbVar : this.a) {
            dhbVar.e = null;
            dhbVar.f = null;
            dhbVar.g = null;
            dhbVar.h = null;
        }
        this.a.clear();
        this.c = null;
        this.d = 0;
    }
}
