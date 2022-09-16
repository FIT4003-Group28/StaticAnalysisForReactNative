package defpackage;

import java.security.GeneralSecurityException;
/* compiled from: PG */
/* renamed from: annr  reason: default package */
/* loaded from: classes.dex */
public final class annr extends anmr {
    public annr() {
        super(anpw.class, new annp(anug.class));
    }

    public static final void i(anpy anpyVar) {
        int i = anpyVar.b;
        if (i < 12 || i > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    public static final void j(anpw anpwVar) {
        anus.d(anpwVar.b);
        anus.a(anpwVar.d.d());
        anpy anpyVar = anpwVar.c;
        if (anpyVar == null) {
            anpyVar = anpy.a;
        }
        i(anpyVar);
    }

    @Override // defpackage.anmr
    public final anmp a() {
        return new annq(anpx.class);
    }

    @Override // defpackage.anmr
    public final /* bridge */ /* synthetic */ aoqu b(aoob aoobVar) {
        return (anpw) aopi.parseFrom(anpw.a, aoobVar, aoos.a());
    }

    @Override // defpackage.anmr
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    @Override // defpackage.anmr
    public final /* bridge */ /* synthetic */ void f(aoqu aoquVar) {
        j((anpw) aoquVar);
    }

    @Override // defpackage.anmr
    public final int h() {
        return 3;
    }
}
