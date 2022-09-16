package defpackage;

import java.security.GeneralSecurityException;
/* compiled from: PG */
/* renamed from: anon  reason: default package */
/* loaded from: classes.dex */
public final class anon extends anmr {
    public anon() {
        super(anrv.class, new anol(anme.class));
    }

    @Override // defpackage.anmr
    public final anmp a() {
        return new anom(anrw.class);
    }

    @Override // defpackage.anmr
    public final /* bridge */ /* synthetic */ aoqu b(aoob aoobVar) {
        return (anrv) aopi.parseFrom(anrv.a, aoobVar, aoos.a());
    }

    @Override // defpackage.anmr
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    @Override // defpackage.anmr
    public final /* bridge */ /* synthetic */ void f(aoqu aoquVar) {
        anrv anrvVar = (anrv) aoquVar;
        anus.d(anrvVar.b);
        if (anrvVar.c.d() == 32) {
            return;
        }
        throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
    }

    @Override // defpackage.anmr
    public final int h() {
        return 3;
    }
}
