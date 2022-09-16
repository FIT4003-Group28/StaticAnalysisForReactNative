package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: baks  reason: default package */
/* loaded from: classes3.dex */
public final class baks implements degu<dcdc<baal>> {
    final /* synthetic */ ilo a;
    final /* synthetic */ barb b;

    public baks(ilo iloVar, barb barbVar) {
        this.a = iloVar;
        this.b = barbVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        this.b.a(this.a, dcdc.e());
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(dcdc<baal> dcdcVar) {
        dhjx ak = this.a.ak();
        dbsk.s(ak);
        final akqs m = akyx.m(ak);
        this.b.a(this.a, dcbg.b(dcdcVar).o(new dbsl(m) { // from class: bakr
            private final akqs a;

            {
                this.a = m;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                akqs akqsVar = this.a;
                baal baalVar = (baal) obj;
                if (baalVar.z() != null) {
                    baak z = baalVar.z();
                    dbsk.s(z);
                    if (z.b() == null) {
                        return false;
                    }
                    baak z2 = baalVar.z();
                    dbsk.s(z2);
                    return akqsVar.b(z2.b());
                }
                return false;
            }
        }).z());
    }
}
