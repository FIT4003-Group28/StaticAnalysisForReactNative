package defpackage;
/* compiled from: PG */
/* renamed from: dpz  reason: default package */
/* loaded from: classes6.dex */
public final class dpz implements begr {
    final /* synthetic */ deig a;

    public dpz(deig deigVar) {
        this.a = deigVar;
    }

    @Override // defpackage.begr
    public final void a(bttu bttuVar, ilo iloVar) {
        if (iloVar.aj() == null) {
            this.a.k(new IllegalStateException("Null or empty placemark latlng found"));
        } else {
            this.a.j(iloVar);
        }
    }

    @Override // defpackage.begr
    public final void b(bttu bttuVar, ilo iloVar, bttq bttqVar) {
        this.a.k(new RuntimeException(String.format("Placemark fetch returned with errorCode: %s", bttqVar)));
    }
}
