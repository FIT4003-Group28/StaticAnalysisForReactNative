package defpackage;
/* compiled from: PG */
/* renamed from: anpb  reason: default package */
/* loaded from: classes.dex */
final class anpb extends anmr {
    public anpb() {
        super(anqs.class, new anpa(anmk.class));
    }

    @Override // defpackage.anmr
    public final /* bridge */ /* synthetic */ aoqu b(aoob aoobVar) {
        return (anqs) aopi.parseFrom(anqs.a, aoobVar, aoos.a());
    }

    @Override // defpackage.anmr
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey";
    }

    @Override // defpackage.anmr
    public final /* bridge */ /* synthetic */ void f(aoqu aoquVar) {
        anqs anqsVar = (anqs) aoquVar;
        anus.d(anqsVar.b);
        anqq anqqVar = anqsVar.c;
        if (anqqVar == null) {
            anqqVar = anqq.a;
        }
        anpf.a(anqqVar);
    }

    @Override // defpackage.anmr
    public final int h() {
        return 5;
    }
}
