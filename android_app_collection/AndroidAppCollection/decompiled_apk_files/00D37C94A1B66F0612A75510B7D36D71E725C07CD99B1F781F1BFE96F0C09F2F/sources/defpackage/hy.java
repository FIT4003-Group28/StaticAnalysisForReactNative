package defpackage;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.chromium.net.PrivateKeyType;
/* compiled from: PG */
/* renamed from: hy  reason: default package */
/* loaded from: classes3.dex */
public final class hy {
    public static void A(ByteBuffer byteBuffer, String str) {
        byteBuffer.put(hx.k(str));
        z(byteBuffer, 0);
    }

    public static double B(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        double d = ((bArr[0] << 24) & (-16777216)) | ((bArr[1] << 16) & 16711680) | ((bArr[2] << 8) & 65280) | (bArr[3] & 255);
        Double.isNaN(d);
        return d / 1.073741824E9d;
    }

    public static double C(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        double d = ((bArr[0] << 24) & (-16777216)) | ((bArr[1] << 16) & 16711680) | ((bArr[2] << 8) & 65280) | (bArr[3] & 255);
        Double.isNaN(d);
        return d / 65536.0d;
    }

    public static float D(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[2];
        byteBuffer.get(bArr);
        return ((short) (((short) ((bArr[0] << 8) & 65280)) | (bArr[1] & 255))) / 256.0f;
    }

    public static int E(byte b) {
        return b < 0 ? b + 256 : b;
    }

    public static int F(ByteBuffer byteBuffer) {
        return (E(byteBuffer.get()) << 8) + E(byteBuffer.get());
    }

    public static int G(ByteBuffer byteBuffer) {
        return (F(byteBuffer) << 8) + E(byteBuffer.get());
    }

    public static int H(ByteBuffer byteBuffer) {
        return E(byteBuffer.get());
    }

    public static long I(ByteBuffer byteBuffer) {
        long j = byteBuffer.getInt();
        return j < 0 ? j + 4294967296L : j;
    }

    public static long J(ByteBuffer byteBuffer) {
        long I = I(byteBuffer) << 32;
        if (I < 0) {
            throw new RuntimeException("I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt");
        }
        return I + I(byteBuffer);
    }

    public static String K(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        try {
            return new String(bArr, "ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    public static String L(ByteBuffer byteBuffer) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            byte b = byteBuffer.get();
            if (b != 0) {
                byteArrayOutputStream.write(b);
            } else {
                return hx.j(byteArrayOutputStream.toByteArray());
            }
        }
    }

    public static String M(ByteBuffer byteBuffer, int i) {
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        return hx.j(bArr);
    }

    public static Object N(Object obj) {
        R(obj, "Argument must not be null");
        return obj;
    }

    public static void O(boolean z, String str) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(str);
    }

    public static void P(String str) {
        if (!TextUtils.isEmpty(str)) {
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }

    public static void Q(Collection collection) {
        if (!collection.isEmpty()) {
            return;
        }
        throw new IllegalArgumentException("Must not be empty.");
    }

    public static void R(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw new NullPointerException(str);
    }

    public static Bitmap a(MediaDescription mediaDescription) {
        return mediaDescription.getIconBitmap();
    }

    public static MediaDescription.Builder b() {
        return new MediaDescription.Builder();
    }

    public static MediaDescription c(MediaDescription.Builder builder) {
        return builder.build();
    }

    public static Uri d(MediaDescription mediaDescription) {
        return mediaDescription.getIconUri();
    }

    public static Bundle e(MediaDescription mediaDescription) {
        return mediaDescription.getExtras();
    }

    public static CharSequence f(MediaDescription mediaDescription) {
        return mediaDescription.getDescription();
    }

    public static CharSequence g(MediaDescription mediaDescription) {
        return mediaDescription.getSubtitle();
    }

    public static CharSequence h(MediaDescription mediaDescription) {
        return mediaDescription.getTitle();
    }

    public static String i(MediaDescription mediaDescription) {
        return mediaDescription.getMediaId();
    }

    public static void j(MediaDescription.Builder builder, CharSequence charSequence) {
        builder.setDescription(charSequence);
    }

    public static void k(MediaDescription.Builder builder, Bundle bundle) {
        builder.setExtras(bundle);
    }

    public static void l(MediaDescription.Builder builder, Bitmap bitmap) {
        builder.setIconBitmap(bitmap);
    }

    public static void m(MediaDescription.Builder builder, Uri uri) {
        builder.setIconUri(uri);
    }

    public static void n(MediaDescription.Builder builder, String str) {
        builder.setMediaId(str);
    }

    public static void o(MediaDescription.Builder builder, CharSequence charSequence) {
        builder.setSubtitle(charSequence);
    }

    public static void p(MediaDescription.Builder builder, CharSequence charSequence) {
        builder.setTitle(charSequence);
    }

    public static void q(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw new NullPointerException(str);
    }

    public static Spanned r(String str) {
        if (Build.VERSION.SDK_INT >= 24) {
            return Html.fromHtml(str, 63);
        }
        return Html.fromHtml(str);
    }

    public static Object s(ExecutorService executorService, Callable callable, int i) {
        try {
            return executorService.submit(callable).get(i, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw e;
        } catch (ExecutionException e2) {
            throw new RuntimeException(e2);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }

    public static void t(ByteBuffer byteBuffer, double d) {
        int i = (int) (d * 1.073741824E9d);
        byteBuffer.put((byte) (i >> 24));
        byteBuffer.put((byte) ((i >> 16) & PrivateKeyType.INVALID));
        byteBuffer.put((byte) ((i >> 8) & PrivateKeyType.INVALID));
        byteBuffer.put((byte) (i & PrivateKeyType.INVALID));
    }

    public static void u(ByteBuffer byteBuffer, double d) {
        int i = (int) (d * 65536.0d);
        byteBuffer.put((byte) (i >> 24));
        byteBuffer.put((byte) ((i >> 16) & PrivateKeyType.INVALID));
        byteBuffer.put((byte) ((i >> 8) & PrivateKeyType.INVALID));
        byteBuffer.put((byte) (i & PrivateKeyType.INVALID));
    }

    public static void v(ByteBuffer byteBuffer, double d) {
        short s = (short) (d * 256.0d);
        byteBuffer.put((byte) ((s >> 8) & PrivateKeyType.INVALID));
        byteBuffer.put((byte) (s & 255));
    }

    public static void w(ByteBuffer byteBuffer, int i) {
        z(byteBuffer, (i >> 8) & PrivateKeyType.INVALID);
        z(byteBuffer, i & PrivateKeyType.INVALID);
    }

    public static void x(ByteBuffer byteBuffer, int i) {
        int i2 = i & 16777215;
        w(byteBuffer, i2 >> 8);
        z(byteBuffer, i2);
    }

    public static void y(ByteBuffer byteBuffer, long j) {
        byteBuffer.putInt((int) j);
    }

    public static void z(ByteBuffer byteBuffer, int i) {
        byteBuffer.put((byte) (i & PrivateKeyType.INVALID));
    }
}
