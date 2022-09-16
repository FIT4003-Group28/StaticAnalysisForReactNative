package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicLong;
import org.chromium.net.UrlResponseInfo;
/* compiled from: PG */
/* renamed from: bagp  reason: default package */
/* loaded from: classes2.dex */
public final class bagp extends UrlResponseInfo {
    private final List a;
    private final int b;
    private final String c;
    private final boolean d;
    private final String e;
    private final String f;
    private final AtomicLong g;
    private final bago h;

    public bagp(List list, int i, String str, List list2, boolean z, String str2, String str3, long j) {
        this.a = Collections.unmodifiableList(list);
        this.b = i;
        this.c = str;
        this.h = new bago(Collections.unmodifiableList(list2));
        this.d = z;
        this.e = str2;
        this.f = str3;
        this.g = new AtomicLong(j);
    }

    public final void a(long j) {
        this.g.set(j);
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final Map getAllHeaders() {
        bago bagoVar = this.h;
        Map map = bagoVar.b;
        if (map != null) {
            return map;
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (Map.Entry entry : bagoVar.a) {
            ArrayList arrayList = new ArrayList();
            if (treeMap.containsKey(entry.getKey())) {
                arrayList.addAll((Collection) treeMap.get(entry.getKey()));
            }
            arrayList.add((String) entry.getValue());
            treeMap.put((String) entry.getKey(), Collections.unmodifiableList(arrayList));
        }
        bagoVar.b = Collections.unmodifiableMap(treeMap);
        return bagoVar.b;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final List getAllHeadersAsList() {
        return this.h.a;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final int getHttpStatusCode() {
        return this.b;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final String getHttpStatusText() {
        return this.c;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final String getNegotiatedProtocol() {
        return this.e;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final String getProxyServer() {
        return this.f;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final long getReceivedByteCount() {
        return this.g.get();
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final String getUrl() {
        List list = this.a;
        return (String) list.get(list.size() - 1);
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final List getUrlChain() {
        return this.a;
    }

    public final String toString() {
        return String.format(Locale.ROOT, "UrlResponseInfo@[%s][%s]: urlChain = %s, httpStatus = %d %s, headers = %s, wasCached = %b, negotiatedProtocol = %s, proxyServer= %s, receivedByteCount = %d", Integer.toHexString(System.identityHashCode(this)), getUrl(), this.a.toString(), Integer.valueOf(this.b), this.c, getAllHeadersAsList().toString(), Boolean.valueOf(this.d), this.e, this.f, Long.valueOf(getReceivedByteCount()));
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final boolean wasCached() {
        return this.d;
    }
}
