package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: eaoi  reason: default package */
/* loaded from: classes6.dex */
public final class eaoi extends LinkedHashMap<String, String> {
    public static final eaoi a = new eaoi();

    private eaoi() {
        super(192, 0.8f, true);
    }

    public final synchronized String a(String str) {
        String str2 = get(str);
        if (str2 == null) {
            String intern = str.intern();
            put(intern, intern);
            return intern;
        }
        return str2;
    }

    @Override // java.util.LinkedHashMap
    protected final boolean removeEldestEntry(Map.Entry<String, String> entry) {
        return size() > 192;
    }
}
