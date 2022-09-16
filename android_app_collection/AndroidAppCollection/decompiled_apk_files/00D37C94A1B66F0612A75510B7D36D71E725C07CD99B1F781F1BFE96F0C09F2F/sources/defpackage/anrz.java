package defpackage;
/* compiled from: PG */
/* renamed from: anrz  reason: default package */
/* loaded from: classes.dex */
public final class anrz extends anna {
    public anrz() {
        super(anqm.class, new anrx(annb.class));
    }

    public static anmo i(int i, int i2, int i3, int i4) {
        aopa createBuilder = anql.a.createBuilder();
        createBuilder.copyOnWrite();
        ((anql) createBuilder.instance).b = anqx.b(i);
        createBuilder.copyOnWrite();
        ((anql) createBuilder.instance).c = anqx.d(i2);
        createBuilder.copyOnWrite();
        ((anql) createBuilder.instance).d = i3 - 2;
        anql anqlVar = (anql) createBuilder.mo39build();
        aopa createBuilder2 = anqk.a.createBuilder();
        createBuilder2.copyOnWrite();
        anqlVar.getClass();
        ((anqk) createBuilder2.instance).b = anqlVar;
        return new anmo((anqk) createBuilder2.mo39build(), i4);
    }

    @Override // defpackage.anmr
    public final anmp a() {
        return new anry(anqk.class);
    }

    @Override // defpackage.anmr
    public final /* bridge */ /* synthetic */ aoqu b(aoob aoobVar) {
        return (anqm) aopi.parseFrom(anqm.a, aoobVar, aoos.a());
    }

    @Override // defpackage.anmr
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.EcdsaPrivateKey";
    }

    @Override // defpackage.anmr
    public final /* bridge */ /* synthetic */ void f(aoqu aoquVar) {
        anqm anqmVar = (anqm) aoquVar;
        anus.d(anqmVar.b);
        anqn anqnVar = anqmVar.c;
        if (anqnVar == null) {
            anqnVar = anqn.a;
        }
        anql anqlVar = anqnVar.c;
        if (anqlVar == null) {
            anqlVar = anql.a;
        }
        answ.a(anqlVar);
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
