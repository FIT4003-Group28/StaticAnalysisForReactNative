package defpackage;

import java.security.InvalidKeyException;
/* compiled from: PG */
/* renamed from: anot  reason: default package */
/* loaded from: classes.dex */
public final class anot extends anmr {
    public anot() {
        super(anqg.class, new anor(anmi.class));
    }

    @Override // defpackage.anmr
    public final anmp a() {
        return new anos(anqh.class);
    }

    @Override // defpackage.anmr
    public final /* bridge */ /* synthetic */ aoqu b(aoob aoobVar) {
        return (anqg) aopi.parseFrom(anqg.a, aoobVar, aoos.a());
    }

    @Override // defpackage.anmr
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }

    @Override // defpackage.anmr
    public final /* bridge */ /* synthetic */ void f(aoqu aoquVar) {
        anqg anqgVar = (anqg) aoquVar;
        anus.d(anqgVar.b);
        if (anqgVar.c.d() == 64) {
            return;
        }
        int d = anqgVar.c.d();
        StringBuilder sb = new StringBuilder(61);
        sb.append("invalid key size: ");
        sb.append(d);
        sb.append(". Valid keys must have 64 bytes.");
        throw new InvalidKeyException(sb.toString());
    }

    @Override // defpackage.anmr
    public final int h() {
        return 3;
    }
}
