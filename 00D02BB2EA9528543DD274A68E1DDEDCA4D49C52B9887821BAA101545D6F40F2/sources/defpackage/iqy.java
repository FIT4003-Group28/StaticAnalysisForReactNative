package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: iqy  reason: default package */
/* loaded from: classes6.dex */
public final class iqy implements Serializable {
    @dzsi
    public String a;
    @dzsi
    public String b;
    @dzsi
    public Long c;
    public boolean f;
    public boolean g;
    public boolean i;
    public boolean m;
    @dzsi
    public int q;
    public iqx d = iqx.LIST;
    public dndr e = dndr.UNKNOWN_ALIAS_TYPE;
    public int p = 1;
    public dbsg<ilo> h = dbpy.a;
    public boolean j = true;
    public boolean k = false;
    public String l = "";
    public boolean n = false;
    public boolean o = true;

    public final dbsg<ckhf> a() {
        int i = this.q;
        if (i == 0) {
            return dbpy.a;
        }
        switch (i - 1) {
            case 0:
                return dbsg.i(ckfb.a);
            case 1:
                return dbsg.i(ckfb.b);
            case 2:
                return dbsg.i(ckfb.c);
            case 3:
                return dbsg.i(ckfb.d);
            case 4:
                return dbsg.i(ckfb.e);
            case 5:
                return dbsg.i(ckfb.g);
            case 6:
                return dbsg.i(ckfb.h);
            case 7:
                return dbsg.i(ckfb.i);
            case 8:
            default:
                return dbsg.i(ckit.b);
            case 9:
                return dbsg.i(ckit.a);
        }
    }

    public final void b() {
        this.m = true;
    }

    public final void c(ilo iloVar) {
        this.h = dbsg.i(iloVar);
    }

    public final void d() {
        this.g = true;
    }

    public final void e() {
        this.j = false;
    }
}
