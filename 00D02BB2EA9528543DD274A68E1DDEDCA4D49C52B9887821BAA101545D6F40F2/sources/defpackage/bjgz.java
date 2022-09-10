package defpackage;

import android.util.LruCache;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: bjgz  reason: default package */
/* loaded from: classes3.dex */
public final class bjgz {
    private final LruCache<btlu, Map<String, dqjh>> a = new LruCache<>(1);

    public final synchronized void a(btlu btluVar, String str, dqjh dqjhVar) {
        if (dqjhVar != dqjh.THUMBS_UP) {
            dqjhVar = dqjh.THUMBS_VOTE_NONE;
        }
        Map<String, dqjh> map = this.a.get(btluVar);
        if (map == null) {
            map = new HashMap<>();
            this.a.put(btluVar, map);
        }
        map.put(str, dqjhVar);
    }

    public final synchronized boolean b(btlu btluVar, String str, dqjh dqjhVar) {
        Map<String, dqjh> map = this.a.get(btluVar);
        if (map != null && map.containsKey(str)) {
            if (dqjhVar != dqjh.THUMBS_UP) {
                dqjhVar = dqjh.THUMBS_VOTE_NONE;
            }
            return map.get(str) == dqjhVar;
        }
        return true;
    }
}
