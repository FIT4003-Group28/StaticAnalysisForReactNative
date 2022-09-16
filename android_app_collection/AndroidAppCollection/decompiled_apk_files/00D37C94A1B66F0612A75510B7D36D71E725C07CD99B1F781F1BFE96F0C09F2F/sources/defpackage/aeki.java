package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.LruCache;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: aeki  reason: default package */
/* loaded from: classes.dex */
public final class aeki {
    public final HashMap a = new HashMap();
    public final LruCache b = new LruCache(5);
    private final snc c;

    public aeki(snc sncVar) {
        this.c = sncVar;
    }

    private final aenx e(String str) {
        double d;
        double d2;
        f();
        String str2 = null;
        aelw aelwVar = null;
        for (String str3 : this.a.keySet()) {
            if (!TextUtils.equals(str3, str)) {
                aelw aelwVar2 = (aelw) this.a.get(str3);
                snc sncVar = this.c;
                if (aelwVar2 != null || aelwVar != null) {
                    if (aelwVar2 == null || aelwVar != null) {
                        if (aelwVar2 != null) {
                            boolean d3 = afbz.d(aelwVar2, sncVar);
                            boolean d4 = afbz.d(aelwVar, sncVar);
                            if (d3 && d4) {
                                d = aelwVar.c.a;
                                d2 = aelwVar2.c.a;
                            } else if (!d3) {
                                if (!d4) {
                                    d = aelwVar.c.a;
                                    d2 = aelwVar2.c.a;
                                }
                            }
                            if (((int) (d - d2)) <= 0) {
                            }
                        }
                    }
                    aelwVar = (aelw) this.a.get(str3);
                    str2 = str3;
                }
            }
        }
        if (str2 == null || aelwVar == null) {
            return null;
        }
        return new aenx(str2, (int) aelwVar.c.a, aelwVar.b);
    }

    private final void f() {
        Iterator it = this.a.entrySet().iterator();
        while (it.hasNext()) {
            if (this.c.d() - ((aelw) ((Map.Entry) it.next()).getValue()).a > 3600000) {
                it.remove();
            }
        }
    }

    public final synchronized aenx a(String str) {
        return e(str);
    }

    public final synchronized aenx b() {
        return e(null);
    }

    public final synchronized void c() {
        this.a.clear();
    }

    public final synchronized void d(String str, double d) {
        if (str == null) {
            return;
        }
        f();
        aelw aelwVar = (aelw) this.a.get(str);
        if (aelwVar == null) {
            aelwVar = new aelw((Uri) this.b.get(str));
            this.a.put(str, aelwVar);
        }
        aelwVar.a = this.c.d();
        aelx aelxVar = aelwVar.c;
        double d2 = aelxVar.a;
        if (d2 < 0.0d) {
            aelxVar.a = d;
        } else {
            aelxVar.a = (d2 * 0.8500000238418579d) + (d * 0.1499999761581421d);
        }
    }
}
