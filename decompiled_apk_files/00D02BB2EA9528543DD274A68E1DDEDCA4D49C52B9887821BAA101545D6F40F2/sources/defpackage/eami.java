package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.chromium.net.UrlResponseInfo;
/* compiled from: PG */
/* renamed from: eami  reason: default package */
/* loaded from: classes6.dex */
public final class eami extends UrlResponseInfo.HeaderBlock {
    public final List<Map.Entry<String, String>> a;
    public Map<String, List<String>> b;

    public eami(List<Map.Entry<String, String>> list) {
        this.a = list;
    }

    @Override // org.chromium.net.UrlResponseInfo.HeaderBlock
    public final List<Map.Entry<String, String>> getAsList() {
        return this.a;
    }

    @Override // org.chromium.net.UrlResponseInfo.HeaderBlock
    public final Map<String, List<String>> getAsMap() {
        Map<String, List<String>> map = this.b;
        if (map != null) {
            return map;
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (Map.Entry<String, String> entry : this.a) {
            ArrayList arrayList = new ArrayList();
            if (treeMap.containsKey(entry.getKey())) {
                arrayList.addAll((Collection) treeMap.get(entry.getKey()));
            }
            arrayList.add(entry.getValue());
            treeMap.put(entry.getKey(), Collections.unmodifiableList(arrayList));
        }
        Map<String, List<String>> unmodifiableMap = Collections.unmodifiableMap(treeMap);
        this.b = unmodifiableMap;
        return unmodifiableMap;
    }
}
