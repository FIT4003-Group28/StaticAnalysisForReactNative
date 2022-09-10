package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: ckni  reason: default package */
/* loaded from: classes4.dex */
public final class ckni extends bbuq {
    private final ckng c;
    private final List<bvrt<dwfl>> d;
    @dzsi
    private final nxk e;
    private final Map<String, String> f;
    private final Map<String, List<dwfa>> g;
    @dzsi
    private final Set<String> h;
    @dzsi
    private final Set<Integer> i;

    public ckni(List<dwfl> list) {
        this(list, null);
    }

    @Override // defpackage.bbuq
    public final void a(int i, int i2) {
        this.c.b(i, i2);
    }

    @Override // defpackage.bbuq
    public final int b() {
        return this.d.size();
    }

    @Override // defpackage.bbuq
    public final boolean c() {
        return true;
    }

    @Override // defpackage.bbuq
    public final int d() {
        return this.d.size();
    }

    @Override // defpackage.bbuq
    @dzsi
    public final dwfl e(int i) {
        if (i < 0 || i >= this.d.size()) {
            return null;
        }
        dwfl a = this.c.a(this.d.get(i).e((dssr) dwfl.w.cu(7), dwfl.w));
        if (this.g.containsKey(a.d)) {
            dsqp dsqpVar = (dsqp) a.cu(5);
            dsqpVar.bC(a);
            dwfi dwfiVar = (dwfi) dsqpVar;
            if (dwfiVar.c) {
                dwfiVar.bF();
                dwfiVar.c = false;
            }
            ((dwfl) dwfiVar.b).r = dwfl.ck();
            dwfiVar.a(this.g.get(a.d));
            a = dwfiVar.bK();
        }
        if (!this.f.containsKey(a.d)) {
            return a;
        }
        dwfi ca = dwfl.w.ca(a);
        String str = this.f.get(a.d);
        if (ca.c) {
            ca.bF();
            ca.c = false;
        }
        dwfl dwflVar = (dwfl) ca.b;
        str.getClass();
        dwflVar.a |= 32;
        dwflVar.g = str;
        return ca.bK();
    }

    @Override // defpackage.bbuq
    public final int f(dwfl dwflVar) {
        return this.d.indexOf(bvrt.b(dwflVar));
    }

    @Override // defpackage.bbuq
    public final void i(int i) {
        if (i < 0 || i >= this.d.size()) {
            this.d.size();
        } else {
            this.d.remove(i);
            u();
        }
        nxk nxkVar = this.e;
        if (nxkVar != null) {
            nxkVar.a(nxj.a);
        }
    }

    @Override // defpackage.bbuq
    public final void j(Collection<dwfl> collection) {
    }

    @Override // defpackage.bbuq
    public final void k(String str, String str2) {
        this.f.put(str, str2);
    }

    @Override // defpackage.bbuq
    public final void l(String str, List list) {
        this.g.put(str, list);
        nxk nxkVar = this.e;
        if (nxkVar != null) {
            nxkVar.Ru(str, list);
        }
    }

    @Override // defpackage.bbuq
    public final void m(String str, String str2) {
        for (int i = 0; i < this.d.size(); i++) {
            dwfl e = this.d.get(i).e((dssr) dwfl.w.cu(7), dwfl.w);
            if (e.h.equals(str)) {
                dsqp dsqpVar = (dsqp) e.cu(5);
                dsqpVar.bC(e);
                dwfi dwfiVar = (dwfi) dsqpVar;
                if (dwfiVar.c) {
                    dwfiVar.bF();
                    dwfiVar.c = false;
                }
                dwfl dwflVar = (dwfl) dwfiVar.b;
                str2.getClass();
                dwflVar.a |= 128;
                dwflVar.h = str2;
                this.d.remove(i);
                this.d.add(i, bvrt.b(dwfiVar.bK()));
            }
        }
    }

    @Override // defpackage.bbuq
    public final void n(String str, boolean z) {
        Set<String> set = this.h;
        if (set == null) {
            return;
        }
        if (z) {
            set.add(str);
        } else {
            set.remove(str);
        }
    }

    @Override // defpackage.bbuq
    @dzsi
    public final Boolean o(String str) {
        Set<String> set = this.h;
        if (set == null) {
            return null;
        }
        return Boolean.valueOf(set.contains(str));
    }

    @Override // defpackage.bbuq
    public final void p(int i) {
        this.i.add(Integer.valueOf(i));
    }

    @Override // defpackage.bbuq
    @dzsi
    public final Boolean q(int i) {
        return Boolean.valueOf(this.i.contains(Integer.valueOf(i)));
    }

    public ckni(List<dwfl> list, @dzsi nxk nxkVar) {
        this(list, nxkVar, null);
    }

    public ckni(List<dwfl> list, @dzsi nxk nxkVar, @dzsi bbvl bbvlVar) {
        this(list, nxkVar, bbvlVar, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ckni(java.util.List<defpackage.dwfl> r2, @defpackage.dzsi defpackage.nxk r3, @defpackage.dzsi defpackage.bbvl r4, @defpackage.dzsi java.util.Set<java.lang.String> r5) {
        /*
            r1 = this;
            if (r4 != 0) goto L7
            bbuw r4 = new bbuw
            r4.<init>()
        L7:
            if (r3 == 0) goto Lf
            cknj r0 = new cknj
            r0.<init>(r3)
            goto L14
        Lf:
            bbuu r0 = new bbuu
            r0.<init>()
        L14:
            r1.<init>(r4, r0)
            ckng r4 = new ckng
            r4.<init>()
            r1.c = r4
            java.util.ArrayList r4 = defpackage.dchl.a()
            r1.d = r4
            java.util.HashMap r4 = defpackage.dcjz.d()
            r1.f = r4
            java.util.HashMap r4 = defpackage.dcjz.d()
            r1.g = r4
            java.util.Iterator r2 = r2.iterator()
        L34:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L4a
            java.lang.Object r4 = r2.next()
            dwfl r4 = (defpackage.dwfl) r4
            java.util.List<bvrt<dwfl>> r0 = r1.d
            bvrt r4 = defpackage.bvrt.b(r4)
            r0.add(r4)
            goto L34
        L4a:
            r1.e = r3
            if (r5 == 0) goto L56
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>(r5)
            r1.h = r2
            goto L59
        L56:
            r2 = 0
            r1.h = r2
        L59:
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            r1.i = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ckni.<init>(java.util.List, nxk, bbvl, java.util.Set):void");
    }
}
