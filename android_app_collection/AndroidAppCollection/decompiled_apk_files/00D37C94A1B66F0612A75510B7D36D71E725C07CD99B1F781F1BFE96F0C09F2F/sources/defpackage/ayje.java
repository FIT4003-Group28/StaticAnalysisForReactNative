package defpackage;

import java.util.Collection;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: ayje  reason: default package */
/* loaded from: classes2.dex */
public final class ayje extends axye {
    public final String b;
    public final /* synthetic */ ayji c;
    public final AtomicReference a = new AtomicReference(ayji.g);
    private final axye d = new ayiy(this);

    public ayje(ayji ayjiVar, String str) {
        this.c = ayjiVar;
        str.getClass();
        this.b = str;
    }

    @Override // defpackage.axye
    public final axyg a(ayax ayaxVar, axyd axydVar) {
        if (this.a.get() != ayji.g) {
            return c(ayaxVar, axydVar);
        }
        this.c.o.execute(new ayiz(this, 2));
        if (this.a.get() != ayji.g) {
            return c(ayaxVar, axydVar);
        }
        if (this.c.A.get()) {
            return new ayja();
        }
        ayjd ayjdVar = new ayjd(this, axyx.b(), ayaxVar, axydVar);
        this.c.o.execute(new ayjb(this, ayjdVar));
        return ayjdVar;
    }

    @Override // defpackage.axye
    public final String b() {
        return this.b;
    }

    public final axyg c(ayax ayaxVar, axyd axydVar) {
        axzq axzqVar = (axzq) this.a.get();
        if (axzqVar == null) {
            return this.d.a(ayaxVar, axydVar);
        }
        if (axzqVar instanceof ayjq) {
            ayjp b = ((ayjq) axzqVar).b.b(ayaxVar);
            if (b != null) {
                axydVar = axydVar.d(ayjp.a, b);
            }
            return this.d.a(ayaxVar, axydVar);
        }
        return new ayip(axzqVar, this.d, this.c.l, ayaxVar, axydVar);
    }

    public final void d(axzq axzqVar) {
        Collection<ayjd> collection;
        axzq axzqVar2 = (axzq) this.a.get();
        this.a.set(axzqVar);
        if (axzqVar2 != ayji.g || (collection = this.c.w) == null) {
            return;
        }
        for (ayjd ayjdVar : collection) {
            ayjdVar.j();
        }
    }
}
