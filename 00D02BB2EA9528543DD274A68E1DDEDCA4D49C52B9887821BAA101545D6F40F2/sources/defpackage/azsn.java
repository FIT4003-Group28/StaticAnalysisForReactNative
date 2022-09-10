package defpackage;
/* compiled from: PG */
/* renamed from: azsn  reason: default package */
/* loaded from: classes3.dex */
final class azsn implements begr {
    final /* synthetic */ deig a;

    public azsn(deig deigVar) {
        this.a = deigVar;
    }

    @Override // defpackage.begr
    public final void a(bttu bttuVar, ilo iloVar) {
        if (dbsj.d(iloVar.n())) {
            this.a.k(new RuntimeException("Null or empty placemark title found"));
        } else {
            this.a.j(iloVar);
        }
    }

    @Override // defpackage.begr
    public final void b(bttu bttuVar, ilo iloVar, bttq bttqVar) {
        this.a.k(new RuntimeException(String.format("Placemark fetch returned with errorCode: %s", bttqVar)));
    }
}
