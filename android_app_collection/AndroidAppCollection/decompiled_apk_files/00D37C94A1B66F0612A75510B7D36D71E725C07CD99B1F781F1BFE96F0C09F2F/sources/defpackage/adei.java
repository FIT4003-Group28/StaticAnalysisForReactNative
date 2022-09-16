package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: adei  reason: default package */
/* loaded from: classes.dex */
public final class adei implements adeo {
    public final azqb a;
    public final adnq b;
    public final bgo c;
    public final boolean d;
    public final adef e;
    public final ankw f;
    public final Executor g;
    public final adgj h;
    private final azqb i;

    public adei(acwu acwuVar, adnq adnqVar, bgo bgoVar, azqb azqbVar, boolean z, adef adefVar, azqb azqbVar2, ankw ankwVar, Executor executor, adgj adgjVar) {
        acwuVar.getClass();
        adnqVar.getClass();
        this.b = adnqVar;
        bgoVar.getClass();
        this.c = bgoVar;
        azqbVar.getClass();
        this.a = azqbVar;
        this.d = z;
        this.e = adefVar;
        this.i = azqbVar2;
        this.f = ankwVar;
        this.g = executor;
        this.h = adgjVar;
    }

    @Override // defpackage.adeo
    public final List a() {
        adeq adeqVar = new adeq(this.b, this.e, this.d, this.c, (String) this.i.get(), this.g, this.h);
        bhd bhdVar = (bhd) this.a.get();
        ArrayList arrayList = new ArrayList(bhd.i());
        adeqVar.b(arrayList);
        return arrayList;
    }

    @Override // defpackage.adeo
    public final ankt b() {
        final adeq adeqVar = new adeq(this.b, this.e, this.d, this.c, (String) this.i.get(), this.g, this.h);
        return anii.i(anlz.u(new Callable() { // from class: adeh
            @Override // java.util.concurrent.Callable
            public final Object call() {
                bhd bhdVar = (bhd) adei.this.a.get();
                return amuk.o(bhd.i());
            }
        }, this.g), new anir() { // from class: adeg
            @Override // defpackage.anir
            public final ankt a(Object obj) {
                adeq adeqVar2 = adeq.this;
                amuk amukVar = (amuk) obj;
                return anii.i(adeqVar2.d.a(amukVar), new adep(adeqVar2, amukVar, 1), adeqVar2.c);
            }
        }, this.f);
    }
}
