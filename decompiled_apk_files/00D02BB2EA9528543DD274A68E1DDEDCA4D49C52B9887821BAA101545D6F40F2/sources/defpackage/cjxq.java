package defpackage;

import android.net.UrlQuerySanitizer;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
/* compiled from: PG */
/* renamed from: cjxq  reason: default package */
/* loaded from: classes4.dex */
public class cjxq extends UrlQuerySanitizer {
    public static String a(String str) {
        try {
            byte[] bytes = str.getBytes("utf-8");
            int length = bytes.length;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
            int i = 0;
            while (i < length) {
                char b = b(bytes[i]);
                if (b == '+') {
                    byteArrayOutputStream.write(32);
                } else {
                    if (b == '%') {
                        int i2 = i + 2;
                        if (i2 < length) {
                            int c = c(b(bytes[i + 1]));
                            int c2 = c(b(bytes[i2]));
                            if (c >= 0 && c2 >= 0) {
                                byteArrayOutputStream.write((c * 16) + c2);
                                i = i2;
                            }
                        }
                        b = '%';
                    }
                    byteArrayOutputStream.write(b);
                }
                i++;
            }
            return byteArrayOutputStream.toString("utf-8");
        } catch (UnsupportedEncodingException unused) {
            return str;
        }
    }

    private static char b(byte b) {
        return (char) (b & 255);
    }

    private static int c(char c) {
        if (c < '0' || c > '9') {
            if (c >= 'A' && c <= 'F') {
                return c - '7';
            }
            if (c >= 'a' && c <= 'f') {
                return c - 'W';
            }
            return -1;
        }
        return c - '0';
    }

    @Override // android.net.UrlQuerySanitizer
    public final String unescape(String str) {
        return a(str);
    }
}
