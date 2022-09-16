package defpackage;

import java.security.GeneralSecurityException;
/* compiled from: PG */
/* renamed from: annu  reason: default package */
/* loaded from: classes.dex */
public final class annu extends anmr {
    public annu() {
        super(anpz.class, new anns(anme.class));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ anmo i(int i, int i2) {
        aopa createBuilder = anqa.a.createBuilder();
        createBuilder.copyOnWrite();
        ((anqa) createBuilder.instance).c = i;
        aopa createBuilder2 = anqb.a.createBuilder();
        createBuilder2.copyOnWrite();
        ((anqb) createBuilder2.instance).b = 16;
        anqb anqbVar = (anqb) createBuilder2.mo39build();
        createBuilder.copyOnWrite();
        anqbVar.getClass();
        ((anqa) createBuilder.instance).b = anqbVar;
        return new anmo((anqa) createBuilder.mo39build(), i2);
    }

    @Override // defpackage.anmr
    public final anmp a() {
        return new annt(anqa.class);
    }

    @Override // defpackage.anmr
    public final /* bridge */ /* synthetic */ aoqu b(aoob aoobVar) {
        return (anpz) aopi.parseFrom(anpz.a, aoobVar, aoos.a());
    }

    @Override // defpackage.anmr
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    @Override // defpackage.anmr
    public final /* bridge */ /* synthetic */ void f(aoqu aoquVar) {
        anpz anpzVar = (anpz) aoquVar;
        anus.d(anpzVar.b);
        anus.a(anpzVar.d.d());
        anqb anqbVar = anpzVar.c;
        if (anqbVar == null) {
            anqbVar = anqb.a;
        }
        if (anqbVar.b != 12) {
            anqb anqbVar2 = anpzVar.c;
            if (anqbVar2 == null) {
                anqbVar2 = anqb.a;
            }
            if (anqbVar2.b != 16) {
                throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
            }
        }
    }

    @Override // defpackage.anmr
    public final int h() {
        return 3;
    }
}
