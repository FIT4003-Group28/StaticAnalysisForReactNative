package defpackage;
/* compiled from: PG */
/* renamed from: anog  reason: default package */
/* loaded from: classes.dex */
public final class anog extends anmr {
    public anog() {
        super(anri.class, new anoe(anme.class));
    }

    @Override // defpackage.anmr
    public final anmp a() {
        return new anof(anrj.class);
    }

    @Override // defpackage.anmr
    public final /* bridge */ /* synthetic */ aoqu b(aoob aoobVar) {
        return (anri) aopi.parseFrom(anri.a, aoobVar, aoos.a());
    }

    @Override // defpackage.anmr
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
    }

    @Override // defpackage.anmr
    public final /* bridge */ /* synthetic */ void f(aoqu aoquVar) {
        anus.d(((anri) aoquVar).b);
    }

    @Override // defpackage.anmr
    public final int h() {
        return 6;
    }
}
