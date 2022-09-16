package defpackage;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: azkl  reason: default package */
/* loaded from: classes3.dex */
public final class azkl implements axwk {
    public final bvjj a;
    public final btrm b;
    private final dxio<axxa> c;
    private final akfa d;
    private final batm e;

    public azkl(dxio<axxa> dxioVar, bvjj bvjjVar, btrm btrmVar, akfa akfaVar, batm batmVar) {
        this.c = dxioVar;
        this.a = bvjjVar;
        this.d = akfaVar;
        this.b = btrmVar;
        this.e = batmVar;
    }

    public static Boolean j(azxi azxiVar) {
        baab o = azzu.aq(azxiVar).o();
        boolean z = false;
        if (!o.equals(baab.LOCAL_FOLLOWING_STARRED_PLACES) && !o.equals(baab.LOCAL_DEAL)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.axwk
    public final dehn<Boolean> a(baad baadVar) {
        final azzu azzuVar = (azzu) baadVar;
        return this.e.c(new Callable(this, azzuVar) { // from class: azkh
            private final azkl a;
            private final azzu b;

            {
                this.a = this;
                this.b = azzuVar;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                azkl azklVar = this.a;
                azzu azzuVar2 = this.b;
                Set<String> i = azklVar.i();
                azwl azwlVar = azzuVar2.j.j;
                dbsk.s(azwlVar);
                return Boolean.valueOf(i.contains(azwlVar.a));
            }
        });
    }

    @Override // defpackage.axwk
    public final dehn<dcep<String>> b() {
        return this.e.c(new Callable(this) { // from class: azki
            private final azkl a;

            {
                this.a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return dcep.K(this.a.i());
            }
        });
    }

    @Override // defpackage.axwk
    public final boolean c() {
        return this.a.o(bvjk.gI, this.d.j(), true);
    }

    @Override // defpackage.axwk
    public final void d() {
        this.a.T(bvjk.gI, this.d.j(), !c());
        this.b.b(azrb.c(4));
    }

    @Override // defpackage.axwk
    public final void e(final btlu btluVar) {
        this.e.b(new Runnable(this, btluVar) { // from class: azkg
            private final azkl a;
            private final btlu b;

            {
                this.a = this;
                this.b = btluVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                azkl azklVar = this.a;
                azklVar.a.ag(bvjk.gG, this.b, null);
            }
        });
    }

    @Override // defpackage.axwk
    public final void f(final azxi azxiVar) {
        if (!j(azxiVar).booleanValue()) {
            deha.a(null);
        } else {
            this.e.b(new Runnable(this, azxiVar) { // from class: azkf
                private final azkl a;
                private final azxi b;

                {
                    this.a = this;
                    this.b = azxiVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    azkl azklVar = this.a;
                    azxi azxiVar2 = this.b;
                    HashSet hashSet = new HashSet();
                    hashSet.addAll(azklVar.i());
                    azwl azwlVar = azxiVar2.j;
                    dbsk.s(azwlVar);
                    if (hashSet.add(azwlVar.a)) {
                        azklVar.h(hashSet);
                    }
                }
            });
        }
    }

    @Override // defpackage.axwk
    public final void g(final baad baadVar) {
        if (baadVar instanceof azzu) {
            final azzu azzuVar = (azzu) baadVar;
            this.e.b(new Runnable(this, azzuVar, baadVar) { // from class: azke
                private final azkl a;
                private final azzu b;
                private final baad c;

                {
                    this.a = this;
                    this.b = azzuVar;
                    this.c = baadVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    azkl azklVar = this.a;
                    azzu azzuVar2 = this.b;
                    baad baadVar2 = this.c;
                    HashSet hashSet = new HashSet();
                    azwl azwlVar = azzuVar2.j.j;
                    dbsk.s(azwlVar);
                    String str = azwlVar.a;
                    hashSet.addAll(azklVar.i());
                    if (azzuVar2.g) {
                        hashSet.add(str);
                    } else {
                        hashSet.remove(str);
                    }
                    azklVar.h(hashSet);
                    azklVar.b.b(azrb.b(4, baadVar2));
                }
            });
            return;
        }
        deha.c();
    }

    public final void h(Set<String> set) {
        bvrj.UI_THREAD.d();
        this.a.ag(bvjk.gG, this.d.j(), set);
    }

    public final Set<String> i() {
        List<azxi> e;
        bvrj.UI_THREAD.d();
        try {
            e = this.c.a().a();
        } catch (axxc unused) {
            e = dcdc.e();
        }
        return this.a.E(bvjk.gG, this.d.j(), dcbg.b(e).o(azkj.a).s(azkk.a).B());
    }
}
