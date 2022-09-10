package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: dxgb  reason: default package */
/* loaded from: classes6.dex */
public final class dxgb implements dxgx {
    public final dxgx a;
    public final List<dxfz> b = new ArrayList();

    public dxgb(dxgx dxgxVar) {
        dxgm.a(dxgxVar);
        this.a = dxgxVar;
    }

    final Throwable a() {
        for (dxfz dxfzVar : this.b) {
            if (!dxfzVar.a.b) {
                return new dxfk();
            }
        }
        return null;
    }

    @Override // defpackage.dxgx
    public final <T> dxgl<T> b(String str, Object obj, Class<T> cls) {
        Throwable a = a();
        if (a != null) {
            dxgl<T> dxglVar = new dxgl<>();
            dxglVar.g(a);
            return dxglVar;
        }
        dxgx dxgxVar = this.a;
        dxhi<T> b = ((dxgz) dxgxVar).c.b(cls);
        try {
            ((dxgz) dxgxVar).b.a(new Object[]{48, Integer.valueOf(b.a.getRaw()), dxge.a, str, null, obj});
        } catch (dxhn e) {
            b.b.g(e);
        }
        return b.b;
    }

    @Override // defpackage.dxgx
    public final <T> dxhh<T> c(String str, Class<T> cls) {
        Throwable a = a();
        if (a != null) {
            dxhh<T> dxhhVar = new dxhh<>();
            dxhhVar.g(a);
            return dxhhVar;
        }
        dxgx dxgxVar = this.a;
        dxhk dxhkVar = ((dxgz) dxgxVar).c;
        dxhj<?> dxhjVar = new dxhj<>(dxhkVar.a(), new dxhh(), cls);
        dxhkVar.a.put(dxhjVar.a, dxhjVar);
        try {
            ((dxgz) dxgxVar).b.a(new Object[]{32, Integer.valueOf(dxhjVar.a.getRaw()), null, str});
        } catch (dxhn e) {
            dxhjVar.b.g(e);
        }
        return (dxhh<T>) dxhjVar.b;
    }

    @Override // defpackage.dxgx
    public final <T> void d(String str, Class<T> cls) {
        Throwable a = a();
        if (a != null) {
            new dxgl().g(a);
            return;
        }
        dxgx dxgxVar = this.a;
        dxhi<T> b = ((dxgz) dxgxVar).c.b(cls);
        try {
            ((dxgz) dxgxVar).b.a(new Object[]{48, Integer.valueOf(b.a.getRaw()), dxge.a, str});
        } catch (dxhn e) {
            b.b.g(e);
        }
    }
}
