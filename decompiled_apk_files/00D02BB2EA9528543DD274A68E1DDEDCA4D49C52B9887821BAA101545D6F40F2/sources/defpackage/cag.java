package defpackage;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cag  reason: default package */
/* loaded from: classes.dex */
public final class cag implements cad {
    private final Map<String, List<caf>> b;
    private volatile Map<String, String> c;

    public cag(Map<String, List<caf>> map) {
        this.b = Collections.unmodifiableMap(map);
    }

    @Override // defpackage.cad
    public final Map<String, String> a() {
        if (this.c == null) {
            synchronized (this) {
                if (this.c == null) {
                    HashMap hashMap = new HashMap();
                    for (Map.Entry<String, List<caf>> entry : this.b.entrySet()) {
                        List<caf> value = entry.getValue();
                        StringBuilder sb = new StringBuilder();
                        int size = value.size();
                        for (int i = 0; i < size; i++) {
                            String str = value.get(i).a;
                            if (!TextUtils.isEmpty(str)) {
                                sb.append(str);
                                if (i != value.size() - 1) {
                                    sb.append(',');
                                }
                            }
                        }
                        String sb2 = sb.toString();
                        if (!TextUtils.isEmpty(sb2)) {
                            hashMap.put(entry.getKey(), sb2);
                        }
                    }
                    this.c = Collections.unmodifiableMap(hashMap);
                }
            }
        }
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cag) {
            return this.b.equals(((cag) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
        sb.append("LazyHeaders{headers=");
        sb.append(valueOf);
        sb.append('}');
        return sb.toString();
    }
}
