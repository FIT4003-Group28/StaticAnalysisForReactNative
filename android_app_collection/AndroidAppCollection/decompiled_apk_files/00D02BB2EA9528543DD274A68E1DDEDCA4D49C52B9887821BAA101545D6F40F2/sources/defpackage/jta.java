package defpackage;

import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: jta  reason: default package */
/* loaded from: classes7.dex */
public final class jta implements dbty<ckrb> {
    final /* synthetic */ ldz a;
    final /* synthetic */ jvl b;
    final /* synthetic */ jtc c;

    public jta(jtc jtcVar, ldz ldzVar, jvl jvlVar) {
        this.c = jtcVar;
        this.a = ldzVar;
        this.b = jvlVar;
    }

    @Override // defpackage.dbty
    public final /* bridge */ /* synthetic */ ckrb a() {
        ckra a = this.c.s.a();
        jtc jtcVar = this.c;
        dxio<cref> dxioVar = jtcVar.p;
        crem cremVar = jtcVar.q;
        ckrh ckrhVar = new ckrh(jtcVar.h);
        bvjj bvjjVar = this.c.m;
        jsy jsyVar = new jsy(this);
        jsz jszVar = new jsz(this);
        afwo k = this.c.N.k();
        jtc jtcVar2 = this.c;
        kcw kcwVar = jtcVar2.R;
        dehn<lzf> dehnVar = jtcVar2.I;
        final ldz ldzVar = this.a;
        Callable callable = new Callable(ldzVar) { // from class: ldq
            private final ldz a;

            {
                this.a = ldzVar;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                ldz ldzVar2 = this.a;
                lkr lkrVar = ldzVar2.l;
                boolean z = false;
                if (lkrVar != null) {
                    if (lkrVar.s.p.i(mbp.class)) {
                        lkrVar.o.a();
                        z = true;
                    }
                    return Boolean.valueOf(z);
                }
                les lesVar = ldzVar2.k;
                if (lesVar.k.i(mbp.class)) {
                    lesVar.k.a();
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        };
        final jvl jvlVar = this.b;
        Runnable runnable = new Runnable(jvlVar) { // from class: jsw
            private final jvl a;

            {
                this.a = jvlVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                jvl jvlVar2 = this.a;
                dbpy<Object> dbpyVar = dbpy.a;
                ldz ldzVar2 = jvlVar2.i;
                if (ldzVar2.l != null) {
                    return;
                }
                ldzVar2.k.d(dbpyVar);
            }
        };
        final Runnable runnable2 = this.c.D;
        runnable2.getClass();
        return new kps(a, dxioVar, cremVar, ckrhVar, bvjjVar, jsyVar, jszVar, k, kcwVar, dehnVar, callable, runnable, new Runnable(runnable2) { // from class: jsx
            private final Runnable a;

            {
                this.a = runnable2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.run();
            }
        });
    }
}
