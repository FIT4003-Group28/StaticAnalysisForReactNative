package defpackage;

import java.security.GeneralSecurityException;
/* compiled from: PG */
/* renamed from: anod  reason: default package */
/* loaded from: classes.dex */
public final class anod extends anmr {
    public anod() {
        super(anqi.class, new anob(anme.class));
    }

    @Override // defpackage.anmr
    public final anmp a() {
        return new anoc(anqj.class);
    }

    @Override // defpackage.anmr
    public final /* bridge */ /* synthetic */ aoqu b(aoob aoobVar) {
        return (anqi) aopi.parseFrom(anqi.a, aoobVar, aoos.a());
    }

    @Override // defpackage.anmr
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    @Override // defpackage.anmr
    public final /* bridge */ /* synthetic */ void f(aoqu aoquVar) {
        anqi anqiVar = (anqi) aoquVar;
        anus.d(anqiVar.b);
        if (anqiVar.c.d() == 32) {
            return;
        }
        throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
    }

    @Override // defpackage.anmr
    public final int h() {
        return 3;
    }
}
