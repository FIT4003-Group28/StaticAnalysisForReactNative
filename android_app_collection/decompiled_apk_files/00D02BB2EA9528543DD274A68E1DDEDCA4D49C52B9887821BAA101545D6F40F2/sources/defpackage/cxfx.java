package defpackage;
/* compiled from: PG */
/* renamed from: cxfx  reason: default package */
/* loaded from: classes5.dex */
final class cxfx implements cxfz<dzxz> {
    @Override // defpackage.cxfz
    public final /* bridge */ /* synthetic */ void a(dzxz dzxzVar, Long l) {
        dzxz dzxzVar2 = dzxzVar;
        if (l == null) {
            if (dzxzVar2.c) {
                dzxzVar2.bF();
                dzxzVar2.c = false;
            }
            dzyc dzycVar = (dzyc) dzxzVar2.b;
            dzyc dzycVar2 = dzyc.k;
            dzycVar.a &= -3;
            dzycVar.c = 0L;
            return;
        }
        long longValue = l.longValue();
        if (dzxzVar2.c) {
            dzxzVar2.bF();
            dzxzVar2.c = false;
        }
        dzyc dzycVar3 = (dzyc) dzxzVar2.b;
        dzyc dzycVar4 = dzyc.k;
        dzycVar3.a |= 2;
        dzycVar3.c = longValue;
    }

    @Override // defpackage.cxfz
    public final /* bridge */ /* synthetic */ String b(dzxz dzxzVar) {
        return ((dzyc) dzxzVar.b).d;
    }

    @Override // defpackage.cxfz
    public final /* bridge */ /* synthetic */ String c(dzxz dzxzVar) {
        return ((dzyc) dzxzVar.b).e;
    }

    @Override // defpackage.cxfz
    public final /* bridge */ /* synthetic */ void d(dzxz dzxzVar) {
        dzxz dzxzVar2 = dzxzVar;
        if (dzxzVar2.c) {
            dzxzVar2.bF();
            dzxzVar2.c = false;
        }
        dzyc dzycVar = (dzyc) dzxzVar2.b;
        dzyc dzycVar2 = dzyc.k;
        dzycVar.a &= -5;
        dzycVar.d = dzyc.k.d;
    }
}
