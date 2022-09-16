package defpackage;
/* compiled from: PG */
/* renamed from: annx  reason: default package */
/* loaded from: classes.dex */
public final class annx extends anmr {
    public annx() {
        super(anqc.class, new annv(anme.class));
    }

    public static anmo i(int i, int i2) {
        aopa createBuilder = anqd.a.createBuilder();
        createBuilder.copyOnWrite();
        ((anqd) createBuilder.instance).b = i;
        return new anmo((anqd) createBuilder.mo39build(), i2);
    }

    @Override // defpackage.anmr
    public final anmp a() {
        return new annw(anqd.class);
    }

    @Override // defpackage.anmr
    public final /* bridge */ /* synthetic */ aoqu b(aoob aoobVar) {
        return (anqc) aopi.parseFrom(anqc.a, aoobVar, aoos.a());
    }

    @Override // defpackage.anmr
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    @Override // defpackage.anmr
    public final /* bridge */ /* synthetic */ void f(aoqu aoquVar) {
        anqc anqcVar = (anqc) aoquVar;
        anus.d(anqcVar.b);
        anus.a(anqcVar.c.d());
    }

    @Override // defpackage.anmr
    public final int g() {
        return 2;
    }

    @Override // defpackage.anmr
    public final int h() {
        return 3;
    }
}
