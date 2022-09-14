package defpackage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: azhz  reason: default package */
/* loaded from: classes3.dex */
public final class azhz implements axwd {
    public final azof a;
    public final btrm b;
    public final dxio<azhi> c;
    public final azhy d = new azhy(this);
    public final Set<String> e = new HashSet();
    public final Map<String, String> f = new HashMap();
    public final Map<String, Set<Integer>> g = new HashMap();
    public final Map<String, Set<String>> h = new HashMap();
    public final Map<String, String> i = new HashMap();
    public final Map<String, String> j = new HashMap();
    public final Map<String, Set<Integer>> k = new HashMap();
    private final batm l;
    private final bvjj m;

    public azhz(azof azofVar, batm batmVar, btrm btrmVar, bvjj bvjjVar, dxio<azhi> dxioVar) {
        this.a = azofVar;
        this.l = batmVar;
        this.b = btrmVar;
        this.m = bvjjVar;
        this.c = dxioVar;
    }

    @Override // defpackage.axwd
    public final synchronized dcdc<String> a() {
        return dcdc.r(this.e);
    }

    @Override // defpackage.axwd
    @dzsi
    public final synchronized String b(String str) {
        return this.f.get(str);
    }

    @Override // defpackage.axwd
    public final synchronized dcdc<Integer> c(String str) {
        Set<Integer> set = this.g.get(str);
        if (set == null) {
            return dcdc.e();
        }
        return dcdc.r(set);
    }

    @Override // defpackage.axwd
    public final dcdc<Integer> d(String str) {
        Set<Integer> set = this.k.get(str);
        if (set == null) {
            return dcdc.e();
        }
        return dcdc.r(set);
    }

    @Override // defpackage.axwd
    public final synchronized dehn<Void> e(final String str, final String str2) {
        this.e.add(str);
        this.f.put(str, str2);
        return this.l.b(new Runnable(this, str, str2) { // from class: azhm
            private final azhz a;
            private final String b;
            private final String c;

            {
                this.a = this;
                this.b = str;
                this.c = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                azhz azhzVar = this.a;
                azhzVar.d.c(this.b, this.c);
            }
        });
    }

    @Override // defpackage.axwd
    public final synchronized dehn<Void> f(final String str, final int i) {
        Set<Integer> set = this.g.get(str);
        if (set == null) {
            set = new HashSet<>();
            this.e.add(str);
            this.g.put(str, set);
        }
        if (set.add(Integer.valueOf(i))) {
            return this.l.b(new Runnable(this, str, i) { // from class: azhn
                private final azhz a;
                private final String b;
                private final int c;

                {
                    this.a = this;
                    this.b = str;
                    this.c = i;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    azhz azhzVar = this.a;
                    azhzVar.d.d(this.b, this.c);
                }
            });
        }
        return deha.a(null);
    }

    @Override // defpackage.axwd
    public final synchronized dehn<Void> g(final String str, final int i) {
        Set<Integer> set = this.g.get(str);
        if (set == null || !set.remove(Integer.valueOf(i))) {
            return deha.a(null);
        }
        return this.l.b(new Runnable(this, str, i) { // from class: azho
            private final azhz a;
            private final String b;
            private final int c;

            {
                this.a = this;
                this.b = str;
                this.c = i;
            }

            @Override // java.lang.Runnable
            public final void run() {
                azhz azhzVar = this.a;
                azhzVar.d.e(this.b, this.c);
            }
        });
    }

    @Override // defpackage.axwd
    public final synchronized dehn<Void> h(final String str, final String str2) {
        this.e.add(str);
        this.j.put(str, str2);
        return this.l.b(new Runnable(this, str, str2) { // from class: azhp
            private final azhz a;
            private final String b;
            private final String c;

            {
                this.a = this;
                this.b = str;
                this.c = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                azhz azhzVar = this.a;
                azhzVar.d.h(this.b, this.c);
            }
        });
    }

    @Override // defpackage.axwd
    public final synchronized dehn<Void> i(final String str, final int i) {
        Set<Integer> set = this.k.get(str);
        if (set == null) {
            set = new HashSet<>();
            this.e.add(str);
            this.k.put(str, set);
        }
        if (set.add(Integer.valueOf(i))) {
            return this.l.b(new Runnable(this, str, i) { // from class: azhq
                private final azhz a;
                private final String b;
                private final int c;

                {
                    this.a = this;
                    this.b = str;
                    this.c = i;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    azhz azhzVar = this.a;
                    azhzVar.d.f(this.b, this.c);
                }
            });
        }
        return deha.a(null);
    }

    @Override // defpackage.axwd
    public final synchronized dehn<Void> j(final String str, final int i) {
        Set<Integer> set = this.k.get(str);
        if (set == null || !set.remove(Integer.valueOf(i))) {
            return deha.a(null);
        }
        return this.l.b(new Runnable(this, str, i) { // from class: azhr
            private final azhz a;
            private final String b;
            private final int c;

            {
                this.a = this;
                this.b = str;
                this.c = i;
            }

            @Override // java.lang.Runnable
            public final void run() {
                azhz azhzVar = this.a;
                azhzVar.d.g(this.b, this.c);
            }
        });
    }

    @Override // defpackage.axwd
    public final dbsg<String> k() {
        String z = this.m.z(bvjk.Y, "");
        return (z.isEmpty() || !a().contains(z)) ? dbpy.a : dbsg.i(z);
    }

    @Override // defpackage.axwd
    public final void l(dbsg<String> dbsgVar) {
        if (!dbsgVar.a()) {
            this.m.P(bvjk.Y);
        } else if (!a().contains(dbsgVar.b())) {
        } else {
            this.m.ac(bvjk.Y, dbsgVar.b());
        }
    }

    public final void m() {
        this.l.b(new Runnable(this) { // from class: azhl
            private final azhz a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                azhz azhzVar = this.a;
                try {
                    synchronized (azhzVar) {
                        dcdc<azwa> a = azhzVar.d.a();
                        azhzVar.e.clear();
                        azhzVar.f.clear();
                        azhzVar.g.clear();
                        azhzVar.h.clear();
                        azhzVar.i.clear();
                        azhzVar.k.clear();
                        azhzVar.j.clear();
                        dcpe<azwa> listIterator = a.listIterator();
                        while (listIterator.hasNext()) {
                            azwa next = listIterator.next();
                            String str = next.j().b;
                            azhzVar.e.add(str);
                            azhzVar.f.put(str, next.j().c);
                            azhzVar.g.put(str, new HashSet(dchl.k(next.j().g, azvq.a)));
                            azhzVar.h.put(str, new HashSet(dchl.k(next.j().h, azvr.a)));
                            azhzVar.i.put(str, next.j().d);
                            azhzVar.k.put(str, new HashSet(dchl.k(next.j().f, azvs.a)));
                            azhzVar.j.put(str, next.j().e);
                        }
                    }
                } catch (axxc unused) {
                }
            }
        });
    }
}
