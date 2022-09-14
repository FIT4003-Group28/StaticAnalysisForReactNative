package defpackage;

import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cxwt  reason: default package */
/* loaded from: classes5.dex */
public final class cxwt {
    public final Map<String, Integer> a;

    public cxwt(Map<String, Integer> map) {
        this.a = map;
    }

    public final void a(List<cxwm> list) {
        for (cxwm cxwmVar : list) {
            String a = cxwmVar.a();
            if (!this.a.containsKey(a)) {
                this.a.put(a, 1);
            }
        }
    }
}
