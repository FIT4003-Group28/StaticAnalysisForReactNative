package defpackage;

import android.net.Uri;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
/* compiled from: PG */
/* renamed from: acz  reason: default package */
/* loaded from: classes.dex */
public class acz {
    public static ads d() {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            KeyGenParameterSpec.Builder a = aeb.a("androidxBiometric", 3);
            aeb.d(a);
            aeb.e(a);
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            aeb.c(keyGenerator, aeb.b(a));
            keyGenerator.generateKey();
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            cipher.init(1, (SecretKey) keyStore.getKey("androidxBiometric", null));
            return new ads(cipher);
        } catch (IOException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableKeyException | CertificateException | NoSuchPaddingException e) {
            Log.w("CryptoObjectUtils", "Failed to create fake crypto object.", e);
            return null;
        }
    }

    public static boolean e(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    public static boolean f(int i, int i2) {
        return i != Integer.MIN_VALUE && i2 != Integer.MIN_VALUE && i <= 512 && i2 <= 384;
    }

    public static boolean g(Uri uri) {
        return uri.getPathSegments().contains("video");
    }

    public static int h(List list, InputStream inputStream, clb clbVar) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new cpz(inputStream, clbVar);
        }
        inputStream.mark(5242880);
        return i(list, new chu(inputStream, clbVar));
    }

    public static int i(List list, chw chwVar) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int a = chwVar.a((chp) list.get(i));
            if (a != -1) {
                return a;
            }
        }
        return -1;
    }

    public static ImageHeaderParser$ImageType j(List list, ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        return l(list, new chr(byteBuffer));
    }

    public static ImageHeaderParser$ImageType k(List list, InputStream inputStream, clb clbVar) {
        if (inputStream == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new cpz(inputStream, clbVar);
        }
        inputStream.mark(5242880);
        return l(list, new chq(inputStream));
    }

    public static ImageHeaderParser$ImageType l(List list, chx chxVar) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ImageHeaderParser$ImageType a = chxVar.a((chp) list.get(i));
            if (a != ImageHeaderParser$ImageType.UNKNOWN) {
                return a;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    public void a(int i, CharSequence charSequence) {
    }

    public void b() {
    }

    public void c(adr adrVar) {
    }
}
