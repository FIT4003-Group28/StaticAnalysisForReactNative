package defpackage;

import java.util.HashMap;
import java.util.List;
/* compiled from: PG */
/* renamed from: buhn  reason: default package */
/* loaded from: classes4.dex */
public final class buhn<T> extends btrh<T> {
    private final int d;

    public buhn(int i, Class<?> cls, T t) {
        super(cls, t);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        btlu a;
        if (this.d != 0) {
            btuc btucVar = (btuc) obj;
            ((buhl) this.a).e();
            return;
        }
        buhl buhlVar = (buhl) this.a;
        List<btue> list = ((gdp) obj).a;
        HashMap hashMap = new HashMap();
        dbsk.l(hashMap.isEmpty());
        btlu btluVar = null;
        for (btue btueVar : dchl.l(list)) {
            if (btueVar != null && (a = btueVar.a()) != null) {
                hashMap.put(a, btueVar);
                btluVar = a;
            }
        }
        synchronized (buhlVar) {
            buhlVar.d = hashMap;
            if (btluVar != null && !buhlVar.c.a()) {
                buhlVar.c = dbsg.i(btluVar);
            }
            if (buhlVar.c.a()) {
                buhlVar.c(buhlVar.d.get(buhlVar.c.b()));
            }
        }
    }
}
