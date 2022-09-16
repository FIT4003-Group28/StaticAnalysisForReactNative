package defpackage;

import java.util.HashMap;
/* compiled from: PG */
/* renamed from: acn  reason: default package */
/* loaded from: classes.dex */
public final class acn extends acu {
    public final HashMap a = new HashMap();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.acu
    public final acq a(Object obj) {
        return (acq) this.a.get(obj);
    }

    @Override // defpackage.acu
    public final Object b(Object obj, Object obj2) {
        acq a = a(obj);
        if (a != null) {
            return a.b;
        }
        this.a.put(obj, e(obj, obj2));
        return null;
    }

    @Override // defpackage.acu
    public final Object c(Object obj) {
        Object c = super.c(obj);
        this.a.remove(obj);
        return c;
    }

    public final boolean d(Object obj) {
        return this.a.containsKey(obj);
    }
}
