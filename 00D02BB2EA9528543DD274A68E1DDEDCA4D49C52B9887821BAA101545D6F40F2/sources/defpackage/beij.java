package defpackage;
/* compiled from: PG */
/* renamed from: beij  reason: default package */
/* loaded from: classes3.dex */
final class beij implements btzi<diki, dikk> {
    final /* synthetic */ beik a;

    public beij(beik beikVar) {
        this.a = beikVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<diki> btzrVar, btzy btzyVar) {
        beik beikVar = this.a;
        beikVar.e = false;
        beikVar.a.a(apsi.c(2, dbpy.a));
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<diki> btzrVar, dikk dikkVar) {
        dikk dikkVar2 = dikkVar;
        beik beikVar = this.a;
        boolean z = false;
        beikVar.e = false;
        beikVar.d = dikkVar2.c;
        if (1 == ((dikkVar2.a & 1) ^ 1)) {
            z = true;
        }
        beikVar.f = z;
        beikVar.a.a(apsi.c(3, dbsg.i(dikkVar2.b)));
    }
}
