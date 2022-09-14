package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bhea  reason: default package */
/* loaded from: classes3.dex */
public final class bhea implements btzi<didc, dide> {
    final /* synthetic */ bheb a;

    public bhea(bheb bhebVar) {
        this.a = bhebVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<didc> btzrVar, btzy btzyVar) {
        if (btzrVar.a.b.equals(this.a.a)) {
            this.a.f = false;
            this.a.d = true;
            Throwable th = btzyVar.r;
            String str = btzrVar.a.b;
        }
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<didc> btzrVar, dide dideVar) {
        dide dideVar2 = dideVar;
        if (btzrVar.a.b.equals(this.a.a)) {
            this.a.f = false;
            bheb bhebVar = this.a;
            bhebVar.d = false;
            dqcd dqcdVar = dideVar2.a;
            if (dqcdVar == null) {
                dqcdVar = dqcd.b;
            }
            dpua dpuaVar = (dpua) dcbg.b(dqcdVar.a).r(bhdz.a).f();
            if (dpuaVar == null) {
                return;
            }
            for (bhiu bhiuVar : bhebVar.c) {
                bhiuVar.k(dpuaVar);
                cqkx.p(bhiuVar);
            }
            bhebVar.c.clear();
            bhebVar.b = dpuaVar;
        }
    }
}
