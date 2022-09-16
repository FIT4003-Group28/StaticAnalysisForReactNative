package defpackage;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: aflw  reason: default package */
/* loaded from: classes.dex */
public final class aflw {
    protected final Map a;

    public aflw() {
        this.a = DesugarCollections.synchronizedMap(new HashMap());
    }

    public aflw(Map map) {
        this.a = map;
    }

    public static aflw h(aflw aflwVar) {
        aflw aflwVar2 = new aflw();
        if (aflwVar != null) {
            synchronized (aflwVar.a) {
                aflwVar2.a.putAll(aflwVar.a);
            }
        }
        return aflwVar2;
    }

    public static aflw i(aflw aflwVar) {
        if (aflwVar == null) {
            return null;
        }
        return h(aflwVar);
    }

    public final Long a() {
        return c("x-head-seqnum");
    }

    public final Long b() {
        String e = e("x-head-time-millis");
        if (e != null) {
            try {
                return Long.valueOf(TimeUnit.MILLISECONDS.toMicros(Long.parseLong(e)));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final Long c(String str) {
        String e = e(str);
        if (e != null) {
            try {
                return Long.valueOf(Long.parseLong(e));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final Long d() {
        return c("x-segment-lmt");
    }

    public final String e(String str) {
        List list = (List) this.a.get(str);
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (String) list.get(0);
    }

    public final Object f(Class cls) {
        return this.a.get(cls);
    }

    public final void g(Class cls, Object obj) {
        this.a.put(cls, obj);
    }
}
