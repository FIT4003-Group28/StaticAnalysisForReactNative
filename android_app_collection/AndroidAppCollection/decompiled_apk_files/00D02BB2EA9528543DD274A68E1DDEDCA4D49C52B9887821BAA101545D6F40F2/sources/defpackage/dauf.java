package defpackage;

import java.util.AbstractMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dauf  reason: default package */
/* loaded from: classes5.dex */
public final class dauf extends AbstractMap<String, Object> {
    final Object a;
    final daty b;

    public dauf(Object obj, boolean z) {
        this.a = obj;
        daty b = daty.b(obj.getClass(), z);
        this.b = b;
        dbsk.a(!b.a.isEnum());
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: a */
    public final daue entrySet() {
        return new daue(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        dauh c;
        if ((obj instanceof String) && (c = this.b.c((String) obj)) != null) {
            return c.e(this.a);
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        String str = (String) obj;
        dauh c = this.b.c(str);
        String valueOf = String.valueOf(str);
        dbsk.t(c, valueOf.length() != 0 ? "no field of key ".concat(valueOf) : new String("no field of key "));
        Object e = c.e(this.a);
        Object obj3 = this.a;
        dbsk.s(obj2);
        c.f(obj3, obj2);
        return e;
    }
}
