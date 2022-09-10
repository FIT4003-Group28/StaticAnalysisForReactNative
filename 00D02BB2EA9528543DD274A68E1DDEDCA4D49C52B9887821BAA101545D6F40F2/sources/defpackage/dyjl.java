package defpackage;

import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dyjl  reason: default package */
/* loaded from: classes6.dex */
public final class dyjl {
    public final /* synthetic */ dyep a;
    final /* synthetic */ dyjo b;

    public dyjl(dyjo dyjoVar, dyep dyepVar) {
        this.b = dyjoVar;
        this.a = dyepVar;
    }

    public final void a(Map<String, List<String>> map) {
        dyhw dyhwVar;
        try {
            synchronized (this.b) {
                dyjo dyjoVar = this.b;
                Map<String, List<String>> map2 = dyjoVar.d;
                if (map2 == null || map2 != map) {
                    dyhw dyhwVar2 = new dyhw();
                    if (map != null) {
                        for (String str : map.keySet()) {
                            if (str.endsWith("-bin")) {
                                dyhs c = dyhs.c(str, dyhw.a);
                                for (String str2 : map.get(str)) {
                                    dyhwVar2.i(c, ddae.d.j(str2));
                                }
                            } else {
                                dyhs d = dyhs.d(str, dyhw.b);
                                for (String str3 : map.get(str)) {
                                    dyhwVar2.i(d, str3);
                                }
                            }
                        }
                    }
                    dyjoVar.c = dyhwVar2;
                    this.b.d = map;
                }
                dyhwVar = this.b.c;
            }
            this.a.a(dyhwVar);
        } catch (Throwable th) {
            this.a.b(dyjb.i.g("Failed to convert credential metadata").f(th));
        }
    }
}
