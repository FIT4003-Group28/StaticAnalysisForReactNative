package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: dbxb  reason: default package */
/* loaded from: classes5.dex */
final class dbxb extends dcbo {
    final /* synthetic */ dbxg a;
    private final Map.Entry b;

    public dbxb(dbxg dbxgVar, Map.Entry entry) {
        this.a = dbxgVar;
        this.b = entry;
    }

    @Override // defpackage.dcbo, defpackage.dcbq
    protected final /* bridge */ /* synthetic */ Object SC() {
        return this.b;
    }

    @Override // defpackage.dcbo
    protected final Map.Entry a() {
        return this.b;
    }

    @Override // defpackage.dcbo, java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.a.b(obj);
        dbsk.m(this.a.entrySet().contains(this), "entry no longer in map");
        if (dbsd.a(obj, getValue())) {
            return obj;
        }
        dbsk.g(!this.a.containsValue(obj), "value already present: %s", obj);
        Object value = this.b.setValue(obj);
        dbsk.m(dbsd.a(obj, this.a.get(getKey())), "entry no longer in map");
        this.a.e(getKey(), true, value, obj);
        return value;
    }
}
