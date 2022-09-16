package defpackage;

import java.security.GeneralSecurityException;
/* compiled from: PG */
/* renamed from: anpj  reason: default package */
/* loaded from: classes.dex */
public final class anpj extends anmr {
    public anpj() {
        super(anpr.class, new anph(anmv.class));
    }

    public static void i(anpt anptVar) {
        int i = anptVar.b;
        if (i >= 10) {
            if (i > 16) {
                throw new GeneralSecurityException("tag size too long");
            }
            return;
        }
        throw new GeneralSecurityException("tag size too short");
    }

    public static void j(int i) {
        if (i == 32) {
            return;
        }
        throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
    }

    @Override // defpackage.anmr
    public final anmp a() {
        return new anpi(anps.class);
    }

    @Override // defpackage.anmr
    public final /* bridge */ /* synthetic */ aoqu b(aoob aoobVar) {
        return (anpr) aopi.parseFrom(anpr.a, aoobVar, aoos.a());
    }

    @Override // defpackage.anmr
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    @Override // defpackage.anmr
    public final /* bridge */ /* synthetic */ void f(aoqu aoquVar) {
        anpr anprVar = (anpr) aoquVar;
        anus.d(anprVar.b);
        j(anprVar.c.d());
        anpt anptVar = anprVar.d;
        if (anptVar == null) {
            anptVar = anpt.a;
        }
        i(anptVar);
    }

    @Override // defpackage.anmr
    public final int h() {
        return 3;
    }
}
