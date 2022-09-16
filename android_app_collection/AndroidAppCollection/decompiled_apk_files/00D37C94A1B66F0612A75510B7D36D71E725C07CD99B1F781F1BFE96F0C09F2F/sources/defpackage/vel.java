package defpackage;

import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: vel  reason: default package */
/* loaded from: classes4.dex */
public final class vel {
    public Map a;

    public vel() {
    }

    public vel(Map map) {
        this.a = map;
    }

    public final void a() {
        uwp.f();
        this.a.getClass();
        for (vej vejVar : vej.values()) {
            vek vekVar = (vek) this.a.get(vejVar);
            if (vekVar != null) {
                vekVar.a();
            }
        }
        this.a = null;
    }

    public final void b(Map map) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this) {
            Map map2 = this.a;
            if (map != null) {
                hashMap = new HashMap(map);
                if (map2 != null) {
                    hashMap.keySet().removeAll(map2.keySet());
                }
            } else {
                hashMap = null;
            }
            Map map3 = this.a;
            if (map3 != null) {
                hashMap2 = new HashMap(map3);
                if (map != null) {
                    hashMap2.keySet().removeAll(map.keySet());
                }
            } else {
                hashMap2 = null;
            }
            if (map != null) {
                this.a = new HashMap(map);
            } else {
                this.a = null;
            }
        }
        if (hashMap2 != null) {
            for (cyr cyrVar : hashMap2.values()) {
                cyv cyvVar = cyrVar.q;
                cyrVar.aq();
            }
        }
        if (hashMap != null) {
            for (cyr cyrVar2 : hashMap.values()) {
                cyv cyvVar2 = cyrVar2.q;
                cyrVar2.ap();
            }
        }
    }
}
