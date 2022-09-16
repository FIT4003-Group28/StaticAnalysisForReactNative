package defpackage;

import java.util.HashSet;
/* compiled from: PG */
/* renamed from: ckmp  reason: default package */
/* loaded from: classes4.dex */
public final class ckmp {
    private final ckmm c;
    private final bvrb d;
    private static final HashSet<ckmk> b = new HashSet<>();
    public static final HashSet<ckmk> a = new HashSet<>();

    public ckmp(bvrb bvrbVar, ckmm ckmmVar) {
        this.d = bvrbVar;
        this.c = ckmmVar;
    }

    private final void f(final ckmk ckmkVar, boolean z) {
        if (z) {
            HashSet<ckmk> hashSet = b;
            if (!hashSet.contains(ckmkVar)) {
                hashSet.add(ckmkVar);
                this.c.a().j(ckmkVar.i);
            }
        }
        this.c.a().e(ckmkVar.i);
        a.add(ckmkVar);
        this.d.a(new Runnable(this, ckmkVar) { // from class: ckmn
            private final ckmp a;
            private final ckmk b;

            {
                this.a = this;
                this.b = ckmkVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ckmp ckmpVar = this.a;
                ckmk ckmkVar2 = this.b;
                if (ckmp.a.remove(ckmkVar2)) {
                    ckmpVar.e(ckmkVar2);
                }
            }
        }, bvrj.UI_THREAD, 10000L);
        String str = ckmkVar.i.a;
    }

    private final void g(ckmk ckmkVar, int i) {
        this.c.a().a.v(cwsy.n(ckmkVar.i), i);
        a.remove(ckmkVar);
        this.c.a().k(ckmkVar.i);
        b.remove(ckmkVar);
        String str = ckmkVar.i.a;
    }

    private static int h(@dzsi Integer num) {
        if (num == null) {
            return 3;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            return 2;
        }
        return intValue != 1 ? 3 : 4;
    }

    public final void a(ckmk ckmkVar) {
        f(ckmkVar, false);
    }

    public final void b(ckmk ckmkVar) {
        f(ckmkVar, true);
    }

    public final void c(ckmk ckmkVar, ckmo ckmoVar) {
        g(ckmkVar, h(Integer.valueOf(ckmoVar.r.s)));
    }

    public final void d(ckmk ckmkVar, btzy btzyVar) {
        g(ckmkVar, h(btzyVar.s));
    }

    public final void e(ckmk ckmkVar) {
        this.c.a().g(ckmkVar.i);
        a.remove(ckmkVar);
        this.c.a().l(ckmkVar.i);
        b.remove(ckmkVar);
        String str = ckmkVar.i.a;
    }
}
