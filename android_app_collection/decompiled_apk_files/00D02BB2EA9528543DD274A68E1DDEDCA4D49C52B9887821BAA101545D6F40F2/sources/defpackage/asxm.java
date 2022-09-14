package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: PG */
/* renamed from: asxm  reason: default package */
/* loaded from: classes2.dex */
public final class asxm extends aslq<aszm, aszl> implements asxw {
    public final asxu e;
    private final btrm f;
    private final CopyOnWriteArrayList<asxv> g;
    private boolean h;
    private boolean i;
    private aslf j;

    public asxm(asxu asxuVar, btvo btvoVar, btrm btrmVar) {
        super(new aszl(), btvoVar);
        dbsk.t(asxuVar, "host");
        this.e = asxuVar;
        this.f = btrmVar;
        asle asleVar = new asle();
        asleVar.a = asld.FOLLOWING;
        this.j = asleVar.a();
        this.g = new CopyOnWriteArrayList<>();
    }

    @Override // defpackage.asmp
    public final void A(boolean z, aslo... asloVarArr) {
        aszl aszlVar = (aszl) this.a;
        asln aslnVar = new asln(aszlVar.c);
        aslnVar.a = asld.INSPECT_ROUTE_SECTION;
        aslnVar.f = ((aszl) this.a).c;
        aslnVar.e(asloVarArr);
        aslnVar.d = z;
        aszlVar.c = aslnVar.a();
        u();
    }

    @Override // defpackage.asmp
    public final void B() {
        aslf aslfVar = ((aszl) this.a).c;
        if (aslfVar.a != asld.INSPECT_ROUTE_SECTION) {
            return;
        }
        if (aslfVar instanceof aslp) {
            ((aszl) this.a).c = ((aslp) aslfVar).g;
        } else {
            asle asleVar = new asle();
            asleVar.a = asld.FOLLOWING;
            ((aszl) this.a).c = asleVar.a();
        }
        u();
    }

    @Override // defpackage.asmp
    public final void C(@dzsi crqw crqwVar) {
        ((aszl) this.a).b = crqwVar;
        u();
    }

    @Override // defpackage.asmp
    public final void D(@dzsi astg astgVar) {
        ((aszl) this.a).d = astgVar;
        u();
    }

    @Override // defpackage.asmp
    public final void E() {
        ((aszl) this.a).c = this.j;
        u();
    }

    @Override // defpackage.asxw
    public final void F(asxv asxvVar) {
        if (this.g.contains(asxvVar)) {
            throw new IllegalArgumentException(String.format("Listener %s already added.", asxvVar));
        }
        this.g.add(asxvVar);
    }

    @Override // defpackage.asxw
    public final void G(asxv asxvVar) {
        if (!this.g.contains(asxvVar)) {
            throw new IllegalArgumentException(String.format("addListener(%s, executor) must be called before removeListener(%s).", asxvVar, asxvVar));
        }
        this.g.remove(asxvVar);
    }

    @Override // defpackage.aslq, defpackage.asmo
    public final void b() {
        aszl aszlVar = (aszl) this.a;
        btrm btrmVar = this.f;
        dceq a = dcet.a();
        a.b(crhp.class, new asxn(0, crhp.class, this, bvrj.UI_THREAD));
        a.b(azre.class, new asxn(1, azre.class, this, bvrj.UI_THREAD));
        btrmVar.g(this, a.a());
        super.b();
    }

    @Override // defpackage.aslq, defpackage.asmo
    public final void c() {
        super.c();
        this.f.a(this);
        aszl aszlVar = (aszl) this.a;
        asle<?> b = aszlVar.c.b();
        b.c = true;
        aszlVar.c = b.a();
    }

    public final void g(aslf aslfVar) {
        if (aslfVar.a == asld.FOLLOWING && aslfVar.a() == null) {
            this.j = aslfVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aslq
    public final void u() {
        bvrj.UI_THREAD.c();
        if (!this.d) {
            return;
        }
        if (this.h) {
            this.i = true;
            return;
        }
        this.h = true;
        aszm aszmVar = (aszm) this.c;
        this.c = ((aszl) this.a).a();
        Iterator<asxv> it = this.g.iterator();
        while (it.hasNext()) {
            aszm aszmVar2 = (aszm) this.c;
            dbsk.s(aszmVar2);
            it.next().a(aszmVar2, aszmVar);
        }
        this.h = false;
        if (!this.i) {
            return;
        }
        this.i = false;
        u();
    }

    @Override // defpackage.asmp
    public final void v() {
        asle asleVar = new asle(((aszl) this.a).c);
        asleVar.a = asld.FOLLOWING;
        asleVar.d = false;
        aslf a = asleVar.a();
        g(a);
        ((aszl) this.a).c = a;
        u();
    }

    @Override // defpackage.asmp
    public final void w(Float f) {
        throw null;
    }

    @Override // defpackage.asmp
    public final void x() {
        aszl aszlVar = (aszl) this.a;
        asle<?> b = aszlVar.c.b();
        b.c();
        aszlVar.c = b.a();
        this.c = ((aszl) this.a).a();
    }

    @Override // defpackage.asmp
    public final void y() {
        aszl aszlVar = (aszl) this.a;
        asle asleVar = new asle(aszlVar.c);
        asleVar.a = asld.FREE_MOVEMENT;
        asleVar.d = false;
        aszlVar.c = asleVar.a();
        u();
    }

    @Override // defpackage.asmp
    public final void z() {
        aszl aszlVar = (aszl) this.a;
        asle asleVar = new asle(aszlVar.c);
        asleVar.a = asld.OVERVIEW;
        asleVar.d = true;
        aszlVar.c = asleVar.a();
        u();
    }
}
