package defpackage;

import java.math.BigInteger;
/* compiled from: PG */
/* renamed from: ansn  reason: default package */
/* loaded from: classes.dex */
public final class ansn extends anna {
    public ansn() {
        super(anrp.class, new ansl(annb.class));
    }

    public static anrn i(int i, int i2, BigInteger bigInteger) {
        aopa createBuilder = anro.a.createBuilder();
        createBuilder.copyOnWrite();
        ((anro) createBuilder.instance).b = anqx.b(i);
        anro anroVar = (anro) createBuilder.mo39build();
        aopa createBuilder2 = anrn.a.createBuilder();
        createBuilder2.copyOnWrite();
        anroVar.getClass();
        ((anrn) createBuilder2.instance).b = anroVar;
        createBuilder2.copyOnWrite();
        ((anrn) createBuilder2.instance).c = i2;
        aoob x = aoob.x(bigInteger.toByteArray());
        createBuilder2.copyOnWrite();
        ((anrn) createBuilder2.instance).d = x;
        return (anrn) createBuilder2.mo39build();
    }

    @Override // defpackage.anmr
    public final anmp a() {
        return new ansm(anrn.class);
    }

    @Override // defpackage.anmr
    public final /* bridge */ /* synthetic */ aoqu b(aoob aoobVar) {
        return (anrp) aopi.parseFrom(anrp.a, aoobVar, aoos.a());
    }

    @Override // defpackage.anmr
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey";
    }

    @Override // defpackage.anmr
    public final /* bridge */ /* synthetic */ void f(aoqu aoquVar) {
        anrp anrpVar = (anrp) aoquVar;
        anus.d(anrpVar.b);
        anrq anrqVar = anrpVar.c;
        if (anrqVar == null) {
            anrqVar = anrq.a;
        }
        anus.b(new BigInteger(1, anrqVar.d.I()).bitLength());
        anrq anrqVar2 = anrpVar.c;
        if (anrqVar2 == null) {
            anrqVar2 = anrq.a;
        }
        anus.c(new BigInteger(1, anrqVar2.e.I()));
        anrq anrqVar3 = anrpVar.c;
        if (anrqVar3 == null) {
            anrqVar3 = anrq.a;
        }
        anro anroVar = anrqVar3.c;
        if (anroVar == null) {
            anroVar = anro.a;
        }
        answ.b(anroVar);
    }

    @Override // defpackage.anmr
    public final int g() {
        return 2;
    }

    @Override // defpackage.anmr
    public final int h() {
        return 4;
    }
}
