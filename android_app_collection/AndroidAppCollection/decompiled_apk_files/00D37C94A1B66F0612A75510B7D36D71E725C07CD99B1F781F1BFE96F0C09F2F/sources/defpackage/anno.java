package defpackage;
/* compiled from: PG */
/* renamed from: anno  reason: default package */
/* loaded from: classes.dex */
public final class anno extends anmr {
    public anno() {
        super(anpu.class, new annm(anme.class));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ anmo i(int i, int i2, int i3) {
        aopa createBuilder = anpx.a.createBuilder();
        aopa createBuilder2 = anpy.a.createBuilder();
        createBuilder2.copyOnWrite();
        ((anpy) createBuilder2.instance).b = 16;
        anpy anpyVar = (anpy) createBuilder2.mo39build();
        createBuilder.copyOnWrite();
        anpyVar.getClass();
        ((anpx) createBuilder.instance).b = anpyVar;
        createBuilder.copyOnWrite();
        ((anpx) createBuilder.instance).c = i;
        anpx anpxVar = (anpx) createBuilder.mo39build();
        aopa createBuilder3 = anqz.a.createBuilder();
        aopa createBuilder4 = anra.a.createBuilder();
        createBuilder4.copyOnWrite();
        ((anra) createBuilder4.instance).b = anqx.b(5);
        createBuilder4.copyOnWrite();
        ((anra) createBuilder4.instance).c = i2;
        anra anraVar = (anra) createBuilder4.mo39build();
        createBuilder3.copyOnWrite();
        anraVar.getClass();
        ((anqz) createBuilder3.instance).b = anraVar;
        createBuilder3.copyOnWrite();
        ((anqz) createBuilder3.instance).c = 32;
        anqz anqzVar = (anqz) createBuilder3.mo39build();
        aopa createBuilder5 = anpv.a.createBuilder();
        createBuilder5.copyOnWrite();
        anpxVar.getClass();
        ((anpv) createBuilder5.instance).b = anpxVar;
        createBuilder5.copyOnWrite();
        anqzVar.getClass();
        ((anpv) createBuilder5.instance).c = anqzVar;
        return new anmo((anpv) createBuilder5.mo39build(), i3);
    }

    @Override // defpackage.anmr
    public final anmp a() {
        return new annn(anpv.class);
    }

    @Override // defpackage.anmr
    public final /* bridge */ /* synthetic */ aoqu b(aoob aoobVar) {
        return (anpu) aopi.parseFrom(anpu.a, aoobVar, aoos.a());
    }

    @Override // defpackage.anmr
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    @Override // defpackage.anmr
    public final /* bridge */ /* synthetic */ void f(aoqu aoquVar) {
        anpu anpuVar = (anpu) aoquVar;
        anus.d(anpuVar.b);
        new annr();
        anpw anpwVar = anpuVar.c;
        if (anpwVar == null) {
            anpwVar = anpw.a;
        }
        annr.j(anpwVar);
        new anpm();
        anqy anqyVar = anpuVar.d;
        if (anqyVar == null) {
            anqyVar = anqy.a;
        }
        anpm.j(anqyVar);
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
