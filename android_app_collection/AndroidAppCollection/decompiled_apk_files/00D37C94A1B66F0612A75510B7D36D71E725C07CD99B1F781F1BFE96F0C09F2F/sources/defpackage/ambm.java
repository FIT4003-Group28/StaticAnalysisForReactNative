package defpackage;

import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ambm  reason: default package */
/* loaded from: classes.dex */
public final class ambm implements anir {
    public final List a;
    public final int b;
    public final Executor c;
    private final ampt e;
    public int d = -1;
    private final anir f = ammo.c(this);

    public ambm(List list, ampt amptVar, Executor executor) {
        this.a = list;
        this.b = list.size();
        this.e = amptVar;
        this.c = executor;
    }

    @Override // defpackage.anir
    public final ankt a(Object obj) {
        if (this.e.a(obj)) {
            return anlz.q(obj);
        }
        return b();
    }

    public final ankt b() {
        int i = this.d + 1;
        this.d = i;
        if (i < this.b) {
            return anii.i((ankt) this.a.get(i), this.f, this.c);
        }
        return anlz.q(null);
    }
}
