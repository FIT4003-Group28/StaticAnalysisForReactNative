package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bqgo  reason: default package */
/* loaded from: classes4.dex */
public abstract class bqgo extends dbrh<bqhj, bqhu> {
    @Override // defpackage.dbrh
    protected final /* bridge */ /* synthetic */ bqhj b(bqhu bqhuVar) {
        bqhu bqhuVar2 = bqhuVar;
        bqhh f = bqhj.f();
        if ((bqhuVar2.a & 1) != 0) {
            g(bqhuVar2, f);
        }
        if ((bqhuVar2.a & 2) != 0) {
            f.b(bqhuVar2.e);
        }
        if (bqhuVar2.b == 3 && bqht.a(3) == 4) {
            h(bqhuVar2, f);
        }
        if (bqhuVar2.b == 4 && bqht.a(4) == 5) {
            i(bqhuVar2, f);
        }
        return f.a();
    }

    @Override // defpackage.dbrh
    protected final /* bridge */ /* synthetic */ bqhu c(bqhj bqhjVar) {
        bqhj bqhjVar2 = bqhjVar;
        bqhs bZ = bqhu.f.bZ();
        d(bqhjVar2, bZ);
        if (bqhjVar2.b().a()) {
            e(bqhjVar2, bZ);
        }
        if (bqhjVar2.c().a() && bqhjVar2.c().a()) {
            long longValue = bqhjVar2.c().b().longValue();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            bqhu bqhuVar = (bqhu) bZ.b;
            bqhuVar.a |= 2;
            bqhuVar.e = longValue;
        }
        if (bqhjVar2.d().a()) {
            f(bqhjVar2, bZ);
        }
        return bZ.bK();
    }

    public abstract void d(bqhj bqhjVar, bqhs bqhsVar);

    public abstract void e(bqhj bqhjVar, bqhs bqhsVar);

    public abstract void f(bqhj bqhjVar, bqhs bqhsVar);

    public abstract void g(bqhu bqhuVar, bqhh bqhhVar);

    public void h(bqhu bqhuVar, bqhh bqhhVar) {
        throw null;
    }

    public void i(bqhu bqhuVar, bqhh bqhhVar) {
        throw null;
    }
}
