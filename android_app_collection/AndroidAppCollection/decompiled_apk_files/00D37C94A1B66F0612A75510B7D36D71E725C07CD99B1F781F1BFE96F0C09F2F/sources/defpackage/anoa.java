package defpackage;

import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
/* compiled from: PG */
/* renamed from: anoa  reason: default package */
/* loaded from: classes.dex */
public final class anoa extends anmr {
    public anoa() {
        super(anqe.class, new anny(anme.class));
    }

    public static boolean i() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }

    public static anmo j(int i, int i2) {
        aopa createBuilder = anqf.a.createBuilder();
        createBuilder.copyOnWrite();
        ((anqf) createBuilder.instance).b = i;
        return new anmo((anqf) createBuilder.mo39build(), i2);
    }

    @Override // defpackage.anmr
    public final anmp a() {
        return new annz(anqf.class);
    }

    @Override // defpackage.anmr
    public final /* bridge */ /* synthetic */ aoqu b(aoob aoobVar) {
        return (anqe) aopi.parseFrom(anqe.a, aoobVar, aoos.a());
    }

    @Override // defpackage.anmr
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }

    @Override // defpackage.anmr
    public final /* bridge */ /* synthetic */ void f(aoqu aoquVar) {
        anqe anqeVar = (anqe) aoquVar;
        anus.d(anqeVar.b);
        anus.a(anqeVar.c.d());
    }

    @Override // defpackage.anmr
    public final int h() {
        return 3;
    }
}
