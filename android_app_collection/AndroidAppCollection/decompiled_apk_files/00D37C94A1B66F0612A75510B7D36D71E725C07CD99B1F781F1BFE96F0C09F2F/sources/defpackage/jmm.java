package defpackage;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
/* compiled from: PG */
/* renamed from: jmm  reason: default package */
/* loaded from: classes3.dex */
public final class jmm {
    public final Map a;

    public jmm() {
        this.a = new HashMap();
        new HashMap();
    }

    public jmm(Map map) {
        this.a = map;
    }

    public static String a(Class cls, Class cls2) {
        return String.format(Locale.ROOT, "(%s, %s)", cls.getSimpleName(), cls2.getSimpleName());
    }

    public final void b(chy chyVar, ckm ckmVar) {
        Map map = this.a;
        if (ckmVar.equals(map.get(chyVar))) {
            map.remove(chyVar);
        }
    }
}
