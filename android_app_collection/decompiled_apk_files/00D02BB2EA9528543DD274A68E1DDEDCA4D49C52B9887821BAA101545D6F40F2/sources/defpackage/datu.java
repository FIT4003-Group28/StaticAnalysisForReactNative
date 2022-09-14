package defpackage;

import java.lang.reflect.Field;
import java.util.Map;
/* compiled from: PG */
/* renamed from: datu  reason: default package */
/* loaded from: classes5.dex */
public final class datu {
    private final Map<String, datt> a = dats.a();
    private final Map<Field, datt> b = dats.a();
    private final Object c;

    public datu(Object obj) {
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.Map, java.lang.Object] */
    public final void a() {
        for (Map.Entry<String, datt> entry : this.a.entrySet()) {
            this.c.put(entry.getKey(), entry.getValue().a());
        }
        for (Map.Entry<Field, datt> entry2 : this.b.entrySet()) {
            dauh.i(entry2.getKey(), this.c, entry2.getValue().a());
        }
    }

    public final void b(Field field, Class<?> cls, Object obj) {
        datt dattVar = this.b.get(field);
        if (dattVar == null) {
            dattVar = new datt(cls);
            this.b.put(field, dattVar);
        }
        dbsk.a(cls == dattVar.a);
        dattVar.b.add(obj);
    }
}
