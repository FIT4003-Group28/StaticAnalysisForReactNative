package defpackage;

import java.security.GeneralSecurityException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ansg  reason: default package */
/* loaded from: classes.dex */
public final class ansg extends anmr {
    public ansg() {
        super(anqw.class, new ansf(annc.class));
    }

    public static final void i(anqw anqwVar) {
        anus.d(anqwVar.b);
        if (anqwVar.c.d() == 32) {
            return;
        }
        throw new GeneralSecurityException("invalid Ed25519 public key: incorrect key length");
    }

    @Override // defpackage.anmr
    public final /* bridge */ /* synthetic */ aoqu b(aoob aoobVar) {
        return (anqw) aopi.parseFrom(anqw.a, aoobVar, aoos.a());
    }

    @Override // defpackage.anmr
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.Ed25519PublicKey";
    }

    @Override // defpackage.anmr
    public final /* bridge */ /* synthetic */ void f(aoqu aoquVar) {
        i((anqw) aoquVar);
    }

    @Override // defpackage.anmr
    public final int h() {
        return 5;
    }
}
