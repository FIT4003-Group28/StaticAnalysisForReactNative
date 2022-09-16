package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: tom  reason: default package */
/* loaded from: classes7.dex */
public final class tom implements tnv {
    public final ConcurrentHashMap<btlu, tok> a = new ConcurrentHashMap<>();
    private final tlz<tqz> b;
    private final cqat c;
    private final dxio<akfa> d;
    private final Executor e;
    private final bvjj f;
    private final dxio<ania> g;

    public tom(cqat cqatVar, tlz<tqz> tlzVar, Executor executor, bvjj bvjjVar, dxio<akfa> dxioVar, dxio<ania> dxioVar2) {
        this.c = cqatVar;
        this.d = dxioVar;
        this.e = executor;
        this.f = bvjjVar;
        this.b = tlzVar;
        this.g = dxioVar2;
    }

    private final tok e(final btlu btluVar) {
        if (!this.a.containsKey(btluVar)) {
            final dehn<dbsg<tqz>> a = this.b.a(btluVar);
            a.Pk(new Runnable(this, a, btluVar) { // from class: toj
                private final tom a;
                private final dehn b;
                private final btlu c;

                {
                    this.a = this;
                    this.b = a;
                    this.c = btluVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    tom tomVar = this.a;
                    dehn dehnVar = this.b;
                    btlu btluVar2 = this.c;
                    dbsg dbsgVar = (dbsg) deha.s(dehnVar);
                    if (dbsgVar.a()) {
                        tomVar.a.putIfAbsent(btluVar2, new tok());
                        tok tokVar = tomVar.a.get(btluVar2);
                        dbsk.s(tokVar);
                        tokVar.c((tqz) dbsgVar.b());
                    }
                }
            }, this.e);
        }
        this.a.putIfAbsent(btluVar, new tok());
        tok tokVar = this.a.get(btluVar);
        dbsk.s(tokVar);
        return tokVar;
    }

    @Override // defpackage.tnv
    public final void a(btlu btluVar, dqvj dqvjVar) {
        eapd eapdVar = new eapd(this.c.b());
        if (!d(btluVar)) {
            return;
        }
        tok e = e(btluVar);
        e.a(dqvjVar, eapdVar);
        this.b.b(btluVar, e.b());
    }

    @Override // defpackage.tnv
    public final void b(dqvj dqvjVar) {
        btlu j = this.d.a().j();
        if (j == null) {
            return;
        }
        a(j, dqvjVar);
    }

    @Override // defpackage.tnv
    public final dbsg<dqvj> c(btlu btluVar) {
        return !d(btluVar) ? dbpy.a : e(btluVar).d(new eapd(this.c.b()));
    }

    public final boolean d(btlu btluVar) {
        return (btluVar.o() || this.g.a().b(btluVar)) && this.f.o(bvjk.ao, btluVar, true);
    }
}
