package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: aahy  reason: default package */
/* loaded from: classes.dex */
public final class aahy implements aajs {
    private final aajb c;
    private final aake d;
    private final snc e;
    private final amup f;
    private final aaif h;
    private final aaic i;
    private final aaig j;
    private final List b = new ArrayList();
    public aorw a = aajz.a;
    private final AtomicBoolean g = new AtomicBoolean(false);

    public aahy(aajb aajbVar, aaif aaifVar, aaic aaicVar, aaig aaigVar, aake aakeVar, snc sncVar, amup amupVar) {
        this.c = aajbVar;
        this.h = aaifVar;
        this.i = aaicVar;
        this.j = aaigVar;
        this.d = aakeVar;
        this.e = sncVar;
        this.f = amupVar;
    }

    private final aajj k(aajj aajjVar) {
        return this.i.a(aajjVar.e());
    }

    @Override // defpackage.aajs
    public final aajs a(String str) {
        this.b.add(new aaiq(this.c, str, this.a));
        return this;
    }

    @Override // defpackage.aajs
    public final aynr b() {
        return c(false);
    }

    public final aynr c(final boolean z) {
        if (this.g.getAndSet(true)) {
            throw new IllegalStateException("Cannot commit a set of pending edits more than once.");
        }
        if (this.b.isEmpty()) {
            return aynr.f();
        }
        final aajb aajbVar = this.c;
        final List list = this.b;
        ankt i = anhq.i(anko.q(((vno) aajbVar.c.get()).a(new vow() { // from class: aaiw
            @Override // defpackage.vow
            public final Object a(vox voxVar) {
                aajb aajbVar2 = aajb.this;
                boolean z2 = z;
                List<aahw> list2 = list;
                amuf amufVar = !z2 ? new amuf() : null;
                for (aahw aahwVar : list2) {
                    aahwVar.b((aaip) aajbVar2.d.get(), voxVar, amufVar);
                }
                return amufVar != null ? amufVar.g() : amuk.q();
            }
        })), Throwable.class, urc.h, anjk.a);
        if (!z) {
            aaik aaikVar = this.h.a;
            anlz.A(i, new aaij(aaikVar), aaikVar.d);
        }
        aynr v = aynr.v(i);
        azpo W = azpo.W();
        v.I(W);
        aynr x = W.x();
        final aaig aaigVar = this.j;
        return x.q(new ayqb() { // from class: aahx
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                aaig.this.a.o((Throwable) obj);
            }
        });
    }

    @Override // defpackage.aajs
    public final void d(aajj aajjVar) {
        this.b.add(aahr.a(this.c, this.f, k(aajjVar), this.a, this.e));
    }

    @Override // defpackage.aajs
    public final void e(aajj aajjVar, aajk aajkVar) {
        List list = this.b;
        aajb aajbVar = this.c;
        amup amupVar = this.f;
        aajj k = k(aajjVar);
        list.add(new aahr(aajbVar, amupVar, k, aajkVar, this.a, this.e, k.d()));
    }

    @Override // defpackage.aajs
    public final void f(String str, aajk aajkVar) {
        this.b.add(new aahr(this.c, this.f, null, aajkVar, this.a, this.e, str));
    }

    @Override // defpackage.aajs
    public final void g(String str) {
        this.b.add(new aair(this.c, str, this.a));
    }

    @Override // defpackage.aajs
    public final /* synthetic */ void h(aajj aajjVar) {
        aaji.b(this, aajjVar);
    }

    @Override // defpackage.aajs
    public final void i(String str, aqvy aqvyVar, byte[] bArr) {
        this.b.add(new aajc(this.c, this.d, str, aqvyVar, bArr, this.e, this.a));
    }

    @Override // defpackage.aajs
    public final void j(abga abgaVar) {
        this.b.add(aahr.a(this.c, this.f, this.i.a(abgaVar), this.a, this.e));
    }
}
