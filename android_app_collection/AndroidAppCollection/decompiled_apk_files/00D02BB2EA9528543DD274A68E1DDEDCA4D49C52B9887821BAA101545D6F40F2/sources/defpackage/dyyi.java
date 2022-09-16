package defpackage;

import java.io.IOException;
import java.util.logging.Logger;
/* compiled from: PG */
/* renamed from: dyyi  reason: default package */
/* loaded from: classes6.dex */
public final class dyyi implements dyym {
    public static final Logger a = Logger.getLogger(dyyf.class.getName());
    public static final eajc b = eajc.b("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    public static IllegalArgumentException a(String str, Object... objArr) {
        throw new IllegalArgumentException(String.format(str, objArr));
    }

    public static IOException b(String str, Object... objArr) {
        throw new IOException(String.format(str, objArr));
    }

    public static int c(int i, byte b2, short s) {
        if ((b2 & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return i - s;
        }
        throw b("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i));
    }

    public static int d(eajb eajbVar) {
        return (eajbVar.h() & 255) | ((eajbVar.h() & 255) << 16) | ((eajbVar.h() & 255) << 8);
    }

    @Override // defpackage.dyym
    public final dyxy e(eajb eajbVar) {
        return new dyyg(eajbVar);
    }
}
