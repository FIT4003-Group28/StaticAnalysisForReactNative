package defpackage;

import java.math.BigInteger;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ansp  reason: default package */
/* loaded from: classes.dex */
public final class ansp extends anmr {
    public ansp() {
        super(anrq.class, new anso(annc.class));
    }

    @Override // defpackage.anmr
    public final /* bridge */ /* synthetic */ aoqu b(aoob aoobVar) {
        return (anrq) aopi.parseFrom(anrq.a, aoobVar, aoos.a());
    }

    @Override // defpackage.anmr
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey";
    }

    @Override // defpackage.anmr
    public final /* bridge */ /* synthetic */ void f(aoqu aoquVar) {
        anrq anrqVar = (anrq) aoquVar;
        anus.d(anrqVar.b);
        anus.b(new BigInteger(1, anrqVar.d.I()).bitLength());
        anus.c(new BigInteger(1, anrqVar.e.I()));
        anro anroVar = anrqVar.c;
        if (anroVar == null) {
            anroVar = anro.a;
        }
        answ.b(anroVar);
    }

    @Override // defpackage.anmr
    public final int g() {
        return 2;
    }

    @Override // defpackage.anmr
    public final int h() {
        return 5;
    }
}
