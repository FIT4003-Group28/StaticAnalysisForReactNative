package defpackage;

import android.util.ArrayMap;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
/* compiled from: PG */
/* renamed from: afh  reason: default package */
/* loaded from: classes.dex */
public final class afh extends afi implements afg {
    private static final afe c = afe.OPTIONAL;

    public afh(TreeMap treeMap) {
        super(treeMap);
    }

    @Override // defpackage.afg
    public final void b(afd afdVar, Object obj) {
        afe afeVar = c;
        Map map = (Map) this.b.get(afdVar);
        if (map == null) {
            ArrayMap arrayMap = new ArrayMap();
            this.b.put(afdVar, arrayMap);
            arrayMap.put(afeVar, obj);
            return;
        }
        afe afeVar2 = (afe) Collections.min(map.keySet());
        if (map.get(afeVar2).equals(obj) || ((afeVar2 != afe.ALWAYS_OVERRIDE || afeVar != afe.ALWAYS_OVERRIDE) && (afeVar2 != afe.REQUIRED || afeVar != afe.REQUIRED))) {
            map.put(afeVar, obj);
            return;
        }
        throw new IllegalArgumentException("Option values conflicts: " + afdVar.a + ", existing value (" + afeVar2 + ")=" + map.get(afeVar2) + ", conflicting (" + afeVar + ")=" + obj);
    }
}
