package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: dbzl  reason: default package */
/* loaded from: classes.dex */
final class dbzl extends dbyj {
    final /* synthetic */ dbzn a;
    private final Object b;
    private int c;

    public dbzl(dbzn dbznVar, int i) {
        this.a = dbznVar;
        this.b = dbznVar.d[i];
        this.c = i;
    }

    private final void a() {
        int i = this.c;
        if (i == -1 || i >= this.a.size() || !dbsd.a(this.b, this.a.d[this.c])) {
            this.c = this.a.m(this.b);
        }
    }

    @Override // defpackage.dbyj, java.util.Map.Entry
    public final Object getKey() {
        return this.b;
    }

    @Override // defpackage.dbyj, java.util.Map.Entry
    public final Object getValue() {
        Map f = this.a.f();
        if (f != null) {
            return f.get(this.b);
        }
        a();
        int i = this.c;
        if (i != -1) {
            return this.a.e[i];
        }
        return null;
    }

    @Override // defpackage.dbyj, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Map f = this.a.f();
        if (f != null) {
            return f.put(this.b, obj);
        }
        a();
        int i = this.c;
        if (i == -1) {
            this.a.put(this.b, obj);
            return null;
        }
        Object[] objArr = this.a.e;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }
}
