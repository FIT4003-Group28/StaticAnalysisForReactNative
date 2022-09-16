package defpackage;
/* compiled from: PG */
/* renamed from: cbqe  reason: default package */
/* loaded from: classes4.dex */
final class cbqe implements begr {
    final /* synthetic */ deig a;

    public cbqe(deig deigVar) {
        this.a = deigVar;
    }

    @Override // defpackage.begr
    public final void a(bttu bttuVar, ilo iloVar) {
        if (iloVar.aj() == null) {
            this.a.k(new RuntimeException("Null or empty placemark latlng found"));
        } else {
            this.a.j(iloVar);
        }
    }

    @Override // defpackage.begr
    public final void b(bttu bttuVar, ilo iloVar, bttq bttqVar) {
        this.a.k(new RuntimeException(String.format("Placemark fetch returned with errorCode: %s", bttqVar)));
    }
}
