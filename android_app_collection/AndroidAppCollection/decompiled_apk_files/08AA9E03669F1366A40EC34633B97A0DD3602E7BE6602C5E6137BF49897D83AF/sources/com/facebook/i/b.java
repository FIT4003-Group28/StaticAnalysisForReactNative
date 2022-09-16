package com.facebook.i;

import com.facebook.common.d.i;
import java.io.IOException;
import java.io.InputStream;
import org.spongycastle.asn1.x509.DisplayText;
import org.spongycastle.crypto.tls.CipherSuite;
/* compiled from: JfifUtil.java */
/* loaded from: classes.dex */
public class b {
    private static boolean b(int i) {
        switch (i) {
            case 192:
            case CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA256 /* 193 */:
            case CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256 /* 194 */:
            case CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 /* 195 */:
            case CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256 /* 197 */:
            case 198:
            case 199:
            case 201:
            case 202:
            case 203:
            case 205:
            case 206:
            case 207:
                return true;
            case CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256 /* 196 */:
            case DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE /* 200 */:
            case 204:
            default:
                return false;
        }
    }

    public static int a(int i) {
        return d.a(i);
    }

    public static int a(InputStream inputStream) {
        try {
            int b2 = b(inputStream);
            if (b2 != 0) {
                return d.a(inputStream, b2);
            }
            return 0;
        } catch (IOException unused) {
            return 0;
        }
    }

    public static boolean a(InputStream inputStream, int i) {
        i.a(inputStream);
        while (c.a(inputStream, 1, false) == 255) {
            int i2 = 255;
            while (i2 == 255) {
                i2 = c.a(inputStream, 1, false);
            }
            if ((i == 192 && b(i2)) || i2 == i) {
                return true;
            }
            if (i2 != 216 && i2 != 1) {
                if (i2 == 217 || i2 == 218) {
                    return false;
                }
                inputStream.skip(c.a(inputStream, 2, false) - 2);
            }
        }
        return false;
    }

    private static int b(InputStream inputStream) {
        int a2;
        if (a(inputStream, 225) && (a2 = c.a(inputStream, 2, false) - 2) > 6) {
            int a3 = c.a(inputStream, 4, false);
            int a4 = c.a(inputStream, 2, false);
            int i = (a2 - 4) - 2;
            if (a3 == 1165519206 && a4 == 0) {
                return i;
            }
        }
        return 0;
    }
}
