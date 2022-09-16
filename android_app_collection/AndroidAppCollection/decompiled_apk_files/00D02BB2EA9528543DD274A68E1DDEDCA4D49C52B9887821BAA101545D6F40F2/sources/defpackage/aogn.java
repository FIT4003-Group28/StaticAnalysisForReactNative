package defpackage;
/* compiled from: PG */
/* renamed from: aogn  reason: default package */
/* loaded from: classes2.dex */
public final class aogn implements dbsl<duzn> {
    final /* synthetic */ eapy a;

    public aogn(eapy eapyVar) {
        this.a = eapyVar;
    }

    @Override // defpackage.dbsl
    public final /* bridge */ /* synthetic */ boolean a(@dzsi duzn duznVar) {
        duzn duznVar2 = duznVar;
        if (duznVar2 == null) {
            return false;
        }
        dngs dngsVar = duznVar2.a;
        if (dngsVar == null) {
            dngsVar = dngs.h;
        }
        try {
            return this.a.equals(new eapy(dngsVar.b, dngsVar.c + 1));
        } catch (eapb unused) {
            return false;
        }
    }
}
