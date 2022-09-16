package defpackage;

import android.content.SharedPreferences;
import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* compiled from: PG */
/* renamed from: zdu  reason: default package */
/* loaded from: classes4.dex */
public final class zdu {
    public final axnm a;

    public zdu(axnm axnmVar) {
        this.a = axnmVar;
    }

    public static byte[] c(byte[] bArr, byte[] bArr2, Key key) {
        byte[] bArr3 = (byte[]) bArr2.clone();
        try {
            e(bArr3, bArr3.length, key, new IvParameterSpec(bArr), 2);
            return bArr3;
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
            throw new RuntimeException("Unable to decrypt Disco key.", e);
        }
    }

    public static byte[] d(byte[] bArr, byte[] bArr2, Key key) {
        byte[] bArr3 = (byte[]) bArr2.clone();
        try {
            e(bArr3, bArr3.length, key, new IvParameterSpec(bArr), 1);
            return bArr3;
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
            throw new RuntimeException("Unable to encrypt Disco key.", e);
        }
    }

    private static void e(byte[] bArr, int i, Key key, IvParameterSpec ivParameterSpec, int i2) {
        byte[] bArr2 = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr2[i3] = bArr[i3];
        }
        Cipher cipher = Cipher.getInstance("AES/CTR/NoPadding");
        ByteBuffer wrap = ByteBuffer.wrap(ivParameterSpec.getIV());
        wrap.order(ByteOrder.BIG_ENDIAN);
        wrap.putLong(8, wrap.getLong(8));
        cipher.init(i2, key, new IvParameterSpec(wrap.array()));
        byte[] doFinal = cipher.doFinal(bArr2);
        for (int i4 = 0; i4 < i; i4++) {
            bArr[i4] = doFinal[i4];
        }
    }

    public final Key a() {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            keyGenerator.init(128, (SecureRandom) this.a.get());
            return keyGenerator.generateKey();
        } catch (NoSuchAlgorithmException e) {
            zep.d("AES not recognized as a supported algorithm", e);
            return null;
        }
    }

    public final Key b(SharedPreferences sharedPreferences) {
        if (!sharedPreferences.contains("downloads_encryption_key")) {
            sharedPreferences.edit().putString("downloads_encryption_key", Base64.encodeToString(a().getEncoded(), 0)).apply();
        }
        return new SecretKeySpec(Base64.decode(sharedPreferences.getString("downloads_encryption_key", null), 0), "AES");
    }
}
