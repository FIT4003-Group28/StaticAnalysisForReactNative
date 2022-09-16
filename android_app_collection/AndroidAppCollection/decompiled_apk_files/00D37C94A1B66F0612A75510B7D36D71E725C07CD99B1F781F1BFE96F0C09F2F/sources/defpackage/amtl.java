package defpackage;
/* compiled from: PG */
/* renamed from: amtl  reason: default package */
/* loaded from: classes.dex */
final class amtl extends amrt {
    final Object a;
    int b;
    final /* synthetic */ amtu c;

    public amtl(amtu amtuVar, int i) {
        this.c = amtuVar;
        this.a = amtuVar.a[i];
        this.b = i;
    }

    final void a() {
        int i = this.b;
        if (i != -1) {
            amtu amtuVar = this.c;
            if (i <= amtuVar.c && akzj.f(amtuVar.a[i], this.a)) {
                return;
            }
        }
        this.b = this.c.c(this.a);
    }

    @Override // defpackage.amrt, java.util.Map.Entry
    public final Object getKey() {
        return this.a;
    }

    @Override // defpackage.amrt, java.util.Map.Entry
    public final Object getValue() {
        a();
        int i = this.b;
        if (i == -1) {
            return null;
        }
        return this.c.b[i];
    }

    @Override // defpackage.amrt, java.util.Map.Entry
    public final Object setValue(Object obj) {
        a();
        int i = this.b;
        if (i == -1) {
            this.c.put(this.a, obj);
            return null;
        }
        Object obj2 = this.c.b[i];
        if (akzj.f(obj2, obj)) {
            return obj;
        }
        this.c.n(this.b, obj);
        return obj2;
    }
}
