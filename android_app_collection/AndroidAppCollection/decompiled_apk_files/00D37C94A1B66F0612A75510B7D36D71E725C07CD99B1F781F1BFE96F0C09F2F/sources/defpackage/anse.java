package defpackage;

import java.security.GeneralSecurityException;
/* compiled from: PG */
/* renamed from: anse  reason: default package */
/* loaded from: classes.dex */
public final class anse extends anna {
    public anse() {
        super(anqv.class, new ansc(annb.class));
    }

    @Override // defpackage.anmr
    public final anmp a() {
        return new ansd(anqu.class);
    }

    @Override // defpackage.anmr
    public final /* bridge */ /* synthetic */ aoqu b(aoob aoobVar) {
        return (anqv) aopi.parseFrom(anqv.a, aoobVar, aoos.a());
    }

    @Override // defpackage.anmr
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.Ed25519PrivateKey";
    }

    @Override // defpackage.anmr
    public final /* bridge */ /* synthetic */ void f(aoqu aoquVar) {
        anqv anqvVar = (anqv) aoquVar;
        anus.d(anqvVar.b);
        new ansg();
        anqw anqwVar = anqvVar.d;
        if (anqwVar == null) {
            anqwVar = anqw.a;
        }
        ansg.i(anqwVar);
        if (anqvVar.c.d() == 32) {
            return;
        }
        throw new GeneralSecurityException("invalid Ed25519 private key: incorrect key length");
    }

    @Override // defpackage.anmr
    public final int h() {
        return 4;
    }
}
