package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: cdrv  reason: default package */
/* loaded from: classes4.dex */
public final class cdrv implements cdiy {
    private final bvrt<dmaw> a;
    private final cdsb b;

    public cdrv(dmaw dmawVar, boolean z) {
        this.a = bvrt.b(dmawVar);
        dmcc dmccVar = dmawVar.h;
        this.b = cdsb.i(dmccVar == null ? dmcc.i : dmccVar, z);
    }

    private final dmaw f() {
        return this.a.e((dssr) dmaw.n.cu(7), dmaw.n);
    }

    @Override // defpackage.cdiy
    public final cdjl a() {
        return this.b;
    }

    @Override // defpackage.cdiy
    public final String b() {
        return f().k;
    }

    @Override // defpackage.cdiy
    public final dbsg<dnpq> c() {
        dnpq dnpqVar;
        if ((f().a & 32) != 0) {
            dnpqVar = f().l;
            if (dnpqVar == null) {
                dnpqVar = dnpq.g;
            }
        } else {
            dnpqVar = null;
        }
        return dbsg.j(dnpqVar);
    }

    @Override // defpackage.cdiy
    public final dbsg<String> d() {
        String str;
        if (f().d == 6) {
            dmaw f = f();
            str = f.d == 6 ? (String) f.e : "";
        } else {
            str = null;
        }
        return dbsg.j(str);
    }

    @Override // defpackage.cdiy
    public final dbsg<String> e() {
        String str;
        if (f().f == 8) {
            dmaw f = f();
            str = f.f == 8 ? (String) f.g : "";
        } else {
            str = null;
        }
        return dbsg.j(str);
    }

    public final boolean equals(@dzsi Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cdrv)) {
            return false;
        }
        cdrv cdrvVar = (cdrv) obj;
        return dbsd.a(this.a, cdrvVar.a) && dbsd.a(this.b, cdrvVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }
}
