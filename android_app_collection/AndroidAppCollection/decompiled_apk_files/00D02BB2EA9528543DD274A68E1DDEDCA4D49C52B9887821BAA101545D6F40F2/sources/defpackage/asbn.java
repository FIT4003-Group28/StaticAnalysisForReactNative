package defpackage;
/* compiled from: PG */
/* renamed from: asbn  reason: default package */
/* loaded from: classes2.dex */
final class asbn implements crzp<arrg> {
    final /* synthetic */ asbo a;

    public asbn(asbo asboVar) {
        this.a = asboVar;
    }

    @Override // defpackage.crzp
    public final void On(crzm<arrg> crzmVar) {
        boolean booleanValue;
        if (!crzmVar.k()) {
            return;
        }
        arrg l = crzmVar.l();
        dbsk.s(l);
        arrg arrgVar = this.a.b;
        if (arrgVar != null && !l.a().equals(arrgVar.a())) {
            this.a.d();
            arrgVar = null;
        }
        boolean z = false;
        if (l.b() == null) {
            booleanValue = false;
        } else {
            Boolean b = l.b();
            dbsk.s(b);
            booleanValue = b.booleanValue();
        }
        if (arrgVar != null && arrgVar.b() != null) {
            Boolean b2 = arrgVar.b();
            dbsk.s(b2);
            z = b2.booleanValue();
        }
        if (booleanValue && !z) {
            asbo asboVar = this.a;
            asboVar.c = eaow.e(asboVar.a.b());
        } else if (!booleanValue && z) {
            this.a.e();
            this.a.c = eaow.a;
        }
        this.a.b = l;
    }
}
