package defpackage;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: apd  reason: default package */
/* loaded from: classes.dex */
public final class apd {
    public static final apd a = new apd(new HashSet(), new HashMap());
    public final Set b;
    public final apc c = null;
    public final Map d;

    private apd(Set set, Map map) {
        this.b = new HashSet(set);
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            hashMap.put((Class) entry.getKey(), new HashSet((Collection) entry.getValue()));
        }
        this.d = hashMap;
    }
}
