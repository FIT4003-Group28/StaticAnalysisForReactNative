package defpackage;

import java.math.BigInteger;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ansu  reason: default package */
/* loaded from: classes.dex */
public final class ansu extends anmr {
    public ansu() {
        super(anru.class, new anst(annc.class));
    }

    @Override // defpackage.anmr
    public final /* bridge */ /* synthetic */ aoqu b(aoob aoobVar) {
        return (anru) aopi.parseFrom(anru.a, aoobVar, aoos.a());
    }

    @Override // defpackage.anmr
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey";
    }

    @Override // defpackage.anmr
    public final /* bridge */ /* synthetic */ void f(aoqu aoquVar) {
        anru anruVar = (anru) aoquVar;
        anus.d(anruVar.b);
        anus.b(new BigInteger(1, anruVar.d.I()).bitLength());
        anus.c(new BigInteger(1, anruVar.e.I()));
        anrs anrsVar = anruVar.c;
        if (anrsVar == null) {
            anrsVar = anrs.a;
        }
        answ.c(anrsVar);
    }

    @Override // defpackage.anmr
    public final int h() {
        return 5;
    }
}
