package defpackage;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dyyd  reason: default package */
/* loaded from: classes6.dex */
final class dyyd {
    public static final eajc a = eajc.b(":");
    public static final dyya[] b = {new dyya(dyya.e, ""), new dyya(dyya.b, "GET"), new dyya(dyya.b, "POST"), new dyya(dyya.c, "/"), new dyya(dyya.c, "/index.html"), new dyya(dyya.d, "http"), new dyya(dyya.d, "https"), new dyya(dyya.a, "200"), new dyya(dyya.a, "204"), new dyya(dyya.a, "206"), new dyya(dyya.a, "304"), new dyya(dyya.a, "400"), new dyya(dyya.a, "404"), new dyya(dyya.a, "500"), new dyya("accept-charset", ""), new dyya("accept-encoding", "gzip, deflate"), new dyya("accept-language", ""), new dyya("accept-ranges", ""), new dyya("accept", ""), new dyya("access-control-allow-origin", ""), new dyya("age", ""), new dyya("allow", ""), new dyya("authorization", ""), new dyya("cache-control", ""), new dyya("content-disposition", ""), new dyya("content-encoding", ""), new dyya("content-language", ""), new dyya("content-length", ""), new dyya("content-location", ""), new dyya("content-range", ""), new dyya("content-type", ""), new dyya("cookie", ""), new dyya("date", ""), new dyya("etag", ""), new dyya("expect", ""), new dyya("expires", ""), new dyya("from", ""), new dyya("host", ""), new dyya("if-match", ""), new dyya("if-modified-since", ""), new dyya("if-none-match", ""), new dyya("if-range", ""), new dyya("if-unmodified-since", ""), new dyya("last-modified", ""), new dyya("link", ""), new dyya("location", ""), new dyya("max-forwards", ""), new dyya("proxy-authenticate", ""), new dyya("proxy-authorization", ""), new dyya("range", ""), new dyya("referer", ""), new dyya("refresh", ""), new dyya("retry-after", ""), new dyya("server", ""), new dyya("set-cookie", ""), new dyya("strict-transport-security", ""), new dyya("transfer-encoding", ""), new dyya("user-agent", ""), new dyya("vary", ""), new dyya("via", ""), new dyya("www-authenticate", "")};
    public static final Map<eajc, Integer> c;

    static {
        int i = 0;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        while (true) {
            dyya[] dyyaVarArr = b;
            int length = dyyaVarArr.length;
            if (i < 61) {
                if (!linkedHashMap.containsKey(dyyaVarArr[i].f)) {
                    linkedHashMap.put(dyyaVarArr[i].f, Integer.valueOf(i));
                }
                i++;
            } else {
                c = Collections.unmodifiableMap(linkedHashMap);
                return;
            }
        }
    }

    public static void a(eajc eajcVar) {
        int h = eajcVar.h();
        for (int i = 0; i < h; i++) {
            byte g = eajcVar.g(i);
            if (g >= 65 && g <= 90) {
                String valueOf = String.valueOf(eajcVar.c());
                throw new IOException(valueOf.length() != 0 ? "PROTOCOL_ERROR response malformed: mixed case name: ".concat(valueOf) : new String("PROTOCOL_ERROR response malformed: mixed case name: "));
            }
        }
    }
}
