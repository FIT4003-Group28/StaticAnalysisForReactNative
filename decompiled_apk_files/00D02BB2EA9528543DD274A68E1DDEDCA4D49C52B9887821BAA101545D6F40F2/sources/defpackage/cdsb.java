package defpackage;

import java.util.Locale;
/* compiled from: PG */
/* renamed from: cdsb  reason: default package */
/* loaded from: classes4.dex */
public abstract class cdsb implements cdjl {
    public static cdsb i(dmcc dmccVar, boolean z) {
        return new cdqp(z, bvrt.b(dmccVar));
    }

    @Override // defpackage.cdjl
    public final String a() {
        return h().b;
    }

    @Override // defpackage.cdjl
    public final dbsg<String> b() {
        return dbsg.j((h().a & 4) != 0 ? h().c : null);
    }

    @Override // defpackage.cdjl
    public final dbsg<Locale> c() {
        return dbsg.j((h().a & 16) != 0 ? bvom.b(h().e) : null);
    }

    @Override // defpackage.cdjl
    public final dbsg<String> d() {
        return dbsg.j(!h().f.isEmpty() ? h().f : null);
    }

    @Override // defpackage.cdjl
    public final boolean e() {
        throw null;
    }

    public abstract bvrt<dmcc> g();

    final dmcc h() {
        return g().e((dssr) dmcc.i.cu(7), dmcc.i);
    }
}
