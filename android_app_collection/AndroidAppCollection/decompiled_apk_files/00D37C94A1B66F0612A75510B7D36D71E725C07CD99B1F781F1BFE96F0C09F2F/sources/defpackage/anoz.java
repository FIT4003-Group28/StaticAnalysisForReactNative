package defpackage;

import java.security.GeneralSecurityException;
/* compiled from: PG */
/* renamed from: anoz  reason: default package */
/* loaded from: classes.dex */
public final class anoz extends anna {
    public static final byte[] c = new byte[0];

    public anoz() {
        super(anqr.class, new anox(anmj.class));
    }

    public static anmo i(int i, anmn anmnVar, byte[] bArr, int i2) {
        int i3;
        aopa createBuilder = anqp.a.createBuilder();
        aopa createBuilder2 = anqt.a.createBuilder();
        createBuilder2.copyOnWrite();
        int i4 = 4;
        ((anqt) createBuilder2.instance).b = anqx.d(4);
        createBuilder2.copyOnWrite();
        ((anqt) createBuilder2.instance).c = anqx.b(5);
        aoob x = aoob.x(bArr);
        createBuilder2.copyOnWrite();
        ((anqt) createBuilder2.instance).d = x;
        anqt anqtVar = (anqt) createBuilder2.mo39build();
        aopa createBuilder3 = anrc.a.createBuilder();
        String str = anmnVar.a.b;
        createBuilder3.copyOnWrite();
        str.getClass();
        ((anrc) createBuilder3.instance).b = str;
        aoob x2 = aoob.x(anmnVar.a.c.I());
        createBuilder3.copyOnWrite();
        ((anrc) createBuilder3.instance).c = x2;
        int h = answ.h(anmnVar.a.d);
        if (h == 0) {
            h = 1;
        }
        int i5 = h - 2;
        if (i5 == 1) {
            i3 = 1;
        } else if (i5 == 2) {
            i3 = 2;
        } else if (i5 == 3) {
            i3 = 3;
        } else if (i5 != 4) {
            throw new IllegalArgumentException("Unknown output prefix type");
        } else {
            i3 = 4;
        }
        int i6 = i3 - 1;
        if (i6 == 0) {
            i4 = 3;
        } else if (i6 != 1) {
            i4 = i6 != 2 ? 6 : 5;
        }
        createBuilder3.copyOnWrite();
        ((anrc) createBuilder3.instance).d = answ.g(i4);
        anrc anrcVar = (anrc) createBuilder3.mo39build();
        aopa createBuilder4 = anqo.a.createBuilder();
        createBuilder4.copyOnWrite();
        anrcVar.getClass();
        ((anqo) createBuilder4.instance).b = anrcVar;
        anqo anqoVar = (anqo) createBuilder4.mo39build();
        aopa createBuilder5 = anqq.a.createBuilder();
        createBuilder5.copyOnWrite();
        anqtVar.getClass();
        ((anqq) createBuilder5.instance).b = anqtVar;
        createBuilder5.copyOnWrite();
        anqoVar.getClass();
        ((anqq) createBuilder5.instance).c = anqoVar;
        createBuilder5.copyOnWrite();
        ((anqq) createBuilder5.instance).d = anqx.g(i);
        anqq anqqVar = (anqq) createBuilder5.mo39build();
        createBuilder.copyOnWrite();
        anqqVar.getClass();
        ((anqp) createBuilder.instance).b = anqqVar;
        return new anmo((anqp) createBuilder.mo39build(), i2);
    }

    @Override // defpackage.anmr
    public final anmp a() {
        return new anoy(anqp.class);
    }

    @Override // defpackage.anmr
    public final /* bridge */ /* synthetic */ aoqu b(aoob aoobVar) {
        return (anqr) aopi.parseFrom(anqr.a, aoobVar, aoos.a());
    }

    @Override // defpackage.anmr
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
    }

    @Override // defpackage.anmr
    public final /* bridge */ /* synthetic */ void f(aoqu aoquVar) {
        anqr anqrVar = (anqr) aoquVar;
        if (!anqrVar.d.H()) {
            anus.d(anqrVar.b);
            anqs anqsVar = anqrVar.c;
            if (anqsVar == null) {
                anqsVar = anqs.a;
            }
            anqq anqqVar = anqsVar.c;
            if (anqqVar == null) {
                anqqVar = anqq.a;
            }
            anpf.a(anqqVar);
            return;
        }
        throw new GeneralSecurityException("invalid ECIES private key");
    }

    @Override // defpackage.anmr
    public final int h() {
        return 4;
    }
}
