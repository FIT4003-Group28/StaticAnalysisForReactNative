package defpackage;
/* compiled from: PG */
/* renamed from: bwtu  reason: default package */
/* loaded from: classes4.dex */
final class bwtu implements btzi<dwge, dwgl> {
    final /* synthetic */ bwty a;

    public bwtu(bwty bwtyVar) {
        this.a = bwtyVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dwge> btzrVar, btzy btzyVar) {
        int i = bwty.C;
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dwge> btzrVar, dwgl dwglVar) {
        dwgl dwglVar2 = dwglVar;
        dwge dwgeVar = btzrVar.a;
        akqq akqqVar = this.a.y;
        if ((dwgeVar.a & 32) == 0 || akqqVar == null) {
            return;
        }
        dhjz dhjzVar = dwgeVar.e;
        if (dhjzVar == null) {
            dhjzVar = dhjz.e;
        }
        if (!dhjzVar.equals(akqqVar.i()) || dwglVar2.b.isEmpty()) {
            return;
        }
        double d = 500.0d;
        dwfl dwflVar = null;
        for (dwfl dwflVar2 : dwglVar2.b) {
            double e = akqo.e(ckob.a(dwflVar2), akqqVar);
            if (e < d) {
                dwflVar = dwflVar2;
            }
            if (e < d) {
                d = e;
            }
        }
        if (dwflVar == null) {
            return;
        }
        this.a.f.e(dwflVar, null, null);
    }
}
