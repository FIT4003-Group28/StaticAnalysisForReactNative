package defpackage;
/* compiled from: PG */
/* renamed from: amtm  reason: default package */
/* loaded from: classes.dex */
final class amtm extends amrt {
    final amtu a;
    final Object b;
    int c;

    public amtm(amtu amtuVar, int i) {
        this.a = amtuVar;
        this.b = amtuVar.b[i];
        this.c = i;
    }

    private final void a() {
        int i = this.c;
        if (i != -1) {
            amtu amtuVar = this.a;
            if (i <= amtuVar.c && akzj.f(this.b, amtuVar.b[i])) {
                return;
            }
        }
        this.c = this.a.e(this.b);
    }

    @Override // defpackage.amrt, java.util.Map.Entry
    public final Object getKey() {
        return this.b;
    }

    @Override // defpackage.amrt, java.util.Map.Entry
    public final Object getValue() {
        a();
        int i = this.c;
        if (i == -1) {
            return null;
        }
        return this.a.a[i];
    }

    @Override // defpackage.amrt, java.util.Map.Entry
    public final Object setValue(Object obj) {
        a();
        int i = this.c;
        if (i == -1) {
            this.a.l(this.b, obj);
            return null;
        }
        Object obj2 = this.a.a[i];
        if (akzj.f(obj2, obj)) {
            return obj;
        }
        this.a.m(this.c, obj);
        return obj2;
    }
}
