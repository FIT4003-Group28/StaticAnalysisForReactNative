package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: amso  reason: default package */
/* loaded from: classes.dex */
final class amso extends amrt {
    final /* synthetic */ amsq a;
    private final Object b;
    private int c;

    public amso(amsq amsqVar, int i) {
        this.a = amsqVar;
        this.b = amsqVar.g(i);
        this.c = i;
    }

    private final void a() {
        int i = this.c;
        if (i == -1 || i >= this.a.size() || !akzj.f(this.b, this.a.g(this.c))) {
            this.c = this.a.d(this.b);
        }
    }

    @Override // defpackage.amrt, java.util.Map.Entry
    public final Object getKey() {
        return this.b;
    }

    @Override // defpackage.amrt, java.util.Map.Entry
    public final Object getValue() {
        Map l = this.a.l();
        if (l != null) {
            return l.get(this.b);
        }
        a();
        int i = this.c;
        if (i != -1) {
            return this.a.j(i);
        }
        return null;
    }

    @Override // defpackage.amrt, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Map l = this.a.l();
        if (l != null) {
            return l.put(this.b, obj);
        }
        a();
        int i = this.c;
        if (i == -1) {
            this.a.put(this.b, obj);
            return null;
        }
        Object j = this.a.j(i);
        this.a.p(this.c, obj);
        return j;
    }
}
