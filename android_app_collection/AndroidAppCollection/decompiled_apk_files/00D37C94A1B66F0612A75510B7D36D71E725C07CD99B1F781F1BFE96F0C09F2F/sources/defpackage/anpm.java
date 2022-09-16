package defpackage;

import java.security.GeneralSecurityException;
/* compiled from: PG */
/* renamed from: anpm  reason: default package */
/* loaded from: classes.dex */
public final class anpm extends anmr {
    public anpm() {
        super(anqy.class, new anpk(anmv.class));
    }

    public static void i(anra anraVar) {
        if (anraVar.c >= 10) {
            int c = anqx.c(anraVar.b);
            if (c == 0) {
                c = 1;
            }
            int i = c - 2;
            if (i == 1) {
                if (anraVar.c > 20) {
                    throw new GeneralSecurityException("tag size too big");
                }
                return;
            } else if (i == 2) {
                if (anraVar.c > 48) {
                    throw new GeneralSecurityException("tag size too big");
                }
                return;
            } else if (i == 3) {
                if (anraVar.c > 32) {
                    throw new GeneralSecurityException("tag size too big");
                }
                return;
            } else if (i == 4) {
                if (anraVar.c > 64) {
                    throw new GeneralSecurityException("tag size too big");
                }
                return;
            } else if (i == 5) {
                if (anraVar.c > 28) {
                    throw new GeneralSecurityException("tag size too big");
                }
                return;
            } else {
                throw new GeneralSecurityException("unknown hash type");
            }
        }
        throw new GeneralSecurityException("tag size too small");
    }

    public static final void j(anqy anqyVar) {
        anus.d(anqyVar.b);
        if (anqyVar.d.d() >= 16) {
            anra anraVar = anqyVar.c;
            if (anraVar == null) {
                anraVar = anra.a;
            }
            i(anraVar);
            return;
        }
        throw new GeneralSecurityException("key too short");
    }

    public static anmo k(int i, int i2, int i3, int i4) {
        aopa createBuilder = anqz.a.createBuilder();
        aopa createBuilder2 = anra.a.createBuilder();
        createBuilder2.copyOnWrite();
        ((anra) createBuilder2.instance).b = anqx.b(i3);
        createBuilder2.copyOnWrite();
        ((anra) createBuilder2.instance).c = i2;
        anra anraVar = (anra) createBuilder2.mo39build();
        createBuilder.copyOnWrite();
        anraVar.getClass();
        ((anqz) createBuilder.instance).b = anraVar;
        createBuilder.copyOnWrite();
        ((anqz) createBuilder.instance).c = i;
        return new anmo((anqz) createBuilder.mo39build(), i4);
    }

    @Override // defpackage.anmr
    public final anmp a() {
        return new anpl(anqz.class);
    }

    @Override // defpackage.anmr
    public final /* bridge */ /* synthetic */ aoqu b(aoob aoobVar) {
        return (anqy) aopi.parseFrom(anqy.a, aoobVar, aoos.a());
    }

    @Override // defpackage.anmr
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    @Override // defpackage.anmr
    public final /* bridge */ /* synthetic */ void f(aoqu aoquVar) {
        j((anqy) aoquVar);
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
