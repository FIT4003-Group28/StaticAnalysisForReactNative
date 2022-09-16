package defpackage;
/* compiled from: PG */
/* renamed from: dcbw  reason: default package */
/* loaded from: classes5.dex */
final class dcbw extends dbyj {
    final Object a;
    int b;
    final /* synthetic */ dccf c;

    public dcbw(dccf dccfVar, int i) {
        this.c = dccfVar;
        this.a = dccfVar.a[i];
        this.b = i;
    }

    final void a() {
        int i = this.b;
        if (i != -1) {
            dccf dccfVar = this.c;
            if (i <= dccfVar.c && dbsd.a(dccfVar.a[i], this.a)) {
                return;
            }
        }
        this.b = this.c.b(this.a);
    }

    @Override // defpackage.dbyj, java.util.Map.Entry
    public final Object getKey() {
        return this.a;
    }

    @Override // defpackage.dbyj, java.util.Map.Entry
    public final Object getValue() {
        a();
        int i = this.b;
        if (i == -1) {
            return null;
        }
        return this.c.b[i];
    }

    @Override // defpackage.dbyj, java.util.Map.Entry
    public final Object setValue(Object obj) {
        a();
        int i = this.b;
        if (i == -1) {
            return this.c.put(this.a, obj);
        }
        Object obj2 = this.c.b[i];
        if (dbsd.a(obj2, obj)) {
            return obj;
        }
        this.c.m(this.b, obj);
        return obj2;
    }
}
