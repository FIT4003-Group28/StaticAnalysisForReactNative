package defpackage;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: eagm  reason: default package */
/* loaded from: classes6.dex */
final class eagm {
    static final eagj[] a = {new eagj(eagj.f, ""), new eagj(eagj.c, "GET"), new eagj(eagj.c, "POST"), new eagj(eagj.d, "/"), new eagj(eagj.d, "/index.html"), new eagj(eagj.e, "http"), new eagj(eagj.e, "https"), new eagj(eagj.b, "200"), new eagj(eagj.b, "204"), new eagj(eagj.b, "206"), new eagj(eagj.b, "304"), new eagj(eagj.b, "400"), new eagj(eagj.b, "404"), new eagj(eagj.b, "500"), new eagj("accept-charset", ""), new eagj("accept-encoding", "gzip, deflate"), new eagj("accept-language", ""), new eagj("accept-ranges", ""), new eagj("accept", ""), new eagj("access-control-allow-origin", ""), new eagj("age", ""), new eagj("allow", ""), new eagj("authorization", ""), new eagj("cache-control", ""), new eagj("content-disposition", ""), new eagj("content-encoding", ""), new eagj("content-language", ""), new eagj("content-length", ""), new eagj("content-location", ""), new eagj("content-range", ""), new eagj("content-type", ""), new eagj("cookie", ""), new eagj("date", ""), new eagj("etag", ""), new eagj("expect", ""), new eagj("expires", ""), new eagj("from", ""), new eagj("host", ""), new eagj("if-match", ""), new eagj("if-modified-since", ""), new eagj("if-none-match", ""), new eagj("if-range", ""), new eagj("if-unmodified-since", ""), new eagj("last-modified", ""), new eagj("link", ""), new eagj("location", ""), new eagj("max-forwards", ""), new eagj("proxy-authenticate", ""), new eagj("proxy-authorization", ""), new eagj("range", ""), new eagj("referer", ""), new eagj("refresh", ""), new eagj("retry-after", ""), new eagj("server", ""), new eagj("set-cookie", ""), new eagj("strict-transport-security", ""), new eagj("transfer-encoding", ""), new eagj("user-agent", ""), new eagj("vary", ""), new eagj("via", ""), new eagj("www-authenticate", "")};
    static final Map<eajc, Integer> b;

    static {
        int i = 0;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        while (true) {
            eagj[] eagjVarArr = a;
            int length = eagjVarArr.length;
            if (i < 61) {
                if (!linkedHashMap.containsKey(eagjVarArr[i].g)) {
                    linkedHashMap.put(eagjVarArr[i].g, Integer.valueOf(i));
                }
                i++;
            } else {
                b = Collections.unmodifiableMap(linkedHashMap);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(eajc eajcVar) {
        int h = eajcVar.h();
        for (int i = 0; i < h; i++) {
            byte g = eajcVar.g(i);
            if (g >= 65 && g <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + eajcVar.c());
            }
        }
    }
}
