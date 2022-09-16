package defpackage;

import java.math.BigInteger;
/* compiled from: PG */
/* renamed from: anss  reason: default package */
/* loaded from: classes.dex */
public final class anss extends anna {
    public anss() {
        super(anrt.class, new ansq(annb.class));
    }

    public static anrr i(int i, int i2, int i3, int i4, BigInteger bigInteger) {
        aopa createBuilder = anrs.a.createBuilder();
        createBuilder.copyOnWrite();
        ((anrs) createBuilder.instance).b = anqx.b(i);
        createBuilder.copyOnWrite();
        ((anrs) createBuilder.instance).c = anqx.b(i2);
        createBuilder.copyOnWrite();
        ((anrs) createBuilder.instance).d = i3;
        anrs anrsVar = (anrs) createBuilder.mo39build();
        aopa createBuilder2 = anrr.a.createBuilder();
        createBuilder2.copyOnWrite();
        anrsVar.getClass();
        ((anrr) createBuilder2.instance).b = anrsVar;
        createBuilder2.copyOnWrite();
        ((anrr) createBuilder2.instance).c = i4;
        aoob x = aoob.x(bigInteger.toByteArray());
        createBuilder2.copyOnWrite();
        ((anrr) createBuilder2.instance).d = x;
        return (anrr) createBuilder2.mo39build();
    }

    @Override // defpackage.anmr
    public final anmp a() {
        return new ansr(anrr.class);
    }

    @Override // defpackage.anmr
    public final /* bridge */ /* synthetic */ aoqu b(aoob aoobVar) {
        return (anrt) aopi.parseFrom(anrt.a, aoobVar, aoos.a());
    }

    @Override // defpackage.anmr
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey";
    }

    @Override // defpackage.anmr
    public final /* bridge */ /* synthetic */ void f(aoqu aoquVar) {
        anrt anrtVar = (anrt) aoquVar;
        anus.d(anrtVar.b);
        anru anruVar = anrtVar.c;
        if (anruVar == null) {
            anruVar = anru.a;
        }
        anus.b(new BigInteger(1, anruVar.d.I()).bitLength());
        anru anruVar2 = anrtVar.c;
        if (anruVar2 == null) {
            anruVar2 = anru.a;
        }
        anus.c(new BigInteger(1, anruVar2.e.I()));
        anru anruVar3 = anrtVar.c;
        if (anruVar3 == null) {
            anruVar3 = anru.a;
        }
        anrs anrsVar = anruVar3.c;
        if (anrsVar == null) {
            anrsVar = anrs.a;
        }
        answ.c(anrsVar);
    }

    @Override // defpackage.anmr
    public final int h() {
        return 4;
    }
}
