package defpackage;
/* compiled from: PG */
/* renamed from: anok  reason: default package */
/* loaded from: classes.dex */
public final class anok extends anmr {
    public anok() {
        super(anrk.class, new anoi(anme.class));
    }

    @Override // defpackage.anmr
    public final anmp a() {
        return new anoj(anrl.class);
    }

    @Override // defpackage.anmr
    public final /* bridge */ /* synthetic */ aoqu b(aoob aoobVar) {
        return (anrk) aopi.parseFrom(anrk.a, aoobVar, aoos.a());
    }

    @Override // defpackage.anmr
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
    }

    @Override // defpackage.anmr
    public final /* bridge */ /* synthetic */ void f(aoqu aoquVar) {
        anus.d(((anrk) aoquVar).b);
    }

    @Override // defpackage.anmr
    public final int h() {
        return 6;
    }
}
