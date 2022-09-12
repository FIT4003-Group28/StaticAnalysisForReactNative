package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: csto  reason: default package */
/* loaded from: classes5.dex */
public final class csto {
    public static byte[] a(Serializable serializable) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(serializable);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            objectOutputStream.close();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                deki.a(th, th2);
            }
            throw th;
        }
    }

    public static byte[] b(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static Bitmap c(byte[] bArr) {
        try {
            return BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        } catch (Exception unused) {
            cstl.a("SerializeUtil");
            return null;
        }
    }

    public static HashMap<String, Object> d(byte[] bArr) {
        try {
            Object i = i(bArr);
            return i instanceof HashMap ? (HashMap) i : new HashMap<>();
        } catch (IOException | ClassNotFoundException unused) {
            cstl.a("SerializeUtil");
            new String(bArr);
            cstl.a("SerializeUtil");
            return new HashMap<>();
        }
    }

    public static HashMap<String, byte[]> e(byte[] bArr) {
        try {
            Object i = i(bArr);
            if (i instanceof HashMap) {
                for (byte[] bArr2 : ((HashMap) i).values()) {
                }
                return (HashMap) i;
            }
        } catch (IOException | ClassCastException | ClassNotFoundException unused) {
            cstl.a("SerializeUtil");
            new String(bArr);
            cstl.a("SerializeUtil");
        }
        return new HashMap<>();
    }

    public static String f(byte[] bArr) {
        return Base64.encodeToString(bArr, 2);
    }

    public static byte[] g(String str) {
        return Base64.decode(str, 2);
    }

    public static dbsg<HashMap<String, Object>> h(Object obj) {
        try {
            return dbsg.i((HashMap) obj);
        } catch (ClassCastException unused) {
            return dbpy.a;
        }
    }

    private static Object i(byte[] bArr) {
        return new ObjectInputStream(new ByteArrayInputStream(bArr)).readObject();
    }
}
