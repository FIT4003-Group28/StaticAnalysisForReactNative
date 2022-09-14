package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cae  reason: default package */
/* loaded from: classes.dex */
public final class cae {
    private static final String a;
    private static final Map<String, List<caf>> b;
    private boolean c = true;
    private Map<String, List<caf>> d = b;
    private boolean e = true;

    static {
        String property = System.getProperty("http.agent");
        if (!TextUtils.isEmpty(property)) {
            int length = property.length();
            StringBuilder sb = new StringBuilder(property.length());
            for (int i = 0; i < length; i++) {
                char charAt = property.charAt(i);
                if (charAt <= 31) {
                    if (charAt == '\t') {
                        charAt = '\t';
                    }
                    sb.append('?');
                }
                if (charAt < 127) {
                    sb.append(charAt);
                }
                sb.append('?');
            }
            property = sb.toString();
        }
        a = property;
        HashMap hashMap = new HashMap(2);
        if (!TextUtils.isEmpty(property)) {
            hashMap.put("User-Agent", Collections.singletonList(new caf(property)));
        }
        b = Collections.unmodifiableMap(hashMap);
    }

    private final void c() {
        if (this.c) {
            this.c = false;
            HashMap hashMap = new HashMap(this.d.size());
            for (Map.Entry<String, List<caf>> entry : this.d.entrySet()) {
                hashMap.put(entry.getKey(), new ArrayList(entry.getValue()));
            }
            this.d = hashMap;
        }
    }

    private final List<caf> d() {
        List<caf> list = this.d.get("Authorization");
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            this.d.put("Authorization", arrayList);
            return arrayList;
        }
        return list;
    }

    public final cag a() {
        this.c = true;
        return new cag(this.d);
    }

    public final void b(String str) {
        caf cafVar = new caf(str);
        boolean z = this.e;
        c();
        d().add(cafVar);
    }
}
