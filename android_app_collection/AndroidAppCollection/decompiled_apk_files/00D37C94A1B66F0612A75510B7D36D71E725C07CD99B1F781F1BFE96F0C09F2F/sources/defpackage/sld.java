package defpackage;

import java.util.HashSet;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: sld  reason: default package */
/* loaded from: classes4.dex */
public final class sld {
    public final HashSet a = new HashSet();
    private final Executor b;
    private boolean c;

    public sld(Executor executor) {
        this.b = executor;
    }

    public final synchronized ankt a() {
        ankt a;
        this.c = true;
        a = anlz.j(this.a).a(gbb.d, this.b);
        this.a.clear();
        return a;
    }

    public final synchronized ankt b(slc slcVar) {
        if (this.c) {
            return anlz.o();
        }
        ankt a = slcVar.a();
        this.a.add(a);
        anlz.A(a, new slb(this, a), this.b);
        return a;
    }

    public final synchronized boolean c() {
        return this.c;
    }
}
