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
/* renamed from: eamj  reason: default package */
/* loaded from: classes6.dex */
public final class eamj extends UrlResponseInfo {
    private final List<String> a;
    private final int b;
    private final String c;
    private final String d;
    private final String e = "";
    private final AtomicLong f = new AtomicLong(0);
    private final eami g;

    public eamj(List<String> list, int i, String str, List<Map.Entry<String, String>> list2, String str2) {
        this.a = Collections.unmodifiableList(list);
        this.b = i;
        this.c = str;
        this.g = new eami(Collections.unmodifiableList(list2));
        this.d = str2;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final Map<String, List<String>> getAllHeaders() {
        eami eamiVar = this.g;
        Map<String, List<String>> map = eamiVar.b;
        if (map != null) {
            return map;
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (Map.Entry<String, String> entry : eamiVar.a) {
            ArrayList arrayList = new ArrayList();
            if (treeMap.containsKey(entry.getKey())) {
                arrayList.addAll((Collection) treeMap.get(entry.getKey()));
            }
            arrayList.add(entry.getValue());
            treeMap.put(entry.getKey(), Collections.unmodifiableList(arrayList));
        }
        eamiVar.b = Collections.unmodifiableMap(treeMap);
        return eamiVar.b;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final List<Map.Entry<String, String>> getAllHeadersAsList() {
        return this.g.a;
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
        return this.d;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final String getProxyServer() {
        return this.e;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final long getReceivedByteCount() {
        return this.f.get();
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final String getUrl() {
        List<String> list = this.a;
        return list.get(list.size() - 1);
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final List<String> getUrlChain() {
        return this.a;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        List<String> list = this.a;
        return String.format(locale, "UrlResponseInfo@[%s][%s]: urlChain = %s, httpStatus = %d %s, headers = %s, wasCached = %b, negotiatedProtocol = %s, proxyServer= %s, receivedByteCount = %d", Integer.toHexString(System.identityHashCode(this)), list.get(list.size() - 1), this.a.toString(), Integer.valueOf(this.b), this.c, getAllHeadersAsList().toString(), false, this.d, this.e, Long.valueOf(this.f.get()));
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final boolean wasCached() {
        return false;
    }
}
